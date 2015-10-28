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
ADD COLUMN `erstelldatum` DATE NULL DEFAULT NULL AFTER `ort`;

