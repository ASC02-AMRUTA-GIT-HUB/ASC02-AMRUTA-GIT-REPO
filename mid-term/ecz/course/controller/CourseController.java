package com.ecz.course.controller;

import com.ecz.course.entity.CourseEntity;
import com.ecz.course.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /** B + C: list or search by author/course name */
    @GetMapping
    public ResponseEntity<List<CourseEntity>> list(@RequestParam(value = "q", required = false) String q) {
        return ResponseEntity.ok(courseService.searchByAuthorOrName(q));
    }

    /** C: display a single course details by id */
    @GetMapping("/{id}")
    public ResponseEntity<CourseEntity> get(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getById(id));
    }

    /** ADD: create a new course */
    @PostMapping
    public ResponseEntity<CourseEntity> addCourse(@RequestBody CourseEntity course) {
        CourseEntity savedCourse = courseService.addCourse(course);
        return ResponseEntity.ok(savedCourse);
    }

    /** UPDATE: modify an existing course */
    @PutMapping("/{id}")
    public ResponseEntity<CourseEntity> updateCourse(@PathVariable Long id, @RequestBody CourseEntity course) {
        CourseEntity updatedCourse = courseService.updateCourse(id, course);
        return ResponseEntity.ok(updatedCourse);
    }

    /** DELETE: remove a course by id */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
