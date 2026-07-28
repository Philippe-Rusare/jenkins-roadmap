# Chapter 12 - Docker Integration

## 📖 Introduction

Building a JAR file is often not enough.

Modern applications are packaged as Docker images.

A Docker image contains:

- The application
- The Java Runtime
- Required dependencies
- Configuration

This ensures the application behaves the same on every machine.

In this chapter, Jenkins will automatically build a Docker image after compiling the application.

---

## Why Docker?

Without Docker

Developer Machine

↓

Works perfectly

↓

Production Server

↓

Different Java version

↓

Application crashes

---

With Docker

Developer

↓

Docker Image

↓

Testing

↓

Production

↓

Exactly the same environment

---

## Learning Objectives

After this chapter you will be able to:

- Create a Dockerfile
- Build Docker images
- Integrate Docker into Jenkins
- Prepare your application for deployment

---
