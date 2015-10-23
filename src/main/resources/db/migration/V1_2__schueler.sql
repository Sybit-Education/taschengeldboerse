/**
 * Author:  ssr
 * Created: 23.10.2015
 */

CREATE TABLE `schueler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anrede` varchar(4) DEFAULT NULL,
  `vorname` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `geburtsdatum` varchar(45) DEFAULT NULL,
  `strasse` varchar(250) DEFAULT NULL,
  `plz` varchar(250) DEFAULT NULL,
  `wohnort` varchar(250) DEFAULT NULL,
  `telefon` varchar(250) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `job_zeit` varchar(250) DEFAULT NULL,
  `job_beschreibung` varchar(250) DEFAULT NULL,
  `haftpflichtversicherung` tinyint(4) DEFAULT '0',
  `unfallversicherung` tinyint(4) DEFAULT '0',
  `merkblatt` tinyint(4) DEFAULT '0',
  `datenschutz` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
);