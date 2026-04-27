package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qlf<T, U, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f74882a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends U>> f74883b;

    /* JADX INFO: renamed from: c */
    public final i11<? super T, ? super U, ? extends R> f74884c;

    /* JADX INFO: renamed from: qlf$a */
    public static final class C11546a<T, U, R> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends oof<? extends U>> f74885a;

        /* JADX INFO: renamed from: b */
        public final a<T, U, R> f74886b;

        /* JADX INFO: renamed from: qlf$a$a */
        public static final class a<T, U, R> extends AtomicReference<lf4> implements hnf<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: a */
            public final hnf<? super R> f74887a;

            /* JADX INFO: renamed from: b */
            public final i11<? super T, ? super U, ? extends R> f74888b;

            /* JADX INFO: renamed from: c */
            public T f74889c;

            public a(hnf<? super R> actual, i11<? super T, ? super U, ? extends R> resultSelector) {
                this.f74887a = actual;
                this.f74888b = resultSelector;
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f74887a.onError(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(U value) {
                T t = this.f74889c;
                this.f74889c = null;
                try {
                    R rApply = this.f74888b.apply(t, value);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    this.f74887a.onSuccess(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f74887a.onError(th);
                }
            }
        }

        public C11546a(hnf<? super R> actual, sy6<? super T, ? extends oof<? extends U>> mapper, i11<? super T, ? super U, ? extends R> resultSelector) {
            this.f74886b = new a<>(actual, resultSelector);
            this.f74885a = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f74886b);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f74886b.get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f74886b.f74887a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this.f74886b, d)) {
                this.f74886b.f74887a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            try {
                oof<? extends U> oofVarApply = this.f74885a.apply(t);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null MaybeSource");
                oof<? extends U> oofVar = oofVarApply;
                if (zf4.replace(this.f74886b, null)) {
                    a<T, U, R> aVar = this.f74886b;
                    aVar.f74889c = t;
                    oofVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f74886b.f74887a.onError(th);
            }
        }
    }

    public qlf(oof<T> source, sy6<? super T, ? extends oof<? extends U>> mapper, i11<? super T, ? super U, ? extends R> resultSelector) {
        this.f74882a = source;
        this.f74883b = mapper;
        this.f74884c = resultSelector;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        this.f74882a.subscribe(new C11546a(observer, this.f74883b, this.f74884c));
    }
}
