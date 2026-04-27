package com.eyevue.common.bean.guid;

/* JADX INFO: loaded from: classes4.dex */
public class NewGuidBean {
    private String description;

    /* JADX INFO: renamed from: id */
    private int f17901id;
    private String image;
    private boolean isAiTip;
    private boolean isTransTip;
    private boolean isVoiceNoteTip;
    private String jump;
    private String method;
    private String text;
    private String video;

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.f17901id;
    }

    public String getImage() {
        return this.image;
    }

    public String getJump() {
        return this.jump;
    }

    public String getMethod() {
        return this.method;
    }

    public String getText() {
        return this.text;
    }

    public String getVideo() {
        return this.video;
    }

    public boolean isAiTip() {
        return this.isAiTip;
    }

    public boolean isTransTip() {
        return this.isTransTip;
    }

    public boolean isVoiceNoteTip() {
        return this.isVoiceNoteTip;
    }

    public void setAiTip(boolean aiTip) {
        this.isAiTip = aiTip;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.f17901id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTransTip(boolean transTip) {
        this.isTransTip = transTip;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setVoiceNoteTip(boolean voiceNoteTip) {
        this.isVoiceNoteTip = voiceNoteTip;
    }
}
