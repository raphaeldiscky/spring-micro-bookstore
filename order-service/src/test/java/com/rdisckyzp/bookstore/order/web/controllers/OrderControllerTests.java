package com.rdisckyzp.bookstore.order.web.controllers;

import com.rdisckyzp.bookstore.order.AbstractIT;
import com.rdisckyzp.bookstore.order.testdata.TestDataFactory;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;


class OrderControllerTests extends AbstractIT {

    @Nested
    class CreateOrderTests {
        @Test
        void shouldCreateOrderSuccessfully() {
            var payload =
                    """
                            {
                                            "customer": {
                                              "name": "Raph",
                                              "email": "raph@gmail.com",
                                              "phone": "9999"
                                            },
                                            "deliveryAddress": {
                                              "addressLine1": "Muntilan",
                                              "addressLine2": "Keji",
                                              "city": "Muntilan",
                                              "state": "Magelang",
                                              "zipCode": "2142",
                                              "country": "Indonesia"
                                            },
                                            "items": [
                                              {
                                                "code": "BOOK-001",
                                                "name": "The Great Gatsby",
                                                "price": 19.99,
                                                "quantity": 1
                                              },
                                              {
                                                "code": "BOOK-002",
                                                "name": "1984",
                                                "price": 14.99,
                                                "quantity": 2
                                              }
                                            ]
                                          }
                            
                            """;
            given().contentType(ContentType.JSON)
                    .body(payload)
                    .when()
                    .post("/api/orders")
                    .then()
                    .statusCode(HttpStatus.CREATED.value())
                    .body("orderNumber", notNullValue());
        }

        @Test
        void shouldReturnBadRequestWhenMandatoryDataIsMissing() {
            var payload = TestDataFactory.createOrderRequestWithInvalidCustomer();
            given().contentType(ContentType.JSON)
                    .body(payload)
                    .when()
                    .post("/api/orders")
                    .then()
                    .statusCode(HttpStatus.BAD_REQUEST.value());
        }
    }
}
