package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
