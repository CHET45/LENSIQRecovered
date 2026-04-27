package com.eyevue.common.bean.p006ai;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ImageCommandBean {
    private List<String> base64Images;
    private String command;
    private String query;

    public ImageCommandBean(String command, String query, List<String> base64Images) {
        this.command = command;
        this.query = query;
        this.base64Images = base64Images;
    }

    public List<String> getBase64Images() {
        return this.base64Images;
    }

    public String getCommand() {
        return this.command;
    }

    public void setBase64Images(List<String> base64Images) {
        this.base64Images = base64Images;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
