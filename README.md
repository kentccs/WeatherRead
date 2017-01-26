# WeatherRead

This project reads .dat file.It reads values in columns and rows tailored only for that specific file.


Code Question:
=================
The accompanying file weather.dat contains weather data for a single month as space-separated values. The first column (Dy) contains the day of the month; the second (MxT) contains the maximum temperature for that day, while the third (MnT) contains the minimum temperature.

The final row contains aggregate values for the entire month.

Write a program to find the row with the maximum spread in the weather.dat file, where spread is defined as the difference between MxT and MnT. For example, the spread for day 2 was (79 - 63) = 16.

Your program should print the day of the month and spread to standard output.

Solution:

The solution has been handled through java.
There is only one class handling this called Main class, however due to 

Steps to run
---------------

1. Ensure the weather.dat file resides on the root folder with the java jar file.

folder ----- WeatherRead.jar
	     |
	     --- weather.dat
	     |
	     --- README.TXT
2. open command prompt on windows or terminal on Linux and MAC and navigate to the folder

3. i) Run the following command to execute the program

	java -jar WeatherRead.jar

The sample output will be thrown on screen as follows;

   9 54.0

ii) option 2 to run the program when you want to see all the days difference, put showall at the end 
of the command

	java -jar WeatherRead.jar showall

The sample output will be thrown on screen as follows

Day 1: 29.0
Day 2: 16.0
Day 3: 22.0
Day 4: 18.0
Day 5: 24.0
Day 6: 20.0
Day 7: 16.0
Day 8: 21.0
Day 9: 54.0
Day 10: 20.0
Day 11: 32.0
Day 12: 15.0
Day 13: 11.0
Day 14: 2.0
Day 15: 9.0
Day 16: 20.0
Day 17: 24.0
Day 18: 30.0
Day 19: 20.0
Day 20: 27.0
Day 21: 27.0
Day 22: 26.0
Day 23: 22.0
Day 24: 13.0
Day 25: 18.0
Day 26: 33.0
Day 27: 19.0
Day 28: 16.0
Day 29: 22.0
Day 30: 45.0
9 54.0

Thanks

Regards

========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line or terminal, go to the dist folder and
type the following:

java -jar WeatherRead.jar 