package com.watchfun.transcommon.utils;

import p000.vfe;

/* JADX INFO: loaded from: classes6.dex */
public class TransSpUtils {
    private vfe spUtils;

    public static class Key {
        public static final String TRANS_LANGUAGE_FROM_AUDIO_SCREEN = "TRANS_LANGUAGE_FROM_AUDIO_SCREEN";
        public static final String TRANS_LANGUAGE_TO_AUDIO_SCREEN = "TRANS_LANGUAGE_TO_AUDIO_SCREEN";
    }

    public static class SingletonHolder {
        private static final TransSpUtils sInstance = new TransSpUtils();

        private SingletonHolder() {
        }
    }

    public static TransSpUtils getInstance() {
        return SingletonHolder.sInstance;
    }

    public String getString(String str) {
        return this.spUtils.getString(str);
    }

    public void putString(String str, String str2) {
        this.spUtils.putString(str, str2);
    }

    private TransSpUtils() {
        this.spUtils = vfe.getInstance();
    }
}
