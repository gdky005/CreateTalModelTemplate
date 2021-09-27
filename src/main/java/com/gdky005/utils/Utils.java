package com.gdky005.utils;

import com.intellij.openapi.ui.Messages;

public class Utils {

    public static void showNotify(String info) {
        Messages.showMessageDialog(info, "Utils", Messages.getInformationIcon());
    }

}
