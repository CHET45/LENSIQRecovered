package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class u3e {

    /* JADX INFO: renamed from: a */
    public n0c f86729a;

    /* JADX INFO: renamed from: b */
    public Request f86730b;

    /* JADX INFO: renamed from: c */
    public Call f86731c;

    /* JADX INFO: renamed from: d */
    public long f86732d;

    /* JADX INFO: renamed from: e */
    public long f86733e;

    /* JADX INFO: renamed from: f */
    public long f86734f;

    /* JADX INFO: renamed from: g */
    public OkHttpClient f86735g;

    public u3e(n0c n0cVar) {
        this.f86729a = n0cVar;
    }

    private Request generateRequest(do1 do1Var) {
        return this.f86729a.generateRequest(do1Var);
    }

    public Call buildCall(do1 do1Var) {
        this.f86730b = generateRequest(do1Var);
        long j = this.f86732d;
        if (j > 0 || this.f86733e > 0 || this.f86734f > 0) {
            if (j <= 0) {
                j = 10000;
            }
            this.f86732d = j;
            long j2 = this.f86733e;
            if (j2 <= 0) {
                j2 = 10000;
            }
            this.f86733e = j2;
            long j3 = this.f86734f;
            this.f86734f = j3 > 0 ? j3 : 10000L;
            OkHttpClient.Builder builderNewBuilder = g1c.getInstance().getOkHttpClient().newBuilder();
            long j4 = this.f86732d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient okHttpClientBuild = builderNewBuilder.readTimeout(j4, timeUnit).writeTimeout(this.f86733e, timeUnit).connectTimeout(this.f86734f, timeUnit).build();
            this.f86735g = okHttpClientBuild;
            this.f86731c = okHttpClientBuild.newCall(this.f86730b);
        } else {
            this.f86731c = g1c.getInstance().getOkHttpClient().newCall(this.f86730b);
        }
        return this.f86731c;
    }

    public void cancel() {
        Call call = this.f86731c;
        if (call != null) {
            call.cancel();
        }
    }

    public u3e connTimeOut(long j) {
        this.f86734f = j;
        return this;
    }

    public void execute(do1 do1Var) {
        buildCall(do1Var);
        if (do1Var != null) {
            do1Var.onBefore(this.f86730b, getOkHttpRequest().getId());
        }
        g1c.getInstance().execute(this, do1Var);
    }

    public Call getCall() {
        return this.f86731c;
    }

    public n0c getOkHttpRequest() {
        return this.f86729a;
    }

    public Request getRequest() {
        return this.f86730b;
    }

    public u3e readTimeOut(long j) {
        this.f86732d = j;
        return this;
    }

    public u3e writeTimeOut(long j) {
        this.f86733e = j;
        return this;
    }

    public Response execute() throws IOException {
        buildCall(null);
        return this.f86731c.execute();
    }
}
