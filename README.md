Compiling and running programs in Git Bash console

A) Compiling and running the program with an external library:
  
  1. Open the directory with the projects (LeverXHomeworkPart1).
   
  2. To compile the 'Program.java' exetuce 'javac -cp src/apache/commons-lang3-3.12.0.jar src/com/google/withExternalLibrary/Program.java'
  
  3. To run the project execute 'java -cp src/apache/commons-lang3-3.12.0.jar src/com/google/withExternalLibrary/Program.java'
  
B) Compiling and running the program with different classes:
  
  1. Do the first step from A.
  
  2. To compile the 'Student.java' execute 'javac src/com/google/withDifferentClasses/Student.java'
  
  3. To compile the 'Program.java' execute 'javac -cp src src/com/google/withDifferentClasses/Program.java'
  
  4. To run the program execute 'java -cp src com/google/withDifferentClasses/Program'
  
  5. Enter a name then two numbers 
  
C) Compiling and running the program with functional Interface:

  1. Do the first step from A.
  
  2. To compile the 'MyFunctionalInterface.java' execute 'javac src/com/google/withFuncInterface/MyFunctionalInterface.java'
  
  3. To compile the 'Program.java' execute 'javac -cp src src/com/google/withFuncInterface/Program.java'
  
  4. To run the program execute 'java -cp src com/google/withFuncInterface/Program'
  
D) Creating an executable .jar file:

  1. Do the first step from A. Open the directory 'src'.
 
  2. Create a file 'Manifest.txt' then you need to add a string like 'Main-Class: MyPackage.MyClass' in this file. 
     In this case it will be 'Main-Class: com.google.withDifferentClasses.Program'

  3. To create an executable jar file you need to execute a command like this 'jar cfm <jar_filename>.jar Manifest.txt MyPackage/*.class'
     In this case it will be ''jar cfm myJar.jar Manifest.txt com/google/withDifferentClasses/*.class'.

  4. To run this jar file execute 'java -jar myJar.jar'.
  
  
  
