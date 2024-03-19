package com.qacart;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCases {
    @Test
    public void Test() {
        given().baseUri("https://65f0b628da8c6584131c5063.mockapi.io")
                .when().get("/api/v1/Users").
                then().log().all().
                assertThat().statusCode(200).
                assertThat().body("[0].name",equalTo("Darnell Harris"),
                        "name",hasItems("Kent Lynch DDS","Pat Upton MD","Mona Gleichner"));


    }

}
