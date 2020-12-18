package com.chy.dao;

import lombok.Data;

import java.io.Serializable;


@Data
public class City implements Serializable {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private String population;
}
