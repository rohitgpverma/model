package com.rohit.app.core.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Address {
    @Getter @Setter @DynamoDBAttribute(attributeName = "FirstLine")
    private String firstLine;
    @Getter @Setter @DynamoDBAttribute(attributeName = "SecondLine")
    private String secondLine;
    @Getter @Setter @DynamoDBAttribute(attributeName = "City")
    private String city;
    @Getter @Setter @DynamoDBAttribute(attributeName = "State")
    private String state;
    @Getter @Setter @DynamoDBAttribute(attributeName = "ZipCode")
    private int zipCode;

}
