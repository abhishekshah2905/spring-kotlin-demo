package com.kotlin.demo.controllers

import com.kotlin.demo.repositories.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val customerRepository: CustomerRepository) {
    @GetMapping("/")
    fun findAll() = customerRepository.findAll();

    @GetMapping("/{name}")
    fun findByLastName(@PathVariable name: String) = customerRepository.findByLastName(name)
}