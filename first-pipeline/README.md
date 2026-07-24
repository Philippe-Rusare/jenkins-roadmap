# Chapter 02 - First Pipeline

## 📖 Introduction

Now that Jenkins is installed and running, it's time to create the first Pipeline.

A Pipeline is the core concept of Jenkins. It defines the sequence of steps Jenkins executes to automate software delivery, from building applications to testing and deployment.

In this chapter, we will create our very first Pipeline using the Declarative Pipeline syntax.

Although the pipeline is intentionally simple, it introduces the fundamental building blocks that will be used throughout the rest of this roadmap.

---

## 📚 What You Will Learn

* What a Jenkins Pipeline is
* Declarative Pipeline syntax
* The `pipeline` block
* The `agent` directive
* Stages
* Steps
* Running shell commands
* Viewing build logs
* Understanding build results

---

## Project Structure

```text
02-first-pipeline/
│
├── README.md
├── Jenkinsfile
└── screenshots/
```

---

## Expected Result

After completing this chapter, you should be able to:

* Create a Pipeline project
* Execute your first Jenkins Pipeline
* Read the console output
* Understand the basic Pipeline structure

---