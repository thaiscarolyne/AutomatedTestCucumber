package com.thais.cucumber.adapter.web.out.v1.response

import io.micronaut.core.annotation.Introspected

@Introspected
data class GitHubRelease(val name: String, val url: String)