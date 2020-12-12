package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.Chapter
import com.stazie.noveltracker.persistence.repository.ChapterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort

class ChapterService @Autowired constructor(override val repository: ChapterRepository): GenericService<Chapter>(repository) {
    fun findLatest(maxAmount: Int): List<Chapter>{
        return repository.findAll(PageRequest.of(0,maxAmount, Sort.by(Sort.Direction.DESC, "publishedDate"))).content
    }
}