/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sybit.education.taschengeldboerse.testutil;

import java.io.InputStream;
import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.hsqldb.HsqldbDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Base JUnit-Test to validate with in memory database.
 *
 * @author ssr
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public abstract class AbstractDatabaseTest {

   /**
    * A Spring application context that we'll create from a test application context and use to
    * create our DAO object (and data source, session factory, etc.)
    */
   @Autowired
   private ApplicationContext ctx;
   @SuppressWarnings("javadoc")
   @PersistenceContext
   private EntityManager em;
   @SuppressWarnings("javadoc")
   @Autowired
   private DataSource dataSource;
   @SuppressWarnings("javadoc")
   private Connection connection;

   /**
    * Get the Spring application context.
    *
    * @return the spring application context
    */
   public ApplicationContext getApplicationContext() {
      return ctx;
   }

   /**
    * Method <code>before</code>.
    *
    * @throws Exception
    */
   @org.junit.Before
   public void before() throws Exception {

      if (getDataset() != null) {
         connection = dataSource.getConnection();

         ClassPathResource dataSet = new ClassPathResource(getDataset());
         // retrieve Data from wmclasspathresource
         InputStream is = dataSet.getInputStream();
         FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
         builder.setColumnSensing(true);
         IDataSet data = builder.build(is);
         IDatabaseConnection conn = new DatabaseConnection(connection);
         DatabaseConfig config = conn.getConfig();
         config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqldbDataTypeFactory());

         // load data
         DatabaseOperation.CLEAN_INSERT.execute(conn, data);
      }
      else {
         // No init of DB, because no dataset defined.
      }
   }

   /**
    * Method <code>after</code>.
    *
    * @throws Exception
    */
   @org.junit.After
   public void after() throws Exception {
      connection.close();
   }

   /**
    * Get the Path to the XML-File of dataset. E.g. "/dataset.xml".
    *
    * @return the dataset
    */
   public abstract String getDataset();
}
