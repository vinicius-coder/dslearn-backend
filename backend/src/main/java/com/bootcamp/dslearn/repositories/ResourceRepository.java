package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
