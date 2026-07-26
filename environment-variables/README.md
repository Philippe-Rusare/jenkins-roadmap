# Chapter 07 - Environment Variables

## 📖 Introduction

Hardcoding values inside a Pipeline is a bad practice.

Imagine changing the application name, the Docker image, the Java version, or the deployment server every time a new project starts.

Instead, Jenkins provides **Environment Variables**.

Environment variables allow us to define reusable values once and use them throughout the Pipeline.

They improve readability, maintainability, and make Pipelines easier to scale.

---

## Why Environment Variables?

Without variables:

```groovy
sh "./mvnw clean package"
sh "docker build -t app projet:v1 ."
sh "docker push app projet:v1"
```

With variables:

```groovy
environment {
    APP_NAME = "app projet"
    VERSION  = "v1"
}

sh "docker build -t ${APP_NAME}:${VERSION} ."
sh "docker push ${APP_NAME}:${VERSION}"
```

Changing the version now requires updating only one line.

---

## Types of Variables

### Built-in Variables

Provided automatically by Jenkins.

Examples:

- BUILD_NUMBER
- BUILD_ID
- BUILD_URL
- JOB_NAME
- WORKSPACE
- NODE_NAME

---

### User Variables

Created by the developer.

Example:

```groovy
environment {
    APP_NAME = "hello-jenkins-app"
}
```

---

### Credentials

Sensitive variables such as:

- Passwords
- API Keys
- SSH Keys
- Tokens

These should never be hardcoded.

Jenkins stores them securely using the Credentials Manager.

---

## Learning Objectives

After this chapter you will be able to:

- Declare environment variables.
- Use built-in Jenkins variables.
- Create reusable Pipelines.
- Prepare Pipelines for Docker and Kubernetes.

---