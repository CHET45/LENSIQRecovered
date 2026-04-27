package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f85140a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f85141b;

    /* JADX INFO: renamed from: tkf$a */
    public static final class C13086a<T> extends AtomicReference<InterfaceC7178i8> implements inf<T>, mf4 {
        private static final long serialVersionUID = -8583764624474935784L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f85142a;

        /* JADX INFO: renamed from: b */
        public mf4 f85143b;

        public C13086a(inf<? super T> infVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f85142a = infVar;
            lazySet(interfaceC7178i8);
        }

        @Override // p000.mf4
        public void dispose() {
            InterfaceC7178i8 andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
                this.f85143b.dispose();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f85143b.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f85142a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85143b, mf4Var)) {
                this.f85143b = mf4Var;
                this.f85142a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f85142a.onSuccess(t);
        }
    }

    public tkf(pof<T> pofVar, InterfaceC7178i8 interfaceC7178i8) {
        this.f85140a = pofVar;
        this.f85141b = interfaceC7178i8;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f85140a.subscribe(new C13086a(infVar, this.f85141b));
    }
}
