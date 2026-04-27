package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tub<T, U> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final wub<U> f86001b;

    /* JADX INFO: renamed from: tub$a */
    public final class C13247a implements pxb<U> {

        /* JADX INFO: renamed from: a */
        public final w50 f86002a;

        /* JADX INFO: renamed from: b */
        public final C13248b<T> f86003b;

        /* JADX INFO: renamed from: c */
        public final m1f<T> f86004c;

        /* JADX INFO: renamed from: d */
        public lf4 f86005d;

        public C13247a(w50 frc, C13248b<T> sus, m1f<T> serial) {
            this.f86002a = frc;
            this.f86003b = sus;
            this.f86004c = serial;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f86003b.f86010d = true;
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f86002a.dispose();
            this.f86004c.onError(t);
        }

        @Override // p000.pxb
        public void onNext(U t) {
            this.f86005d.dispose();
            this.f86003b.f86010d = true;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f86005d, d)) {
                this.f86005d = d;
                this.f86002a.setResource(1, d);
            }
        }
    }

    /* JADX INFO: renamed from: tub$b */
    public static final class C13248b<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f86007a;

        /* JADX INFO: renamed from: b */
        public final w50 f86008b;

        /* JADX INFO: renamed from: c */
        public lf4 f86009c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f86010d;

        /* JADX INFO: renamed from: e */
        public boolean f86011e;

        public C13248b(pxb<? super T> actual, w50 frc) {
            this.f86007a = actual;
            this.f86008b = frc;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f86008b.dispose();
            this.f86007a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f86008b.dispose();
            this.f86007a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f86011e) {
                this.f86007a.onNext(t);
            } else if (this.f86010d) {
                this.f86011e = true;
                this.f86007a.onNext(t);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f86009c, d)) {
                this.f86009c = d;
                this.f86008b.setResource(0, d);
            }
        }
    }

    public tub(wub<T> source, wub<U> other) {
        super(source);
        this.f86001b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> child) {
        m1f m1fVar = new m1f(child);
        w50 w50Var = new w50(2);
        m1fVar.onSubscribe(w50Var);
        C13248b c13248b = new C13248b(m1fVar, w50Var);
        this.f86001b.subscribe(new C13247a(w50Var, c13248b, m1fVar));
        this.f63101a.subscribe(c13248b);
    }
}
