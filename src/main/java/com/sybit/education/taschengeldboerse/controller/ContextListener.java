/*
 * (c) 2015, Sybit GmbH.
 */

package com.sybit.education.taschengeldboerse.controller;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.persistence.EntityManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Additional context listener to clean up JDBC Connections to prevent memory leaks on redeployment.
 *
 * @author ssr
 */
public class ContextListener implements ServletContextListener {

   private static final Logger LOGGER = LoggerFactory.getLogger(ContextListener.class);

   @Autowired
   private EntityManager entityManager;
   
   @Override
   public void contextInitialized(ServletContextEvent contextEvent) {
      // nothing to do on application startup...
   }

   @Override
   public void contextDestroyed(ServletContextEvent contextEvent) {
      LOGGER.info("shutting down application...");
      // On Application Shutdown, please…
      try {
         com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown();
      } catch (Throwable t) {
         LOGGER.error(t.getMessage(), t);
      }

      if (entityManager != null) {
         entityManager.close();
      }
      // This manually deregisters JDBC driver, which prevents Tomcat 7 from
      // complaining about memory leaks wrto this class
      Enumeration<Driver> drivers = DriverManager.getDrivers();
      while (drivers.hasMoreElements()) {
         Driver driver = drivers.nextElement();
         try {
            DriverManager.deregisterDriver(driver);
            LOGGER.info(String.format("deregistering jdbc driver: %s", driver));
         } catch (SQLException e) {
            LOGGER.error(String.format("Error deregistering driver %s", driver), e);
         }

      }

   }
}
