package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class njf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T>[] f64768a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends oof<? extends T>> f64769b;

    /* JADX INFO: renamed from: njf$a */
    public static final class C9908a<T> implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final mm2 f64770a;

        /* JADX INFO: renamed from: b */
        public final hnf<? super T> f64771b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f64772c;

        /* JADX INFO: renamed from: d */
        public lf4 f64773d;

        public C9908a(hnf<? super T> observer, mm2 set, AtomicBoolean winner) {
            this.f64771b = observer;
            this.f64770a = set;
            this.f64772c = winner;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            if (!this.f64772c.compareAndSet(false, true)) {
                ofe.onError(e);
                return;
            }
            this.f64770a.delete(this.f64773d);
            this.f64770a.dispose();
            this.f64771b.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f64773d = d;
            this.f64770a.add(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            if (this.f64772c.compareAndSet(false, true)) {
                this.f64770a.delete(this.f64773d);
                this.f64770a.dispose();
                this.f64771b.onSuccess(value);
            }
        }
    }

    public njf(oof<? extends T>[] sources, Iterable<? extends oof<? extends T>> sourcesIterable) {
        this.f64768a = sources;
        this.f64769b = sourcesIterable;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        int length;
        oof<? extends T>[] oofVarArr = this.f64768a;
        if (oofVarArr == null) {
            oofVarArr = new oof[8];
            try {
                length = 0;
                for (oof<? extends T> oofVar : this.f64769b) {
                    if (oofVar == null) {
                        b05.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == oofVarArr.length) {
                        oof<? extends T>[] oofVarArr2 = new oof[(length >> 2) + length];
                        System.arraycopy(oofVarArr, 0, oofVarArr2, 0, length);
                        oofVarArr = oofVarArr2;
                    }
                    int i = length + 1;
                    oofVarArr[length] = oofVar;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
                return;
            }
        } else {
            length = oofVarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        for (int i2 = 0; i2 < length; i2++) {
            oof<? extends T> oofVar2 = oofVarArr[i2];
            if (mm2Var.isDisposed()) {
                return;
            }
            if (oofVar2 == null) {
                mm2Var.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    observer.onError(nullPointerException);
                    return;
                } else {
                    ofe.onError(nullPointerException);
                    return;
                }
            }
            oofVar2.subscribe(new C9908a(observer, mm2Var, atomicBoolean));
        }
    }
}
