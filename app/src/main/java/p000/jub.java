package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class jub<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T> f51955a;

    /* JADX INFO: renamed from: b */
    public final T f51956b;

    /* JADX INFO: renamed from: jub$a */
    public static final class C8098a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f51957a;

        /* JADX INFO: renamed from: b */
        public final T f51958b;

        /* JADX INFO: renamed from: c */
        public mf4 f51959c;

        /* JADX INFO: renamed from: d */
        public T f51960d;

        /* JADX INFO: renamed from: e */
        public boolean f51961e;

        public C8098a(inf<? super T> infVar, T t) {
            this.f51957a = infVar;
            this.f51958b = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51959c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51959c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f51961e) {
                return;
            }
            this.f51961e = true;
            T t = this.f51960d;
            this.f51960d = null;
            if (t == null) {
                t = this.f51958b;
            }
            if (t != null) {
                this.f51957a.onSuccess(t);
            } else {
                this.f51957a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f51961e) {
                pfe.onError(th);
            } else {
                this.f51961e = true;
                this.f51957a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f51961e) {
                return;
            }
            if (this.f51960d == null) {
                this.f51960d = t;
                return;
            }
            this.f51961e = true;
            this.f51959c.dispose();
            this.f51957a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f51959c, mf4Var)) {
                this.f51959c = mf4Var;
                this.f51957a.onSubscribe(this);
            }
        }
    }

    public jub(xub<? extends T> xubVar, T t) {
        this.f51955a = xubVar;
        this.f51956b = t;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f51955a.subscribe(new C8098a(infVar, this.f51956b));
    }
}
