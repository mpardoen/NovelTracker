package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.GenericEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface GenericEntityRepository<T : GenericEntity> : JpaRepository<T, Long> {

}