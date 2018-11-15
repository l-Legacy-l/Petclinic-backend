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

CREATE TABLE pet (
    id int NOT NULL AUTO_INCREMENT,
    type varchar(45) not null,
    name varchar(45) not null,
    birthdate DATE,
    ownerFirstname varchar(45) not null,
    ownerLastname varchar(45) not null,
    primary key (id) );
    
DROP TABLE IF EXISTS owner;

CREATE TABLE owner (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    address char(45) not null,
    city varchar(45) not null,
    telephone varchar(45) not null,
    pet varchar(45) not null,
    primary key (id) );