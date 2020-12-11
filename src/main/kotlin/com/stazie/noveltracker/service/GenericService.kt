package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.GenericEntity
import com.stazie.noveltracker.persistence.repository.GenericEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull

open class GenericService<T : GenericEntity> @Autowired constructor(open val repository: GenericEntityRepository<T>) {

    /**
     * Find the T entity by ID. Returns null if not found.
     */
    fun findById(id: Long): T?{
        return repository.findByIdOrNull(id)
    }

    fun findAll(): MutableIterable<T> {
        return repository.findAll()
    }

    fun save(item: T) {
        repository.save(item)
    }
}