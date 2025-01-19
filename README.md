# **Wikipedia App Test Automation**

This repository contains automated tests for the Wikipedia mobile application. 
The tests are designed using Selenium, Appium, and the Page Object Model (POM) design pattern to ensure modularity, scalability, and maintainability.

## ✅ **Features Tested**

•	Search Functionality
Verify users can search and view articles.

•	Navigation
Test navigation through the main menu, settings, and categories.

•	Settings configuration
Test settings config, functionality like toggle background color, and button work quality.

•	Login validation
Test functionality of authorization, In case of valid login and invalid login.

•	Topic test
Checking another topic, creating new and make it public



## 🛠 **Technology Stack**

•	Programming Language: Java

•	Frameworks: Selenium, Appium

•	Design Pattern: Page Object Model (POM)

•	Build Tool: Maven

•	Test Runner: TestNG

•	Reporting: ExtentReports



## **⚙️ Setup Instructions**


1.	Clone the Repository  https://github.com/gabyto19/Wikipedia.git
2.  git clone.
3.  cd wikipedia-test-automation.
4.  Install Dependencies
            Ensure you have Java (8 or later), Maven, and Android Studio (or Xcode for iOS) installed.
5. Setup Appium npm install -g appium.
6. Start the Appium server: appium.
7. install allure(MAC case):
8. Install homebew: /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
9. install alure: brew install allure.
10. Verify the installation: allure --version
11. platformName=Android

   platformVersion=15

   deviceName=emulator-5554
   automationName=UiAutomator2 

   app = Download from Play store "Wikipedia"
12. Test launchs from testng.xml.
13. Notice: Open app to start testing; Make Page default to test launchs well(Account mustn't be logged in from very beginning; Theme must be set on "Match system theme");


## **📊 Reporting**

•	The framework generates allure-results after each test run.
•	Reports can be found in the target/reports folder.            # Wikipedia


run: allure serve
