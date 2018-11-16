--liquibase formatted sql

--changeset fabio:1

CREATE DATABASE `petclinic` DEFAULT CHARACTER SET utf8;
GRANT SELECT, INSERT, UPDATE, DELETE ON petclinic.* to 'petclinic'@'%' IDENTIFIED BY 'petclinic';