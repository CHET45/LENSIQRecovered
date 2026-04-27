package com.watchfun.callvideo.bean;

/* JADX INFO: loaded from: classes6.dex */
public class CallUrlBean {
    private String language;
    private String roomID;
    private String streamID;
    private String targetLanguage;
    private String type;
    private String version;

    public CallUrlBean(String str, String str2, String str3, String str4, String str5, String str6) {
        this.roomID = str;
        this.language = str2;
        this.targetLanguage = str3;
        this.streamID = str4;
        this.type = str5;
        this.version = str6;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getRoomID() {
        return this.roomID;
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

    public void setRoomID(String str) {
        this.roomID = str;
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
}
