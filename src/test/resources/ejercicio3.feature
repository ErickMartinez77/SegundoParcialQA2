Feature: TokenGETDelete

  Scenario: As Admin

    Given i got access to todoly

    When i send the GET request to url http://todo.ly/api/authentication/token.json
    And i get a TokenString and save it inside TokenValue
    Then i expect a response body
    """
    {
      "TokenString": TokenValue,
      "UserEmail": "webui@gmail.com",
      "ExpirationTime": "IGNORE"
    }
    """

    When i send the DELETE request to url http://todo.ly/api/authentication/token.json
    Then i expect a response body
    """
    {
      "TokenString": TokenValue,
      "UserEmail": "webui@gmail.com",
      "ExpirationTime": "IGNORE"
    }
    """