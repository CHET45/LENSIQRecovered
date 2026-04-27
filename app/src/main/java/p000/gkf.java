package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gkf<T, U> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f40032a;

    /* JADX INFO: renamed from: b */
    public final zjd<U> f40033b;

    /* JADX INFO: renamed from: gkf$a */
    public static final class C6361a<T, U> extends AtomicReference<lf4> implements kj6<U>, lf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f40034a;

        /* JADX INFO: renamed from: b */
        public final oof<T> f40035b;

        /* JADX INFO: renamed from: c */
        public boolean f40036c;

        /* JADX INFO: renamed from: d */
        public fdg f40037d;

        public C6361a(hnf<? super T> actual, oof<T> source) {
            this.f40034a = actual;
            this.f40035b = source;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f40037d.cancel();
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f40036c) {
                return;
            }
            this.f40036c = true;
            this.f40035b.subscribe(new f8e(this, this.f40034a));
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            if (this.f40036c) {
                ofe.onError(e);
            } else {
                this.f40036c = true;
                this.f40034a.onError(e);
            }
        }

        @Override // p000.ycg
        public void onNext(U value) {
            this.f40037d.cancel();
            onComplete();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f40037d, s)) {
                this.f40037d = s;
                this.f40034a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public gkf(oof<T> source, zjd<U> other) {
        this.f40032a = source;
        this.f40033b = other;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f40033b.subscribe(new C6361a(observer, this.f40032a));
    }
}
