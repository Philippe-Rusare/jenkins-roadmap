# Chapter 10 - Jenkins Credentials

## 📖 Introduction

Modern CI/CD pipelines interact with many external systems.

For example:

- GitHub
- Docker Hub
- Kubernetes
- Cloud Providers
- SSH Servers
- Databases
- APIs

These services require authentication.

A common mistake is storing passwords, tokens or SSH keys directly inside a Jenkinsfile.

This is a serious security risk.

Jenkins solves this problem using **Credentials**.

Credentials are stored securely inside Jenkins and injected into the Pipeline only when needed.

---

## Why Credentials?

❌ Bad practice

```groovy
sh "docker login -u admin -p MyPassword123"
```

Anyone with access to the repository can see the password.

---

✅ Good practice

```groovy
withCredentials(...) {
    sh "docker login ..."
}
```

The password is never exposed.

---

## Supported Credential Types

Jenkins supports several credential types.

### Username and Password

Used for:

- Docker Hub
- Nexus
- Git repositories
- Web applications

---

### Secret Text

Used for:

- GitHub Personal Access Tokens
- API Keys
- Access Tokens

---

### SSH Username with Private Key

Used for:

- Git servers
- Linux servers
- Deployment automation

---

### Secret File

Useful for:

- Kubernetes kubeconfig
- JSON service accounts
- Certificates

---

## Best Practices

✔ Never hardcode passwords.

✔ Give credentials meaningful IDs.

✔ Use the minimum required permissions.

✔ Rotate credentials regularly.

✔ Store secrets only inside Jenkins.

---

## Learning Objectives

After completing this chapter you will be able to:

- Create Jenkins credentials.
- Inject credentials into Pipelines.
- Authenticate securely.
- Prepare Pipelines for production deployments.

---
