package kr.f_lab.bizmakes.user.application

import kr.f_lab.bizmakes.user.application.dto.SignUpRequest
import kr.f_lab.bizmakes.user.application.dto.SignUpResponse
import kr.f_lab.bizmakes.user.domain.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun signUp(request: SignUpRequest): SignUpResponse {
        userRepository.save(request.toEntity()).let {
            return SignUpResponse(
                id = it.id,
                email = it.email,
                name = it.name,
                createdAt = it.createdAt
            )
        }
    }
}
