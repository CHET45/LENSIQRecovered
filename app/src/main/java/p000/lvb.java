package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f58889b;

    /* JADX INFO: renamed from: lvb$a */
    public static final class C8981a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f58890a;

        /* JADX INFO: renamed from: b */
        public boolean f58891b;

        /* JADX INFO: renamed from: c */
        public mf4 f58892c;

        /* JADX INFO: renamed from: d */
        public long f58893d;

        public C8981a(oxb<? super T> oxbVar, long j) {
            this.f58890a = oxbVar;
            this.f58893d = j;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f58892c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f58892c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f58891b) {
                return;
            }
            this.f58891b = true;
            this.f58892c.dispose();
            this.f58890a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f58891b) {
                pfe.onError(th);
                return;
            }
            this.f58891b = true;
            this.f58892c.dispose();
            this.f58890a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f58891b) {
                return;
            }
            long j = this.f58893d;
            long j2 = j - 1;
            this.f58893d = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f58890a.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f58892c, mf4Var)) {
                this.f58892c = mf4Var;
                if (this.f58893d != 0) {
                    this.f58890a.onSubscribe(this);
                    return;
                }
                this.f58891b = true;
                mf4Var.dispose();
                c05.complete(this.f58890a);
            }
        }
    }

    public lvb(xub<T> xubVar, long j) {
        super(xubVar);
        this.f58889b = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C8981a(oxbVar, this.f58889b));
    }
}
