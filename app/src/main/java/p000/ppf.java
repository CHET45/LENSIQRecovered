package p000;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.npf;
import p000.zmf;

/* JADX INFO: loaded from: classes7.dex */
public final class ppf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends oof<? extends T>> f71617a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Object[], ? extends R> f71618b;

    /* JADX INFO: renamed from: ppf$a */
    public final class C11068a implements sy6<T, R> {
        public C11068a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = ppf.this.f71618b.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public ppf(Iterable<? extends oof<? extends T>> sources, sy6<? super Object[], ? extends R> zipper) {
        this.f71617a = sources;
        this.f71618b = zipper;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        oof[] oofVarArr = new oof[8];
        try {
            int i = 0;
            for (oof<? extends T> oofVar : this.f71617a) {
                if (oofVar == null) {
                    b05.error(new NullPointerException("One of the sources is null"), observer);
                    return;
                }
                if (i == oofVarArr.length) {
                    oofVarArr = (oof[]) Arrays.copyOf(oofVarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                oofVarArr[i] = oofVar;
                i = i2;
            }
            if (i == 0) {
                b05.error(new NoSuchElementException(), observer);
                return;
            }
            if (i == 1) {
                oofVarArr[0].subscribe(new zmf.C16188a(observer, new C11068a()));
                return;
            }
            npf.C9977b c9977b = new npf.C9977b(observer, i, this.f71618b);
            observer.onSubscribe(c9977b);
            for (int i3 = 0; i3 < i && !c9977b.isDisposed(); i3++) {
                oofVarArr[i3].subscribe(c9977b.f65227c[i3]);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
