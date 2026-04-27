package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dqb<T, K, V> extends AbstractC9666n3<T, ub7<K, V>> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends K> f30393b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends V> f30394c;

    /* JADX INFO: renamed from: d */
    public final int f30395d;

    /* JADX INFO: renamed from: e */
    public final boolean f30396e;

    /* JADX INFO: renamed from: dqb$a */
    public static final class C4907a<T, K, V> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: F */
        public static final Object f30397F = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super ub7<K, V>> f30399a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends K> f30400b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends V> f30401c;

        /* JADX INFO: renamed from: d */
        public final int f30402d;

        /* JADX INFO: renamed from: e */
        public final boolean f30403e;

        /* JADX INFO: renamed from: m */
        public lf4 f30405m;

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f30398C = new AtomicBoolean();

        /* JADX INFO: renamed from: f */
        public final Map<Object, C4908b<K, V>> f30404f = new ConcurrentHashMap();

        public C4907a(pxb<? super ub7<K, V>> actual, sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
            this.f30399a = actual;
            this.f30400b = keySelector;
            this.f30401c = valueSelector;
            this.f30402d = bufferSize;
            this.f30403e = delayError;
            lazySet(1);
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f30397F;
            }
            this.f30404f.remove(k);
            if (decrementAndGet() == 0) {
                this.f30405m.dispose();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f30398C.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f30405m.dispose();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f30398C.get();
        }

        @Override // p000.pxb
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f30404f.values());
            this.f30404f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4908b) it.next()).onComplete();
            }
            this.f30399a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            ArrayList arrayList = new ArrayList(this.f30404f.values());
            this.f30404f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4908b) it.next()).onError(t);
            }
            this.f30399a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            boolean z;
            try {
                K kApply = this.f30400b.apply(t);
                Object obj = kApply != null ? kApply : f30397F;
                C4908b<K, V> c4908bCreateWith = this.f30404f.get(obj);
                if (c4908bCreateWith != null) {
                    z = false;
                } else {
                    if (this.f30398C.get()) {
                        return;
                    }
                    c4908bCreateWith = C4908b.createWith(kApply, this.f30402d, this, this.f30403e);
                    this.f30404f.put(obj, c4908bCreateWith);
                    getAndIncrement();
                    z = true;
                }
                try {
                    V vApply = this.f30401c.apply(t);
                    Objects.requireNonNull(vApply, "The value supplied is null");
                    c4908bCreateWith.onNext(vApply);
                    if (z) {
                        this.f30399a.onNext(c4908bCreateWith);
                        if (c4908bCreateWith.f30406b.m9303d()) {
                            cancel(kApply);
                            c4908bCreateWith.onComplete();
                        }
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f30405m.dispose();
                    if (z) {
                        this.f30399a.onNext(c4908bCreateWith);
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f30405m.dispose();
                onError(th2);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f30405m, d)) {
                this.f30405m = d;
                this.f30399a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: dqb$b */
    public static final class C4908b<K, T> extends ub7<K, T> {

        /* JADX INFO: renamed from: b */
        public final C4909c<T, K> f30406b;

        public C4908b(K key, C4909c<T, K> state) {
            super(key);
            this.f30406b = state;
        }

        public static <T, K> C4908b<K, T> createWith(K key, int bufferSize, C4907a<?, K, T> parent, boolean delayError) {
            return new C4908b<>(key, new C4909c(bufferSize, parent, key, delayError));
        }

        public void onComplete() {
            this.f30406b.onComplete();
        }

        public void onError(Throwable e) {
            this.f30406b.onError(e);
        }

        public void onNext(T t) {
            this.f30406b.onNext(t);
        }

        @Override // p000.vkb
        public void subscribeActual(pxb<? super T> observer) {
            this.f30406b.subscribe(observer);
        }
    }

    /* JADX INFO: renamed from: dqb$c */
    public static final class C4909c<T, K> extends AtomicInteger implements lf4, wub<T> {

        /* JADX INFO: renamed from: H */
        public static final int f30407H = 0;

        /* JADX INFO: renamed from: L */
        public static final int f30408L = 1;

        /* JADX INFO: renamed from: M */
        public static final int f30409M = 2;

        /* JADX INFO: renamed from: N */
        public static final int f30410N = 3;
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: a */
        public final K f30413a;

        /* JADX INFO: renamed from: b */
        public final qzf<T> f30414b;

        /* JADX INFO: renamed from: c */
        public final C4907a<?, K, T> f30415c;

        /* JADX INFO: renamed from: d */
        public final boolean f30416d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f30417e;

        /* JADX INFO: renamed from: f */
        public Throwable f30418f;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f30419m = new AtomicBoolean();

        /* JADX INFO: renamed from: C */
        public final AtomicReference<pxb<? super T>> f30411C = new AtomicReference<>();

        /* JADX INFO: renamed from: F */
        public final AtomicInteger f30412F = new AtomicInteger();

        public C4909c(int bufferSize, C4907a<?, K, T> parent, K key, boolean delayError) {
            this.f30414b = new qzf<>(bufferSize);
            this.f30415c = parent;
            this.f30413a = key;
            this.f30416d = delayError;
        }

        /* JADX INFO: renamed from: a */
        public void m9300a() {
            if ((this.f30412F.get() & 2) == 0) {
                this.f30415c.cancel(this.f30413a);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m9301b(boolean d, boolean empty, pxb<? super T> a, boolean delayError) {
            if (this.f30419m.get()) {
                this.f30414b.clear();
                this.f30411C.lazySet(null);
                m9300a();
                return true;
            }
            if (!d) {
                return false;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.f30418f;
                this.f30411C.lazySet(null);
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f30418f;
            if (th2 != null) {
                this.f30414b.clear();
                this.f30411C.lazySet(null);
                a.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f30411C.lazySet(null);
            a.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m9302c() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<T> qzfVar = this.f30414b;
            boolean z = this.f30416d;
            pxb<? super T> pxbVar = this.f30411C.get();
            int iAddAndGet = 1;
            while (true) {
                if (pxbVar != null) {
                    while (true) {
                        boolean z2 = this.f30417e;
                        T tPoll = qzfVar.poll();
                        boolean z3 = tPoll == null;
                        if (m9301b(z2, z3, pxbVar, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            pxbVar.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (pxbVar == null) {
                    pxbVar = this.f30411C.get();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m9303d() {
            return this.f30412F.get() == 0 && this.f30412F.compareAndSet(0, 2);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f30419m.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f30411C.lazySet(null);
                m9300a();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f30419m.get();
        }

        public void onComplete() {
            this.f30417e = true;
            m9302c();
        }

        public void onError(Throwable e) {
            this.f30418f = e;
            this.f30417e = true;
            m9302c();
        }

        public void onNext(T t) {
            this.f30414b.offer(t);
            m9302c();
        }

        @Override // p000.wub
        public void subscribe(pxb<? super T> observer) {
            int i;
            do {
                i = this.f30412F.get();
                if ((i & 1) != 0) {
                    b05.error(new IllegalStateException("Only one Observer allowed!"), observer);
                    return;
                }
            } while (!this.f30412F.compareAndSet(i, i | 1));
            observer.onSubscribe(this);
            this.f30411C.lazySet(observer);
            if (this.f30419m.get()) {
                this.f30411C.lazySet(null);
            } else {
                m9302c();
            }
        }
    }

    public dqb(wub<T> source, sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
        super(source);
        this.f30393b = keySelector;
        this.f30394c = valueSelector;
        this.f30395d = bufferSize;
        this.f30396e = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super ub7<K, V>> t) {
        this.f63101a.subscribe(new C4907a(t, this.f30393b, this.f30394c, this.f30395d, this.f30396e));
    }
}
