package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ee2<R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final ph2 f32727a;

    /* JADX INFO: renamed from: b */
    public final wub<? extends R> f32728b;

    /* JADX INFO: renamed from: ee2$a */
    public static final class C5270a<R> extends AtomicReference<lf4> implements pxb<R>, ch2, lf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f32729a;

        /* JADX INFO: renamed from: b */
        public wub<? extends R> f32730b;

        public C5270a(pxb<? super R> downstream, wub<? extends R> other) {
            this.f32730b = other;
            this.f32729a = downstream;
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
            wub<? extends R> wubVar = this.f32730b;
            if (wubVar == null) {
                this.f32729a.onComplete();
            } else {
                this.f32730b = null;
                wubVar.subscribe(this);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f32729a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(R t) {
            this.f32729a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }
    }

    public ee2(ph2 source, wub<? extends R> other) {
        this.f32727a = source;
        this.f32728b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        C5270a c5270a = new C5270a(observer, this.f32728b);
        observer.onSubscribe(c5270a);
        this.f32727a.subscribe(c5270a);
    }
}
