package com.watchfun.voicenotes;

import android.app.Application;
import android.content.Context;
import com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider;
import p000.C9389ml;
import p000.a43;

/* JADX INFO: loaded from: classes7.dex */
public class MyApp extends Application {

    /* JADX INFO: renamed from: com.watchfun.voicenotes.MyApp$a */
    public class C4296a extends AiVoiceNoteBaseParamsProvider {
        public C4296a(Context context) {
            super(context);
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getAiSummaryThemeDarkColor() {
            return "theme-dark-purple";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getAiSummaryThemeLightColor() {
            return "theme-light-purple";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getAppName() {
            return "CelerTalk";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getAppVersion() {
            return "V1.1.14";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getCountryCode() {
            return "cn";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public int getDefaultNightMode() {
            return 1;
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getDeviceName() {
            return "Ai-Talk 9366A2";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getIsInChina() {
            return a43.f347l;
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getLanguage() {
            return "zh_Cn";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getLanguageCode() {
            return "zh";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getMacAddress() {
            return "E4:66:E5:93:66:A2";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getProject() {
            return "2101-9310";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public String getServiceBaseUrl() {
            return "http://test-earjoy.watchfun.cn/api/";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
        public String getUid() {
            return "93bf3b7b-b50e-4a09-bcd8-332315a91648";
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public boolean isForceDarkModel() {
            return false;
        }

        @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
        public boolean isUsingSystemLanguage() {
            return true;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C9389ml.getInstance().init(this, new C4296a(this));
    }
}
