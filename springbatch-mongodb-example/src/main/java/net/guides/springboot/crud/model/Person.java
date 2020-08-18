package net.guides.springboot.crud.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Getter
@Setter
@Document
public class Person {

    private int custId;
    private String name;
    private String email;
    private String contactNo;
    private Date dob;
    private String status;
    private double outstandingAmount;
    private Date lastDueDate;

}
