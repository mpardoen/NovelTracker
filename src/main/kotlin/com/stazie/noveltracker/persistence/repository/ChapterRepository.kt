package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.Chapter
import org.springframework.data.repository.PagingAndSortingRepository

interface ChapterRepository: PagingAndSortingRepository<Chapter, Long> {

}