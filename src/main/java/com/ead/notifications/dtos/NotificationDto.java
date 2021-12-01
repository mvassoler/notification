package com.ead.notifications.dtos;

import com.ead.notifications.enums.NotificationStatus;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;
}
