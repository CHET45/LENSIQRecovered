package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class m96<T, U> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final Callable<? extends U> f60263c;

    /* JADX INFO: renamed from: d */
    public final f11<? super U, ? super T> f60264d;

    /* JADX INFO: renamed from: m96$a */
    public static final class C9223a<T, U> extends k34<U> implements lj6<T> {
        private static final long serialVersionUID = -3589550218733891694L;

        /* JADX INFO: renamed from: L */
        public final f11<? super U, ? super T> f60265L;

        /* JADX INFO: renamed from: M */
        public final U f60266M;

        /* JADX INFO: renamed from: N */
        public fdg f60267N;

        /* JADX INFO: renamed from: Q */
        public boolean f60268Q;

        public C9223a(ycg<? super U> ycgVar, U u, f11<? super U, ? super T> f11Var) {
            super(ycgVar);
            this.f60265L = f11Var;
            this.f60266M = u;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f60267N.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f60268Q) {
                return;
            }
            this.f60268Q = true;
            complete(this.f60266M);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f60268Q) {
                pfe.onError(th);
            } else {
                this.f60268Q = true;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f60268Q) {
                return;
            }
            try {
                this.f60265L.accept(this.f60266M, t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f60267N.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f60267N, fdgVar)) {
                this.f60267N = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public m96(m86<T> m86Var, Callable<? extends U> callable, f11<? super U, ? super T> f11Var) {
        super(m86Var);
        this.f60263c = callable;
        this.f60264d = f11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        try {
            this.f52360b.subscribe((lj6) new C9223a(ycgVar, xjb.requireNonNull(this.f60263c.call(), "The initial value supplied is null"), this.f60264d));
        } catch (Throwable th) {
            x05.error(th, ycgVar);
        }
    }
}
