package com.rubisco.stockms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockmsApplication

fun main(args: Array<String>) {
	runApplication<StockmsApplication>(*args)
}
