package ir.mapsa.institute.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Course extends BaseEntity<Long> {

    @Column(unique = true)
    private String name;

    private Date startTime;

    private Date endTime;

    private int capacity;

    private int tuitionFee;

    private int maxAllowedAge;

    private int minAllowedAge;

    @OneToOne
    private Lesson lesson;

    @ManyToOne(cascade = CascadeType.ALL) // eager
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
