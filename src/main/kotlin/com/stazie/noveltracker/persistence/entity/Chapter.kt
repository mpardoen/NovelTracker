package com.stazie.noveltracker.persistence.entity

import java.net.URL
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="chapter")
class Chapter(novel: Novel, number: String? = null): GenericEntity() {
    @Column(name="url")
    var url: URL? = null
    @Column(name="published_date")
    var publishedDate: LocalDate? = null
}
