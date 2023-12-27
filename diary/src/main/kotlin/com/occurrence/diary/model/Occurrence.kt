package com.occurrence.diary.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Occurrence (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var amountOfContactReceived: Int? = null,
    var occurrenceDateTime: LocalDateTime? = null
){
    override fun hashCode(): Int = id?.hashCode() ?: 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        other as Occurrence

        return id == other.id
    }
}