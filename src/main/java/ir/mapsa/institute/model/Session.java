package ir.mapsa.institute.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Session extends BaseEntity<Long>{

    @Column(nullable = false)
    private Date dateOfSession;

    @OneToMany
    @Column(nullable = false)
    private List<Student> presents;

    @OneToMany
    @Column(nullable = false)
    private List<Student> absents;

    @OneToOne
    @JoinColumn(nullable = false)
    private Lesson lesson;

}
