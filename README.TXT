------------------------------------------------------------------------
This is a Java recipe book project for Programming 1
By: John Knight Espinosa and Gilbert Aquino
Version 1.2
------------------------------------------------------------------------

Project Title: Recipe Book

# Purpose of Project: The purpose of this project is to allow users to create, store, and manage recipes. Users can add ingredients, rate recipes, scale serving sizes,
and view the top-rated recipe through a menu-driven interface.


## How to Run the Project
1. Open the project in BlueJ.
2. Compile all classes.
3. Right-click the `Driver` class.
4. Select `void main(String[] args)` to run the program.
5. Use the menu options displayed in the terminal.


## Running the Program Outside of BlueJ

1. Make sure Java (JDK) is installed on your computer.
2. Download the zip file through Code < Download ZIP
3. Extract the file, and on the extracted file hold shift, right-click and press on Open in Powershell.

4. Exclude the tester files as sometimes JUnit files cause issues with Powershell by running: 

   javac (Get-ChildItem *.java -Exclude *Test.java)

5. Now you can run the line:

   java Driver

6. Follow the on-screen menu instructions to use the program.

-----------------------------------------------------------------------

Limitations:
- Console-based application only
- No data persistence (recipes are not saved)
- Designed for small data sets
- Basic input validation
- Simple search functionality

Future Improvements:
- Save and load recipes from a file
- Add a graphical user interface (Which we have not learned yet, but still an improvement to be made)
- Edit or delete existing recipes
- Improve search functionality
- Sort recipes by rating or name

