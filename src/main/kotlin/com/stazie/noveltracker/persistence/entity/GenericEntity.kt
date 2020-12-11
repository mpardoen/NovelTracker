package com.stazie.noveltracker.persistence.entity

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
abstract class GenericEntity {
    @Id
    @GeneratedValue
    var id: Long? = null

    var created_date: LocalDate? = null
    var created_by: String? = null
    var updated_date: LocalDate? = null
    var updated_by: String? = null


}