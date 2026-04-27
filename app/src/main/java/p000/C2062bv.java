package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes7.dex */
public final class C2062bv {

    /* JADX INFO: renamed from: a */
    public static final voe f14843a = eee.initMainThreadScheduler(new a());

    /* JADX INFO: renamed from: bv$a */
    public static class a implements Callable<voe> {
        @Override // java.util.concurrent.Callable
        public voe call() throws Exception {
            return b.f14844a;
        }
    }

    /* JADX INFO: renamed from: bv$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final voe f14844a = new me7(new Handler(Looper.getMainLooper()), false);

        private b() {
        }
    }

    private C2062bv() {
        throw new AssertionError("No instances.");
    }

    public static voe from(Looper looper) {
        return from(looper, false);
    }

    public static voe mainThread() {
        return eee.onMainThreadScheduler(f14843a);
    }

    @igg({"NewApi"})
    public static voe from(Looper looper, boolean z) {
        if (looper != null) {
            return new me7(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }
}
