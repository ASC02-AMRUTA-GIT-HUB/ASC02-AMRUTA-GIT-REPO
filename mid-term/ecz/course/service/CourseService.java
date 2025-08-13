package com.ecz.course.service;

import com.ecz.course.entity.CourseEntity;
import com.ecz.course.repository.CourseRepository;
import com.ecz.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseEntity> getAll() {
        return courseRepository.findAll();
    }

    public CourseEntity getById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Course not found with id: " + id));
    }

    public List<CourseEntity> searchByAuthorOrName(String query) {
        if (query == null || query.trim().isEmpty()) {
            return getAll();
        }
        return courseRepository
                .findByCourseNameContainingIgnoreCaseOrAuthorNameContainingIgnoreCase(query, query);
    }
    public CourseEntity addCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public CourseEntity updateCourse(Long id, CourseEntity courseDetails) {
        CourseEntity existingCourse = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id " + id));

        existingCourse.setCourseName(courseDetails.getCourseName());
        existingCourse.setAuthorName(courseDetails.getAuthorName());
        existingCourse.setDurationHours(courseDetails.getDurationHours());
        existingCourse.setAvailable(courseDetails.getAvailable());

        return courseRepository.save(existingCourse);
    }

    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new RuntimeException("Course not found with id " + id);
        }
        courseRepository.deleteById(id);
    }


}
