--liquibase formatted sql

--changeset fabio:3

USE petclinic;
INSERT INTO vet (lastname, firstname, speciality) VALUES ("James", "James", "none");

INSERT INTO vet (lastname, firstname, speciality) VALUES ("Helen", "Helen", "radiology");

INSERT INTO vet (lastname, firstname, speciality) VALUES ("Linda", "Linda", "surgery");

INSERT INTO pet (type, name, birthdate,ownerId) VALUES ("Chien", "Medor", "2016-04-12","Timothée","3");

INSERT INTO pet (type, name, birthdate,ownerId) VALUES ("Chat", "Flo", "2011-08-08","Fabio","Gates","1");

INSERT INTO pet (type, name, birthdate,ownerId) VALUES ("Tortue", "Tortette", "2014-08-23","Alexandre","Cook","2");

INSERT INTO owner (lastname, firstname, address, city, telephone) VALUES("Nick", "Nick", "49 Rue de la paix", "Paris", "0494012345");

INSERT INTO owner (lastname, firstname, address, city, telephone) VALUES("Jane", "Jane", "50 Rue de la croix", "Paris", "0494123456");

INSERT INTO owner (lastname, firstname, address, city, telephone) VALUES("Jim", "Jim", "51 Rue de la fosse", "Bruxelles", "0494234567");

INSERT INTO visit (date, description, petId) VALUES ("2012-12-24", "Tim est un dieu", "4");

INSERT INTO visit (date, description, petId) VALUES ("2012-12-24", "Tim est un dieu", "3");

INSERT INTO visit (date, description, petId) VALUES ("2012-12-24", "Tim est un dieu", "2");

INSERT INTO visit (date, description, petId) VALUES ("2012-12-24", "Tim est un dieu", "1");

