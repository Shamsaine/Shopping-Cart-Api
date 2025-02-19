# Shopping Cart API with Spring Boot

A simple Shopping Cart API implementation with four endpoints using Spring Boot.

## Description

This project is a basic implementation of a shopping cart API. It allows users to add, update, view, and delete items in their shopping cart. The project is built using Spring Boot and provides RESTful endpoints for managing the shopping cart.

## Endpoints

- `GET /cart`: Retrieve all items in the cart.
- `POST /cart`: Add a new item to the cart.
- `PUT /cart/{id}`: Update an existing item in the cart.
- `DELETE /cart/{id}`: Delete an item from the cart.

## Project Structure

```
shoppingcart/
├── .mvn/
├── .vscode/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── shoppingcart/
│   │   │               ├── CartController.java
│   │   │               ├── CartModel.java
│   │   │               ├── CartService.java
│   │   │               └── ShoppingcartApplication.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── index.html
│   │           └── styles.css
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── shoppingcart/
│                       └── ShoppingcartApplicationTests.java
├── target/
├── .gitignore
├── .gitattributes
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Setup

### Prerequisites

- Java 21
- Maven

### Steps

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/shoppingcart.git
   cd shoppingcart
   ```

2. **Build the project:**
   ```sh
   ./mvnw clean install
   ```

3. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```

4. **Access the API:**
   The API will be available at `http://localhost:9090`.

## Configuration

The application can be configured using the 

application.properties

 file located in the `src/main/resources` directory. The default configuration sets the server port to `9090`.

```properties
spring.application.name=shoppingcart
server.port=9090
```

## Testing

To run the tests, use the following command:

```sh
./mvnw test
```

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.
