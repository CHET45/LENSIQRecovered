package com.watchfun.transcommon.bean;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes5.dex */
public class TransLanguageData {
    private String defaultName;
    private String iatLanguage;
    private boolean isSelect;
    private boolean isUseMicTTS;
    private String keyName;
    private String langKey;
    private String lau;
    private int transId;
    private String voiceName;

    public static String toJson(TransLanguageData transLanguageData) {
        return new Gson().toJson(transLanguageData);
    }

    public String getDefaultName() {
        return this.defaultName;
    }

    public String getIatLanguage() {
        return this.iatLanguage;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public String getLangKey() {
        return this.langKey;
    }

    public String getLau() {
        return this.lau;
    }

    public int getTransId() {
        return this.transId;
    }

    public String getVoiceName() {
        return this.voiceName;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public boolean isUseMicTTS() {
        return this.isUseMicTTS;
    }

    public void setDefaultName(String str) {
        this.defaultName = str;
    }

    public void setIatLanguage(String str) {
        this.iatLanguage = str;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public void setLangKey(String str) {
        this.langKey = str;
    }

    public void setLau(String str) {
        this.lau = str;
    }

    public void setSelect(boolean z) {
        this.isSelect = z;
    }

    public void setTransId(int i) {
        this.transId = i;
    }

    public void setUseMicTTS(boolean z) {
        this.isUseMicTTS = z;
    }

    public void setVoiceName(String str) {
        this.voiceName = str;
    }
}
