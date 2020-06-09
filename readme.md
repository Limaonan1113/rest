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