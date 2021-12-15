package ir.mapsa.institute.model;

import javax.persistence.*;

@Entity
public class Address extends BaseEntity<Long> {

    private String country;
    private String city;
    private String street;
    private String alley;
    private String buildingNo;
    private String postalCode;


}
