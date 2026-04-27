package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gfc<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final eec<List<T>> f39678b;

    /* JADX INFO: renamed from: c */
    public final Comparator<? super T> f39679c;

    /* JADX INFO: renamed from: gfc$a */
    public static final class C6282a<T> extends AtomicReference<fdg> implements kj6<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;

        /* JADX INFO: renamed from: a */
        public final C6283b<T> f39680a;

        /* JADX INFO: renamed from: b */
        public final int f39681b;

        public C6282a(C6283b<T> parent, int index) {
            this.f39680a = parent;
            this.f39681b = index;
        }

        /* JADX INFO: renamed from: a */
        public void m11670a() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f39680a.m11673c(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }

        @Override // p000.ycg
        public void onNext(List<T> t) {
            this.f39680a.m11674d(t, this.f39681b);
        }
    }

    /* JADX INFO: renamed from: gfc$b */
    public static final class C6283b<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 3481980673745556697L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f39684a;

        /* JADX INFO: renamed from: b */
        public final C6282a<T>[] f39685b;

        /* JADX INFO: renamed from: c */
        public final List<T>[] f39686c;

        /* JADX INFO: renamed from: d */
        public final int[] f39687d;

        /* JADX INFO: renamed from: e */
        public final Comparator<? super T> f39688e;

        /* JADX INFO: renamed from: m */
        public volatile boolean f39690m;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f39689f = new AtomicLong();

        /* JADX INFO: renamed from: C */
        public final AtomicInteger f39682C = new AtomicInteger();

        /* JADX INFO: renamed from: F */
        public final AtomicReference<Throwable> f39683F = new AtomicReference<>();

        public C6283b(ycg<? super T> actual, int n, Comparator<? super T> comparator) {
            this.f39684a = actual;
            this.f39688e = comparator;
            C6282a<T>[] c6282aArr = new C6282a[n];
            for (int i = 0; i < n; i++) {
                c6282aArr[i] = new C6282a<>(this, i);
            }
            this.f39685b = c6282aArr;
            this.f39686c = new List[n];
            this.f39687d = new int[n];
            this.f39682C.lazySet(n);
        }

        /* JADX INFO: renamed from: a */
        public void m11671a() {
            for (C6282a<T> c6282a : this.f39685b) {
                c6282a.m11670a();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        
            if (r16.f39690m == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
        
            r7 = r16.f39683F.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        
            if (r7 == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        
            m11671a();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        
            if (r14 >= r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
        
            if (r0[r14] == r3[r14].size()) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
        
            if (r11 == 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
        
            p000.ro0.produced(r16.f39689f, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        
            r6 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
        
            r14 = r14 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00e7, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m11672b() {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gfc.C6283b.m11672b():void");
        }

        /* JADX INFO: renamed from: c */
        public void m11673c(Throwable e) {
            if (v7b.m23844a(this.f39683F, null, e)) {
                m11672b();
            } else if (e != this.f39683F.get()) {
                ofe.onError(e);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f39690m) {
                return;
            }
            this.f39690m = true;
            m11671a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f39686c, (Object) null);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m11674d(List<T> value, int index) {
            this.f39686c[index] = value;
            if (this.f39682C.decrementAndGet() == 0) {
                m11672b();
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f39689f, n);
                if (this.f39682C.get() == 0) {
                    m11672b();
                }
            }
        }
    }

    public gfc(eec<List<T>> source, Comparator<? super T> comparator) {
        this.f39678b = source;
        this.f39679c = comparator;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C6283b c6283b = new C6283b(s, this.f39678b.parallelism(), this.f39679c);
        s.onSubscribe(c6283b);
        this.f39678b.subscribe(c6283b.f39685b);
    }
}
