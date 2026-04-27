package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class mjf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T>[] f61180a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends pof<? extends T>> f61181b;

    /* JADX INFO: renamed from: mjf$a */
    public static final class C9372a<T> implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final nm2 f61182a;

        /* JADX INFO: renamed from: b */
        public final inf<? super T> f61183b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f61184c;

        /* JADX INFO: renamed from: d */
        public mf4 f61185d;

        public C9372a(inf<? super T> infVar, nm2 nm2Var, AtomicBoolean atomicBoolean) {
            this.f61183b = infVar;
            this.f61182a = nm2Var;
            this.f61184c = atomicBoolean;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            if (!this.f61184c.compareAndSet(false, true)) {
                pfe.onError(th);
                return;
            }
            this.f61182a.delete(this.f61185d);
            this.f61182a.dispose();
            this.f61183b.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f61185d = mf4Var;
            this.f61182a.add(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            if (this.f61184c.compareAndSet(false, true)) {
                this.f61182a.delete(this.f61185d);
                this.f61182a.dispose();
                this.f61183b.onSuccess(t);
            }
        }
    }

    public mjf(pof<? extends T>[] pofVarArr, Iterable<? extends pof<? extends T>> iterable) {
        this.f61180a = pofVarArr;
        this.f61181b = iterable;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        int length;
        pof<? extends T>[] pofVarArr = this.f61180a;
        if (pofVarArr == null) {
            pofVarArr = new pof[8];
            try {
                length = 0;
                for (pof<? extends T> pofVar : this.f61181b) {
                    if (pofVar == null) {
                        c05.error(new NullPointerException("One of the sources is null"), infVar);
                        return;
                    }
                    if (length == pofVarArr.length) {
                        pof<? extends T>[] pofVarArr2 = new pof[(length >> 2) + length];
                        System.arraycopy(pofVarArr, 0, pofVarArr2, 0, length);
                        pofVarArr = pofVarArr2;
                    }
                    int i = length + 1;
                    pofVarArr[length] = pofVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, infVar);
                return;
            }
        } else {
            length = pofVarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        nm2 nm2Var = new nm2();
        infVar.onSubscribe(nm2Var);
        for (int i2 = 0; i2 < length; i2++) {
            pof<? extends T> pofVar2 = pofVarArr[i2];
            if (nm2Var.isDisposed()) {
                return;
            }
            if (pofVar2 == null) {
                nm2Var.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    infVar.onError(nullPointerException);
                    return;
                } else {
                    pfe.onError(nullPointerException);
                    return;
                }
            }
            pofVar2.subscribe(new C9372a(infVar, nm2Var, atomicBoolean));
        }
    }
}
