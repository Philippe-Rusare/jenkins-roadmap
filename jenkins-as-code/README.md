# Chapter 05 - Jenkins as Code

## 📖 Introduction

Until now, every Pipeline has been created directly inside the Jenkins web interface.

While this approach is useful for learning the basics, it is not how Jenkins is used in professional software development.

Modern DevOps teams treat Jenkins Pipelines as source code.

Instead of storing Pipeline definitions inside Jenkins, they are version-controlled alongside the application source code.

This practice is known as **Jenkins as Code**.

Keeping Pipelines in Git provides several benefits:

* Version control
* Change history
* Collaboration
* Code reviews
* Backup and recovery
* Reproducibility
* Easier maintenance

From this chapter onward, every project in this roadmap will store its Pipeline inside a `Jenkinsfile` located in the project's Git repository.

This is the standard approach used in modern CI/CD workflows.

---

## 📚 Chapter Contents

### 1. Jenkins + Git

Learn why Git is the foundation of Jenkins as Code and how Jenkins retrieves source code from a Git repository.

---

### 2. Jenkinsfile from SCM

Configure Jenkins to load the Pipeline directly from the project's `Jenkinsfile` instead of storing it inside Jenkins.

---

### 3. GitHub Integration

Connect Jenkins with GitHub repositories to automatically retrieve application source code.

---

### 4. GitHub Webhooks

Configure GitHub Webhooks so Jenkins automatically starts a Pipeline whenever new code is pushed to the repository.

---

## 🎯 Learning Objectives

After completing this chapter, you will be able to:

* Understand the Jenkins as Code philosophy.
* Store Pipelines inside Git repositories.
* Configure Jenkins to read a Jenkinsfile from SCM.
* Connect Jenkins with GitHub.
* Trigger builds automatically using GitHub Webhooks.

---