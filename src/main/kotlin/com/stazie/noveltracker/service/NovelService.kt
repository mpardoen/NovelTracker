package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.Novel
import com.stazie.noveltracker.persistence.entity.Tag
import com.stazie.noveltracker.persistence.repository.NovelRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class NovelService @Autowired constructor(override val repository: NovelRepository): GenericService<Novel>(repository) {
    fun findByName(name: String): Optional<Novel>{
        return repository.findByName(name)
    }

    fun findByAuthor(author: String): Optional<Novel>{
        return repository.findByAuthor(author)
    }

    fun findByTag(tag: Tag): List<Novel>{
        return repository.findAllByTag(tag)
    }
    fun findByTags(tags: List<Tag>): List<Novel>{
        return repository.findAllByTags(tags);
    }
}