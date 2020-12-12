package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.Tag
import java.util.*

interface TagRepository: GenericEntityRepository<Tag> {
    fun findByNameContainingIgnoreCase(name: String): List<Tag>

    fun findByNameIgnoreCase(name:String): Optional<Tag>
}