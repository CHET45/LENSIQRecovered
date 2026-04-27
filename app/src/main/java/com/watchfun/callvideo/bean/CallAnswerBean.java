package com.watchfun.callvideo.bean;

/* JADX INFO: loaded from: classes6.dex */
public class CallAnswerBean {
    private String messageType;
    private String result;

    public CallAnswerBean(String str, String str2) {
        this.result = str;
        this.messageType = str2;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getResult() {
        return this.result;
    }

    public void setMessageType(String str) {
        this.messageType = str;
    }

    public void setResult(String str) {
        this.result = str;
    }
}
