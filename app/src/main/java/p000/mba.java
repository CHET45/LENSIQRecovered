package p000;

import java.util.Arrays;
import p000.kba;
import p000.z8a;

/* JADX INFO: loaded from: classes7.dex */
public final class mba<T, R> extends s4a<R> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends aaa<? extends T>> f60473a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Object[], ? extends R> f60474b;

    /* JADX INFO: renamed from: mba$a */
    public final class C9255a implements py6<T, R> {
        public C9255a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(mba.this.f60474b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public mba(Iterable<? extends aaa<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        this.f60473a = iterable;
        this.f60474b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        aaa[] aaaVarArr = new aaa[8];
        try {
            int i = 0;
            for (aaa<? extends T> aaaVar : this.f60473a) {
                if (aaaVar == null) {
                    c05.error(new NullPointerException("One of the sources is null"), l9aVar);
                    return;
                }
                if (i == aaaVarArr.length) {
                    aaaVarArr = (aaa[]) Arrays.copyOf(aaaVarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                aaaVarArr[i] = aaaVar;
                i = i2;
            }
            if (i == 0) {
                c05.complete(l9aVar);
                return;
            }
            if (i == 1) {
                aaaVarArr[0].subscribe(new z8a.C16032a(l9aVar, new C9255a()));
                return;
            }
            kba.C8279b c8279b = new kba.C8279b(l9aVar, i, this.f60474b);
            l9aVar.onSubscribe(c8279b);
            for (int i3 = 0; i3 < i && !c8279b.isDisposed(); i3++) {
                aaaVarArr[i3].subscribe(c8279b.f53546c[i3]);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, l9aVar);
        }
    }
}
