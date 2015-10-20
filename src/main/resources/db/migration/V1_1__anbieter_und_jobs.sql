/**
 * Author:  sat
 * Created: 20.10.2015
 */
CREATE TABLE `anbieter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anrede` varchar(4) DEFAULT NULL,
  `vorname` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `geburtsdatum` date DEFAULT NULL,
  `straße` varchar(250) DEFAULT NULL,
  `hausnummer` varchar(250) DEFAULT NULL,
  `plz` varchar(250) DEFAULT NULL,
  `wohnort` varchar(250) DEFAULT NULL,
  `telefonnummer` varchar(250) DEFAULT NULL,
  `emailadresse` varchar(250) DEFAULT NULL,
  `merkblatt` tinyint(4) DEFAULT '0',
  `datenschutz` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
);


CREATE TABLE `jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bezeichnung` varchar(60) NOT NULL,
  `anbieter` int(11) NOT NULL,
  `datum` date DEFAULT NULL,
  `uhrzeit` datetime DEFAULT NULL,
  `zeitaufwand` varchar(45) DEFAULT NULL,
  `entlohnung` varchar(45) DEFAULT NULL,
  `zusaetzliche_infos` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Anbieter_idx` (`anbieter`),
  CONSTRAINT `Anbieter` FOREIGN KEY (`anbieter`) REFERENCES `anbieter` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
