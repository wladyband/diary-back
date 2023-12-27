package com.occurrence.diary.resource

import com.occurrence.diary.model.Occurrence
import com.occurrence.diary.repository.OccurrenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ocorrencia")
class OccurrenceResource {

    @Autowired
    private lateinit var occurrenceRepository: OccurrenceRepository

    @GetMapping
    fun listar(): List<Occurrence> {
        return occurrenceRepository.findAll()
    }

    @GetMapping("/ola")
    fun  saudacao(): String  {
        return "olá mundo"
    }

}