# GitHub Integration

## Overview

GitHub is one of the most common SCM platforms used with Jenkins.

Connecting Jenkins to GitHub allows Pipelines to retrieve source code directly from remote repositories.

---

## Connection Process

```text
GitHub Repository
        │
        ▼
Jenkins
        │
        ▼
Clone Repository
        │
        ▼
Execute Jenkinsfile
```

---

## Requirements

* A GitHub account
* A Git repository
* Git installed on the Jenkins server
* Network access between Jenkins and GitHub

---

## Best Practice

Keep the `Jenkinsfile` in the root directory of the repository.

This makes the project self-contained and easier to maintain.
