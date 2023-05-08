# SimpleNotes API

SimpleNotes API is a RESTful web service that provides endpoints for creating, retrieving, updating, and deleting notes. It is built using the Java programming language and the Spring Boot framework.

## Features

SimpleNotes API provides the following features:

- Add Note: Allows users to create a new note by providing a title and content.
- Get All Notes: Returns a list of all notes stored in the database.
- Get Note by ID: Returns a specific note based on the provided ID.
- Update Note: Allows users to update an existing note by providing a new title and/or content.
- Delete Note: Allows users to delete an existing note based on the provided ID.

## Getting Started

To get started with SimpleNotes API, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/your-username/SimpleNotes-API.git
```

2. Install the dependencies:

```bash
./mvnw install
```

3. Run the application:

```bash
./mvnw spring-boot:run
```

4. Open your browser and go to http://localhost:9090/swagger-ui.html to see the API documentation.


## Technologies Used

SimpleNotes API is built using the following technologies:

- Java
- Spring Boot
- Spring Data JPA
- H2 Database Engine
- Swagger UI

## Contributing

Contributions to SimpleNotes API are welcome! To contribute, follow these steps:

1. Fork the repository.

2. Create a new branch:

```bash
git checkout -b new-feature
```

3. Make changes and commit them:

```bash
git commit -am 'Add new feature'
```

4. Push to the branch:

```bash
git push origin new-feature
```

Create a pull request.
