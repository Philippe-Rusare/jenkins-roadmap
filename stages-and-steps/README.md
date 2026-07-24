# Chapter 04 - Stages and Steps

## 📖 Introduction

Every Jenkins Pipeline is divided into stages.

A **stage** represents a major phase of the CI/CD process, such as building the application, running tests, or deploying to a server.

Inside each stage, one or more **steps** define the actual commands Jenkins executes.

A well-designed Pipeline uses stages to make the workflow easier to understand, monitor, and debug.

---

## What is a Stage?

A stage groups related tasks into a logical phase.

Examples of common stages:

* Checkout Source Code
* Build
* Test
* Package
* Deploy

Each stage is displayed separately in the Jenkins interface, making it easy to identify where a build succeeds or fails.

---

## What is a Step?

A step is a single action executed inside a stage.

Examples:

* Print a message
* Execute a shell command
* Build a project
* Run unit tests
* Copy files
* Publish artifacts

A stage can contain one or many steps.

---

## Pipeline Example

```groovy
pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }

    }

}
```

---

## Learning Objectives

After completing this chapter, you should be able to:

* Understand the purpose of stages.
* Understand the purpose of steps.
* Organize a Pipeline into logical phases.
* Read the Jenkins Stage View.

---