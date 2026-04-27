package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class iaa<T> extends kjf<T> implements zg7<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f46215a;

    /* JADX INFO: renamed from: b */
    public final oof<? extends T> f46216b;

    /* JADX INFO: renamed from: iaa$a */
    public static final class C7211a<T> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 4603919676453758899L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f46217a;

        /* JADX INFO: renamed from: b */
        public final oof<? extends T> f46218b;

        /* JADX INFO: renamed from: iaa$a$a */
        public static final class a<T> implements hnf<T> {

            /* JADX INFO: renamed from: a */
            public final hnf<? super T> f46219a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<lf4> f46220b;

            public a(hnf<? super T> actual, AtomicReference<lf4> parent) {
                this.f46219a = actual;
                this.f46220b = parent;
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f46219a.onError(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this.f46220b, d);
            }

            @Override // p000.hnf
            public void onSuccess(T value) {
                this.f46219a.onSuccess(value);
            }
        }

        public C7211a(hnf<? super T> actual, oof<? extends T> other) {
            this.f46217a = actual;
            this.f46218b = other;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            lf4 lf4Var = get();
            if (lf4Var == zf4.DISPOSED || !compareAndSet(lf4Var, null)) {
                return;
            }
            this.f46218b.subscribe(new a(this.f46217a, this));
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f46217a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f46217a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f46217a.onSuccess(value);
        }
    }

    public iaa(z9a<T> source, oof<? extends T> other) {
        this.f46215a = source;
        this.f46216b = other;
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f46215a;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f46215a.subscribe(new C7211a(observer, this.f46216b));
    }
}
