package com.watchfun.callvideo.bean;

import p000.dbd;
import p000.j35;

/* JADX INFO: loaded from: classes6.dex */
@j35(tableName = "callTranslate")
public class CallTransMessage {

    /* JADX INFO: renamed from: id */
    @dbd(autoGenerate = true)
    private Integer f25179id;
    private String isLangCode;
    private long messageTime;
    private String result;
    private String transResult;
    private int type;

    public Integer getId() {
        return this.f25179id;
    }

    public String getIsLangCode() {
        return this.isLangCode;
    }

    public long getMessageTime() {
        return this.messageTime;
    }

    public String getResult() {
        return this.result;
    }

    public String getTransResult() {
        return this.transResult;
    }

    public int getType() {
        return this.type;
    }

    public void setId(Integer num) {
        this.f25179id = num;
    }

    public void setIsLangCode(String str) {
        this.isLangCode = str;
    }

    public void setMessageTime(long j) {
        this.messageTime = j;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setTransResult(String str) {
        this.transResult = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
