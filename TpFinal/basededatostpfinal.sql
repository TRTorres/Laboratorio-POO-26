-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema tpfinalruiztorres
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tpfinalruiztorres
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tpfinalruiztorres` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `tpfinalruiztorres` ;

-- -----------------------------------------------------
-- Table `tpfinalruiztorres`.`barrio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tpfinalruiztorres`.`barrio` (
  `idbarrio` INT NOT NULL AUTO_INCREMENT,
  `tipodebarrio` VARCHAR(45) NOT NULL,
  `nombrebarrio` VARCHAR(45) NOT NULL,
  `superficiebarrio` VARCHAR(45) NOT NULL,
  `cantidadedificios` VARCHAR(45) NULL DEFAULT NULL,
  `porcentajeasfaltado` VARCHAR(45) NULL DEFAULT NULL,
  `numerodeley` VARCHAR(45) NULL DEFAULT NULL,
  `cuentaconconexion` TINYINT NULL DEFAULT NULL,
  `cantidaddemonoblocks` VARCHAR(45) NULL DEFAULT NULL,
  `poseeconsorcio` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`idbarrio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `tpfinalruiztorres`.`comuna`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tpfinalruiztorres`.`comuna` (
  `numero_comuna` INT NOT NULL,
  `nombre_sedecomunal` VARCHAR(45) NOT NULL,
  `junta_responsable` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`numero_comuna`),
  UNIQUE INDEX `numero_comuna_UNIQUE` (`numero_comuna` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `tpfinalruiztorres`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tpfinalruiztorres`.`persona` (
  `dnipersona` VARCHAR(45) NOT NULL,
  `nombrepersona` VARCHAR(45) NULL DEFAULT NULL,
  `fechadenacimiento` DATE NULL DEFAULT NULL,
  `situacionlaboral` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`dnipersona`),
  UNIQUE INDEX `dniperosona_UNIQUE` (`dnipersona` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
