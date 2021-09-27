package com.gdky005.utils;

import com.intellij.notification.*;
import com.intellij.openapi.ui.Messages;

public class Utils {

    /**
     * 十秒钟以后消失
     * @param info 提示内容
     */
    public static void showNotify(String info) {
//        NotificationGroup notificationGroup = NotificationGroupManager.getInstance().getNotificationGroup("utils");

        //noinspection UnstableApiUsage
        NotificationGroup notificationGroup = new NotificationGroup("Utils", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification(info, NotificationType.INFORMATION);
        Notifications.Bus.notify(notification);
    }

    public static void showDialog(String info) {
        Messages.showMessageDialog(info, "Information", Messages.getInformationIcon());
    }
}
