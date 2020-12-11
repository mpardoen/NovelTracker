package com.stazie.noveltracker.persistence.repository

import com.stazie.noveltracker.persistence.entity.GenericEntity
import org.springframework.data.repository.CrudRepository

interface GenericEntityRepository<T : GenericEntity> : CrudRepository<T ,Long> {

}