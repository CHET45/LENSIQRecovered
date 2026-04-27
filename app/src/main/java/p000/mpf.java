package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.ymf;

/* JADX INFO: loaded from: classes7.dex */
public final class mpf<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T>[] f61714a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Object[], ? extends R> f61715b;

    /* JADX INFO: renamed from: mpf$a */
    public final class C9464a implements py6<T, R> {
        public C9464a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(mpf.this.f61715b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* JADX INFO: renamed from: mpf$b */
    public static final class C9465b<T, R> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f61717a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], ? extends R> f61718b;

        /* JADX INFO: renamed from: c */
        public final C9466c<T>[] f61719c;

        /* JADX INFO: renamed from: d */
        public final Object[] f61720d;

        public C9465b(inf<? super R> infVar, int i, py6<? super Object[], ? extends R> py6Var) {
            super(i);
            this.f61717a = infVar;
            this.f61718b = py6Var;
            C9466c<T>[] c9466cArr = new C9466c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c9466cArr[i2] = new C9466c<>(this, i2);
            }
            this.f61719c = c9466cArr;
            this.f61720d = new Object[i];
        }

        /* JADX INFO: renamed from: a */
        public void m17505a(int i) {
            C9466c<T>[] c9466cArr = this.f61719c;
            int length = c9466cArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c9466cArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    c9466cArr[i].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17506b(Throwable th, int i) {
            if (getAndSet(0) <= 0) {
                pfe.onError(th);
            } else {
                m17505a(i);
                this.f61717a.onError(th);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m17507c(T t, int i) {
            this.f61720d[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f61717a.onSuccess(xjb.requireNonNull(this.f61718b.apply(this.f61720d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f61717a.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C9466c<T> c9466c : this.f61719c) {
                    c9466c.dispose();
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* JADX INFO: renamed from: mpf$c */
    public static final class C9466c<T> extends AtomicReference<mf4> implements inf<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: a */
        public final C9465b<T, ?> f61721a;

        /* JADX INFO: renamed from: b */
        public final int f61722b;

        public C9466c(C9465b<T, ?> c9465b, int i) {
            this.f61721a = c9465b;
            this.f61722b = i;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f61721a.m17506b(th, this.f61722b);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f61721a.m17507c(t, this.f61722b);
        }
    }

    public mpf(pof<? extends T>[] pofVarArr, py6<? super Object[], ? extends R> py6Var) {
        this.f61714a = pofVarArr;
        this.f61715b = py6Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        pof<? extends T>[] pofVarArr = this.f61714a;
        int length = pofVarArr.length;
        if (length == 1) {
            pofVarArr[0].subscribe(new ymf.C15721a(infVar, new C9464a()));
            return;
        }
        C9465b c9465b = new C9465b(infVar, length, this.f61715b);
        infVar.onSubscribe(c9465b);
        for (int i = 0; i < length && !c9465b.isDisposed(); i++) {
            pof<? extends T> pofVar = pofVarArr[i];
            if (pofVar == null) {
                c9465b.m17506b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            pofVar.subscribe(c9465b.f61719c[i]);
        }
    }
}
