package com.thais.cucumber.adapter.web.out.v1

import com.thais.cucumber.adapter.web.out.v1.response.GitHubRelease
import io.micronaut.http.HttpHeaders
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Headers
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable

@Client("\${github.url}")
@Headers(
    Header(name = HttpHeaders.USER_AGENT, value = "Micronaut HTTP Client"),
    Header(name = HttpHeaders.ACCEPT, value = "application/vnd.github.v3+json, application/json")
)
interface GitHubClient {

    @Get("/repos/\${github.organization}/\${github.repo}/releases")
    fun fetchReleases(): Flowable<GitHubRelease?>?
}