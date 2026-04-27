package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ac6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f1074c;

    /* JADX INFO: renamed from: d */
    public final T f1075d;

    /* JADX INFO: renamed from: e */
    public final boolean f1076e;

    /* JADX INFO: renamed from: ac6$a */
    public static final class C0173a<T> extends k34<T> implements lj6<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* JADX INFO: renamed from: L */
        public final long f1077L;

        /* JADX INFO: renamed from: M */
        public final T f1078M;

        /* JADX INFO: renamed from: N */
        public final boolean f1079N;

        /* JADX INFO: renamed from: Q */
        public fdg f1080Q;

        /* JADX INFO: renamed from: X */
        public long f1081X;

        /* JADX INFO: renamed from: Y */
        public boolean f1082Y;

        public C0173a(ycg<? super T> ycgVar, long j, T t, boolean z) {
            super(ycgVar);
            this.f1077L = j;
            this.f1078M = t;
            this.f1079N = z;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f1080Q.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f1082Y) {
                return;
            }
            this.f1082Y = true;
            T t = this.f1078M;
            if (t != null) {
                complete(t);
            } else if (this.f1079N) {
                this.f52502a.onError(new NoSuchElementException());
            } else {
                this.f52502a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f1082Y) {
                pfe.onError(th);
            } else {
                this.f1082Y = true;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f1082Y) {
                return;
            }
            long j = this.f1081X;
            if (j != this.f1077L) {
                this.f1081X = j + 1;
                return;
            }
            this.f1082Y = true;
            this.f1080Q.cancel();
            complete(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1080Q, fdgVar)) {
                this.f1080Q = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ac6(m86<T> m86Var, long j, T t, boolean z) {
        super(m86Var);
        this.f1074c = j;
        this.f1075d = t;
        this.f1076e = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C0173a(ycgVar, this.f1074c, this.f1075d, this.f1076e));
    }
}
