<?xml version="1.0" encoding="UTF-8"?>

<databaseChangeLog xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
                   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
                   http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.5.xsd">

    <include file="db.sql" relativeToChangelogFile="true"/>
    <include file="schema.sql" relativeToChangelogFile="true"/>
    <include file="populate.sql" relativeToChangelogFile="true"/>    

</databaseChangeLog>