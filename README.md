# Spring REST API
This is a Spring Java REST API that will persist to a Postgresql database. To begin with, we will have one **GET** endpoint /films, that when triggered via HTTP, returns a JSON response of film objects with a 200 http status. More API endpoints and CRUD operations will be subsequently added. 

This application will use a Apache Tomcat container and uses the Spring Web MVC architectural pattern and will be hosted on my Digital Ocean Virtual Private Server (VPS) in the "cloud"

## curl -X GET http://localhost:8080/films
returns a list of film objects as JSON response
