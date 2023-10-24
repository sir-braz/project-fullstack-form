# Project-Fullstack-Form

Project-Fullstack-Form is a full-stack application developed with React.js and Java Spring Boot. It provides a user registration and data management system, allowing the creation, updating, listing, and deletion of user records.

## Prerequisites

Before running the project, ensure you have the following software installed on your machine:

- Node.js (for React.js)
- Java JDK 11 (for Spring Boot)

## Front-end and Back-end Setup

The project consists of two main parts: the React.js front-end and the Java Spring Boot back-end.

### Front-end (React.js)

1. Navigate to the `frontend` directory:
   ```shell
   cd frontend
   ```

2. Install dependencies:
   ```shell
   npm install
   ```

3. Start the React development server:
   ```shell
   npm start
   ```

The React application will be available at http://localhost:3000.

### Back-end (Java Spring Boot)

1. Open the `backend` project using your Java IDE.

2. Configure the database connection in `application.properties` with your database credentials.

3. Start the Spring Boot application.

The back-end API will be available at http://localhost:8080.

## API Endpoints

The Project-Fullstack-Form provides the following API endpoints for user registration and management:

### User Registration

- `POST /api/register`: Creates a new user account.
- `GET /api/users`: Lists all registered users.
- `GET /api/users/{id}`: Retrieves details of a specific user based on ID.
- `PUT /api/users/{id}`: Updates data of an existing user based on ID.
- `DELETE /api/users/{id}`: Deletes a user from the system based on ID.

## User Data Model

The project's data model includes user entities with fields such as username, email, and password.

## Security

Security measures, such as password encryption, have been implemented to protect user data.

## Tests

Unit tests have been implemented for both the front-end and back-end components using appropriate testing libraries.

### Running Tests

#### Front-end Tests

In the `frontend` directory, you can run front-end tests with:
```shell
npm test
```

#### Back-end Tests

In the `backend` project, you can run back-end tests with your Java IDE or using Maven:
```shell
mvn test
```

## To-Do

- Create user registration and management functionality in both front-end and back-end.
- Implement validation and error handling.
- Enhance security measures, such as authentication and authorization.
- Dockerize the application for easy deployment.
- Complete and expand documentation in README.md.
