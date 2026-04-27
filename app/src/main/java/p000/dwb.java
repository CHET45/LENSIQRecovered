package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class dwb<T> extends AbstractC10162o3<T, i1h<T>> {

    /* JADX INFO: renamed from: b */
    public final voe f31202b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f31203c;

    /* JADX INFO: renamed from: dwb$a */
    public static final class C4990a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super i1h<T>> f31204a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f31205b;

        /* JADX INFO: renamed from: c */
        public final voe f31206c;

        /* JADX INFO: renamed from: d */
        public long f31207d;

        /* JADX INFO: renamed from: e */
        public mf4 f31208e;

        public C4990a(oxb<? super i1h<T>> oxbVar, TimeUnit timeUnit, voe voeVar) {
            this.f31204a = oxbVar;
            this.f31206c = voeVar;
            this.f31205b = timeUnit;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f31208e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f31208e.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f31204a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f31204a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long jNow = this.f31206c.now(this.f31205b);
            long j = this.f31207d;
            this.f31207d = jNow;
            this.f31204a.onNext(new i1h(t, jNow - j, this.f31205b));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f31208e, mf4Var)) {
                this.f31208e = mf4Var;
                this.f31207d = this.f31206c.now(this.f31205b);
                this.f31204a.onSubscribe(this);
            }
        }
    }

    public dwb(xub<T> xubVar, TimeUnit timeUnit, voe voeVar) {
        super(xubVar);
        this.f31202b = voeVar;
        this.f31203c = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super i1h<T>> oxbVar) {
        this.f66354a.subscribe(new C4990a(oxbVar, this.f31203c, this.f31202b));
    }
}
