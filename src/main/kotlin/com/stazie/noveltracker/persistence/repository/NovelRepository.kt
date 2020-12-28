package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.Novel
import com.stazie.noveltracker.persistence.entity.Tag
import org.springframework.data.repository.CrudRepository
import java.util.*

interface NovelRepository: CrudRepository<Novel,Long> {
    fun findByNameIgnoreCase(name: String): Optional<Novel>
    fun findByNameContainingIgnoreCase(title: String): List<Novel>
    fun findByAuthor(author: String): Optional<Novel>

    fun findAllByTags(tag: Tag): List<Novel>
    fun findAllByTagsIn(tags: List<Tag>): List<Novel>

}
