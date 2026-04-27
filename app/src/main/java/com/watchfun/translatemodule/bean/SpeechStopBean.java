package com.watchfun.translatemodule.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class SpeechStopBean implements Serializable {
    private String startTimeId;

    @SerializedName("type")
    private String type;

    public String getStartTimeId() {
        return this.startTimeId;
    }

    public String getType() {
        return this.type;
    }

    public void setStartTimeId(String str) {
        this.startTimeId = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
