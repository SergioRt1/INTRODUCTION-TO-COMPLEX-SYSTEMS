# INTRODUCTION TO COMPLEX SYSTEMS, JAVA, MVN, AND GIT

## Description

 This project is an introductory exercise to Maven and Git,
 it contains a program to calculate the mean and standard deviation of a set of n real
 numbers.
 
 also define a custom linkedList structure.
 
 [Architecture description](architectureDescription.pdf)
 
### Prerequisites

 You need to have installed Java at least 1.8 and Apache Maven.

 Installing Apache Maven:
```
sudo apt update
sudo apt install maven
```
 Installing Java JDK Maven:
```
sudo apt update
sudo apt install openjdk-8-jdk
```

### Installing
 Download the repository.
```
git clone https://github.com/SergioRt1/INTRODUCTION-TO-COMPLEX-SYSTEMS.git
```
 
### Running the tests

 You just need to build the project, in this process yo will run te test cases.
```
mvn package
```
 
### How to use

 You need to put a file with a list of real numbers inside the project folder, then build, compile and execute the 
 project with the following commands.
 
  ```
  mvn package
  mvn compile
  mvn exec:java 
  ```
  
  finally enter the relative path to the file from the root directory via standard input, then you will get the mean and standard deviation of the numbers
  inside the provided file via standard output.
  
  
  To get the JavaDoc run
  ```
  mvn javadoc:javadoc
  ```
  
### Built with

 * [Java](https://www.java.com) - programming language
 * [Git](https://git-scm.com) - distributed version-control system for tracking changes in source code
 * [Maven](https://maven.apache.org) - project management and build automation tool

## Author

 * **[Sergio Rodríguez](https://github.com/SergioRt1)**
 
## License

This project is licensed under the Apache-2.0 License - see the [LICENSE](LICENSE) file for details