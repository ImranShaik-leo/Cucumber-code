
Feature: feature to test uploading a new file

  Scenario: user need to upload the file
    Given user is on file uploading page
    And user should have the file in his local repository
    When user click on choos file button
    And user will be naivigated to select the file which need to upload
    And user will select file and click on open
    And user will check the check box of terms and services
    Then user will click on submite button
