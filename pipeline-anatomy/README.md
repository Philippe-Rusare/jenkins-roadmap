# Chapter 03 - Pipeline Anatomy

## 📖 Introduction

In the previous chapter, we created and executed our first Jenkins Pipeline.

Although it worked successfully, we have not yet explored what each part of the Pipeline actually means.

Understanding the anatomy of a Pipeline is essential before building more complex CI/CD workflows.

In this chapter, we will break down every major component of a Declarative Pipeline and explain its purpose.

---

## Pipeline Structure

A Declarative Pipeline is organized into multiple blocks.

```groovy
pipeline {

    agent any

    stages {

        stage('Example') {
            steps {
                echo 'Hello Jenkins!'
            }
        }

    }

}
```

The Pipeline is composed of five main elements:

* **pipeline** → The root element of every Jenkins Pipeline.
* **agent** → Defines where the Pipeline will execute.
* **stages** → Groups the different phases of the Pipeline.
* **stage** → Represents a single step in the workflow.
* **steps** → Contains the commands executed during a stage.

---

## Visual Representation

```text
pipeline
│
├── agent
│
└── stages
     │
     ├── stage
     │     └── steps
     │
     ├── stage
     │     └── steps
     │
     └── stage
           └── steps
```

---

## Learning Objectives

After completing this chapter, you should be able to:

* Identify every Pipeline block.
* Understand the responsibility of each block.
* Read and understand a basic Jenkinsfile.
* Prepare for writing more advanced Pipelines.

---