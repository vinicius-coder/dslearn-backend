package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{

}
