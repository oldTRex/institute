package ir.mapsa.institute.service;

import ir.mapsa.institute.dto.CourseDto;
import ir.mapsa.institute.mapper.CourseMapper;
import ir.mapsa.institute.model.Course;
import ir.mapsa.institute.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class CourseService {


    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseDto> getAll() {

        return courseRepository.findAll().stream().map(CourseMapper.INSTANCE::getDto).collect(Collectors.toList());
    }

    public Optional<CourseDto> getOne(long id) {
        return courseRepository.findById(id).map(CourseMapper.INSTANCE::getDto);
    }

    public CourseDto create(CourseDto courseDto) {
        return courseDto;
    }

    public CourseDto update(long id, CourseDto courseDto) {
        return new CourseDto();
    }

    public void delete(long id) {

    }
}
