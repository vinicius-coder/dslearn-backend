package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
