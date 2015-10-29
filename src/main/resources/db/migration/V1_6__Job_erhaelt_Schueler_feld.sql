/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Schulungsnb04
 * Created: 28.10.2015
 */

ALTER TABLE `taschengeldboerse`.`jobs` 
ADD COLUMN `schueler` INT(11) NULL DEFAULT NULL AFTER `erstelldatum`,
ADD INDEX `Schueler_idx` (`schueler` ASC);
ALTER TABLE `taschengeldboerse`.`jobs` 
ADD CONSTRAINT `Schueler`
  FOREIGN KEY (`schueler`)
  REFERENCES `taschengeldboerse`.`schueler` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;