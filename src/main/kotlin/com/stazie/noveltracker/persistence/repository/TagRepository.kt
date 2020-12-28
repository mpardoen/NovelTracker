package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.Tag
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TagRepository: CrudRepository<Tag,Long> {
    fun findByNameContainingIgnoreCase(name: String): List<Tag>

    fun findByNameIgnoreCase(name:String): Optional<Tag>
}