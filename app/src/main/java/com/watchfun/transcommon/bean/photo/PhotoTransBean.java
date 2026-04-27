package com.watchfun.transcommon.bean.photo;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class PhotoTransBean {

    @SerializedName("originalText")
    String originalText;

    @SerializedName("translateImg")
    public String translateImg;

    @SerializedName("translateText")
    String translateText;

    public PhotoTransBean(String str, String str2, String str3) {
        this.originalText = str;
        this.translateText = str2;
        this.translateImg = str3;
    }

    public String getOriginalText() {
        return this.originalText;
    }

    public String getTranslateImg() {
        return this.translateImg;
    }

    public String getTranslateText() {
        return this.translateText;
    }

    public void setOriginalText(String str) {
        this.originalText = str;
    }

    public void setTranslateImg(String str) {
        this.translateImg = str;
    }

    public void setTranslateText(String str) {
        this.translateText = str;
    }
}
