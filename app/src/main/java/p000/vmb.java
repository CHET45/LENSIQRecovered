package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vmb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final oof<? extends T> f91738b;

    /* JADX INFO: renamed from: vmb$a */
    public static final class C14168a<T> extends AtomicReference<lf4> implements pxb<T>, hnf<T>, lf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f91739a;

        /* JADX INFO: renamed from: b */
        public oof<? extends T> f91740b;

        /* JADX INFO: renamed from: c */
        public boolean f91741c;

        public C14168a(pxb<? super T> actual, oof<? extends T> other) {
            this.f91739a = actual;
            this.f91740b = other;
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
            this.f91741c = true;
            zf4.replace(this, null);
            oof<? extends T> oofVar = this.f91740b;
            this.f91740b = null;
            oofVar.subscribe(this);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f91739a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f91739a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (!zf4.setOnce(this, d) || this.f91741c) {
                return;
            }
            this.f91739a.onSubscribe(this);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f91739a.onNext(t);
            this.f91739a.onComplete();
        }
    }

    public vmb(vkb<T> source, oof<? extends T> other) {
        super(source);
        this.f91738b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C14168a(observer, this.f91738b));
    }
}
