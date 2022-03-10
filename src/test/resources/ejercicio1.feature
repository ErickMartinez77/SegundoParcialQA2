Feature: Ejercicio1
  Scenario: As admin
    Given i have access to Todo.ly
    When i POST request to url http://todo.ly/api/user.json with json
    """
    {
      "Email":"webui@gmail.com",
      "FullName":"Erick",
      "Password":"12345"
    }
    """
    Then i expect in the status code 200
    And i expect in the response body
    """
    {"Id":701919,
    "Email":"webui@gmail.com",
    "Password":null,
    "FullName":"Erick",
    "TimeZone":0,
    "IsProUser":false,
    "DefaultProjectId":"IGNORE",
    "AddItemMoreExpanded":false,
    "EditDueDateMoreExpanded":false,
    "ListSortType":0,
    "FirstDayOfWeek":0,
    "NewTaskDueDate":-1,
    "TimeZoneId":"Pacific Standard Time",
    "ErrorCode":"IGNORE",
    "ErrorMessage":"IGNORE"
    }
    """

    When i send then GET request to url http://todo.ly/api/authentication/token.json with user webui@gmail.com and pass 12345
    And i get a property TokenString and save it in TokenValue

    When i POST a request to url http://todo.ly/api/user/0.json