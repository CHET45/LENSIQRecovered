package com.watchfun.voicenotes.bean;

import android.content.Context;
import p000.a43;
import p000.pv3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AiVoiceNoteBaseParamsProvider extends pv3 {
    public AiVoiceNoteBaseParamsProvider(Context context) {
        super(context);
    }

    public abstract String getAiSummaryThemeDarkColor();

    public abstract String getAiSummaryThemeLightColor();

    public abstract String getAppName();

    @Override // p000.pv3, p000.yp7
    public String getAppType() {
        return "";
    }

    @Override // p000.pv3, p000.yp7
    public abstract String getAppVersion();

    public abstract String getCountryCode();

    @Override // p000.pv3, p000.yp7
    public String getCustomerId() {
        return "";
    }

    public int getDefaultNightMode() {
        return -1;
    }

    @Override // p000.pv3, p000.yp7
    public abstract String getDeviceName();

    @Override // p000.pv3, p000.yp7
    public abstract String getIsInChina();

    @Override // p000.pv3, p000.yp7
    public abstract String getLanguage();

    public abstract String getLanguageCode();

    @Override // p000.pv3, p000.yp7
    public String getLatitude() {
        return a43.f347l;
    }

    @Override // p000.pv3, p000.yp7
    public String getLongitude() {
        return a43.f347l;
    }

    @Override // p000.pv3, p000.yp7
    public abstract String getMacAddress();

    @Override // p000.pv3, p000.yp7
    public abstract String getProject();

    public abstract String getServiceBaseUrl();

    @Override // p000.pv3, p000.yp7
    public String getToken() {
        return "";
    }

    @Override // p000.pv3, p000.yp7
    public abstract String getUid();

    @Override // p000.pv3, p000.yp7
    public String getUserId() {
        return "";
    }

    public abstract boolean isForceDarkModel();

    public abstract boolean isUsingSystemLanguage();
}
