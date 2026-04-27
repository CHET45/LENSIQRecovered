package p000;

import java.util.concurrent.TimeUnit;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class mnb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f61564b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f61565c;

    /* JADX INFO: renamed from: d */
    public final woe f61566d;

    /* JADX INFO: renamed from: e */
    public final boolean f61567e;

    /* JADX INFO: renamed from: mnb$a */
    public static final class C9426a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f61568a;

        /* JADX INFO: renamed from: b */
        public final long f61569b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f61570c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f61571d;

        /* JADX INFO: renamed from: e */
        public final boolean f61572e;

        /* JADX INFO: renamed from: f */
        public lf4 f61573f;

        /* JADX INFO: renamed from: mnb$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C9426a.this.f61568a.onComplete();
                } finally {
                    C9426a.this.f61571d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: mnb$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f61575a;

            public b(Throwable throwable) {
                this.f61575a = throwable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C9426a.this.f61568a.onError(this.f61575a);
                } finally {
                    C9426a.this.f61571d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: mnb$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f61577a;

            public c(T t) {
                this.f61577a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9426a.this.f61568a.onNext(this.f61577a);
            }
        }

        public C9426a(pxb<? super T> actual, long delay, TimeUnit unit, woe.AbstractC14729c w, boolean delayError) {
            this.f61568a = actual;
            this.f61569b = delay;
            this.f61570c = unit;
            this.f61571d = w;
            this.f61572e = delayError;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f61573f.dispose();
            this.f61571d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f61571d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f61571d.schedule(new a(), this.f61569b, this.f61570c);
        }

        @Override // p000.pxb
        public void onError(final Throwable t) {
            this.f61571d.schedule(new b(t), this.f61572e ? this.f61569b : 0L, this.f61570c);
        }

        @Override // p000.pxb
        public void onNext(final T t) {
            this.f61571d.schedule(new c(t), this.f61569b, this.f61570c);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f61573f, d)) {
                this.f61573f = d;
                this.f61568a.onSubscribe(this);
            }
        }
    }

    public mnb(wub<T> source, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
        super(source);
        this.f61564b = delay;
        this.f61565c = unit;
        this.f61566d = scheduler;
        this.f61567e = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C9426a(this.f61567e ? t : new m1f(t), this.f61564b, this.f61565c, this.f61566d.createWorker(), this.f61567e));
    }
}
