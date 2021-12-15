package ir.mapsa.institute.repository;

import ir.mapsa.institute.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepository  extends JpaRepository<Course ,Long> {

}
