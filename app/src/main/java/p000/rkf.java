package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class rkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f78587a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f78588b;

    /* JADX INFO: renamed from: rkf$a */
    public static final class C12139a<T> extends AtomicInteger implements inf<T>, mf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f78589a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f78590b;

        /* JADX INFO: renamed from: c */
        public mf4 f78591c;

        public C12139a(inf<? super T> infVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f78589a = infVar;
            this.f78590b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m21413a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f78590b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f78591c.dispose();
            m21413a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f78591c.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f78589a.onError(th);
            m21413a();
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f78591c, mf4Var)) {
                this.f78591c = mf4Var;
                this.f78589a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f78589a.onSuccess(t);
            m21413a();
        }
    }

    public rkf(pof<T> pofVar, InterfaceC7178i8 interfaceC7178i8) {
        this.f78587a = pofVar;
        this.f78588b = interfaceC7178i8;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f78587a.subscribe(new C12139a(infVar, this.f78588b));
    }
}
