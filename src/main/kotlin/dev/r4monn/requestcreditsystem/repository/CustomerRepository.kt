package dev.r4monn.requestcreditsystem.repository

import dev.r4monn.requestcreditsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
}