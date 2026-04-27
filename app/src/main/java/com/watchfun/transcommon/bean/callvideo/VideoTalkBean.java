package com.watchfun.transcommon.bean.callvideo;

/* JADX INFO: loaded from: classes5.dex */
public class VideoTalkBean {
    private String language;
    private String roomId;
    private String streamId;
    private String targetLanguage;
    private String type;
    private String userId;
    private String version;

    public VideoTalkBean(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.userId = str;
        this.roomId = str2;
        this.streamId = str3;
        this.type = str4;
        this.version = str5;
        this.language = str6;
        this.targetLanguage = str7;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }
}
