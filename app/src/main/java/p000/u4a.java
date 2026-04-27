package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class u4a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<? extends T>[] f86811a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends aaa<? extends T>> f86812b;

    /* JADX INFO: renamed from: u4a$a */
    public static final class C13358a<T> implements l9a<T> {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f86813a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f86814b;

        /* JADX INFO: renamed from: c */
        public final nm2 f86815c;

        /* JADX INFO: renamed from: d */
        public mf4 f86816d;

        public C13358a(l9a<? super T> l9aVar, nm2 nm2Var, AtomicBoolean atomicBoolean) {
            this.f86813a = l9aVar;
            this.f86815c = nm2Var;
            this.f86814b = atomicBoolean;
        }

        @Override // p000.l9a
        public void onComplete() {
            if (this.f86814b.compareAndSet(false, true)) {
                this.f86815c.delete(this.f86816d);
                this.f86815c.dispose();
                this.f86813a.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            if (!this.f86814b.compareAndSet(false, true)) {
                pfe.onError(th);
                return;
            }
            this.f86815c.delete(this.f86816d);
            this.f86815c.dispose();
            this.f86813a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f86816d = mf4Var;
            this.f86815c.add(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            if (this.f86814b.compareAndSet(false, true)) {
                this.f86815c.delete(this.f86816d);
                this.f86815c.dispose();
                this.f86813a.onSuccess(t);
            }
        }
    }

    public u4a(aaa<? extends T>[] aaaVarArr, Iterable<? extends aaa<? extends T>> iterable) {
        this.f86811a = aaaVarArr;
        this.f86812b = iterable;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        int length;
        aaa<? extends T>[] aaaVarArr = this.f86811a;
        if (aaaVarArr == null) {
            aaaVarArr = new aaa[8];
            try {
                length = 0;
                for (aaa<? extends T> aaaVar : this.f86812b) {
                    if (aaaVar == null) {
                        c05.error(new NullPointerException("One of the sources is null"), l9aVar);
                        return;
                    }
                    if (length == aaaVarArr.length) {
                        aaa<? extends T>[] aaaVarArr2 = new aaa[(length >> 2) + length];
                        System.arraycopy(aaaVarArr, 0, aaaVarArr2, 0, length);
                        aaaVarArr = aaaVarArr2;
                    }
                    int i = length + 1;
                    aaaVarArr[length] = aaaVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, l9aVar);
                return;
            }
        } else {
            length = aaaVarArr.length;
        }
        nm2 nm2Var = new nm2();
        l9aVar.onSubscribe(nm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            aaa<? extends T> aaaVar2 = aaaVarArr[i2];
            if (nm2Var.isDisposed()) {
                return;
            }
            if (aaaVar2 == null) {
                nm2Var.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    l9aVar.onError(nullPointerException);
                    return;
                } else {
                    pfe.onError(nullPointerException);
                    return;
                }
            }
            aaaVar2.subscribe(new C13358a(l9aVar, nm2Var, atomicBoolean));
        }
        if (length == 0) {
            l9aVar.onComplete();
        }
    }
}
