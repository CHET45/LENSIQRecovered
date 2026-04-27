package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tmb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T> f85326b;

    /* JADX INFO: renamed from: tmb$a */
    public static final class C13108a<T> extends AtomicReference<lf4> implements pxb<T>, k9a<T>, lf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f85327a;

        /* JADX INFO: renamed from: b */
        public z9a<? extends T> f85328b;

        /* JADX INFO: renamed from: c */
        public boolean f85329c;

        public C13108a(pxb<? super T> actual, z9a<? extends T> other) {
            this.f85327a = actual;
            this.f85328b = other;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f85329c) {
                this.f85327a.onComplete();
                return;
            }
            this.f85329c = true;
            zf4.replace(this, null);
            z9a<? extends T> z9aVar = this.f85328b;
            this.f85328b = null;
            z9aVar.subscribe(this);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f85327a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f85327a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (!zf4.setOnce(this, d) || this.f85329c) {
                return;
            }
            this.f85327a.onSubscribe(this);
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            this.f85327a.onNext(t);
            this.f85327a.onComplete();
        }
    }

    public tmb(vkb<T> source, z9a<? extends T> other) {
        super(source);
        this.f85326b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C13108a(observer, this.f85326b));
    }
}
