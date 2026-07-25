# Jenkins + Git

## Why Git?

Git is the most widely used version control system in modern software development.

Jenkins relies on Git to retrieve source code before executing a Pipeline.

Instead of copying application files manually to the server, Jenkins clones the repository directly from Git.

This ensures that every build is based on the latest version of the source code.

---

## Typical Workflow

```text
Developer
     │
     │ git push
     ▼
GitHub Repository
     │
     ▼
Jenkins
     │
     ▼
Clone Repository
     │
     ▼
Execute Pipeline
```

---

## Benefits

* Version-controlled Pipelines
* Easier collaboration
* Automatic builds
* Traceability
* Better project organization

Git is the foundation of every modern Jenkins workflow.
