package com.eyevue.common.bean;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceSettingItem {
    private String description;
    private int iconRes;
    private String title;

    public VoiceSettingItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public String getTitle() {
        return this.title;
    }
}
