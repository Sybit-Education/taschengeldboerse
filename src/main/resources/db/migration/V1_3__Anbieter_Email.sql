/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Schulungsnb01
 * Created: 27.10.2015
 */

ALTER TABLE `taschengeldboerse`.`anbieter` 
CHANGE COLUMN `emailadresse` `email` VARCHAR(250) NULL DEFAULT NULL ;
