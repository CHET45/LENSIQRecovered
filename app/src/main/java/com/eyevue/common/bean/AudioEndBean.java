package com.eyevue.common.bean;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEndBean {
    private String audioFormat;
    private int messageId;
    private int outputSampleRate;
    private String type;

    public String getAudioFormat() {
        return this.audioFormat;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public int getOutputSampleRate() {
        return this.outputSampleRate;
    }

    public String getType() {
        return this.type;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setOutputSampleRate(int outputSampleRate) {
        this.outputSampleRate = outputSampleRate;
    }

    public void setType(String type) {
        this.type = type;
    }
}
