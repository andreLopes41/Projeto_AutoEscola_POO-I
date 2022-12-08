-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mvcsimplesjdbc
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mvcsimplesjdbc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mvcsimplesjdbc` DEFAULT CHARACTER SET utf8 ;
USE `mvcsimplesjdbc` ;

-- -----------------------------------------------------
-- Table `mvcsimplesjdbc`.`marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mvcsimplesjdbc`.`marca` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


