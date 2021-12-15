package ir.mapsa.institute.service;

import ir.mapsa.institute.dto.CourseDto;
import ir.mapsa.institute.mapper.CourseMapper;
import ir.mapsa.institute.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service

public class LessonService {


    private final CourseRepository courseRepository;

    public LessonService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseDto getBooks() {
        return (CourseDto) courseRepository.findAll().stream().map(CourseMapper.INSTANCE::getDto);
    }
}
