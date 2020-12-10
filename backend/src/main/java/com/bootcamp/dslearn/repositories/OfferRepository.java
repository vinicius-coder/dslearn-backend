package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{

}
