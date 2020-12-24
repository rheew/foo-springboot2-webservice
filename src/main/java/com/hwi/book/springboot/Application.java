package com.hwi.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing 와 @SpringBootApplication 가 함께 있으면 @WebMvcTest에서도 @Entity 클래스를 스캔한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
