package p000;

import android.content.Context;
import com.watchfun.voicenotes.api.AiVoiceNoteApi;
import com.watchfun.voicenotes.api.ApiService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes7.dex */
public class n8e {

    /* JADX INFO: renamed from: a */
    public static volatile Retrofit f63610a;

    /* JADX INFO: renamed from: b */
    public static ApiService f63611b;

    public static ApiService getApiService() {
        if (f63610a == null) {
            return null;
        }
        if (f63611b == null) {
            f63611b = (ApiService) f63610a.create(ApiService.class);
        }
        return f63611b;
    }

    public static void initHttpClient(Context context) {
        OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().retryOnConnectionFailure(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builderRetryOnConnectionFailure.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).addInterceptor(new abb(context, true, true)).hostnameVerifier(new HostnameVerifier() { // from class: l8e
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return n8e.lambda$initHttpClient$0(str, sSLSession);
            }
        }).build();
        okHttpClientBuild.dispatcher().setMaxRequests(128);
        okHttpClientBuild.dispatcher().setMaxRequestsPerHost(10);
        initRetrofit(okHttpClientBuild);
    }

    private static void initRetrofit(OkHttpClient okHttpClient) {
        if (f63610a == null) {
            synchronized (n8e.class) {
                try {
                    if (f63610a == null) {
                        f63610a = new Retrofit.Builder().client(okHttpClient).baseUrl(AiVoiceNoteApi.BASE_URL).addConverterFactory(n7g.create()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initHttpClient$0(String str, SSLSession sSLSession) {
        return true;
    }
}
