package org.agoncal.article.javaadvent.kid;
//@formatter:off

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class KidResourceTest {

    @Test
    public void getAllKidsFromBrazil() {
        given()
            .param("country", "Brazil").
        when()
            .get("/api/kids").
        then()
            .statusCode(200)
            .body("size()", is(11));
        ;
    }

    @Test
    public void getAllKidsFromMacau() {
        given()
            .param("country", "Macau").
        when()
            .get("/api/kids").
        then()
            .statusCode(200)
            .body("size()", is(20));
    }

    @Test
    public void getAllKidsFromUnkown() {
        given()
            .param("country", "Unkown").
        when()
            .get("/api/kids").
        then()
            .statusCode(200)
            .body("size()", is(0));
    }

    @Test
    public void getAllKidsWithNoParam() {
        given().
        when()
            .get("/api/kids").
        then()
            .statusCode(200)
            .body("size()", is(0));
    }
}
