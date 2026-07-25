# Jenkinsfile from SCM

## What is SCM?

**SCM** stands for **Source Code Management**.

Instead of writing the Pipeline directly inside Jenkins, the Pipeline is stored in a file named `Jenkinsfile` located at the root of the project repository.

Jenkins downloads both the application source code and the Jenkinsfile from the same repository.

---

## Advantages

* Pipelines evolve together with the application.
* Every Pipeline change is version-controlled.
* Easier rollback.
* Better collaboration between developers.

---

## Configuration Steps

1. Create a Pipeline project.
2. Select **Pipeline script from SCM**.
3. Choose **Git**.
4. Enter the repository URL.
5. Specify the branch.
6. Set the script path to:

```text
Jenkinsfile
```

7. Save the project.

From now on, Jenkins executes the Pipeline stored inside the repository instead of using the Pipeline editor.
