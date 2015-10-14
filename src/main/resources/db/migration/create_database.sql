CREATE DATABASE `taschengeldboerse` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE USER 'boersenadmin'@'%' IDENTIFIED BY 'admin2015!';
GRANT ALL PRIVILEGES ON sybib.* TO 'boersenadmin'@'%';

CREATE USER 'boerse'@'%' IDENTIFIED BY 'admin2015!';
GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE, SHOW VIEW ON sybib.* TO 'sybib'@'%';


CREATE USER 'boersenadmin'@'localhost' IDENTIFIED BY 'admin2015!';
GRANT ALL PRIVILEGES ON sybib.* TO 'boersenadmin'@'localhost';

CREATE USER 'boerse'@'localhost' IDENTIFIED BY 'admin2015!';
GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE, SHOW VIEW ON sybib.* TO 'sybib'@'localhost';

FLUSH PRIVILEGES;
