package com.routeone.ofac

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.routeone.ofac"))
        class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}