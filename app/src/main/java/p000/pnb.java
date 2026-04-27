package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pnb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends kgb<R>> f71493b;

    /* JADX INFO: renamed from: pnb$a */
    public static final class C11040a<T, R> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f71494a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends kgb<R>> f71495b;

        /* JADX INFO: renamed from: c */
        public boolean f71496c;

        /* JADX INFO: renamed from: d */
        public mf4 f71497d;

        public C11040a(oxb<? super R> oxbVar, py6<? super T, ? extends kgb<R>> py6Var) {
            this.f71494a = oxbVar;
            this.f71495b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f71497d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f71497d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f71496c) {
                return;
            }
            this.f71496c = true;
            this.f71494a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f71496c) {
                pfe.onError(th);
            } else {
                this.f71496c = true;
                this.f71494a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f71496c) {
                if (t instanceof kgb) {
                    kgb kgbVar = (kgb) t;
                    if (kgbVar.isOnError()) {
                        pfe.onError(kgbVar.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                kgb kgbVar2 = (kgb) xjb.requireNonNull(this.f71495b.apply(t), "The selector returned a null Notification");
                if (kgbVar2.isOnError()) {
                    this.f71497d.dispose();
                    onError(kgbVar2.getError());
                } else if (!kgbVar2.isOnComplete()) {
                    this.f71494a.onNext((Object) kgbVar2.getValue());
                } else {
                    this.f71497d.dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f71497d.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f71497d, mf4Var)) {
                this.f71497d = mf4Var;
                this.f71494a.onSubscribe(this);
            }
        }
    }

    public pnb(xub<T> xubVar, py6<? super T, ? extends kgb<R>> py6Var) {
        super(xubVar);
        this.f71493b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f66354a.subscribe(new C11040a(oxbVar, this.f71493b));
    }
}
