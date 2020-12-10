package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
