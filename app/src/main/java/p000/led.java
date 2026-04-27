package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class led implements Interceptor {

    /* JADX INFO: renamed from: a */
    public static final Map<String, med> f57405a = new HashMap();

    public static void addListener(String str, med medVar) {
        f57405a.put(str, medVar);
    }

    public static void removeListener(String str) {
        f57405a.remove(str);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        return responseProceed.newBuilder().body(new oed(request.url().toString(), responseProceed.body())).build();
    }
}
