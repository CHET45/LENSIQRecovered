package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ylb<T, U> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final nfg<? extends U> f102018b;

    /* JADX INFO: renamed from: c */
    public final e11<? super U, ? super T> f102019c;

    /* JADX INFO: renamed from: ylb$a */
    public static final class C15715a<T, U> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f102020a;

        /* JADX INFO: renamed from: b */
        public final e11<? super U, ? super T> f102021b;

        /* JADX INFO: renamed from: c */
        public final U f102022c;

        /* JADX INFO: renamed from: d */
        public lf4 f102023d;

        /* JADX INFO: renamed from: e */
        public boolean f102024e;

        public C15715a(pxb<? super U> actual, U u, e11<? super U, ? super T> collector) {
            this.f102020a = actual;
            this.f102021b = collector;
            this.f102022c = u;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f102023d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f102023d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f102024e) {
                return;
            }
            this.f102024e = true;
            this.f102020a.onNext(this.f102022c);
            this.f102020a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f102024e) {
                ofe.onError(t);
            } else {
                this.f102024e = true;
                this.f102020a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f102024e) {
                return;
            }
            try {
                this.f102021b.accept(this.f102022c, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f102023d.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f102023d, d)) {
                this.f102023d = d;
                this.f102020a.onSubscribe(this);
            }
        }
    }

    public ylb(wub<T> source, nfg<? extends U> initialSupplier, e11<? super U, ? super T> collector) {
        super(source);
        this.f102018b = initialSupplier;
        this.f102019c = collector;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        try {
            U u = this.f102018b.get();
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.f63101a.subscribe(new C15715a(t, u, this.f102019c));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, t);
        }
    }
}
