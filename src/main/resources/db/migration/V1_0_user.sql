/**
 * Author:  ssr
 * Created: 14.10.2015
 */

CREATE TABLE `user` (
    `email` varchar(255) NOT NULL,  
    `password` varchar(255) NOT NULL DEFAULT '',
    `enabled` varchar(45) DEFAULT '1',
    `authority` varchar(255) NOT NULL,
  PRIMARY KEY (`email`)
);