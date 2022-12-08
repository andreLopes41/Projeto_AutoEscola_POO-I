-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema autoescola
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema autoescola
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS autoescola DEFAULT CHARACTER SET utf8 ;
USE autoescola;

-- -----------------------------------------------------
-- Table pessoa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS pessoa (
  codpessoa INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  PRIMARY KEY (codpessoa))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table instrutor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS instrutor (
  codinstrutor INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL DEFAULT '',
  cpf VARCHAR(45) NOT NULL DEFAULT '',
  PRIMARY KEY (codinstrutor))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table aluno
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS aluno (
  codaluno INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  categoriacnh VARCHAR(12) NOT NULL,
  PRIMARY KEY (codaluno))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table veiculo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS veiculo (
  codveiculo INT NOT NULL AUTO_INCREMENT,
  tipo VARCHAR(45) NOT NULL,
  marca VARCHAR(45) NOT NULL,
  PRIMARY KEY (codveiculo))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table aulas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS aulas (
  codaula INT NOT NULL AUTO_INCREMENT,
  veiculo INT NOT NULL,
  aluno INT NOT NULL,
  instrutor INT NOT NULL,
  PRIMARY KEY (codaula),
  FOREIGN KEY (veiculo) REFERENCES veiculo (codveiculo),
  FOREIGN KEY (aluno) REFERENCES aluno (codaluno),
  FOREIGN KEY (instrutor) REFERENCES instrutor (codinstrutor))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table provas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS provas (
  codprova INT NOT NULL AUTO_INCREMENT,
  dia DATE NOT NULL,
  nota FLOAT NOT NULL,
  codaluno INT NOT NULL,
  PRIMARY KEY (codprova),
  FOREIGN KEY (codaluno) REFERENCES aluno (codaluno))
ENGINE = InnoDB;


