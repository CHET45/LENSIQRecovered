package com.eyevue.common.bean.feedback;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackTypeBean implements Serializable {
    private String label;
    private String type;

    public String getLabel() {
        return this.label;
    }

    public String getType() {
        return this.type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setType(String type) {
        this.type = type;
    }
}
