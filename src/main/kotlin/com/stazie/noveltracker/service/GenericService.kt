package com.stazie.noveltracker.service

import com.stazie.noveltracker.persistence.entity.GenericEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
abstract class GenericService<T : GenericEntity> @Autowired constructor(open val repository: CrudRepository<T,Long>) {

    /**
     * Find the T entity by ID. Returns null if not found.
     */
    fun findById(id: Long): Optional<T> {
        return repository.findById(id)
    }

    fun findAll(): MutableIterable<T> {
        return repository.findAll()
    }

    fun save(item: T) {
        repository.save(item)
    }
}