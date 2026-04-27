package com.eyevue.glassapp.view.setting;

import com.eyevue.glassapp.view.setting.C2916a;
import com.eyevue.glassapp.view.setting.C2917b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.a */
/* JADX INFO: loaded from: classes4.dex */
public class C2916a {

    /* JADX INFO: renamed from: a */
    public static final OkHttpClient f19151a;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f19151a = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).retryOnConnectionFailure(true).addInterceptor(new Interceptor() { // from class: c8c
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return C2916a.lambda$static$0(chain);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("Connection", "close").build());
    }

    public static void uploadFile(String url, File file, C2917b.a listener, Callback callback) {
        f19151a.newCall(new Request.Builder().url(url).post(new C2917b(file, listener)).build()).enqueue(callback);
    }
}
