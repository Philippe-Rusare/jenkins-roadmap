# Installing Jenkins with Docker

## Overview

Running Jenkins inside Docker is a flexible and portable deployment method.

This approach isolates Jenkins from the host operating system and simplifies upgrades, backups, and migrations.

---

## Prerequisites

* Docker installed
* Docker Compose (optional)
* Internet connection

---

## Pull the Jenkins image

```bash
docker pull jenkins/jenkins:lts
```

---

## Create a persistent volume

```bash
docker volume create jenkins_home
```

---

## Run Jenkins

```bash
docker run -d \
  --name jenkins \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins_home:/var/jenkins_home \
  jenkins/jenkins:lts
```

---

## Retrieve the administrator password

```bash
docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword
```

---

## Access Jenkins

Open:

```text
http://SERVER_IP:8080
```

---

## Stop the container

```bash
docker stop jenkins
```

---

## Start the container

```bash
docker start jenkins
```

---

## Remove the container

```bash
docker rm -f jenkins
```

> **Note:** Removing the container does not delete your Jenkins data because it is stored in the `jenkins_home` Docker volume.

---

## Installation Complete

Your Docker-based Jenkins instance is now ready for configuration and pipeline creation.
