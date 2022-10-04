# AppiumBasics
Basic Appium Script with Real Device and Virtual Device


https://www.swtestacademy.com/appium-tutorial/

Appium is an ‘HTTP Server’ written using a Node.js platform and drives iOS and an Android session using Webdriver JSON wire protocol. Hence, before initializing the Appium Server, Node.js must be pre-installed on the system.
When Appium is downloaded and installed, then a server is set up on our machine that exposes a REST API.
It receives connection and command request from the client and executes that command on mobile devices (Android / iOS).
It responds back with HTTP responses. Again, to execute this request, it uses the mobile test automation frameworks to drive the user interface of the apps. A framework like:-
Apple Instruments for iOS (Instruments are available only in Xcode 3.0 or later with OS X v10.5 and later)
Google UIAutomator for Android API level 16 or higher
Selendroid for Android API level 15 or less

Install Java 8
https://www.oracle.com/java/technologies/downloads/#java8

Install Android Studio

==sdk/tools is missing fix
https://stackoverflow.com/questions/28789556/android-studio-sdk-tools-directory-is-missing
add to path - C:\Users\Suhail\AppData\Local\Android\Sdk\cmdline-tools\latest\bin
then "sdkmanager --list" should work

https://stackoverflow.com/questions/46402772/failed-to-install-android-sdk-java-lang-noclassdeffounderror-javax-xml-bind-a

Appium

Let’s click the “Advanced” tab and change the Server Address to “127.0.0.1” and click Allow Session Override for override session when
there will be problems and click “Start Server”. If you will use a real device and then use “0.0.0.0” for “Server Adress”.

cmd: adb devices
This is used to see the connected devices
Install APK to emulator device
adb install path/to/your/app.apk ex. adb install D:\Projects\QA\2.Appium\APKPure\TwitterLite.apk

**Appium should be running before appiumInspector

Locators for appium-tutorial/
https://www.browserstack.com/guide/locators-in-appium
https://www.youtube.com/watch?v=LT3mtdCm_vw&ab_channel=TechieQA


To open Appium
-Open Android Studio with our App to test
Click on device manager and start a device to emulate

-Open Appium and start server
Let’s click the “Advanced” tab and change the Server Address to “127.0.0.1” 
and click Allow Session Override for override session when there will be problems and click
“Start Server”. If you will use a real device and then use “0.0.0.0” for “Server Adress”.

-Open CMD and type "adb devices" to view connected devices

-Open Eclicpse Maven project
Go to mvnrepository.com website and get all frameworks’ latest dependency information. We will use TestNG, Appium, Selenium.

-Download and open Appium inspector
https://github.com/appium/appium-inspector
Then, start to enter the capabilities of your device as shown below in the inspector.
Add desired capabilities (Get these from device manager)
Ex.
{
  "appium:deviceName": "Pixel 5 API 26",
  "platformName": "Android",
  "appium:automationName": "UiAutomator2",
  "appium:platformVersion": "8",
  "appium:skipUnlock": "false"
}

-Download "APK Info" and install to device or emulator to get app package names and app activity
https://www.youtube.com/watch?v=cE7jijmLFZQ&ab_channel=Vicky%27sBlog



======================
Driver Types
WebDriver driver - Selenium web driver
AppiumDriver - Appium specific driver
AndroidDriver - Android specific driver




ADD REAL DEVICE to WINDOWS===================================
https://www.youtube.com/watch?v=82KXSli1wPA&ab_channel=AutomationStepbyStep

Step 1 : Download SDK tools
 https://developer.android.com/studio
----------------------------------------------------------------------------------
Step 2 : Unzip folder & Extract platform tools
ex. C:\Users\Suhail\AppData\Local\Android\Sdk
----------------------------------------------------------------------------------
Step 3 : Set environment variables
 ANDROID_HOME = location of sdk folder
 Path : append path of platform_tools folder
----------------------------------------------------------------------------------
Step 4 : Check command adb devices on command line
----------------------------------------------------------------------------------
Step 5 : Make device ready
 - enable developer mode
 - make USB Debugging on
----------------------------------------------------------------------------------
Step 6 : Connect device to computer system thorugh USB cable
 - if asked enable USB Debbugging
----------------------------------------------------------------------------------
Step 7 : Run command adb devices
  adb = android debug bridge
 Check your device id displayed
 
 
 
 REAL DEVICE WITH Appium ==============================================
 Step 1: Download Eclipse or any other IDE for Java
   https://www.youtube.com/playlist?list...

Step 2 : Create a Java project

Step 3 : Add libraries
   Selenium java
   Appium java client 
   https://mvnrepository.com/

Step 4 : Connect device
   run command : adb devices

Step 5 : Start appium server
   can do from command line or appium desktop client

Step 6 : Add code to start automation on mobile device
   Set desired capabilities
    deviceName - Get this from About Phone -> Model number (or can use any name)
    udid - Get this from adb devices cmd
    platformName - Android (if android device)
    platformVersion - Android version (ex. 10)

    appPackage - Download APK Info app and search for your app and click on it and get the name
    appActivity - Scroll down APK Info after searching for app, search for activities and get the top one

    http://127.0.0.1:4723/wd/hub
   Start calculator application

Step 7 : Run and validate

Troubleshooting tips
(contributed by Flavius-Cristian Luca)
- Issues with getting io.appium.uiautomator2.server.test package info: https://github.com/appium/appium-uiau...
- Original error: 'app' option is required for reinstall: for this, i added the following line of code

desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\＜＜userName＞\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.8.3.apk" );




==============Start Object Capture
1. Open Appium desktop client
2. Start appium server
3. Create new connection
Download appium inspector
4. Provide desired capabilities
Provide same as given in the automation script
5. Start session
6. Tap on objects to view the details
7. Add scripts in project and validate








Example Code
