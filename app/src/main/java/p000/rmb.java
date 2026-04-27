package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rmb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final ph2 f78729b;

    /* JADX INFO: renamed from: rmb$a */
    public static final class C12155a<T> extends AtomicReference<lf4> implements pxb<T>, ch2, lf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f78730a;

        /* JADX INFO: renamed from: b */
        public ph2 f78731b;

        /* JADX INFO: renamed from: c */
        public boolean f78732c;

        public C12155a(pxb<? super T> actual, ph2 other) {
            this.f78730a = actual;
            this.f78731b = other;
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
            if (this.f78732c) {
                this.f78730a.onComplete();
                return;
            }
            this.f78732c = true;
            zf4.replace(this, null);
            ph2 ph2Var = this.f78731b;
            this.f78731b = null;
            ph2Var.subscribe(this);
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f78730a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f78730a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (!zf4.setOnce(this, d) || this.f78732c) {
                return;
            }
            this.f78730a.onSubscribe(this);
        }
    }

    public rmb(vkb<T> source, ph2 other) {
        super(source);
        this.f78729b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C12155a(observer, this.f78729b));
    }
}
