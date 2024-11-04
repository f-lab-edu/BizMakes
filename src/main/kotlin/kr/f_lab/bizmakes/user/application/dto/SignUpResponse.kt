package kr.f_lab.bizmakes.user.application.dto

import java.time.LocalDateTime

data class SignUpResponse(
    val id: Long,
    val email: String,
    val name: String,
    val createdAt: LocalDateTime
)
