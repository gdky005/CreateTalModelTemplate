package com.gdky005;

import com.gdky005.utils.Utils;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class WQTools extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Utils.showDialog("WQTools");
    }
}
