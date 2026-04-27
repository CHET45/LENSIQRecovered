package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kb6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends kgb<R>> f53528c;

    /* JADX INFO: renamed from: kb6$a */
    public static final class C8276a<T, R> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f53529a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends kgb<R>> f53530b;

        /* JADX INFO: renamed from: c */
        public boolean f53531c;

        /* JADX INFO: renamed from: d */
        public fdg f53532d;

        public C8276a(ycg<? super R> ycgVar, py6<? super T, ? extends kgb<R>> py6Var) {
            this.f53529a = ycgVar;
            this.f53530b = py6Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f53532d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f53531c) {
                return;
            }
            this.f53531c = true;
            this.f53529a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f53531c) {
                pfe.onError(th);
            } else {
                this.f53531c = true;
                this.f53529a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f53531c) {
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
                kgb kgbVar2 = (kgb) xjb.requireNonNull(this.f53530b.apply(t), "The selector returned a null Notification");
                if (kgbVar2.isOnError()) {
                    this.f53532d.cancel();
                    onError(kgbVar2.getError());
                } else if (!kgbVar2.isOnComplete()) {
                    this.f53529a.onNext((Object) kgbVar2.getValue());
                } else {
                    this.f53532d.cancel();
                    onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f53532d.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f53532d, fdgVar)) {
                this.f53532d = fdgVar;
                this.f53529a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f53532d.request(j);
        }
    }

    public kb6(m86<T> m86Var, py6<? super T, ? extends kgb<R>> py6Var) {
        super(m86Var);
        this.f53528c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f52360b.subscribe((lj6) new C8276a(ycgVar, this.f53528c));
    }
}
