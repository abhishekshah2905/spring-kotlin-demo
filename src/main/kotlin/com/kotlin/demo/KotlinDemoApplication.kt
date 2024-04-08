package com.kotlin.demo

import com.kotlin.demo.models.Customer
import com.kotlin.demo.repositories.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinDemoApplication {
    @Bean
    fun init(customerRepository: CustomerRepository) = CommandLineRunner {
        customerRepository.save(Customer("Abhishek", "Shah"))
        customerRepository.save(Customer("Gogen", "Gurung"))
        customerRepository.save(Customer("Yogesh", "Bhattrai"))
        customerRepository.save(Customer("Yogendra", "Rai"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinDemoApplication::class.java, *args)
}
