package com.SmartQueue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartQueue.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}