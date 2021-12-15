package ir.mapsa.institute.model;

import javax.persistence.*;

@Entity
public class User extends BaseEntity<Long>{


    private String firstname;

    private String lastname;

    private String email;

    @Column(nullable = false)
    private String username;

    private String password;

    @Column(nullable = false)
    private String phoneNumber;

    private String nationalCode;

    @OneToOne(orphanRemoval = true, fetch = FetchType.LAZY)
    private Address address;

}
