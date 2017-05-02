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
├── Alexa
│   ├── alexa-avs-sample-app
│   │   ├── automated_install.sh
│   │   ├── CONTRIBUTING.md
│   │   ├── Installer_Licenses.txt
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── README.md
│   │   ├── README.txt
│   │   ├── RELEASE.txt
│   │   └── samples
│   │       ├── androidCompanionApp
│   │       │   ├── app
│   │       │   │   ├── build.gradle
│   │       │   │   ├── libs
│   │       │   │   │   └── login-with-amazon-sdk.jar
│   │       │   │   └── src
│   │       │   │       └── main
│   │       │   │           ├── AndroidManifest.xml
│   │       │   │           ├── java
│   │       │   │           │   └── com
│   │       │   │           │       └── amazon
│   │       │   │           │           └── alexa
│   │       │   │           │               └── avs
│   │       │   │           │                   └── companion
│   │       │   │           │                       ├── AuthConstants.java
│   │       │   │           │                       ├── CompanionProvisioningInfo.java
│   │       │   │           │                       ├── DeviceProvisioningInfo.java
│   │       │   │           │                       ├── LoginWithAmazonActivity.java
│   │       │   │           │                       └── ProvisioningClient.java
│   │       │   │           └── res
│   │       │   │               ├── drawable
│   │       │   │               │   └── login_button.xml
│   │       │   │               ├── drawable-hdpi
│   │       │   │               │   ├── btnlwa_gold_loginwithamazon.png
│   │       │   │               │   └── btnlwa_gold_loginwithamazon_pressed.png
│   │       │   │               ├── drawable-mdpi
│   │       │   │               │   ├── btnlwa_gold_loginwithamazon.png
│   │       │   │               │   └── btnlwa_gold_loginwithamazon_pressed.png
│   │       │   │               ├── drawable-xhdpi
│   │       │   │               │   ├── btnlwa_gold_loginwithamazon.png
│   │       │   │               │   └── btnlwa_gold_loginwithamazon_pressed.png
│   │       │   │               ├── drawable-xxhdpi
│   │       │   │               │   ├── btnlwa_gold_loginwithamazon.png
│   │       │   │               │   └── btnlwa_gold_loginwithamazon_pressed.png
│   │       │   │               ├── layout
│   │       │   │               │   └── lwa_activity.xml
│   │       │   │               ├── mipmap-hdpi
│   │       │   │               │   └── ic_launcher.png
│   │       │   │               ├── mipmap-mdpi
│   │       │   │               │   └── ic_launcher.png
│   │       │   │               ├── mipmap-xhdpi
│   │       │   │               │   └── ic_launcher.png
│   │       │   │               ├── mipmap-xxhdpi
│   │       │   │               │   └── ic_launcher.png
│   │       │   │               ├── raw
│   │       │   │               │   └── ca.crt
│   │       │   │               ├── values
│   │       │   │               │   ├── dimens.xml
│   │       │   │               │   ├── strings.xml
│   │       │   │               │   └── styles.xml
│   │       │   │               └── values-w820dp
│   │       │   │                   └── dimens.xml
│   │       │   ├── build.gradle
│   │       │   ├── gradle
│   │       │   │   └── wrapper
│   │       │   │       ├── gradle-wrapper.jar
│   │       │   │       └── gradle-wrapper.properties
│   │       │   ├── gradlew
│   │       │   ├── gradlew.bat
│   │       │   ├── README.txt
│   │       │   └── settings.gradle
│   │       ├── companionService
│   │       │   ├── app.js
│   │       │   ├── authentication.js
│   │       │   ├── bin
│   │       │   │   └── www
│   │       │   ├── config.js
│   │       │   ├── node_modules
│   │       │   │   ├── body-parser
│   │       │   │   │   ├── HISTORY.md
│   │       │   │   │   ├── index.js
│   │       │   │   │   ├── lib
│   │       │   │   │   │   ├── read.js
│   │       │   │   │   │   └── types
│   │       │   │   │   │       ├── json.js
│   │       │   │   │   │       ├── raw.js
│   │       │   │   │   │       ├── text.js
│   │       │   │   │   │       └── urlencoded.js
│   │       │   │   │   ├── LICENSE
│   │       │   │   │   ├── node_modules
│   │       │   │   │   │   ├── bytes
│   │       │   │   │   │   │   ├── component.json
│   │       │   │   │   │   │   ├── History.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── Makefile
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── Readme.md
│   │       │   │   │   │   ├── content-type
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── depd
│   │       │   │   │   │   │   ├── History.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── lib
│   │       │   │   │   │   │   │   └── compat
│   │       │   │   │   │   │   │       ├── buffer-concat.js
│   │       │   │   │   │   │   │       ├── callsite-tostring.js
│   │       │   │   │   │   │   │       └── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── Readme.md
│   │       │   │   │   │   ├── iconv-lite
│   │       │   │   │   │   │   ├── Changelog.md
│   │       │   │   │   │   │   ├── encodings
│   │       │   │   │   │   │   │   ├── dbcs-codec.js
│   │       │   │   │   │   │   │   ├── dbcs-data.js
│   │       │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   ├── internal.js
│   │       │   │   │   │   │   │   ├── sbcs-codec.js
│   │       │   │   │   │   │   │   ├── sbcs-data-generated.js
│   │       │   │   │   │   │   │   ├── sbcs-data.js
│   │       │   │   │   │   │   │   ├── tables
│   │       │   │   │   │   │   │   │   ├── big5-added.json
│   │       │   │   │   │   │   │   │   ├── cp936.json
│   │       │   │   │   │   │   │   │   ├── cp949.json
│   │       │   │   │   │   │   │   │   ├── cp950.json
│   │       │   │   │   │   │   │   │   ├── eucjp.json
│   │       │   │   │   │   │   │   │   ├── gb18030-ranges.json
│   │       │   │   │   │   │   │   │   ├── gbk-added.json
│   │       │   │   │   │   │   │   │   └── shiftjis.json
│   │       │   │   │   │   │   │   ├── utf16.js
│   │       │   │   │   │   │   │   └── utf7.js
│   │       │   │   │   │   │   ├── lib
│   │       │   │   │   │   │   │   ├── extend-node.js
│   │       │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   └── streams.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── on-finished
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   └── ee-first
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── qs
│   │       │   │   │   │   │   ├── CHANGELOG.md
│   │       │   │   │   │   │   ├── CONTRIBUTING.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── lib
│   │       │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   ├── parse.js
│   │       │   │   │   │   │   │   ├── stringify.js
│   │       │   │   │   │   │   │   └── utils.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── Makefile
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   ├── README.md
│   │       │   │   │   │   │   └── test
│   │       │   │   │   │   │       ├── parse.js
│   │       │   │   │   │   │       └── stringify.js
│   │       │   │   │   │   ├── raw-body
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   └── bytes
│   │       │   │   │   │   │   │       ├── History.md
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── Readme.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   └── type-is
│   │       │   │   │   │       ├── HISTORY.md
│   │       │   │   │   │       ├── index.js
│   │       │   │   │   │       ├── LICENSE
│   │       │   │   │   │       ├── node_modules
│   │       │   │   │   │       │   ├── media-typer
│   │       │   │   │   │       │   │   ├── HISTORY.md
│   │       │   │   │   │       │   │   ├── index.js
│   │       │   │   │   │       │   │   ├── LICENSE
│   │       │   │   │   │       │   │   ├── package.json
│   │       │   │   │   │       │   │   └── README.md
│   │       │   │   │   │       │   └── mime-types
│   │       │   │   │   │       │       ├── HISTORY.md
│   │       │   │   │   │       │       ├── index.js
│   │       │   │   │   │       │       ├── LICENSE
│   │       │   │   │   │       │       ├── node_modules
│   │       │   │   │   │       │       │   └── mime-db
│   │       │   │   │   │       │       │       ├── db.json
│   │       │   │   │   │       │       │       ├── HISTORY.md
│   │       │   │   │   │       │       │       ├── index.js
│   │       │   │   │   │       │       │       ├── LICENSE
│   │       │   │   │   │       │       │       ├── package.json
│   │       │   │   │   │       │       │       └── README.md
│   │       │   │   │   │       │       ├── package.json
│   │       │   │   │   │       │       └── README.md
│   │       │   │   │   │       ├── package.json
│   │       │   │   │   │       └── README.md
│   │       │   │   │   ├── package.json
│   │       │   │   │   └── README.md
│   │       │   │   ├── debug
│   │       │   │   │   ├── bower.json
│   │       │   │   │   ├── browser.js
│   │       │   │   │   ├── component.json
│   │       │   │   │   ├── debug.js
│   │       │   │   │   ├── History.md
│   │       │   │   │   ├── Makefile
│   │       │   │   │   ├── node.js
│   │       │   │   │   ├── node_modules
│   │       │   │   │   │   └── ms
│   │       │   │   │   │       ├── History.md
│   │       │   │   │   │       ├── index.js
│   │       │   │   │   │       ├── LICENSE
│   │       │   │   │   │       ├── package.json
│   │       │   │   │   │       └── README.md
│   │       │   │   │   ├── package.json
│   │       │   │   │   └── Readme.md
│   │       │   │   ├── express
│   │       │   │   │   ├── History.md
│   │       │   │   │   ├── index.js
│   │       │   │   │   ├── lib
│   │       │   │   │   │   ├── application.js
│   │       │   │   │   │   ├── express.js
│   │       │   │   │   │   ├── middleware
│   │       │   │   │   │   │   ├── init.js
│   │       │   │   │   │   │   └── query.js
│   │       │   │   │   │   ├── request.js
│   │       │   │   │   │   ├── response.js
│   │       │   │   │   │   ├── router
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── layer.js
│   │       │   │   │   │   │   └── route.js
│   │       │   │   │   │   ├── utils.js
│   │       │   │   │   │   └── view.js
│   │       │   │   │   ├── LICENSE
│   │       │   │   │   ├── node_modules
│   │       │   │   │   │   ├── accepts
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   ├── mime-types
│   │       │   │   │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   │   │   └── mime-db
│   │       │   │   │   │   │   │   │   │       ├── db.json
│   │       │   │   │   │   │   │   │   │       ├── HISTORY.md
│   │       │   │   │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   │   │   └── README.md
│   │       │   │   │   │   │   │   └── negotiator
│   │       │   │   │   │   │   │       ├── HISTORY.md
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── lib
│   │       │   │   │   │   │   │       │   ├── charset.js
│   │       │   │   │   │   │   │       │   ├── encoding.js
│   │       │   │   │   │   │   │       │   ├── language.js
│   │       │   │   │   │   │   │       │   └── mediaType.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── content-disposition
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── content-type
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── cookie
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── cookie-signature
│   │       │   │   │   │   │   ├── History.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── Readme.md
│   │       │   │   │   │   ├── depd
│   │       │   │   │   │   │   ├── History.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── lib
│   │       │   │   │   │   │   │   └── compat
│   │       │   │   │   │   │   │       ├── buffer-concat.js
│   │       │   │   │   │   │   │       ├── callsite-tostring.js
│   │       │   │   │   │   │   │       └── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── Readme.md
│   │       │   │   │   │   ├── escape-html
│   │       │   │   │   │   │   ├── component.json
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── Makefile
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── Readme.md
│   │       │   │   │   │   ├── etag
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   └── crc
│   │       │   │   │   │   │   │       ├── lib
│   │       │   │   │   │   │   │       │   ├── crc16_ccitt.js
│   │       │   │   │   │   │   │       │   ├── crc16.js
│   │       │   │   │   │   │   │       │   ├── crc16_modbus.js
│   │       │   │   │   │   │   │       │   ├── crc1.js
│   │       │   │   │   │   │   │       │   ├── crc24.js
│   │       │   │   │   │   │   │       │   ├── crc32.js
│   │       │   │   │   │   │   │       │   ├── crc8_1wire.js
│   │       │   │   │   │   │   │       │   ├── crc8.js
│   │       │   │   │   │   │   │       │   ├── crc.js
│   │       │   │   │   │   │   │       │   ├── create.js
│   │       │   │   │   │   │   │       │   ├── hex.js
│   │       │   │   │   │   │   │       │   └── index.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── finalhandler
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── fresh
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── merge-descriptors
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── methods
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── on-finished
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   └── ee-first
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── parseurl
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── path-to-regexp
│   │       │   │   │   │   │   ├── component.json
│   │       │   │   │   │   │   ├── History.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   ├── Readme.md
│   │       │   │   │   │   │   └── test.js
│   │       │   │   │   │   ├── proxy-addr
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   ├── forwarded
│   │       │   │   │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   │   │   └── README.md
│   │       │   │   │   │   │   │   └── ipaddr.js
│   │       │   │   │   │   │   │       ├── bower.json
│   │       │   │   │   │   │   │       ├── Cakefile
│   │       │   │   │   │   │   │       ├── ipaddr.min.js
│   │       │   │   │   │   │   │       ├── lib
│   │       │   │   │   │   │   │       │   └── ipaddr.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       ├── README.md
│   │       │   │   │   │   │   │       ├── src
│   │       │   │   │   │   │   │       │   └── ipaddr.coffee
│   │       │   │   │   │   │   │       └── test
│   │       │   │   │   │   │   │           └── ipaddr.test.coffee
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── qs
│   │       │   │   │   │   │   ├── CHANGELOG.md
│   │       │   │   │   │   │   ├── CONTRIBUTING.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── lib
│   │       │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   ├── parse.js
│   │       │   │   │   │   │   │   ├── stringify.js
│   │       │   │   │   │   │   │   └── utils.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── Makefile
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   ├── README.md
│   │       │   │   │   │   │   └── test
│   │       │   │   │   │   │       ├── parse.js
│   │       │   │   │   │   │       └── stringify.js
│   │       │   │   │   │   ├── range-parser
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── send
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   ├── destroy
│   │       │   │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   │   │   └── README.md
│   │       │   │   │   │   │   │   ├── mime
│   │       │   │   │   │   │   │   │   ├── build
│   │       │   │   │   │   │   │   │   │   ├── build.js
│   │       │   │   │   │   │   │   │   │   └── test.js
│   │       │   │   │   │   │   │   │   ├── cli.js
│   │       │   │   │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   │   │   ├── mime.js
│   │       │   │   │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   │   │   ├── README.md
│   │       │   │   │   │   │   │   │   └── types.json
│   │       │   │   │   │   │   │   └── ms
│   │       │   │   │   │   │   │       ├── History.md
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── serve-static
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── type-is
│   │       │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── node_modules
│   │       │   │   │   │   │   │   ├── media-typer
│   │       │   │   │   │   │   │   │   ├── HISTORY.md
│   │       │   │   │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   │   │   └── README.md
│   │       │   │   │   │   │   │   └── mime-types
│   │       │   │   │   │   │   │       ├── HISTORY.md
│   │       │   │   │   │   │   │       ├── index.js
│   │       │   │   │   │   │   │       ├── LICENSE
│   │       │   │   │   │   │   │       ├── node_modules
│   │       │   │   │   │   │   │       │   └── mime-db
│   │       │   │   │   │   │   │       │       ├── db.json
│   │       │   │   │   │   │   │       │       ├── HISTORY.md
│   │       │   │   │   │   │   │       │       ├── index.js
│   │       │   │   │   │   │   │       │       ├── LICENSE
│   │       │   │   │   │   │   │       │       ├── package.json
│   │       │   │   │   │   │   │       │       └── README.md
│   │       │   │   │   │   │   │       ├── package.json
│   │       │   │   │   │   │   │       └── README.md
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   ├── utils-merge
│   │       │   │   │   │   │   ├── index.js
│   │       │   │   │   │   │   ├── LICENSE
│   │       │   │   │   │   │   ├── package.json
│   │       │   │   │   │   │   └── README.md
│   │       │   │   │   │   └── vary
│   │       │   │   │   │       ├── HISTORY.md
│   │       │   │   │   │       ├── index.js
│   │       │   │   │   │       ├── LICENSE
│   │       │   │   │   │       ├── package.json
│   │       │   │   │   │       └── README.md
│   │       │   │   │   ├── package.json
│   │       │   │   │   └── Readme.md
│   │       │   │   └── node-uuid
│   │       │   │       ├── benchmark
│   │       │   │       │   ├── bench.gnu
│   │       │   │       │   ├── benchmark.js
│   │       │   │       │   ├── benchmark-native.c
│   │       │   │       │   ├── bench.sh
│   │       │   │       │   └── README.md
│   │       │   │       ├── component.json
│   │       │   │       ├── LICENSE.md
│   │       │   │       ├── package.json
│   │       │   │       ├── README.md
│   │       │   │       ├── test
│   │       │   │       │   ├── compare_v1.js
│   │       │   │       │   ├── test.html
│   │       │   │       │   └── test.js
│   │       │   │       └── uuid.js
│   │       │   ├── package.json
│   │       │   └── template_config_js
│   │       ├── iOSCompanionApp
│   │       │   ├── AlexaCompanionAppSample.xcodeproj
│   │       │   │   └── project.pbxproj
│   │       │   ├── Application
│   │       │   │   ├── AlexaCompanionAppSample-Info.plist
│   │       │   │   ├── AlexaCompanionAppSample-Prefix.pch
│   │       │   │   ├── AVSApplicationDelegate.h
│   │       │   │   ├── AVSApplicationDelegate.m
│   │       │   │   ├── AVSDeviceResponse.h
│   │       │   │   ├── AVSDeviceResponse.m
│   │       │   │   ├── btnLWA_gold_209x48.png
│   │       │   │   ├── btnLWA_gold_209x48_pressed.png
│   │       │   │   ├── en.lproj
│   │       │   │   │   ├── InfoPlist.strings
│   │       │   │   │   ├── MainStoryboard_iPad.storyboard
│   │       │   │   │   └── MainStoryboard_iPhone.storyboard
│   │       │   │   ├── LoginController.h
│   │       │   │   ├── LoginController.m
│   │       │   │   ├── main.m
│   │       │   │   ├── ProvisioningClient.h
│   │       │   │   └── ProvisioningClient.m
│   │       │   ├── btnLWA_gold_68x72.png
│   │       │   ├── btnLWA_Gold_94x96.png
│   │       │   ├── LoginWithAmazon.framework
│   │       │   │   ├── Headers
│   │       │   │   │   ├── AIAuthenticationDelegate.h
│   │       │   │   │   ├── AIError.h
│   │       │   │   │   ├── AIMobileLib.h
│   │       │   │   │   ├── AMZNAuthorizationManager.h
│   │       │   │   │   ├── AMZNAuthorizeRequest.h
│   │       │   │   │   ├── AMZNAuthorizeResult.h
│   │       │   │   │   ├── AMZNLWASDKInfo.h
│   │       │   │   │   ├── AMZNProfileScope.h
│   │       │   │   │   ├── AMZNScopeFactory.h
│   │       │   │   │   ├── AMZNScope.h
│   │       │   │   │   ├── AMZNUser.h
│   │       │   │   │   └── LoginWithAmazon.h
│   │       │   │   ├── LoginWithAmazon
│   │       │   │   ├── Modules
│   │       │   │   │   └── module.modulemap
│   │       │   │   └── Versions
│   │       │   │       ├── A
│   │       │   │       │   ├── Headers
│   │       │   │       │   │   ├── AIAuthenticationDelegate.h
│   │       │   │       │   │   ├── AIError.h
│   │       │   │       │   │   ├── AIMobileLib.h
│   │       │   │       │   │   ├── AMZNAuthorizationManager.h
│   │       │   │       │   │   ├── AMZNAuthorizeRequest.h
│   │       │   │       │   │   ├── AMZNAuthorizeResult.h
│   │       │   │       │   │   ├── AMZNLWASDKInfo.h
│   │       │   │       │   │   ├── AMZNProfileScope.h
│   │       │   │       │   │   ├── AMZNScopeFactory.h
│   │       │   │       │   │   ├── AMZNScope.h
│   │       │   │       │   │   ├── AMZNUser.h
│   │       │   │       │   │   └── LoginWithAmazon.h
│   │       │   │       │   └── LoginWithAmazon
│   │       │   │       └── Current
│   │       │   │           ├── Headers
│   │       │   │           │   ├── AIAuthenticationDelegate.h
│   │       │   │           │   ├── AIError.h
│   │       │   │           │   ├── AIMobileLib.h
│   │       │   │           │   ├── AMZNAuthorizationManager.h
│   │       │   │           │   ├── AMZNAuthorizeRequest.h
│   │       │   │           │   ├── AMZNAuthorizeResult.h
│   │       │   │           │   ├── AMZNLWASDKInfo.h
│   │       │   │           │   ├── AMZNProfileScope.h
│   │       │   │           │   ├── AMZNScopeFactory.h
│   │       │   │           │   ├── AMZNScope.h
│   │       │   │           │   ├── AMZNUser.h
│   │       │   │           │   └── LoginWithAmazon.h
│   │       │   │           └── LoginWithAmazon
│   │       │   └── Resources
│   │       │       ├── App
│   │       │       │   ├── btnLWA_gold_157x36.png
│   │       │       │   ├── btnLWA_gold_157x36_pressed.png
│   │       │       │   ├── btnLWA_gold_209x48.png
│   │       │       │   ├── btnLWA_gold_209x48_pressed.png
│   │       │       │   ├── btnLWA_gold_314x72.png
│   │       │       │   ├── btnLWA_gold_314x72_pressed.png
│   │       │       │   ├── ca.der
│   │       │       │   └── Default-568h@2x.png
│   │       │       └── iOS
│   │       │           ├── 32dp
│   │       │           │   ├── 1x
│   │       │           │   │   ├── btnLWA_drkgry_157x36.png
│   │       │           │   │   ├── btnLWA_drkgry_157x36_pressed.png
│   │       │           │   │   ├── btnLWA_Drkgry_34x36.png
│   │       │           │   │   ├── btnLWA_Drkgry_34x36_Pressed.png
│   │       │           │   │   ├── btnLWA_Drkgry_77x36.png
│   │       │           │   │   ├── btnLWA_Drkgry_77x36_Pressed.png
│   │       │           │   │   ├── btnLWA_gold_157x36.png
│   │       │           │   │   ├── btnLWA_gold_157x36_pressed.png
│   │       │           │   │   ├── btnLWA_Gold_34x36.png
│   │       │           │   │   ├── btnLWA_Gold_34x36_Pressed.png
│   │       │           │   │   ├── btnLWA_Gold_77x36.png
│   │       │           │   │   ├── btnLWA_Gold_77x36_Pressed.png
│   │       │           │   │   ├── btnLWA_gry_157x36.png
│   │       │           │   │   ├── btnLWA_gry_157x36_pressed.png
│   │       │           │   │   ├── btnLWA_Gry_34x36.png
│   │       │           │   │   ├── btnLWA_Gry_34x36_Pressed.png
│   │       │           │   │   ├── btnLWA_Gry_77x36.png
│   │       │           │   │   └── btnLWA_Gry_77x36_Pressed.png
│   │       │           │   └── 2x
│   │       │           │       ├── btnLWA_drkgray_157x36@2x.png
│   │       │           │       ├── btnLWA_drkgray_157x36_pressed@2x.png
│   │       │           │       ├── btnLWA_drkgry_34x36@2x.png
│   │       │           │       ├── btnLWA_drkgry_34x36_pressed@2x.png
│   │       │           │       ├── btnLWA_Drkgry_77x36@2x.png
│   │       │           │       ├── btnLWA_Drkgry_77x36_Pressed@2x.png
│   │       │           │       ├── btnLWA_gold_157x36@2x.png
│   │       │           │       ├── btnLWA_gold_157x36_pressed@2x.png
│   │       │           │       ├── btnLWA_gold_34x36@2x.png
│   │       │           │       ├── btnLWA_gold_34x36_pressed@2x.png
│   │       │           │       ├── btnLWA_Gold_77x36@2x.png
│   │       │           │       ├── btnLWA_Gold_77x36_Pressed@2x.png
│   │       │           │       ├── btnLWA_gry_157x36@2x.png
│   │       │           │       ├── btnLWA_gry_157x36_pressed@2x.png
│   │       │           │       ├── btnLWA_gry_34x36@2x.png
│   │       │           │       ├── btnLWA_gry_34x36_pressed@2x.png
│   │       │           │       ├── btnLWA_Gry_77x36@2x.png
│   │       │           │       └── btnLWA_Gry_77x36_Pressed@2x.png
│   │       │           └── 44dp
│   │       │               ├── 1x
│   │       │               │   ├── btnLWA_Drkgry_102x48.png
│   │       │               │   ├── btnLWA_Drkgry_102x48_Pressed.png
│   │       │               │   ├── btnLWA_drkgry_209x48.png
│   │       │               │   ├── btnLWA_drkgry_209x48_pressed.png
│   │       │               │   ├── btnLWA_Drkgry_46x48.png
│   │       │               │   ├── btnLWA_Drkgry_46x48_Pressed.png
│   │       │               │   ├── btnLWA_Gold_102x48.png
│   │       │               │   ├── btnLWA_Gold_102x48_Pressed.png
│   │       │               │   ├── btnLWA_Gold_46x48.png
│   │       │               │   ├── btnLWA_Gold_46x48_Pressed.png
│   │       │               │   ├── btnLWA_Gry_102x48.png
│   │       │               │   ├── btnLWA_Gry_102x48_Pressed.png
│   │       │               │   ├── btnLWA_gry_209x48.png
│   │       │               │   ├── btnLWA_gry_209x48_pressed.png
│   │       │               │   ├── btnLWA_Gry_46x48.png
│   │       │               │   └── btnLWA_Gry_46x48_Pressed.png
│   │       │               └── 2x
│   │       │                   ├── btnLWA_Drkgry_102x48@2x.png
│   │       │                   ├── btnLWA_Drkgry_102x48_Pressed@2x.png
│   │       │                   ├── btnLWA_drkgry_209x48@2x.png
│   │       │                   ├── btnLWA_drkgry_209x48_pressed@2x.png
│   │       │                   ├── btnLWA_Drkgry_46x48@2x.png
│   │       │                   ├── btnLWA_Drkgry_46x48_Pressed@2x.png
│   │       │                   ├── btnLWA_Gold_102x48@2x.png
│   │       │                   ├── btnLWA_Gold_102x48_Pressed@2x.png
│   │       │                   ├── btnLWA_gold_209x48@2x.png
│   │       │                   ├── btnLWA_gold_209x48_pressed@2x.png
│   │       │                   ├── btnLWA_Gold_46x48@2x.png
│   │       │                   ├── btnLWA_Gold_46x48_Pressed@2x.png
│   │       │                   ├── btnLWA_Gry_102x486@2x.png
│   │       │                   ├── btnLWA_Gry_102x48_Pressed@2x.png
│   │       │                   ├── btnLWA_gry_209x48@2x.png
│   │       │                   ├── btnLWA_gry_209x48_pressed@2x.png
│   │       │                   ├── btnLWA_Gry_46x48@2x.png
│   │       │                   └── btnLWA_Gry_46x48_Pressed@2x.png
│   │       ├── javaclient
│   │       │   ├── alarms.json
│   │       │   ├── certs
│   │       │   │   ├── ca
│   │       │   │   │   ├── ca.crt
│   │       │   │   │   ├── ca.der
│   │       │   │   │   └── ca.key
│   │       │   │   ├── client
│   │       │   │   │   ├── client.crt
│   │       │   │   │   ├── client.csr
│   │       │   │   │   ├── client.key
│   │       │   │   │   └── client.pkcs12
│   │       │   │   └── server
│   │       │   │       ├── jetty.crt
│   │       │   │       ├── jetty.csr
│   │       │   │       ├── jetty.key
│   │       │   │       ├── jetty.pkcs12
│   │       │   │       ├── node.crt
│   │       │   │       ├── node.csr
│   │       │   │       └── node.key
│   │       │   ├── config.json
│   │       │   ├── generate.bat
│   │       │   ├── generate.sh
│   │       │   ├── install-java8.sh
│   │       │   ├── log4j2.xml
│   │       │   ├── logs
│   │       │   │   ├── application-2017-02-25-1.log
│   │       │   │   ├── application-2017-02-26-1.log
│   │       │   │   ├── application-2017-02-27-1.log
│   │       │   │   ├── application-2017-03-02-1.log
│   │       │   │   ├── application-2017-03-30-1.log
│   │       │   │   ├── application-2017-04-07-1.log
│   │       │   │   ├── application-2017-04-15-1.log
│   │       │   │   ├── application-2017-04-16-1.log
│   │       │   │   └── application.log
│   │       │   ├── pom_other.xml
│   │       │   ├── pom_pi.xml
│   │       │   ├── pom.xml
│   │       │   ├── README.txt
│   │       │   ├── src
│   │       │   │   └── main
│   │       │   │       ├── java
│   │       │   │       │   └── com
│   │       │   │       │       └── amazon
│   │       │   │       │           └── alexa
│   │       │   │       │               └── avs
│   │       │   │       │                   ├── AlertEventListener.java
│   │       │   │       │                   ├── AlertHandler.java
│   │       │   │       │                   ├── Alert.java
│   │       │   │       │                   ├── AlertManagerFactory.java
│   │       │   │       │                   ├── AlertManager.java
│   │       │   │       │                   ├── AlertScheduler.java
│   │       │   │       │                   ├── AlertsDataStore.java
│   │       │   │       │                   ├── AlertsFileDataStore.java
│   │       │   │       │                   ├── AudioCapture.java
│   │       │   │       │                   ├── AudioInputFormat.java
│   │       │   │       │                   ├── AudioPlayerActivity.java
│   │       │   │       │                   ├── AudioPlayerEventPayload.java
│   │       │   │       │                   ├── AudioPlayerProgressReporter.java
│   │       │   │       │                   ├── AudioPlayerStateMachine.java
│   │       │   │       │                   ├── AudioPlayerTimer.java
│   │       │   │       │                   ├── AudioStateOutputStream.java
│   │       │   │       │                   ├── auth
│   │       │   │       │                   │   ├── AccessTokenListener.java
│   │       │   │       │                   │   ├── AuthConstants.java
│   │       │   │       │                   │   ├── AuthSetup.java
│   │       │   │       │                   │   ├── companionapp
│   │       │   │       │                   │   │   ├── CodeChallengeWorkflow.java
│   │       │   │       │                   │   │   ├── CompanionAppAuthManager.java
│   │       │   │       │                   │   │   ├── CompanionAppProvisioningInfo.java
│   │       │   │       │                   │   │   ├── DeviceProvisioningInfo.java
│   │       │   │       │                   │   │   ├── LWAException.java
│   │       │   │       │                   │   │   ├── OAuth2ClientForPkce.java
│   │       │   │       │                   │   │   ├── OAuth2TokensForPkce.java
│   │       │   │       │                   │   │   └── server
│   │       │   │       │                   │   │       ├── CompanionAppProvisioningServer.java
│   │       │   │       │                   │   │       ├── CompanionInfoHandler.java
│   │       │   │       │                   │   │       └── DeviceInfoHandler.java
│   │       │   │       │                   │   ├── companionservice
│   │       │   │       │                   │   │   ├── CompanionServiceAuthManager.java
│   │       │   │       │                   │   │   ├── CompanionServiceClient.java
│   │       │   │       │                   │   │   ├── CompanionServiceRegCodeResponse.java
│   │       │   │       │                   │   │   └── RegCodeDisplayHandler.java
│   │       │   │       │                   │   ├── MissingParameterException.java
│   │       │   │       │                   │   └── OAuth2AccessToken.java
│   │       │   │       │                   ├── AVSAPIConstants.java
│   │       │   │       │                   ├── AVSApp.java
│   │       │   │       │                   ├── AVSAudioPlayerFactory.java
│   │       │   │       │                   ├── AVSAudioPlayer.java
│   │       │   │       │                   ├── AVSController.java
│   │       │   │       │                   ├── AVSRequest.java
│   │       │   │       │                   ├── BlockableDirectiveThread.java
│   │       │   │       │                   ├── config
│   │       │   │       │                   │   ├── DeviceConfig.java
│   │       │   │       │                   │   ├── DeviceConfigUtils.java
│   │       │   │       │                   │   └── ObjectMapperFactory.java
│   │       │   │       │                   ├── DateUtils.java
│   │       │   │       │                   ├── DialogRequestIdAuthority.java
│   │       │   │       │                   ├── DirectiveDispatcher.java
│   │       │   │       │                   ├── DirectiveEnqueuer.java
│   │       │   │       │                   ├── exception
│   │       │   │       │                   │   ├── AlexaSystemExceptionCode.java
│   │       │   │       │                   │   ├── AlexaSystemException.java
│   │       │   │       │                   │   ├── AVSException.java
│   │       │   │       │                   │   ├── AVSJsonProcessingException.java
│   │       │   │       │                   │   └── DirectiveHandlingException.java
│   │       │   │       │                   ├── ExpectSpeechListener.java
│   │       │   │       │                   ├── ExpectStopCaptureListener.java
│   │       │   │       │                   ├── http
│   │       │   │       │                   │   ├── AbstractRetryPolicy.java
│   │       │   │       │                   │   ├── AudioInputStreamContentProvider.java
│   │       │   │       │                   │   ├── AVSClientFactory.java
│   │       │   │       │                   │   ├── AVSClient.java
│   │       │   │       │                   │   ├── CachingContentProvider.java
│   │       │   │       │                   │   ├── ContentTypes.java
│   │       │   │       │                   │   ├── ExponentialRetryPolicy.java
│   │       │   │       │                   │   ├── HttpHeaders.java
│   │       │   │       │                   │   ├── jetty
│   │       │   │       │                   │   │   ├── InputStreamResponseListener.java
│   │       │   │       │                   │   │   └── PingSendingHttpClientTransportOverHTTP2.java
│   │       │   │       │                   │   ├── LinearRetryPolicy.java
│   │       │   │       │                   │   ├── MessageParser.java
│   │       │   │       │                   │   ├── MultipartContentProvider.java
│   │       │   │       │                   │   ├── MultipartParser.java
│   │       │   │       │                   │   ├── ParsingFailedHandler.java
│   │       │   │       │                   │   └── RetryPolicy.java
│   │       │   │       │                   ├── message
│   │       │   │       │                   │   ├── DialogRequestIdHeader.java
│   │       │   │       │                   │   ├── Header.java
│   │       │   │       │                   │   ├── MessageIdHeader.java
│   │       │   │       │                   │   ├── Message.java
│   │       │   │       │                   │   ├── Payload.java
│   │       │   │       │                   │   ├── request
│   │       │   │       │                   │   │   ├── alerts
│   │       │   │       │                   │   │   │   └── AlertPayload.java
│   │       │   │       │                   │   │   ├── audioplayer
│   │       │   │       │                   │   │   │   ├── AudioPlayerPayload.java
│   │       │   │       │                   │   │   │   ├── PlaybackFailedPayload.java
│   │       │   │       │                   │   │   │   ├── PlaybackNearlyFinishedPayload.java
│   │       │   │       │                   │   │   │   └── PlaybackStutterFinishedPayload.java
│   │       │   │       │                   │   │   ├── ComponentStateFactory.java
│   │       │   │       │                   │   │   ├── context
│   │       │   │       │                   │   │   │   ├── AlertsStatePayload.java
│   │       │   │       │                   │   │   │   ├── ComponentState.java
│   │       │   │       │                   │   │   │   ├── PlaybackStatePayload.java
│   │       │   │       │                   │   │   │   ├── SpeechStatePayload.java
│   │       │   │       │                   │   │   │   └── VolumeStatePayload.java
│   │       │   │       │                   │   │   ├── ContextEventRequestBody.java
│   │       │   │       │                   │   │   ├── Event.java
│   │       │   │       │                   │   │   ├── RequestBody.java
│   │       │   │       │                   │   │   ├── RequestFactory.java
│   │       │   │       │                   │   │   ├── settings
│   │       │   │       │                   │   │   │   ├── LocaleSetting.java
│   │       │   │       │                   │   │   │   ├── Setting.java
│   │       │   │       │                   │   │   │   └── SettingsUpdatedPayload.java
│   │       │   │       │                   │   │   ├── speechrecognizer
│   │       │   │       │                   │   │   │   └── SpeechRecognizerPayload.java
│   │       │   │       │                   │   │   ├── speechsynthesizer
│   │       │   │       │                   │   │   │   └── SpeechLifecyclePayload.java
│   │       │   │       │                   │   │   └── system
│   │       │   │       │                   │   │       ├── ExceptionEncounteredPayload.java
│   │       │   │       │                   │   │       └── UserInactivityReportPayload.java
│   │       │   │       │                   │   └── response
│   │       │   │       │                   │       ├── alerts
│   │       │   │       │                   │       │   ├── DeleteAlert.java
│   │       │   │       │                   │       │   └── SetAlert.java
│   │       │   │       │                   │       ├── AlexaExceptionResponse.java
│   │       │   │       │                   │       ├── AttachedContentPayload.java
│   │       │   │       │                   │       ├── audioplayer
│   │       │   │       │                   │       │   ├── AudioItem.java
│   │       │   │       │                   │       │   ├── ClearQueue.java
│   │       │   │       │                   │       │   ├── Play.java
│   │       │   │       │                   │       │   ├── Stop.java
│   │       │   │       │                   │       │   └── Stream.java
│   │       │   │       │                   │       ├── Directive.java
│   │       │   │       │                   │       ├── ProgressReport.java
│   │       │   │       │                   │       ├── ResponseBody.java
│   │       │   │       │                   │       ├── speaker
│   │       │   │       │                   │       │   ├── AdjustVolume.java
│   │       │   │       │                   │       │   ├── SetMute.java
│   │       │   │       │                   │       │   ├── SetVolume.java
│   │       │   │       │                   │       │   └── VolumePayload.java
│   │       │   │       │                   │       ├── speechrecognizer
│   │       │   │       │                   │       │   └── Listen.java
│   │       │   │       │                   │       ├── speechsynthesizer
│   │       │   │       │                   │       │   ├── ExpectSpeech.java
│   │       │   │       │                   │       │   └── Speak.java
│   │       │   │       │                   │       └── system
│   │       │   │       │                   │           ├── Exception.java
│   │       │   │       │                   │           └── SetEndpoint.java
│   │       │   │       │                   ├── MicrophoneLineFactory.java
│   │       │   │       │                   ├── PlaybackAction.java
│   │       │   │       │                   ├── RecordingRMSListener.java
│   │       │   │       │                   ├── RecordingStateListener.java
│   │       │   │       │                   ├── RequestListener.java
│   │       │   │       │                   ├── SimpleStateChangeTransition.java
│   │       │   │       │                   ├── SpeakItem.java
│   │       │   │       │                   ├── SpeechProfile.java
│   │       │   │       │                   ├── SpeechRequestAudioPlayerPauseController.java
│   │       │   │       │                   ├── State.java
│   │       │   │       │                   ├── StateTransition.java
│   │       │   │       │                   ├── UserActivityListener.java
│   │       │   │       │                   └── wakeword
│   │       │   │       │                       ├── NewWakeWordReadyInterface.java
│   │       │   │       │                       ├── WakeWordDetectedHandler.java
│   │       │   │       │                       ├── WakeWordIPCConnectedClient.java
│   │       │   │       │                       ├── WakeWordIPCFactory.java
│   │       │   │       │                       ├── WakeWordIPC.java
│   │       │   │       │                       └── WakeWordIPCSocket.java
│   │       │   │       └── resources
│   │       │   │           └── res
│   │       │   │               ├── alarm.mp3
│   │       │   │               ├── error.mp3
│   │       │   │               ├── README.txt
│   │       │   │               ├── start.mp3
│   │       │   │               ├── stop.mp3
│   │       │   │               └── version.properties
│   │       │   ├── ssl.cnf
│   │       │   ├── target
│   │       │   │   ├── classes
│   │       │   │   │   ├── com
│   │       │   │   │   │   └── amazon
│   │       │   │   │   │       └── alexa
│   │       │   │   │   │           └── avs
│   │       │   │   │   │               ├── Alert.class
│   │       │   │   │   │               ├── AlertEventListener.class
│   │       │   │   │   │               ├── AlertHandler.class
│   │       │   │   │   │               ├── AlertManager$1.class
│   │       │   │   │   │               ├── AlertManager$2.class
│   │       │   │   │   │               ├── AlertManager.class
│   │       │   │   │   │               ├── AlertManagerFactory.class
│   │       │   │   │   │               ├── AlertManager$ResultListener.class
│   │       │   │   │   │               ├── AlertScheduler$1.class
│   │       │   │   │   │               ├── AlertScheduler.class
│   │       │   │   │   │               ├── AlertsDataStore.class
│   │       │   │   │   │               ├── AlertsFileDataStore$1$1.class
│   │       │   │   │   │               ├── AlertsFileDataStore$1.class
│   │       │   │   │   │               ├── AlertsFileDataStore$2.class
│   │       │   │   │   │               ├── AlertsFileDataStore.class
│   │       │   │   │   │               ├── Alert$ZonedDateTimeSerializer.class
│   │       │   │   │   │               ├── AudioCapture$AudioBufferThread.class
│   │       │   │   │   │               ├── AudioCapture.class
│   │       │   │   │   │               ├── AudioInputFormat.class
│   │       │   │   │   │               ├── AudioInputFormat$Constants.class
│   │       │   │   │   │               ├── AudioPlayerActivity.class
│   │       │   │   │   │               ├── AudioPlayerEventPayload.class
│   │       │   │   │   │               ├── AudioPlayerProgressReporter.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$AudioPlayerState.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$AudioPlayerStateTransition.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$ClearQueueAll.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$ClearQueueEnqueued.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$DelayProgressReport.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$IntervalProgressReport.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackFailed.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackFinished.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackNearlyFinished.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackPaused.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackResumed.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackStarted.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackStopped.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackStutterFinished.class
│   │       │   │   │   │               ├── AudioPlayerStateMachine$PlaybackStutterStarted.class
│   │       │   │   │   │               ├── AudioPlayerTimer.class
│   │       │   │   │   │               ├── AudioStateOutputStream.class
│   │       │   │   │   │               ├── auth
│   │       │   │   │   │               │   ├── AccessTokenListener.class
│   │       │   │   │   │               │   ├── AuthConstants.class
│   │       │   │   │   │               │   ├── AuthConstants$OAuth2.class
│   │       │   │   │   │               │   ├── AuthSetup$1.class
│   │       │   │   │   │               │   ├── AuthSetup$2.class
│   │       │   │   │   │               │   ├── AuthSetup.class
│   │       │   │   │   │               │   ├── companionapp
│   │       │   │   │   │               │   │   ├── CodeChallengeWorkflow.class
│   │       │   │   │   │               │   │   ├── CompanionAppAuthManager$1.class
│   │       │   │   │   │               │   │   ├── CompanionAppAuthManager.class
│   │       │   │   │   │               │   │   ├── CompanionAppAuthManager$InvalidSessionIdException.class
│   │       │   │   │   │               │   │   ├── CompanionAppAuthManager$RefreshTokenTimerTask.class
│   │       │   │   │   │               │   │   ├── CompanionAppProvisioningInfo.class
│   │       │   │   │   │               │   │   ├── DeviceProvisioningInfo.class
│   │       │   │   │   │               │   │   ├── LWAException.class
│   │       │   │   │   │               │   │   ├── OAuth2ClientForPkce.class
│   │       │   │   │   │               │   │   ├── OAuth2TokensForPkce.class
│   │       │   │   │   │               │   │   └── server
│   │       │   │   │   │               │   │       ├── CompanionAppProvisioningServer.class
│   │       │   │   │   │               │   │       ├── CompanionInfoHandler.class
│   │       │   │   │   │               │   │       └── DeviceInfoHandler.class
│   │       │   │   │   │               │   ├── companionservice
│   │       │   │   │   │               │   │   ├── CompanionServiceAuthManager$1.class
│   │       │   │   │   │               │   │   ├── CompanionServiceAuthManager.class
│   │       │   │   │   │               │   │   ├── CompanionServiceAuthManager$RefreshTokenTimerTask.class
│   │       │   │   │   │               │   │   ├── CompanionServiceClient.class
│   │       │   │   │   │               │   │   ├── CompanionServiceClient$RemoteServiceException.class
│   │       │   │   │   │               │   │   ├── CompanionServiceRegCodeResponse.class
│   │       │   │   │   │               │   │   └── RegCodeDisplayHandler.class
│   │       │   │   │   │               │   ├── MissingParameterException.class
│   │       │   │   │   │               │   └── OAuth2AccessToken.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Directives$DeleteAlert.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Directives$SetAlert.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$AlertEnteredBackground.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$AlertEnteredForeground.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$AlertsState.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$AlertStarted.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$AlertStopped.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$DeleteAlertFailed.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$DeleteAlertSucceeded.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$SetAlertFailed.class
│   │       │   │   │   │               ├── AVSAPIConstants$Alerts$Events$SetAlertSucceeded.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Directives$ClearQueue.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Directives$Play.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Directives$Stop.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackFailed.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackFinished.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackNearlyFinished.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackPaused.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackQueueCleared.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackResumed.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackStarted.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackState.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackStopped.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackStutterFinished.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$PlaybackStutterStarted.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$ProgressReportDelayElapsed.class
│   │       │   │   │   │               ├── AVSAPIConstants$AudioPlayer$Events$ProgressReportIntervalElapsed.class
│   │       │   │   │   │               ├── AVSAPIConstants.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController$Events$NextCommandIssued.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController$Events$PauseCommandIssued.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController$Events$PlayCommandIssued.class
│   │       │   │   │   │               ├── AVSAPIConstants$PlaybackController$Events$PreviousCommandIssued.class
│   │       │   │   │   │               ├── AVSAPIConstants$Settings.class
│   │       │   │   │   │               ├── AVSAPIConstants$Settings$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$Settings$Events$SettingsUpdated.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Directives$AdjustVolume.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Directives$SetMute.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Directives$SetVolume.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Events$MuteChanged.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Events$VolumeChanged.class
│   │       │   │   │   │               ├── AVSAPIConstants$Speaker$Events$VolumeState.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Directives$ExpectSpeech.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Directives$RequestProcessingStarted.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Directives$StopCapture.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Events$ExpectSpeechTimedOut.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechRecognizer$Events$Recognize.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Directives$Speak.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Events$SpeechFinished.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Events$SpeechStarted.class
│   │       │   │   │   │               ├── AVSAPIConstants$SpeechSynthesizer$Events$SpeechState.class
│   │       │   │   │   │               ├── AVSAPIConstants$System.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Directives.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Directives$ResetUserInactivity.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Directives$SetEndpoint.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Events.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Events$ExceptionEncountered.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Events$SynchronizeState.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Events$UserInactivityReport.class
│   │       │   │   │   │               ├── AVSAPIConstants$System$Exception.class
│   │       │   │   │   │               ├── AVSApp$1.class
│   │       │   │   │   │               ├── AVSApp$2.class
│   │       │   │   │   │               ├── AVSApp$3$1.class
│   │       │   │   │   │               ├── AVSApp$3.class
│   │       │   │   │   │               ├── AVSApp$4.class
│   │       │   │   │   │               ├── AVSApp$5.class
│   │       │   │   │   │               ├── AVSApp$6.class
│   │       │   │   │   │               ├── AVSApp$7.class
│   │       │   │   │   │               ├── AVSApp$ButtonState.class
│   │       │   │   │   │               ├── AVSApp.class
│   │       │   │   │   │               ├── AVSAudioPlayer$1.class
│   │       │   │   │   │               ├── AVSAudioPlayer$2.class
│   │       │   │   │   │               ├── AVSAudioPlayer$3.class
│   │       │   │   │   │               ├── AVSAudioPlayer$4.class
│   │       │   │   │   │               ├── AVSAudioPlayer$5.class
│   │       │   │   │   │               ├── AVSAudioPlayer$6.class
│   │       │   │   │   │               ├── AVSAudioPlayer$AlertState.class
│   │       │   │   │   │               ├── AVSAudioPlayer$AlexaSpeechListener.class
│   │       │   │   │   │               ├── AVSAudioPlayer.class
│   │       │   │   │   │               ├── AVSAudioPlayerFactory.class
│   │       │   │   │   │               ├── AVSAudioPlayer$ProgressReportDelayEventRunnable.class
│   │       │   │   │   │               ├── AVSAudioPlayer$ProgressReportIntervalEventRunnable.class
│   │       │   │   │   │               ├── AVSAudioPlayer$SpeechState.class
│   │       │   │   │   │               ├── AVSController$1.class
│   │       │   │   │   │               ├── AVSController$2.class
│   │       │   │   │   │               ├── AVSController$3.class
│   │       │   │   │   │               ├── AVSController$4.class
│   │       │   │   │   │               ├── AVSController.class
│   │       │   │   │   │               ├── AVSController$UserInactivityReport.class
│   │       │   │   │   │               ├── AVSRequest.class
│   │       │   │   │   │               ├── BlockableDirectiveThread.class
│   │       │   │   │   │               ├── config
│   │       │   │   │   │               │   ├── DeviceConfig.class
│   │       │   │   │   │               │   ├── DeviceConfig$CompanionAppInformation.class
│   │       │   │   │   │               │   ├── DeviceConfig$CompanionServiceInformation.class
│   │       │   │   │   │               │   ├── DeviceConfig$MalformedConfigException.class
│   │       │   │   │   │               │   ├── DeviceConfig$ProvisioningMethod.class
│   │       │   │   │   │               │   ├── DeviceConfigUtils.class
│   │       │   │   │   │               │   └── ObjectMapperFactory.class
│   │       │   │   │   │               ├── DateUtils.class
│   │       │   │   │   │               ├── DialogRequestIdAuthority.class
│   │       │   │   │   │               ├── DirectiveDispatcher.class
│   │       │   │   │   │               ├── DirectiveEnqueuer.class
│   │       │   │   │   │               ├── exception
│   │       │   │   │   │               │   ├── AlexaSystemException.class
│   │       │   │   │   │               │   ├── AlexaSystemExceptionCode.class
│   │       │   │   │   │               │   ├── AVSException.class
│   │       │   │   │   │               │   ├── AVSJsonProcessingException.class
│   │       │   │   │   │               │   ├── DirectiveHandlingException.class
│   │       │   │   │   │               │   └── DirectiveHandlingException$ExceptionType.class
│   │       │   │   │   │               ├── ExpectSpeechListener.class
│   │       │   │   │   │               ├── ExpectStopCaptureListener.class
│   │       │   │   │   │               ├── http
│   │       │   │   │   │               │   ├── AbstractRetryPolicy.class
│   │       │   │   │   │               │   ├── AudioInputStreamContentProvider.class
│   │       │   │   │   │               │   ├── AVSClient$1.class
│   │       │   │   │   │               │   ├── AVSClient$2.class
│   │       │   │   │   │               │   ├── AVSClient.class
│   │       │   │   │   │               │   ├── AVSClient$DownchannelRequestThread$1.class
│   │       │   │   │   │               │   ├── AVSClient$DownchannelRequestThread.class
│   │       │   │   │   │               │   ├── AVSClientFactory.class
│   │       │   │   │   │               │   ├── AVSClient$MalformedResponseException.class
│   │       │   │   │   │               │   ├── AVSClient$RequestException.class
│   │       │   │   │   │               │   ├── AVSClient$RequestThread.class
│   │       │   │   │   │               │   ├── AVSClient$Resource.class
│   │       │   │   │   │               │   ├── CachingContentProvider$CachingIterator.class
│   │       │   │   │   │               │   ├── CachingContentProvider.class
│   │       │   │   │   │               │   ├── ContentTypes.class
│   │       │   │   │   │               │   ├── ExponentialRetryPolicy.class
│   │       │   │   │   │               │   ├── HttpHeaders.class
│   │       │   │   │   │               │   ├── HttpHeaders$Parameters.class
│   │       │   │   │   │               │   ├── jetty
│   │       │   │   │   │               │   │   ├── InputStreamResponseListener$1.class
│   │       │   │   │   │               │   │   ├── InputStreamResponseListener.class
│   │       │   │   │   │               │   │   ├── InputStreamResponseListener$Input.class
│   │       │   │   │   │               │   │   ├── PingSendingHttpClientTransportOverHTTP2$1.class
│   │       │   │   │   │               │   │   ├── PingSendingHttpClientTransportOverHTTP2.class
│   │       │   │   │   │               │   │   ├── PingSendingHttpClientTransportOverHTTP2$ConnectionListener.class
│   │       │   │   │   │               │   │   ├── PingSendingHttpClientTransportOverHTTP2$ConnectionStatusHttpDestinationOverHTTP2.class
│   │       │   │   │   │               │   │   └── PingSendingHttpClientTransportOverHTTP2$ServerPing.class
│   │       │   │   │   │               │   ├── LinearRetryPolicy.class
│   │       │   │   │   │               │   ├── MessageParser.class
│   │       │   │   │   │               │   ├── MultipartContentProvider$1.class
│   │       │   │   │   │               │   ├── MultipartContentProvider.class
│   │       │   │   │   │               │   ├── MultipartContentProvider$IteratorOfIterators.class
│   │       │   │   │   │               │   ├── MultipartContentProvider$MultipartIterator.class
│   │       │   │   │   │               │   ├── MultipartContentProvider$PartContentProvider.class
│   │       │   │   │   │               │   ├── MultipartParser.class
│   │       │   │   │   │               │   ├── MultipartParser$MultipartParserConsumer.class
│   │       │   │   │   │               │   ├── ParsingFailedHandler.class
│   │       │   │   │   │               │   └── RetryPolicy.class
│   │       │   │   │   │               ├── message
│   │       │   │   │   │               │   ├── DialogRequestIdHeader.class
│   │       │   │   │   │               │   ├── Header.class
│   │       │   │   │   │               │   ├── Message.class
│   │       │   │   │   │               │   ├── MessageIdHeader.class
│   │       │   │   │   │               │   ├── Message$MessageDeserializer.class
│   │       │   │   │   │               │   ├── Payload.class
│   │       │   │   │   │               │   ├── request
│   │       │   │   │   │               │   │   ├── alerts
│   │       │   │   │   │               │   │   │   └── AlertPayload.class
│   │       │   │   │   │               │   │   ├── audioplayer
│   │       │   │   │   │               │   │   │   ├── AudioPlayerPayload.class
│   │       │   │   │   │               │   │   │   ├── PlaybackFailedPayload.class
│   │       │   │   │   │               │   │   │   ├── PlaybackFailedPayload$ErrorStructure.class
│   │       │   │   │   │               │   │   │   ├── PlaybackFailedPayload$ErrorType.class
│   │       │   │   │   │               │   │   │   ├── PlaybackNearlyFinishedPayload.class
│   │       │   │   │   │               │   │   │   └── PlaybackStutterFinishedPayload.class
│   │       │   │   │   │               │   │   ├── ComponentStateFactory.class
│   │       │   │   │   │               │   │   ├── context
│   │       │   │   │   │               │   │   │   ├── AlertsStatePayload.class
│   │       │   │   │   │               │   │   │   ├── ComponentState.class
│   │       │   │   │   │               │   │   │   ├── PlaybackStatePayload.class
│   │       │   │   │   │               │   │   │   ├── SpeechStatePayload.class
│   │       │   │   │   │               │   │   │   └── VolumeStatePayload.class
│   │       │   │   │   │               │   │   ├── ContextEventRequestBody.class
│   │       │   │   │   │               │   │   ├── Event.class
│   │       │   │   │   │               │   │   ├── RequestBody.class
│   │       │   │   │   │               │   │   ├── RequestFactory.class
│   │       │   │   │   │               │   │   ├── RequestFactory$Request.class
│   │       │   │   │   │               │   │   ├── settings
│   │       │   │   │   │               │   │   │   ├── LocaleSetting.class
│   │       │   │   │   │               │   │   │   ├── Setting.class
│   │       │   │   │   │               │   │   │   └── SettingsUpdatedPayload.class
│   │       │   │   │   │               │   │   ├── speechrecognizer
│   │       │   │   │   │               │   │   │   └── SpeechRecognizerPayload.class
│   │       │   │   │   │               │   │   ├── speechsynthesizer
│   │       │   │   │   │               │   │   │   └── SpeechLifecyclePayload.class
│   │       │   │   │   │               │   │   └── system
│   │       │   │   │   │               │   │       ├── ExceptionEncounteredPayload.class
│   │       │   │   │   │               │   │       ├── ExceptionEncounteredPayload$ErrorStructure.class
│   │       │   │   │   │               │   │       └── UserInactivityReportPayload.class
│   │       │   │   │   │               │   └── response
│   │       │   │   │   │               │       ├── alerts
│   │       │   │   │   │               │       │   ├── DeleteAlert.class
│   │       │   │   │   │               │       │   ├── SetAlert$AlertType.class
│   │       │   │   │   │               │       │   └── SetAlert.class
│   │       │   │   │   │               │       ├── AlexaExceptionResponse.class
│   │       │   │   │   │               │       ├── AttachedContentPayload.class
│   │       │   │   │   │               │       ├── audioplayer
│   │       │   │   │   │               │       │   ├── AudioItem.class
│   │       │   │   │   │               │       │   ├── ClearQueue.class
│   │       │   │   │   │               │       │   ├── ClearQueue$ClearBehavior.class
│   │       │   │   │   │               │       │   ├── Play.class
│   │       │   │   │   │               │       │   ├── Play$PlayBehavior.class
│   │       │   │   │   │               │       │   ├── Stop.class
│   │       │   │   │   │               │       │   └── Stream.class
│   │       │   │   │   │               │       ├── Directive.class
│   │       │   │   │   │               │       ├── ProgressReport.class
│   │       │   │   │   │               │       ├── ResponseBody.class
│   │       │   │   │   │               │       ├── speaker
│   │       │   │   │   │               │       │   ├── AdjustVolume.class
│   │       │   │   │   │               │       │   ├── SetMute.class
│   │       │   │   │   │               │       │   ├── SetVolume.class
│   │       │   │   │   │               │       │   └── VolumePayload.class
│   │       │   │   │   │               │       ├── speechrecognizer
│   │       │   │   │   │               │       │   └── Listen.class
│   │       │   │   │   │               │       ├── speechsynthesizer
│   │       │   │   │   │               │       │   ├── ExpectSpeech.class
│   │       │   │   │   │               │       │   └── Speak.class
│   │       │   │   │   │               │       └── system
│   │       │   │   │   │               │           ├── Exception.class
│   │       │   │   │   │               │           └── SetEndpoint.class
│   │       │   │   │   │               ├── MicrophoneLineFactory.class
│   │       │   │   │   │               ├── PlaybackAction.class
│   │       │   │   │   │               ├── RecordingRMSListener.class
│   │       │   │   │   │               ├── RecordingStateListener.class
│   │       │   │   │   │               ├── RequestListener.class
│   │       │   │   │   │               ├── SimpleStateChangeTransition.class
│   │       │   │   │   │               ├── SpeakItem.class
│   │       │   │   │   │               ├── SpeechProfile.class
│   │       │   │   │   │               ├── SpeechRequestAudioPlayerPauseController$1.class
│   │       │   │   │   │               ├── SpeechRequestAudioPlayerPauseController.class
│   │       │   │   │   │               ├── State.class
│   │       │   │   │   │               ├── StateTransition.class
│   │       │   │   │   │               ├── UserActivityListener.class
│   │       │   │   │   │               └── wakeword
│   │       │   │   │   │                   ├── NewWakeWordReadyInterface.class
│   │       │   │   │   │                   ├── WakeWordDetectedHandler.class
│   │       │   │   │   │                   ├── WakeWordIPC.class
│   │       │   │   │   │                   ├── WakeWordIPCConnectedClient.class
│   │       │   │   │   │                   ├── WakeWordIPCFactory.class
│   │       │   │   │   │                   ├── WakeWordIPC$IPCCommand.class
│   │       │   │   │   │                   ├── WakeWordIPCSocket$1.class
│   │       │   │   │   │                   └── WakeWordIPCSocket.class
│   │       │   │   │   └── res
│   │       │   │   │       ├── alarm.mp3
│   │       │   │   │       ├── error.mp3
│   │       │   │   │       ├── start.mp3
│   │       │   │   │       ├── stop.mp3
│   │       │   │   │       └── version.properties
│   │       │   │   ├── maven-archiver
│   │       │   │   │   └── pom.properties
│   │       │   │   ├── maven-status
│   │       │   │   │   └── maven-compiler-plugin
│   │       │   │   │       └── compile
│   │       │   │   │           └── default-compile
│   │       │   │   │               ├── createdFiles.lst
│   │       │   │   │               └── inputFiles.lst
│   │       │   │   └── sample-java-client-20160207.2.jar
│   │       │   ├── template_config_json
│   │       │   ├── template_generate_sh
│   │       │   └── template_ssl_cnf
│   │       └── wakeWordAgent
│   │           ├── ext
│   │           │   ├── include
│   │           │   │   ├── pa_ringbuffer.h
│   │           │   │   ├── pa_util.h
│   │           │   │   ├── portaudio.h
│   │           │   │   ├── snowboy-detect.h
│   │           │   │   └── snsr.h
│   │           │   ├── lib
│   │           │   │   ├── libportaudio.a
│   │           │   │   ├── libsnowboy-detect.a
│   │           │   │   └── libsnsr.a
│   │           │   └── resources
│   │           │       ├── alexa.umdl
│   │           │       ├── common.res
│   │           │       └── spot-alexa-rpi.snsr
│   │           ├── kitt_ai
│   │           │   └── snowboy
│   │           │       ├── binding.gyp
│   │           │       ├── examples
│   │           │       │   ├── C++
│   │           │       │   │   ├── demo
│   │           │       │   │   ├── demo.cc
│   │           │       │   │   ├── demo.mk
│   │           │       │   │   ├── install_portaudio.sh
│   │           │       │   │   ├── Makefile
│   │           │       │   │   ├── pa_stable_v19_20140130.tgz
│   │           │       │   │   ├── patches
│   │           │       │   │   │   └── portaudio.patch
│   │           │       │   │   └── portaudio
│   │           │       │   │       ├── aclocal.m4
│   │           │       │   │       ├── bin
│   │           │       │   │       │   ├── pa_devs
│   │           │       │   │       │   ├── paex_pink
│   │           │       │   │       │   ├── paex_read_write_wire
│   │           │       │   │       │   ├── paex_record
│   │           │       │   │       │   ├── paex_saw
│   │           │       │   │       │   ├── paex_sine
│   │           │       │   │       │   ├── paex_write_sine
│   │           │       │   │       │   ├── paex_write_sine_nonint
│   │           │       │   │       │   ├── pa_fuzz
│   │           │       │   │       │   ├── pa_minlat
│   │           │       │   │       │   ├── paqa_devs
│   │           │       │   │       │   ├── paqa_errs
│   │           │       │   │       │   ├── paqa_latency
│   │           │       │   │       │   ├── patest1
│   │           │       │   │       │   ├── patest_buffer
│   │           │       │   │       │   ├── patest_callbackstop
│   │           │       │   │       │   ├── patest_clip
│   │           │       │   │       │   ├── patest_dither
│   │           │       │   │       │   ├── patest_hang
│   │           │       │   │       │   ├── patest_in_overflow
│   │           │       │   │       │   ├── patest_latency
│   │           │       │   │       │   ├── patest_leftright
│   │           │       │   │       │   ├── patest_longsine
│   │           │       │   │       │   ├── patest_many
│   │           │       │   │       │   ├── patest_maxsines
│   │           │       │   │       │   ├── patest_mono
│   │           │       │   │       │   ├── patest_multi_sine
│   │           │       │   │       │   ├── patest_out_underflow
│   │           │       │   │       │   ├── patest_prime
│   │           │       │   │       │   ├── patest_ringmix
│   │           │       │   │       │   ├── patest_sine8
│   │           │       │   │       │   ├── patest_sine_channelmaps
│   │           │       │   │       │   ├── patest_sine_formats
│   │           │       │   │       │   ├── patest_sine_srate
│   │           │       │   │       │   ├── patest_sine_time
│   │           │       │   │       │   ├── patest_start_stop
│   │           │       │   │       │   ├── patest_stop
│   │           │       │   │       │   ├── patest_stop_playout
│   │           │       │   │       │   ├── patest_toomanysines
│   │           │       │   │       │   ├── patest_two_rates
│   │           │       │   │       │   ├── patest_underflow
│   │           │       │   │       │   └── patest_wire
│   │           │       │   │       ├── bindings
│   │           │       │   │       │   ├── cpp
│   │           │       │   │       │   │   ├── aclocal.m4
│   │           │       │   │       │   │   ├── AUTHORS
│   │           │       │   │       │   │   ├── bin
│   │           │       │   │       │   │   │   ├── Makefile.am
│   │           │       │   │       │   │   │   └── Makefile.in
│   │           │       │   │       │   │   ├── build
│   │           │       │   │       │   │   │   ├── gnu
│   │           │       │   │       │   │   │   │   ├── aclocal.m4
│   │           │       │   │       │   │   │   │   ├── config.guess
│   │           │       │   │       │   │   │   │   ├── config.sub
│   │           │       │   │       │   │   │   │   ├── configure
│   │           │       │   │       │   │   │   │   ├── configure.ac
│   │           │       │   │       │   │   │   │   ├── install-sh
│   │           │       │   │       │   │   │   │   ├── Makefile.in
│   │           │       │   │       │   │   │   │   └── OUT_OF_DATE
│   │           │       │   │       │   │   │   ├── vc6
│   │           │       │   │       │   │   │   │   ├── devs_example.dsp
│   │           │       │   │       │   │   │   │   ├── devs_example.dsw
│   │           │       │   │       │   │   │   │   ├── sine_example.dsp
│   │           │       │   │       │   │   │   │   ├── sine_example.dsw
│   │           │       │   │       │   │   │   │   ├── static_library.dsp
│   │           │       │   │       │   │   │   │   └── static_library.dsw
│   │           │       │   │       │   │   │   ├── vc7
│   │           │       │   │       │   │   │   │   └── OUT_OF_DATE
│   │           │       │   │       │   │   │   └── vc7_1
│   │           │       │   │       │   │   │       ├── devs_example.sln
│   │           │       │   │       │   │   │       ├── devs_example.vcproj
│   │           │       │   │       │   │   │       ├── sine_example.sln
│   │           │       │   │       │   │   │       ├── sine_example.vcproj
│   │           │       │   │       │   │   │       ├── static_library.sln
│   │           │       │   │       │   │   │       └── static_library.vcproj
│   │           │       │   │       │   │   ├── ChangeLog
│   │           │       │   │       │   │   ├── configure
│   │           │       │   │       │   │   ├── configure.ac
│   │           │       │   │       │   │   ├── COPYING
│   │           │       │   │       │   │   ├── doc
│   │           │       │   │       │   │   │   ├── config.doxy
│   │           │       │   │       │   │   │   ├── config.doxy.linux
│   │           │       │   │       │   │   │   ├── Makefile.am
│   │           │       │   │       │   │   │   ├── Makefile.in
│   │           │       │   │       │   │   │   └── README
│   │           │       │   │       │   │   ├── example
│   │           │       │   │       │   │   │   ├── devs.cxx
│   │           │       │   │       │   │   │   └── sine.cxx
│   │           │       │   │       │   │   ├── include
│   │           │       │   │       │   │   │   ├── Makefile.am
│   │           │       │   │       │   │   │   ├── Makefile.in
│   │           │       │   │       │   │   │   └── portaudiocpp
│   │           │       │   │       │   │   │       ├── AsioDeviceAdapter.hxx
│   │           │       │   │       │   │   │       ├── AutoSystem.hxx
│   │           │       │   │       │   │   │       ├── BlockingStream.hxx
│   │           │       │   │       │   │   │       ├── CallbackInterface.hxx
│   │           │       │   │       │   │   │       ├── CallbackStream.hxx
│   │           │       │   │       │   │   │       ├── CFunCallbackStream.hxx
│   │           │       │   │       │   │   │       ├── CppFunCallbackStream.hxx
│   │           │       │   │       │   │   │       ├── Device.hxx
│   │           │       │   │       │   │   │       ├── DirectionSpecificStreamParameters.hxx
│   │           │       │   │       │   │   │       ├── Exception.hxx
│   │           │       │   │       │   │   │       ├── HostApi.hxx
│   │           │       │   │       │   │   │       ├── InterfaceCallbackStream.hxx
│   │           │       │   │       │   │   │       ├── MemFunCallbackStream.hxx
│   │           │       │   │       │   │   │       ├── PortAudioCpp.hxx
│   │           │       │   │       │   │   │       ├── SampleDataFormat.hxx
│   │           │       │   │       │   │   │       ├── Stream.hxx
│   │           │       │   │       │   │   │       ├── StreamParameters.hxx
│   │           │       │   │       │   │   │       ├── SystemDeviceIterator.hxx
│   │           │       │   │       │   │   │       ├── SystemHostApiIterator.hxx
│   │           │       │   │       │   │   │       └── System.hxx
│   │           │       │   │       │   │   ├── INSTALL
│   │           │       │   │       │   │   ├── lib
│   │           │       │   │       │   │   │   ├── Makefile.am
│   │           │       │   │       │   │   │   └── Makefile.in
│   │           │       │   │       │   │   ├── Makefile.am
│   │           │       │   │       │   │   ├── Makefile.in
│   │           │       │   │       │   │   ├── NEWS
│   │           │       │   │       │   │   ├── portaudiocpp.pc.in
│   │           │       │   │       │   │   ├── README
│   │           │       │   │       │   │   ├── SConscript
│   │           │       │   │       │   │   └── source
│   │           │       │   │       │   │       └── portaudiocpp
│   │           │       │   │       │   │           ├── AsioDeviceAdapter.cxx
│   │           │       │   │       │   │           ├── BlockingStream.cxx
│   │           │       │   │       │   │           ├── CallbackInterface.cxx
│   │           │       │   │       │   │           ├── CallbackStream.cxx
│   │           │       │   │       │   │           ├── CFunCallbackStream.cxx
│   │           │       │   │       │   │           ├── CppFunCallbackStream.cxx
│   │           │       │   │       │   │           ├── Device.cxx
│   │           │       │   │       │   │           ├── DirectionSpecificStreamParameters.cxx
│   │           │       │   │       │   │           ├── Exception.cxx
│   │           │       │   │       │   │           ├── HostApi.cxx
│   │           │       │   │       │   │           ├── InterfaceCallbackStream.cxx
│   │           │       │   │       │   │           ├── MemFunCallbackStream.cxx
│   │           │       │   │       │   │           ├── Stream.cxx
│   │           │       │   │       │   │           ├── StreamParameters.cxx
│   │           │       │   │       │   │           ├── System.cxx
│   │           │       │   │       │   │           ├── SystemDeviceIterator.cxx
│   │           │       │   │       │   │           └── SystemHostApiIterator.cxx
│   │           │       │   │       │   └── java
│   │           │       │   │       │       ├── c
│   │           │       │   │       │       │   ├── build
│   │           │       │   │       │       │   │   └── vs2010
│   │           │       │   │       │       │   │       └── PortAudioJNI
│   │           │       │   │       │       │   │           ├── PortAudioJNI.sln
│   │           │       │   │       │       │   │           ├── PortAudioJNI.vcproj
│   │           │       │   │       │       │   │           └── PortAudioJNI.vcxproj
│   │           │       │   │       │       │   └── src
│   │           │       │   │       │       │       ├── com_portaudio_BlockingStream.c
│   │           │       │   │       │       │       ├── com_portaudio_BlockingStream.h
│   │           │       │   │       │       │       ├── com_portaudio_PortAudio.c
│   │           │       │   │       │       │       ├── com_portaudio_PortAudio.h
│   │           │       │   │       │       │       ├── jpa_tools.c
│   │           │       │   │       │       │       └── jpa_tools.h
│   │           │       │   │       │       ├── jportaudio
│   │           │       │   │       │       │   ├── jtests
│   │           │       │   │       │       │   │   └── com
│   │           │       │   │       │       │   │       └── portaudio
│   │           │       │   │       │       │   │           ├── PlaySine.java
│   │           │       │   │       │       │   │           └── TestBasic.java
│   │           │       │   │       │       │   └── src
│   │           │       │   │       │       │       └── com
│   │           │       │   │       │       │           └── portaudio
│   │           │       │   │       │       │               ├── BlockingStream.java
│   │           │       │   │       │       │               ├── DeviceInfo.java
│   │           │       │   │       │       │               ├── HostApiInfo.java
│   │           │       │   │       │       │               ├── PortAudio.java
│   │           │       │   │       │       │               ├── StreamInfo.java
│   │           │       │   │       │       │               └── StreamParameters.java
│   │           │       │   │       │       ├── jportaudio.dox
│   │           │       │   │       │       └── scripts
│   │           │       │   │       │           └── make_header.bat
│   │           │       │   │       ├── bin-stamp
│   │           │       │   │       ├── build
│   │           │       │   │       │   ├── msvc
│   │           │       │   │       │   │   ├── portaudio.def
│   │           │       │   │       │   │   ├── portaudio.dsp
│   │           │       │   │       │   │   ├── portaudio.dsw
│   │           │       │   │       │   │   ├── portaudio.sln
│   │           │       │   │       │   │   ├── portaudio.vcproj
│   │           │       │   │       │   │   └── readme.txt
│   │           │       │   │       │   └── scons
│   │           │       │   │       │       ├── SConscript_common
│   │           │       │   │       │       └── SConscript_opts
│   │           │       │   │       ├── CMakeLists.txt
│   │           │       │   │       ├── cmake_support
│   │           │       │   │       │   ├── FindASIOSDK.cmake
│   │           │       │   │       │   ├── FindDXSDK.cmake
│   │           │       │   │       │   ├── options_cmake.h.in
│   │           │       │   │       │   └── template_portaudio.def
│   │           │       │   │       ├── config.guess
│   │           │       │   │       ├── config.log
│   │           │       │   │       ├── config.status
│   │           │       │   │       ├── config.sub
│   │           │       │   │       ├── configure
│   │           │       │   │       ├── configure.in
│   │           │       │   │       ├── depcomp
│   │           │       │   │       ├── doc
│   │           │       │   │       │   ├── src
│   │           │       │   │       │   │   ├── api_overview.dox
│   │           │       │   │       │   │   ├── images
│   │           │       │   │       │   │   │   └── portaudio-external-architecture-diagram.png
│   │           │       │   │       │   │   ├── license.dox
│   │           │       │   │       │   │   ├── mainpage.dox
│   │           │       │   │       │   │   ├── srcguide.dox
│   │           │       │   │       │   │   └── tutorial
│   │           │       │   │       │   │       ├── blocking_read_write.dox
│   │           │       │   │       │   │       ├── compile_cmake.dox
│   │           │       │   │       │   │       ├── compile_linux.dox
│   │           │       │   │       │   │       ├── compile_mac_coreaudio.dox
│   │           │       │   │       │   │       ├── compile_windows_asio_msvc.dox
│   │           │       │   │       │   │       ├── compile_windows.dox
│   │           │       │   │       │   │       ├── compile_windows_mingw.dox
│   │           │       │   │       │   │       ├── exploring.dox
│   │           │       │   │       │   │       ├── initializing_portaudio.dox
│   │           │       │   │       │   │       ├── open_default_stream.dox
│   │           │       │   │       │   │       ├── querying_devices.dox
│   │           │       │   │       │   │       ├── start_stop_abort.dox
│   │           │       │   │       │   │       ├── terminating_portaudio.dox
│   │           │       │   │       │   │       ├── tutorial_start.dox
│   │           │       │   │       │   │       ├── utility_functions.dox
│   │           │       │   │       │   │       └── writing_a_callback.dox
│   │           │       │   │       │   └── utils
│   │           │       │   │       │       └── checkfiledocs.py
│   │           │       │   │       ├── Doxyfile
│   │           │       │   │       ├── Doxyfile.developer
│   │           │       │   │       ├── examples
│   │           │       │   │       │   ├── CMakeLists.txt
│   │           │       │   │       │   ├── pa_devs.c
│   │           │       │   │       │   ├── paex_mono_asio_channel_select.c
│   │           │       │   │       │   ├── paex_ocean_shore.c
│   │           │       │   │       │   ├── paex_pink.c
│   │           │       │   │       │   ├── paex_read_write_wire.c
│   │           │       │   │       │   ├── paex_record.c
│   │           │       │   │       │   ├── paex_record_file.c
│   │           │       │   │       │   ├── paex_saw.c
│   │           │       │   │       │   ├── paex_sine.c
│   │           │       │   │       │   ├── paex_sine_c++.cpp
│   │           │       │   │       │   ├── paex_wmme_ac3.c
│   │           │       │   │       │   ├── paex_wmme_surround.c
│   │           │       │   │       │   ├── paex_write_sine.c
│   │           │       │   │       │   ├── paex_write_sine_nonint.c
│   │           │       │   │       │   └── pa_fuzz.c
│   │           │       │   │       ├── fixdir.bat
│   │           │       │   │       ├── fixfile.bat
│   │           │       │   │       ├── include
│   │           │       │   │       │   ├── pa_asio.h
│   │           │       │   │       │   ├── pa_jack.h
│   │           │       │   │       │   ├── pa_linux_alsa.h
│   │           │       │   │       │   ├── pa_mac_core.h
│   │           │       │   │       │   ├── pa_win_ds.h
│   │           │       │   │       │   ├── pa_win_wasapi.h
│   │           │       │   │       │   ├── pa_win_waveformat.h
│   │           │       │   │       │   ├── pa_win_wdmks.h
│   │           │       │   │       │   ├── pa_win_wmme.h
│   │           │       │   │       │   └── portaudio.h
│   │           │       │   │       ├── index.html
│   │           │       │   │       ├── install
│   │           │       │   │       │   ├── include
│   │           │       │   │       │   │   ├── pa_linux_alsa.h
│   │           │       │   │       │   │   ├── pa_ringbuffer.h
│   │           │       │   │       │   │   ├── pa_util.h
│   │           │       │   │       │   │   └── portaudio.h
│   │           │       │   │       │   └── lib
│   │           │       │   │       │       ├── libportaudio.a
│   │           │       │   │       │       ├── libportaudio.la
│   │           │       │   │       │       ├── libportaudio.so.2.0.0
│   │           │       │   │       │       └── pkgconfig
│   │           │       │   │       │           └── portaudio-2.0.pc
│   │           │       │   │       ├── install-sh
│   │           │       │   │       ├── lib
│   │           │       │   │       │   └── libportaudio.la
│   │           │       │   │       ├── lib-stamp
│   │           │       │   │       ├── libtool
│   │           │       │   │       ├── LICENSE.txt
│   │           │       │   │       ├── ltmain.sh
│   │           │       │   │       ├── Makefile
│   │           │       │   │       ├── Makefile.in
│   │           │       │   │       ├── missing
│   │           │       │   │       ├── pablio
│   │           │       │   │       │   ├── pablio.c
│   │           │       │   │       │   ├── pablio.def
│   │           │       │   │       │   ├── pablio.h
│   │           │       │   │       │   ├── README.txt
│   │           │       │   │       │   ├── test_rw.c
│   │           │       │   │       │   ├── test_rw_echo.c
│   │           │       │   │       │   ├── test_w_saw8.c
│   │           │       │   │       │   └── test_w_saw.c
│   │           │       │   │       ├── portaudio-2.0.pc
│   │           │       │   │       ├── portaudio-2.0.pc.in
│   │           │       │   │       ├── qa
│   │           │       │   │       │   ├── loopback
│   │           │       │   │       │   │   ├── README.txt
│   │           │       │   │       │   │   └── src
│   │           │       │   │       │   │       ├── audio_analyzer.c
│   │           │       │   │       │   │       ├── audio_analyzer.h
│   │           │       │   │       │   │       ├── biquad_filter.c
│   │           │       │   │       │   │       ├── biquad_filter.h
│   │           │       │   │       │   │       ├── paqa.c
│   │           │       │   │       │   │       ├── paqa_tools.c
│   │           │       │   │       │   │       ├── paqa_tools.h
│   │           │       │   │       │   │       ├── qa_tools.h
│   │           │       │   │       │   │       ├── test_audio_analyzer.c
│   │           │       │   │       │   │       ├── test_audio_analyzer.h
│   │           │       │   │       │   │       ├── write_wav.c
│   │           │       │   │       │   │       └── write_wav.h
│   │           │       │   │       │   ├── paqa_devs.c
│   │           │       │   │       │   ├── paqa_errs.c
│   │           │       │   │       │   └── paqa_latency.c
│   │           │       │   │       ├── README.configure.txt
│   │           │       │   │       ├── README.txt
│   │           │       │   │       ├── SConstruct
│   │           │       │   │       ├── src
│   │           │       │   │       │   ├── common
│   │           │       │   │       │   │   ├── pa_allocation.c
│   │           │       │   │       │   │   ├── pa_allocation.h
│   │           │       │   │       │   │   ├── pa_allocation.lo
│   │           │       │   │       │   │   ├── pa_allocation.o
│   │           │       │   │       │   │   ├── pa_converters.c
│   │           │       │   │       │   │   ├── pa_converters.h
│   │           │       │   │       │   │   ├── pa_converters.lo
│   │           │       │   │       │   │   ├── pa_converters.o
│   │           │       │   │       │   │   ├── pa_cpuload.c
│   │           │       │   │       │   │   ├── pa_cpuload.h
│   │           │       │   │       │   │   ├── pa_cpuload.lo
│   │           │       │   │       │   │   ├── pa_cpuload.o
│   │           │       │   │       │   │   ├── pa_debugprint.c
│   │           │       │   │       │   │   ├── pa_debugprint.h
│   │           │       │   │       │   │   ├── pa_debugprint.lo
│   │           │       │   │       │   │   ├── pa_debugprint.o
│   │           │       │   │       │   │   ├── pa_dither.c
│   │           │       │   │       │   │   ├── pa_dither.h
│   │           │       │   │       │   │   ├── pa_dither.lo
│   │           │       │   │       │   │   ├── pa_dither.o
│   │           │       │   │       │   │   ├── pa_endianness.h
│   │           │       │   │       │   │   ├── pa_front.c
│   │           │       │   │       │   │   ├── pa_front.lo
│   │           │       │   │       │   │   ├── pa_front.o
│   │           │       │   │       │   │   ├── pa_hostapi.h
│   │           │       │   │       │   │   ├── pa_memorybarrier.h
│   │           │       │   │       │   │   ├── pa_process.c
│   │           │       │   │       │   │   ├── pa_process.h
│   │           │       │   │       │   │   ├── pa_process.lo
│   │           │       │   │       │   │   ├── pa_process.o
│   │           │       │   │       │   │   ├── pa_ringbuffer.c
│   │           │       │   │       │   │   ├── pa_ringbuffer.h
│   │           │       │   │       │   │   ├── pa_ringbuffer.lo
│   │           │       │   │       │   │   ├── pa_ringbuffer.o
│   │           │       │   │       │   │   ├── pa_stream.c
│   │           │       │   │       │   │   ├── pa_stream.h
│   │           │       │   │       │   │   ├── pa_stream.lo
│   │           │       │   │       │   │   ├── pa_stream.o
│   │           │       │   │       │   │   ├── pa_trace.c
│   │           │       │   │       │   │   ├── pa_trace.h
│   │           │       │   │       │   │   ├── pa_trace.lo
│   │           │       │   │       │   │   ├── pa_trace.o
│   │           │       │   │       │   │   ├── pa_types.h
│   │           │       │   │       │   │   └── pa_util.h
│   │           │       │   │       │   ├── hostapi
│   │           │       │   │       │   │   ├── alsa
│   │           │       │   │       │   │   │   ├── pa_linux_alsa.c
│   │           │       │   │       │   │   │   ├── pa_linux_alsa.lo
│   │           │       │   │       │   │   │   └── pa_linux_alsa.o
│   │           │       │   │       │   │   ├── asihpi
│   │           │       │   │       │   │   │   └── pa_linux_asihpi.c
│   │           │       │   │       │   │   ├── asio
│   │           │       │   │       │   │   │   ├── ASIO-README.txt
│   │           │       │   │       │   │   │   ├── Callback_adaptation_.pdf
│   │           │       │   │       │   │   │   ├── iasiothiscallresolver.cpp
│   │           │       │   │       │   │   │   ├── iasiothiscallresolver.h
│   │           │       │   │       │   │   │   ├── pa_asio.cpp
│   │           │       │   │       │   │   │   └── Pa_ASIO.pdf
│   │           │       │   │       │   │   ├── coreaudio
│   │           │       │   │       │   │   │   ├── notes.txt
│   │           │       │   │       │   │   │   ├── pa_mac_core_blocking.c
│   │           │       │   │       │   │   │   ├── pa_mac_core_blocking.h
│   │           │       │   │       │   │   │   ├── pa_mac_core.c
│   │           │       │   │       │   │   │   ├── pa_mac_core_internal.h
│   │           │       │   │       │   │   │   ├── pa_mac_core_old.c
│   │           │       │   │       │   │   │   ├── pa_mac_core_utilities.c
│   │           │       │   │       │   │   │   └── pa_mac_core_utilities.h
│   │           │       │   │       │   │   ├── dsound
│   │           │       │   │       │   │   │   ├── pa_win_ds.c
│   │           │       │   │       │   │   │   ├── pa_win_ds_dynlink.c
│   │           │       │   │       │   │   │   └── pa_win_ds_dynlink.h
│   │           │       │   │       │   │   ├── jack
│   │           │       │   │       │   │   │   └── pa_jack.c
│   │           │       │   │       │   │   ├── oss
│   │           │       │   │       │   │   │   ├── low_latency_tip.txt
│   │           │       │   │       │   │   │   ├── pa_unix_oss.c
│   │           │       │   │       │   │   │   ├── pa_unix_oss.lo
│   │           │       │   │       │   │   │   ├── pa_unix_oss.o
│   │           │       │   │       │   │   │   └── recplay.c
│   │           │       │   │       │   │   ├── skeleton
│   │           │       │   │       │   │   │   ├── pa_hostapi_skeleton.c
│   │           │       │   │       │   │   │   ├── pa_hostapi_skeleton.lo
│   │           │       │   │       │   │   │   ├── pa_hostapi_skeleton.o
│   │           │       │   │       │   │   │   └── README.txt
│   │           │       │   │       │   │   ├── wasapi
│   │           │       │   │       │   │   │   ├── mingw-include
│   │           │       │   │       │   │   │   │   ├── audioclient.h
│   │           │       │   │       │   │   │   │   ├── AudioSessionTypes.h
│   │           │       │   │       │   │   │   │   ├── devicetopology.h
│   │           │       │   │       │   │   │   │   ├── endpointvolume.h
│   │           │       │   │       │   │   │   │   ├── FunctionDiscoveryKeys_devpkey.h
│   │           │       │   │       │   │   │   │   ├── functiondiscoverykeys.h
│   │           │       │   │       │   │   │   │   ├── ksguid.h
│   │           │       │   │       │   │   │   │   ├── ks.h
│   │           │       │   │       │   │   │   │   ├── ksmedia.h
│   │           │       │   │       │   │   │   │   ├── ksproxy.h
│   │           │       │   │       │   │   │   │   ├── ksuuids.h
│   │           │       │   │       │   │   │   │   ├── mmdeviceapi.h
│   │           │       │   │       │   │   │   │   ├── propidl.h
│   │           │       │   │       │   │   │   │   ├── propkeydef.h
│   │           │       │   │       │   │   │   │   ├── propkey.h
│   │           │       │   │       │   │   │   │   ├── propsys.h
│   │           │       │   │       │   │   │   │   ├── rpcsal.h
│   │           │       │   │       │   │   │   │   ├── sal.h
│   │           │       │   │       │   │   │   │   ├── sdkddkver.h
│   │           │       │   │       │   │   │   │   ├── shtypes.h
│   │           │       │   │       │   │   │   │   └── structuredquery.h
│   │           │       │   │       │   │   │   ├── pa_win_wasapi.c
│   │           │       │   │       │   │   │   └── readme.txt
│   │           │       │   │       │   │   ├── wdmks
│   │           │       │   │       │   │   │   ├── pa_win_wdmks.c
│   │           │       │   │       │   │   │   └── readme.txt
│   │           │       │   │       │   │   └── wmme
│   │           │       │   │       │   │       └── pa_win_wmme.c
│   │           │       │   │       │   ├── os
│   │           │       │   │       │   │   ├── unix
│   │           │       │   │       │   │   │   ├── pa_unix_hostapis.c
│   │           │       │   │       │   │   │   ├── pa_unix_hostapis.lo
│   │           │       │   │       │   │   │   ├── pa_unix_hostapis.o
│   │           │       │   │       │   │   │   ├── pa_unix_util.c
│   │           │       │   │       │   │   │   ├── pa_unix_util.h
│   │           │       │   │       │   │   │   ├── pa_unix_util.lo
│   │           │       │   │       │   │   │   └── pa_unix_util.o
│   │           │       │   │       │   │   └── win
│   │           │       │   │       │   │       ├── pa_win_coinitialize.c
│   │           │       │   │       │   │       ├── pa_win_coinitialize.h
│   │           │       │   │       │   │       ├── pa_win_hostapis.c
│   │           │       │   │       │   │       ├── pa_win_util.c
│   │           │       │   │       │   │       ├── pa_win_waveformat.c
│   │           │       │   │       │   │       ├── pa_win_wdmks_utils.c
│   │           │       │   │       │   │       ├── pa_win_wdmks_utils.h
│   │           │       │   │       │   │       ├── pa_x86_plain_converters.c
│   │           │       │   │       │   │       └── pa_x86_plain_converters.h
│   │           │       │   │       │   └── SConscript
│   │           │       │   │       ├── test
│   │           │       │   │       │   ├── CMakeLists.txt
│   │           │       │   │       │   ├── pa_minlat.c
│   │           │       │   │       │   ├── patest1.c
│   │           │       │   │       │   ├── patest_buffer.c
│   │           │       │   │       │   ├── patest_callbackstop.c
│   │           │       │   │       │   ├── patest_clip.c
│   │           │       │   │       │   ├── patest_converters.c
│   │           │       │   │       │   ├── patest_dither.c
│   │           │       │   │       │   ├── patest_dsound_find_best_latency_params.c
│   │           │       │   │       │   ├── patest_dsound_low_level_latency_params.c
│   │           │       │   │       │   ├── patest_dsound_surround.c
│   │           │       │   │       │   ├── patest_hang.c
│   │           │       │   │       │   ├── patest_in_overflow.c
│   │           │       │   │       │   ├── patest_jack_wasapi.c
│   │           │       │   │       │   ├── patest_latency.c
│   │           │       │   │       │   ├── patest_leftright.c
│   │           │       │   │       │   ├── patest_longsine.c
│   │           │       │   │       │   ├── patest_many.c
│   │           │       │   │       │   ├── patest_maxsines.c
│   │           │       │   │       │   ├── patest_mono.c
│   │           │       │   │       │   ├── patest_multi_sine.c
│   │           │       │   │       │   ├── patest_out_underflow.c
│   │           │       │   │       │   ├── patest_prime.c
│   │           │       │   │       │   ├── patest_read_record.c
│   │           │       │   │       │   ├── patest_ringmix.c
│   │           │       │   │       │   ├── patest_sine8.c
│   │           │       │   │       │   ├── patest_sine_channelmaps.c
│   │           │       │   │       │   ├── patest_sine_formats.c
│   │           │       │   │       │   ├── patest_sine_srate.c
│   │           │       │   │       │   ├── patest_sine_time.c
│   │           │       │   │       │   ├── patest_start_stop.c
│   │           │       │   │       │   ├── patest_stop.c
│   │           │       │   │       │   ├── patest_stop_playout.c
│   │           │       │   │       │   ├── patest_suggested_vs_streaminfo_latency.c
│   │           │       │   │       │   ├── patest_suggested_vs_streaminfo_latency.py
│   │           │       │   │       │   ├── patest_sync.c
│   │           │       │   │       │   ├── patest_timing.c
│   │           │       │   │       │   ├── patest_toomanysines.c
│   │           │       │   │       │   ├── patest_two_rates.c
│   │           │       │   │       │   ├── patest_underflow.c
│   │           │       │   │       │   ├── patest_wire.c
│   │           │       │   │       │   ├── patest_wmme_find_best_latency_params.c
│   │           │       │   │       │   ├── patest_wmme_low_level_latency_params.c
│   │           │       │   │       │   ├── patest_write_stop.c
│   │           │       │   │       │   └── README.txt
│   │           │       │   │       └── testcvs
│   │           │       │   │           └── changeme.txt
│   │           │       │   ├── iOS
│   │           │       │   │   ├── Obj-C
│   │           │       │   │   │   ├── Podfile
│   │           │       │   │   │   ├── Podfile.lock
│   │           │       │   │   │   ├── Pods
│   │           │       │   │   │   │   ├── EZAudio
│   │           │       │   │   │   │   │   ├── EZAudio
│   │           │       │   │   │   │   │   │   ├── EZAudioDevice.h
│   │           │       │   │   │   │   │   │   ├── EZAudioDevice.m
│   │           │       │   │   │   │   │   │   ├── EZAudioDisplayLink.h
│   │           │       │   │   │   │   │   │   ├── EZAudioDisplayLink.m
│   │           │       │   │   │   │   │   │   ├── EZAudioFFT.h
│   │           │       │   │   │   │   │   │   ├── EZAudioFFT.m
│   │           │       │   │   │   │   │   │   ├── EZAudioFile.h
│   │           │       │   │   │   │   │   │   ├── EZAudioFile.m
│   │           │       │   │   │   │   │   │   ├── EZAudioFloatConverter.h
│   │           │       │   │   │   │   │   │   ├── EZAudioFloatConverter.m
│   │           │       │   │   │   │   │   │   ├── EZAudioFloatData.h
│   │           │       │   │   │   │   │   │   ├── EZAudioFloatData.m
│   │           │       │   │   │   │   │   │   ├── EZAudio.h
│   │           │       │   │   │   │   │   │   ├── EZAudioiOS.h
│   │           │       │   │   │   │   │   │   ├── EZAudio.m
│   │           │       │   │   │   │   │   │   ├── EZAudioOSX.h
│   │           │       │   │   │   │   │   │   ├── EZAudioPlayer.h
│   │           │       │   │   │   │   │   │   ├── EZAudioPlayer.m
│   │           │       │   │   │   │   │   │   ├── EZAudioPlotGL.h
│   │           │       │   │   │   │   │   │   ├── EZAudioPlotGL.m
│   │           │       │   │   │   │   │   │   ├── EZAudioPlot.h
│   │           │       │   │   │   │   │   │   ├── EZAudioPlot.m
│   │           │       │   │   │   │   │   │   ├── EZAudioUtilities.h
│   │           │       │   │   │   │   │   │   ├── EZAudioUtilities.m
│   │           │       │   │   │   │   │   │   ├── EZMicrophone.h
│   │           │       │   │   │   │   │   │   ├── EZMicrophone.m
│   │           │       │   │   │   │   │   │   ├── EZOutput.h
│   │           │       │   │   │   │   │   │   ├── EZOutput.m
│   │           │       │   │   │   │   │   │   ├── EZPlot.h
│   │           │       │   │   │   │   │   │   ├── EZPlot.m
│   │           │       │   │   │   │   │   │   ├── EZRecorder.h
│   │           │       │   │   │   │   │   │   ├── EZRecorder.m
│   │           │       │   │   │   │   │   │   ├── TPCircularBuffer.c
│   │           │       │   │   │   │   │   │   └── TPCircularBuffer.h
│   │           │       │   │   │   │   │   ├── LICENSE
│   │           │       │   │   │   │   │   └── README.md
│   │           │       │   │   │   │   ├── Manifest.lock
│   │           │       │   │   │   │   ├── Pods.xcodeproj
│   │           │       │   │   │   │   │   ├── project.pbxproj
│   │           │       │   │   │   │   │   └── xcuserdata
│   │           │       │   │   │   │   │       └── patrickquinn.xcuserdatad
│   │           │       │   │   │   │   │           └── xcschemes
│   │           │       │   │   │   │   │               ├── EZAudio.xcscheme
│   │           │       │   │   │   │   │               ├── Pods-SnowboyTest.xcscheme
│   │           │       │   │   │   │   │               ├── TPCircularBuffer.xcscheme
│   │           │       │   │   │   │   │               └── xcschememanagement.plist
│   │           │       │   │   │   │   ├── Target Support Files
│   │           │       │   │   │   │   │   ├── EZAudio
│   │           │       │   │   │   │   │   │   ├── EZAudio-dummy.m
│   │           │       │   │   │   │   │   │   ├── EZAudio-prefix.pch
│   │           │       │   │   │   │   │   │   └── EZAudio.xcconfig
│   │           │       │   │   │   │   │   ├── Pods-SnowboyTest
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest-acknowledgements.markdown
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest-acknowledgements.plist
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest.debug.xcconfig
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest-dummy.m
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest-frameworks.sh
│   │           │       │   │   │   │   │   │   ├── Pods-SnowboyTest.release.xcconfig
│   │           │       │   │   │   │   │   │   └── Pods-SnowboyTest-resources.sh
│   │           │       │   │   │   │   │   └── TPCircularBuffer
│   │           │       │   │   │   │   │       ├── TPCircularBuffer-dummy.m
│   │           │       │   │   │   │   │       ├── TPCircularBuffer-prefix.pch
│   │           │       │   │   │   │   │       └── TPCircularBuffer.xcconfig
│   │           │       │   │   │   │   └── TPCircularBuffer
│   │           │       │   │   │   │       ├── README.markdown
│   │           │       │   │   │   │       ├── TPCircularBuffer+AudioBufferList.c
│   │           │       │   │   │   │       ├── TPCircularBuffer+AudioBufferList.h
│   │           │       │   │   │   │       ├── TPCircularBuffer.c
│   │           │       │   │   │   │       └── TPCircularBuffer.h
│   │           │       │   │   │   ├── SnowboyTest
│   │           │       │   │   │   │   ├── alexa.umdl
│   │           │       │   │   │   │   ├── AppDelegate.h
│   │           │       │   │   │   │   ├── AppDelegate.m
│   │           │       │   │   │   │   ├── Assets.xcassets
│   │           │       │   │   │   │   │   ├── AppIcon.appiconset
│   │           │       │   │   │   │   │   │   └── Contents.json
│   │           │       │   │   │   │   │   ├── banner.imageset
│   │           │       │   │   │   │   │   │   ├── Contents.json
│   │           │       │   │   │   │   │   │   ├── snowboy-1.png
│   │           │       │   │   │   │   │   │   ├── snowboy-2.png
│   │           │       │   │   │   │   │   │   └── snowboy.png
│   │           │       │   │   │   │   │   └── Contents.json
│   │           │       │   │   │   │   ├── Base.lproj
│   │           │       │   │   │   │   │   ├── LaunchScreen.storyboard
│   │           │       │   │   │   │   │   └── Main.storyboard
│   │           │       │   │   │   │   ├── common.res
│   │           │       │   │   │   │   ├── Info.plist
│   │           │       │   │   │   │   ├── libsnowboy-detect.a
│   │           │       │   │   │   │   ├── main.m
│   │           │       │   │   │   │   ├── snowboy-detect.h
│   │           │       │   │   │   │   ├── ViewController.h
│   │           │       │   │   │   │   └── ViewController.mm
│   │           │       │   │   │   ├── SnowboyTestTests
│   │           │       │   │   │   │   ├── Info.plist
│   │           │       │   │   │   │   └── SnowboyTestTests.m
│   │           │       │   │   │   ├── SnowboyTestUITests
│   │           │       │   │   │   │   ├── Info.plist
│   │           │       │   │   │   │   └── SnowboyTestUITests.m
│   │           │       │   │   │   ├── SnowboyTest.xcodeproj
│   │           │       │   │   │   │   ├── project.pbxproj
│   │           │       │   │   │   │   ├── project.xcworkspace
│   │           │       │   │   │   │   │   ├── contents.xcworkspacedata
│   │           │       │   │   │   │   │   └── xcuserdata
│   │           │       │   │   │   │   │       └── patrickquinn.xcuserdatad
│   │           │       │   │   │   │   └── xcuserdata
│   │           │       │   │   │   │       └── patrickquinn.xcuserdatad
│   │           │       │   │   │   │           └── xcschemes
│   │           │       │   │   │   │               ├── SnowboyTest.xcscheme
│   │           │       │   │   │   │               └── xcschememanagement.plist
│   │           │       │   │   │   └── SnowboyTest.xcworkspace
│   │           │       │   │   │       ├── contents.xcworkspacedata
│   │           │       │   │   │       └── xcuserdata
│   │           │       │   │   │           └── patrickquinn.xcuserdatad
│   │           │       │   │   │               └── UserInterfaceState.xcuserstate
│   │           │       │   │   └── Swift3
│   │           │       │   │       ├── README.md
│   │           │       │   │       ├── SnowboyTest
│   │           │       │   │       │   ├── AppDelegate.swift
│   │           │       │   │       │   ├── Assets.xcassets
│   │           │       │   │       │   │   └── AppIcon.appiconset
│   │           │       │   │       │   │       └── Contents.json
│   │           │       │   │       │   ├── Base.lproj
│   │           │       │   │       │   │   ├── LaunchScreen.storyboard
│   │           │       │   │       │   │   └── Main.storyboard
│   │           │       │   │       │   ├── Info.plist
│   │           │       │   │       │   ├── SnowboyTest-Bridging-Header.h
│   │           │       │   │       │   ├── SnowboyTest.xcdatamodeld
│   │           │       │   │       │   │   └── SnowboyTest.xcdatamodel
│   │           │       │   │       │   │       └── contents
│   │           │       │   │       │   ├── SnowboyWrapper.h
│   │           │       │   │       │   ├── SnowboyWrapper.mm
│   │           │       │   │       │   └── ViewController.swift
│   │           │       │   │       ├── SnowboyTestTests
│   │           │       │   │       │   ├── Info.plist
│   │           │       │   │       │   └── SnowboyTestTests.swift
│   │           │       │   │       ├── SnowboyTestUITests
│   │           │       │   │       │   ├── Info.plist
│   │           │       │   │       │   └── SnowboyTestUITests.swift
│   │           │       │   │       └── SnowboyTest.xcodeproj
│   │           │       │   │           ├── project.pbxproj
│   │           │       │   │           ├── project.xcworkspace
│   │           │       │   │           │   ├── contents.xcworkspacedata
│   │           │       │   │           │   └── xcuserdata
│   │           │       │   │           │       └── shengbi.xcuserdatad
│   │           │       │   │           │           └── UserInterfaceState.xcuserstate
│   │           │       │   │           └── xcuserdata
│   │           │       │   │               └── shengbi.xcuserdatad
│   │           │       │   │                   ├── xcdebugger
│   │           │       │   │                   │   └── Breakpoints_v2.xcbkptlist
│   │           │       │   │                   └── xcschemes
│   │           │       │   │                       ├── SnowboyTest.xcscheme
│   │           │       │   │                       └── xcschememanagement.plist
│   │           │       │   ├── Java
│   │           │       │   │   ├── Demo.java
│   │           │       │   │   └── Makefile
│   │           │       │   ├── Node
│   │           │       │   │   ├── file.js
│   │           │       │   │   └── microphone.js
│   │           │       │   ├── Perl
│   │           │       │   │   ├── cpanfile
│   │           │       │   │   ├── snowboy_googlevoice.pl
│   │           │       │   │   ├── snowboy_RESTful_train.pl
│   │           │       │   │   └── snowboy_unit_test.pl
│   │           │       │   ├── Python
│   │           │       │   │   ├── demo2.py
│   │           │       │   │   ├── demo3.py
│   │           │       │   │   ├── demo.py
│   │           │       │   │   ├── requirements.txt
│   │           │       │   │   └── snowboydecoder.py
│   │           │       │   └── REST_API
│   │           │       │       ├── training_service.py
│   │           │       │       └── training_service.sh
│   │           │       ├── include
│   │           │       │   └── snowboy-detect.h
│   │           │       ├── lib
│   │           │       │   ├── android
│   │           │       │   │   └── armv7a
│   │           │       │   │       └── libsnowboy-detect.a
│   │           │       │   ├── ios
│   │           │       │   │   └── libsnowboy-detect.a
│   │           │       │   ├── node
│   │           │       │   │   ├── index.ts
│   │           │       │   │   ├── node-pre-gyp.d.ts
│   │           │       │   │   └── SnowboyDetectNative.d.ts
│   │           │       │   ├── osx
│   │           │       │   │   └── libsnowboy-detect.a
│   │           │       │   ├── rpi
│   │           │       │   │   └── libsnowboy-detect.a
│   │           │       │   └── ubuntu64
│   │           │       │       └── libsnowboy-detect.a
│   │           │       ├── package.json
│   │           │       ├── README.md
│   │           │       ├── resources
│   │           │       │   ├── alexa_02092017.umdl
│   │           │       │   ├── alexa.umdl
│   │           │       │   ├── common.res
│   │           │       │   ├── ding.wav
│   │           │       │   ├── dong.wav
│   │           │       │   ├── snowboy.umdl
│   │           │       │   └── snowboy.wav
│   │           │       ├── scripts
│   │           │       │   └── publish-node.sh
│   │           │       ├── swig
│   │           │       │   ├── Android
│   │           │       │   │   ├── install_ndk.sh
│   │           │       │   │   ├── install_openblas.sh
│   │           │       │   │   ├── Makefile
│   │           │       │   │   └── snowboy-detect-swig.i
│   │           │       │   ├── Java
│   │           │       │   │   ├── Makefile
│   │           │       │   │   └── snowboy-detect-swig.i
│   │           │       │   ├── Node
│   │           │       │   │   └── snowboy.cc
│   │           │       │   ├── Perl
│   │           │       │   │   ├── Makefile
│   │           │       │   │   └── snowboy-detect.i
│   │           │       │   └── Python
│   │           │       │       ├── Makefile
│   │           │       │       └── snowboy-detect-swig.i
│   │           │       └── tsconfig.json
│   │           ├── sensory
│   │           │   └── alexa-rpi
│   │           │       ├── bin
│   │           │       │   ├── license.sh
│   │           │       │   └── sdk-license
│   │           │       ├── config
│   │           │       │   ├── asound.conf
│   │           │       │   └── license-key.txt
│   │           │       ├── include
│   │           │       │   └── snsr.h
│   │           │       ├── lib
│   │           │       │   └── libsnsr.a
│   │           │       ├── LICENSE.txt
│   │           │       ├── models
│   │           │       │   ├── spot-alexa-rpi-20500.snsr
│   │           │       │   ├── spot-alexa-rpi-21000.snsr
│   │           │       │   └── spot-alexa-rpi-31000.snsr
│   │           │       └── README.md
│   │           ├── src
│   │           │   ├── CMakeCache.txt
│   │           │   ├── CMakeFiles
│   │           │   │   ├── 3.6.2
│   │           │   │   │   ├── CMakeCCompiler.cmake
│   │           │   │   │   ├── CMakeCXXCompiler.cmake
│   │           │   │   │   ├── CMakeDetermineCompilerABI_C.bin
│   │           │   │   │   ├── CMakeDetermineCompilerABI_CXX.bin
│   │           │   │   │   ├── CMakeSystem.cmake
│   │           │   │   │   ├── CompilerIdC
│   │           │   │   │   │   ├── a.out
│   │           │   │   │   │   └── CMakeCCompilerId.c
│   │           │   │   │   └── CompilerIdCXX
│   │           │   │   │       ├── a.out
│   │           │   │   │       └── CMakeCXXCompilerId.cpp
│   │           │   │   ├── cmake.check_cache
│   │           │   │   ├── CMakeDirectoryInformation.cmake
│   │           │   │   ├── CMakeError.log
│   │           │   │   ├── CMakeOutput.log
│   │           │   │   ├── feature_tests.bin
│   │           │   │   ├── feature_tests.c
│   │           │   │   ├── feature_tests.cxx
│   │           │   │   ├── Makefile2
│   │           │   │   ├── Makefile.cmake
│   │           │   │   ├── progress.marks
│   │           │   │   ├── TargetDirectories.txt
│   │           │   │   └── wakeWordAgent.dir
│   │           │   │       ├── build.make
│   │           │   │       ├── cmake_clean.cmake
│   │           │   │       ├── CXX.includecache
│   │           │   │       ├── DependInfo.cmake
│   │           │   │       ├── depend.internal
│   │           │   │       ├── depend.make
│   │           │   │       ├── flags.make
│   │           │   │       ├── GPIOWakeWordEngine.cpp.o
│   │           │   │       ├── IPCInterface.cpp.o
│   │           │   │       ├── KittAiSnowboyWakeWordEngine.cpp.o
│   │           │   │       ├── link.txt
│   │           │   │       ├── Logger.cpp.o
│   │           │   │       ├── main.cpp.o
│   │           │   │       ├── PortAudioWrapper.cpp.o
│   │           │   │       ├── progress.make
│   │           │   │       ├── SensoryWakeWordEngine.cpp.o
│   │           │   │       ├── WakeWordAgent.cpp.o
│   │           │   │       ├── WakeWordEngine.cpp.o
│   │           │   │       ├── WakeWordEngineFactory.cpp.o
│   │           │   │       ├── WakeWordException.cpp.o
│   │           │   │       ├── WakeWordIPC.cpp.o
│   │           │   │       ├── WakeWordIPCFactory.cpp.o
│   │           │   │       └── WakeWordIPCSocket.cpp.o
│   │           │   ├── cmake_install.cmake
│   │           │   ├── CMakeLists.txt
│   │           │   ├── GPIOWakeWordEngine.cpp
│   │           │   ├── GPIOWakeWordEngine.h
│   │           │   ├── IPCInterface.cpp
│   │           │   ├── IPCInterface.h
│   │           │   ├── KittAiSnowboyWakeWordEngine.cpp
│   │           │   ├── KittAiSnowboyWakeWordEngine.h
│   │           │   ├── Logger.cpp
│   │           │   ├── Logger.h
│   │           │   ├── main.cpp
│   │           │   ├── Makefile
│   │           │   ├── perl-net-sdp
│   │           │   │   ├── blib
│   │           │   │   │   ├── bindoc
│   │           │   │   │   │   └── sdp2rat.1p
│   │           │   │   │   ├── lib
│   │           │   │   │   │   └── Net
│   │           │   │   │   │       ├── SDP
│   │           │   │   │   │       │   ├── Media.pm
│   │           │   │   │   │       │   └── Time.pm
│   │           │   │   │   │       └── SDP.pm
│   │           │   │   │   └── script
│   │           │   │   │       └── sdp2rat
│   │           │   │   ├── _build
│   │           │   │   │   ├── auto_features
│   │           │   │   │   ├── build_params
│   │           │   │   │   ├── cleanup
│   │           │   │   │   ├── config_data
│   │           │   │   │   ├── features
│   │           │   │   │   ├── magicnum
│   │           │   │   │   ├── notes
│   │           │   │   │   ├── prereqs
│   │           │   │   │   └── runtime_params
│   │           │   │   ├── Build
│   │           │   │   ├── Build.PL
│   │           │   │   ├── Changes
│   │           │   │   ├── examples
│   │           │   │   │   ├── kwax.sdp
│   │           │   │   │   ├── parse_and_generate.pl
│   │           │   │   │   ├── sdp2rat
│   │           │   │   │   ├── sdpinfo.pl
│   │           │   │   │   ├── sdpopen.pl
│   │           │   │   │   ├── simple_generate.pl
│   │           │   │   │   ├── simple.sdp
│   │           │   │   │   └── surge-test.sdp
│   │           │   │   ├── lib
│   │           │   │   │   └── Net
│   │           │   │   │       ├── SDP
│   │           │   │   │       │   ├── Media.pm
│   │           │   │   │       │   └── Time.pm
│   │           │   │   │       └── SDP.pm
│   │           │   │   ├── MANIFEST
│   │           │   │   ├── MYMETA.json
│   │           │   │   ├── MYMETA.yml
│   │           │   │   ├── README
│   │           │   │   └── t
│   │           │   │       ├── 00use.t
│   │           │   │       ├── 10generate.t
│   │           │   │       ├── 10parse.t
│   │           │   │       ├── 20repeat.t
│   │           │   │       └── 30asstring.t
│   │           │   ├── PortAudioWrapper.cpp
│   │           │   ├── PortAudioWrapper.h
│   │           │   ├── ~rectest-01.wav
│   │           │   ├── ~rectest-02.wav
│   │           │   ├── ~rectest-03.wav
│   │           │   ├── ~rectest-04.wav
│   │           │   ├── ~rectest-05.wav
│   │           │   ├── ~rectest-06.wav
│   │           │   ├── ~rectest-07.wav
│   │           │   ├── ~rectest-08.wav
│   │           │   ├── ~rectest-09.wav
│   │           │   ├── ~rectest-100.wav
│   │           │   ├── ~rectest-101.wav
│   │           │   ├── ~rectest-102.wav
│   │           │   ├── ~rectest-103.wav
│   │           │   ├── ~rectest-104.wav
│   │           │   ├── ~rectest-105.wav
│   │           │   ├── ~rectest-106.wav
│   │           │   ├── ~rectest-107.wav
│   │           │   ├── ~rectest-108.wav
│   │           │   ├── ~rectest-109.wav
│   │           │   ├── ~rectest-10.wav
│   │           │   ├── ~rectest-110.wav
│   │           │   ├── ~rectest-111.wav
│   │           │   ├── ~rectest-112.wav
│   │           │   ├── ~rectest-113.wav
│   │           │   ├── ~rectest-114.wav
│   │           │   ├── ~rectest-115.wav
│   │           │   ├── ~rectest-116.wav
│   │           │   ├── ~rectest-117.wav
│   │           │   ├── ~rectest-118.wav
│   │           │   ├── ~rectest-119.wav
│   │           │   ├── ~rectest-11.wav
│   │           │   ├── ~rectest-120.wav
│   │           │   ├── ~rectest-121.wav
│   │           │   ├── ~rectest-122.wav
│   │           │   ├── ~rectest-123.wav
│   │           │   ├── ~rectest-124.wav
│   │           │   ├── ~rectest-125.wav
│   │           │   ├── ~rectest-126.wav
│   │           │   ├── ~rectest-127.wav
│   │           │   ├── ~rectest-128.wav
│   │           │   ├── ~rectest-129.wav
│   │           │   ├── ~rectest-12.wav
│   │           │   ├── ~rectest-130.wav
│   │           │   ├── ~rectest-131.wav
│   │           │   ├── ~rectest-132.wav
│   │           │   ├── ~rectest-133.wav
│   │           │   ├── ~rectest-134.wav
│   │           │   ├── ~rectest-135.wav
│   │           │   ├── ~rectest-136.wav
│   │           │   ├── ~rectest-137.wav
│   │           │   ├── ~rectest-138.wav
│   │           │   ├── ~rectest-139.wav
│   │           │   ├── ~rectest-13.wav
│   │           │   ├── ~rectest-140.wav
│   │           │   ├── ~rectest-141.wav
│   │           │   ├── ~rectest-142.wav
│   │           │   ├── ~rectest-143.wav
│   │           │   ├── ~rectest-144.wav
│   │           │   ├── ~rectest-145.wav
│   │           │   ├── ~rectest-146.wav
│   │           │   ├── ~rectest-147.wav
│   │           │   ├── ~rectest-148.wav
│   │           │   ├── ~rectest-149.wav
│   │           │   ├── ~rectest-14.wav
│   │           │   ├── ~rectest-150.wav
│   │           │   ├── ~rectest-151.wav
│   │           │   ├── ~rectest-152.wav
│   │           │   ├── ~rectest-153.wav
│   │           │   ├── ~rectest-154.wav
│   │           │   ├── ~rectest-155.wav
│   │           │   ├── ~rectest-156.wav
│   │           │   ├── ~rectest-157.wav
│   │           │   ├── ~rectest-158.wav
│   │           │   ├── ~rectest-159.wav
│   │           │   ├── ~rectest-15.wav
│   │           │   ├── ~rectest-160.wav
│   │           │   ├── ~rectest-161.wav
│   │           │   ├── ~rectest-162.wav
│   │           │   ├── ~rectest-163.wav
│   │           │   ├── ~rectest-164.wav
│   │           │   ├── ~rectest-165.wav
│   │           │   ├── ~rectest-166.wav
│   │           │   ├── ~rectest-167.wav
│   │           │   ├── ~rectest-168.wav
│   │           │   ├── ~rectest-169.wav
│   │           │   ├── ~rectest-16.wav
│   │           │   ├── ~rectest-170.wav
│   │           │   ├── ~rectest-171.wav
│   │           │   ├── ~rectest-172.wav
│   │           │   ├── ~rectest-173.wav
│   │           │   ├── ~rectest-174.wav
│   │           │   ├── ~rectest-175.wav
│   │           │   ├── ~rectest-176.wav
│   │           │   ├── ~rectest-177.wav
│   │           │   ├── ~rectest-178.wav
│   │           │   ├── ~rectest-179.wav
│   │           │   ├── ~rectest-17.wav
│   │           │   ├── ~rectest-180.wav
│   │           │   ├── ~rectest-181.wav
│   │           │   ├── ~rectest-182.wav
│   │           │   ├── ~rectest-183.wav
│   │           │   ├── ~rectest-184.wav
│   │           │   ├── ~rectest-185.wav
│   │           │   ├── ~rectest-186.wav
│   │           │   ├── ~rectest-187.wav
│   │           │   ├── ~rectest-188.wav
│   │           │   ├── ~rectest-189.wav
│   │           │   ├── ~rectest-18.wav
│   │           │   ├── ~rectest-190.wav
│   │           │   ├── ~rectest-191.wav
│   │           │   ├── ~rectest-192.wav
│   │           │   ├── ~rectest-193.wav
│   │           │   ├── ~rectest-194.wav
│   │           │   ├── ~rectest-195.wav
│   │           │   ├── ~rectest-196.wav
│   │           │   ├── ~rectest-197.wav
│   │           │   ├── ~rectest-198.wav
│   │           │   ├── ~rectest-199.wav
│   │           │   ├── ~rectest-19.wav
│   │           │   ├── ~rectest-200.wav
│   │           │   ├── ~rectest-201.wav
│   │           │   ├── ~rectest-202.wav
│   │           │   ├── ~rectest-203.wav
│   │           │   ├── ~rectest-204.wav
│   │           │   ├── ~rectest-205.wav
│   │           │   ├── ~rectest-206.wav
│   │           │   ├── ~rectest-207.wav
│   │           │   ├── ~rectest-208.wav
│   │           │   ├── ~rectest-209.wav
│   │           │   ├── ~rectest-20.wav
│   │           │   ├── ~rectest-210.wav
│   │           │   ├── ~rectest-211.wav
│   │           │   ├── ~rectest-212.wav
│   │           │   ├── ~rectest-213.wav
│   │           │   ├── ~rectest-214.wav
│   │           │   ├── ~rectest-215.wav
│   │           │   ├── ~rectest-216.wav
│   │           │   ├── ~rectest-217.wav
│   │           │   ├── ~rectest-218.wav
│   │           │   ├── ~rectest-219.wav
│   │           │   ├── ~rectest-21.wav
│   │           │   ├── ~rectest-220.wav
│   │           │   ├── ~rectest-221.wav
│   │           │   ├── ~rectest-222.wav
│   │           │   ├── ~rectest-223.wav
│   │           │   ├── ~rectest-224.wav
│   │           │   ├── ~rectest-225.wav
│   │           │   ├── ~rectest-226.wav
│   │           │   ├── ~rectest-227.wav
│   │           │   ├── ~rectest-228.wav
│   │           │   ├── ~rectest-229.wav
│   │           │   ├── ~rectest-22.wav
│   │           │   ├── ~rectest-230.wav
│   │           │   ├── ~rectest-231.wav
│   │           │   ├── ~rectest-232.wav
│   │           │   ├── ~rectest-233.wav
│   │           │   ├── ~rectest-234.wav
│   │           │   ├── ~rectest-235.wav
│   │           │   ├── ~rectest-236.wav
│   │           │   ├── ~rectest-237.wav
│   │           │   ├── ~rectest-238.wav
│   │           │   ├── ~rectest-239.wav
│   │           │   ├── ~rectest-23.wav
│   │           │   ├── ~rectest-240.wav
│   │           │   ├── ~rectest-241.wav
│   │           │   ├── ~rectest-242.wav
│   │           │   ├── ~rectest-243.wav
│   │           │   ├── ~rectest-244.wav
│   │           │   ├── ~rectest-245.wav
│   │           │   ├── ~rectest-246.wav
│   │           │   ├── ~rectest-247.wav
│   │           │   ├── ~rectest-248.wav
│   │           │   ├── ~rectest-249.wav
│   │           │   ├── ~rectest-24.wav
│   │           │   ├── ~rectest-250.wav
│   │           │   ├── ~rectest-251.wav
│   │           │   ├── ~rectest-252.wav
│   │           │   ├── ~rectest-253.wav
│   │           │   ├── ~rectest-254.wav
│   │           │   ├── ~rectest-255.wav
│   │           │   ├── ~rectest-256.wav
│   │           │   ├── ~rectest-257.wav
│   │           │   ├── ~rectest-258.wav
│   │           │   ├── ~rectest-259.wav
│   │           │   ├── ~rectest-25.wav
│   │           │   ├── ~rectest-260.wav
│   │           │   ├── ~rectest-261.wav
│   │           │   ├── ~rectest-262.wav
│   │           │   ├── ~rectest-263.wav
│   │           │   ├── ~rectest-264.wav
│   │           │   ├── ~rectest-265.wav
│   │           │   ├── ~rectest-266.wav
│   │           │   ├── ~rectest-267.wav
│   │           │   ├── ~rectest-268.wav
│   │           │   ├── ~rectest-269.wav
│   │           │   ├── ~rectest-26.wav
│   │           │   ├── ~rectest-270.wav
│   │           │   ├── ~rectest-271.wav
│   │           │   ├── ~rectest-272.wav
│   │           │   ├── ~rectest-273.wav
│   │           │   ├── ~rectest-274.wav
│   │           │   ├── ~rectest-275.wav
│   │           │   ├── ~rectest-276.wav
│   │           │   ├── ~rectest-277.wav
│   │           │   ├── ~rectest-278.wav
│   │           │   ├── ~rectest-279.wav
│   │           │   ├── ~rectest-27.wav
│   │           │   ├── ~rectest-280.wav
│   │           │   ├── ~rectest-281.wav
│   │           │   ├── ~rectest-282.wav
│   │           │   ├── ~rectest-283.wav
│   │           │   ├── ~rectest-284.wav
│   │           │   ├── ~rectest-285.wav
│   │           │   ├── ~rectest-286.wav
│   │           │   ├── ~rectest-287.wav
│   │           │   ├── ~rectest-288.wav
│   │           │   ├── ~rectest-289.wav
│   │           │   ├── ~rectest-28.wav
│   │           │   ├── ~rectest-290.wav
│   │           │   ├── ~rectest-291.wav
│   │           │   ├── ~rectest-292.wav
│   │           │   ├── ~rectest-293.wav
│   │           │   ├── ~rectest-294.wav
│   │           │   ├── ~rectest-295.wav
│   │           │   ├── ~rectest-296.wav
│   │           │   ├── ~rectest-297.wav
│   │           │   ├── ~rectest-298.wav
│   │           │   ├── ~rectest-299.wav
│   │           │   ├── ~rectest-29.wav
│   │           │   ├── ~rectest-300.wav
│   │           │   ├── ~rectest-301.wav
│   │           │   ├── ~rectest-302.wav
│   │           │   ├── ~rectest-303.wav
│   │           │   ├── ~rectest-304.wav
│   │           │   ├── ~rectest-305.wav
│   │           │   ├── ~rectest-306.wav
│   │           │   ├── ~rectest-307.wav
│   │           │   ├── ~rectest-308.wav
│   │           │   ├── ~rectest-309.wav
│   │           │   ├── ~rectest-30.wav
│   │           │   ├── ~rectest-310.wav
│   │           │   ├── ~rectest-311.wav
│   │           │   ├── ~rectest-312.wav
│   │           │   ├── ~rectest-313.wav
│   │           │   ├── ~rectest-314.wav
│   │           │   ├── ~rectest-315.wav
│   │           │   ├── ~rectest-316.wav
│   │           │   ├── ~rectest-317.wav
│   │           │   ├── ~rectest-318.wav
│   │           │   ├── ~rectest-319.wav
│   │           │   ├── ~rectest-31.wav
│   │           │   ├── ~rectest-320.wav
│   │           │   ├── ~rectest-321.wav
│   │           │   ├── ~rectest-322.wav
│   │           │   ├── ~rectest-323.wav
│   │           │   ├── ~rectest-324.wav
│   │           │   ├── ~rectest-325.wav
│   │           │   ├── ~rectest-326.wav
│   │           │   ├── ~rectest-327.wav
│   │           │   ├── ~rectest-328.wav
│   │           │   ├── ~rectest-329.wav
│   │           │   ├── ~rectest-32.wav
│   │           │   ├── ~rectest-330.wav
│   │           │   ├── ~rectest-331.wav
│   │           │   ├── ~rectest-332.wav
│   │           │   ├── ~rectest-333.wav
│   │           │   ├── ~rectest-334.wav
│   │           │   ├── ~rectest-335.wav
│   │           │   ├── ~rectest-336.wav
│   │           │   ├── ~rectest-337.wav
│   │           │   ├── ~rectest-338.wav
│   │           │   ├── ~rectest-339.wav
│   │           │   ├── ~rectest-33.wav
│   │           │   ├── ~rectest-340.wav
│   │           │   ├── ~rectest-341.wav
│   │           │   ├── ~rectest-342.wav
│   │           │   ├── ~rectest-343.wav
│   │           │   ├── ~rectest-344.wav
│   │           │   ├── ~rectest-345.wav
│   │           │   ├── ~rectest-346.wav
│   │           │   ├── ~rectest-347.wav
│   │           │   ├── ~rectest-348.wav
│   │           │   ├── ~rectest-349.wav
│   │           │   ├── ~rectest-34.wav
│   │           │   ├── ~rectest-350.wav
│   │           │   ├── ~rectest-351.wav
│   │           │   ├── ~rectest-352.wav
│   │           │   ├── ~rectest-353.wav
│   │           │   ├── ~rectest-354.wav
│   │           │   ├── ~rectest-355.wav
│   │           │   ├── ~rectest-356.wav
│   │           │   ├── ~rectest-357.wav
│   │           │   ├── ~rectest-358.wav
│   │           │   ├── ~rectest-359.wav
│   │           │   ├── ~rectest-35.wav
│   │           │   ├── ~rectest-360.wav
│   │           │   ├── ~rectest-361.wav
│   │           │   ├── ~rectest-362.wav
│   │           │   ├── ~rectest-363.wav
│   │           │   ├── ~rectest-364.wav
│   │           │   ├── ~rectest-365.wav
│   │           │   ├── ~rectest-366.wav
│   │           │   ├── ~rectest-367.wav
│   │           │   ├── ~rectest-368.wav
│   │           │   ├── ~rectest-369.wav
│   │           │   ├── ~rectest-36.wav
│   │           │   ├── ~rectest-370.wav
│   │           │   ├── ~rectest-371.wav
│   │           │   ├── ~rectest-372.wav
│   │           │   ├── ~rectest-373.wav
│   │           │   ├── ~rectest-374.wav
│   │           │   ├── ~rectest-375.wav
│   │           │   ├── ~rectest-376.wav
│   │           │   ├── ~rectest-377.wav
│   │           │   ├── ~rectest-378.wav
│   │           │   ├── ~rectest-379.wav
│   │           │   ├── ~rectest-37.wav
│   │           │   ├── ~rectest-380.wav
│   │           │   ├── ~rectest-381.wav
│   │           │   ├── ~rectest-382.wav
│   │           │   ├── ~rectest-383.wav
│   │           │   ├── ~rectest-384.wav
│   │           │   ├── ~rectest-385.wav
│   │           │   ├── ~rectest-386.wav
│   │           │   ├── ~rectest-387.wav
│   │           │   ├── ~rectest-388.wav
│   │           │   ├── ~rectest-389.wav
│   │           │   ├── ~rectest-38.wav
│   │           │   ├── ~rectest-390.wav
│   │           │   ├── ~rectest-391.wav
│   │           │   ├── ~rectest-392.wav
│   │           │   ├── ~rectest-393.wav
│   │           │   ├── ~rectest-394.wav
│   │           │   ├── ~rectest-395.wav
│   │           │   ├── ~rectest-396.wav
│   │           │   ├── ~rectest-397.wav
│   │           │   ├── ~rectest-398.wav
│   │           │   ├── ~rectest-399.wav
│   │           │   ├── ~rectest-39.wav
│   │           │   ├── ~rectest-400.wav
│   │           │   ├── ~rectest-401.wav
│   │           │   ├── ~rectest-402.wav
│   │           │   ├── ~rectest-403.wav
│   │           │   ├── ~rectest-404.wav
│   │           │   ├── ~rectest-405.wav
│   │           │   ├── ~rectest-406.wav
│   │           │   ├── ~rectest-407.wav
│   │           │   ├── ~rectest-408.wav
│   │           │   ├── ~rectest-409.wav
│   │           │   ├── ~rectest-40.wav
│   │           │   ├── ~rectest-410.wav
│   │           │   ├── ~rectest-411.wav
│   │           │   ├── ~rectest-412.wav
│   │           │   ├── ~rectest-413.wav
│   │           │   ├── ~rectest-414.wav
│   │           │   ├── ~rectest-415.wav
│   │           │   ├── ~rectest-416.wav
│   │           │   ├── ~rectest-417.wav
│   │           │   ├── ~rectest-418.wav
│   │           │   ├── ~rectest-419.wav
│   │           │   ├── ~rectest-41.wav
│   │           │   ├── ~rectest-420.wav
│   │           │   ├── ~rectest-421.wav
│   │           │   ├── ~rectest-422.wav
│   │           │   ├── ~rectest-423.wav
│   │           │   ├── ~rectest-424.wav
│   │           │   ├── ~rectest-425.wav
│   │           │   ├── ~rectest-426.wav
│   │           │   ├── ~rectest-427.wav
│   │           │   ├── ~rectest-428.wav
│   │           │   ├── ~rectest-429.wav
│   │           │   ├── ~rectest-42.wav
│   │           │   ├── ~rectest-430.wav
│   │           │   ├── ~rectest-431.wav
│   │           │   ├── ~rectest-432.wav
│   │           │   ├── ~rectest-433.wav
│   │           │   ├── ~rectest-434.wav
│   │           │   ├── ~rectest-435.wav
│   │           │   ├── ~rectest-436.wav
│   │           │   ├── ~rectest-437.wav
│   │           │   ├── ~rectest-438.wav
│   │           │   ├── ~rectest-439.wav
│   │           │   ├── ~rectest-43.wav
│   │           │   ├── ~rectest-440.wav
│   │           │   ├── ~rectest-441.wav
│   │           │   ├── ~rectest-442.wav
│   │           │   ├── ~rectest-443.wav
│   │           │   ├── ~rectest-444.wav
│   │           │   ├── ~rectest-445.wav
│   │           │   ├── ~rectest-446.wav
│   │           │   ├── ~rectest-447.wav
│   │           │   ├── ~rectest-448.wav
│   │           │   ├── ~rectest-449.wav
│   │           │   ├── ~rectest-44.wav
│   │           │   ├── ~rectest-450.wav
│   │           │   ├── ~rectest-451.wav
│   │           │   ├── ~rectest-452.wav
│   │           │   ├── ~rectest-453.wav
│   │           │   ├── ~rectest-454.wav
│   │           │   ├── ~rectest-455.wav
│   │           │   ├── ~rectest-456.wav
│   │           │   ├── ~rectest-457.wav
│   │           │   ├── ~rectest-458.wav
│   │           │   ├── ~rectest-459.wav
│   │           │   ├── ~rectest-45.wav
│   │           │   ├── ~rectest-460.wav
│   │           │   ├── ~rectest-461.wav
│   │           │   ├── ~rectest-462.wav
│   │           │   ├── ~rectest-463.wav
│   │           │   ├── ~rectest-464.wav
│   │           │   ├── ~rectest-465.wav
│   │           │   ├── ~rectest-466.wav
│   │           │   ├── ~rectest-467.wav
│   │           │   ├── ~rectest-468.wav
│   │           │   ├── ~rectest-469.wav
│   │           │   ├── ~rectest-46.wav
│   │           │   ├── ~rectest-470.wav
│   │           │   ├── ~rectest-471.wav
│   │           │   ├── ~rectest-472.wav
│   │           │   ├── ~rectest-473.wav
│   │           │   ├── ~rectest-474.wav
│   │           │   ├── ~rectest-475.wav
│   │           │   ├── ~rectest-476.wav
│   │           │   ├── ~rectest-477.wav
│   │           │   ├── ~rectest-478.wav
│   │           │   ├── ~rectest-479.wav
│   │           │   ├── ~rectest-47.wav
│   │           │   ├── ~rectest-480.wav
│   │           │   ├── ~rectest-481.wav
│   │           │   ├── ~rectest-482.wav
│   │           │   ├── ~rectest-483.wav
│   │           │   ├── ~rectest-484.wav
│   │           │   ├── ~rectest-485.wav
│   │           │   ├── ~rectest-486.wav
│   │           │   ├── ~rectest-487.wav
│   │           │   ├── ~rectest-488.wav
│   │           │   ├── ~rectest-489.wav
│   │           │   ├── ~rectest-48.wav
│   │           │   ├── ~rectest-490.wav
│   │           │   ├── ~rectest-491.wav
│   │           │   ├── ~rectest-492.wav
│   │           │   ├── ~rectest-493.wav
│   │           │   ├── ~rectest-494.wav
│   │           │   ├── ~rectest-495.wav
│   │           │   ├── ~rectest-496.wav
│   │           │   ├── ~rectest-497.wav
│   │           │   ├── ~rectest-498.wav
│   │           │   ├── ~rectest-499.wav
│   │           │   ├── ~rectest-49.wav
│   │           │   ├── ~rectest-500.wav
│   │           │   ├── ~rectest-501.wav
│   │           │   ├── ~rectest-502.wav
│   │           │   ├── ~rectest-503.wav
│   │           │   ├── ~rectest-504.wav
│   │           │   ├── ~rectest-505.wav
│   │           │   ├── ~rectest-506.wav
│   │           │   ├── ~rectest-507.wav
│   │           │   ├── ~rectest-508.wav
│   │           │   ├── ~rectest-509.wav
│   │           │   ├── ~rectest-50.wav
│   │           │   ├── ~rectest-510.wav
│   │           │   ├── ~rectest-511.wav
│   │           │   ├── ~rectest-512.wav
│   │           │   ├── ~rectest-513.wav
│   │           │   ├── ~rectest-514.wav
│   │           │   ├── ~rectest-515.wav
│   │           │   ├── ~rectest-516.wav
│   │           │   ├── ~rectest-517.wav
│   │           │   ├── ~rectest-518.wav
│   │           │   ├── ~rectest-519.wav
│   │           │   ├── ~rectest-51.wav
│   │           │   ├── ~rectest-520.wav
│   │           │   ├── ~rectest-521.wav
│   │           │   ├── ~rectest-522.wav
│   │           │   ├── ~rectest-523.wav
│   │           │   ├── ~rectest-524.wav
│   │           │   ├── ~rectest-525.wav
│   │           │   ├── ~rectest-526.wav
│   │           │   ├── ~rectest-527.wav
│   │           │   ├── ~rectest-528.wav
│   │           │   ├── ~rectest-529.wav
│   │           │   ├── ~rectest-52.wav
│   │           │   ├── ~rectest-530.wav
│   │           │   ├── ~rectest-531.wav
│   │           │   ├── ~rectest-532.wav
│   │           │   ├── ~rectest-533.wav
│   │           │   ├── ~rectest-534.wav
│   │           │   ├── ~rectest-535.wav
│   │           │   ├── ~rectest-536.wav
│   │           │   ├── ~rectest-537.wav
│   │           │   ├── ~rectest-538.wav
│   │           │   ├── ~rectest-539.wav
│   │           │   ├── ~rectest-53.wav
│   │           │   ├── ~rectest-540.wav
│   │           │   ├── ~rectest-541.wav
│   │           │   ├── ~rectest-542.wav
│   │           │   ├── ~rectest-543.wav
│   │           │   ├── ~rectest-544.wav
│   │           │   ├── ~rectest-545.wav
│   │           │   ├── ~rectest-546.wav
│   │           │   ├── ~rectest-547.wav
│   │           │   ├── ~rectest-548.wav
│   │           │   ├── ~rectest-549.wav
│   │           │   ├── ~rectest-54.wav
│   │           │   ├── ~rectest-550.wav
│   │           │   ├── ~rectest-551.wav
│   │           │   ├── ~rectest-552.wav
│   │           │   ├── ~rectest-553.wav
│   │           │   ├── ~rectest-554.wav
│   │           │   ├── ~rectest-555.wav
│   │           │   ├── ~rectest-556.wav
│   │           │   ├── ~rectest-557.wav
│   │           │   ├── ~rectest-558.wav
│   │           │   ├── ~rectest-559.wav
│   │           │   ├── ~rectest-55.wav
│   │           │   ├── ~rectest-560.wav
│   │           │   ├── ~rectest-561.wav
│   │           │   ├── ~rectest-562.wav
│   │           │   ├── ~rectest-563.wav
│   │           │   ├── ~rectest-564.wav
│   │           │   ├── ~rectest-565.wav
│   │           │   ├── ~rectest-566.wav
│   │           │   ├── ~rectest-567.wav
│   │           │   ├── ~rectest-568.wav
│   │           │   ├── ~rectest-569.wav
│   │           │   ├── ~rectest-56.wav
│   │           │   ├── ~rectest-570.wav
│   │           │   ├── ~rectest-571.wav
│   │           │   ├── ~rectest-572.wav
│   │           │   ├── ~rectest-573.wav
│   │           │   ├── ~rectest-574.wav
│   │           │   ├── ~rectest-575.wav
│   │           │   ├── ~rectest-576.wav
│   │           │   ├── ~rectest-577.wav
│   │           │   ├── ~rectest-578.wav
│   │           │   ├── ~rectest-579.wav
│   │           │   ├── ~rectest-57.wav
│   │           │   ├── ~rectest-580.wav
│   │           │   ├── ~rectest-581.wav
│   │           │   ├── ~rectest-582.wav
│   │           │   ├── ~rectest-583.wav
│   │           │   ├── ~rectest-584.wav
│   │           │   ├── ~rectest-585.wav
│   │           │   ├── ~rectest-586.wav
│   │           │   ├── ~rectest-587.wav
│   │           │   ├── ~rectest-588.wav
│   │           │   ├── ~rectest-589.wav
│   │           │   ├── ~rectest-58.wav
│   │           │   ├── ~rectest-590.wav
│   │           │   ├── ~rectest-591.wav
│   │           │   ├── ~rectest-592.wav
│   │           │   ├── ~rectest-593.wav
│   │           │   ├── ~rectest-594.wav
│   │           │   ├── ~rectest-595.wav
│   │           │   ├── ~rectest-596.wav
│   │           │   ├── ~rectest-597.wav
│   │           │   ├── ~rectest-598.wav
│   │           │   ├── ~rectest-599.wav
│   │           │   ├── ~rectest-59.wav
│   │           │   ├── ~rectest-600.wav
│   │           │   ├── ~rectest-601.wav
│   │           │   ├── ~rectest-602.wav
│   │           │   ├── ~rectest-603.wav
│   │           │   ├── ~rectest-604.wav
│   │           │   ├── ~rectest-605.wav
│   │           │   ├── ~rectest-606.wav
│   │           │   ├── ~rectest-607.wav
│   │           │   ├── ~rectest-608.wav
│   │           │   ├── ~rectest-609.wav
│   │           │   ├── ~rectest-60.wav
│   │           │   ├── ~rectest-610.wav
│   │           │   ├── ~rectest-611.wav
│   │           │   ├── ~rectest-612.wav
│   │           │   ├── ~rectest-613.wav
│   │           │   ├── ~rectest-614.wav
│   │           │   ├── ~rectest-615.wav
│   │           │   ├── ~rectest-616.wav
│   │           │   ├── ~rectest-617.wav
│   │           │   ├── ~rectest-618.wav
│   │           │   ├── ~rectest-619.wav
│   │           │   ├── ~rectest-61.wav
│   │           │   ├── ~rectest-620.wav
│   │           │   ├── ~rectest-621.wav
│   │           │   ├── ~rectest-622.wav
│   │           │   ├── ~rectest-623.wav
│   │           │   ├── ~rectest-624.wav
│   │           │   ├── ~rectest-625.wav
│   │           │   ├── ~rectest-626.wav
│   │           │   ├── ~rectest-627.wav
│   │           │   ├── ~rectest-628.wav
│   │           │   ├── ~rectest-629.wav
│   │           │   ├── ~rectest-62.wav
│   │           │   ├── ~rectest-630.wav
│   │           │   ├── ~rectest-631.wav
│   │           │   ├── ~rectest-632.wav
│   │           │   ├── ~rectest-633.wav
│   │           │   ├── ~rectest-634.wav
│   │           │   ├── ~rectest-635.wav
│   │           │   ├── ~rectest-636.wav
│   │           │   ├── ~rectest-637.wav
│   │           │   ├── ~rectest-638.wav
│   │           │   ├── ~rectest-639.wav
│   │           │   ├── ~rectest-63.wav
│   │           │   ├── ~rectest-640.wav
│   │           │   ├── ~rectest-641.wav
│   │           │   ├── ~rectest-642.wav
│   │           │   ├── ~rectest-643.wav
│   │           │   ├── ~rectest-644.wav
│   │           │   ├── ~rectest-645.wav
│   │           │   ├── ~rectest-646.wav
│   │           │   ├── ~rectest-647.wav
│   │           │   ├── ~rectest-648.wav
│   │           │   ├── ~rectest-649.wav
│   │           │   ├── ~rectest-64.wav
│   │           │   ├── ~rectest-650.wav
│   │           │   ├── ~rectest-651.wav
│   │           │   ├── ~rectest-652.wav
│   │           │   ├── ~rectest-653.wav
│   │           │   ├── ~rectest-654.wav
│   │           │   ├── ~rectest-655.wav
│   │           │   ├── ~rectest-656.wav
│   │           │   ├── ~rectest-657.wav
│   │           │   ├── ~rectest-658.wav
│   │           │   ├── ~rectest-659.wav
│   │           │   ├── ~rectest-65.wav
│   │           │   ├── ~rectest-660.wav
│   │           │   ├── ~rectest-661.wav
│   │           │   ├── ~rectest-662.wav
│   │           │   ├── ~rectest-663.wav
│   │           │   ├── ~rectest-664.wav
│   │           │   ├── ~rectest-665.wav
│   │           │   ├── ~rectest-666.wav
│   │           │   ├── ~rectest-667.wav
│   │           │   ├── ~rectest-668.wav
│   │           │   ├── ~rectest-669.wav
│   │           │   ├── ~rectest-66.wav
│   │           │   ├── ~rectest-670.wav
│   │           │   ├── ~rectest-671.wav
│   │           │   ├── ~rectest-672.wav
│   │           │   ├── ~rectest-673.wav
│   │           │   ├── ~rectest-674.wav
│   │           │   ├── ~rectest-675.wav
│   │           │   ├── ~rectest-676.wav
│   │           │   ├── ~rectest-677.wav
│   │           │   ├── ~rectest-678.wav
│   │           │   ├── ~rectest-679.wav
│   │           │   ├── ~rectest-67.wav
│   │           │   ├── ~rectest-680.wav
│   │           │   ├── ~rectest-681.wav
│   │           │   ├── ~rectest-682.wav
│   │           │   ├── ~rectest-683.wav
│   │           │   ├── ~rectest-684.wav
│   │           │   ├── ~rectest-685.wav
│   │           │   ├── ~rectest-686.wav
│   │           │   ├── ~rectest-687.wav
│   │           │   ├── ~rectest-688.wav
│   │           │   ├── ~rectest-689.wav
│   │           │   ├── ~rectest-68.wav
│   │           │   ├── ~rectest-690.wav
│   │           │   ├── ~rectest-691.wav
│   │           │   ├── ~rectest-692.wav
│   │           │   ├── ~rectest-693.wav
│   │           │   ├── ~rectest-694.wav
│   │           │   ├── ~rectest-695.wav
│   │           │   ├── ~rectest-696.wav
│   │           │   ├── ~rectest-697.wav
│   │           │   ├── ~rectest-698.wav
│   │           │   ├── ~rectest-699.wav
│   │           │   ├── ~rectest-69.wav
│   │           │   ├── ~rectest-700.wav
│   │           │   ├── ~rectest-701.wav
│   │           │   ├── ~rectest-702.wav
│   │           │   ├── ~rectest-703.wav
│   │           │   ├── ~rectest-704.wav
│   │           │   ├── ~rectest-705.wav
│   │           │   ├── ~rectest-706.wav
│   │           │   ├── ~rectest-707.wav
│   │           │   ├── ~rectest-708.wav
│   │           │   ├── ~rectest-709.wav
│   │           │   ├── ~rectest-70.wav
│   │           │   ├── ~rectest-710.wav
│   │           │   ├── ~rectest-71.wav
│   │           │   ├── ~rectest-72.wav
│   │           │   ├── ~rectest-73.wav
│   │           │   ├── ~rectest-74.wav
│   │           │   ├── ~rectest-75.wav
│   │           │   ├── ~rectest-76.wav
│   │           │   ├── ~rectest-77.wav
│   │           │   ├── ~rectest-78.wav
│   │           │   ├── ~rectest-79.wav
│   │           │   ├── ~rectest-80.wav
│   │           │   ├── ~rectest-81.wav
│   │           │   ├── ~rectest-82.wav
│   │           │   ├── ~rectest-83.wav
│   │           │   ├── ~rectest-84.wav
│   │           │   ├── ~rectest-85.wav
│   │           │   ├── ~rectest-86.wav
│   │           │   ├── ~rectest-87.wav
│   │           │   ├── ~rectest-88.wav
│   │           │   ├── ~rectest-89.wav
│   │           │   ├── ~rectest-90.wav
│   │           │   ├── ~rectest-91.wav
│   │           │   ├── ~rectest-92.wav
│   │           │   ├── ~rectest-93.wav
│   │           │   ├── ~rectest-94.wav
│   │           │   ├── ~rectest-95.wav
│   │           │   ├── ~rectest-96.wav
│   │           │   ├── ~rectest-97.wav
│   │           │   ├── ~rectest-98.wav
│   │           │   ├── ~rectest-99.wav
│   │           │   ├── SensoryWakeWordEngine.cpp
│   │           │   ├── SensoryWakeWordEngine.h
│   │           │   ├── shairport
│   │           │   │   ├── alac.c
│   │           │   │   ├── alac.h
│   │           │   │   ├── hairtunes.c
│   │           │   │   ├── hairtunes.h
│   │           │   │   ├── INSTALL.md
│   │           │   │   ├── LICENSE
│   │           │   │   ├── Makefile
│   │           │   │   ├── org.mafipulation.shairport.plist
│   │           │   │   ├── README.md
│   │           │   │   ├── shairport.c
│   │           │   │   ├── shairport.h
│   │           │   │   ├── shairport.init.sample
│   │           │   │   ├── shairport.pl
│   │           │   │   ├── socketlib.c
│   │           │   │   └── socketlib.h
│   │           │   ├── wakeWordAgent
│   │           │   ├── WakeWordAgent.cpp
│   │           │   ├── WakeWordAgent.h
│   │           │   ├── WakeWordDetectedInterface.h
│   │           │   ├── WakeWordEngine.cpp
│   │           │   ├── WakeWordEngineFactory.cpp
│   │           │   ├── WakeWordEngineFactory.h
│   │           │   ├── WakeWordEngine.h
│   │           │   ├── WakeWordException.cpp
│   │           │   ├── WakeWordException.h
│   │           │   ├── WakeWordIPC.cpp
│   │           │   ├── WakeWordIPCFactory.cpp
│   │           │   ├── WakeWordIPCFactory.h
│   │           │   ├── WakeWordIPC.h
│   │           │   ├── WakeWordIPCSocket.cpp
│   │           │   ├── WakeWordIPCSocket.h
│   │           │   └── WakeWordUtils.h
│   │           └── tst
│   │               ├── CMakeCache.txt
│   │               ├── CMakeFiles
│   │               │   ├── 3.6.2
│   │               │   │   ├── CMakeCCompiler.cmake
│   │               │   │   ├── CMakeCXXCompiler.cmake
│   │               │   │   ├── CMakeDetermineCompilerABI_C.bin
│   │               │   │   ├── CMakeDetermineCompilerABI_CXX.bin
│   │               │   │   ├── CMakeSystem.cmake
│   │               │   │   ├── CompilerIdC
│   │               │   │   │   ├── a.out
│   │               │   │   │   └── CMakeCCompilerId.c
│   │               │   │   └── CompilerIdCXX
│   │               │   │       ├── a.out
│   │               │   │       └── CMakeCXXCompilerId.cpp
│   │               │   ├── cmake.check_cache
│   │               │   ├── CMakeDirectoryInformation.cmake
│   │               │   ├── CMakeError.log
│   │               │   ├── CMakeOutput.log
│   │               │   ├── feature_tests.bin
│   │               │   ├── feature_tests.c
│   │               │   ├── feature_tests.cxx
│   │               │   ├── Makefile2
│   │               │   ├── Makefile.cmake
│   │               │   ├── progress.marks
│   │               │   ├── TargetDirectories.txt
│   │               │   └── wakeWordAgentTest.dir
│   │               │       ├── build.make
│   │               │       ├── cmake_clean.cmake
│   │               │       ├── CXX.includecache
│   │               │       ├── DependInfo.cmake
│   │               │       ├── depend.internal
│   │               │       ├── depend.make
│   │               │       ├── flags.make
│   │               │       ├── home
│   │               │       │   └── pi
│   │               │       │       └── Desktop
│   │               │       │           └── alexa-avs-sample-app
│   │               │       │               └── samples
│   │               │       │                   └── wakeWordAgent
│   │               │       │                       └── src
│   │               │       │                           ├── GPIOWakeWordEngine.cpp.o
│   │               │       │                           ├── IPCInterface.cpp.o
│   │               │       │                           ├── KittAiSnowboyWakeWordEngine.cpp.o
│   │               │       │                           ├── Logger.cpp.o
│   │               │       │                           ├── PortAudioWrapper.cpp.o
│   │               │       │                           ├── SensoryWakeWordEngine.cpp.o
│   │               │       │                           ├── WakeWordAgent.cpp.o
│   │               │       │                           ├── WakeWordEngine.cpp.o
│   │               │       │                           ├── WakeWordEngineFactory.cpp.o
│   │               │       │                           ├── WakeWordException.cpp.o
│   │               │       │                           ├── WakeWordIPC.cpp.o
│   │               │       │                           ├── WakeWordIPCFactory.cpp.o
│   │               │       │                           └── WakeWordIPCSocket.cpp.o
│   │               │       ├── link.txt
│   │               │       ├── main.cpp.o
│   │               │       ├── progress.make
│   │               │       ├── testGPIO.cpp.o
│   │               │       ├── testIPCFactory.cpp.o
│   │               │       ├── testKittAi.cpp.o
│   │               │       ├── testLogger.cpp.o
│   │               │       └── testSensory.cpp.o
│   │               ├── cmake_install.cmake
│   │               ├── CMakeLists.txt
│   │               ├── ext
│   │               │   ├── include
│   │               │   │   ├── pa_ringbuffer.h
│   │               │   │   ├── pa_util.h
│   │               │   │   ├── portaudio.h
│   │               │   │   ├── snowboy-detect.h
│   │               │   │   └── snsr.h
│   │               │   ├── lib
│   │               │   │   ├── libportaudio.a
│   │               │   │   ├── libsnowboy-detect.a
│   │               │   │   └── libsnsr.a
│   │               │   └── resources
│   │               │       ├── alexa.umdl
│   │               │       ├── common.res
│   │               │       └── spot-alexa-rpi.snsr
│   │               ├── main.cpp
│   │               ├── Makefile
│   │               ├── testGPIO.cpp
│   │               ├── testGPIO.h
│   │               ├── testIPCFactory.cpp
│   │               ├── testIPCFactory.h
│   │               ├── testKittAi.cpp
│   │               ├── testKittAi.h
│   │               ├── testLogger.cpp
│   │               ├── testLogger.h
│   │               ├── testSensory.cpp
│   │               ├── testSensory.h
│   │               └── wakeWordAgentTest
│   ├── readme.txt
│   └── shairport
│       ├── alac.c
│       ├── alac.h
│       ├── alac.o
│       ├── hairtunes
│       ├── hairtunes.c
│       ├── hairtunes.h
│       ├── hairtunes.o
│       ├── INSTALL.md
│       ├── LICENSE
│       ├── Makefile
│       ├── org.mafipulation.shairport.plist
│       ├── README.md
│       ├── shairport
│       ├── shairport.c
│       ├── shairport.h
│       ├── shairport.init.sample
│       ├── shairport.o
│       ├── shairport.pl
│       ├── socketlib.c
│       ├── socketlib.h
│       └── socketlib.o
├── AndriodApps
│   ├── icon.PNG
│   ├── IndoorPositioningSystemApp
│   │   ├── app
│   │   │   ├── build.gradle
│   │   │   ├── CMakeLists.txt
│   │   │   ├── proguard-rules.pro
│   │   │   └── src
│   │   │       ├── androidTest
│   │   │       │   └── java
│   │   │       │       └── comrusegroup12se
│   │   │       │           └── github
│   │   │       │               └── indoorpositioningsystem
│   │   │       │                   └── ExampleInstrumentedTest.java
│   │   │       ├── main
│   │   │       │   ├── AndroidManifest.xml
│   │   │       │   ├── cpp
│   │   │       │   │   └── native-lib.cpp
│   │   │       │   ├── java
│   │   │       │   │   └── comrusegroup12se
│   │   │       │   │       └── github
│   │   │       │   │           └── indoorpositioningsystem
│   │   │       │   │               └── MainActivity.java
│   │   │       │   └── res
│   │   │       │       ├── layout
│   │   │       │       │   └── activity_main.xml
│   │   │       │       ├── mipmap-hdpi
│   │   │       │       │   ├── ic_launcher.png
│   │   │       │       │   └── ic_launcher_round.png
│   │   │       │       ├── mipmap-mdpi
│   │   │       │       │   ├── ic_launcher.png
│   │   │       │       │   └── ic_launcher_round.png
│   │   │       │       ├── mipmap-xhdpi
│   │   │       │       │   ├── ic_launcher.png
│   │   │       │       │   └── ic_launcher_round.png
│   │   │       │       ├── mipmap-xxhdpi
│   │   │       │       │   ├── ic_launcher.png
│   │   │       │       │   └── ic_launcher_round.png
│   │   │       │       ├── mipmap-xxxhdpi
│   │   │       │       │   ├── ic_launcher.png
│   │   │       │       │   └── ic_launcher_round.png
│   │   │       │       └── values
│   │   │       │           ├── colors.xml
│   │   │       │           ├── strings.xml
│   │   │       │           └── styles.xml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── comrusegroup12se
│   │   │                   └── github
│   │   │                       └── indoorpositioningsystem
│   │   │                           └── ExampleUnitTest.java
│   │   ├── build.gradle
│   │   ├── gradle
│   │   │   └── wrapper
│   │   │       ├── gradle-wrapper.jar
│   │   │       └── gradle-wrapper.properties
│   │   ├── gradle.properties
│   │   ├── gradlew
│   │   ├── gradlew.bat
│   │   └── settings.gradle
│   ├── OldApps
│   │   ├── HVAC
│   │   │   ├── app
│   │   │   │   ├── build.gradle
│   │   │   │   ├── proguard-rules.pro
│   │   │   │   └── src
│   │   │   │       ├── androidTest
│   │   │   │       │   └── java
│   │   │   │       │       └── com
│   │   │   │       │           └── example
│   │   │   │       │               └── nick
│   │   │   │       │                   └── sendbroadcast
│   │   │   │       │                       └── ApplicationTest.java
│   │   │   │       ├── main
│   │   │   │       │   ├── AndroidManifest.xml
│   │   │   │       │   ├── java
│   │   │   │       │   │   └── com
│   │   │   │       │   │       └── example
│   │   │   │       │   │           └── nick
│   │   │   │       │   │               └── sendbroadcast
│   │   │   │       │   │                   └── MainActivity.java
│   │   │   │       │   └── res
│   │   │   │       │       ├── layout
│   │   │   │       │       │   └── activity_main.xml
│   │   │   │       │       ├── mipmap-hdpi
│   │   │   │       │       │   └── ic_launcher.png
│   │   │   │       │       ├── mipmap-mdpi
│   │   │   │       │       │   └── ic_launcher.png
│   │   │   │       │       ├── mipmap-xhdpi
│   │   │   │       │       │   └── ic_launcher.png
│   │   │   │       │       ├── mipmap-xxhdpi
│   │   │   │       │       │   └── ic_launcher.png
│   │   │   │       │       ├── mipmap-xxxhdpi
│   │   │   │       │       │   └── ic_launcher.png
│   │   │   │       │       ├── values
│   │   │   │       │       │   ├── colors.xml
│   │   │   │       │       │   ├── dimens.xml
│   │   │   │       │       │   ├── strings.xml
│   │   │   │       │       │   └── styles.xml
│   │   │   │       │       └── values-w820dp
│   │   │   │       │           └── dimens.xml
│   │   │   │       └── test
│   │   │   │           └── java
│   │   │   │               └── com
│   │   │   │                   └── example
│   │   │   │                       └── nick
│   │   │   │                           └── sendbroadcast
│   │   │   │                               └── ExampleUnitTest.java
│   │   │   ├── build.gradle
│   │   │   ├── gradle
│   │   │   │   └── wrapper
│   │   │   │       ├── gradle-wrapper.jar
│   │   │   │       └── gradle-wrapper.properties
│   │   │   ├── gradle.properties
│   │   │   ├── gradlew
│   │   │   ├── gradlew.bat
│   │   │   └── settings.gradle
│   │   ├── SAS_app
│   │   │   ├── app
│   │   │   │   ├── build.gradle
│   │   │   │   ├── proguard-rules.pro
│   │   │   │   └── src
│   │   │   │       ├── androidTest
│   │   │   │       │   └── java
│   │   │   │       │       └── com
│   │   │   │       │           └── example
│   │   │   │       │               └── akhil
│   │   │   │       │                   └── sas_app
│   │   │   │       │                       └── ExampleInstrumentedTest.java
│   │   │   │       ├── main
│   │   │   │       │   ├── AndroidManifest.xml
│   │   │   │       │   ├── ic_launcher-web.png
│   │   │   │       │   ├── java
│   │   │   │       │   │   └── com
│   │   │   │       │   │       └── example
│   │   │   │       │   │           └── akhil
│   │   │   │       │   │               └── sas_app
│   │   │   │       │   │                   └── MainActivity.java
│   │   │   │       │   └── res
│   │   │   │       │       ├── layout
│   │   │   │       │       │   └── activity_main.xml
│   │   │   │       │       ├── mipmap-hdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-mdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── raw
│   │   │   │       │       │   └── song.mp3
│   │   │   │       │       └── values
│   │   │   │       │           ├── colors.xml
│   │   │   │       │           ├── strings.xml
│   │   │   │       │           └── styles.xml
│   │   │   │       └── test
│   │   │   │           └── java
│   │   │   │               └── com
│   │   │   │                   └── example
│   │   │   │                       └── akhil
│   │   │   │                           └── sas_app
│   │   │   │                               └── ExampleUnitTest.java
│   │   │   ├── build.gradle
│   │   │   ├── gradle
│   │   │   │   └── wrapper
│   │   │   │       ├── gradle-wrapper.jar
│   │   │   │       └── gradle-wrapper.properties
│   │   │   ├── gradle.properties
│   │   │   ├── gradlew
│   │   │   ├── gradlew.bat
│   │   │   └── settings.gradle
│   │   ├── Schedule
│   │   │   ├── app
│   │   │   │   ├── build.gradle
│   │   │   │   ├── proguard-rules.pro
│   │   │   │   └── src
│   │   │   │       ├── androidTest
│   │   │   │       │   └── java
│   │   │   │       │       └── com
│   │   │   │       │           └── huyphan
│   │   │   │       │               └── schedule
│   │   │   │       │                   └── ExampleInstrumentedTest.java
│   │   │   │       ├── debug
│   │   │   │       │   └── res
│   │   │   │       │       └── values
│   │   │   │       │           └── google_maps_api.xml
│   │   │   │       ├── main
│   │   │   │       │   ├── AndroidManifest.xml
│   │   │   │       │   ├── java
│   │   │   │       │   │   └── com
│   │   │   │       │   │       └── huyphan
│   │   │   │       │   │           └── schedule
│   │   │   │       │   │               ├── MainActivity.java
│   │   │   │       │   │               ├── MapsActivity.java
│   │   │   │       │   │               └── PredictionActivity.java
│   │   │   │       │   └── res
│   │   │   │       │       ├── layout
│   │   │   │       │       │   ├── activity_main.xml
│   │   │   │       │       │   ├── activity_maps.xml
│   │   │   │       │       │   └── activity_prediction.xml
│   │   │   │       │       ├── mipmap-hdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-mdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       └── values
│   │   │   │       │           ├── colors.xml
│   │   │   │       │           ├── strings.xml
│   │   │   │       │           └── styles.xml
│   │   │   │       ├── release
│   │   │   │       │   └── res
│   │   │   │       │       └── values
│   │   │   │       │           └── google_maps_api.xml
│   │   │   │       └── test
│   │   │   │           └── java
│   │   │   │               └── com
│   │   │   │                   └── huyphan
│   │   │   │                       └── schedule
│   │   │   │                           └── ExampleUnitTest.java
│   │   │   ├── build.gradle
│   │   │   ├── gradle
│   │   │   │   └── wrapper
│   │   │   │       ├── gradle-wrapper.jar
│   │   │   │       └── gradle-wrapper.properties
│   │   │   ├── gradle.properties
│   │   │   ├── gradlew
│   │   │   ├── gradlew.bat
│   │   │   └── settings.gradle
│   │   ├── SE
│   │   │   ├── app
│   │   │   │   ├── build.gradle
│   │   │   │   ├── proguard-rules.pro
│   │   │   │   └── src
│   │   │   │       ├── androidTest
│   │   │   │       │   └── java
│   │   │   │       │       └── comrusegroup12
│   │   │   │       │           └── github
│   │   │   │       │               └── se
│   │   │   │       │                   └── ExampleInstrumentedTest.java
│   │   │   │       ├── main
│   │   │   │       │   ├── AndroidManifest.xml
│   │   │   │       │   ├── java
│   │   │   │       │   │   └── comrusegroup12
│   │   │   │       │   │       └── github
│   │   │   │       │   │           └── se
│   │   │   │       │   │               └── MainActivity.java
│   │   │   │       │   └── res
│   │   │   │       │       ├── layout
│   │   │   │       │       │   └── activity_main.xml
│   │   │   │       │       ├── mipmap-hdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-mdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       └── values
│   │   │   │       │           ├── colors.xml
│   │   │   │       │           ├── strings.xml
│   │   │   │       │           └── styles.xml
│   │   │   │       └── test
│   │   │   │           └── java
│   │   │   │               └── comrusegroup12
│   │   │   │                   └── github
│   │   │   │                       └── se
│   │   │   │                           └── ExampleUnitTest.java
│   │   │   ├── build.gradle
│   │   │   ├── gradle
│   │   │   │   └── wrapper
│   │   │   │       ├── gradle-wrapper.jar
│   │   │   │       └── gradle-wrapper.properties
│   │   │   ├── gradle.properties
│   │   │   ├── gradlew
│   │   │   ├── gradlew.bat
│   │   │   └── settings.gradle
│   │   ├── SHS_Primary_App
│   │   │   ├── app
│   │   │   │   ├── build.gradle
│   │   │   │   ├── proguard-rules.pro
│   │   │   │   └── src
│   │   │   │       ├── androidTest
│   │   │   │       │   └── java
│   │   │   │       │       └── comrusegroup12
│   │   │   │       │           └── github
│   │   │   │       │               └── shs
│   │   │   │       │                   └── ExampleInstrumentedTest.java
│   │   │   │       ├── main
│   │   │   │       │   ├── AndroidManifest.xml
│   │   │   │       │   ├── java
│   │   │   │       │   │   └── comrusegroup12
│   │   │   │       │   │       └── github
│   │   │   │       │   │           └── shs
│   │   │   │       │   │               ├── Fragment_Audio.java
│   │   │   │       │   │               ├── Fragment_HVAC.java
│   │   │   │       │   │               ├── Fragment_Schedule.java
│   │   │   │       │   │               ├── MainActivity.java
│   │   │   │       │   │               └── SharedPreferencesUtil.java
│   │   │   │       │   └── res
│   │   │   │       │       ├── layout
│   │   │   │       │       │   ├── activity_main.xml
│   │   │   │       │       │   ├── fragment_audio.xml
│   │   │   │       │       │   ├── fragment_hvac.xml
│   │   │   │       │       │   └── fragment_schedule.xml
│   │   │   │       │       ├── menu
│   │   │   │       │       │   └── menu_main.xml
│   │   │   │       │       ├── mipmap-hdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-mdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── mipmap-xxxhdpi
│   │   │   │       │       │   ├── ic_launcher.png
│   │   │   │       │       │   └── ic_launcher_round.png
│   │   │   │       │       ├── raw
│   │   │   │       │       │   └── song.mp3
│   │   │   │       │       ├── values
│   │   │   │       │       │   ├── colors.xml
│   │   │   │       │       │   ├── dimens.xml
│   │   │   │       │       │   ├── strings.xml
│   │   │   │       │       │   └── styles.xml
│   │   │   │       │       └── values-w820dp
│   │   │   │       │           └── dimens.xml
│   │   │   │       └── test
│   │   │   │           └── java
│   │   │   │               └── comrusegroup12
│   │   │   │                   └── github
│   │   │   │                       └── shs
│   │   │   │                           └── ExampleUnitTest.java
│   │   │   ├── build.gradle
│   │   │   ├── gradle
│   │   │   │   └── wrapper
│   │   │   │       ├── gradle-wrapper.jar
│   │   │   │       └── gradle-wrapper.properties
│   │   │   ├── gradle.properties
│   │   │   ├── gradlew
│   │   │   ├── gradlew.bat
│   │   │   └── settings.gradle
│   │   └── SmartHomeSystem
│   │       ├── app
│   │       │   ├── app.iml
│   │       │   ├── build.gradle
│   │       │   ├── proguard-rules.pro
│   │       │   └── src
│   │       │       ├── androidTest
│   │       │       │   └── java
│   │       │       │       └── comrusegroup12
│   │       │       │           └── github
│   │       │       │               └── smarthomesystem
│   │       │       │                   └── ExampleInstrumentedTest.java
│   │       │       ├── main
│   │       │       │   ├── AndroidManifest.xml
│   │       │       │   ├── java
│   │       │       │   │   └── comrusegroup12
│   │       │       │   │       └── github
│   │       │       │   │           └── smarthomesystem
│   │       │       │   │               ├── Audio.java
│   │       │       │   │               ├── data
│   │       │       │   │               │   └── HVACContract.java
│   │       │       │   │               ├── HVAC.java
│   │       │       │   │               └── MainActivity.java
│   │       │       │   └── res
│   │       │       │       ├── layout
│   │       │       │       │   ├── activity_audio.xml
│   │       │       │       │   ├── activity_hvac.xml
│   │       │       │       │   └── activity_main.xml
│   │       │       │       ├── mipmap-hdpi
│   │       │       │       │   ├── ic_launcher.png
│   │       │       │       │   └── ic_launcher_round.png
│   │       │       │       ├── mipmap-mdpi
│   │       │       │       │   ├── ic_launcher.png
│   │       │       │       │   └── ic_launcher_round.png
│   │       │       │       ├── mipmap-xhdpi
│   │       │       │       │   ├── ic_launcher.png
│   │       │       │       │   └── ic_launcher_round.png
│   │       │       │       ├── mipmap-xxhdpi
│   │       │       │       │   ├── ic_launcher.png
│   │       │       │       │   └── ic_launcher_round.png
│   │       │       │       ├── mipmap-xxxhdpi
│   │       │       │       │   ├── ic_launcher.png
│   │       │       │       │   └── ic_launcher_round.png
│   │       │       │       ├── raw
│   │       │       │       │   └── song.mp3
│   │       │       │       └── values
│   │       │       │           ├── colors.xml
│   │       │       │           ├── strings.xml
│   │       │       │           └── styles.xml
│   │       │       └── test
│   │       │           └── java
│   │       │               └── comrusegroup12
│   │       │                   └── github
│   │       │                       └── smarthomesystem
│   │       │                           └── ExampleUnitTest.java
│   │       ├── build
│   │       │   └── android-profile
│   │       │       ├── profile-2017-03-27-22-26-28-579.rawproto
│   │       │       ├── profile-2017-03-27-22-36-57-692.rawproto
│   │       │       ├── profile-2017-03-27-22-46-27-686.rawproto
│   │       │       └── profile-2017-04-15-16-59-08-945.rawproto
│   │       ├── build.gradle
│   │       ├── gradle
│   │       │   └── wrapper
│   │       │       ├── gradle-wrapper.jar
│   │       │       └── gradle-wrapper.properties
│   │       ├── gradle.properties
│   │       ├── gradlew
│   │       ├── gradlew.bat
│   │       ├── local.properties
│   │       ├── settings.gradle
│   │       ├── SmartHomeSystem.iml
│   │       └── temp.txt
│   └── SE
│       ├── local.properties
│       └── SE.iml
├── a.txt
├── Indoor Positioning System
│   ├── client.c
│   ├── Indoor Positioning System Client Server Software + Testing
│   │   ├── client.c
│   │   ├── server.c
│   │   └── testing.c
│   ├── Indoor Positioning System Documentation
│   │   ├── client readme.pdf
│   │   ├── how to compile and run.pdf
│   │   ├── server readme.pdf
│   │   └── Under Development.pdf
│   ├── IPS Documentation
│   │   ├── client readme.pdf
│   │   ├── how to compile and run.txt
│   │   ├── server readme.pdf
│   │   └── Under Development.txt
│   ├── OLD_client_server
│   │   ├── client.c
│   │   ├── server.c
│   │   └── testing.c
│   ├── server.c
│   └── testing.c
├── test.txt
├── Time to Temperature
│   ├── HVAC_ALG
│   │   ├── computeCostMulti.m
│   │   ├── ex1data2.asv
│   │   ├── ex1data2.txt
│   │   ├── featureNormalize.m
│   │   ├── gradientDescentMulti.m
│   │   ├── test.m
│   │   └── timeToTemp.m
│   ├── Matlab To Java Conversion
│   │   ├── data.txt
│   │   └── Time2Temperature.java
│   └── Primary Function Matlab GUI
│       ├── computeCostMulti.m
│       ├── ex1data2.txt
│       ├── featureNormalize.m
│       ├── gradientDescentMulti.m
│       ├── GUI2.fig
│       ├── GUI2.m
│       ├── insertData.m
│       ├── test.m
│       └── timeToTemp.m
├── UnitySimulation
│   └── Home
│       ├── Assembly-CSharp.csproj
│       ├── Assets
│       │   ├── camerahud.cs
│       │   ├── camerahud.cs.meta
│       │   ├── ground.mat
│       │   ├── ground.mat.meta
│       │   ├── HomeStuff
│       │   │   ├── Demo.unity
│       │   │   ├── Demo.unity.meta
│       │   │   ├── Materials
│       │   │   │   ├── Ground.mat
│       │   │   │   ├── Ground.mat.meta
│       │   │   │   ├── MainMaterial.mat
│       │   │   │   ├── MainMaterial.mat.meta
│       │   │   │   ├── texture.png
│       │   │   │   └── texture.png.meta
│       │   │   ├── Materials.meta
│       │   │   ├── Models
│       │   │   │   ├── BathSink.fbx
│       │   │   │   ├── BathSink.fbx.meta
│       │   │   │   ├── Bathtub.fbx
│       │   │   │   ├── Bathtub.fbx.meta
│       │   │   │   ├── Bed.fbx
│       │   │   │   ├── Bed.fbx.meta
│       │   │   │   ├── BigDrawer.fbx
│       │   │   │   ├── BigDrawer.fbx.meta
│       │   │   │   ├── Book.1.fbx
│       │   │   │   ├── Book.1.fbx.meta
│       │   │   │   ├── Book.2.fbx
│       │   │   │   ├── Book.2.fbx.meta
│       │   │   │   ├── Book.3.fbx
│       │   │   │   ├── Book.3.fbx.meta
│       │   │   │   ├── Book.4.fbx
│       │   │   │   ├── Book.4.fbx.meta
│       │   │   │   ├── Book.5.fbx
│       │   │   │   ├── Book.5.fbx.meta
│       │   │   │   ├── Bookshelf.fbx
│       │   │   │   ├── Bookshelf.fbx.meta
│       │   │   │   ├── Boxshelf.fbx
│       │   │   │   ├── Boxshelf.fbx.meta
│       │   │   │   ├── Chair.fbx
│       │   │   │   ├── Chair.fbx.meta
│       │   │   │   ├── Drawer.fbx
│       │   │   │   ├── Drawer.fbx.meta
│       │   │   │   ├── Lamp.fbx
│       │   │   │   ├── Lamp.fbx.meta
│       │   │   │   ├── Microwave.fbx
│       │   │   │   ├── Microwave.fbx.meta
│       │   │   │   ├── Mirror.1.fbx
│       │   │   │   ├── Mirror.1.fbx.meta
│       │   │   │   ├── Mirror.fbx
│       │   │   │   ├── Mirror.fbx.meta
│       │   │   │   ├── Refrigerator.fbx
│       │   │   │   ├── Refrigerator.fbx.meta
│       │   │   │   ├── Sink.1.fbx
│       │   │   │   ├── Sink.1.fbx.meta
│       │   │   │   ├── Sink.2.fbx
│       │   │   │   ├── Sink.2.fbx.meta
│       │   │   │   ├── Sink.fbx
│       │   │   │   ├── Sink.fbx.meta
│       │   │   │   ├── SmallTable.fbx
│       │   │   │   ├── SmallTable.fbx.meta
│       │   │   │   ├── Sofa.1.fbx
│       │   │   │   ├── Sofa.1.fbx.meta
│       │   │   │   ├── Sofa.fbx
│       │   │   │   ├── Sofa.fbx.meta
│       │   │   │   ├── Table.fbx
│       │   │   │   ├── Table.fbx.meta
│       │   │   │   ├── TallLamp.fbx
│       │   │   │   ├── TallLamp.fbx.meta
│       │   │   │   ├── Toilet.fbx
│       │   │   │   ├── Toilet.fbx.meta
│       │   │   │   ├── Trash.fbx
│       │   │   │   ├── Trash.fbx.meta
│       │   │   │   ├── TV.fbx
│       │   │   │   ├── TV.fbx.meta
│       │   │   │   ├── TVTable.fbx
│       │   │   │   └── TVTable.fbx.meta
│       │   │   ├── Models.meta
│       │   │   ├── Prefabs
│       │   │   │   ├── BathSink.prefab
│       │   │   │   ├── BathSink.prefab.meta
│       │   │   │   ├── Bathtub.prefab
│       │   │   │   ├── Bathtub.prefab.meta
│       │   │   │   ├── Bed.prefab
│       │   │   │   ├── Bed.prefab.meta
│       │   │   │   ├── BigDrawer.prefab
│       │   │   │   ├── BigDrawer.prefab.meta
│       │   │   │   ├── Bookshelf.prefab
│       │   │   │   ├── Bookshelf.prefab.meta
│       │   │   │   ├── Boxshelf.prefab
│       │   │   │   ├── Boxshelf.prefab.meta
│       │   │   │   ├── Drawer.prefab
│       │   │   │   ├── Drawer.prefab.meta
│       │   │   │   ├── Lamp.prefab
│       │   │   │   ├── Lamp.prefab.meta
│       │   │   │   ├── Microwave.prefab
│       │   │   │   ├── Microwave.prefab.meta
│       │   │   │   ├── Mirror.1.prefab
│       │   │   │   ├── Mirror.1.prefab.meta
│       │   │   │   ├── Mirror.prefab
│       │   │   │   ├── Mirror.prefab.meta
│       │   │   │   ├── Refrigerator.prefab
│       │   │   │   ├── Refrigerator.prefab.meta
│       │   │   │   ├── Sink.1.prefab
│       │   │   │   ├── Sink.1.prefab.meta
│       │   │   │   ├── Sink.2.prefab
│       │   │   │   ├── Sink.2.prefab.meta
│       │   │   │   ├── Sink.prefab
│       │   │   │   ├── Sink.prefab.meta
│       │   │   │   ├── SmallTable.prefab
│       │   │   │   ├── SmallTable.prefab.meta
│       │   │   │   ├── Sofa.1.prefab
│       │   │   │   ├── Sofa.1.prefab.meta
│       │   │   │   ├── Sofa.prefab
│       │   │   │   ├── Sofa.prefab.meta
│       │   │   │   ├── Table.prefab
│       │   │   │   ├── Table.prefab.meta
│       │   │   │   ├── TallLamp.prefab
│       │   │   │   ├── TallLamp.prefab.meta
│       │   │   │   ├── Toilet.prefab
│       │   │   │   ├── Toilet.prefab.meta
│       │   │   │   ├── Trash 1.prefab
│       │   │   │   ├── Trash 1.prefab.meta
│       │   │   │   ├── Trash.prefab
│       │   │   │   ├── Trash.prefab.meta
│       │   │   │   ├── TV.prefab
│       │   │   │   ├── TV.prefab.meta
│       │   │   │   ├── TVTable.prefab
│       │   │   │   └── TVTable.prefab.meta
│       │   │   └── Prefabs.meta
│       │   ├── HomeStuff.meta
│       │   ├── main.unity
│       │   ├── main.unity.meta
│       │   ├── ManController.cs
│       │   ├── ManController.cs.meta
│       │   ├── StudioNewPunch
│       │   │   ├── SuitPack
│       │   │   │   ├── SuitedMan
│       │   │   │   │   ├── ManInSuitScene.unity
│       │   │   │   │   ├── ManInSuitScene.unity.meta
│       │   │   │   │   ├── Models
│       │   │   │   │   │   ├── BlueSuitFree01.fbx
│       │   │   │   │   │   ├── BlueSuitFree01.fbx.meta
│       │   │   │   │   │   ├── Materials
│       │   │   │   │   │   │   ├── HeadF_MAT_AlbedoTransparency.bmp
│       │   │   │   │   │   │   ├── HeadF_MAT_AlbedoTransparency.bmp.meta
│       │   │   │   │   │   │   ├── HeadF_MAT.mat
│       │   │   │   │   │   │   ├── HeadF_MAT.mat.meta
│       │   │   │   │   │   │   ├── HeadF_MAT_MetallicSmoothness.bmp
│       │   │   │   │   │   │   ├── HeadF_MAT_MetallicSmoothness.bmp.meta
│       │   │   │   │   │   │   ├── HeadF_MAT_Normal.bmp
│       │   │   │   │   │   │   ├── HeadF_MAT_Normal.bmp.meta
│       │   │   │   │   │   │   ├── SuitMAT_AlbedoTransparency.bmp
│       │   │   │   │   │   │   ├── SuitMAT_AlbedoTransparency.bmp.meta
│       │   │   │   │   │   │   ├── SuitMAT.mat
│       │   │   │   │   │   │   ├── SuitMAT.mat.meta
│       │   │   │   │   │   │   ├── SuitMAT_MetallicSmoothness.bmp
│       │   │   │   │   │   │   ├── SuitMAT_MetallicSmoothness.bmp.meta
│       │   │   │   │   │   │   ├── SuitMAT_Normal.bmp
│       │   │   │   │   │   │   └── SuitMAT_Normal.bmp.meta
│       │   │   │   │   │   ├── Materials.meta
│       │   │   │   │   │   ├── suit_F01.fbx
│       │   │   │   │   │   └── suit_F01.fbx.meta
│       │   │   │   │   ├── Models.meta
│       │   │   │   │   ├── Prefabs
│       │   │   │   │   │   ├── BlueSuitFree01.prefab
│       │   │   │   │   │   └── BlueSuitFree01.prefab.meta
│       │   │   │   │   └── Prefabs.meta
│       │   │   │   └── SuitedMan.meta
│       │   │   └── SuitPack.meta
│       │   └── StudioNewPunch.meta
│       ├── Home.csproj
│       ├── Home.sln
│       ├── Home.userprefs
│       ├── Library
│       │   ├── AnnotationManager
│       │   ├── assetDatabase3
│       │   ├── AssetImportState
│       │   ├── AssetServerCacheV3
│       │   ├── AssetVersioning.db
│       │   ├── BuildPlayer.prefs
│       │   ├── BuildSettings.asset
│       │   ├── CurrentLayout.dwlt
│       │   ├── CurrentMaximizeLayout.dwlt
│       │   ├── EditorUserBuildSettings.asset
│       │   ├── EditorUserSettings.asset
│       │   ├── expandedItems
│       │   ├── InspectorExpandedItems.asset
│       │   ├── LastSceneManagerSetup.txt
│       │   ├── LibraryFormatVersion.txt
│       │   ├── metadata
│       │   │   ├── 00
│       │   │   │   ├── 00000000000000001000000000000000
│       │   │   │   ├── 00000000000000001000000000000000.info
│       │   │   │   ├── 00000000000000002000000000000000
│       │   │   │   ├── 00000000000000002000000000000000.info
│       │   │   │   ├── 00000000000000003000000000000000
│       │   │   │   ├── 00000000000000003000000000000000.info
│       │   │   │   ├── 00000000000000004000000000000000
│       │   │   │   ├── 00000000000000004000000000000000.info
│       │   │   │   ├── 00000000000000004100000000000000
│       │   │   │   ├── 00000000000000004100000000000000.info
│       │   │   │   ├── 00000000000000005000000000000000
│       │   │   │   ├── 00000000000000005000000000000000.info
│       │   │   │   ├── 00000000000000005100000000000000
│       │   │   │   ├── 00000000000000005100000000000000.info
│       │   │   │   ├── 00000000000000006000000000000000
│       │   │   │   ├── 00000000000000006000000000000000.info
│       │   │   │   ├── 00000000000000006100000000000000
│       │   │   │   ├── 00000000000000006100000000000000.info
│       │   │   │   ├── 00000000000000007000000000000000
│       │   │   │   ├── 00000000000000007000000000000000.info
│       │   │   │   ├── 00000000000000007100000000000000
│       │   │   │   ├── 00000000000000007100000000000000.info
│       │   │   │   ├── 00000000000000008000000000000000
│       │   │   │   ├── 00000000000000008000000000000000.info
│       │   │   │   ├── 00000000000000009000000000000000
│       │   │   │   ├── 00000000000000009000000000000000.info
│       │   │   │   ├── 0000000000000000a000000000000000
│       │   │   │   ├── 0000000000000000a000000000000000.info
│       │   │   │   ├── 0000000000000000a100000000000000
│       │   │   │   ├── 0000000000000000a100000000000000.info
│       │   │   │   ├── 0000000000000000b000000000000000
│       │   │   │   ├── 0000000000000000b000000000000000.info
│       │   │   │   ├── 0000000000000000c000000000000000
│       │   │   │   └── 0000000000000000c000000000000000.info
│       │   │   ├── 02
│       │   │   │   ├── 02720cae123f313459194cd837caf3aa
│       │   │   │   └── 02720cae123f313459194cd837caf3aa.info
│       │   │   ├── 04
│       │   │   │   ├── 04eb2a943a4c2714e9d66b99957bcf8d
│       │   │   │   └── 04eb2a943a4c2714e9d66b99957bcf8d.info
│       │   │   ├── 0a
│       │   │   │   ├── 0a7d7088bc1028d4abfd2b89e26cf8cc
│       │   │   │   └── 0a7d7088bc1028d4abfd2b89e26cf8cc.info
│       │   │   ├── 0d
│       │   │   │   ├── 0d3bb855445e36e479c85976fc88383a
│       │   │   │   └── 0d3bb855445e36e479c85976fc88383a.info
│       │   │   ├── 12
│       │   │   │   ├── 1238da40397ef9d428b6d3212674e684
│       │   │   │   ├── 1238da40397ef9d428b6d3212674e684.info
│       │   │   │   ├── 12fd8a0055b84bb59e84c9835a37e333
│       │   │   │   └── 12fd8a0055b84bb59e84c9835a37e333.info
│       │   │   ├── 16
│       │   │   │   ├── 167f3ad7907ac894fb2c8007ba5b30e6
│       │   │   │   ├── 167f3ad7907ac894fb2c8007ba5b30e6.info
│       │   │   │   ├── 16de22d71aac07c4e8827211e6a16176
│       │   │   │   └── 16de22d71aac07c4e8827211e6a16176.info
│       │   │   ├── 1c
│       │   │   │   ├── 1c6d1fbb51834b64847b1b73a75bfc77
│       │   │   │   └── 1c6d1fbb51834b64847b1b73a75bfc77.info
│       │   │   ├── 1d
│       │   │   │   ├── 1d3b1a1513de66247974634911345b98
│       │   │   │   ├── 1d3b1a1513de66247974634911345b98.info
│       │   │   │   ├── 1da05fbed83714140b3f47c9812d1e2f
│       │   │   │   └── 1da05fbed83714140b3f47c9812d1e2f.info
│       │   │   ├── 21
│       │   │   │   ├── 21e32de74bee7044fbd8655ea8eeda74
│       │   │   │   ├── 21e32de74bee7044fbd8655ea8eeda74.info
│       │   │   │   ├── 21eff446d50eaf44a85985cd4c0b6fa1
│       │   │   │   └── 21eff446d50eaf44a85985cd4c0b6fa1.info
│       │   │   ├── 26
│       │   │   │   ├── 2682a692a2be7e14e901a738c7806da0
│       │   │   │   └── 2682a692a2be7e14e901a738c7806da0.info
│       │   │   ├── 2f
│       │   │   │   ├── 2fe3476eabbbb6c448e6b55a2cc471f5
│       │   │   │   ├── 2fe3476eabbbb6c448e6b55a2cc471f5.info
│       │   │   │   ├── 2fe85e6b53467fa4ab15c063fbd4d24a
│       │   │   │   └── 2fe85e6b53467fa4ab15c063fbd4d24a.info
│       │   │   ├── 30
│       │   │   │   ├── 307433eba81a469ab1e2084d52d1a5a2
│       │   │   │   └── 307433eba81a469ab1e2084d52d1a5a2.info
│       │   │   ├── 31
│       │   │   │   ├── 3126f881a886f8144bb2e36e85d0c390
│       │   │   │   └── 3126f881a886f8144bb2e36e85d0c390.info
│       │   │   ├── 32
│       │   │   │   ├── 32188fd89022c154c81befa2f0e00be0
│       │   │   │   ├── 32188fd89022c154c81befa2f0e00be0.info
│       │   │   │   ├── 328cc881519068e4eb7db4bb907ad2d9
│       │   │   │   └── 328cc881519068e4eb7db4bb907ad2d9.info
│       │   │   ├── 33
│       │   │   │   ├── 336df0048f520f745a550ee50fb12cd6
│       │   │   │   └── 336df0048f520f745a550ee50fb12cd6.info
│       │   │   ├── 34
│       │   │   │   ├── 347f14d921c2228468658f3a2a6dd004
│       │   │   │   └── 347f14d921c2228468658f3a2a6dd004.info
│       │   │   ├── 35
│       │   │   │   ├── 35d558844c6d4bd4099115e71679ca77
│       │   │   │   └── 35d558844c6d4bd4099115e71679ca77.info
│       │   │   ├── 38
│       │   │   │   ├── 38c8faf1788024c02930a0c68a6e0edc
│       │   │   │   ├── 38c8faf1788024c02930a0c68a6e0edc.info
│       │   │   │   ├── 38d0814617146db459147d50d7e8739a
│       │   │   │   ├── 38d0814617146db459147d50d7e8739a.info
│       │   │   │   ├── 38df50251b714ba4580b6887e3eeaf1a
│       │   │   │   └── 38df50251b714ba4580b6887e3eeaf1a.info
│       │   │   ├── 3d
│       │   │   │   ├── 3d257e714ef9ccd449e0d0e0e373e1e5
│       │   │   │   ├── 3d257e714ef9ccd449e0d0e0e373e1e5.info
│       │   │   │   ├── 3dcb1df6c82dde44f9dac4ef0ed2b1f4
│       │   │   │   ├── 3dcb1df6c82dde44f9dac4ef0ed2b1f4.info
│       │   │   │   ├── 3deb423014868c04eb200152022d54c9
│       │   │   │   └── 3deb423014868c04eb200152022d54c9.info
│       │   │   ├── 40
│       │   │   │   ├── 405b9b51bb344a128608d968297df79c
│       │   │   │   └── 405b9b51bb344a128608d968297df79c.info
│       │   │   ├── 41
│       │   │   │   ├── 4113173d5e95493ab8765d7b08371de4
│       │   │   │   └── 4113173d5e95493ab8765d7b08371de4.info
│       │   │   ├── 42
│       │   │   │   ├── 4277762b3c154fab9f2e968e868bbbd7
│       │   │   │   └── 4277762b3c154fab9f2e968e868bbbd7.info
│       │   │   ├── 45
│       │   │   │   ├── 4588a918695c3404b81ce408babb4dcb
│       │   │   │   └── 4588a918695c3404b81ce408babb4dcb.info
│       │   │   ├── 47
│       │   │   │   ├── 47f8c297fa1cc4048a965530702b353d
│       │   │   │   └── 47f8c297fa1cc4048a965530702b353d.info
│       │   │   ├── 49
│       │   │   │   ├── 49f5766d0d4954f44b85d4bbd7131677
│       │   │   │   └── 49f5766d0d4954f44b85d4bbd7131677.info
│       │   │   ├── 4b
│       │   │   │   ├── 4ba2329b63d54f0187bcaa12486b1b0f
│       │   │   │   └── 4ba2329b63d54f0187bcaa12486b1b0f.info
│       │   │   ├── 51
│       │   │   │   ├── 517af1b5b81b93b43b9745d58f017562
│       │   │   │   ├── 517af1b5b81b93b43b9745d58f017562.info
│       │   │   │   ├── 51f2fcb41ebec8d4ca45adaa25bbc390
│       │   │   │   └── 51f2fcb41ebec8d4ca45adaa25bbc390.info
│       │   │   ├── 52
│       │   │   │   ├── 522560d0696f5804c8622d8ec6342839
│       │   │   │   └── 522560d0696f5804c8622d8ec6342839.info
│       │   │   ├── 53
│       │   │   │   ├── 5348532066f268a4c92eb5aa85f500dd
│       │   │   │   ├── 5348532066f268a4c92eb5aa85f500dd.info
│       │   │   │   ├── 53ebcfaa2e1e4e2dbc85882cd5a73fa1
│       │   │   │   └── 53ebcfaa2e1e4e2dbc85882cd5a73fa1.info
│       │   │   ├── 56
│       │   │   │   ├── 56c0c7640260a9c4bba1d681d44ded82
│       │   │   │   └── 56c0c7640260a9c4bba1d681d44ded82.info
│       │   │   ├── 57
│       │   │   │   ├── 5782f9e9e6e0bb94bac99aeea24814fc
│       │   │   │   └── 5782f9e9e6e0bb94bac99aeea24814fc.info
│       │   │   ├── 5a
│       │   │   │   ├── 5a9aab3a477cdc148848625e32e087e9
│       │   │   │   └── 5a9aab3a477cdc148848625e32e087e9.info
│       │   │   ├── 5b
│       │   │   │   ├── 5b88d82a8ae2d7f40aedac31333ce98f
│       │   │   │   └── 5b88d82a8ae2d7f40aedac31333ce98f.info
│       │   │   ├── 5f
│       │   │   │   ├── 5f32cd94baa94578a686d4b9d6b660f7
│       │   │   │   └── 5f32cd94baa94578a686d4b9d6b660f7.info
│       │   │   ├── 60
│       │   │   │   ├── 60927fec0747ada4ca49f585e3e63bc9
│       │   │   │   └── 60927fec0747ada4ca49f585e3e63bc9.info
│       │   │   ├── 63
│       │   │   │   ├── 634189559968b644a99dac5af20b2718
│       │   │   │   └── 634189559968b644a99dac5af20b2718.info
│       │   │   ├── 65
│       │   │   │   ├── 656f375b779461048b0cdde1b80ef0b0
│       │   │   │   └── 656f375b779461048b0cdde1b80ef0b0.info
│       │   │   ├── 67
│       │   │   │   ├── 67c1d67f8b9ca7f429728bdf82a335f2
│       │   │   │   └── 67c1d67f8b9ca7f429728bdf82a335f2.info
│       │   │   ├── 69
│       │   │   │   ├── 6946cad694c751a48b91dec74ae41339
│       │   │   │   ├── 6946cad694c751a48b91dec74ae41339.info
│       │   │   │   ├── 6981461fe431401459211818212a29cf
│       │   │   │   ├── 6981461fe431401459211818212a29cf.info
│       │   │   │   ├── 69a125d0e01afe4439db34551f8f3268
│       │   │   │   └── 69a125d0e01afe4439db34551f8f3268.info
│       │   │   ├── 6a
│       │   │   │   ├── 6a820aef5b4bbe449826505731f23459
│       │   │   │   ├── 6a820aef5b4bbe449826505731f23459.info
│       │   │   │   ├── 6ab336aa16c0bff44b38248b73687ce2
│       │   │   │   ├── 6ab336aa16c0bff44b38248b73687ce2.info
│       │   │   │   ├── 6abdc3f05e0141743ad36babf3419e39
│       │   │   │   ├── 6abdc3f05e0141743ad36babf3419e39.info
│       │   │   │   ├── 6abf4b4cbfd0454e850ffc1ec9140b58
│       │   │   │   └── 6abf4b4cbfd0454e850ffc1ec9140b58.info
│       │   │   ├── 6c
│       │   │   │   ├── 6cdf1e5c78d14720aaadccd4c792df96
│       │   │   │   └── 6cdf1e5c78d14720aaadccd4c792df96.info
│       │   │   ├── 6d
│       │   │   │   ├── 6d342eee9ce10d34eabfc49d8fbd2c6f
│       │   │   │   └── 6d342eee9ce10d34eabfc49d8fbd2c6f.info
│       │   │   ├── 70
│       │   │   │   ├── 702dc3751b1b2cf4f833ca162605cda5
│       │   │   │   ├── 702dc3751b1b2cf4f833ca162605cda5.info
│       │   │   │   ├── 70f623e9ac0bba0439379cdea9ffb450
│       │   │   │   └── 70f623e9ac0bba0439379cdea9ffb450.info
│       │   │   ├── 73
│       │   │   │   ├── 738c078743e37d34baf164992215b776
│       │   │   │   ├── 738c078743e37d34baf164992215b776.info
│       │   │   │   ├── 739bbd9f364b4268874f9fd86ab3beef
│       │   │   │   └── 739bbd9f364b4268874f9fd86ab3beef.info
│       │   │   ├── 78
│       │   │   │   ├── 7841159c855bb0d44bcc9f1f89548d64
│       │   │   │   ├── 7841159c855bb0d44bcc9f1f89548d64.info
│       │   │   │   ├── 7868273ca7ca65c4e87cf2e27bf81fd6
│       │   │   │   ├── 7868273ca7ca65c4e87cf2e27bf81fd6.info
│       │   │   │   ├── 7872d796c65c3a241bc3d8708bca7b0a
│       │   │   │   └── 7872d796c65c3a241bc3d8708bca7b0a.info
│       │   │   ├── 79
│       │   │   │   ├── 79df28570a5b72343a5464a84c5be328
│       │   │   │   └── 79df28570a5b72343a5464a84c5be328.info
│       │   │   ├── 80
│       │   │   │   ├── 80a3616ca19596e4da0f10f14d241e9f
│       │   │   │   └── 80a3616ca19596e4da0f10f14d241e9f.info
│       │   │   ├── 81
│       │   │   │   ├── 817904b925651f148b5093e4b4274a1a
│       │   │   │   └── 817904b925651f148b5093e4b4274a1a.info
│       │   │   ├── 83
│       │   │   │   ├── 8382b2bb260241859771b69b7f377a8d
│       │   │   │   ├── 8382b2bb260241859771b69b7f377a8d.info
│       │   │   │   ├── 83b95243d15f01b4e85b125582c896c5
│       │   │   │   └── 83b95243d15f01b4e85b125582c896c5.info
│       │   │   ├── 84
│       │   │   │   ├── 84ca94c19f25ae14d83aa41bb3654390
│       │   │   │   ├── 84ca94c19f25ae14d83aa41bb3654390.info
│       │   │   │   ├── 84f4e489d4a1bff4db40d37fff71e5ec
│       │   │   │   └── 84f4e489d4a1bff4db40d37fff71e5ec.info
│       │   │   ├── 85
│       │   │   │   ├── 852e56802eb941638acbb491814497b0
│       │   │   │   └── 852e56802eb941638acbb491814497b0.info
│       │   │   ├── 86
│       │   │   │   ├── 86f4de9468454445ac2f39e207fafa3a
│       │   │   │   └── 86f4de9468454445ac2f39e207fafa3a.info
│       │   │   ├── 87
│       │   │   │   ├── 870353891bb340e2b2a9c8707e7419ba
│       │   │   │   └── 870353891bb340e2b2a9c8707e7419ba.info
│       │   │   ├── 89
│       │   │   │   ├── 897364013949a0a42990ff3fd44cb85c
│       │   │   │   └── 897364013949a0a42990ff3fd44cb85c.info
│       │   │   ├── 8a
│       │   │   │   ├── 8a62549e9cba08e4caf06a1a49de69d7
│       │   │   │   └── 8a62549e9cba08e4caf06a1a49de69d7.info
│       │   │   ├── 8b
│       │   │   │   ├── 8b89e950a4a38cd4cb40ab7baf1a1dc6
│       │   │   │   └── 8b89e950a4a38cd4cb40ab7baf1a1dc6.info
│       │   │   ├── 8e
│       │   │   │   ├── 8e0cd8ed44d4412cbe0642067abc9e44
│       │   │   │   ├── 8e0cd8ed44d4412cbe0642067abc9e44.info
│       │   │   │   ├── 8e7066e382b0fc749b25dbb1a3004dfe
│       │   │   │   └── 8e7066e382b0fc749b25dbb1a3004dfe.info
│       │   │   ├── 90
│       │   │   │   ├── 9078b7128e594410d9b89e5b24cffd01
│       │   │   │   ├── 9078b7128e594410d9b89e5b24cffd01.info
│       │   │   │   ├── 90feaaa20fb97904fbb7579a03d7f184
│       │   │   │   └── 90feaaa20fb97904fbb7579a03d7f184.info
│       │   │   ├── 92
│       │   │   │   ├── 928ab05920c2fc44dafb3573d1b5fbc1
│       │   │   │   └── 928ab05920c2fc44dafb3573d1b5fbc1.info
│       │   │   ├── 94
│       │   │   │   ├── 94989fee1ac2c064d915fa6ca54fa508
│       │   │   │   └── 94989fee1ac2c064d915fa6ca54fa508.info
│       │   │   ├── 95
│       │   │   │   ├── 959725da582aa9c4191ee51ee55fcaaa
│       │   │   │   └── 959725da582aa9c4191ee51ee55fcaaa.info
│       │   │   ├── 97
│       │   │   │   ├── 97abc9643ce768c4298cb1264363ad94
│       │   │   │   ├── 97abc9643ce768c4298cb1264363ad94.info
│       │   │   │   ├── 97decbdab0634cdd991f8d23ddf0dead
│       │   │   │   └── 97decbdab0634cdd991f8d23ddf0dead.info
│       │   │   ├── 9b
│       │   │   │   ├── 9b74755f49990804a99d5d68ea5d75a2
│       │   │   │   └── 9b74755f49990804a99d5d68ea5d75a2.info
│       │   │   ├── 9d
│       │   │   │   ├── 9d5e434a2e80a114aa8a697c09eb432b
│       │   │   │   └── 9d5e434a2e80a114aa8a697c09eb432b.info
│       │   │   ├── 9f
│       │   │   │   ├── 9fd897123d0d5a849af515a4a428f694
│       │   │   │   └── 9fd897123d0d5a849af515a4a428f694.info
│       │   │   ├── a2
│       │   │   │   ├── a2bc5fda40d1ee24ea8d96aa11802285
│       │   │   │   └── a2bc5fda40d1ee24ea8d96aa11802285.info
│       │   │   ├── ad
│       │   │   │   ├── adebbd281f1a4ef3a30be7f21937e02f
│       │   │   │   └── adebbd281f1a4ef3a30be7f21937e02f.info
│       │   │   ├── b2
│       │   │   │   ├── b281ca45a30ec9b4ea7087e58f8040c9
│       │   │   │   ├── b281ca45a30ec9b4ea7087e58f8040c9.info
│       │   │   │   ├── b2b693dffac3a4433b3114fea0b7fd4e
│       │   │   │   ├── b2b693dffac3a4433b3114fea0b7fd4e.info
│       │   │   │   ├── b2bead50dbf86924f8e51f03ddbebf70
│       │   │   │   └── b2bead50dbf86924f8e51f03ddbebf70.info
│       │   │   ├── b3
│       │   │   │   ├── b36dbcc8ef8059c4a9c8f753d6b0350b
│       │   │   │   ├── b36dbcc8ef8059c4a9c8f753d6b0350b.info
│       │   │   │   ├── b3f2c519619fcbd498ca63678fbe736a
│       │   │   │   └── b3f2c519619fcbd498ca63678fbe736a.info
│       │   │   ├── b6
│       │   │   │   ├── b6735e1806bc0a943b2581e39708123d
│       │   │   │   └── b6735e1806bc0a943b2581e39708123d.info
│       │   │   ├── be
│       │   │   │   ├── be1b3100d2863af4bb5022d0c5293618
│       │   │   │   └── be1b3100d2863af4bb5022d0c5293618.info
│       │   │   ├── c3
│       │   │   │   ├── c34cb3bdef7a4304dbaea59504e23078
│       │   │   │   └── c34cb3bdef7a4304dbaea59504e23078.info
│       │   │   ├── c9
│       │   │   │   ├── c90de59bff4939e4bbe4cd9324b0decc
│       │   │   │   └── c90de59bff4939e4bbe4cd9324b0decc.info
│       │   │   ├── ca
│       │   │   │   ├── ca1b6a54d5f844248a66c6339eabffed
│       │   │   │   └── ca1b6a54d5f844248a66c6339eabffed.info
│       │   │   ├── cc
│       │   │   │   ├── cc464fd9cb747c0458bbd9f6e895c691
│       │   │   │   └── cc464fd9cb747c0458bbd9f6e895c691.info
│       │   │   ├── d0
│       │   │   │   ├── d05b96cee66e14240838de167097537a
│       │   │   │   └── d05b96cee66e14240838de167097537a.info
│       │   │   ├── d1
│       │   │   │   ├── d18c080a08b7a5e49b6b690330057a43
│       │   │   │   └── d18c080a08b7a5e49b6b690330057a43.info
│       │   │   ├── d5
│       │   │   │   ├── d5f6f6c63bb59f343b64fb522d832b20
│       │   │   │   └── d5f6f6c63bb59f343b64fb522d832b20.info
│       │   │   ├── d7
│       │   │   │   ├── d7d1b586e081e1b449b95c91f43f6281
│       │   │   │   └── d7d1b586e081e1b449b95c91f43f6281.info
│       │   │   ├── d8
│       │   │   │   ├── d87d11194b29e3a4c87503bd09c0a664
│       │   │   │   └── d87d11194b29e3a4c87503bd09c0a664.info
│       │   │   ├── d9
│       │   │   │   ├── d91035c548f23744c9bfb107348ed1c0
│       │   │   │   ├── d91035c548f23744c9bfb107348ed1c0.info
│       │   │   │   ├── d9996bae7f32a8b40927442f0cb0123b
│       │   │   │   ├── d9996bae7f32a8b40927442f0cb0123b.info
│       │   │   │   ├── d9ed81d4fbf959a468e53f1553e4cb45
│       │   │   │   └── d9ed81d4fbf959a468e53f1553e4cb45.info
│       │   │   ├── db
│       │   │   │   ├── db78d437de8738f48a99e88b4328f62a
│       │   │   │   └── db78d437de8738f48a99e88b4328f62a.info
│       │   │   ├── dc
│       │   │   │   ├── dc443db3e92b4983b9738c1131f555cb
│       │   │   │   └── dc443db3e92b4983b9738c1131f555cb.info
│       │   │   ├── e0
│       │   │   │   ├── e053dc897fa5cd74dbc81e55e06a1614
│       │   │   │   ├── e053dc897fa5cd74dbc81e55e06a1614.info
│       │   │   │   ├── e08e523cc4367234e8b33dbe7552795d
│       │   │   │   └── e08e523cc4367234e8b33dbe7552795d.info
│       │   │   ├── e1
│       │   │   │   ├── e1007cd261c84053beb0c3537782908d
│       │   │   │   ├── e1007cd261c84053beb0c3537782908d.info
│       │   │   │   ├── e1b42a4f28b93f74c8031aa95708fed2
│       │   │   │   └── e1b42a4f28b93f74c8031aa95708fed2.info
│       │   │   ├── e2
│       │   │   │   ├── e26e73044dab43d4e8697635bc6eaaa3
│       │   │   │   └── e26e73044dab43d4e8697635bc6eaaa3.info
│       │   │   ├── e6
│       │   │   │   ├── e6ab94ea3d7bfb840aa41680fa79570e
│       │   │   │   └── e6ab94ea3d7bfb840aa41680fa79570e.info
│       │   │   ├── f2
│       │   │   │   ├── f266cbc0b1e72924f909c3ea2b746949
│       │   │   │   └── f266cbc0b1e72924f909c3ea2b746949.info
│       │   │   ├── f4
│       │   │   │   ├── f42838308461a634682be0b1eb1a5a4c
│       │   │   │   └── f42838308461a634682be0b1eb1a5a4c.info
│       │   │   ├── f5
│       │   │   │   ├── f5f67c52d1564df4a8936ccd202a3bd8
│       │   │   │   └── f5f67c52d1564df4a8936ccd202a3bd8.info
│       │   │   ├── f7
│       │   │   │   ├── f70555f144d8491a825f0804e09c671c
│       │   │   │   ├── f70555f144d8491a825f0804e09c671c.info
│       │   │   │   ├── f77ebcdeb49293c40889ebc9f839e6e4
│       │   │   │   ├── f77ebcdeb49293c40889ebc9f839e6e4.info
│       │   │   │   ├── f7aa5c9f7034e2e44a426956874411ca
│       │   │   │   ├── f7aa5c9f7034e2e44a426956874411ca.info
│       │   │   │   ├── f7b54ff4a43d4fcf81b4538b678e0bcc
│       │   │   │   └── f7b54ff4a43d4fcf81b4538b678e0bcc.info
│       │   │   └── fc
│       │   │       ├── fca6ca697f5a6ea498694a2a4231ac92
│       │   │       └── fca6ca697f5a6ea498694a2a4231ac92.info
│       │   ├── MonoManager.asset
│       │   ├── ProjectSettings.asset
│       │   ├── ScriptAssemblies
│       │   │   ├── Assembly-CSharp.dll
│       │   │   ├── Assembly-CSharp.dll.mdb
│       │   │   └── BuiltinAssemblies.stamp
│       │   ├── ScriptMapper
│       │   ├── ShaderCache
│       │   │   ├── 0
│       │   │   │   ├── 0106943f91ffa0956d2a26d1fec6e38e.bin
│       │   │   │   ├── 02da2876966a6fb91174791da4398182.bin
│       │   │   │   ├── 055a74d8493fc4533471c501586390c2.bin
│       │   │   │   ├── 0590b7e196d659945084ff72fe31c8c7.bin
│       │   │   │   ├── 07bf240c026faeb39661bc90679a7e6a.bin
│       │   │   │   └── 0aa54b9b5ae4251ca865ccf5ecdbc11c.bin
│       │   │   ├── 1
│       │   │   │   └── 18e34a2866e634b43f5d083ee6eae336.bin
│       │   │   ├── 2
│       │   │   │   ├── 267fbcd710354855d568c1a07c980eaf.bin
│       │   │   │   ├── 2a426d5914525c4bc1c740f9bcfadcc7.bin
│       │   │   │   └── 2a47020f4e3a94c4013c4f3abf079476.bin
│       │   │   ├── 4
│       │   │   │   ├── 4dbc3e99b2eaf7123a411d3d74af7eda.bin
│       │   │   │   └── 4e66e7cc6a30e508045cb5fadcdbf8b2.bin
│       │   │   ├── 7
│       │   │   │   ├── 731807ba2d9bc00de63adbf6038ea568.bin
│       │   │   │   ├── 74e1af426a90cd6f60afef4aa5ad1d59.bin
│       │   │   │   └── 7a7fddc8825b45cd0cb3ff4ac1d3a071.bin
│       │   │   ├── 8
│       │   │   │   └── 8fc10211547f43d825634ce757bf190d.bin
│       │   │   ├── 9
│       │   │   │   ├── 92c8c59b63142a1c9304086e6d34c0cd.bin
│       │   │   │   ├── 96148acf7b94a9d6c86b745110588fc4.bin
│       │   │   │   ├── 9682168f8735d70f2b9ed817b0acf432.bin
│       │   │   │   └── 98e270780652107760593414388df83a.bin
│       │   │   ├── a
│       │   │   │   ├── a02ef6d0801a521f111c5a8283993399.bin
│       │   │   │   └── a720348b79e2513d1fa6f79f7631d483.bin
│       │   │   ├── b
│       │   │   │   └── b1ed584facd7cd414e8a6559e22b3fbd.bin
│       │   │   ├── c
│       │   │   │   ├── c1e0e22c7b2061e297f9d4ae27d18680.bin
│       │   │   │   ├── c60a1d72ee608d75d52f0afef962532b.bin
│       │   │   │   ├── c708d7bf7f26e8a4d83c12b61aa631fc.bin
│       │   │   │   ├── cb3767320f7c486a2621108dec1a946a.bin
│       │   │   │   ├── cd3631d4cf98e83005cfba4ec37aad81.bin
│       │   │   │   └── ce3f94abc4ff0c141acd6de76ea0e731.bin
│       │   │   ├── d
│       │   │   │   ├── d1f986c6ef0c11e90b137383f6dfa8c0.bin
│       │   │   │   ├── d4c2f24581849225baecd3b7b130391f.bin
│       │   │   │   ├── db17636aceb8332c56fa0f341f1bc591.bin
│       │   │   │   └── df50a687cb0244bf776e0db1906192bf.bin
│       │   │   ├── e
│       │   │   │   ├── e574a0f679b0c6b2646884764265c5eb.bin
│       │   │   │   ├── e5b846a2940c282c76ccc195172ce1f0.bin
│       │   │   │   ├── eaf81c6d5474a9fa57b7fd6626462c6e.bin
│       │   │   │   └── ec1a43e8b11629135a216c730f07811f.bin
│       │   │   └── f
│       │   │       └── f652c44e743cc6e1f2ecd60f819617a5.bin
│       │   ├── ShaderCache.db
│       │   ├── shadercompiler-UnityShaderCompiler.exe0.log
│       │   └── UnityAssemblies
│       │       ├── nunit.framework.dll
│       │       ├── nunit.framework.xml
│       │       ├── UnityEditor.dll
│       │       ├── UnityEditor.xml
│       │       ├── UnityEngine.Analytics.dll
│       │       ├── UnityEngine.Analytics.xml
│       │       ├── UnityEngine.dll
│       │       ├── UnityEngine.HoloLens.dll
│       │       ├── UnityEngine.HoloLens.xml
│       │       ├── UnityEngine.Networking.dll
│       │       ├── UnityEngine.Networking.xml
│       │       ├── UnityEngine.TestRunner.dll
│       │       ├── UnityEngine.TestRunner.xml
│       │       ├── UnityEngine.UI.dll
│       │       ├── UnityEngine.UI.xml
│       │       ├── UnityEngine.VR.dll
│       │       ├── UnityEngine.VR.xml
│       │       ├── UnityEngine.xml
│       │       └── version.txt
│       ├── obj
│       │   └── Debug
│       │       ├── Assembly-CSharp.csproj.FileListAbsolute.txt
│       │       ├── Assembly-CSharp.csprojResolveAssemblyReference.cache
│       │       ├── Assembly-CSharp.dll
│       │       └── Assembly-CSharp.pdb
│       ├── ProjectSettings
│       │   ├── AudioManager.asset
│       │   ├── ClusterInputManager.asset
│       │   ├── DynamicsManager.asset
│       │   ├── EditorBuildSettings.asset
│       │   ├── EditorSettings.asset
│       │   ├── GraphicsSettings.asset
│       │   ├── InputManager.asset
│       │   ├── NavMeshAreas.asset
│       │   ├── NetworkManager.asset
│       │   ├── Physics2DSettings.asset
│       │   ├── ProjectSettings.asset
│       │   ├── ProjectVersion.txt
│       │   ├── QualitySettings.asset
│       │   ├── TagManager.asset
│       │   ├── TimeManager.asset
│       │   └── UnityConnectSettings.asset
│       └── Temp
│           ├── __Backupscenes
│           │   └── 0.backup
│           ├── ProcessJobs
│           │   └── e9a6970f79cd12d8b075e7d72f1b07cb.bakert
│           ├── UnityLockfile
│           ├── UnityTempFile-044778564e2691b438e662b7042d8e83
│           ├── UnityTempFile-1f1b3276df58b404c9c98f3e31e0198f
│           ├── UnityTempFile-3caad244f3f47494b96af529491d44bb
│           ├── UnityTempFile-52a43bcfd00e3f448af6b01b11465351
│           ├── UnityTempFile-6449d2ab76b8ed14cb60cce1df77ed3a
│           ├── UnityTempFile-a7262161b3c850747a59295f89976bf7
│           ├── UnityTempFile-b173e1cf6a11a2440b03818042854c0e
│           ├── UnityTempFile-c59cb0df35dfe9745b1b28a8f84d5d73
│           ├── UnityTempFile-d324c8b521c71984bbababee2aaa13e2
│           ├── UnityTempFile-fddd099970f78ee4abee7336de7076d3
│           └── UnityVS_obj
│               └── Debug
│                   ├── CoreCompileInputs.cache
│                   └── DesignTimeResolveAssemblyReferencesInput.cache
└── WebApp
    └── SmartHomeServer
        ├── app.py
        ├── requirements.txt
        ├── static
        │   ├── css
        │   │   ├── bootstrap.css
        │   │   ├── bootstrap.min.css
        │   │   └── logo-nav.css
        │   ├── fonts
        │   │   ├── glyphicons-halflings-regular.eot
        │   │   ├── glyphicons-halflings-regular.svg
        │   │   ├── glyphicons-halflings-regular.ttf
        │   │   ├── glyphicons-halflings-regular.woff
        │   │   └── glyphicons-halflings-regular.woff2
        │   ├── img
        │   │   └── icon.PNG
        │   └── js
        │       ├── bootstrap.js
        │       ├── bootstrap.min.js
        │       └── jquery.js
        └── templates
            ├── dash.html
            ├── energy.html
            ├── index.html
            └── layout.html

790 directories, 3441 files
