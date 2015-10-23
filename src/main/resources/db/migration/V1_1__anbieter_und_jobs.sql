/**
 * Author:  sat
 * Created: 20.10.2015
 */
CREATE TABLE `anbieter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anrede` varchar(4) DEFAULT NULL,
  `vorname` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `geburtsdatum` varchar(45) DEFAULT NULL,
  `strasse` varchar(250) DEFAULT NULL,
  `plz` varchar(250) DEFAULT NULL,
  `wohnort` varchar(250) DEFAULT NULL,
  `telefonnummer` varchar(250) DEFAULT NULL,
  `emailadresse` varchar(250) DEFAULT NULL,
  `merkblatt` tinyint(4) DEFAULT '0',
  `datenschutz` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
);

INSERT INTO `taschengeldboerse`.`anbieter` (`id`, `anrede`, `vorname`, `name`, `geburtsdatum`, `strasse`, `plz`, `wohnort`, `telefonnummer`, `emailadresse`, `merkblatt`, `datenschutz`) VALUES ('1', 'Herr', 'Max', 'Mustermann', '1.1.1945', 'Straße 1', '78315', 'Radolfzell', '110', 'mail@email.de', '1', '1');


CREATE TABLE `jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bezeichnung` varchar(60) NOT NULL,
  `anbieter` int(11) NOT NULL,
  `datum` varchar(45) DEFAULT NULL,
  `uhrzeit` varchar(45) DEFAULT NULL,
  `zeitaufwand` varchar(45) DEFAULT NULL,
  `entlohnung` varchar(45) DEFAULT NULL,
  `zusaetzliche_infos` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Anbieter_idx` (`anbieter`),
  CONSTRAINT `Anbieter` FOREIGN KEY (`anbieter`) REFERENCES `anbieter` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
