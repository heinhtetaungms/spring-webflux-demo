package org.kyi.springwebfluxdemo;

import org.kyi.springwebfluxdemo.entity.User;
import org.kyi.springwebfluxdemo.repository.UserRepository;
import org.kyi.springwebfluxdemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class SpringWebfluxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebfluxDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            User user = new User("Hein", 24, 400000, "MI");
            userService.createUser(user);
        };
    }

}
