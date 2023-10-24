# Manual Spring 3 / Java 17

## POM changes

1. Set <java.version> to 17
2. Set <springdoc.version> to 2.2.0
3. Set Spring Boot version to 3.1.5
4. Add jakarta dependency
```xml
<dependency>
    <groupId>jakarta.annotation</groupId>
    <artifactId>jakarta.annotation-api</artifactId>
    <version>2.1.1</version>
</dependency>

```

5. Replace Spring doc dependency

    5.1 Remove this dependency

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>${springdoc.version}</version>
</dependency>
```
    5.2 Add this dependency
```xml
 <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>${springdoc.version}</version>
</dependency>
```

6. Replace references for javax.annotation with jakarta.annotation
7. Replace references for javax.servlet.http to jakarta.servlet.http