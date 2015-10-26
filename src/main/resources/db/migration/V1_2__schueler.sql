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


INSERT INTO `taschengeldboerse`.`user` 
(`email`, `authority`, `enabled`, `password`)
VALUES ('schueler', 'ROLE_SCHUELER', '1', '$2a$10$itnRIcZi9s.ssmu8rHcHiegmdWaKSJRZYeOs30SfeQWU8ugJajSJa');

INSERT INTO `taschengeldboerse`.`schueler`
(`id`, `anrede`,`vorname`,`name`,`geburtsdatum`,`strasse`,`plz`,`wohnort`,`telefon`,`email`,`job_zeit`,`job_beschreibung`,`haftpflichtversicherung`,`unfallversicherung`,`merkblatt`,`datenschutz`)
VALUES ('1', 'Herr', 'Tobias', 'Schmid', '6.6.2001', 'St-Johannis-Str. 12', '78315', 'Radolfzell', '12345', 'schueler', 'nachmittags', 'Einkaufen', '0', '0', '0', '0');

