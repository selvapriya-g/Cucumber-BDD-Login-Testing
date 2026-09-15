# Cucumber-BDD-Login-Testing

## Project Overview

This project demonstrates **Behavior-Driven Development (BDD)** using **Cucumber, Java, and JUnit 5**.

A simple **Login Functionality** test scenario is created and executed using the **Given-When-Then** approach.

## Technologies Used

- Java
- Cucumber
- JUnit 
- Maven
- Eclipse IDE

## Project Structure

```text
CucumberBDDProject
│
├── src/test/java
│   └── loginsteps
│       ├── LoginSteps.java
│       └── CucumberTestRunner.java
│
├── src/test/resources
│   └── features
│       └── login.feature
│
└── pom.xml

Test Scenario:
Successful Login

Given: User is on the login page

When: User enters valid username and password

Then: User should be logged in successfully

BDD Workflow
Feature File
     ↓
Step Definitions
     ↓
Cucumber Test Runner
     ↓
JUnit 5
     ↓
Test Execution
Test Result

The login scenario was executed successfully with all 3 steps passed.

Learning Outcomes
Understanding BDD concepts
Writing Cucumber feature files
Creating step definitions
Running Cucumber tests with JUnit 5
Using Maven for dependency management
Author

Selvapriya
