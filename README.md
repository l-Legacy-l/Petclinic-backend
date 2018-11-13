# petclinic

Pour exécuter le backend :

`$ gradle build`

`$ gradle bootRun`


Pour lancer la DB

`docker pull legacy18/mysql-petclinic:firsttry`
`docker run --name petclinic_db -e MYSQL_ROOT_PASSWORD=Test123* -e MYSQL_DATABASE=petclinic -p 3306:3306 -d legacy18/mysql-petclinic:firsttry`
