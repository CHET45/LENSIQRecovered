package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public class f9b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f35788a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f35789b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f35790c;

    public f9b(String str) {
        this.f35790c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f35788a.newThread(runnable);
        threadNewThread.setName(this.f35790c + "-" + this.f35789b);
        return threadNewThread;
    }
}
