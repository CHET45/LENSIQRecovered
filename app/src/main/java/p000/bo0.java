package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class bo0 {

    /* JADX INFO: renamed from: a */
    @hib
    public static Executor f14236a;

    private bo0() {
    }

    public static synchronized Executor get() {
        try {
            if (f14236a == null) {
                f14236a = t0i.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14236a;
    }

    public static synchronized void set(Executor executor) {
        f14236a = executor;
    }
}
