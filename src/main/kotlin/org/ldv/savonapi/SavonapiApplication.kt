package org.ldv.savonapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SavonapiApplication

fun main(args: Array<String>) {
    runApplication<SavonapiApplication>(*args)
}
