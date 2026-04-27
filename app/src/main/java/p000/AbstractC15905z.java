package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15905z<T, R> extends AtomicInteger implements kj6<T>, fdg {
    private static final long serialVersionUID = -5050301752721603566L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super R> f103573a;

    /* JADX INFO: renamed from: b */
    public fdg f103574b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f103575c;

    /* JADX INFO: renamed from: d */
    public Throwable f103576d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f103577e;

    /* JADX INFO: renamed from: f */
    public final AtomicLong f103578f = new AtomicLong();

    /* JADX INFO: renamed from: m */
    public final AtomicReference<R> f103579m = new AtomicReference<>();

    public AbstractC15905z(ycg<? super R> downstream) {
        this.f103573a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public boolean m26429a(boolean d, boolean empty, ycg<?> a, AtomicReference<R> q) {
        if (this.f103577e) {
            q.lazySet(null);
            return true;
        }
        if (!d) {
            return false;
        }
        Throwable th = this.f103576d;
        if (th != null) {
            q.lazySet(null);
            a.onError(th);
            return true;
        }
        if (!empty) {
            return false;
        }
        a.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.f103575c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (m26429a(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        p000.ro0.produced(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26430b() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            ycg<? super R> r0 = r13.f103573a
            java.util.concurrent.atomic.AtomicLong r1 = r13.f103578f
            java.util.concurrent.atomic.AtomicReference<R> r2 = r13.f103579m
            r3 = 1
            r4 = r3
        Lf:
            r5 = 0
            r7 = r5
        L12:
            long r9 = r1.get()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L38
            boolean r9 = r13.f103575c
            r11 = 0
            java.lang.Object r11 = r2.getAndSet(r11)
            if (r11 != 0) goto L26
            r12 = r3
            goto L27
        L26:
            r12 = r10
        L27:
            boolean r9 = r13.m26429a(r9, r12, r0, r2)
            if (r9 == 0) goto L2e
            return
        L2e:
            if (r12 == 0) goto L31
            goto L38
        L31:
            r0.onNext(r11)
            r9 = 1
            long r7 = r7 + r9
            goto L12
        L38:
            long r11 = r1.get()
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            boolean r9 = r13.f103575c
            java.lang.Object r11 = r2.get()
            if (r11 != 0) goto L49
            r10 = r3
        L49:
            boolean r9 = r13.m26429a(r9, r10, r0, r2)
            if (r9 == 0) goto L50
            return
        L50:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L57
            p000.ro0.produced(r1, r7)
        L57:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto Lf
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC15905z.m26430b():void");
    }

    @Override // p000.fdg
    public void cancel() {
        if (this.f103577e) {
            return;
        }
        this.f103577e = true;
        this.f103574b.cancel();
        if (getAndIncrement() == 0) {
            this.f103579m.lazySet(null);
        }
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f103575c = true;
        m26430b();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f103576d = t;
        this.f103575c = true;
        m26430b();
    }

    public abstract void onNext(T t);

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.validate(this.f103574b, s)) {
            this.f103574b = s;
            this.f103573a.onSubscribe(this);
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        if (ldg.validate(n)) {
            ro0.add(this.f103578f, n);
            m26430b();
        }
    }
}
