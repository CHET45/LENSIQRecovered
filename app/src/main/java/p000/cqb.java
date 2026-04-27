package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cqb<T, K, V> extends AbstractC10162o3<T, vb7<K, V>> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends K> f27078b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends V> f27079c;

    /* JADX INFO: renamed from: d */
    public final int f27080d;

    /* JADX INFO: renamed from: e */
    public final boolean f27081e;

    /* JADX INFO: renamed from: cqb$a */
    public static final class C4463a<T, K, V> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: F */
        public static final Object f27082F = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super vb7<K, V>> f27084a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends K> f27085b;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends V> f27086c;

        /* JADX INFO: renamed from: d */
        public final int f27087d;

        /* JADX INFO: renamed from: e */
        public final boolean f27088e;

        /* JADX INFO: renamed from: m */
        public mf4 f27090m;

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f27083C = new AtomicBoolean();

        /* JADX INFO: renamed from: f */
        public final Map<Object, C4464b<K, V>> f27089f = new ConcurrentHashMap();

        public C4463a(oxb<? super vb7<K, V>> oxbVar, py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, int i, boolean z) {
            this.f27084a = oxbVar;
            this.f27085b = py6Var;
            this.f27086c = py6Var2;
            this.f27087d = i;
            this.f27088e = z;
            lazySet(1);
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f27082F;
            }
            this.f27089f.remove(k);
            if (decrementAndGet() == 0) {
                this.f27090m.dispose();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f27083C.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f27090m.dispose();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f27083C.get();
        }

        @Override // p000.oxb
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f27089f.values());
            this.f27089f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4464b) it.next()).onComplete();
            }
            this.f27084a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f27089f.values());
            this.f27089f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4464b) it.next()).onError(th);
            }
            this.f27084a.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.oxb
        public void onNext(T t) {
            try {
                K kApply = this.f27085b.apply(t);
                Object obj = kApply != null ? kApply : f27082F;
                C4464b<K, V> c4464b = this.f27089f.get(obj);
                C4464b c4464b2 = c4464b;
                if (c4464b == false) {
                    if (this.f27083C.get()) {
                        return;
                    }
                    C4464b<K, V> c4464bCreateWith = C4464b.createWith(kApply, this.f27087d, this, this.f27088e);
                    this.f27089f.put(obj, c4464bCreateWith);
                    getAndIncrement();
                    this.f27084a.onNext(c4464bCreateWith);
                    c4464b2 = c4464bCreateWith;
                }
                try {
                    c4464b2.onNext(xjb.requireNonNull(this.f27086c.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f27090m.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f27090m.dispose();
                onError(th2);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f27090m, mf4Var)) {
                this.f27090m = mf4Var;
                this.f27084a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: cqb$b */
    public static final class C4464b<K, T> extends vb7<K, T> {

        /* JADX INFO: renamed from: b */
        public final C4465c<T, K> f27091b;

        public C4464b(K k, C4465c<T, K> c4465c) {
            super(k);
            this.f27091b = c4465c;
        }

        public static <T, K> C4464b<K, T> createWith(K k, int i, C4463a<?, K, T> c4463a, boolean z) {
            return new C4464b<>(k, new C4465c(i, c4463a, k, z));
        }

        public void onComplete() {
            this.f27091b.onComplete();
        }

        public void onError(Throwable th) {
            this.f27091b.onError(th);
        }

        public void onNext(T t) {
            this.f27091b.onNext(t);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(oxb<? super T> oxbVar) {
            this.f27091b.subscribe(oxbVar);
        }
    }

    /* JADX INFO: renamed from: cqb$c */
    public static final class C4465c<T, K> extends AtomicInteger implements mf4, xub<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: a */
        public final K f27094a;

        /* JADX INFO: renamed from: b */
        public final rzf<T> f27095b;

        /* JADX INFO: renamed from: c */
        public final C4463a<?, K, T> f27096c;

        /* JADX INFO: renamed from: d */
        public final boolean f27097d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f27098e;

        /* JADX INFO: renamed from: f */
        public Throwable f27099f;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f27100m = new AtomicBoolean();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f27092C = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicReference<oxb<? super T>> f27093F = new AtomicReference<>();

        public C4465c(int i, C4463a<?, K, T> c4463a, K k, boolean z) {
            this.f27095b = new rzf<>(i);
            this.f27096c = c4463a;
            this.f27094a = k;
            this.f27097d = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m8659a(boolean z, boolean z2, oxb<? super T> oxbVar, boolean z3) {
            if (this.f27100m.get()) {
                this.f27095b.clear();
                this.f27096c.cancel(this.f27094a);
                this.f27093F.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f27099f;
                this.f27093F.lazySet(null);
                if (th != null) {
                    oxbVar.onError(th);
                } else {
                    oxbVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f27099f;
            if (th2 != null) {
                this.f27095b.clear();
                this.f27093F.lazySet(null);
                oxbVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f27093F.lazySet(null);
            oxbVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m8660b() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<T> rzfVar = this.f27095b;
            boolean z = this.f27097d;
            oxb<? super T> oxbVar = this.f27093F.get();
            int iAddAndGet = 1;
            while (true) {
                if (oxbVar != null) {
                    while (true) {
                        boolean z2 = this.f27098e;
                        T tPoll = rzfVar.poll();
                        boolean z3 = tPoll == null;
                        if (m8659a(z2, z3, oxbVar, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            oxbVar.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (oxbVar == null) {
                    oxbVar = this.f27093F.get();
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f27100m.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f27093F.lazySet(null);
                this.f27096c.cancel(this.f27094a);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f27100m.get();
        }

        public void onComplete() {
            this.f27098e = true;
            m8660b();
        }

        public void onError(Throwable th) {
            this.f27099f = th;
            this.f27098e = true;
            m8660b();
        }

        public void onNext(T t) {
            this.f27095b.offer(t);
            m8660b();
        }

        @Override // p000.xub
        public void subscribe(oxb<? super T> oxbVar) {
            if (!this.f27092C.compareAndSet(false, true)) {
                c05.error(new IllegalStateException("Only one Observer allowed!"), oxbVar);
                return;
            }
            oxbVar.onSubscribe(this);
            this.f27093F.lazySet(oxbVar);
            if (this.f27100m.get()) {
                this.f27093F.lazySet(null);
            } else {
                m8660b();
            }
        }
    }

    public cqb(xub<T> xubVar, py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, int i, boolean z) {
        super(xubVar);
        this.f27078b = py6Var;
        this.f27079c = py6Var2;
        this.f27080d = i;
        this.f27081e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super vb7<K, V>> oxbVar) {
        this.f66354a.subscribe(new C4463a(oxbVar, this.f27078b, this.f27079c, this.f27080d, this.f27081e));
    }
}
