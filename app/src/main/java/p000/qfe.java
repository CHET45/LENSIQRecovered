package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class qfe extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a */
    public final String f74313a;

    /* JADX INFO: renamed from: b */
    public final int f74314b;

    /* JADX INFO: renamed from: c */
    public final boolean f74315c;

    /* JADX INFO: renamed from: qfe$a */
    public static final class C11469a extends Thread implements veb {
        public C11469a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public qfe(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f74313a + '-' + incrementAndGet();
        Thread c11469a = this.f74315c ? new C11469a(runnable, str) : new Thread(runnable, str);
        c11469a.setPriority(this.f74314b);
        c11469a.setDaemon(true);
        return c11469a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f74313a + "]";
    }

    public qfe(String str, int i) {
        this(str, i, false);
    }

    public qfe(String str, int i, boolean z) {
        this.f74313a = str;
        this.f74314b = i;
        this.f74315c = z;
    }
}
