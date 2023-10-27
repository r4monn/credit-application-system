package dev.r4monn.requestcreditsystem.exception

data class BusinessException(override val message: String?): RuntimeException(message) {

}
