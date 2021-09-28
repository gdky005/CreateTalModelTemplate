package com.gdky005.plugin.wq;

import com.gdky005.utils.Utils;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class ShowNotice extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Utils.showNotify("展示通知，10s 后消失。");
    }
}