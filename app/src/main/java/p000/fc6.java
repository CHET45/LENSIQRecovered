package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class fc6<T> extends ljf<T> implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f36083a;

    /* JADX INFO: renamed from: b */
    public final long f36084b;

    /* JADX INFO: renamed from: c */
    public final T f36085c;

    /* JADX INFO: renamed from: fc6$a */
    public static final class C5718a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f36086a;

        /* JADX INFO: renamed from: b */
        public final long f36087b;

        /* JADX INFO: renamed from: c */
        public final T f36088c;

        /* JADX INFO: renamed from: d */
        public fdg f36089d;

        /* JADX INFO: renamed from: e */
        public long f36090e;

        /* JADX INFO: renamed from: f */
        public boolean f36091f;

        public C5718a(inf<? super T> infVar, long j, T t) {
            this.f36086a = infVar;
            this.f36087b = j;
            this.f36088c = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f36089d.cancel();
            this.f36089d = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f36089d == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f36089d = mdg.CANCELLED;
            if (this.f36091f) {
                return;
            }
            this.f36091f = true;
            T t = this.f36088c;
            if (t != null) {
                this.f36086a.onSuccess(t);
            } else {
                this.f36086a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f36091f) {
                pfe.onError(th);
                return;
            }
            this.f36091f = true;
            this.f36089d = mdg.CANCELLED;
            this.f36086a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f36091f) {
                return;
            }
            long j = this.f36090e;
            if (j != this.f36087b) {
                this.f36090e = j + 1;
                return;
            }
            this.f36091f = true;
            this.f36089d.cancel();
            this.f36089d = mdg.CANCELLED;
            this.f36086a.onSuccess(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f36089d, fdgVar)) {
                this.f36089d = fdgVar;
                this.f36086a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public fc6(m86<T> m86Var, long j, T t) {
        this.f36083a = m86Var;
        this.f36084b = j;
        this.f36085c = t;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new ac6(this.f36083a, this.f36084b, this.f36085c, true));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f36083a.subscribe((lj6) new C5718a(infVar, this.f36084b, this.f36085c));
    }
}
