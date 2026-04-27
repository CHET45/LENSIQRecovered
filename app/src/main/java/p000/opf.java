package p000;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p000.mpf;
import p000.ymf;

/* JADX INFO: loaded from: classes7.dex */
public final class opf<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends pof<? extends T>> f68280a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Object[], ? extends R> f68281b;

    /* JADX INFO: renamed from: opf$a */
    public final class C10495a implements py6<T, R> {
        public C10495a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(opf.this.f68281b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public opf(Iterable<? extends pof<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        this.f68280a = iterable;
        this.f68281b = py6Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        pof[] pofVarArr = new pof[8];
        try {
            int i = 0;
            for (pof<? extends T> pofVar : this.f68280a) {
                if (pofVar == null) {
                    c05.error(new NullPointerException("One of the sources is null"), infVar);
                    return;
                }
                if (i == pofVarArr.length) {
                    pofVarArr = (pof[]) Arrays.copyOf(pofVarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                pofVarArr[i] = pofVar;
                i = i2;
            }
            if (i == 0) {
                c05.error(new NoSuchElementException(), infVar);
                return;
            }
            if (i == 1) {
                pofVarArr[0].subscribe(new ymf.C15721a(infVar, new C10495a()));
                return;
            }
            mpf.C9465b c9465b = new mpf.C9465b(infVar, i, this.f68281b);
            infVar.onSubscribe(c9465b);
            for (int i3 = 0; i3 < i && !c9465b.isDisposed(); i3++) {
                pofVarArr[i3].subscribe(c9465b.f61719c[i3]);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }
}
