package dev.r4monn.requestcreditsystem.service

import dev.r4monn.requestcreditsystem.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}