package ir.mapsa.institute.model;


import javax.persistence.OneToOne;
import java.util.List;

public class Teacher extends User{

    @OneToOne
    private List<Course> courses;
}
