package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class CoffeePostDto {
    //@NotSpace
    @NotBlank
    @Pattern(regexp = "^[가-힣]+( [가-힣]+)*$")
    private String korName;

    //@NotSpace
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-z]+)*$")
    private String engName;

    @Min(100)
    @Max(50000)
    private int price;
}
