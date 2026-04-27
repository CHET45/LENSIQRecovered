package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kg6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super Throwable, ? extends T> f54010c;

    /* JADX INFO: renamed from: kg6$a */
    public static final class C8357a<T> extends vnf<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* JADX INFO: renamed from: m */
        public final py6<? super Throwable, ? extends T> f54011m;

        public C8357a(ycg<? super T> ycgVar, py6<? super Throwable, ? extends T> py6Var) {
            super(ycgVar);
            this.f54011m = py6Var;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f91810a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            try {
                m24079a(xjb.requireNonNull(this.f54011m.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f91810a.onError(new pm2(th, th2));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f91813d++;
            this.f91810a.onNext((Object) t);
        }
    }

    public kg6(m86<T> m86Var, py6<? super Throwable, ? extends T> py6Var) {
        super(m86Var);
        this.f54010c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C8357a(ycgVar, this.f54010c));
    }
}
