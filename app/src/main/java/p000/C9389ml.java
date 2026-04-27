package p000;

import android.app.Application;
import android.text.TextUtils;
import com.watchfun.voicenotes.api.AiVoiceNoteApi;
import com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider;

/* JADX INFO: renamed from: ml */
/* JADX INFO: loaded from: classes7.dex */
public class C9389ml {

    /* JADX INFO: renamed from: a */
    public Application f61275a;

    /* JADX INFO: renamed from: b */
    public boolean f61276b;

    /* JADX INFO: renamed from: c */
    public AiVoiceNoteBaseParamsProvider f61277c;

    /* JADX INFO: renamed from: ml$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C9389ml f61278a = new C9389ml();

        private b() {
        }
    }

    public static C9389ml getInstance() {
        return b.f61278a;
    }

    private void initMp3Record(Application application) {
        mtd.getInstance().init(application, false);
    }

    public String getAiSummaryThemeDarkColor() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getAiSummaryThemeDarkColor() : "";
    }

    public String getAiSummaryThemeLightColor() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getAiSummaryThemeLightColor() : "";
    }

    public Application getAppContext() {
        return this.f61275a;
    }

    public String getAppName() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getAppName() : "";
    }

    public String getAppVersion() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getAppVersion() : "";
    }

    public String getCountryCode() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getCountryCode() : "cn";
    }

    public String getCustomerId() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getCustomerId() : "";
    }

    public int getDefaultNightMode() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        if (aiVoiceNoteBaseParamsProvider != null) {
            return aiVoiceNoteBaseParamsProvider.getDefaultNightMode();
        }
        return -1;
    }

    public String getDeviceName() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        if (aiVoiceNoteBaseParamsProvider == null) {
            return "";
        }
        String deviceName = aiVoiceNoteBaseParamsProvider.getDeviceName();
        return !TextUtils.isEmpty(deviceName) ? deviceName : "";
    }

    public String getIsInChina() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getIsInChina() : "";
    }

    public String getLanguage() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getLanguage() : "";
    }

    public String getLanguageCode() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getLanguageCode() : "zh";
    }

    public String getMacAddress() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getMacAddress() : "";
    }

    public String getToken() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getToken() : "";
    }

    public String getUid() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getUid() : "";
    }

    public String getUserId() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        return aiVoiceNoteBaseParamsProvider != null ? aiVoiceNoteBaseParamsProvider.getUserId() : "";
    }

    public void init(Application application, AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider) {
        this.f61275a = application;
        if (aiVoiceNoteBaseParamsProvider == null) {
            return;
        }
        this.f61277c = aiVoiceNoteBaseParamsProvider;
        AiVoiceNoteApi.BASE_URL = aiVoiceNoteBaseParamsProvider.getServiceBaseUrl();
        if (!this.f61276b) {
            n8e.initHttpClient(application);
            mi7.init(aiVoiceNoteBaseParamsProvider);
            iy2.initialize(application);
            initMp3Record(application);
        }
        this.f61276b = true;
    }

    public boolean isForceDarkModel() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        if (aiVoiceNoteBaseParamsProvider != null) {
            return aiVoiceNoteBaseParamsProvider.isForceDarkModel();
        }
        return true;
    }

    public boolean isUsingSystemLanguage() {
        AiVoiceNoteBaseParamsProvider aiVoiceNoteBaseParamsProvider = this.f61277c;
        if (aiVoiceNoteBaseParamsProvider != null) {
            return aiVoiceNoteBaseParamsProvider.isUsingSystemLanguage();
        }
        return true;
    }

    private C9389ml() {
        this.f61276b = false;
    }
}
