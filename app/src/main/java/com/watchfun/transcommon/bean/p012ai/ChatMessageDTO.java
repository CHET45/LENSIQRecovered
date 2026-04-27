package com.watchfun.transcommon.bean.p012ai;

/* JADX INFO: loaded from: classes5.dex */
public class ChatMessageDTO {
    private String content;
    private String role;

    public ChatMessageDTO(String str, String str2) {
        this.role = str;
        this.content = str2;
    }

    public String getContent() {
        return this.content;
    }

    public String getRole() {
        return this.role;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRole(String str) {
        this.role = str;
    }
}
