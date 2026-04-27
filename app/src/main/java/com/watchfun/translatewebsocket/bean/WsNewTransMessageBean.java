package com.watchfun.translatewebsocket.bean;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class WsNewTransMessageBean {
    private String sourceLanguage;
    private String sourceText;
    private int startTime;
    private String status;
    private String targetLanguage;
    private String targetText;

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public String getSourceText() {
        return this.sourceText;
    }

    public int getStartTime() {
        return this.startTime;
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

    public boolean isFinal() {
        return !TextUtils.isEmpty(this.status) && this.status.equals("translated");
    }

    public void setSourceLanguage(String str) {
        this.sourceLanguage = str;
    }

    public void setSourceText(String str) {
        this.sourceText = str;
    }

    public void setStartTime(int i) {
        this.startTime = i;
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
}
