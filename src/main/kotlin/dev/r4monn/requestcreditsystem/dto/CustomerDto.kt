package dev.r4monn.requestcreditsystem.dto

import dev.r4monn.requestcreditsystem.entity.Address
import dev.r4monn.requestcreditsystem.entity.Customer
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto(
    @field:NotEmpty(message = "This field cannot be null") val firstName: String,
    @field:NotEmpty(message = "This field cannot be null") val lastName: String,

    @field:NotEmpty(message = "This field cannot be null")
    @field:CPF(message = "Enter a valid CPF")
    val cpf: String,

    @field:NotNull(message = "This field cannot be null") val income: BigDecimal,

    @field:NotEmpty(message = "This field cannot be null")
    @field:Email(message = "Enter a valid e-mail")
    val email: String,

    @field:NotEmpty(message = "This field cannot be null") val password: String,
    @field:NotEmpty(message = "This field cannot be null") val zipCode:  String,
    @field:NotEmpty(message = "This field cannot be null") val street: String,
) {
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street,
        )
    )
}
