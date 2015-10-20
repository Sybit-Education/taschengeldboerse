/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  ssr
 * Created: 20.10.2015
 */

CREATE DATABASE `taschengeldboerse`;



CREATE USER 'boersenadmin'@'%' IDENTIFIED BY 'admin2015!';
GRANT ALL PRIVILEGES ON taschengeldboerse.* TO 'boersenadmin'@'%';

CREATE USER 'boerse'@'%' IDENTIFIED BY 'admin2015!';
GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE, SHOW VIEW ON taschengeldboerse.* TO 'sybib'@'%';


CREATE USER 'boersenadmin'@'localhost' IDENTIFIED BY 'admin2015!';
GRANT ALL PRIVILEGES ON taschengeldboerse.* TO 'boersenadmin'@'localhost';

CREATE USER 'boerse'@'localhost' IDENTIFIED BY 'admin2015!';
GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE, SHOW VIEW ON taschengeldboerse.* TO 'sybib'@'localhost';

FLUSH PRIVILEGES;