package com.example;

import io.micronaut.core.annotation.Introspected;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Introspected
public class StringDto {
    private String bigDecimal;
}
