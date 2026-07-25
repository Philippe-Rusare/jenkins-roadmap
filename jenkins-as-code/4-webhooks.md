
# GitHub Webhooks

## What is a Webhook?

A Webhook is an HTTP notification sent by GitHub whenever an event occurs, such as pushing new code to a repository.

Instead of manually clicking **Build Now**, Jenkins can automatically start a new Pipeline.

---

## Workflow

```text
Developer
     │
git push
     │
     ▼
GitHub
     │
Webhook
     ▼
Jenkins
     │
Execute Pipeline
```

---

## Benefits

* Fully automated builds
* Faster feedback
* Continuous Integration
* Reduced manual work

---

## Typical Events

* Push
* Pull Request
* Branch creation
* Tag creation

In most CI workflows, the **Push** event is sufficient to automatically trigger a new build.

---

## Summary

Webhooks are one of the key components of Continuous Integration because they eliminate manual Pipeline execution and ensure that every code change is automatically validated.