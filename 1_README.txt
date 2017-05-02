Andriod Apps

	1. open android studio (recommend v2.1+, on Unix based systems)
	2. file -> import project -> /home/user/path/SE/AndriodApps/* 
	3. Gradle will probably have to update or install additional updates. 
		Please allow time to update and android studio to make the app compatable.
	4. Connect an android device with USB debugging enabled
	5. Press the play button and choose the phone to run the application on

*The primary android app to run is called AndriodApps/SmartSchedule
*The only other app function that was not intergrated was the deamon service app
called IndoorPositioningSystemApp
*In order for the temperture functionality to work it requires the server be up. 
Please call me so I can run the server while you want to use the application
------------------------------------------------------------------
Indoor Positioning System

Indoor positioning system has it's own documentation which is through and extensive
There is command line software as well as the android app called IndoorPositioningSystemApp

------------------------------------------------------------------
Unity

To run the simulation requires Unity and the server to be up.
Open unity and import the project in /Simulation/Home. Now just run the simulation via
play button. Move the man with the '1', '2', '3', '4', and '5' keys.

------------------------------------------------------------------
Web App

The web application requires a linux enviroment + python and pip from bash as we are using Flask
Steps:
	1. open bash and move into SmartHome2 directory.
	2. $pip install virtualenv
	3. $virtualenv venv
	4. $source venv/local/bin/activate
	5. $pip install -r requirements.txt
	6. $python app.py

Basically you need a virtual enviroment so that there are not dependecies that
conflict and then you need to run the server
To access the server you can go to localhost:5000 or self host with ngrok (need to download based on what OS your are using)
Any login username and password should do for this demonstration

To check if the API is working go to localhost:5000/api
To get the temperature data go to localhost:5000/api/temp
To update the preferred temp send a post request to localhost:5000/api/temp/preferred with the data of: "preferred=78" for example
Here is an example of a post request with the bash command line tool curl: 
$curl --data "preferred=57" https://9aa4017f.ngrok.io/api/temp/preferred 
or
$curl --data "preferred=57" https://localhost:5000/api/temp/preferred 
-----------------------------------------------------------------------------
MATLAB

	1. Open MATLAB
	2. Navigate to the folder with all the matlab files 
		(SE\1_code\Time to Temperature\Primary Function Matlab GUI)
	3. Open GUI2.m
	4. Click the run button
-----------------------------------------------------------------------------
.
├── 10_Unit_Tests
│   ├── HVACTest.java
│   ├── Indoor_Positioning_System_Testing.c
│   ├── README2.txt
│   ├── SASTest.txt
│   ├── SHSTest.java
│   └── testSimpleGetResponseFromServerVolley.java
├── 11_Intergration_Tests
│   └── test.sh
├── 1_README.txt
├── 2_Report1_and_Report2
│   ├── Group_12_First_Report_Final.pdf
│   └── Group_12_Report_Second_Final.pdf
├── 3_DemoPPT
│   ├── Group_12_Demo_1_Presentation.pptx
│   └── Group_12_Demo_2_Presentation.pptx
├── 4_Report_Three
│   └── doc.txt
├── 5_Source_Code
│   ├── Alexa
│   │   ├── alexa-avs-sample-app
│   ├── AndriodApps
│   │   ├── IndoorPositioningSystemApp
│   │   │   
│   │   ├── OldApps
│   │   │   ├── HVAC
│   │   │   │
│   │   │   ├── SAS_app
│   │   │   │   
│   │   │   ├── Schedule
│   │   │   │   
│   │   │   ├── SE
│   │   │   │   
│   │   │   ├── SHS_Primary_App
│   │   │   │   
│   │   │   └── SmartHomeSystem
│   │   │ 
│   │   └── SmartSchedule-master
│   │
│   ├── Indoor Positioning System
│   │   ├── client.c
│   │   ├── Indoor Positioning System Client Server Software + Testing
│   │   │   ├── client.c
│   │   │   ├── server.c
│   │   │   └── testing.c
│   │   ├── Indoor Positioning System Documentation
│   │   │   ├── client readme.pdf
│   │   │   ├── how to compile and run.pdf
│   │   │   ├── server readme.pdf
│   │   │   └── Under Development.pdf
│   │   ├── IPS Documentation
│   │   │   ├── client readme.pdf
│   │   │   ├── how to compile and run.txt
│   │   │   ├── server readme.pdf
│   │   │   └── Under Development.txt
│   │   ├── OLD_client_server
│   │   │   ├── client.c
│   │   │   ├── server.c
│   │   │   └── testing.c
│   │   ├── server.c
│   │   └── testing.c
│   ├── Time to Temperature
│   │   ├── HVAC_ALG
│   │   │   ├── computeCostMulti.m
│   │   │   ├── ex1data2.asv
│   │   │   ├── ex1data2.txt
│   │   │   ├── featureNormalize.m
│   │   │   ├── gradientDescentMulti.m
│   │   │   ├── test.m
│   │   │   └── timeToTemp.m
│   │   ├── Matlab To Java Conversion
│   │   │   ├── data.txt
│   │   │   └── Time2Temperature.java
│   │   └── Primary Function Matlab GUI
│   │       ├── computeCostMulti.m
│   │       ├── ex1data2.txt
│   │       ├── featureNormalize.m
│   │       ├── gradientDescentMulti.m
│   │       ├── GUI2.fig
│   │       ├── GUI2.m
│   │       ├── insertData.m
│   │       ├── test.m
│   │       └── timeToTemp.m
│   ├── UnitySimulation
│   │   └── Home
│   │
│   └── WebApp
│       └── SmartHomeServer
│           ├── app.py
│           ├── requirements.txt
│           ├── static
│           │   ├── css
│           │   │   ├── bootstrap.css
│           │   │   ├── bootstrap.min.css
│           │   │   └── logo-nav.css
│           │   ├── fonts
│           │   │   ├── glyphicons-halflings-regular.eot
│           │   │   ├── glyphicons-halflings-regular.svg
│           │   │   ├── glyphicons-halflings-regular.ttf
│           │   │   ├── glyphicons-halflings-regular.woff
│           │   │   └── glyphicons-halflings-regular.woff2
│           │   ├── img
│           │   │   └── icon.PNG
│           │   └── js
│           │       ├── bootstrap.js
│           │       ├── bootstrap.min.js
│           │       └── jquery.js
│           └── templates
│               ├── dash.html
│               ├── energy.html
│               ├── index.html
│               └── layout.html
├── 6_Images_Icons
│   └── icon.PNG
├── 7_Scripts_HTML
│   ├── dash.html
│   ├── energy.html
│   ├── index.html
│   ├── layout.html
│   └── readme.txt
├── 8_Database
│   └── README4.txt
├── 9_AnythingElse
│   └── readme.txt
└── Readme.md