package com.ead.notifications.services.impl;

import com.ead.notifications.models.NotificationModel;
import com.ead.notifications.repositories.NotificationRepository;
import com.ead.notifications.services.NotificationService;
import org.springframework.stereotype.Service;

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
}
