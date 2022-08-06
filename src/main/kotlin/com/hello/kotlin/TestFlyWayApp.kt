package com.hello.kotlin

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Component
import javax.persistence.*
import javax.transaction.Transactional

@RequiredArgsConstructor
@Component
class TestFlyWayApp (
    private val em: EntityManager
){

    @Transactional
    fun save(member:Member){
        this.em.persist(member)
    }
}