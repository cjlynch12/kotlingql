package com.clynch.kotlingql.sql

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column

@Entity(name = "widget")
data class WidgetEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false)
        var id: Long? = null,

        @Column(nullable =  false)
        var description: String = ""
)