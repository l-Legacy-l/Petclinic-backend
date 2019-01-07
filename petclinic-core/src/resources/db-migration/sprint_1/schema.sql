--liquibase formatted sql

--changeset fabio:2

USE petclinic;
DROP TABLE IF EXISTS vet;

CREATE TABLE vet (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    speciality char(45) not null,
    primary key (id) );

DROP TABLE IF EXISTS pet;

DROP TABLE IF EXISTS owner;

CREATE TABLE owner (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    address char(45) not null,
    city varchar(45) not null,
    telephone varchar(45) not null,
    primary key (id) );

CREATE TABLE pet (
    id int NOT NULL AUTO_INCREMENT,
    type varchar(45) not null,
    name varchar(45) not null,
    birthdate DATE,
    ownerId int not null,
    primary key (id),
    CONSTRAINT FK_OwnerPet 
    FOREIGN KEY (ownerId) 
    REFERENCES owner(id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);

DROP TABLE IF EXISTS visit;

CREATE TABLE visit (
    id int NOT NULL AUTO_INCREMENT,
    date DATE not null,
    description varchar(45) not null,
    petId int not null,
    vetId int,
    primary key (id),
    CONSTRAINT FK_PetVisit 
    FOREIGN KEY (petId) 
    REFERENCES pet(id) 
	ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT FK_VetVisit
    FOREIGN KEY (vetId)
    REFERENCES vet(id)
    ON DELETE CASCADE 
    ON UPDATE CASCADE);