package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;

    //@NotSpace
    @Pattern(regexp = "^[가-힣]+( [가-힣]+)*$")
    private String korName;

    //@NotSpace
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-z]+)*$")
    private String engName;

    @Min(100)
    @Max(50000)
    private Integer price;
}
