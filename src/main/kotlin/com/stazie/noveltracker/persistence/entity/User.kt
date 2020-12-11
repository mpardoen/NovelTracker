package com.stazie.noveltracker.persistence.entity

class User(name: String, email: String): GenericEntity() {
    private var password: String? = null
        fun get() : String?{
            // TODO hash this
            return password
        }
}