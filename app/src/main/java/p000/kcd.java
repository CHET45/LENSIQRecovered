package p000;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class kcd implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final int f53607a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f53608b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final String f53609c;

    /* JADX INFO: renamed from: kcd$a */
    public class C8285a extends Thread {
        public C8285a(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(kcd.this.f53607a);
            super.run();
        }
    }

    public kcd(String str, int i) {
        this.f53609c = str;
        this.f53607a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C8285a(runnable, this.f53609c + '-' + this.f53608b.getAndIncrement());
    }
}
