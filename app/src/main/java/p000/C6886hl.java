package p000;

import android.content.Context;
import android.text.TextUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.watchfun.base.BaseApplication;
import com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider;
import java.util.Locale;

/* JADX INFO: renamed from: hl */
/* JADX INFO: loaded from: classes4.dex */
public class C6886hl extends AiVoiceNoteBaseParamsProvider {
    public C6886hl(Context context) {
        super(context);
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getAiSummaryThemeDarkColor() {
        return "theme-dark-yellow";
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getAiSummaryThemeLightColor() {
        return "theme-dark-yellow";
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getAppName() {
        return BaseApplication.getInstance().getResources().getString(C2531R.string.app_name);
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getAppType() {
        return t77.f83943v;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getAppVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getCountryCode() {
        return vfe.getInstance().getString("CURRENT_COUNTRY", "");
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getCustomerId() {
        return t77.f83942u;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getDeviceName() {
        return t77.f83922a;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getIsInChina() {
        return a43.f347l;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getLanguage() {
        String string = vfe.getInstance().getString("CURRENT_LANGUAGE");
        return (TextUtils.isEmpty(string) || vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true)) ? Locale.getDefault().toString() : string;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getLanguageCode() {
        return vfe.getInstance().getString("CURRENT_LANGUAGE", "");
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getMacAddress() {
        return t77.f83923b;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getProject() {
        return "";
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public String getServiceBaseUrl() {
        return i00.f45335H;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getToken() {
        return vfe.getInstance().getString("KEY_TOKEN");
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getUid() {
        return vfe.getInstance().getString("KEY_UID");
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider, p000.pv3, p000.yp7
    public String getUserId() {
        return vfe.getInstance().getString("SP_USER_ID");
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public boolean isForceDarkModel() {
        return true;
    }

    @Override // com.watchfun.voicenotes.bean.AiVoiceNoteBaseParamsProvider
    public boolean isUsingSystemLanguage() {
        return vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true);
    }
}
