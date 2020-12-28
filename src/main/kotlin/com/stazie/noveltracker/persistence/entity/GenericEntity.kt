package com.stazie.noveltracker.persistence.entity

import java.time.LocalDate
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class GenericEntity {
    @Id
    @GeneratedValue
    var id: Long? = null

    var created_date: LocalDate? = LocalDate.now()
    var created_by: String? = null
    var updated_date: LocalDate? = null
    var updated_by: String? = null


}