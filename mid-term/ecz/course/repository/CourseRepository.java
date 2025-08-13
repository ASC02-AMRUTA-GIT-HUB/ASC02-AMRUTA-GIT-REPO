package com.ecz.course.repository;

import com.ecz.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

    // Search by course name or author name (case-insensitive contains)
    List<CourseEntity> findByCourseNameContainingIgnoreCaseOrAuthorNameContainingIgnoreCase(
            String courseName, String authorName
    );
}
