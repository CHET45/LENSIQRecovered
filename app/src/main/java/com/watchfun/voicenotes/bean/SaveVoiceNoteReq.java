package com.watchfun.voicenotes.bean;

/* JADX INFO: loaded from: classes7.dex */
public class SaveVoiceNoteReq {
    private String language;
    private String title;
    private String transcribeText;
    private int voiceDuration;
    private String voiceUrl;

    public String getLanguage() {
        return this.language;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTranscribeText() {
        return this.transcribeText;
    }

    public int getVoiceDuration() {
        return this.voiceDuration;
    }

    public String getVoiceUrl() {
        return this.voiceUrl;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTranscribeText(String str) {
        this.transcribeText = str;
    }

    public void setVoiceDuration(int i) {
        this.voiceDuration = i;
    }

    public void setVoiceUrl(String str) {
        this.voiceUrl = str;
    }
}
