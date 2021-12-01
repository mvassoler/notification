package com.ead.notifications.services;

import com.ead.notifications.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface NotificationService {

    NotificationModel saveNotification(NotificationModel notificationModel);

    Page<NotificationModel> findAllNotificationsByYser(UUID userId, Pageable pageable);

    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
