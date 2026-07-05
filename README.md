<div align="center">

# 🌱 Spring Boot Practice

**A hands-on journey through Spring & Spring Boot fundamentals**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)

</div>

---

## 📖 About

This repository is a personal training ground for learning **Spring** and **Spring Boot** from the ground up — starting with plain Spring, understanding what Spring Boot automates, and gradually working toward real-world backend concepts like REST APIs, persistence, and security.

Each folder is an independent, runnable mini-project focused on one concept at a time.

---

## 🗂️ Modules

<table>
<tr><th>Module</th><th>Concept</th><th>What it covers</th></tr>

<tr>
<td><code><a href="./firstLesson">firstLesson</a></code></td>
<td>Qualifier &amp; Primary</td>
<td>Resolving bean ambiguity in Spring's dependency injection using <code>@Qualifier</code> and <code>@Primary</code>.</td>
</tr>

<tr>
<td><code><a href="./demoString">demoString</a></code></td>
<td>Spring without Boot</td>
<td>A plain Spring setup (no auto-configuration), to see exactly what Spring Boot simplifies.</td>
</tr>

<tr>
<td><code><a href="./demo">demo</a></code></td>
<td>Hello World in Spring Boot</td>
<td>The classic first Spring Boot application — minimal setup, running server.</td>
</tr>

</table>

---

## 🧰 Tech Stack

| Tool | Purpose |
|---|---|
| Java | Core language |
| Spring / Spring Boot | Application framework |
| Maven | Build & dependency management |

---

## ▶️ Getting Started

**Prerequisites:** JDK installed · Maven installed

Clone the repo:

```bash
git clone https://github.com/tek-sys-hub/spring-boot-practice.git
cd spring-boot-practice
```

Run any Spring Boot module:

```bash
cd demo
mvn spring-boot:run
```

For the plain-Spring module (`demoString`), run the main class directly from your IDE, or:

```bash
cd demoString
mvn compile exec:java

*Learning Spring, one module at a time 🚀*

</div>
