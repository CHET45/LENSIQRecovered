package com.watchfun.callvideo.bean;

/* JADX INFO: loaded from: classes6.dex */
public class CallInviteBean {
    private String language;
    private String messageType;
    private String streamID;
    private String targetLanguage;
    private String type;

    public String getLanguage() {
        return this.language;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getStreamID() {
        return this.streamID;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public String getType() {
        return this.type;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMessageType(String str) {
        this.messageType = str;
    }

    public void setStreamID(String str) {
        this.streamID = str;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "CallInviteBean{language='" + this.language + "', targetLanguage='" + this.targetLanguage + "', type='" + this.type + "', streamID='" + this.streamID + "', messageType='" + this.messageType + "'}";
    }
}
