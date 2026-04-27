package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class u5a<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f86841b;

    /* JADX INFO: renamed from: u5a$a */
    public static final class C13370a<T> extends AtomicReference<mf4> implements l9a<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f86842a;

        public C13370a(l9a<? super T> l9aVar) {
            this.f86842a = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f86842a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f86842a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f86842a.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: u5a$b */
    public static final class C13371b<T> implements lj6<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final C13370a<T> f86843a;

        /* JADX INFO: renamed from: b */
        public aaa<T> f86844b;

        /* JADX INFO: renamed from: c */
        public fdg f86845c;

        public C13371b(l9a<? super T> l9aVar, aaa<T> aaaVar) {
            this.f86843a = new C13370a<>(l9aVar);
            this.f86844b = aaaVar;
        }

        /* JADX INFO: renamed from: a */
        public void m23100a() {
            aaa<T> aaaVar = this.f86844b;
            this.f86844b = null;
            aaaVar.subscribe(this.f86843a);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f86845c.cancel();
            this.f86845c = mdg.CANCELLED;
            ag4.dispose(this.f86843a);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f86843a.get());
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = this.f86845c;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                this.f86845c = mdgVar;
                m23100a();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            fdg fdgVar = this.f86845c;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar == mdgVar) {
                pfe.onError(th);
            } else {
                this.f86845c = mdgVar;
                this.f86843a.f86842a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            fdg fdgVar = this.f86845c;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                fdgVar.cancel();
                this.f86845c = mdgVar;
                m23100a();
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f86845c, fdgVar)) {
                this.f86845c = fdgVar;
                this.f86843a.f86842a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public u5a(aaa<T> aaaVar, zjd<U> zjdVar) {
        super(aaaVar);
        this.f86841b = zjdVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f86841b.subscribe(new C13371b(l9aVar, this.f103681a));
    }
}
