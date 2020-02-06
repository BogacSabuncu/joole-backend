-- MySQL Script generated by MySQL Workbench
-- Thu Feb  6 10:40:42 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema joole-db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `joole-db` ;

-- -----------------------------------------------------
-- Schema joole-db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `joole-db` DEFAULT CHARACTER SET utf8 ;
USE `joole-db` ;

-- -----------------------------------------------------
-- Table `joole-db`.`Users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `joole-db`.`Users` ;

CREATE TABLE IF NOT EXISTS `joole-db`.`Users` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `userImage` VARCHAR(45) NULL,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `idUser_UNIQUE` (`userId` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `joole-db`.`SalesReps`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `joole-db`.`SalesReps` ;

CREATE TABLE IF NOT EXISTS `joole-db`.`SalesReps` (
  `salesRepId` INT NOT NULL AUTO_INCREMENT,
  `srName` VARCHAR(45) NULL,
  `srPhone` VARCHAR(45) NULL,
  `srEmail` VARCHAR(45) NULL,
  `srWeb` VARCHAR(45) NULL,
  PRIMARY KEY (`salesRepId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `joole-db`.`Manufacturers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `joole-db`.`Manufacturers` ;

CREATE TABLE IF NOT EXISTS `joole-db`.`Manufacturers` (
  `manufacturerId` INT NOT NULL AUTO_INCREMENT,
  `mName` VARCHAR(45) NULL,
  `mPhone` VARCHAR(45) NULL,
  `mEmail` VARCHAR(45) NULL,
  `mWeb` VARCHAR(45) NULL,
  PRIMARY KEY (`manufacturerId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `joole-db`.`Documentations`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `joole-db`.`Documentations` ;

CREATE TABLE IF NOT EXISTS `joole-db`.`Documentations` (
  `documentationId` INT NOT NULL AUTO_INCREMENT,
  `docName` VARCHAR(45) NULL,
  `docType` VARCHAR(45) NULL,
  PRIMARY KEY (`documentationId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `joole-db`.`Products`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `joole-db`.`Products` ;

CREATE TABLE IF NOT EXISTS `joole-db`.`Products` (
  `productId` INT NOT NULL AUTO_INCREMENT,
  `manufacturer` VARCHAR(45) NULL,
  `series` VARCHAR(45) NULL,
  `model` VARCHAR(45) NULL,
  `useType` VARCHAR(45) NULL,
  `application` VARCHAR(45) NULL,
  `mLocation` VARCHAR(45) NULL,
  `accessories` VARCHAR(45) NULL,
  `modelYear` VARCHAR(45) NULL,
  `airflow` INT NULL,
  `powerMin` INT NULL,
  `powerMax` INT NULL,
  `voltageMin` INT NULL,
  `voltageMax` INT NULL,
  `speedMin` INT NULL,
  `speedMax` INT NULL,
  `noOfFanSpeed` INT NULL,
  `sound` INT NULL,
  `diameter` INT NULL,
  `heightMin` INT NULL,
  `heightMax` INT NULL,
  `weight` INT NULL,
  `SalesReps_salesRepId` INT NOT NULL,
  `Manufacturers_manufacturersId` INT NOT NULL,
  `Documentations_documentationsId` INT NOT NULL,
  PRIMARY KEY (`productId`),
  UNIQUE INDEX `idProduct_UNIQUE` (`productId` ASC),
  INDEX `fk_Products_SalesReps1_idx` (`SalesReps_salesRepId` ASC),
  INDEX `fk_Products_Manufacturers1_idx` (`Manufacturers_manufacturersId` ASC),
  INDEX `fk_Products_Documentations1_idx` (`Documentations_documentationsId` ASC),
  CONSTRAINT `fk_Products_SalesReps1`
    FOREIGN KEY (`SalesReps_salesRepId`)
    REFERENCES `joole-db`.`SalesReps` (`salesRepId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Products_Manufacturers1`
    FOREIGN KEY (`Manufacturers_manufacturersId`)
    REFERENCES `joole-db`.`Manufacturers` (`manufacturerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Products_Documentations1`
    FOREIGN KEY (`Documentations_documentationsId`)
    REFERENCES `joole-db`.`Documentations` (`documentationId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
