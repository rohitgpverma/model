package com.rohit.app.core.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class User {

    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String preFix;
    @Getter @Setter
    private ContactInformation contactInformation;
    @Getter @Setter
    private Address address;

}
