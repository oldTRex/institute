package ir.mapsa.institute.dto;

import ir.mapsa.institute.model.Lesson;
import ir.mapsa.institute.model.Student;
import ir.mapsa.institute.model.Teacher;

import java.util.Date;
import java.util.List;

public class CourseDto {

    private String name;
    private Date startTime;
    private Date endTimee;
    private int capacity;

    public CourseDto() {
    }

    public CourseDto(String name, Date startTime, Date endTimee, int capacity) {
        this.name = name;
        this.startTime = startTime;
        this.endTimee = endTimee;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTimee() {
        return endTimee;
    }

    public void setEndTimee(Date endTimee) {
        this.endTimee = endTimee;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
