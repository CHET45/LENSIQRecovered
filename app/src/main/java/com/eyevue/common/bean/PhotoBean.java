package com.eyevue.common.bean;

import android.net.Uri;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoBean {
    private Date date;

    /* JADX INFO: renamed from: id */
    private String f17897id;
    private String name;
    private Uri uri;

    public PhotoBean(String id, Uri uri, String name, Date data) {
        this.f17897id = id;
        this.uri = uri;
        this.name = name;
        this.date = data;
    }

    public Date getDate() {
        return this.date;
    }

    public String getId() {
        return this.f17897id;
    }

    public String getName() {
        return this.name;
    }

    public Uri getUri() {
        return this.uri;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(String id) {
        this.f17897id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
