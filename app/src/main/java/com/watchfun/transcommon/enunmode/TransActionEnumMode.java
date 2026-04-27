package com.watchfun.transcommon.enunmode;

import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.TransSpUtils;
import p000.l74;
import p000.vfe;

/* JADX INFO: loaded from: classes5.dex */
public enum TransActionEnumMode {
    TRANSLATOR_TYPE(1, "翻译机页面"),
    PHONE_HEADSET_TYPE(2, "手机耳机模式"),
    DUAL_EAR_TYPE(3, "双耳模式"),
    DUAL_FREEDOM_TALK_TYPE(4, "自由说模式"),
    CHAT_GPT_TYPE(5, "AI对话"),
    VOICE_NOTES_TYPE(6, "语音笔记"),
    VIDEO_AUDIO_TYPE(7, "通话翻译"),
    DUAL_SINGLE_TYPE(8, "同声传译模式"),
    AUDIO_SCREEN_TYPE(9, "音视频字幕"),
    EMPTY_TYPE(l74.EnumC8658d.f56431d2, "占位");

    private final int code;
    private final String description;

    TransActionEnumMode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static TransActionEnumMode fromCode(int i) {
        for (TransActionEnumMode transActionEnumMode : values()) {
            if (transActionEnumMode.getCode() == i) {
                return transActionEnumMode;
            }
        }
        return EMPTY_TYPE;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public void handleTransLanguage(int i, TransLanguageData transLanguageData, int i2) {
        if (i != 1) {
            if (i == 2) {
                if (i2 == TRANSLATOR_TYPE.getCode()) {
                    vfe.getInstance().putString(vfe.C14037b.f90925S, TransLanguageData.toJson(transLanguageData));
                    return;
                }
                if (i2 == PHONE_HEADSET_TYPE.getCode()) {
                    vfe.getInstance().putString(vfe.C14037b.f90917O, TransLanguageData.toJson(transLanguageData));
                    return;
                }
                if (i2 == DUAL_EAR_TYPE.getCode()) {
                    vfe.getInstance().putString("woke_language_to_two_ear_news", TransLanguageData.toJson(transLanguageData));
                    return;
                }
                if (i2 == DUAL_FREEDOM_TALK_TYPE.getCode()) {
                    vfe.getInstance().putString(vfe.C14037b.f90933W, TransLanguageData.toJson(transLanguageData));
                    return;
                }
                if (i2 == VIDEO_AUDIO_TYPE.getCode()) {
                    vfe.getInstance().putString(vfe.C14037b.f90976l1, TransLanguageData.toJson(transLanguageData));
                    return;
                } else if (i2 == DUAL_SINGLE_TYPE.getCode()) {
                    vfe.getInstance().putString(vfe.C14037b.f90929U, TransLanguageData.toJson(transLanguageData));
                    return;
                } else {
                    if (i2 == AUDIO_SCREEN_TYPE.getCode()) {
                        vfe.getInstance().putString(TransSpUtils.Key.TRANS_LANGUAGE_TO_AUDIO_SCREEN, TransLanguageData.toJson(transLanguageData));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i2 == TRANSLATOR_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90927T, TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == PHONE_HEADSET_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90919P, TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == DUAL_EAR_TYPE.getCode()) {
            vfe.getInstance().putString("woke_language_from_two_ear_news", TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == DUAL_FREEDOM_TALK_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90935X, TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == CHAT_GPT_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90942a0, TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == VOICE_NOTES_TYPE.getCode()) {
            vfe.getInstance().putString("language_voice_notes", TransLanguageData.toJson(transLanguageData));
            return;
        }
        if (i2 == VIDEO_AUDIO_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90973k1, TransLanguageData.toJson(transLanguageData));
        } else if (i2 == DUAL_SINGLE_TYPE.getCode()) {
            vfe.getInstance().putString(vfe.C14037b.f90931V, TransLanguageData.toJson(transLanguageData));
        } else if (i2 == AUDIO_SCREEN_TYPE.getCode()) {
            vfe.getInstance().putString(TransSpUtils.Key.TRANS_LANGUAGE_FROM_AUDIO_SCREEN, TransLanguageData.toJson(transLanguageData));
        }
    }
}
