package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p000.C4517cv;

/* JADX INFO: renamed from: cv */
/* JADX INFO: loaded from: classes7.dex */
public final class C4517cv {

    /* JADX INFO: renamed from: a */
    public static final woe f27709a = dee.initMainThreadScheduler(new Callable() { // from class: av
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return C4517cv.a.f27710a;
        }
    });

    /* JADX INFO: renamed from: cv$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final woe f27710a = C4517cv.internalFrom(Looper.getMainLooper(), true);

        private a() {
        }
    }

    private C4517cv() {
        throw new AssertionError("No instances.");
    }

    public static woe from(Looper looper) {
        return from(looper, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"NewApi"})
    public static woe internalFrom(Looper looper, boolean async) {
        return new ne7(new Handler(looper), async);
    }

    public static woe mainThread() {
        return dee.onMainThreadScheduler(f27709a);
    }

    public static woe from(Looper looper, boolean async) {
        if (looper != null) {
            return internalFrom(looper, async);
        }
        throw new NullPointerException("looper == null");
    }
}
