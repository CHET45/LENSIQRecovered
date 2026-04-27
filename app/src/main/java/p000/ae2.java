package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ae2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2[] f1193a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends ph2> f1194b;

    /* JADX INFO: renamed from: ae2$a */
    public static final class C0190a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f1195a;

        /* JADX INFO: renamed from: b */
        public final mm2 f1196b;

        /* JADX INFO: renamed from: c */
        public final ch2 f1197c;

        /* JADX INFO: renamed from: d */
        public lf4 f1198d;

        public C0190a(AtomicBoolean once, mm2 set, ch2 observer) {
            this.f1195a = once;
            this.f1196b = set;
            this.f1197c = observer;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f1195a.compareAndSet(false, true)) {
                this.f1196b.delete(this.f1198d);
                this.f1196b.dispose();
                this.f1197c.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (!this.f1195a.compareAndSet(false, true)) {
                ofe.onError(e);
                return;
            }
            this.f1196b.delete(this.f1198d);
            this.f1196b.dispose();
            this.f1197c.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f1198d = d;
            this.f1196b.add(d);
        }
    }

    public ae2(ph2[] sources, Iterable<? extends ph2> sourcesIterable) {
        this.f1193a = sources;
        this.f1194b = sourcesIterable;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        int length;
        ph2[] ph2VarArr = this.f1193a;
        if (ph2VarArr == null) {
            ph2VarArr = new ph2[8];
            try {
                length = 0;
                for (ph2 ph2Var : this.f1194b) {
                    if (ph2Var == null) {
                        b05.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == ph2VarArr.length) {
                        ph2[] ph2VarArr2 = new ph2[(length >> 2) + length];
                        System.arraycopy(ph2VarArr, 0, ph2VarArr2, 0, length);
                        ph2VarArr = ph2VarArr2;
                    }
                    int i = length + 1;
                    ph2VarArr[length] = ph2Var;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
                return;
            }
        } else {
            length = ph2VarArr.length;
        }
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            ph2 ph2Var2 = ph2VarArr[i2];
            if (mm2Var.isDisposed()) {
                return;
            }
            if (ph2Var2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    ofe.onError(nullPointerException);
                    return;
                } else {
                    mm2Var.dispose();
                    observer.onError(nullPointerException);
                    return;
                }
            }
            ph2Var2.subscribe(new C0190a(atomicBoolean, mm2Var, observer));
        }
        if (length == 0) {
            observer.onComplete();
        }
    }
}
