package com.rohit.app.core.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class ContactInformation {
    @Getter @Setter @DynamoDBAttribute(attributeName = "EmailId")
    private String emailId;
    @Getter @Setter @DynamoDBAttribute(attributeName = "PhoneNumber")
    private String phoneNumber;
}
