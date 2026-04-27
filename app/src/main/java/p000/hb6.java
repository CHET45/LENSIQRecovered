package p000;

import java.util.concurrent.TimeUnit;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class hb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f43071c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f43072d;

    /* JADX INFO: renamed from: e */
    public final woe f43073e;

    /* JADX INFO: renamed from: f */
    public final boolean f43074f;

    /* JADX INFO: renamed from: hb6$a */
    public static final class C6785a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f43075a;

        /* JADX INFO: renamed from: b */
        public final long f43076b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f43077c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f43078d;

        /* JADX INFO: renamed from: e */
        public final boolean f43079e;

        /* JADX INFO: renamed from: f */
        public fdg f43080f;

        /* JADX INFO: renamed from: hb6$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6785a.this.f43075a.onComplete();
                } finally {
                    C6785a.this.f43078d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: hb6$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f43082a;

            public b(Throwable t) {
                this.f43082a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6785a.this.f43075a.onError(this.f43082a);
                } finally {
                    C6785a.this.f43078d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: hb6$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f43084a;

            public c(T t) {
                this.f43084a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6785a.this.f43075a.onNext(this.f43084a);
            }
        }

        public C6785a(ycg<? super T> actual, long delay, TimeUnit unit, woe.AbstractC14729c w, boolean delayError) {
            this.f43075a = actual;
            this.f43076b = delay;
            this.f43077c = unit;
            this.f43078d = w;
            this.f43079e = delayError;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f43080f.cancel();
            this.f43078d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f43078d.schedule(new a(), this.f43076b, this.f43077c);
        }

        @Override // p000.ycg
        public void onError(final Throwable t) {
            this.f43078d.schedule(new b(t), this.f43079e ? this.f43076b : 0L, this.f43077c);
        }

        @Override // p000.ycg
        public void onNext(final T t) {
            this.f43078d.schedule(new c(t), this.f43076b, this.f43077c);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f43080f, s)) {
                this.f43080f = s;
                this.f43075a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f43080f.request(n);
        }
    }

    public hb6(l86<T> source, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
        super(source);
        this.f43071c = delay;
        this.f43072d = unit;
        this.f43073e = scheduler;
        this.f43074f = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> t) {
        this.f49321b.subscribe((kj6) new C6785a(this.f43074f ? t : new u1f(t), this.f43071c, this.f43072d, this.f43073e.createWorker(), this.f43074f));
    }
}
