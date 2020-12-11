package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
