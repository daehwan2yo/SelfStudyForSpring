package com.study.springFramework.acceptanceTest.Steps;

import com.study.springFramework.application.ui.dto.MemberRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class MemberSteps {
    public static ExtractableResponse<Response> 가입_요청(MemberRequest memberRequest) {
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(memberRequest)

                .when()
                .post("/members")

                .then().log().all()
                .extract();
    }
}
