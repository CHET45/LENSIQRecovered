package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tvb<T, U> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final xub<? extends U> f86100b;

    /* JADX INFO: renamed from: tvb$a */
    public static final class C13255a<T, U> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 1418547743690811973L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f86101a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f86102b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final C13255a<T, U>.a f86103c = new a();

        /* JADX INFO: renamed from: d */
        public final cc0 f86104d = new cc0();

        /* JADX INFO: renamed from: tvb$a$a */
        public final class a extends AtomicReference<mf4> implements oxb<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public a() {
            }

            @Override // p000.oxb
            public void onComplete() {
                C13255a.this.m22876a();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                C13255a.this.m22877b(th);
            }

            @Override // p000.oxb
            public void onNext(U u) {
                ag4.dispose(this);
                C13255a.this.m22876a();
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C13255a(oxb<? super T> oxbVar) {
            this.f86101a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m22876a() {
            ag4.dispose(this.f86102b);
            yd7.onComplete(this.f86101a, this, this.f86104d);
        }

        /* JADX INFO: renamed from: b */
        public void m22877b(Throwable th) {
            ag4.dispose(this.f86102b);
            yd7.onError(this.f86101a, th, this, this.f86104d);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f86102b);
            ag4.dispose(this.f86103c);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f86102b.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.dispose(this.f86103c);
            yd7.onComplete(this.f86101a, this, this.f86104d);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f86103c);
            yd7.onError(this.f86101a, th, this, this.f86104d);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            yd7.onNext(this.f86101a, t, this, this.f86104d);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f86102b, mf4Var);
        }
    }

    public tvb(xub<T> xubVar, xub<? extends U> xubVar2) {
        super(xubVar);
        this.f86100b = xubVar2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C13255a c13255a = new C13255a(oxbVar);
        oxbVar.onSubscribe(c13255a);
        this.f86100b.subscribe(c13255a.f86103c);
        this.f66354a.subscribe(c13255a);
    }
}
