package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: jy */
/* JADX INFO: loaded from: classes3.dex */
public class C8141jy {

    /* JADX INFO: renamed from: g */
    public static final long f52207g = 10;

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<C8141jy> f52208h = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public c f52212d;

    /* JADX INFO: renamed from: a */
    public final scf<b, Long> f52209a = new scf<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f52210b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final a f52211c = new a();

    /* JADX INFO: renamed from: e */
    public long f52213e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f52214f = false;

    /* JADX INFO: renamed from: jy$a */
    public class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m14374a() {
            C8141jy.this.f52213e = SystemClock.uptimeMillis();
            C8141jy c8141jy = C8141jy.this;
            c8141jy.m14372a(c8141jy.f52213e);
            if (C8141jy.this.f52210b.size() > 0) {
                C8141jy.this.m14373b().mo14375a();
            }
        }
    }

    /* JADX INFO: renamed from: jy$b */
    public interface b {
        boolean doAnimationFrame(long j);
    }

    /* JADX INFO: renamed from: jy$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final a f52216a;

        public c(a aVar) {
            this.f52216a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo14375a();
    }

    /* JADX INFO: renamed from: jy$d */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final Runnable f52217b;

        /* JADX INFO: renamed from: c */
        public final Handler f52218c;

        /* JADX INFO: renamed from: d */
        public long f52219d;

        /* JADX INFO: renamed from: jy$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f52219d = SystemClock.uptimeMillis();
                d.this.f52216a.m14374a();
            }
        }

        public d(a aVar) {
            super(aVar);
            this.f52219d = -1L;
            this.f52217b = new a();
            this.f52218c = new Handler(Looper.myLooper());
        }

        @Override // p000.C8141jy.c
        /* JADX INFO: renamed from: a */
        public void mo14375a() {
            this.f52218c.postDelayed(this.f52217b, Math.max(10 - (SystemClock.uptimeMillis() - this.f52219d), 0L));
        }
    }

    /* JADX INFO: renamed from: jy$e */
    @c5e(16)
    public static class e extends c {

        /* JADX INFO: renamed from: b */
        public final Choreographer f52221b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f52222c;

        /* JADX INFO: renamed from: jy$e$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                e.this.f52216a.m14374a();
            }
        }

        public e(a aVar) {
            super(aVar);
            this.f52221b = Choreographer.getInstance();
            this.f52222c = new a();
        }

        @Override // p000.C8141jy.c
        /* JADX INFO: renamed from: a */
        public void mo14375a() {
            this.f52221b.postFrameCallback(this.f52222c);
        }
    }

    private void cleanUpList() {
        if (this.f52214f) {
            for (int size = this.f52210b.size() - 1; size >= 0; size--) {
                if (this.f52210b.get(size) == null) {
                    this.f52210b.remove(size);
                }
            }
            this.f52214f = false;
        }
    }

    public static long getFrameTime() {
        ThreadLocal<C8141jy> threadLocal = f52208h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f52213e;
    }

    public static C8141jy getInstance() {
        ThreadLocal<C8141jy> threadLocal = f52208h;
        if (threadLocal.get() == null) {
            threadLocal.set(new C8141jy());
        }
        return threadLocal.get();
    }

    private boolean isCallbackDue(b bVar, long j) {
        Long l = this.f52209a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f52209a.remove(bVar);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m14372a(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f52210b.size(); i++) {
            b bVar = this.f52210b.get(i);
            if (bVar != null && isCallbackDue(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j);
            }
        }
        cleanUpList();
    }

    public void addAnimationFrameCallback(b bVar, long j) {
        if (this.f52210b.size() == 0) {
            m14373b().mo14375a();
        }
        if (!this.f52210b.contains(bVar)) {
            this.f52210b.add(bVar);
        }
        if (j > 0) {
            this.f52209a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* JADX INFO: renamed from: b */
    public c m14373b() {
        if (this.f52212d == null) {
            this.f52212d = new e(this.f52211c);
        }
        return this.f52212d;
    }

    public void removeCallback(b bVar) {
        this.f52209a.remove(bVar);
        int iIndexOf = this.f52210b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f52210b.set(iIndexOf, null);
            this.f52214f = true;
        }
    }

    public void setProvider(c cVar) {
        this.f52212d = cVar;
    }
}
