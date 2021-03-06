amchartsJava-core
-----------------
This repository contains core functionality of [amchartsJava](https://github.com/ifcunharro/amchartsJava) project.

amchartsJava-core is the unique module of amchartsJava that can be used alone. Use a version adapted of [amcharts](https://www.amcharts.com/) API, only API JSON, don't use JavaScript API. 

Validate users entries and generate configuration in json format that can be used in method makeChart of amcharts to generate a chart, also can load other time json generated to java objects. It's recommended load only json generated by app, actually isn't implemented all amcharts API and json must be valid json, amcharts allow invalid json.

Requirements
--------------
To use amchartsJava-core you need:
* Java 1.7+
* Maven 3+
* Git 
* AmCharts JavaScript Charts 3.15.1 

(**Note**:can download AmCharts JavaScript Charts it in https://github.com/amcharts/amcharts3/releases/tag/3.15.1)

Installation
-----------
#### 1. Download 
- You can download amchartsJava-core directly from GitHub using the following command: `git clone https://github.com/ifcunharro/amchartsJava-core.git`
- Download AmCharts and unzip in folder named amcharts in same folder where were cloned amchartsJava-core. In that folder create another folder named temp. Must have the following folders:<br>
  - amcharts<br>
  - images<br>
  - samples<br>
  - temp

### 2. Configuration parameters
This project was developed in Eclipse Luna for JavaEE. To use correctly this library a set of parameters are neccesary. Can to be changed in file configuration.properties into resources folder.

### 3. Build
Run mvn install or import as Maven project to Eclipse and run as maven install to download library required. You need create a runnable jar, libraries out of jar file. Once you have amchartsJava-core as runnable jar can import it to your projects as a library.<br> **Note**: Also must copy amcharts folder(After unzip amcharts exists a folder named amcharts, copy parent folder of that folder, it contains amcharts,images,samples and temp folders) and resources folder to where have amchartsJava-core.jar and change in configuration.properties mode from debug to release.

