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

