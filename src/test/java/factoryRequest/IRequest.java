package factoryRequest;

import io.restassured.response.Response;

public interface IRequest {
    Response send(RequestInformation request);
    Response send1(RequestInformationNoAuth request1);
}
