package p000;

import java.util.Arrays;
import java.util.Objects;
import p000.a9a;
import p000.lba;

/* JADX INFO: loaded from: classes7.dex */
public final class nba<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends z9a<? extends T>> f63909a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Object[], ? extends R> f63910b;

    /* JADX INFO: renamed from: nba$a */
    public final class C9773a implements sy6<T, R> {
        public C9773a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = nba.this.f63910b.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public nba(Iterable<? extends z9a<? extends T>> sources, sy6<? super Object[], ? extends R> zipper) {
        this.f63909a = sources;
        this.f63910b = zipper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        z9a[] z9aVarArr = new z9a[8];
        try {
            int i = 0;
            for (z9a<? extends T> z9aVar : this.f63909a) {
                if (z9aVar == null) {
                    b05.error(new NullPointerException("One of the sources is null"), observer);
                    return;
                }
                if (i == z9aVarArr.length) {
                    z9aVarArr = (z9a[]) Arrays.copyOf(z9aVarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                z9aVarArr[i] = z9aVar;
                i = i2;
            }
            if (i == 0) {
                b05.complete(observer);
                return;
            }
            if (i == 1) {
                z9aVarArr[0].subscribe(new a9a.C0106a(observer, new C9773a()));
                return;
            }
            lba.C8759b c8759b = new lba.C8759b(observer, i, this.f63910b);
            observer.onSubscribe(c8759b);
            for (int i3 = 0; i3 < i && !c8759b.isDisposed(); i3++) {
                z9aVarArr[i3].subscribe(c8759b.f57068c[i3]);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
