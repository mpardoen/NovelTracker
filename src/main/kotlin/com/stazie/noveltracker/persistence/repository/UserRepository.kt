package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.User
import java.util.*

interface UserRepository: GenericEntityRepository<User> {
    fun findByName(name: String): Optional<User>
}
