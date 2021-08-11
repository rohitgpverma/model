package com.rohit.app.core.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class ContactInformation {
    @Getter @Setter
    private String emailId;
    @Getter @Setter
    private int phoneNumber;
}
