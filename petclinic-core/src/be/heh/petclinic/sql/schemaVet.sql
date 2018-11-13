DROP TABLE IF EXISTS vet;

CREATE TABLE vet (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    speciality char(45) not null,
    primary key (id) );

DROP TABLE IF EXISTS owner;

CREATE TABLE owner (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    address char(45) not null,
    city varchar(45) not null,
    telephone varchar(45) not null,
    primary key (id) );