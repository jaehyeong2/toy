package jjfactory.toy.model;

import jjfactory.toy.model.enums.Gender;
import jjfactory.toy.model.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Builder
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Long id;

    private String name;
    private String email;
    private int age;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Gender gender; //M, F
    @Enumerated(EnumType.STRING)
    private Role role; //USER , ADMIN

    private LocalDateTime enrollDate;

    @PrePersist
    public void enroll(){
        enrollDate = LocalDateTime.now();
    }
}
