SPRING BOOT RESTFUL
=====================
## srpring boot restful风格接口
   
  1、本节参照[spring](https://spring.io/guides/gs/rest-service/)官网
 
## spring boot集成mybatis
    
    集成mybatis spring-boot 自动装配添加依赖：
    <dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.1.1</version>
    </dependency>
#### 启动类加注解
    @SpringBootApplication
    @MapperScan("com.restful.rest.mapper") //扫描mapper下面所有interface
    public class RestApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(RestApplication.class, args);
        }
    
    }
    
### spring Boot最重要的四个核心
    1、自动配置：针对很多spring应用程序常见的应用功能，spring Boot能自动提供相关配置
    2、起步依赖：告诉spring Boot需要什么功能，他就能引入需要的库。
    3、命令行界面：这是Spring Boot的可选特性，借此你只需要写代码就能完整的应用程序，无
       无需传统项目构建。
    4、Actuator：让你能够深入运行的spring Boot应用程序，一探究竟。