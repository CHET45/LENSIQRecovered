package com.watchfun.transcommon.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.watchfun.transcommon.ILangFileConfig;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.TransLanguageList;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import p000.efb;
import p000.ymh;

/* JADX INFO: loaded from: classes6.dex */
public class AiLangUtil {
    private static volatile ILangFileConfig config;

    private static void checkInitialization() {
        if (config == null) {
            throw new IllegalStateException("AiLangUtil not initialized. Call init() first.");
        }
    }

    public static TransLanguageData getLanguageDataByCode(Context context, final String str) {
        List list = (List) parseLanguageData(context).stream().filter(new Predicate() { // from class: qk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AiLangUtil.lambda$getLanguageDataByCode$0(str, (TransLanguageData) obj);
            }
        }).collect(Collectors.toList());
        if (list.size() > 0) {
            return (TransLanguageData) list.get(0);
        }
        return null;
    }

    public static String getValue(Context context, String str) {
        int identifier;
        return (str == null || (identifier = context.getResources().getIdentifier(str, ymh.InterfaceC15723b.f102127e, context.getPackageName())) == 0) ? "" : context.getString(identifier);
    }

    public static void init(@efb ILangFileConfig iLangFileConfig) {
        config = iLangFileConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getLanguageDataByCode$0(String str, TransLanguageData transLanguageData) {
        return transLanguageData.getIatLanguage().equals(str);
    }

    public static List<TransLanguageData> parseAiChatLanguageData(Context context) {
        String aiChatLangFileName = config.getAiChatLangFileName();
        if (TextUtils.isEmpty(aiChatLangFileName)) {
            return null;
        }
        return ((TransLanguageList) new Gson().fromJson(aiChatLangFileName, TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguageChatGptData(Context context) {
        return ((TransLanguageList) new Gson().fromJson(config.getChatGptLangFileName(), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguageData(Context context) {
        checkInitialization();
        return ((TransLanguageList) new Gson().fromJson(config.getGptLangFileName(), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguageOfflineData(Context context) {
        return ((TransLanguageList) new Gson().fromJson(config.getOfflineLangFileName(), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguagePhotoData(Context context) {
        return ((TransLanguageList) new Gson().fromJson(config.getPhotoLangFileName(), TransLanguageList.class)).getData();
    }

    public static List<TransLanguageData> parseLanguagePhotoLeftData(Context context) {
        return ((TransLanguageList) new Gson().fromJson(config.getPhotoLeftLangFileName(), TransLanguageList.class)).getData();
    }
}
