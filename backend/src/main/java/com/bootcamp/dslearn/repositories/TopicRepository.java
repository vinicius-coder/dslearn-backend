package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
