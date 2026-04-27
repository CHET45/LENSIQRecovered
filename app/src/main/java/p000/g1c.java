package p000;

import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class g1c {

    /* JADX INFO: renamed from: c */
    public static final long f38252c = 10000;

    /* JADX INFO: renamed from: d */
    public static volatile g1c f38253d;

    /* JADX INFO: renamed from: a */
    public OkHttpClient f38254a;

    /* JADX INFO: renamed from: b */
    public vwc f38255b;

    /* JADX INFO: renamed from: g1c$a */
    public class C6084a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ do1 f38256a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f38257b;

        public C6084a(do1 do1Var, int i) {
            this.f38256a = do1Var;
            this.f38257b = i;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            g1c.this.sendFailResultCallback(call, iOException, this.f38256a, this.f38257b);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                } catch (Exception e) {
                    g1c.this.sendFailResultCallback(call, e, this.f38256a, this.f38257b);
                    if (response.body() == null) {
                        return;
                    }
                }
                if (call.isCanceled()) {
                    g1c.this.sendFailResultCallback(call, new IOException("Canceled!"), this.f38256a, this.f38257b);
                    if (response.body() != null) {
                        response.body().close();
                        return;
                    }
                    return;
                }
                if (this.f38256a.validateReponse(response, this.f38257b)) {
                    g1c.this.sendSuccessResultCallback(this.f38256a.parseNetworkResponse(response, this.f38257b), this.f38256a, this.f38257b);
                    if (response.body() == null) {
                        return;
                    }
                    response.body().close();
                    return;
                }
                g1c.this.sendFailResultCallback(call, new IOException("request failed , reponse's code is : " + response.code()), this.f38256a, this.f38257b);
                if (response.body() != null) {
                    response.body().close();
                }
            } catch (Throwable th) {
                if (response.body() != null) {
                    response.body().close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g1c$b */
    public class RunnableC6085b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ do1 f38259a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Call f38260b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Exception f38261c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f38262d;

        public RunnableC6085b(do1 do1Var, Call call, Exception exc, int i) {
            this.f38259a = do1Var;
            this.f38260b = call;
            this.f38261c = exc;
            this.f38262d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38259a.onError(this.f38260b, this.f38261c, this.f38262d);
            this.f38259a.onAfter(this.f38262d);
        }
    }

    /* JADX INFO: renamed from: g1c$c */
    public class RunnableC6086c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ do1 f38264a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f38265b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f38266c;

        public RunnableC6086c(do1 do1Var, Object obj, int i) {
            this.f38264a = do1Var;
            this.f38265b = obj;
            this.f38266c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38264a.onResponse(this.f38265b, this.f38266c);
            this.f38264a.onAfter(this.f38266c);
        }
    }

    /* JADX INFO: renamed from: g1c$d */
    public static class C6087d {

        /* JADX INFO: renamed from: a */
        public static final String f38268a = "HEAD";

        /* JADX INFO: renamed from: b */
        public static final String f38269b = "DELETE";

        /* JADX INFO: renamed from: c */
        public static final String f38270c = "PUT";

        /* JADX INFO: renamed from: d */
        public static final String f38271d = "PATCH";
    }

    public g1c(OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            this.f38254a = new OkHttpClient();
        } else {
            this.f38254a = okHttpClient;
        }
        this.f38255b = vwc.get();
    }

    public static g8c delete() {
        return new g8c(C6087d.f38269b);
    }

    public static r37 get() {
        return new r37();
    }

    public static g1c getInstance() {
        return initClient(null);
    }

    public static di7 head() {
        return new di7();
    }

    public static g1c initClient(OkHttpClient okHttpClient) {
        if (f38253d == null) {
            synchronized (g1c.class) {
                try {
                    if (f38253d == null) {
                        f38253d = new g1c(okHttpClient);
                    }
                } finally {
                }
            }
        }
        return f38253d;
    }

    public static g8c patch() {
        return new g8c(C6087d.f38271d);
    }

    public static k5d post() {
        return new k5d();
    }

    public static i5d postFile() {
        return new i5d();
    }

    public static p5d postString() {
        return new p5d();
    }

    public static g8c put() {
        return new g8c(C6087d.f38270c);
    }

    public void cancelTag(Object obj) {
        for (Call call : this.f38254a.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : this.f38254a.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public void execute(u3e u3eVar, do1 do1Var) {
        if (do1Var == null) {
            do1Var = do1.f30242a;
        }
        u3eVar.getCall().enqueue(new C6084a(do1Var, u3eVar.getOkHttpRequest().getId()));
    }

    public Executor getDelivery() {
        return this.f38255b.defaultCallbackExecutor();
    }

    public OkHttpClient getOkHttpClient() {
        return this.f38254a;
    }

    public void sendFailResultCallback(Call call, Exception exc, do1 do1Var, int i) {
        if (do1Var == null) {
            return;
        }
        this.f38255b.execute(new RunnableC6085b(do1Var, call, exc, i));
    }

    public void sendSuccessResultCallback(Object obj, do1 do1Var, int i) {
        if (do1Var == null) {
            return;
        }
        this.f38255b.execute(new RunnableC6086c(do1Var, obj, i));
    }
}
