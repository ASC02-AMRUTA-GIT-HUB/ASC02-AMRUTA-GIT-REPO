package com.ecz.course.entity;

import javax.persistence.*;

/**
 * Course table: Course Id, Course Name, Author Name, Duration (hours), Availability.
 */
@Entity
@Table(name = "Course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name", nullable = false, length = 150)
    private String courseName;

    @Column(name = "author_name", nullable = false, length = 100)
    private String authorName;

    @Column(name = "duration_hours", nullable = false)
    private Integer durationHours;

    @Column(name = "available", nullable = false)
    private Boolean available;

    public CourseEntity() {}

    public CourseEntity(Long courseId, String courseName, String authorName, Integer durationHours, Boolean available) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.durationHours = durationHours;
        this.available = available;
    }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }
    public Integer getDurationHours() { return durationHours; }
    public void setDurationHours(Integer durationHours) { this.durationHours = durationHours; }
    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }
}
