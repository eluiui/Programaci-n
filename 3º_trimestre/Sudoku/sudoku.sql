Drop SCHEMA IF EXISTS Sudoku;
CREATE SCHEMA IF NOT EXISTS Sudoku DEFAULT CHARACTER SET utf8 ;
USE Sudoku ;


CREATE TABLE IF NOT EXISTS Jugadores (
  nombre VARCHAR(45) not null default(""),
  PRIMARY KEY (nombre)
  )
ENGINE = InnoDB;


CREATE TABLE PartidasGanadas (
    tiempo VARCHAR(45) NULL,
    ganador VARCHAR(45)  not null ,
    FOREIGN KEY (ganador) REFERENCES Jugadores(nombre),
    PRIMARY KEY (ganador)
)ENGINE = InnoDB;
