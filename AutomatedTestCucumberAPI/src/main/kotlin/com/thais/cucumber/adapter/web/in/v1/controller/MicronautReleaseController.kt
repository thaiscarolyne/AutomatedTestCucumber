package com.thais.cucumber.adapter.web.`in`.v1.controller

import com.thais.cucumber.adapter.web.`in`.v1.controller.response.ReleaseResponse
import com.thais.cucumber.adapter.web.out.v1.GitHubClient
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/releases/last")
class MicronautReleaseController(private val gitHubClient: GitHubClient) {
    @Get(produces = [MediaType.TEXT_JSON])
    fun getLastRelease(): ReleaseResponse {
        return ReleaseResponse(gitHubClient.fetchReleases()?.blockingFirst()?.name ?: "")
    }
}