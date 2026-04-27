package p000;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes6.dex */
public class o8e {

    /* JADX INFO: renamed from: a */
    public static Context f66714a;

    /* JADX INFO: renamed from: b */
    public static volatile OkHttpClient f66715b;

    /* JADX INFO: renamed from: c */
    public static final Map<Class<?>, Object> f66716c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final Map<Class<?>, Retrofit> f66717d = new ConcurrentHashMap();

    public static void clearCache() {
        f66716c.clear();
        f66717d.clear();
    }

    public static Context getAppContext() {
        Context context = f66714a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("MyLibrary not initialized. Call initialize() first.");
    }

    public static <T> T getService(Class<T> cls, String str) {
        Map<Class<?>, Object> map = f66716c;
        if (map.containsKey(cls)) {
            return (T) map.get(cls);
        }
        Map<Class<?>, Retrofit> map2 = f66717d;
        Retrofit retrofitBuild = map2.get(cls);
        if (retrofitBuild == null) {
            retrofitBuild = new Retrofit.Builder().baseUrl(str).client(f66715b).addConverterFactory(n7g.create()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
            map2.put(cls, retrofitBuild);
        }
        T t = (T) retrofitBuild.create(cls);
        map.put((Class<?>) cls, t);
        return t;
    }

    public static void initHttpClient(Context context) {
        f66714a = context.getApplicationContext();
        if (f66715b == null) {
            synchronized (o8e.class) {
                try {
                    if (f66715b == null) {
                        OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().retryOnConnectionFailure(false);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        f66715b = builderRetryOnConnectionFailure.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).addInterceptor(new abb(context, true, true)).hostnameVerifier(new HostnameVerifier() { // from class: m8e
                            @Override // javax.net.ssl.HostnameVerifier
                            public final boolean verify(String str, SSLSession sSLSession) {
                                return o8e.lambda$initHttpClient$0(str, sSLSession);
                            }
                        }).build();
                        f66715b.dispatcher().setMaxRequests(128);
                        f66715b.dispatcher().setMaxRequestsPerHost(10);
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
