package com.eyevue.glassapp;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2469b;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2479l;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.EyevueApplication;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.utils.AudioManagerUtil;
import com.eyevue.glassapp.utils.GlassesLanguageStorage;
import com.watchfun.base.BaseActivity;
import com.watchfun.base.BaseApplication;
import com.watchfun.transcommon.ILangFileConfig;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.translatemodule.AudioRecorder;
import com.watchfun.translatewebsocket.AudioNewRecorder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p000.C6886hl;
import p000.C9389ml;
import p000.a40;
import p000.c1i;
import p000.c40;
import p000.dq7;
import p000.e0c;
import p000.e10;
import p000.e30;
import p000.f4g;
import p000.fpi;
import p000.g30;
import p000.gu8;
import p000.h10;
import p000.hi9;
import p000.hu8;
import p000.i00;
import p000.iy2;
import p000.jyg;
import p000.k1i;
import p000.k30;
import p000.kbb;
import p000.m3h;
import p000.mi7;
import p000.mm4;
import p000.o8e;
import p000.pm4;
import p000.ps2;
import p000.qc7;
import p000.qq9;
import p000.t77;
import p000.vfe;
import p000.wi9;
import p000.yc3;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueApplication extends BaseApplication {

    /* JADX INFO: renamed from: d */
    public static EyevueApplication f18170d;

    /* JADX INFO: renamed from: b */
    public Handler f18171b = new Handler(new Handler.Callback() { // from class: hl5
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return EyevueApplication.lambda$new$0(message);
        }
    });

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f18172c = new ArrayList<>();

    /* JADX INFO: renamed from: com.eyevue.glassapp.EyevueApplication$a */
    public class C2553a implements InterfaceC2556d {
        public C2553a() {
        }

        @Override // com.eyevue.glassapp.EyevueApplication.InterfaceC2556d
        public void onFailure() {
            hi9.setUserIp("unknown");
        }

        @Override // com.eyevue.glassapp.EyevueApplication.InterfaceC2556d
        public void onIpReceived(String ip) {
            hi9.setUserIp(ip);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.EyevueApplication$b */
    public class C2554b implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2556d f18174a;

        public C2554b(final InterfaceC2556d val$callback) {
            this.f18174a = val$callback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            this.f18174a.onFailure();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (!response.isSuccessful()) {
                this.f18174a.onFailure();
            } else {
                this.f18174a.onIpReceived(response.body().string().trim());
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.EyevueApplication$c */
    public class C2555c implements dq7 {
        public C2555c() {
        }

        @Override // p000.dq7
        public void postToThread(Runnable task) {
            jyg.post(task);
        }

        @Override // p000.dq7
        public <T> String toJson(T obj) {
            return qc7.toJson(obj);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.EyevueApplication$d */
    public interface InterfaceC2556d {
        void onFailure();

        void onIpReceived(String ip);
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.EyevueApplication$e */
    public static class C2557e implements ILangFileConfig {

        /* JADX INFO: renamed from: a */
        public final Context f18177a;

        public C2557e(Context context) {
            this.f18177a = context.getApplicationContext();
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getAiChatLangFileName() {
            return "";
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getChatGptLangFileName() {
            return c40.getTextFromAssets(this.f18177a, "select_chat_gpt_lang_json.txt");
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getGptLangFileName() {
            return c40.getTextFromAssets(this.f18177a, "select_gpt_lang_json.txt");
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getOfflineLangFileName() {
            return null;
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getPhotoLangFileName() {
            return c40.getTextFromAssets(this.f18177a, "select_photo_lang_json.txt");
        }

        @Override // com.watchfun.transcommon.ILangFileConfig
        public String getPhotoLeftLangFileName() {
            return c40.getTextFromAssets(this.f18177a, "select_photo_left_lang_json.txt");
        }
    }

    public static EyevueApplication getEyevueApplication() {
        return f18170d;
    }

    private void getPublicIp(final InterfaceC2556d callback) {
        new OkHttpClient().newCall(new Request.Builder().url("https://api.ipify.org").build()).enqueue(new C2554b(callback));
    }

    private void initBaseLanguage() {
        gu8.setStorage(new GlassesLanguageStorage());
    }

    private void initSdk() {
        C2479l.init(this);
        k1i.initialize(this, true);
        t77.f83944w = "";
        String str = i00.f45335H;
        t77.f83945x = true;
        String version = c1i.getVersion(this);
        if (version == null || !version.endsWith("-c")) {
            t77.f83941t = version;
        } else {
            t77.f83941t = version.substring(0, version.length() - 2);
        }
        t77.f83943v = "";
        t77.f83942u = "";
        e10.initApiData("ai.watchfun.cn", i00.f45345R, i00.f45346S, str, i00.f45349V, i00.f45343P, i00.f45348U, i00.f45347T, h10.f41964s, "");
        e10.initApiData("ai.watchfun.cn", i00.f45345R, i00.f45346S, str, i00.f45349V, i00.f45343P, i00.f45348U, i00.f45347T, h10.f41964s, "");
        mi7.init(new g30(this));
        o8e.initHttpClient(this);
        kbb.init(new C2555c());
        m3h.init(this);
        iy2.initialize(this);
        BaseActivity.setThemeDelegate(new a40(), vfe.getInstance().getBoolean("THEME_DARK", false));
        gu8.setStorage(new k30());
        gu8.setLanguage(this);
        AiLangUtil.init(new C2557e(getApplicationContext()));
        ps2.get().enable(this);
        pm4.C11025a c11025a = new pm4.C11025a();
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new mm4());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        pm4.C11025a builder = c11025a.setBuilder(builderAddNetworkInterceptor.connectTimeout(15L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit));
        e0c.C5036a c5036a = new e0c.C5036a(this);
        c5036a.connectionFactory(builder);
        c5036a.downloadStrategy(new yc3());
        e0c.setSingletonInstance(c5036a.build());
        qq9.f75117a.init(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return false;
        }
        jyg.post((Runnable) obj);
        return false;
    }

    private void updateEvent(String uId, String languageCode, String mac, String deviceName) {
        wi9.initEventConfig(i00.f45339L, i00.f45340M, getString(C2531R.string.app_name), uId, languageCode, mac, deviceName, C2469b.getAppVersionName());
    }

    private void uploadLogAtStartup(String uId, String languageCode, String mac, String deviceName) {
        File logFile = hi9.getLogFile();
        if (logFile == null || !logFile.exists()) {
            return;
        }
        Log.e("chfun", "logFile =" + logFile.getPath());
        wi9.initLogConfig(i00.f45339L, i00.f45338K, getString(C2531R.string.app_name), uId, languageCode, mac, deviceName, C2469b.getAppVersionName());
        wi9.uploadLogFileAsync(logFile);
    }

    public Handler getMainHandler() {
        return this.f18171b;
    }

    public ArrayList<String> getMediaUris() {
        return this.f18172c;
    }

    @Override // com.watchfun.base.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        initSdk();
        f18170d = this;
        boolean z = vfe.getInstance().getBoolean("KEY_DEVICE_PRIVACY_POLICY", false);
        m3h.init(this);
        if (z) {
            f4g.initStatistics(this);
        }
        hu8.setLanguage(this);
        vfe.getInstance().putInt("SP_KEY_PROJECT_TYPE", 2);
        vfe.getInstance().putBoolean("SP_UPDATE_GET", false);
        C2473f.getConfig().setLogSwitch(true);
        String string = vfe.getInstance().getString("KEY_UID");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
        }
        vfe.getInstance().putString("KEY_UID", string);
        hi9.init(this, getString(C2531R.string.app_name), string, null);
        getPublicIp(new C2553a());
        String string2 = vfe.getInstance().getString(vfe.C14037b.f90986p);
        boolean z2 = vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true);
        if (TextUtils.isEmpty(string2) || z2) {
            string2 = Locale.getDefault().toString();
        }
        String str = t77.f83923b;
        String valueEncoded = fpi.getValueEncoded(t77.f83922a);
        uploadLogAtStartup(string, string2, str, valueEncoded);
        updateEvent(string, string2, str, valueEncoded);
        ModUtils.blecore(this);
        C9389ml.getInstance().init(this, new C6886hl(this));
        AudioRecorder.init(this);
        AudioNewRecorder.init(this);
        AudioManagerUtil.init(this);
        initBaseLanguage();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        e30.shutdown();
    }

    public void post(Runnable run) {
        this.f18171b.post(run);
    }

    public void setMediaUris(ArrayList<String> mediaUris) {
        this.f18172c = mediaUris;
    }
}
