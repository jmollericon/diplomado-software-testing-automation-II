Feature: Project
  @Jorge
  Scenario: As a user I want to create a project so that organize my task

    Given I have authentication to todo.ly
    # making a request
    When I send POST request 'api/projects.json' with json
    """
    {
       "Content": "CUCUMBER",
       "Icon": 4
    }
    """
    # verify the response
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
        "Id": "EXCLUDE",
        "Content": "CUCUMBER",
        "ItemsCount": 0,
        "Icon": 4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "EXCLUDE",
        "Children": [],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "EXCLUDE",
        "LastUpdatedDate": "EXCLUDE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """


