# Techno Study Project – with TestNG

## 📌 Table of Contents

- [Project Description](#project-description)
- [Project Structure](#project-structure)
- [Project Structure Explanation](#project-structure-explanation)
- [User Stories and Test Scenarios](#user-stories-and-test-scenarios)
- [Test Coverage Table](#test-coverage-table)
- [Tools and Technologies](#tools-and-technologies)
- [Project Team](#project-team)
- [GitHub Repository](#github-repository)
- [Project Team GitHub](#project-team-github)
- [License](#license)

---

## 📝 Project Description

This project automates UI test cases for the [Techno Study Website](https://techno.study/) using **Java**, **TestNG**, **Selenium WebDriver**, and the **Page Object Model (POM)**.
Test scenarios cover core user interactions, accessibility of content, and form functionality.
The framework supports parallel and cross-browser testing and executes via `testng.xml` files grouped as smoke and regression.

🌀 The development process was conducted in an **Agile environment**, following **one-week sprints**.
We implemented key **Scrum ceremonies** such as **Daily Stand-ups**, **Sprint Planning**, **Backlog Grooming**, and **Sprint Reviews/Retrospectives** to ensure iterative development, team alignment, and continuous improvement.
Collaboration and task tracking were maintained using version control and shared documentation.

📅 Features:

- Modular POM design
- Test grouping and execution via `testng.xml`
- Parallel and cross-browser test support

🔗 [Techno Study](https://techno.study/)

---

## 🏗️🚛 Project Structure

```plaintext
TechnoStudyProject/
│
├── src/
│   ├── technoStudy/
│   │    │ 
│   │    ├── base/                  # BaseDriver and core structure
│   │    ├── elements/              # Page Object classes (POM)
│   │    ├── methods/               # User actions
│   │    └── tests/                 # TestNG test scenarios
│   │        └─XML/                 # XML configuration files
│   │
│   └── utility/                    # Helper classes (MyFunc, ConfigReader, etc.)
│  
│
├── test-output/                    # TestNG output reports
│
├── tests_gif/                      # Test GIFs
│
├── configyration.properties/       # Configuration files
│
└── README.md                       # Project documentation


```

---

## 📖 Project Structure Explanation

- **src/technoStudy/base/**: Contains the `BaseDriver` class and core structure.
- **src/technoStudy/elements/**: Contains Page Object classes (POM) for each page.
- **src/technoStudy/methods/**: Contains methods for user actions.
- **src/technoStudy/tests/**: Contains TestNG test scenarios.
- **src/technoStudy/tests/XML/**: Contains TestNG XML configuration files.
- **src/technoStudy/utility/**: Contains helper classes like `MyFunc`, `ConfigReader` etc.
- **test-output/**: Contains TestNG output reports.
- **tests_gif/**: Contains GIFs demonstrating test scenarios.
- **configuration.properties/**: Contains configuration files for the project.
- **README.md**: Contains project documentation.

---

## 🧑‍💻 User Stories and Test Scenarios

### **1️⃣ US_501 - Dropdown Menu**

📌 As a user, Easy access to course pages should be provided from the programmes dropdown menu.

✅ Expected: The user should be directed to the desired course and all courses should be visible.

✅ Actual:

<img src="tests_gif/TC_401.gif" alt="US_401.gif" width="800" height="500"/>

### **2️⃣ US_502 Cross Campus**

📌 As a user, The SIGN IN button should redirect to the Campus login page.

✅ Expected:  The user should be redirected to the Campus platform login page.

✅ Actual:

<img src="tests_gif/TC_502.gif" alt="402" width="800" height="500"/>

### **3️⃣ US_503 - Booking**

📌 As a user, It should be possible to submit user data via the application form.

✅ Expected: The application form must be submitted successfully and a confirmation message must appear.

✅ Actual:

<img src="tests_gif/TC_503.gif" alt="503" width="800" height="500"/>

### **4️⃣ US_504 - Blog Page**

📌 As a user, the blog page must be accessible and the content must be viewable.

✅ Expected: Blog page should be opened and content should be displayed properly.

✅ Actual:

<img src="tests_gif/TC_404.gif" alt="404" width="800" height="500"/>

### **5️⃣ US_505 - Submenu Social Media**

📌 As a user, Social media accounts should be accessible from the footer section.

✅ Expected: The user should be directed to the relevant social media page.

✅ Actual:

<img src="tests_gif/TC_505.gif" alt="TC_505.gif" width="800" height="500"/>

### **6️⃣ US_506 - Logo To Homepage**

📌 The Techno Study logo should redirect to the homepage.

✅ Expected: When the logo is clicked, the user should return to the main page.

✅ Actual:

<img src="tests_gif/TC_506.gif" alt="TC_506.gif" width="800" height="500"/>

### **7️⃣ US_507 - Course Details**

📌 The "Learn More" button should show the course details.

✅ Expected: The Learn More link must lead to the correct course detail page and the page content must be complete.

✅ Actual:

<img src="tests_gif/TC_407.gif" alt="TC_407.gif" width="800" height="500"/>

### **8️⃣ US_508 - Terms Of Use**

📌 The Terms of Use link should work and present the content correctly.

✅ Expected: Terms of Use page should be opened and content should be presented properly.

✅ Actual:

<img src="tests_gif/TC_508.gif" alt="TC_408" width="800" height="500"/>

---

## 📊 **Test Coverage Table**


| Test Scenario                 | Status    | Priority |
| ----------------------------- | --------- | -------- |
| US_501 - Dropdown Menu        | ✅ Passed | Medium   |
| US_502 - Cross Campus         | ✅ Passed | High     |
| US_503 - Booking              | ✅ Passed | High     |
| US_504 - Blog Page            | ✅ Passed | Low      |
| US_505 - Submenu Social Media | ✅ Passed | Medium   |
| US_506 - Logo To Homepage     | ✅ Passed | Medium   |
| US_507 - Course Details       | ✅ Passed | High     |
| US_508 - Terms Of Use         | ✅ Passed | Medium   |

---

## 🚀 Tools and Technologies


| Tool / Technology      | Description                                                     |
| ---------------------- | --------------------------------------------------------------- |
| **Java**               | Programming language                                            |
| **Selenium WebDriver** | Web automation framework                                        |
| **TestNG**             | Testing framework                                               |
| **TestNG XML**         | Manages test configurations and groups                          |
| **Maven**              | Dependency management and compilation operations in the project |
| **Page Object Model**  | Reusable and maintainable test design                           |
| **Git / GitHub**       | Version control and  collaboration platform                     |

---

## 📚 Required Libraries

To ensure the project runs correctly, the following libraries must be added to the project:

- Selenium
- TestNG
- Apache Commons IO
- SLF4J NOP

---

## 👨‍💻 Project Team


| Name              | Role                              | User Story     |
| ----------------- | --------------------------------- | -------------- |
| **Tugba Kilic**   | Project Lead - QA Automation Eng. | US_502, US_508 |
| **Zafer Ataklı** | QA Automation Engineer            | US_506         |
| **Nuri Ozturk**   | QA Automation Engineer            | US_503         |
| **Rıfat Batır** | QA Automation Engineer            | US_505         |
| **Azim Korkmaz**  | QA Automation Engineer            | US_504         |
| **Yigit Cam**     | QA Automation Engineer            | US_501         |
| **Sibel Oztemel** | QA Automation Engineer            | US_507         |

> Note: This is a collaborative QA training project.

---

## 🔗 GitHub Repository

📂 [Techno Study TestNG Automation Repository](https://github.com/TugbaKilic33/TechnoStudyProject)

---

## 👨‍💻 Project Team GitHub

- **[Zafer Ataklı](https://github.com/zaferatakli)**
- **[Tugba Kılıç](https://github.com/TugbaKilic33)**
- **[Yiğit Çam](https://github.com/Yigit-Cam)**
- **[Rıfat Batır](https://github.com/rftbtr)**
- **[Azim Korkmaz](https://github.com/AzimKorkmaz)**
- **[Nuri Öztürk](https://github.com/NuriOzturk)**
- **[Sibel Oztemel](https://github.com/Sibel52)**

---

## Source

- [Techno Study Website](https://techno.study/)
- [Techno Study YouTube](https://www.youtube.com/@TechnoStudyTR)
- [Techno Study Instagram](https://www.instagram.com/technostudy.tr/)
- [Techno Study LinkedIn](https://www.linkedin.com/company/techno-study-inc/posts/?feedView=all)

---

## 📝 License

This project is intended for learning and non-commercial use.
