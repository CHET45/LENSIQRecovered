package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class fi2<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final qh2 f36617a;

    /* JADX INFO: renamed from: b */
    public final Callable<? extends T> f36618b;

    /* JADX INFO: renamed from: c */
    public final T f36619c;

    /* JADX INFO: renamed from: fi2$a */
    public final class C5812a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f36620a;

        public C5812a(inf<? super T> infVar) {
            this.f36620a = infVar;
        }

        @Override // p000.dh2
        public void onComplete() {
            T tCall;
            fi2 fi2Var = fi2.this;
            Callable<? extends T> callable = fi2Var.f36618b;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f36620a.onError(th);
                    return;
                }
            } else {
                tCall = fi2Var.f36619c;
            }
            if (tCall == null) {
                this.f36620a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f36620a.onSuccess(tCall);
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f36620a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f36620a.onSubscribe(mf4Var);
        }
    }

    public fi2(qh2 qh2Var, Callable<? extends T> callable, T t) {
        this.f36617a = qh2Var;
        this.f36619c = t;
        this.f36618b = callable;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f36617a.subscribe(new C5812a(infVar));
    }
}
