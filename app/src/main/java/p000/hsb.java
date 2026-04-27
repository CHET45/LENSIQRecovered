package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hsb<T> extends pr2<T> implements ch7<T>, ksb<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f44717a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C6993b<T>> f44718b;

    /* JADX INFO: renamed from: c */
    public final xub<T> f44719c;

    /* JADX INFO: renamed from: hsb$a */
    public static final class C6992a<T> extends AtomicReference<Object> implements mf4 {
        private static final long serialVersionUID = -1100270633763673112L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f44720a;

        public C6992a(oxb<? super T> oxbVar) {
            this.f44720a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m12587a(C6993b<T> c6993b) {
            if (compareAndSet(null, c6993b)) {
                return;
            }
            c6993b.m12589b(this);
        }

        @Override // p000.mf4
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((C6993b) andSet).m12589b(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == this;
        }
    }

    /* JADX INFO: renamed from: hsb$b */
    public static final class C6993b<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: e */
        public static final C6992a[] f44721e = new C6992a[0];

        /* JADX INFO: renamed from: f */
        public static final C6992a[] f44722f = new C6992a[0];

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C6993b<T>> f44723a;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f44726d = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        public final AtomicReference<C6992a<T>[]> f44724b = new AtomicReference<>(f44721e);

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f44725c = new AtomicBoolean();

        public C6993b(AtomicReference<C6993b<T>> atomicReference) {
            this.f44723a = atomicReference;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12588a(C6992a<T> c6992a) {
            C6992a<T>[] c6992aArr;
            C6992a[] c6992aArr2;
            do {
                c6992aArr = this.f44724b.get();
                if (c6992aArr == f44722f) {
                    return false;
                }
                int length = c6992aArr.length;
                c6992aArr2 = new C6992a[length + 1];
                System.arraycopy(c6992aArr, 0, c6992aArr2, 0, length);
                c6992aArr2[length] = c6992a;
            } while (!v7b.m23844a(this.f44724b, c6992aArr, c6992aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m12589b(C6992a<T> c6992a) {
            C6992a<T>[] c6992aArr;
            C6992a[] c6992aArr2;
            do {
                c6992aArr = this.f44724b.get();
                int length = c6992aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c6992aArr[i].equals(c6992a)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c6992aArr2 = f44721e;
                } else {
                    C6992a[] c6992aArr3 = new C6992a[length - 1];
                    System.arraycopy(c6992aArr, 0, c6992aArr3, 0, i);
                    System.arraycopy(c6992aArr, i + 1, c6992aArr3, i, (length - i) - 1);
                    c6992aArr2 = c6992aArr3;
                }
            } while (!v7b.m23844a(this.f44724b, c6992aArr, c6992aArr2));
        }

        @Override // p000.mf4
        public void dispose() {
            AtomicReference<C6992a<T>[]> atomicReference = this.f44724b;
            C6992a<T>[] c6992aArr = f44722f;
            if (atomicReference.getAndSet(c6992aArr) != c6992aArr) {
                v7b.m23844a(this.f44723a, this, null);
                ag4.dispose(this.f44726d);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44724b.get() == f44722f;
        }

        @Override // p000.oxb
        public void onComplete() {
            v7b.m23844a(this.f44723a, this, null);
            for (C6992a<T> c6992a : this.f44724b.getAndSet(f44722f)) {
                c6992a.f44720a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            v7b.m23844a(this.f44723a, this, null);
            C6992a<T>[] andSet = this.f44724b.getAndSet(f44722f);
            if (andSet.length == 0) {
                pfe.onError(th);
                return;
            }
            for (C6992a<T> c6992a : andSet) {
                c6992a.f44720a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            for (C6992a<T> c6992a : this.f44724b.get()) {
                c6992a.f44720a.onNext(t);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f44726d, mf4Var);
        }
    }

    /* JADX INFO: renamed from: hsb$c */
    public static final class C6994c<T> implements xub<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C6993b<T>> f44727a;

        public C6994c(AtomicReference<C6993b<T>> atomicReference) {
            this.f44727a = atomicReference;
        }

        @Override // p000.xub
        public void subscribe(oxb<? super T> oxbVar) {
            C6992a c6992a = new C6992a(oxbVar);
            oxbVar.onSubscribe(c6992a);
            while (true) {
                C6993b<T> c6993b = this.f44727a.get();
                if (c6993b == null || c6993b.isDisposed()) {
                    C6993b<T> c6993b2 = new C6993b<>(this.f44727a);
                    if (v7b.m23844a(this.f44727a, c6993b, c6993b2)) {
                        c6993b = c6993b2;
                    } else {
                        continue;
                    }
                }
                if (c6993b.m12588a(c6992a)) {
                    c6992a.m12587a(c6993b);
                    return;
                }
            }
        }
    }

    private hsb(xub<T> xubVar, xub<T> xubVar2, AtomicReference<C6993b<T>> atomicReference) {
        this.f44719c = xubVar;
        this.f44717a = xubVar2;
        this.f44718b = atomicReference;
    }

    public static <T> pr2<T> create(xub<T> xubVar) {
        AtomicReference atomicReference = new AtomicReference();
        return pfe.onAssembly((pr2) new hsb(new C6994c(atomicReference), xubVar, atomicReference));
    }

    @Override // p000.pr2
    public void connect(tu2<? super mf4> tu2Var) {
        C6993b<T> c6993b;
        while (true) {
            c6993b = this.f44718b.get();
            if (c6993b != null && !c6993b.isDisposed()) {
                break;
            }
            C6993b<T> c6993b2 = new C6993b<>(this.f44718b);
            if (v7b.m23844a(this.f44718b, c6993b, c6993b2)) {
                c6993b = c6993b2;
                break;
            }
        }
        boolean z = false;
        if (!c6993b.f44725c.get() && c6993b.f44725c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            tu2Var.accept(c6993b);
            if (z) {
                this.f44717a.subscribe(c6993b);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.ksb
    public xub<T> publishSource() {
        return this.f44717a;
    }

    @Override // p000.ch7
    public xub<T> source() {
        return this.f44717a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f44719c.subscribe(oxbVar);
    }
}
