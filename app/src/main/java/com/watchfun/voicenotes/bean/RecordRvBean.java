package com.watchfun.voicenotes.bean;

/* JADX INFO: loaded from: classes7.dex */
public class RecordRvBean {
    private String content;
    private int duration;
    private int endTime;
    private String speaker;
    private int startTime;

    public String getContent() {
        return this.content;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getSpeaker() {
        return this.speaker;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setSpeaker(String str) {
        this.speaker = str;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }
}
