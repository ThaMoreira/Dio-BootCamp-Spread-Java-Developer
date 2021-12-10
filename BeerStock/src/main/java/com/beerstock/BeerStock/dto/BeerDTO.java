package com.beerstock.BeerStock.dto;


import com.beerstock.BeerStock.enums.BeerType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    private Long id;

    @NotNull
    @Size(min =1, max=260)
    private String name;

    @NotNull
    @Size(min =1, max=260)
    private String brand;

    @NotNull
    @Max(500)
    private Integer max;

    @NotNull
    @Max(500)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type;

}

