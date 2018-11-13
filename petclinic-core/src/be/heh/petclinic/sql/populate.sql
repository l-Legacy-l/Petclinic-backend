USE petclinic;
INSERT INTO vet (lastname, firstname, speciality) VALUES ("James", "James", "none");

INSERT INTO vet (lastname, firstname, speciality) VALUES ("Helen", "Helen", "radiology");

INSERT INTO vet (lastname, firstname, speciality) VALUES ("Linda", "Linda", "surgery");

INSERT INTO pet (type, name, birthdate,ownerFirstname,ownerLastname) VALUES ("Chien", "Medor", "2016-04-12","Timothée","Bezos");

INSERT INTO pet (type, name, birthdate,ownerFirstname,ownerLastname) VALUES ("Chat", "Flo", "2011-08-08","Fabio","Gates");

INSERT INTO pet (type, name, birthdate,ownerFirstname,ownerLastname) VALUES ("Tortue", "Tortette", "2014-08-23","Alexandre","Cook");

INSERT INTO owner (lastname, firstname, address, city, telephone, pet) VALUES("Nick", "Nick", "49 Rue de la paix", "Paris", "0494012345", "Chat");

INSERT INTO owner (lastname, firstname, address, city, telephone, pet) VALUES("Jane", "Jane", "50 Rue de la croix", "Paris", "0494123456", "Chien");

INSERT INTO owner (lastname, firstname, address, city, telephone, pet) VALUES("Jim", "Jim", "51 Rue de la fosse", "Bruxelles", "0494234567", "Oiseau");
