package com.watchfun.translatemodule.bean;

import android.text.TextUtils;
import p000.C4826dk;

/* JADX INFO: loaded from: classes6.dex */
public class WsMessageBean {
    private int endTime;
    private String language;
    private String messageId;
    private String speakerId;
    private int startTime;
    private String startTimeId;
    private String status;
    private String targetLanguage;
    private String targetText;
    private String text;

    public int getEndTime() {
        return this.endTime;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getSpeakerId() {
        return this.speakerId;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public String getStartTimeId() {
        return this.startTimeId;
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

    public boolean isFinal() {
        return !TextUtils.isEmpty(this.status) && this.status.equals(C4826dk.f29845f);
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public void setStartTimeId(String str) {
        this.startTimeId = str;
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
