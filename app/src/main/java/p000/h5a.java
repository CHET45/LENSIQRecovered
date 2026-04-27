package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class h5a<T> extends kjf<Boolean> implements zg7<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f42408a;

    /* JADX INFO: renamed from: b */
    public final Object f42409b;

    /* JADX INFO: renamed from: h5a$a */
    public static final class C6713a implements k9a<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f42410a;

        /* JADX INFO: renamed from: b */
        public final Object f42411b;

        /* JADX INFO: renamed from: c */
        public lf4 f42412c;

        public C6713a(hnf<? super Boolean> actual, Object value) {
            this.f42410a = actual;
            this.f42411b = value;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f42412c.dispose();
            this.f42412c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f42412c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f42412c = zf4.DISPOSED;
            this.f42410a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f42412c = zf4.DISPOSED;
            this.f42410a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f42412c, d)) {
                this.f42412c = d;
                this.f42410a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(Object value) {
            this.f42412c = zf4.DISPOSED;
            this.f42410a.onSuccess(Boolean.valueOf(Objects.equals(value, this.f42411b)));
        }
    }

    public h5a(z9a<T> source, Object value) {
        this.f42408a = source;
        this.f42409b = value;
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f42408a;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        this.f42408a.subscribe(new C6713a(observer, this.f42409b));
    }
}
