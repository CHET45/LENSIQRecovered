package com.eyevue.common.bean.p006ai;

import android.text.TextUtils;
import p000.C4826dk;

/* JADX INFO: loaded from: classes4.dex */
public class AiMessageBean {
    private int messageId;
    private String status;
    private String text;
    private String type;

    public int getMessageId() {
        return this.messageId;
    }

    public String getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public boolean isFinal() {
        if (TextUtils.isEmpty(this.status)) {
            return false;
        }
        return this.status.equals(C4826dk.f29845f);
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }
}
