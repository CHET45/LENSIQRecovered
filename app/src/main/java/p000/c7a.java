package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class c7a<T, U, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends U>> f15907b;

    /* JADX INFO: renamed from: c */
    public final i11<? super T, ? super U, ? extends R> f15908c;

    /* JADX INFO: renamed from: c7a$a */
    public static final class C2218a<T, U, R> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends z9a<? extends U>> f15909a;

        /* JADX INFO: renamed from: b */
        public final a<T, U, R> f15910b;

        /* JADX INFO: renamed from: c7a$a$a */
        public static final class a<T, U, R> extends AtomicReference<lf4> implements k9a<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: a */
            public final k9a<? super R> f15911a;

            /* JADX INFO: renamed from: b */
            public final i11<? super T, ? super U, ? extends R> f15912b;

            /* JADX INFO: renamed from: c */
            public T f15913c;

            public a(k9a<? super R> actual, i11<? super T, ? super U, ? extends R> resultSelector) {
                this.f15911a = actual;
                this.f15912b = resultSelector;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f15911a.onComplete();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f15911a.onError(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(U value) {
                T t = this.f15913c;
                this.f15913c = null;
                try {
                    R rApply = this.f15912b.apply(t, value);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    this.f15911a.onSuccess(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f15911a.onError(th);
                }
            }
        }

        public C2218a(k9a<? super R> actual, sy6<? super T, ? extends z9a<? extends U>> mapper, i11<? super T, ? super U, ? extends R> resultSelector) {
            this.f15910b = new a<>(actual, resultSelector);
            this.f15909a = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f15910b);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f15910b.get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f15910b.f15911a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f15910b.f15911a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this.f15910b, d)) {
                this.f15910b.f15911a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            try {
                z9a<? extends U> z9aVarApply = this.f15909a.apply(t);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends U> z9aVar = z9aVarApply;
                if (zf4.replace(this.f15910b, null)) {
                    a<T, U, R> aVar = this.f15910b;
                    aVar.f15913c = t;
                    z9aVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f15910b.f15911a.onError(th);
            }
        }
    }

    public c7a(z9a<T> source, sy6<? super T, ? extends z9a<? extends U>> mapper, i11<? super T, ? super U, ? extends R> resultSelector) {
        super(source);
        this.f15907b = mapper;
        this.f15908c = resultSelector;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f100099a.subscribe(new C2218a(observer, this.f15907b, this.f15908c));
    }
}
