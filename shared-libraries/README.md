 # Chapter 11 - Jenkins Shared Libraries

## 📖 Introduction

As projects grow, Jenkinsfiles become longer and harder to maintain.

Imagine maintaining the same build logic across twenty different projects.

Every time a build process changes, every Jenkinsfile must be updated.

This quickly becomes difficult to maintain.

Jenkins solves this problem using **Shared Libraries**.

A Shared Library allows you to write reusable Pipeline code once and share it across multiple projects.

Instead of copying the same code into every Jenkinsfile, projects simply call reusable functions.

---

## Why Shared Libraries?

Without Shared Libraries

```
Project A
Jenkinsfile
400 lines

Project B
Jenkinsfile
380 lines

Project C
Jenkinsfile
420 lines
```

Every project duplicates the same logic.

---

With Shared Libraries

```
Shared Library
│
├── buildApp()
├── runTests()
├── buildDocker()
└── deploy()
```

Every Jenkinsfile becomes much smaller.

```
@Library('devops-lib') _

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                buildApp()
            }
        }

    }

}
```

---

## Benefits

- Reusable code
- Easier maintenance
- Cleaner Jenkinsfiles
- Team standardization
- Less duplication

---

## Learning Objectives

After this chapter you will be able to:

- Create a Shared Library
- Register it inside Jenkins
- Call custom Pipeline functions
- Build reusable CI/CD workflows

---