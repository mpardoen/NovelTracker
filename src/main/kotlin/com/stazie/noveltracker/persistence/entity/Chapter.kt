package com.stazie.noveltracker.persistence.entity

import java.net.URL
import java.time.LocalDate

class Chapter(novel: Novel, number: String? = null): GenericEntity() {
    var url: URL? = null
    var publishedDate: LocalDate? = null
}
