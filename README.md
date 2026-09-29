# Calculator

A practical exercise project designed to 
consolidate core full-stack web development concepts by connecting 
a **Java Spring Boot** backend with an **HTML and JavaScript** frontend.


## Technologies Used
* **Java & Spring Boot:** Building backend services and utilizing REST Controllers to map and handle HTTP requests.
* **HTML & JavaScript:** Creating a responsive user interface and consuming backend APIs asynchronously using the native `fetch` API.
* **Maven:** Managing project builds, lifecycles, and external dependencies.

## Project Structure

```text
calculadora_html/
├── src/
│   ├── main/
│   │   ├── java/br/fiap/calculadora_html/
│   │   │   ├── controller/
│   │   │   │   └── CalculadoraController.java
│   │   │   └── Application.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
