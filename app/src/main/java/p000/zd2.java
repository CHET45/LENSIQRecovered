package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class zd2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2[] f104817a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends qh2> f104818b;

    /* JADX INFO: renamed from: zd2$a */
    public static final class C16092a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f104819a;

        /* JADX INFO: renamed from: b */
        public final nm2 f104820b;

        /* JADX INFO: renamed from: c */
        public final dh2 f104821c;

        /* JADX INFO: renamed from: d */
        public mf4 f104822d;

        public C16092a(AtomicBoolean atomicBoolean, nm2 nm2Var, dh2 dh2Var) {
            this.f104819a = atomicBoolean;
            this.f104820b = nm2Var;
            this.f104821c = dh2Var;
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f104819a.compareAndSet(false, true)) {
                this.f104820b.delete(this.f104822d);
                this.f104820b.dispose();
                this.f104821c.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (!this.f104819a.compareAndSet(false, true)) {
                pfe.onError(th);
                return;
            }
            this.f104820b.delete(this.f104822d);
            this.f104820b.dispose();
            this.f104821c.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f104822d = mf4Var;
            this.f104820b.add(mf4Var);
        }
    }

    public zd2(qh2[] qh2VarArr, Iterable<? extends qh2> iterable) {
        this.f104817a = qh2VarArr;
        this.f104818b = iterable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        int length;
        qh2[] qh2VarArr = this.f104817a;
        if (qh2VarArr == null) {
            qh2VarArr = new qh2[8];
            try {
                length = 0;
                for (qh2 qh2Var : this.f104818b) {
                    if (qh2Var == null) {
                        c05.error(new NullPointerException("One of the sources is null"), dh2Var);
                        return;
                    }
                    if (length == qh2VarArr.length) {
                        qh2[] qh2VarArr2 = new qh2[(length >> 2) + length];
                        System.arraycopy(qh2VarArr, 0, qh2VarArr2, 0, length);
                        qh2VarArr = qh2VarArr2;
                    }
                    int i = length + 1;
                    qh2VarArr[length] = qh2Var;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, dh2Var);
                return;
            }
        } else {
            length = qh2VarArr.length;
        }
        nm2 nm2Var = new nm2();
        dh2Var.onSubscribe(nm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            qh2 qh2Var2 = qh2VarArr[i2];
            if (nm2Var.isDisposed()) {
                return;
            }
            if (qh2Var2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    pfe.onError(nullPointerException);
                    return;
                } else {
                    nm2Var.dispose();
                    dh2Var.onError(nullPointerException);
                    return;
                }
            }
            qh2Var2.subscribe(new C16092a(atomicBoolean, nm2Var, dh2Var));
        }
        if (length == 0) {
            dh2Var.onComplete();
        }
    }
}
