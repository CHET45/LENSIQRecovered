package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class qi6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final T f74493c;

    /* JADX INFO: renamed from: d */
    public final boolean f74494d;

    /* JADX INFO: renamed from: qi6$a */
    public static final class C11482a<T> extends k34<T> implements lj6<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* JADX INFO: renamed from: L */
        public final T f74495L;

        /* JADX INFO: renamed from: M */
        public final boolean f74496M;

        /* JADX INFO: renamed from: N */
        public fdg f74497N;

        /* JADX INFO: renamed from: Q */
        public boolean f74498Q;

        public C11482a(ycg<? super T> ycgVar, T t, boolean z) {
            super(ycgVar);
            this.f74495L = t;
            this.f74496M = z;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f74497N.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f74498Q) {
                return;
            }
            this.f74498Q = true;
            T t = this.f52503b;
            this.f52503b = null;
            if (t == null) {
                t = this.f74495L;
            }
            if (t != null) {
                complete(t);
            } else if (this.f74496M) {
                this.f52502a.onError(new NoSuchElementException());
            } else {
                this.f52502a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f74498Q) {
                pfe.onError(th);
            } else {
                this.f74498Q = true;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f74498Q) {
                return;
            }
            if (this.f52503b == null) {
                this.f52503b = t;
                return;
            }
            this.f74498Q = true;
            this.f74497N.cancel();
            this.f52502a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f74497N, fdgVar)) {
                this.f74497N = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public qi6(m86<T> m86Var, T t, boolean z) {
        super(m86Var);
        this.f74493c = t;
        this.f74494d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C11482a(ycgVar, this.f74493c, this.f74494d));
    }
}
