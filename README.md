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

  In order to run the app you need to build, compile and execute project with the following commands:
  ```
   mvn package
   mvn compile
   mvn exec:java 
   ```

#### Console app

  To use the Console App you need to put a file with a list of real numbers inside the project folder

  finally enter the relative path to the file from the root directory via standard input, then you will get the mean and standard deviation of the numbers
  inside the provided file via standard output.
  
  
  To get the JavaDoc run
  ```
  mvn javadoc:javadoc
  ```
  
#### API Spark
  
  You can use the [API in Heroku](https://statistic-calculator.herokuapp.com) or run it local, the valid urls are:
  ```
  /api/calculate
  /api/calculate/mean
  /api/calculate/standard-deviation
  ```
  An example of a shell cURL
   ```
   curl --request POST \
     --url https://statistic-calculator.herokuapp.com/api/calculate \
     --header 'Content-Type: application/json' \
     --header 'cache-control: no-cache' \
     --data '[ 15, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2 ]'
   ```
      
### Built with

 * [Java](https://www.java.com) - programming language
 * [Git](https://git-scm.com) - distributed version-control system for tracking changes in source code
 * [Maven](https://maven.apache.org) - project management and build automation tool
 * [Spark](http://sparkjava.com) - Micro framework for creating web applications

## Author

 * **[Sergio Rodríguez](https://github.com/SergioRt1)**
 
## License

This project is licensed under the Apache-2.0 License - see the [LICENSE](LICENSE) file for details