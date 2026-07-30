# Chapter 14 - SonarQube Integration

## 📖 Introduction

Compiling code successfully does not guarantee that the code is maintainable, secure or reliable.

Modern CI/CD pipelines include an automated code quality analysis before deployment.

One of the most popular tools for this purpose is SonarQube.

SonarQube analyzes source code and detects:

- Bugs
- Security vulnerabilities
- Code smells
- Duplicated code
- Coverage issues

In this chapter we will integrate SonarQube into Jenkins.

---

## Why SonarQube?

Imagine two applications.

Application A

✔ Builds successfully

✔ Tests pass

❌ Contains SQL Injection

❌ Huge duplicated code

❌ Dead code

---

Application B

✔ Builds successfully

✔ Passes Quality Gate

✔ Secure

✔ Maintainable

Clearly, Application B is safer to deploy.

---

## Learning Objectives

After completing this chapter you will be able to:

- Install SonarQube
- Configure Jenkins
- Analyze Java projects
- Understand Quality Gates

---