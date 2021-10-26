package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "/")
public interface BigDecimalClient {
    @Post("dto")
    Dto postDto(@Body Dto value);

    @Post("dto")
    StringDto postDto(@Body StringDto value);
}