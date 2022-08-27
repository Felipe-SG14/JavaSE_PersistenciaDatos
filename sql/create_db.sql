CREATE TABLE `mensajes_app`.`mensajes` (
  `id_mensaje` INT(7) NOT NULL AUTO_INCREMENT , 
  `mensaje` VARCHAR(280) NOT NULL , 
  `autor_mensaje` VARCHAR(50) NOT NULL , 
  `fecha_mensaje` TIMESTAMP NOT NULL , 
  PRIMARY KEY (`id_mensaje`)) ENGINE = InnoDB;