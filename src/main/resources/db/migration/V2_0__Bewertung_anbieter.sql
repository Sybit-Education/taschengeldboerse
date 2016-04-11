ALTER TABLE `taschengeldboerse`.`anbieter` ADD COLUMN `anzahlBewertungen` INT NULL AFTER `datenschutz`, 
ADD COLUMN `bewertungspunkteInsgesammt` INT NULL AFTER `anzahlBewertungen`;
