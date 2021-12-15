package ir.mapsa.institute.mapper;

import ir.mapsa.institute.dto.CourseDto;
import ir.mapsa.institute.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper

public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
    CourseDto getDto(Course course);
}
