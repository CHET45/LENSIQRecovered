package com.watchfun.translatewebsocket.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class SpeechNewStopBean implements Serializable {
    private String message;

    @SerializedName("status")
    private String status;

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return this.status;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setType(String str) {
        this.status = str;
    }
}
