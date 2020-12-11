package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
