package com.gdky005.other;

import com.gdky005.utils.Utils;
import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class ShowNotice extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Utils.showNotify("你好呀");
    }
}
