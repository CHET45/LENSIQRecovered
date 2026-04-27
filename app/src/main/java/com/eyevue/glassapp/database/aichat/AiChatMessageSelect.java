package com.eyevue.glassapp.database.aichat;

/* JADX INFO: loaded from: classes4.dex */
public class AiChatMessageSelect {
    private AiChatMessage aiChatMessage;
    private boolean isSelect;

    public AiChatMessageSelect(boolean isSelect, AiChatMessage aiChatMessage) {
        this.isSelect = isSelect;
        this.aiChatMessage = aiChatMessage;
    }

    public AiChatMessage getAiChatMessage() {
        return this.aiChatMessage;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setAiChatMessage(AiChatMessage aiChatMessage) {
        this.aiChatMessage = aiChatMessage;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }
}
