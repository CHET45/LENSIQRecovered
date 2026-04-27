package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.watchfun.transcommon.gpt.GPTResponseData;
import io.reactivex.Observable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p000.InterfaceC12632sk;

/* JADX INFO: loaded from: classes4.dex */
public class p87 implements InterfaceC12632sk.a {

    /* JADX INFO: renamed from: g */
    public static final String f69984g = "GptAiTextToAudioPresenter";

    /* JADX INFO: renamed from: a */
    public final InterfaceC12632sk.b f69985a;

    /* JADX INFO: renamed from: b */
    public GPTResponseData f69986b;

    /* JADX INFO: renamed from: c */
    public String f69987c;

    /* JADX INFO: renamed from: d */
    public Context f69988d;

    /* JADX INFO: renamed from: e */
    public String f69989e;

    /* JADX INFO: renamed from: f */
    public String f69990f;

    /* JADX INFO: renamed from: p87$a */
    public class C10837a implements oxb<Map<String, Object>> {
        public C10837a() {
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            p87.this.f69985a.loadAudioFail();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
        }

        @Override // p000.oxb
        public void onNext(Map<String, Object> stringObjectMap) {
            if (stringObjectMap == null || stringObjectMap.get("file") == null) {
                p87.this.f69985a.loadAudioFail();
                return;
            }
            File file = (File) stringObjectMap.get("file");
            StringBuilder sb = new StringBuilder();
            sb.append("音频文件已保存到: ");
            sb.append(file != null ? file.getAbsolutePath() : "未知路径");
            p87.this.f69985a.loadAudioListSuccess(file);
        }
    }

    /* JADX INFO: renamed from: p87$b */
    public class C10838b {

        /* JADX INFO: renamed from: a */
        public String f69992a;

        /* JADX INFO: renamed from: b */
        public String f69993b;

        public C10838b(String content, String language) {
            this.f69992a = content;
            this.f69993b = language;
        }

        public String getContent() {
            return this.f69992a;
        }

        public String getLanguage() {
            return this.f69993b;
        }

        public void setContent(String content) {
            this.f69992a = content;
        }

        public void setLanguage(String language) {
            this.f69993b = language;
        }
    }

    public p87(InterfaceC12632sk.b mGPTAudioView) {
        this.f69985a = mGPTAudioView;
    }

    private Map<String, String> buildHttpHeader() throws Exception {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = jq9.stringToMD5("5a7TD6ySQtOzlezcT564hxqDRVnURO1ZtrWRg6jRNEQjq4m3" + strValueOf);
        map.put("x-request-appid", i00.f45345R);
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-sign", strStringToMD5);
        String string = vfe.getInstance().getString("SP_KEY_LOCATION_LATITUDE");
        String string2 = vfe.getInstance().getString("SP_KEY_LOCATION_LONGITUDE");
        map.put("latitude", string);
        map.put("longitude", string2);
        map.put("isInChina", "1");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doOkHttpPostRx$0(String str, String str2, Map map, mob mobVar) throws Exception {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).writeTimeout(90L, timeUnit).readTimeout(90L, timeUnit).callTimeout(60L, timeUnit).build();
        StringBuilder sb = new StringBuilder();
        sb.append(" mContents = ");
        sb.append(str);
        try {
            Response responseExecute = okHttpClientBuild.newCall(new Request.Builder().url(str2).headers(Headers.m18734of((Map<String, String>) map)).addHeader(go7.f40586w, "ai.watchfun.cn").post(RequestBody.create(new Gson().toJson(new C10838b(str, this.f69989e)), MediaType.parse("application/json; charset=utf-8"))).build()).execute();
            if (!responseExecute.isSuccessful()) {
                mobVar.onError(new Throwable("HTTP error " + responseExecute.code()));
                return;
            }
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            File file = TextUtils.isEmpty(this.f69990f) ? new File(this.f69988d.getFilesDir(), "audio_output.mp3") : new File(this.f69990f);
            saveToFile(inputStreamByteStream, file);
            HashMap map2 = new HashMap();
            map2.put("file", file);
            mobVar.onNext(map2);
            mobVar.onComplete();
        } catch (IOException e) {
            mobVar.onError(e);
        }
    }

    private void loadData() {
        try {
            doOkHttpPostRx(i00.f45343P + "audio/tts", buildHttpHeader(), this.f69987c).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C10837a());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void saveToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Observable<Map<String, Object>> doOkHttpPostRx(final String url, final Map<String, String> headers, final String mContents) {
        return Observable.create(new dsb() { // from class: o87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                this.f66654a.lambda$doOkHttpPostRx$0(mContents, url, headers, mobVar);
            }
        });
    }

    @Override // p000.InterfaceC12632sk.a
    public void refreshData(Context context, String contents, String language, String filePath) {
        this.f69988d = context;
        this.f69987c = contents;
        this.f69989e = language;
        this.f69990f = filePath;
        loadData();
    }
}
