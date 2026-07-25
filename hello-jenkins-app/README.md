# Chapter 06 - Hello Jenkins App

## 📖 Introduction

In the previous chapters, we learned how to install Jenkins, understand Pipelines, and store them as code using Git.

Starting with this chapter, we will work on a real application that will evolve throughout the rest of this roadmap.

The application is intentionally simple so that we can focus on Jenkins concepts instead of application complexity.

This project will become the foundation for all future chapters.

---

## Project Overview

The application is a minimal Spring Boot REST API.

It exposes a single endpoint:

```http
GET /hello
```

Response:

```json
{
  "message": "Hello Jenkins!"
}
```

Although simple, this application is sufficient to demonstrate professional CI/CD practices.

---

## Objectives

In this chapter, you will learn how to:

* Clone a Git repository
* Configure Jenkins to read the Jenkinsfile
* Build a Spring Boot project
* Generate a JAR file
* Verify a successful build

---

## Project Structure

```text
app/
├── pom.xml
├── mvnw
├── src/
└── target/
```

---

## Expected Result

At the end of this chapter:

* Jenkins successfully clones the repository.
* Maven compiles the project.
* A JAR file is generated.
* The Pipeline finishes successfully.

---