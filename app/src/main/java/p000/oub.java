package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class oub<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final int f68835b;

    /* JADX INFO: renamed from: oub$a */
    public static final class C10659a<T> extends ArrayDeque<T> implements oxb<T>, mf4 {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f68836a;

        /* JADX INFO: renamed from: b */
        public final int f68837b;

        /* JADX INFO: renamed from: c */
        public mf4 f68838c;

        public C10659a(oxb<? super T> oxbVar, int i) {
            super(i);
            this.f68836a = oxbVar;
            this.f68837b = i;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f68838c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f68838c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f68836a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f68836a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f68837b == size()) {
                this.f68836a.onNext(poll());
            }
            offer(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f68838c, mf4Var)) {
                this.f68838c = mf4Var;
                this.f68836a.onSubscribe(this);
            }
        }
    }

    public oub(xub<T> xubVar, int i) {
        super(xubVar);
        this.f68835b = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C10659a(oxbVar, this.f68835b));
    }
}
