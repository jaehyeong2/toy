package jjfactory.toy.dto;

import jjfactory.toy.model.Address;
import jjfactory.toy.model.Employee;
import jjfactory.toy.model.enums.Gender;
import lombok.Data;

@Data
public class EnrollReq {
    private String name;
    private String email;
    private int age;

    private String zipcode;
    private String street;

    private Gender gender;

    public Employee toEntity(){
        Address address = new Address(zipcode,street);

        return Employee.builder()
                    .name(name)
                    .email(email)
                    .age(age)
                    .address(address)
                    .gender(gender)
                    .build();
    }
}
