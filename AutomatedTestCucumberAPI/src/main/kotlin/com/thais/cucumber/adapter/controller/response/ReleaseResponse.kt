package com.thais.cucumber.adapter.controller.response

import io.micronaut.core.annotation.Introspected

@Introspected
data class ReleaseResponse(val release: String)