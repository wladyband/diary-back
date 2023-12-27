package com.occurrence.diary.repository

import com.occurrence.diary.model.Occurrence
import org.springframework.data.jpa.repository.JpaRepository

interface OccurrenceRepository : JpaRepository<Occurrence, Long> {

}