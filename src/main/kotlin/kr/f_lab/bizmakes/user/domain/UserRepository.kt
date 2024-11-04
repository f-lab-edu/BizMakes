package kr.f_lab.bizmakes.user.domain

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}