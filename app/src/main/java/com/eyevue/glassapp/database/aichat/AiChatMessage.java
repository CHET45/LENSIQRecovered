package com.eyevue.glassapp.database.aichat;

import p000.dbd;
import p000.j35;

/* JADX INFO: loaded from: classes4.dex */
@j35(tableName = "AiChat")
public class AiChatMessage {
    private String content;

    /* JADX INFO: renamed from: id */
    @dbd(autoGenerate = true)
    private int f18246id;
    private String imagePath;
    private long messageTime;
    private String msgId;
    private int msgType;
    private String voicePath;

    public String getContent() {
        return this.content;
    }

    public int getId() {
        return this.f18246id;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public long getMessageTime() {
        return this.messageTime;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public String getVoicePath() {
        return this.voicePath;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.f18246id = id;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public void setVoicePath(String voicePath) {
        this.voicePath = voicePath;
    }
}
