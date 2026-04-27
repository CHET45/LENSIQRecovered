package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class jf6<T> extends AbstractC8162k1<T, kgb<T>> {

    /* JADX INFO: renamed from: jf6$a */
    public static final class C7891a<T> extends vnf<T, kgb<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        public C7891a(ycg<? super kgb<T>> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.vnf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo14073b(kgb<T> kgbVar) {
            if (kgbVar.isOnError()) {
                pfe.onError(kgbVar.getError());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            m24079a(kgb.createOnComplete());
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            m24079a(kgb.createOnError(th));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f91813d++;
            this.f91810a.onNext(kgb.createOnNext(t));
        }
    }

    public jf6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super kgb<T>> ycgVar) {
        this.f52360b.subscribe((lj6) new C7891a(ycgVar));
    }
}
