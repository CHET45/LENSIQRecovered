package com.watchfun.translatewebsocket.bean;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioNewBean {
    private List<Integer> audioData;
    private String audioFormat;
    private String messageId;
    private int outputSampleRate;
    private String startTimeId;
    private String type;

    public List<Integer> getAudioData() {
        return this.audioData;
    }

    public String getAudioFormat() {
        return this.audioFormat;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getOutputSampleRate() {
        return this.outputSampleRate;
    }

    public String getStartTimeId() {
        return this.startTimeId;
    }

    public String getType() {
        return this.type;
    }

    public void setAudioData(List<Integer> list) {
        this.audioData = list;
    }

    public void setAudioFormat(String str) {
        this.audioFormat = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOutputSampleRate(int i) {
        this.outputSampleRate = i;
    }

    public void setStartTimeId(String str) {
        this.startTimeId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "AudioBean{type='" + this.type + "', startTimeId='" + this.startTimeId + "', messageId='" + this.messageId + "', outputSampleRate=" + this.outputSampleRate + ", audioFormat='" + this.audioFormat + "'}";
    }
}
