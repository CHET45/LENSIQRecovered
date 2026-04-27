package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class o04 extends png {

    /* JADX INFO: renamed from: a */
    public final Object f66159a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f66160b = Executors.newFixedThreadPool(4, new ThreadFactoryC10129a());

    /* JADX INFO: renamed from: c */
    @hib
    public volatile Handler f66161c;

    /* JADX INFO: renamed from: o04$a */
    public class ThreadFactoryC10129a implements ThreadFactory {

        /* JADX INFO: renamed from: c */
        public static final String f66162c = "arch_disk_io_";

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f66163a = new AtomicInteger(0);

        public ThreadFactoryC10129a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f66162c + this.f66163a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: o04$b */
    @c5e(28)
    public static class C10130b {
        private C10130b() {
        }

        @efb
        public static Handler createAsync(@efb Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @efb
    private static Handler createAsync(@efb Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C10130b.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p000.png
    public void executeOnDiskIO(@efb Runnable runnable) {
        this.f66160b.execute(runnable);
    }

    @Override // p000.png
    public boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000.png
    public void postToMainThread(@efb Runnable runnable) {
        if (this.f66161c == null) {
            synchronized (this.f66159a) {
                try {
                    if (this.f66161c == null) {
                        this.f66161c = createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f66161c.post(runnable);
    }
}
