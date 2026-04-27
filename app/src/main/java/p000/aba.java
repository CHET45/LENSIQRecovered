package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class aba<T> extends ljf<T> implements ah7<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f949a;

    /* JADX INFO: renamed from: b */
    public final T f950b;

    /* JADX INFO: renamed from: aba$a */
    public static final class C0148a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f951a;

        /* JADX INFO: renamed from: b */
        public final T f952b;

        /* JADX INFO: renamed from: c */
        public mf4 f953c;

        public C0148a(inf<? super T> infVar, T t) {
            this.f951a = infVar;
            this.f952b = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f953c.dispose();
            this.f953c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f953c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f953c = ag4.DISPOSED;
            T t = this.f952b;
            if (t != null) {
                this.f951a.onSuccess(t);
            } else {
                this.f951a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f953c = ag4.DISPOSED;
            this.f951a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f953c, mf4Var)) {
                this.f953c = mf4Var;
                this.f951a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f953c = ag4.DISPOSED;
            this.f951a.onSuccess(t);
        }
    }

    public aba(aaa<T> aaaVar, T t) {
        this.f949a = aaaVar;
        this.f950b = t;
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f949a;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f949a.subscribe(new C0148a(infVar, this.f950b));
    }
}
