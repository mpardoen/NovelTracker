package com.stazie.noveltracker.persistence.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="user")
class User(
    @Column(name= "name")
    var name: String = "",

    @Column(name="email")
    var email: String = ""): GenericEntity() {



    @Column(name="password")
    private var password: String? = null
        fun get() : String?{
            // TODO hash this
            return password
        }

}