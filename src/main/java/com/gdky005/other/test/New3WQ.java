package com.gdky005.other.test;

import com.gdky005.utils.Utils;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class New3WQ extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Utils.showDialog("New3WQ");
    }
}
