package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

@MicronautTest
class BigDecimalTest {
    @Inject
    private BigDecimalClient client;

    @Test
    void bigDecimal_integerValue() {
        var dtoIn = new Dto();
        dtoIn.setBigDecimal(new BigDecimal("100"));

        var dtoOut = client.postDto(dtoIn);
        Assertions.assertEquals(dtoIn.getBigDecimal(), dtoOut.getBigDecimal());
    }

    @Test
    void bigDecimal_decimalValue() {
        var dtoIn = new Dto();
        dtoIn.setBigDecimal(new BigDecimal("100.12"));

        var dtoOut = client.postDto(dtoIn);
        Assertions.assertEquals(dtoIn.getBigDecimal(), dtoOut.getBigDecimal());
    }

    @Test
    void bigDecimal_stringValue() {
        var dtoIn = new StringDto();
        dtoIn.setBigDecimal("100");

        var dtoOut = client.postDto(dtoIn);
        Assertions.assertEquals(dtoIn.getBigDecimal(), dtoOut.getBigDecimal());
    }

}