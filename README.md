# Petclinic-backend

This project was carried out as part of the advanced web development course at the Haute école en Hainaut. It aims to discover the Spring framework and follow a good programming architecture. This project can therefore be improved and completed with other features.

This is the backend version of the Spring petclinic application. 
This only provides a REST API so, **there's no UI.** 

UI application which consumes the REST API is here [Petclinic-Frontend](https://github.com/xorob0/Petclinic-Frontend).

# Available features

This application provides CRUD operation for vets, pets, owners and visits.
You can also perform a search in the database to find a particular field.

## Prerequisites
The following items should be installed in your system:
* Git command line tool
* Gradle
* Java
* Docker

# Usage

`$ git clone https://github.com/l-Legacy-l/Petclinic-backend.git`

`$ cd Petclinic-backend/`

To execute the backend :

`$ gradle build`

`$ gradle bootRun`

This will run on port 9999, make sure its not already in use.


To create and launch the Mysql server with Docker :

`$ docker pull legacy18/mysql-petclinic:firsttry`

`$ docker run --name petclinic_db -e MYSQL_ROOT_PASSWORD=Test123* -e MYSQL_DATABASE=petclinic -p 3306:3306 -d legacy18/mysql-petclinic:firsttry`

To update the database :

`$ gradle dev update` 

You can also do it manually by running the .sql files into the database.