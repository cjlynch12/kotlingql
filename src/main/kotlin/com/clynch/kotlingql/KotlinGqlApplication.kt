package com.clynch.kotlingql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class KotlinGqlApplication

fun main(args: Array<String>) {
	runApplication<KotlinGqlApplication>(*args)
}
