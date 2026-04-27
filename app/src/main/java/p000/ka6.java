package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ka6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f53430b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f53431c;

    /* JADX INFO: renamed from: d */
    public final e55 f53432d;

    /* JADX INFO: renamed from: e */
    public final int f53433e;

    /* JADX INFO: renamed from: ka6$a */
    public static final class C8263a<T, R> extends xo2<T> implements fdg {

        /* JADX INFO: renamed from: M1 */
        public static final int f53434M1 = 1;

        /* JADX INFO: renamed from: V1 */
        public static final int f53435V1 = 2;

        /* JADX INFO: renamed from: Z */
        public static final int f53436Z = 0;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super R> f53437F;

        /* JADX INFO: renamed from: H */
        public final sy6<? super T, ? extends oof<? extends R>> f53438H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f53439L;

        /* JADX INFO: renamed from: M */
        public final a<R> f53440M;

        /* JADX INFO: renamed from: N */
        public long f53441N;

        /* JADX INFO: renamed from: Q */
        public int f53442Q;

        /* JADX INFO: renamed from: X */
        public R f53443X;

        /* JADX INFO: renamed from: Y */
        public volatile int f53444Y;

        /* JADX INFO: renamed from: ka6$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements hnf<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C8263a<?, R> f53445a;

            public a(C8263a<?, R> parent) {
                this.f53445a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m14628a() {
                zf4.dispose(this);
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f53445a.m14626f(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R t) {
                this.f53445a.m14627g(t);
            }
        }

        public C8263a(ycg<? super R> downstream, sy6<? super T, ? extends oof<? extends R>> mapper, int prefetch, e55 errorMode) {
            super(prefetch, errorMode);
            this.f53437F = downstream;
            this.f53438H = mapper;
            this.f53439L = new AtomicLong();
            this.f53440M = new a<>(this);
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: a */
        public void mo10762a() {
            this.f53443X = null;
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: b */
        public void mo10763b() {
            this.f53440M.m14628a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f53443X = null;
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
            throw new UnsupportedOperationException("Method not decompiled: p000.ka6.C8263a.mo10764c():void");
        }

        @Override // p000.fdg
        public void cancel() {
            m25357e();
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: d */
        public void mo10765d() {
            this.f53437F.onSubscribe(this);
        }

        /* JADX INFO: renamed from: f */
        public void m14626f(Throwable ex) {
            if (this.f98770a.tryAddThrowableOrReport(ex)) {
                if (this.f98772c != e55.END) {
                    this.f98774e.cancel();
                }
                this.f53444Y = 0;
                mo10764c();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m14627g(R item) {
            this.f53443X = item;
            this.f53444Y = 2;
            mo10764c();
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f53439L, n);
            mo10764c();
        }
    }

    public ka6(l86<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, e55 errorMode, int prefetch) {
        this.f53430b = source;
        this.f53431c = mapper;
        this.f53432d = errorMode;
        this.f53433e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f53430b.subscribe((kj6) new C8263a(s, this.f53431c, this.f53433e, this.f53432d));
    }
}
