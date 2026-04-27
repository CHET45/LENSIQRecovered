package p000;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class s8e implements Interceptor {

    /* JADX INFO: renamed from: a */
    public int f80951a;

    /* JADX INFO: renamed from: b */
    public int f80952b;

    public s8e() {
        this(3);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response responseProceed;
        Request request = chain.request();
        try {
            responseProceed = chain.proceed(request);
        } catch (IOException unused) {
            do {
                int i = this.f80952b;
                if (i < this.f80951a) {
                    int i2 = i + 1;
                    this.f80952b = i2;
                    try {
                        Thread.sleep(((long) i2) * 500);
                        responseProceed = chain.proceed(request);
                    } catch (IOException e) {
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Thread interrupted during retry", e2);
                    }
                } else {
                    responseProceed = null;
                }
            } while (this.f80952b != this.f80951a);
            throw e;
        }
        this.f80952b = 0;
        if (responseProceed != null) {
            return responseProceed;
        }
        throw new IOException("Max retries exceeded");
    }

    public s8e(int i) {
        this.f80952b = 0;
        this.f80951a = i;
    }
}
