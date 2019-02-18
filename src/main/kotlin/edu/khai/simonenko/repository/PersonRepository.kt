package edu.khai.simonenko.repository

import edu.khai.simonenko.model.Person
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface PersonRepository : R2dbcRepository<Person, Int> {

    fun findAllByName(name: String): Flux<Person>
    fun findAllByAge(age: Int): Flux<Person>
}