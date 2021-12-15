package ir.mapsa.institute.controller;

import ir.mapsa.institute.dto.CourseDto;
import ir.mapsa.institute.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "/api/courses")

public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "")
    public ResponseEntity getCourses(){
      return  new ResponseEntity ( courseService.getAll() , HttpStatus.OK);
    }

    @PostMapping(value = "/store", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity store(@RequestBody CourseDto courseDto) {
        return new ResponseEntity<>(courseService.create(courseDto), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity fetch(@PathVariable(required = true) Long id) {
        return new ResponseEntity<>(courseService.getOne(id), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity update(@PathVariable(required = true) Long id, @RequestBody CourseDto courseDto) {
        return new ResponseEntity<>(courseService.update(id , courseDto) ,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity delete(@PathVariable(required = true) Long id)  {
        courseService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
