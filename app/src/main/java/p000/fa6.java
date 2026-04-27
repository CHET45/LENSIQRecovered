package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fa6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f35907b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f35908c;

    /* JADX INFO: renamed from: d */
    public final e55 f35909d;

    /* JADX INFO: renamed from: e */
    public final int f35910e;

    /* JADX INFO: renamed from: fa6$a */
    public static final class C5703a<T, R> extends xo2<T> implements fdg {

        /* JADX INFO: renamed from: M1 */
        public static final int f35911M1 = 1;

        /* JADX INFO: renamed from: V1 */
        public static final int f35912V1 = 2;

        /* JADX INFO: renamed from: Z */
        public static final int f35913Z = 0;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super R> f35914F;

        /* JADX INFO: renamed from: H */
        public final sy6<? super T, ? extends z9a<? extends R>> f35915H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f35916L;

        /* JADX INFO: renamed from: M */
        public final a<R> f35917M;

        /* JADX INFO: renamed from: N */
        public long f35918N;

        /* JADX INFO: renamed from: Q */
        public int f35919Q;

        /* JADX INFO: renamed from: X */
        public R f35920X;

        /* JADX INFO: renamed from: Y */
        public volatile int f35921Y;

        /* JADX INFO: renamed from: fa6$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements k9a<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C5703a<?, R> f35922a;

            public a(C5703a<?, R> parent) {
                this.f35922a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m10769a() {
                zf4.dispose(this);
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f35922a.m10766f();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f35922a.m10767g(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R t) {
                this.f35922a.m10768h(t);
            }
        }

        public C5703a(ycg<? super R> downstream, sy6<? super T, ? extends z9a<? extends R>> mapper, int prefetch, e55 errorMode) {
            super(prefetch, errorMode);
            this.f35914F = downstream;
            this.f35915H = mapper;
            this.f35916L = new AtomicLong();
            this.f35917M = new a<>(this);
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: a */
        public void mo10762a() {
            this.f35920X = null;
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: b */
        public void mo10763b() {
            this.f35917M.m10769a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f35920X = null;
            r4.tryTerminateConsumer(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return;
         */
        @Override // p000.xo2
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo10764c() {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fa6.C5703a.mo10764c():void");
        }

        @Override // p000.fdg
        public void cancel() {
            m25357e();
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: d */
        public void mo10765d() {
            this.f35914F.onSubscribe(this);
        }

        /* JADX INFO: renamed from: f */
        public void m10766f() {
            this.f35921Y = 0;
            mo10764c();
        }

        /* JADX INFO: renamed from: g */
        public void m10767g(Throwable ex) {
            if (this.f98770a.tryAddThrowableOrReport(ex)) {
                if (this.f98772c != e55.END) {
                    this.f98774e.cancel();
                }
                this.f35921Y = 0;
                mo10764c();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m10768h(R item) {
            this.f35920X = item;
            this.f35921Y = 2;
            mo10764c();
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f35916L, n);
            mo10764c();
        }
    }

    public fa6(l86<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, e55 errorMode, int prefetch) {
        this.f35907b = source;
        this.f35908c = mapper;
        this.f35909d = errorMode;
        this.f35910e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f35907b.subscribe((kj6) new C5703a(s, this.f35908c, this.f35910e, this.f35909d));
    }
}
