# Spring REST API
This is a Spring Java REST API that will persist to a PostgreSQL database. For this means of this small project, the API will be for holding **Film** data, that is with attributes such as id, description, title, rating, author, etc... You can edit the code to fit whatever need you have.

This application will use an embedded Apache Tomcat server. There are many uses for a RESTful API, currently, I have this REST API running as a backend application behind my Apache Server that is serving my portfolio website at http://alpizano.me. To do this similiar setup, you would need to setup a **reverse proxy** to re-route all traffic coming into port 80 (HTTP) to your backend service of your choice.

## Clone locally
1. The repo uses a PostgreSQL database, so download and install that first:

https://www.postgresql.org/download/

2. Download GUI for PostgreSQL. You can use PSQL in terminal or PGAdmin, though I recommend DBBeaver for its ease of use

https://dbeaver.io/download/


   - Default user is `postgres` and default password is `postgres`
   - Make a new database using PSQL, PGAdmin, or DBBeaver
   
   
3. You will need to edit the `application.properties` file in the `src/main/resources` directory to your own postgres user, password, and database name credentials. 

> You can try removing all the contents of the `application.properties` file and the Spring Boot app should use the in-memory H2 database if you don't feel like setting PostgreSQL up.


## API Endpoints
> If you would like to try these endpoints live on my server, replace `localhost:8080`, with `alpizano.me`

## GET http://localhost:8080/film
curl -X GET http://localhost:8080/film
   - Returns a list of film objects as JSON response
   
## GET http://localhost:8080/film/show/{id}
curl -X GET http://localhost:8080/film/show/1
   
## POST http://localhost:8080/film/new
curl -X POST --header "Content-Type: application/json" --data '{"title": "boogers","description":"a","director": "b", "producer": "c", "release_date": "d", "rt_score": "e"}' http://alpizano.me/api/film/

## DELETE http://localhost:8080/film/delete/{id}
curl -X DELETE 
