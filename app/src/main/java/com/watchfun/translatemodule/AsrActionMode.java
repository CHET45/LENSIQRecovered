package com.watchfun.translatemodule;

/* JADX INFO: loaded from: classes6.dex */
public enum AsrActionMode {
    PHONE_HEADSET_TYPE(0, "手机耳机模式"),
    TRANSLATOR_TYPE(1, "翻译机页面"),
    DUAL_EAR_TYPE(2, "双耳模式"),
    PHONE_GLASSES_TYPE(3, "手机眼镜模式"),
    DUAL_FREEDOM_TALK_TYPE(4, "自由说模式"),
    CHAT_GPT_TYPE(5, "AI对话"),
    VOICE_NOTES_TYPE(6, "语音笔记"),
    FACE_TO_FACE_TYPE(7, "音视频");

    private final int code;
    private final String description;

    AsrActionMode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
