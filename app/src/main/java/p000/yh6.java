package p000;

import p000.qh6;

/* JADX INFO: loaded from: classes7.dex */
public final class yh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super m86<Throwable>, ? extends zjd<?>> f101506c;

    /* JADX INFO: renamed from: yh6$a */
    public static final class C15665a<T> extends qh6.AbstractC11480c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public C15665a(ycg<? super T> ycgVar, rg6<Throwable> rg6Var, fdg fdgVar) {
            super(ycgVar, rg6Var, fdgVar);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f74458L.cancel();
            this.f74456F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            m20365c(th);
        }
    }

    public yh6(m86<T> m86Var, py6<? super m86<Throwable>, ? extends zjd<?>> py6Var) {
        super(m86Var);
        this.f101506c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        rg6<T> serialized = msh.create(8).toSerialized();
        try {
            zjd zjdVar = (zjd) xjb.requireNonNull(this.f101506c.apply(serialized), "handler returned a null Publisher");
            qh6.C11479b c11479b = new qh6.C11479b(this.f52360b);
            C15665a c15665a = new C15665a(t1fVar, serialized, c11479b);
            c11479b.f74455d = c15665a;
            ycgVar.onSubscribe(c15665a);
            zjdVar.subscribe(c11479b);
            c11479b.onNext(0);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
