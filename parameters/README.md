# Chapter 09 - Build Parameters

## 📖 Introduction

Until now, every Pipeline execution behaved exactly the same.

Regardless of who launched the build, Jenkins always executed the same commands using the same values.

In real-world projects this is not enough.

Sometimes we want to choose:

- the Git branch
- the application version
- the deployment environment
- whether tests should run
- whether Docker images should be built

Instead of modifying the Jenkinsfile every time, Jenkins provides **Build Parameters**.

Parameters make Pipelines interactive and reusable.

---

## Why Parameters?

Without parameters:

```groovy
sh "./mvnw clean package"
```

With parameters:

```groovy
if (params.RUN_TESTS) {
    sh "./mvnw test"
}
```

The user decides what Jenkins should do.

---

## Parameter Types

Jenkins supports multiple parameter types.

### String Parameter

Example:

```
Application Version
```

---

### Choice Parameter

Example:

```
dev
staging
production
```

---

### Boolean Parameter

Example:

```
Run Tests
```

---

### Password Parameter

Sensitive values entered securely.

---

### Text Parameter

Useful for long messages or release notes.

---

## Learning Objectives

After completing this chapter you will be able to:

- Create interactive Pipelines
- Use user input
- Execute conditional stages
- Prepare deployment Pipelines

---