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
  dia DATE NOT NULL,
   codveiculo INT,
  codaluno INT ,
  codinstrutor INT,
  PRIMARY KEY (codaula),
  FOREIGN KEY (codveiculo) REFERENCES veiculo (codveiculo),
  FOREIGN KEY (codaluno) REFERENCES aluno (codaluno),
  FOREIGN KEY (codinstrutor) REFERENCES instrutor (codinstrutor))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table provas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS provas (
  codprova INT NOT NULL AUTO_INCREMENT,
  dia DATE NOT NULL,
  codaluno INT NOT NULL,
  nota FLOAT NOT NULL,
  PRIMARY KEY (codprova),
  FOREIGN KEY (codaluno) REFERENCES aluno (codaluno))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table habilitacao
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS habilitacao (
  codhabilitacao INT NOT NULL AUTO_INCREMENT,
  dataemissao DATE NOT NULL,
  codaluno INT NOT NULL,
  PRIMARY KEY (codhabilitacao),
  FOREIGN KEY (codaluno) REFERENCES aluno (codaluno))
ENGINE = InnoDB;


