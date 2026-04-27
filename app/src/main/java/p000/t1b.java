package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class t1b<T> implements tif<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12847a<T>> f83355a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C12847a<T>> f83356b = new AtomicReference<>();

    /* JADX INFO: renamed from: t1b$a */
    public static final class C12847a<E> extends AtomicReference<C12847a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: a */
        public E f83357a;

        public C12847a() {
        }

        public E getAndNullValue() {
            E eLpValue = lpValue();
            spValue(null);
            return eLpValue;
        }

        public E lpValue() {
            return this.f83357a;
        }

        public C12847a<E> lvNext() {
            return get();
        }

        public void soNext(C12847a<E> n) {
            lazySet(n);
        }

        public void spValue(E newValue) {
            this.f83357a = newValue;
        }

        public C12847a(E val) {
            spValue(val);
        }
    }

    public t1b() {
        C12847a<T> c12847a = new C12847a<>();
        m22322d(c12847a);
        m22323e(c12847a);
    }

    /* JADX INFO: renamed from: a */
    public C12847a<T> m22319a() {
        return this.f83356b.get();
    }

    /* JADX INFO: renamed from: b */
    public C12847a<T> m22320b() {
        return this.f83356b.get();
    }

    /* JADX INFO: renamed from: c */
    public C12847a<T> m22321c() {
        return this.f83355a.get();
    }

    @Override // p000.zif
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m22322d(C12847a<T> node) {
        this.f83356b.lazySet(node);
    }

    /* JADX INFO: renamed from: e */
    public C12847a<T> m22323e(C12847a<T> node) {
        return this.f83355a.getAndSet(node);
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return m22320b() == m22321c();
    }

    @Override // p000.zif
    public boolean offer(final T e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C12847a<T> c12847a = new C12847a<>(e);
        m22323e(c12847a).soNext(c12847a);
        return true;
    }

    @Override // p000.tif, p000.zif
    @dib
    public T poll() {
        C12847a<T> c12847aLvNext;
        C12847a<T> c12847aM22319a = m22319a();
        C12847a<T> c12847aLvNext2 = c12847aM22319a.lvNext();
        if (c12847aLvNext2 != null) {
            T andNullValue = c12847aLvNext2.getAndNullValue();
            m22322d(c12847aLvNext2);
            return andNullValue;
        }
        if (c12847aM22319a == m22321c()) {
            return null;
        }
        do {
            c12847aLvNext = c12847aM22319a.lvNext();
        } while (c12847aLvNext == null);
        T andNullValue2 = c12847aLvNext.getAndNullValue();
        m22322d(c12847aLvNext);
        return andNullValue2;
    }

    @Override // p000.zif
    public boolean offer(T v1, T v2) {
        offer(v1);
        offer(v2);
        return true;
    }
}
