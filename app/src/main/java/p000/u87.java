package p000;

import android.content.Context;
import android.text.TextUtils;
import com.eyevue.glassapp.view.photo.C2865a;
import com.google.gson.Gson;
import com.watchfun.transcommon.gpt.GPTResponseData;
import io.reactivex.Observable;
import java.io.IOException;
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
public class u87 implements InterfaceC12632sk.c {

    /* JADX INFO: renamed from: h */
    public static final String f87046h = "GptTransPresenter";

    /* JADX INFO: renamed from: a */
    public final InterfaceC12632sk.d f87047a;

    /* JADX INFO: renamed from: b */
    public GPTResponseData f87048b;

    /* JADX INFO: renamed from: c */
    public String f87049c;

    /* JADX INFO: renamed from: d */
    public Context f87050d;

    /* JADX INFO: renamed from: e */
    public String f87051e;

    /* JADX INFO: renamed from: f */
    public String f87052f;

    /* JADX INFO: renamed from: g */
    public int f87053g;

    /* JADX INFO: renamed from: u87$a */
    public class C13401a implements oxb<Map<String, Object>> {
        public C13401a() {
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            u87.this.f87047a.transFail();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
        }

        @Override // p000.oxb
        public void onNext(Map<String, Object> stringObjectMap) {
            if (stringObjectMap == null) {
                u87.this.f87047a.transFail();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("data============");
            sb.append(stringObjectMap.toString());
            Object obj = stringObjectMap.get(C2865a.f19004r);
            int iIntValue = obj != null ? ((Integer) obj).intValue() : 0;
            String string = stringObjectMap.get("body").toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Map map = (Map) new Gson().fromJson(string, HashMap.class);
            if (!map.containsKey("data")) {
                u87.this.f87047a.transFail();
                return;
            }
            Object obj2 = map.get("data");
            if (obj2 == null) {
                u87.this.f87047a.transFail();
                return;
            }
            String string2 = obj2.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data============");
            sb2.append(string2);
            u87.this.f87047a.transSuccess(string2, false, false, false, iIntValue);
        }
    }

    /* JADX INFO: renamed from: u87$b */
    public class C13402b {

        /* JADX INFO: renamed from: a */
        public String f87055a;

        /* JADX INFO: renamed from: b */
        public String f87056b;

        /* JADX INFO: renamed from: c */
        public String f87057c;

        public C13402b(String content, String language, String sourceLanguage) {
            this.f87055a = content;
            this.f87056b = language;
            this.f87057c = sourceLanguage;
        }

        public String getContent() {
            return this.f87055a;
        }

        public String getLanguage() {
            return this.f87056b;
        }

        public String getSourceLanguage() {
            return this.f87057c;
        }

        public void setContent(String content) {
            this.f87055a = content;
        }

        public void setLanguage(String language) {
            this.f87056b = language;
        }

        public void setSourceLanguage(String sourceLanguage) {
            this.f87057c = sourceLanguage;
        }
    }

    public u87(InterfaceC12632sk.d mGPTTransView) {
        this.f87047a = mGPTTransView;
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
        map.put("isInChina", a43.f347l);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doOkHttpPostRx$0(String str, String str2, String str3, String str4, Map map, int i, mob mobVar) throws Exception {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).writeTimeout(90L, timeUnit).readTimeout(90L, timeUnit).callTimeout(60L, timeUnit).build();
        zi9.m26852e(f87046h, "开始请求翻译 mContents = " + str);
        try {
            Response responseExecute = okHttpClientBuild.newCall(new Request.Builder().url(str4).headers(Headers.m18734of((Map<String, String>) map)).addHeader(go7.f40586w, "ai.watchfun.cn").post(RequestBody.create(new Gson().toJson(new C13402b(str, str2, str3)), MediaType.parse("application/json; charset=utf-8"))).build()).execute();
            if (!responseExecute.isSuccessful()) {
                mobVar.onError(new Throwable("HTTP error " + responseExecute.code()));
                return;
            }
            String strString = responseExecute.body().string();
            HashMap map2 = new HashMap();
            zi9.m26852e(f87046h, "翻译成功::::原文:" + str + ":::" + strString);
            map2.put("body", strString);
            map2.put(C2865a.f19004r, Integer.valueOf(i));
            mobVar.onNext(map2);
            mobVar.onComplete();
        } catch (IOException e) {
            mobVar.onError(e);
        }
    }

    private void loadData() {
        try {
            doOkHttpPostRx(i00.f45343P + h10.f41966u, buildHttpHeader(), this.f87049c, this.f87051e, this.f87052f, this.f87053g).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C13401a());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Observable<Map<String, Object>> doOkHttpPostRx(final String url, final Map<String, String> headers, final String mContents, final String mLanguage, final String sourceLanguage, final int position) {
        return Observable.create(new dsb() { // from class: t87
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                this.f83967a.lambda$doOkHttpPostRx$0(mContents, mLanguage, sourceLanguage, url, headers, position, mobVar);
            }
        });
    }

    @Override // p000.InterfaceC12632sk.c
    public void refreshData(Context context, String contents, String language, String sourceLanguage) {
        this.f87050d = context;
        this.f87049c = contents;
        this.f87051e = language;
        this.f87052f = sourceLanguage;
        loadData();
    }

    public void refreshDataWithPos(Context context, String contents, String language, String sourceLanguage, int position) {
        this.f87050d = context;
        this.f87049c = contents;
        this.f87051e = language;
        this.f87052f = sourceLanguage;
        this.f87053g = position;
        loadData();
    }
}
