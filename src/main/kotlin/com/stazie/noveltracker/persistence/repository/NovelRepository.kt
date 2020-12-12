package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.Novel
import com.stazie.noveltracker.persistence.entity.Tag
import java.util.*

interface NovelRepository: GenericEntityRepository<Novel> {
    fun findByNameIgnoreCase(name: String): Optional<Novel>
    fun findByTitleContainingIgnoreCase(title: String): List<Novel>
    fun findByAuthor(author: String): Optional<Novel>

    fun findAllByTag(tag: Tag): List<Novel>
    fun findAllByTags(tags: List<Tag>): List<Novel>

}
