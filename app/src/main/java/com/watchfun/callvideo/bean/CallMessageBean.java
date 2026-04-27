package com.watchfun.callvideo.bean;

/* JADX INFO: loaded from: classes6.dex */
public class CallMessageBean {
    private String language;
    private String messageType;
    private String status;
    private String targetLanguage;
    private String targetText;
    private String text;

    public CallMessageBean(String str, String str2, String str3, String str4, String str5, String str6) {
        this.text = str;
        this.language = str2;
        this.status = str3;
        this.targetText = str4;
        this.targetLanguage = str5;
        this.messageType = str6;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public String getTargetText() {
        return this.targetText;
    }

    public String getText() {
        return this.text;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMessageType(String str) {
        this.messageType = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public void setTargetText(String str) {
        this.targetText = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
