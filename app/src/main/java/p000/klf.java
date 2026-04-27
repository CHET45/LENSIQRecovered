package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class klf<T> extends ljf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f54665a;

    /* JADX INFO: renamed from: b */
    public final pof<? extends T> f54666b;

    /* JADX INFO: renamed from: klf$a */
    public static class C8448a<T> implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final int f54667a;

        /* JADX INFO: renamed from: b */
        public final nm2 f54668b;

        /* JADX INFO: renamed from: c */
        public final Object[] f54669c;

        /* JADX INFO: renamed from: d */
        public final inf<? super Boolean> f54670d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f54671e;

        public C8448a(int i, nm2 nm2Var, Object[] objArr, inf<? super Boolean> infVar, AtomicInteger atomicInteger) {
            this.f54667a = i;
            this.f54668b = nm2Var;
            this.f54669c = objArr;
            this.f54670d = infVar;
            this.f54671e = atomicInteger;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            int i;
            do {
                i = this.f54671e.get();
                if (i >= 2) {
                    pfe.onError(th);
                    return;
                }
            } while (!this.f54671e.compareAndSet(i, 2));
            this.f54668b.dispose();
            this.f54670d.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f54668b.add(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f54669c[this.f54667a] = t;
            if (this.f54671e.incrementAndGet() == 2) {
                inf<? super Boolean> infVar = this.f54670d;
                Object[] objArr = this.f54669c;
                infVar.onSuccess(Boolean.valueOf(xjb.equals(objArr[0], objArr[1])));
            }
        }
    }

    public klf(pof<? extends T> pofVar, pof<? extends T> pofVar2) {
        this.f54665a = pofVar;
        this.f54666b = pofVar2;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        nm2 nm2Var = new nm2();
        infVar.onSubscribe(nm2Var);
        this.f54665a.subscribe(new C8448a(0, nm2Var, objArr, infVar, atomicInteger));
        this.f54666b.subscribe(new C8448a(1, nm2Var, objArr, infVar, atomicInteger));
    }
}
