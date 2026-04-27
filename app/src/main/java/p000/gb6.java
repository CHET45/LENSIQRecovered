package p000;

import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class gb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f39228c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f39229d;

    /* JADX INFO: renamed from: e */
    public final voe f39230e;

    /* JADX INFO: renamed from: f */
    public final boolean f39231f;

    /* JADX INFO: renamed from: gb6$a */
    public static final class C6194a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f39232a;

        /* JADX INFO: renamed from: b */
        public final long f39233b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f39234c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f39235d;

        /* JADX INFO: renamed from: e */
        public final boolean f39236e;

        /* JADX INFO: renamed from: f */
        public fdg f39237f;

        /* JADX INFO: renamed from: gb6$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6194a.this.f39232a.onComplete();
                } finally {
                    C6194a.this.f39235d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: gb6$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f39239a;

            public b(Throwable th) {
                this.f39239a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6194a.this.f39232a.onError(this.f39239a);
                } finally {
                    C6194a.this.f39235d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: gb6$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f39241a;

            public c(T t) {
                this.f39241a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6194a.this.f39232a.onNext(this.f39241a);
            }
        }

        public C6194a(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, boolean z) {
            this.f39232a = ycgVar;
            this.f39233b = j;
            this.f39234c = timeUnit;
            this.f39235d = abstractC14185c;
            this.f39236e = z;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f39237f.cancel();
            this.f39235d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f39235d.schedule(new a(), this.f39233b, this.f39234c);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f39235d.schedule(new b(th), this.f39236e ? this.f39233b : 0L, this.f39234c);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f39235d.schedule(new c(t), this.f39233b, this.f39234c);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f39237f, fdgVar)) {
                this.f39237f = fdgVar;
                this.f39232a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f39237f.request(j);
        }
    }

    public gb6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(m86Var);
        this.f39228c = j;
        this.f39229d = timeUnit;
        this.f39230e = voeVar;
        this.f39231f = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C6194a(this.f39231f ? ycgVar : new t1f(ycgVar), this.f39228c, this.f39229d, this.f39230e.createWorker(), this.f39231f));
    }
}
