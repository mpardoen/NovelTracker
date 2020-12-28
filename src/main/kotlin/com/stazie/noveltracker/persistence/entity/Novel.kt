package com.stazie.noveltracker.persistence.entity

import javax.persistence.*

@Entity
@Table(name="novel")
class Novel(

    @Column(name="name")
    var name: String = "NO_NAME"

                ): GenericEntity() {
    @OneToMany()
    var chapters: List<Chapter> = emptyList()

    @Column(name="author")
    var author: String = ""

    @OneToMany()
    var tags: Set<Tag> = emptySet()
}
