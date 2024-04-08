package com.kotlin.demo.repositories

import com.kotlin.demo.models.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}