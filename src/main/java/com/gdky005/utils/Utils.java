package com.gdky005.utils;

import com.intellij.openapi.ui.Messages;

public class Utils {

    public static void showNotify(String info) {
        Messages.showMessageDialog(info, "Utils", Messages.getInformationIcon());
    }

    public static void showDialog(String info) {
        Messages.showMessageDialog("Hello World !", "Information", Messages.getInformationIcon());
    }
}
