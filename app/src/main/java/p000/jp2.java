package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class jp2 {

    /* JADX INFO: renamed from: a */
    public static final int f51384a = 15;

    /* JADX INFO: renamed from: jp2$a */
    @c5e(28)
    public static class C8002a {
        private C8002a() {
        }

        @ih4
        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private jp2() {
    }

    @efb
    @Deprecated
    /* JADX INFO: renamed from: b */
    public static Executor m14225b(@efb Handler handler) {
        Objects.requireNonNull(handler);
        return new gp2(handler);
    }

    /* JADX INFO: renamed from: c */
    public static ThreadPoolExecutor m14226c(@efb final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: hp2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return jp2.lambda$createBackgroundPriorityExecutor$0(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: d */
    public static Handler m14227d() {
        return Build.VERSION.SDK_INT >= 28 ? C8002a.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$createBackgroundPriorityExecutor$0(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }
}
