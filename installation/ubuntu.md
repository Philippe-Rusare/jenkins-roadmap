# Native Installation on Ubuntu

## Overview

Installing Jenkins directly on Ubuntu is the most common approach for dedicated servers and virtual machines.

In this setup, Jenkins runs as a system service managed by **systemd**, giving it direct access to the host operating system.

---

## Prerequisites

* Ubuntu Server 24.04 LTS
* sudo privileges
* Internet connection
* OpenJDK 21 or later

---

## Installation Steps

### 1. Update the system

```bash
sudo apt update
sudo apt upgrade -y
```

### 2. Install Java

```bash
sudo apt install fontconfig openjdk-21-jdk -y
```

Verify the installation:

```bash
java -version
```

---

### 3. Add the Jenkins repository

Import the Jenkins GPG key:

```bash
curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key \
| sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null
```

Add the repository:

```bash
echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/" \
| sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null
```

---

### 4. Update package lists

```bash
sudo apt update
```

---

### 5. Install Jenkins

```bash
sudo apt install jenkins -y
```

---

### 6. Start Jenkins

```bash
sudo systemctl enable jenkins
sudo systemctl start jenkins
```

Verify the service:

```bash
sudo systemctl status jenkins
```

---

### 7. Retrieve the initial administrator password

```bash
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

---

### 8. Access Jenkins

Open your browser:

```text
http://SERVER_IP:8080
```

---

## Installation Complete

Your Jenkins server is now ready for its initial configuration and plugin installation.
