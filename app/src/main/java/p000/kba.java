package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.z8a;

/* JADX INFO: loaded from: classes7.dex */
public final class kba<T, R> extends s4a<R> {

    /* JADX INFO: renamed from: a */
    public final aaa<? extends T>[] f53541a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Object[], ? extends R> f53542b;

    /* JADX INFO: renamed from: kba$a */
    public final class C8278a implements py6<T, R> {
        public C8278a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(kba.this.f53542b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* JADX INFO: renamed from: kba$b */
    public static final class C8279b<T, R> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f53544a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], ? extends R> f53545b;

        /* JADX INFO: renamed from: c */
        public final C8280c<T>[] f53546c;

        /* JADX INFO: renamed from: d */
        public final Object[] f53547d;

        public C8279b(l9a<? super R> l9aVar, int i, py6<? super Object[], ? extends R> py6Var) {
            super(i);
            this.f53544a = l9aVar;
            this.f53545b = py6Var;
            C8280c<T>[] c8280cArr = new C8280c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c8280cArr[i2] = new C8280c<>(this, i2);
            }
            this.f53546c = c8280cArr;
            this.f53547d = new Object[i];
        }

        /* JADX INFO: renamed from: a */
        public void m14645a(int i) {
            C8280c<T>[] c8280cArr = this.f53546c;
            int length = c8280cArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c8280cArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    c8280cArr[i].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14646b(int i) {
            if (getAndSet(0) > 0) {
                m14645a(i);
                this.f53544a.onComplete();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m14647c(Throwable th, int i) {
            if (getAndSet(0) <= 0) {
                pfe.onError(th);
            } else {
                m14645a(i);
                this.f53544a.onError(th);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14648d(T t, int i) {
            this.f53547d[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f53544a.onSuccess(xjb.requireNonNull(this.f53545b.apply(this.f53547d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f53544a.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C8280c<T> c8280c : this.f53546c) {
                    c8280c.dispose();
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* JADX INFO: renamed from: kba$c */
    public static final class C8280c<T> extends AtomicReference<mf4> implements l9a<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: a */
        public final C8279b<T, ?> f53548a;

        /* JADX INFO: renamed from: b */
        public final int f53549b;

        public C8280c(C8279b<T, ?> c8279b, int i) {
            this.f53548a = c8279b;
            this.f53549b = i;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f53548a.m14646b(this.f53549b);
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f53548a.m14647c(th, this.f53549b);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f53548a.m14648d(t, this.f53549b);
        }
    }

    public kba(aaa<? extends T>[] aaaVarArr, py6<? super Object[], ? extends R> py6Var) {
        this.f53541a = aaaVarArr;
        this.f53542b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        aaa<? extends T>[] aaaVarArr = this.f53541a;
        int length = aaaVarArr.length;
        if (length == 1) {
            aaaVarArr[0].subscribe(new z8a.C16032a(l9aVar, new C8278a()));
            return;
        }
        C8279b c8279b = new C8279b(l9aVar, length, this.f53542b);
        l9aVar.onSubscribe(c8279b);
        for (int i = 0; i < length && !c8279b.isDisposed(); i++) {
            aaa<? extends T> aaaVar = aaaVarArr[i];
            if (aaaVar == null) {
                c8279b.m14647c(new NullPointerException("One of the sources is null"), i);
                return;
            }
            aaaVar.subscribe(c8279b.f53546c[i]);
        }
    }
}
