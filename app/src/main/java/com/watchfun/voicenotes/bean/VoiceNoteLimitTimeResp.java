package com.watchfun.voicenotes.bean;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteLimitTimeResp {
    private boolean limitTimeStatus;
    private String unit;
    private int totalDuration = 0;
    private int useDuration = 0;
    private int remainingDuration = 0;

    public int getRemainingDuration() {
        return this.remainingDuration;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public String getUnit() {
        return this.unit;
    }

    public int getUseDuration() {
        return this.useDuration;
    }

    public boolean isLimitTimeStatus() {
        return this.limitTimeStatus;
    }

    public void setLimitTimeStatus(boolean z) {
        this.limitTimeStatus = z;
    }

    public void setRemainingDuration(int i) {
        this.remainingDuration = i;
    }

    public void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setUseDuration(int i) {
        this.useDuration = i;
    }
}
