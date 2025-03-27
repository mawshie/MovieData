# Movie Database CRUD Application
This is a **Spring Boot** CRUD application that manages a movie database. The application allows users to perform CRUD operations on Movies and Genres

# Features
RESTful API for movies and Genres

Spring Data JPA for database interactions

Hiberbnate for ORM mapping

MySQL as the database

JSON API Responses

# Technologies Used
Spring Boot\
Spring Data JPA\
Spring Data Rest\
Hibernate\
MySQL\
Maven\
Postman (for API testing)

# API Endpoints
## Movie Endpoints
| Method  | Endpoint | Description|
| ------------- | ------------- |------------|
| GET | /api/movies  | Get all movies
| GET  | /api/movies/{id}  | Get a movie by ID
| GET | /api/movies/with-genre | Get Movies with Genre
| POST | /api/movies | Add a new movie
| PUT | /api/movies/{id} | Update an existing movie
| DELETE | /api/movies/{id} | Delete a movie

**Genre Endpoints**
| Method  | Endpoint | Description|
| ------------- | ------------- |------------|
| GET | /api/genres  | Get all genres
| GET  | /api/genres/{id}  | Get a genre by ID
| POST | /api/genres | Add a new genre
| PUT | /api/genres/{id} | Update an existing genre
| DELETE | /api/genres/{id} | Delete a genre
