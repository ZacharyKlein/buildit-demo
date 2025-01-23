package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class EmceeGreetingController {

    @Inject
    EmceeAdvisor emceeAdvisor;

    @Get("/{question}")
    HttpResponse<String> answer(String question) {

        return HttpResponse.ok(emceeAdvisor.chat(question));
    }

}
