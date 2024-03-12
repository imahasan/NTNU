# M2T Transformation

This project uses an instance of the studyprogramme model that we created during assignment-1 to generate a html-webpage using a model-to-text (M2T) framework (Acceleo). Below is a description of this part of the task.

## Structure
``` 
.
.
├── tdt4250.studyprogramme.html
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── OSGI-INF
│   │   └── bundle.properties
│   ├── Sample Output
│   │   └── programmes.html
│   ├── bin/tdt4250/studyprogramme
│   │   │── html
│   │   │	└── main
│   │   │	└── common
│   │   │── impl
│   │   └── util
│   ├── model
│   └── src-gen
├── README.md
├── build.properties
├── plugin.properties
└── plugin.xml
``` 

## Project Arrangement

### Packages ([src/](src/))

The `src` folder contains all the Acceleo related files and folders. Three Java packages are located here.

#### [tdt4250/studyprogramme/html](src/tdt4250/studyprogramme/html/)

[`Activator.java`](src/tdt4250/studyprogramme/html/Activator.java) Is a generated file that controls the plug-in life cycle.

#### [tdt4250/studyprogramme/html/main](src/tdt4250/studyprogramme/html/main/) 
[`Generate.java`](src/tdt4250/studyprogramme/html/main/Generate.java)  Provides the main entry point of the 'Generate' generation module.

[`generate.mtl`](src/tdt4250/studyprogramme/html/main/generate.mtl) Is the main template used for the model-to-text (m2t) transformation. Most of the "relevant" m2t code is located in this file.

#### [tdt4250/studyprogramme/html/common](src/tdt4250/studyprogramme/html/common/)

[`Utils.java`](src/tdt4250/studyprogramme/html/common/Utils.java) Provides various utility functions.

[`utils.mtl`](src/tdt4250/studyprogramme/html/main/generate.mtl) Wraps the diffrent utility functions defined in the Utility class in separate queries, and exports them as a module.

### Generated files ([src-gen/](src-gen/))
All generated files are located in the `src-gen`folder.

## Running Acceleo Transformation

### Prequisites
You should already have Eclipse installed, with the Acceleo SDK installed.

### Setup Run Configuration

First, import all the modules into an Eclipse Workspace. Then right-click the `tdt4250.studyprogramme.html` module and select `Run Configurations...` under `Run As`. After that right-click `Acceleo Application` and select `New Configuration` in the popup window to create runnable Acceleo configuration.

Enter the following configuration options as mentioned below:

**Project:** /tdt4250.studyprogram.html

**Main class:** /tdt4250.studyprogram.html.main.Generate

**Model:** /tdt4250.studyprogram.html.model/model/UOD.xmi

**Target:** /tdt4250.studyprogram.html/src-gen

**Runner:** select 'Java Application'

Finally 'Apply' and 'Run'.

The final output html file will be available in `src-gen` folder. Double click the file 'programmes.html' and this wil take you to your default web-browser to show the final output.

**Footnote:** Sorry for editing the project file after submission. I just editted this 'README.md' file for some minor changes that I left un-noticed.
