package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class d6a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f28550b;

    /* JADX INFO: renamed from: d6a$a */
    public static final class C4634a<T> extends AtomicInteger implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f28551a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f28552b;

        /* JADX INFO: renamed from: c */
        public mf4 f28553c;

        public C4634a(l9a<? super T> l9aVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f28551a = l9aVar;
            this.f28552b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m8937a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f28552b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f28553c.dispose();
            m8937a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f28553c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f28551a.onComplete();
            m8937a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f28551a.onError(th);
            m8937a();
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f28553c, mf4Var)) {
                this.f28553c = mf4Var;
                this.f28551a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f28551a.onSuccess(t);
            m8937a();
        }
    }

    public d6a(aaa<T> aaaVar, InterfaceC7178i8 interfaceC7178i8) {
        super(aaaVar);
        this.f28550b = interfaceC7178i8;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C4634a(l9aVar, this.f28550b));
    }
}
