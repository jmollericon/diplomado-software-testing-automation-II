Feature: Project
  @Jorge
  Scenario: As a user I want to create a item

    Given I have authentication to todo.ly
    # making a request
    When I send POST request 'api/items.json' with json
    """
    {
       "Content": "from CUCUMBER 2",
    }
    """
    # verify the response
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": "EXCLUDE",
      "Content": "from CUCUMBER 2",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": null,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": null,
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": false,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676115
    }
    """
    And I get the property value 'Id' and save on ID_ITEM
    And I get the property value 'Content' and save on NAME_ITEM

    When I send PUT request 'api/items/ID_ITEM.json' with json
    """
    {
       "Content":"NAME_ITEM UPDATED",
    }
    """
    # verify the response
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": ID_ITEM,
      "Content": "NAME_ITEM UPDATED",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": null,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": null,
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": false,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676115
    }
    """
    When I send DELETE request 'api/items/ID_ITEM.json' with json
    """
    """
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": ID_ITEM,
      "Content": "NAME_ITEM UPDATED",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": null,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": null,
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": true,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676115
    }
    """
    When I send GET request 'api/items/ID_ITEM.json' with json
    """
    """
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": ID_ITEM,
      "Content": "NAME_ITEM UPDATED",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": null,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": null,
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": true,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676115
    }
    """