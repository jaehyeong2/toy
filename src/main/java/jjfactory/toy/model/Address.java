package jjfactory.toy.model;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {
    private String zipcode;
    private String street;

    protected Address() {
    }

    public Address(String zipcode, String street) {
        this.zipcode = zipcode;
        this.street = street;
    }
}
