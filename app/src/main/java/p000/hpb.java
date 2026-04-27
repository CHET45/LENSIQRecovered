package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class hpb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Iterable<? extends R>> f44437b;

    /* JADX INFO: renamed from: hpb$a */
    public static final class C6965a<T, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f44438a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f44439b;

        /* JADX INFO: renamed from: c */
        public lf4 f44440c;

        public C6965a(pxb<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f44438a = actual;
            this.f44439b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f44440c.dispose();
            this.f44440c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f44440c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            lf4 lf4Var = this.f44440c;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                return;
            }
            this.f44440c = zf4Var;
            this.f44438a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            lf4 lf4Var = this.f44440c;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                ofe.onError(e);
            } else {
                this.f44440c = zf4Var;
                this.f44438a.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f44440c == zf4.DISPOSED) {
                return;
            }
            try {
                pxb<? super R> pxbVar = this.f44438a;
                for (R r : this.f44439b.apply(t)) {
                    try {
                        try {
                            Objects.requireNonNull(r, "The iterator returned a null value");
                            pxbVar.onNext(r);
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            this.f44440c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        this.f44440c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                this.f44440c.dispose();
                onError(th3);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f44440c, d)) {
                this.f44440c = d;
                this.f44438a.onSubscribe(this);
            }
        }
    }

    public hpb(wub<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
        super(source);
        this.f44437b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f63101a.subscribe(new C6965a(observer, this.f44437b));
    }
}
