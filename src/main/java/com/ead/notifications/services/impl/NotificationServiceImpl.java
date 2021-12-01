package com.ead.notifications.services.impl;

import com.ead.notifications.enums.NotificationStatus;
import com.ead.notifications.models.NotificationModel;
import com.ead.notifications.repositories.NotificationRepository;
import com.ead.notifications.services.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {


    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public NotificationModel saveNotification(NotificationModel notificationModel) {
        return this.notificationRepository.save(notificationModel);
    }

    @Override
    public Page<NotificationModel> findAllNotificationsByYser(UUID userId, Pageable pageable) {
        return this.notificationRepository.findAllByUserIdAndNotificationStatus(userId, NotificationStatus.CREATED, pageable);
    }

    @Override
    public Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId) {
        return this.notificationRepository.findByNotificationIdAndUserId(notificationId, userId);
    }
}
