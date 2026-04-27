package com.eyevue.common.bean.translanguage;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes4.dex */
public class TransLanguageBean {
    private String defaultName;
    private String iatLanguage;
    private boolean isSelect;
    private boolean isUseMicTTS;
    private String keyName;
    private String langKey;
    private LangStringBean langLau;
    private String lau;
    private int transId;
    private String voiceName;

    public static String toJson(TransLanguageBean data) {
        return new Gson().toJson(data);
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

    public LangStringBean getLangLau() {
        return this.langLau;
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

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public void setIatLanguage(String iatLanguage) {
        this.iatLanguage = iatLanguage;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public void setLangLau(LangStringBean langLau) {
        this.langLau = langLau;
    }

    public void setLau(String lau) {
        this.lau = lau;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public void setUseMicTTS(boolean useMicTTS) {
        this.isUseMicTTS = useMicTTS;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }
}
