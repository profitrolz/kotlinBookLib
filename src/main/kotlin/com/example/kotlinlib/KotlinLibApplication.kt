package com.example.kotlinlib

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinLibApplication

fun main(args: Array<String>) {
    runApplication<KotlinLibApplication>(*args)
}
