package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.zmf;

/* JADX INFO: loaded from: classes7.dex */
public final class npf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T>[] f65222a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Object[], ? extends R> f65223b;

    /* JADX INFO: renamed from: npf$a */
    public final class C9976a implements sy6<T, R> {
        public C9976a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = npf.this.f65223b.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    /* JADX INFO: renamed from: npf$b */
    public static final class C9977b<T, R> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f65225a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], ? extends R> f65226b;

        /* JADX INFO: renamed from: c */
        public final C9978c<T>[] f65227c;

        /* JADX INFO: renamed from: d */
        public Object[] f65228d;

        public C9977b(hnf<? super R> observer, int n, sy6<? super Object[], ? extends R> zipper) {
            super(n);
            this.f65225a = observer;
            this.f65226b = zipper;
            C9978c<T>[] c9978cArr = new C9978c[n];
            for (int i = 0; i < n; i++) {
                c9978cArr[i] = new C9978c<>(this, i);
            }
            this.f65227c = c9978cArr;
            this.f65228d = new Object[n];
        }

        /* JADX INFO: renamed from: a */
        public void m18058a(int index) {
            C9978c<T>[] c9978cArr = this.f65227c;
            int length = c9978cArr.length;
            for (int i = 0; i < index; i++) {
                c9978cArr[i].dispose();
            }
            while (true) {
                index++;
                if (index >= length) {
                    return;
                } else {
                    c9978cArr[index].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18059b(Throwable ex, int index) {
            if (getAndSet(0) <= 0) {
                ofe.onError(ex);
                return;
            }
            m18058a(index);
            this.f65228d = null;
            this.f65225a.onError(ex);
        }

        /* JADX INFO: renamed from: c */
        public void m18060c(T value, int index) {
            Object[] objArr = this.f65228d;
            if (objArr != null) {
                objArr[index] = value;
            }
            if (decrementAndGet() == 0) {
                try {
                    R rApply = this.f65226b.apply(objArr);
                    Objects.requireNonNull(rApply, "The zipper returned a null value");
                    this.f65228d = null;
                    this.f65225a.onSuccess(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f65228d = null;
                    this.f65225a.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C9978c<T> c9978c : this.f65227c) {
                    c9978c.dispose();
                }
                this.f65228d = null;
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* JADX INFO: renamed from: npf$c */
    public static final class C9978c<T> extends AtomicReference<lf4> implements hnf<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: a */
        public final C9977b<T, ?> f65229a;

        /* JADX INFO: renamed from: b */
        public final int f65230b;

        public C9978c(C9977b<T, ?> parent, int index) {
            this.f65229a = parent;
            this.f65230b = index;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f65229a.m18059b(e, this.f65230b);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f65229a.m18060c(value, this.f65230b);
        }
    }

    public npf(oof<? extends T>[] sources, sy6<? super Object[], ? extends R> zipper) {
        this.f65222a = sources;
        this.f65223b = zipper;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        oof<? extends T>[] oofVarArr = this.f65222a;
        int length = oofVarArr.length;
        if (length == 1) {
            oofVarArr[0].subscribe(new zmf.C16188a(observer, new C9976a()));
            return;
        }
        C9977b c9977b = new C9977b(observer, length, this.f65223b);
        observer.onSubscribe(c9977b);
        for (int i = 0; i < length && !c9977b.isDisposed(); i++) {
            oof<? extends T> oofVar = oofVarArr[i];
            if (oofVar == null) {
                c9977b.m18059b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            oofVar.subscribe(c9977b.f65227c[i]);
        }
    }
}
