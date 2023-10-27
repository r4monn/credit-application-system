package dev.r4monn.requestcreditsystem.dto

import dev.r4monn.requestcreditsystem.entity.Credit
import dev.r4monn.requestcreditsystem.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "This field cannot be null") val creditValue: BigDecimal,
    @field:Future val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field:NotNull(message = "This field cannot be null") val customerId: Long,
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
