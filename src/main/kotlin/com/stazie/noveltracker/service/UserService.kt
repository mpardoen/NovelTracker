package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.User
import com.stazie.noveltracker.persistence.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired

class UserService @Autowired constructor (override val repository: UserRepository): GenericService<User>(repository){

    fun getByName(name: String): User?{
        return repository.findByName(name).orElse(null);
    }
}