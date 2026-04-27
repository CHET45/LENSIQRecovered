package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class nfe extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: nfe$a */
    public static final class C9863a extends Thread implements ueb {
        public C9863a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        C9863a c9863a = new C9863a(runnable, "RxBleThread-" + incrementAndGet());
        c9863a.setPriority(5);
        c9863a.setDaemon(true);
        return c9863a;
    }
}
