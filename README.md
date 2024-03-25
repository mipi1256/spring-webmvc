# Spring Boot3 Web MVC 학습!

## 프로젝트 초기 설정시 추가할 문법
- build.gradle 파일에 jsp 설정 추가
```
    implementation 'org.apache.tomcat.embed:tomcat-embed-jasper'
    implementation 'jakarta.servlet:jakarta.servlet-api'
    implementation 'jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api'
    implementation 'org.glassfish.web:jakarta.servlet.jsp.jstl'
```

- application.properties 파일에 추가
```
# server port change
server.port=8181

# jsp view resolver setting
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

- 자바프로그램과 MySQL을 연동해주는 커넥터 추가
```
https://mvnrepository.com/artifact/mysql/mysql-connector-java

implementation 'mysql:mysql-connector-java:8.0.33'
```

- Spring Boot Starter JDBC 추가
```
https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-jdbc

implementation 'org.springframework.boot:spring-boot-starter-jdbc:3.2.4'

```
