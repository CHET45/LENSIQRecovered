package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dg6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: dg6$a */
    public static final class C4782a<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = 163080509307634843L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f29584a;

        /* JADX INFO: renamed from: b */
        public fdg f29585b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f29586c;

        /* JADX INFO: renamed from: d */
        public Throwable f29587d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f29588e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f29589f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<T> f29590m = new AtomicReference<>();

        public C4782a(ycg<? super T> ycgVar) {
            this.f29584a = ycgVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m9132a(boolean z, boolean z2, ycg<?> ycgVar, AtomicReference<T> atomicReference) {
            if (this.f29588e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f29587d;
            if (th != null) {
                atomicReference.lazySet(null);
                ycgVar.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f29586c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (m9132a(r9, r10, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            p000.so0.produced(r1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r4 = addAndGet(-r4);
         */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9133b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                ycg<? super T> r0 = r13.f29584a
                java.util.concurrent.atomic.AtomicLong r1 = r13.f29589f
                java.util.concurrent.atomic.AtomicReference<T> r2 = r13.f29590m
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
                boolean r9 = r13.f29586c
                r11 = 0
                java.lang.Object r11 = r2.getAndSet(r11)
                if (r11 != 0) goto L26
                r12 = r3
                goto L27
            L26:
                r12 = r10
            L27:
                boolean r9 = r13.m9132a(r9, r12, r0, r2)
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
                boolean r9 = r13.f29586c
                java.lang.Object r11 = r2.get()
                if (r11 != 0) goto L49
                r10 = r3
            L49:
                boolean r9 = r13.m9132a(r9, r10, r0, r2)
                if (r9 == 0) goto L50
                return
            L50:
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 == 0) goto L57
                p000.so0.produced(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dg6.C4782a.m9133b():void");
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f29588e) {
                return;
            }
            this.f29588e = true;
            this.f29585b.cancel();
            if (getAndIncrement() == 0) {
                this.f29590m.lazySet(null);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29586c = true;
            m9133b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f29587d = th;
            this.f29586c = true;
            m9133b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f29590m.lazySet(t);
            m9133b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f29585b, fdgVar)) {
                this.f29585b = fdgVar;
                this.f29584a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f29589f, j);
                m9133b();
            }
        }
    }

    public dg6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C4782a(ycgVar));
    }
}
