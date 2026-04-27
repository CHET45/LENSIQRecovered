package p000;

import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class lnb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f58297b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f58298c;

    /* JADX INFO: renamed from: d */
    public final voe f58299d;

    /* JADX INFO: renamed from: e */
    public final boolean f58300e;

    /* JADX INFO: renamed from: lnb$a */
    public static final class C8906a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f58301a;

        /* JADX INFO: renamed from: b */
        public final long f58302b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f58303c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f58304d;

        /* JADX INFO: renamed from: e */
        public final boolean f58305e;

        /* JADX INFO: renamed from: f */
        public mf4 f58306f;

        /* JADX INFO: renamed from: lnb$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C8906a.this.f58301a.onComplete();
                } finally {
                    C8906a.this.f58304d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: lnb$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f58308a;

            public b(Throwable th) {
                this.f58308a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C8906a.this.f58301a.onError(this.f58308a);
                } finally {
                    C8906a.this.f58304d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: lnb$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f58310a;

            public c(T t) {
                this.f58310a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C8906a.this.f58301a.onNext(this.f58310a);
            }
        }

        public C8906a(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, boolean z) {
            this.f58301a = oxbVar;
            this.f58302b = j;
            this.f58303c = timeUnit;
            this.f58304d = abstractC14185c;
            this.f58305e = z;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f58306f.dispose();
            this.f58304d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f58304d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f58304d.schedule(new a(), this.f58302b, this.f58303c);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f58304d.schedule(new b(th), this.f58305e ? this.f58302b : 0L, this.f58303c);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f58304d.schedule(new c(t), this.f58302b, this.f58303c);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f58306f, mf4Var)) {
                this.f58306f = mf4Var;
                this.f58301a.onSubscribe(this);
            }
        }
    }

    public lnb(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(xubVar);
        this.f58297b = j;
        this.f58298c = timeUnit;
        this.f58299d = voeVar;
        this.f58300e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C8906a(this.f58300e ? oxbVar : new n1f(oxbVar), this.f58297b, this.f58298c, this.f58299d.createWorker(), this.f58300e));
    }
}
