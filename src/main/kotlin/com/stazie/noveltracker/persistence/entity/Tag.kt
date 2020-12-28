package com.stazie.noveltracker.persistence.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="tag")
data class Tag(val name: String): GenericEntity() {
}
