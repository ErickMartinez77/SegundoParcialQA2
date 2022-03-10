package factoryRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPUT implements IRequest {
    @Override
    public Response send(RequestInformation request) {
        Response response = given().
                header(request.getAuthType(), request.getAuthValue()).
                contentType(ContentType.JSON).
                body(request.getBody()).
                log().
                all().
                when().
                put(request.getUrl());

        response.then().log().all();
        return response;
    }

    @Override
    public Response send1(RequestInformationNoAuth request1) {
        Response response = given().
                contentType(ContentType.JSON).
                body(request1.getBody()).
                log().
                all().
                when().
                put(request1.getUrl());

        response.then().log().all();
        return response;
    }
}
