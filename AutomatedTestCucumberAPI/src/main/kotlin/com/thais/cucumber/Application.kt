package com.thais.cucumber

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.thais.cucumber")
		.start()
}

