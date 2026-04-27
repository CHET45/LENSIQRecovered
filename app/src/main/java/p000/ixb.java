package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ixb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    @cib
    public final xub<?>[] f48813b;

    /* JADX INFO: renamed from: c */
    @cib
    public final Iterable<? extends xub<?>> f48814c;

    /* JADX INFO: renamed from: d */
    @bfb
    public final py6<? super Object[], R> f48815d;

    /* JADX INFO: renamed from: ixb$a */
    public final class C7655a implements py6<T, R> {
        public C7655a() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return (R) xjb.requireNonNull(ixb.this.f48815d.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    /* JADX INFO: renamed from: ixb$b */
    public static final class C7656b<T, R> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f48817a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], R> f48818b;

        /* JADX INFO: renamed from: c */
        public final C7657c[] f48819c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceArray<Object> f48820d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<mf4> f48821e;

        /* JADX INFO: renamed from: f */
        public final cc0 f48822f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f48823m;

        public C7656b(oxb<? super R> oxbVar, py6<? super Object[], R> py6Var, int i) {
            this.f48817a = oxbVar;
            this.f48818b = py6Var;
            C7657c[] c7657cArr = new C7657c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7657cArr[i2] = new C7657c(this, i2);
            }
            this.f48819c = c7657cArr;
            this.f48820d = new AtomicReferenceArray<>(i);
            this.f48821e = new AtomicReference<>();
            this.f48822f = new cc0();
        }

        /* JADX INFO: renamed from: a */
        public void m13524a(int i) {
            C7657c[] c7657cArr = this.f48819c;
            for (int i2 = 0; i2 < c7657cArr.length; i2++) {
                if (i2 != i) {
                    c7657cArr[i2].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m13525b(int i, boolean z) {
            if (z) {
                return;
            }
            this.f48823m = true;
            m13524a(i);
            yd7.onComplete(this.f48817a, this, this.f48822f);
        }

        /* JADX INFO: renamed from: c */
        public void m13526c(int i, Throwable th) {
            this.f48823m = true;
            ag4.dispose(this.f48821e);
            m13524a(i);
            yd7.onError(this.f48817a, th, this, this.f48822f);
        }

        /* JADX INFO: renamed from: d */
        public void m13527d(int i, Object obj) {
            this.f48820d.set(i, obj);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f48821e);
            for (C7657c c7657c : this.f48819c) {
                c7657c.dispose();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m13528e(xub<?>[] xubVarArr, int i) {
            C7657c[] c7657cArr = this.f48819c;
            AtomicReference<mf4> atomicReference = this.f48821e;
            for (int i2 = 0; i2 < i && !ag4.isDisposed(atomicReference.get()) && !this.f48823m; i2++) {
                xubVarArr[i2].subscribe(c7657cArr[i2]);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f48821e.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f48823m) {
                return;
            }
            this.f48823m = true;
            m13524a(-1);
            yd7.onComplete(this.f48817a, this, this.f48822f);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f48823m) {
                pfe.onError(th);
                return;
            }
            this.f48823m = true;
            m13524a(-1);
            yd7.onError(this.f48817a, th, this, this.f48822f);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f48823m) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f48820d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                yd7.onNext(this.f48817a, xjb.requireNonNull(this.f48818b.apply(objArr), "combiner returned a null value"), this, this.f48822f);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f48821e, mf4Var);
        }
    }

    /* JADX INFO: renamed from: ixb$c */
    public static final class C7657c extends AtomicReference<mf4> implements oxb<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a */
        public final C7656b<?, ?> f48824a;

        /* JADX INFO: renamed from: b */
        public final int f48825b;

        /* JADX INFO: renamed from: c */
        public boolean f48826c;

        public C7657c(C7656b<?, ?> c7656b, int i) {
            this.f48824a = c7656b;
            this.f48825b = i;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f48824a.m13525b(this.f48825b, this.f48826c);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f48824a.m13526c(this.f48825b, th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            if (!this.f48826c) {
                this.f48826c = true;
            }
            this.f48824a.m13527d(this.f48825b, obj);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public ixb(@bfb xub<T> xubVar, @bfb xub<?>[] xubVarArr, @bfb py6<? super Object[], R> py6Var) {
        super(xubVar);
        this.f48813b = xubVarArr;
        this.f48814c = null;
        this.f48815d = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        int length;
        xub<?>[] xubVarArr = this.f48813b;
        if (xubVarArr == null) {
            xubVarArr = new xub[8];
            try {
                length = 0;
                for (xub<?> xubVar : this.f48814c) {
                    if (length == xubVarArr.length) {
                        xubVarArr = (xub[]) Arrays.copyOf(xubVarArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    xubVarArr[length] = xubVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, oxbVar);
                return;
            }
        } else {
            length = xubVarArr.length;
        }
        if (length == 0) {
            new grb(this.f66354a, new C7655a()).subscribeActual(oxbVar);
            return;
        }
        C7656b c7656b = new C7656b(oxbVar, this.f48815d, length);
        oxbVar.onSubscribe(c7656b);
        c7656b.m13528e(xubVarArr, length);
        this.f66354a.subscribe(c7656b);
    }

    public ixb(@bfb xub<T> xubVar, @bfb Iterable<? extends xub<?>> iterable, @bfb py6<? super Object[], R> py6Var) {
        super(xubVar);
        this.f48813b = null;
        this.f48814c = iterable;
        this.f48815d = py6Var;
    }
}
