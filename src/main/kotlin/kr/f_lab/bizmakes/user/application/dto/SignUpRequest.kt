package kr.f_lab.bizmakes.user.application.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Size
import kr.f_lab.bizmakes.user.domain.User

data class SignUpRequest(
    @field:Email
    val email: String,

    @field:Size(min = 8, max = 20)
    val password: String,

    @field:Size(min = 2, max = 20)
    val name: String
) {
    fun toEntity(): User {
        return User(
            email = email,
            encodedPassword = password, // TODO 비밀번호 인코딩
            name = name
        )
    }
}
