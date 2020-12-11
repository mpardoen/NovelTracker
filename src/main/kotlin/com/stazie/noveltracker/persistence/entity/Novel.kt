package com.stazie.noveltracker.persistence.entity

import javax.persistence.OneToMany


class Novel(name: String = "NO_NAME"): GenericEntity() {
    @OneToMany()
    var chapters: List<Chapter> = emptyList()

    var author: String = ""
    var tags: Set<Tag> = emptySet()
}
