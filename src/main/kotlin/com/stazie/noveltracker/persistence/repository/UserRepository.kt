package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository: CrudRepository<User,Long> {
    fun findByName(name: String): Optional<User>
}
