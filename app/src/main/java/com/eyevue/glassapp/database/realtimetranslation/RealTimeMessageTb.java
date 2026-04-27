package com.eyevue.glassapp.database.realtimetranslation;

import p000.dbd;
import p000.j35;

/* JADX INFO: loaded from: classes4.dex */
@j35(tableName = "realtimeMessageTb")
public class RealTimeMessageTb {

    /* JADX INFO: renamed from: id */
    @dbd(autoGenerate = true)
    private Integer f18248id;
    private int isGptOrXF;
    private String isLangCode;
    private boolean isPause;
    private long messageTime;
    private int multipleOptions;
    private String result;
    private String transResult;
    private int type;
    private String voiceName;
    private String voicePath;
    private long voiceTime;

    public Integer getId() {
        return this.f18248id;
    }

    public int getIsGptOrXF() {
        return this.isGptOrXF;
    }

    public String getIsLangCode() {
        return this.isLangCode;
    }

    public long getMessageTime() {
        return this.messageTime;
    }

    public int getMultipleOptions() {
        return this.multipleOptions;
    }

    public String getResult() {
        return this.result;
    }

    public String getTransResult() {
        return this.transResult;
    }

    public int getType() {
        return this.type;
    }

    public String getVoiceName() {
        return this.voiceName;
    }

    public String getVoicePath() {
        return this.voicePath;
    }

    public long getVoiceTime() {
        return this.voiceTime;
    }

    public boolean isPause() {
        return this.isPause;
    }

    public void setId(Integer id) {
        this.f18248id = id;
    }

    public void setIsGptOrXF(int isGptOrXF) {
        this.isGptOrXF = isGptOrXF;
    }

    public void setIsLangCode(String isLangCode) {
        this.isLangCode = isLangCode;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public void setMultipleOptions(int multipleOptions) {
        this.multipleOptions = multipleOptions;
    }

    public void setPause(boolean pause) {
        this.isPause = pause;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setTransResult(String transResult) {
        this.transResult = transResult;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public void setVoicePath(String voicePath) {
        this.voicePath = voicePath;
    }

    public void setVoiceTime(long voiceTime) {
        this.voiceTime = voiceTime;
    }
}
