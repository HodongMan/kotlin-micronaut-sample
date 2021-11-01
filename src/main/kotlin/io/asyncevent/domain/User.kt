package io.asyncevent.domain

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


@MappedEntity
data class User(val name: String) {

    @GeneratedValue
    @Id
    var id: Long? = null
}