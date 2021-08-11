package com.rohit.app.core.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Address {
    @Getter @Setter
    private String firstLine;
    @Getter @Setter
    private String secondLine;
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private int zipCode;

}
