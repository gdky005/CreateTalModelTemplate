package com.gdky005.plugin.wq;

import com.gdky005.utils.Utils;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class ShowName extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt = Messages.showInputDialog(
                project,
                "你的名字是?",
                "输入你的名字",
                Messages.getQuestionIcon());

        Utils.showDialog("Hello, " + txt + "!\n I am glad to see you.");
    }
}
