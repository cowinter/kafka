package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

//    @Bean
//    public Consumer<String> get(){
//        return string -> System.out.println(string);
//
//    }
//
    @Bean
    public Function<String, String> upperCase() {
        return value -> {
            System.out.println("Received: " + value);
            return value.toUpperCase();
        };
    }

//    @Bean
//    public Consumer<String> sink() {
//        System.out.println("0000");
//        return System.out::println;
//    }
    @Bean
    public Function<String,String> randomStr() {
        return s -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "product";
        };
    }

//    public class Person {
//        private String name;
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//        public String toString() {
//            return this.name;
//        }
//    }

}
