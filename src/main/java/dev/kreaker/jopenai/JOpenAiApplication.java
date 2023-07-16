package dev.kreaker.jopenai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JOpenAiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JOpenAiApplication.class, args);
	}
}
