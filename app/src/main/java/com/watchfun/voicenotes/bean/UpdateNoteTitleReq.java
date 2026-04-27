package com.watchfun.voicenotes.bean;

/* JADX INFO: loaded from: classes7.dex */
public class UpdateNoteTitleReq {

    /* JADX INFO: renamed from: id */
    private String f26450id;
    private String title;

    public UpdateNoteTitleReq(String str, String str2) {
        this.f26450id = str;
        this.title = str2;
    }

    public String getId() {
        return this.f26450id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(String str) {
        this.f26450id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
