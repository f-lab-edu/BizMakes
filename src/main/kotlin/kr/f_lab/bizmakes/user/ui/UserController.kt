package kr.f_lab.bizmakes.user.ui

import jakarta.validation.Valid
import kr.f_lab.bizmakes.user.application.UserService
import kr.f_lab.bizmakes.user.application.dto.SignUpRequest
import kr.f_lab.bizmakes.user.application.dto.SignUpResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    val userService: UserService
) {

    @PostMapping
    fun signUp(@Valid @RequestBody request: SignUpRequest): SignUpResponse {
        return userService.signUp(request)
    }
}