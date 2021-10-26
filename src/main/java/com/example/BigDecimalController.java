package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import jakarta.annotation.security.PermitAll;

@Controller
@Validated
public class BigDecimalController {
    @Post("dto")
    @PermitAll
    public Dto postDto(@Body Dto value) {
        return value;
    }
}
