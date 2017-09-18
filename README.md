# OFAC project

REST Search service for OFAC (Office of Foreign Assets Control) records.


## Data source: 
https://www.treasury.gov/resource-center/sanctions/SDN-List/Pages/sdn_data.aspx

## Requirements:

- Linux / Windows / OSX
- Java 8
- Kotlin
- Gradle

## Usage:

Currently using swagger-ui to access REST service: 

- [https://localhost:8080](http://localhost:8080) (automatically redirects)
- [https://localhost:8080/swagger-ui.html](https://localhost:8080/swagger-ui.html)


## Deployment with HTTPS:

- Run `bootRepachage` gradle task
- Self executable jar will be located: `build/libs`
- Add `application.property` file (example):
    ```server.port: 8443
       server.ssl.key-store: keystore.p12
       server.ssl.key-store-password: 123456
       server.ssl.keyStoreType: PKCS12
       server.ssl.keyAlias: tomcat
    ```
- Add key `keystore.p12`
- Run application: ```java -jar OFAC-1.0-SNAPSHOT.jar```