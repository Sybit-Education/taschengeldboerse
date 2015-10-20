/**
 * Author:  sat
 * Created: 20.10.2015
 */

CREATE TABLE `jobs` (
  `id` int(11) NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
