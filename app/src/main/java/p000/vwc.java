package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class vwc {

    /* JADX INFO: renamed from: a */
    public static final vwc f92424a = findPlatform();

    /* JADX INFO: renamed from: vwc$a */
    public static class C14281a extends vwc {

        /* JADX INFO: renamed from: vwc$a$a */
        public static class a implements Executor {

            /* JADX INFO: renamed from: a */
            public final Handler f92425a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f92425a.post(runnable);
            }
        }

        @Override // p000.vwc
        public Executor defaultCallbackExecutor() {
            return new a();
        }
    }

    private static vwc findPlatform() {
        try {
            Class.forName("android.os.Build");
            return new C14281a();
        } catch (ClassNotFoundException unused) {
            return new vwc();
        }
    }

    public static vwc get() {
        vwc vwcVar = f92424a;
        ct8.m8684e(vwcVar.getClass().toString());
        return vwcVar;
    }

    public Executor defaultCallbackExecutor() {
        return Executors.newCachedThreadPool();
    }

    public void execute(Runnable runnable) {
        defaultCallbackExecutor().execute(runnable);
    }
}
