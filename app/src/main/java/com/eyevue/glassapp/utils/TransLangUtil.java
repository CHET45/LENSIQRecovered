package com.eyevue.glassapp.utils;

import android.content.Context;
import com.google.gson.Gson;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.TransLanguageList;
import java.util.List;
import p000.c40;
import p000.ymh;

/* JADX INFO: loaded from: classes4.dex */
public class TransLangUtil {
    public static String getValue(Context context, String value) {
        int identifier;
        return (value == null || (identifier = context.getResources().getIdentifier(value, ymh.InterfaceC15723b.f102127e, context.getPackageName())) == 0) ? "" : context.getString(identifier);
    }

    public static List<TransLanguageData> parseLanguageChatGptData(Context context) throws Throwable {
        return ((TransLanguageList) new Gson().fromJson(c40.getTextFromAssets(context, "select_chat_gpt_lang_json.txt"), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguageData(Context context) throws Throwable {
        return ((TransLanguageList) new Gson().fromJson(c40.getTextFromAssets(context, "select_gpt_lang_json.txt"), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguagePhotoData(Context context) throws Throwable {
        return ((TransLanguageList) new Gson().fromJson(c40.getTextFromAssets(context, "select_photo_lang_json.txt"), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguagePhotoLeftData(Context context) throws Throwable {
        return ((TransLanguageList) new Gson().fromJson(c40.getTextFromAssets(context, "select_photo_left_lang_json.txt"), TransLanguageList.class)).getData();
    }
}
