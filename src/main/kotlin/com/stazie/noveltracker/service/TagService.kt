package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.Tag
import com.stazie.noveltracker.persistence.repository.TagRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class TagService @Autowired constructor(override val repository: TagRepository) : GenericService<Tag>(repository){
    fun findByName(name: String): Optional<Tag>{
        return repository.findByNameIgnoreCase(name)
    }

    fun findByNameLike(name: String): List<Tag>{
        return repository.findByNameContainingIgnoreCase(name)
    }
}