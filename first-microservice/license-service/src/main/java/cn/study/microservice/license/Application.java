package cn.study.microservice.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//该注解表明该类是项目(微服务)的启动类
@SpringBootApplication
public class Application {
	//运行该方法，会启动整个Spring Boot服务
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
