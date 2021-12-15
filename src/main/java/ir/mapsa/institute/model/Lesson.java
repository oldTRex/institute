package ir.mapsa.institute.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Lesson extends BaseEntity<Long>{

    @Column(unique = true)
    private String name;

    private int maxAllowedAge;

    private int minAllowedAge;



    @OneToMany
    private List<Lesson> preRequirements;


}
