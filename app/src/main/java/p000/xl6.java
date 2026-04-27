package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class xl6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    @cib
    public final zjd<?>[] f98403c;

    /* JADX INFO: renamed from: d */
    @cib
    public final Iterable<? extends zjd<?>> f98404d;

    /* JADX INFO: renamed from: e */
    public final py6<? super Object[], R> f98405e;

    /* JADX INFO: renamed from: xl6$a */
    public final class C15180a implements py6<T, R> {
        public C15180a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(xl6.this.f98405e.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    /* JADX INFO: renamed from: xl6$b */
    public static final class C15181b<T, R> extends AtomicInteger implements cq2<T>, fdg {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f98407C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f98408a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], R> f98409b;

        /* JADX INFO: renamed from: c */
        public final C15182c[] f98410c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceArray<Object> f98411d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<fdg> f98412e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f98413f;

        /* JADX INFO: renamed from: m */
        public final cc0 f98414m;

        public C15181b(ycg<? super R> ycgVar, py6<? super Object[], R> py6Var, int i) {
            this.f98408a = ycgVar;
            this.f98409b = py6Var;
            C15182c[] c15182cArr = new C15182c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c15182cArr[i2] = new C15182c(this, i2);
            }
            this.f98410c = c15182cArr;
            this.f98411d = new AtomicReferenceArray<>(i);
            this.f98412e = new AtomicReference<>();
            this.f98413f = new AtomicLong();
            this.f98414m = new cc0();
        }

        /* JADX INFO: renamed from: a */
        public void m25279a(int i) {
            C15182c[] c15182cArr = this.f98410c;
            for (int i2 = 0; i2 < c15182cArr.length; i2++) {
                if (i2 != i) {
                    c15182cArr[i2].m25284a();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25280b(int i, boolean z) {
            if (z) {
                return;
            }
            this.f98407C = true;
            mdg.cancel(this.f98412e);
            m25279a(i);
            yd7.onComplete(this.f98408a, this, this.f98414m);
        }

        /* JADX INFO: renamed from: c */
        public void m25281c(int i, Throwable th) {
            this.f98407C = true;
            mdg.cancel(this.f98412e);
            m25279a(i);
            yd7.onError(this.f98408a, th, this, this.f98414m);
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f98412e);
            for (C15182c c15182c : this.f98410c) {
                c15182c.m25284a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m25282d(int i, Object obj) {
            this.f98411d.set(i, obj);
        }

        /* JADX INFO: renamed from: e */
        public void m25283e(zjd<?>[] zjdVarArr, int i) {
            C15182c[] c15182cArr = this.f98410c;
            AtomicReference<fdg> atomicReference = this.f98412e;
            for (int i2 = 0; i2 < i && atomicReference.get() != mdg.CANCELLED; i2++) {
                zjdVarArr[i2].subscribe(c15182cArr[i2]);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f98407C) {
                return;
            }
            this.f98407C = true;
            m25279a(-1);
            yd7.onComplete(this.f98408a, this, this.f98414m);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f98407C) {
                pfe.onError(th);
                return;
            }
            this.f98407C = true;
            m25279a(-1);
            yd7.onError(this.f98408a, th, this, this.f98414m);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f98407C) {
                return;
            }
            this.f98412e.get().request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f98412e, this.f98413f, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f98412e, this.f98413f, j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (this.f98407C) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f98411d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t;
            int i = 0;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return false;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                yd7.onNext(this.f98408a, xjb.requireNonNull(this.f98409b.apply(objArr), "The combiner returned a null value"), this, this.f98414m);
                return true;
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: xl6$c */
    public static final class C15182c extends AtomicReference<fdg> implements lj6<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a */
        public final C15181b<?, ?> f98415a;

        /* JADX INFO: renamed from: b */
        public final int f98416b;

        /* JADX INFO: renamed from: c */
        public boolean f98417c;

        public C15182c(C15181b<?, ?> c15181b, int i) {
            this.f98415a = c15181b;
            this.f98416b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m25284a() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f98415a.m25280b(this.f98416b, this.f98417c);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f98415a.m25281c(this.f98416b, th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            if (!this.f98417c) {
                this.f98417c = true;
            }
            this.f98415a.m25282d(this.f98416b, obj);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public xl6(@bfb m86<T> m86Var, @bfb zjd<?>[] zjdVarArr, py6<? super Object[], R> py6Var) {
        super(m86Var);
        this.f98403c = zjdVarArr;
        this.f98404d = null;
        this.f98405e = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        int length;
        zjd<?>[] zjdVarArr = this.f98403c;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                length = 0;
                for (zjd<?> zjdVar : this.f98404d) {
                    if (length == zjdVarArr.length) {
                        zjdVarArr = (zjd[]) Arrays.copyOf(zjdVarArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    zjdVarArr[length] = zjdVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                x05.error(th, ycgVar);
                return;
            }
        } else {
            length = zjdVarArr.length;
        }
        if (length == 0) {
            new cf6(this.f52360b, new C15180a()).subscribeActual(ycgVar);
            return;
        }
        C15181b c15181b = new C15181b(ycgVar, this.f98405e, length);
        ycgVar.onSubscribe(c15181b);
        c15181b.m25283e(zjdVarArr, length);
        this.f52360b.subscribe((lj6) c15181b);
    }

    public xl6(@bfb m86<T> m86Var, @bfb Iterable<? extends zjd<?>> iterable, @bfb py6<? super Object[], R> py6Var) {
        super(m86Var);
        this.f98403c = null;
        this.f98404d = iterable;
        this.f98405e = py6Var;
    }
}
