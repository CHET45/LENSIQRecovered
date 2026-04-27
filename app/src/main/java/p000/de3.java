package p000;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class de3 implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f29470e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f29471a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f29472b;

    /* JADX INFO: renamed from: c */
    public final int f29473c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f29474d;

    public de3(String str, int i, @eib StrictMode.ThreadPolicy threadPolicy) {
        this.f29472b = str;
        this.f29473c = i;
        this.f29474d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$newThread$0(Runnable runnable) {
        Process.setThreadPriority(this.f29473c);
        StrictMode.ThreadPolicy threadPolicy = this.f29474d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f29470e.newThread(new Runnable() { // from class: ce3
            @Override // java.lang.Runnable
            public final void run() {
                this.f16344a.lambda$newThread$0(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f29472b, Long.valueOf(this.f29471a.getAndIncrement())));
        return threadNewThread;
    }
}
