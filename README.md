# Kotlin에서 Flyway를 사용해보자!

Flyway란 ? : https://coding-jun.tistory.com/14

application.yml 설정
```yaml
spring:

  datasource:
    url: jdbc:mysql://localhost:3306/flyway
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: // 유저 이름
    password: // 비밀번호

  jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    properties:
      hibernate:
        show_sql: true
        format_sql: true
        hbm2ddl:
          auto: validate
```