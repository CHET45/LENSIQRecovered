package com.eyevue.glassapp.database.realtimetranslation;

/* JADX INFO: loaded from: classes4.dex */
public class RealTimeMessageSelect {
    private boolean alreadyPlayed;
    private boolean isSelect;
    private RealTimeMessageTb xfTransFreelyMessage;

    public RealTimeMessageSelect(boolean isSelect, RealTimeMessageTb xfTransFreelyMessage) {
        this.isSelect = isSelect;
        this.xfTransFreelyMessage = xfTransFreelyMessage;
    }

    public RealTimeMessageTb getXfTransFreelyMessage() {
        return this.xfTransFreelyMessage;
    }

    public boolean isAlreadyPlayed() {
        return this.alreadyPlayed;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setAlreadyPlayed(boolean alreadyPlayed) {
        this.alreadyPlayed = alreadyPlayed;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }

    public void setXfTransFreelyMessage(RealTimeMessageTb xfTransFreelyMessage) {
        this.xfTransFreelyMessage = xfTransFreelyMessage;
    }
}
