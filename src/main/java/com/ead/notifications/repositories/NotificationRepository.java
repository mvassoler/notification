package com.ead.notifications.repositories;

import com.ead.notifications.models.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<NotificationModel, UUID> {

}
