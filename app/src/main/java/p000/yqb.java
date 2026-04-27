package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class yqb<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f102659a;

    /* JADX INFO: renamed from: b */
    public final T f102660b;

    /* JADX INFO: renamed from: yqb$a */
    public static final class C15763a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f102661a;

        /* JADX INFO: renamed from: b */
        public final T f102662b;

        /* JADX INFO: renamed from: c */
        public mf4 f102663c;

        /* JADX INFO: renamed from: d */
        public T f102664d;

        public C15763a(inf<? super T> infVar, T t) {
            this.f102661a = infVar;
            this.f102662b = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f102663c.dispose();
            this.f102663c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f102663c == ag4.DISPOSED;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f102663c = ag4.DISPOSED;
            T t = this.f102664d;
            if (t != null) {
                this.f102664d = null;
                this.f102661a.onSuccess(t);
                return;
            }
            T t2 = this.f102662b;
            if (t2 != null) {
                this.f102661a.onSuccess(t2);
            } else {
                this.f102661a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f102663c = ag4.DISPOSED;
            this.f102664d = null;
            this.f102661a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f102664d = t;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f102663c, mf4Var)) {
                this.f102663c = mf4Var;
                this.f102661a.onSubscribe(this);
            }
        }
    }

    public yqb(xub<T> xubVar, T t) {
        this.f102659a = xubVar;
        this.f102660b = t;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f102659a.subscribe(new C15763a(infVar, this.f102660b));
    }
}
