# Spring REST API
This is a Spring Java REST API that will persist to a PostgreSQL database.

This application will use an embedded Apache Tomcat server.

## Clone locally
1. The repo uses a PostgreSQL database, so download and install that first:

https://www.postgresql.org/download/

2. Download GUI for PostgreSQL. You can use PSQL in terminal or PGAdmin, though I recommend DBBeaver for its ease of use

https://dbeaver.io/download/


   - Default user is `postgres` and default password is `postgres`
   - Make a new database using PSQL, PGAdmin, or DBBeaver
   
   
3. You will need to edit the `application.properties` file in the src/java/resources directory to your own postgres user, password, and database name credentials.



## curl -X GET http://localhost:8080/films
returns a list of film objects as JSON response
