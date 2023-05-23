package org.example;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    void shouldCheckAnswerOfRequest(){

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some value") )
        ;
    }


}