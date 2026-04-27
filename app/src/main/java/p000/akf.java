package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class akf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f1837a;

    /* JADX INFO: renamed from: b */
    public final long f1838b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f1839c;

    /* JADX INFO: renamed from: d */
    public final woe f1840d;

    /* JADX INFO: renamed from: e */
    public final boolean f1841e;

    /* JADX INFO: renamed from: akf$a */
    public final class C0299a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final a0f f1842a;

        /* JADX INFO: renamed from: b */
        public final hnf<? super T> f1843b;

        /* JADX INFO: renamed from: akf$a$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f1845a;

            public a(Throwable e) {
                this.f1845a = e;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0299a.this.f1843b.onError(this.f1845a);
            }
        }

        /* JADX INFO: renamed from: akf$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f1847a;

            public b(T value) {
                this.f1847a = value;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0299a.this.f1843b.onSuccess(this.f1847a);
            }
        }

        public C0299a(a0f sd, hnf<? super T> observer) {
            this.f1842a = sd;
            this.f1843b = observer;
        }

        @Override // p000.hnf
        public void onError(final Throwable e) {
            a0f a0fVar = this.f1842a;
            woe woeVar = akf.this.f1840d;
            a aVar = new a(e);
            akf akfVar = akf.this;
            a0fVar.replace(woeVar.scheduleDirect(aVar, akfVar.f1841e ? akfVar.f1838b : 0L, akfVar.f1839c));
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f1842a.replace(d);
        }

        @Override // p000.hnf
        public void onSuccess(final T value) {
            a0f a0fVar = this.f1842a;
            woe woeVar = akf.this.f1840d;
            b bVar = new b(value);
            akf akfVar = akf.this;
            a0fVar.replace(woeVar.scheduleDirect(bVar, akfVar.f1838b, akfVar.f1839c));
        }
    }

    public akf(oof<? extends T> source, long time, TimeUnit unit, woe scheduler, boolean delayError) {
        this.f1837a = source;
        this.f1838b = time;
        this.f1839c = unit;
        this.f1840d = scheduler;
        this.f1841e = delayError;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        a0f a0fVar = new a0f();
        observer.onSubscribe(a0fVar);
        this.f1837a.subscribe(new C0299a(a0fVar, observer));
    }
}
