package kr.f_lab.bizmakes.user.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column(nullable = false, unique = true)
    val email: String,

    @Column(nullable = false)
    val provider: String = "EMAIL",

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val encodedPassword: String,

    val phoneNumber: String? = null,

    val address: String? = null,

    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    val updatedAt: LocalDateTime = createdAt,

    val deletedAt: LocalDateTime? = null
)