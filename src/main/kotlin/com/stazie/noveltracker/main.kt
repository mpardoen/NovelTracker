package com.stazie.noveltracker

import com.stazie.noveltracker.persistence.entity.User
import com.stazie.noveltracker.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Autowired
lateinit var userService: UserService

@EnableJpaRepositories("com.stazie.noveltracker.persistence.repository")
@ComponentScan(basePackages = ["com.stazie.noveltracker"])
@EntityScan("com.stazie.noveltracker.persistence.entity")
@SpringBootApplication
class Application {

    @Bean
    fun init(userService: UserService) = CommandLineRunner {
        userService.save(User("stazie","juodaan@gmail.com"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}