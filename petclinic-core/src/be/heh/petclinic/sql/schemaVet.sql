DROP TABLE IF EXISTS vet;

CREATE TABLE vet (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    speciality char(45) not null,
    primary key (id) );

DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
    id int NOT NULL AUTO_INCREMENT,
    type varchar(45) not null,
    name varchar(45) not null,
    birthdate DATE,
    primary key (id) );