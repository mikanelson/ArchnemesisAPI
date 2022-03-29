[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT INFO -->
<br />
<div align="center">
<h3 align="center">Archnemesis API</h3>

  <p align="center">
    A fan-made API designed to remove some of the complexity surrounding Archnemesis
  </p>
</div>

<!-- ABOUT THE PROJECT -->
## About The Project
Every few months, I look forward to the release of the next Path of Exile league. With it, new mechanics are introduced,
and all league progress is wiped. However, the Archnemesis league introduced a mechanic that requires careful
management of many "modifiers" - the league's crafting mechanic. In short, modifiers feed into recipes. These recipes
then create further modifiers. [Here](https://i.redd.it/42t8vavix7g81.png) is an example of a fan-made chart 
showcasing the recipes. In order to streamline the process of targeting certain recipes, I created this API.

## Technologies Utilized

* [Maven](https://maven.apache.org/) - Dependency Management
* [Tomcat](https://tomcat.apache.org/) - Development Web Server
* [Spring Framework, Spring Boot, Spring Data](https://spring.io/projects/) - Dependency injection, MVC
* [Azure VM, Azure DB](https://azure.microsoft.com/) - REST endpoint hosting, Azure SQL DB hosting
* [Hibernate](https://hibernate.org/orm/) - ORM

## Features

Implemented:
* Request all modifiers
* Request modifier by name, id, or reward type
* Add, delete, or update modifier
* Request all recipes
* Request recipe by name, id, reward type, or modifiers
* Add, delete, or update recipe

To-Do:
* Add modifier icon urls

## Getting Started

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites
* Java 8
  ```sh
  https://www.oracle.com/java/technologies/downloads/#java8
  ```
* Maven
  ```sh
  https://maven.apache.org/download.cgi
  ```
* Any database

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/mikanelson/ArchnemesisAPI
   ```
2. Navigate to the downloaded repository
   
3. Install the dependencies
   ```sh
   mvn clean install
   ```

4. Create a file named `application.properties`. An example is provided below for Azure SQL. If you are using a different
database, you will have to change the dialect.
   ```sh
    spring.datasource.url={DB_URL}
    spring.datasource.username={DB_USERNAME}
    spring.datasource.password={DB_PASSWORD}
    hibernate.dialect=org.hibernate.dialect.SQLServerDialect
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.initialization-mode=always
    spring.jpa.show-sql=true

    server.port=9000
   ```

<!-- USAGE EXAMPLES -->
## Usage
1. Package the project
   ```sh
   mvn package
   ```
   
2. Navigate to the target directory

3. Run the jar file
   ```sh
   java -jar <filename>.jar
   ```
<!-- CONTACT -->
## Contact

Mika Nelson - [@ItsUnworthiness](https://twitter.com/ItsUnworthiness) - mika.nelson@protonmail.com

Project Link: [https://github.com/mikanelson/ArchnemesisAPI](https://github.com/mikanelson/ArchnemesisAPI)

<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [u/iAkrobat](https://www.reddit.com/user/iAkrobat/) - Archnemesis Modifier Chart
* [Grinding Gear Games](https://grindinggear.com/) - Path of Exile Developer

<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/mika-nelson-623801154/
