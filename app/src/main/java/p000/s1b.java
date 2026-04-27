package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class s1b<T> implements uif<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12399a<T>> f80384a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C12399a<T>> f80385b = new AtomicReference<>();

    /* JADX INFO: renamed from: s1b$a */
    public static final class C12399a<E> extends AtomicReference<C12399a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: a */
        public E f80386a;

        public C12399a() {
        }

        public E getAndNullValue() {
            E eLpValue = lpValue();
            spValue(null);
            return eLpValue;
        }

        public E lpValue() {
            return this.f80386a;
        }

        public C12399a<E> lvNext() {
            return get();
        }

        public void soNext(C12399a<E> c12399a) {
            lazySet(c12399a);
        }

        public void spValue(E e) {
            this.f80386a = e;
        }

        public C12399a(E e) {
            spValue(e);
        }
    }

    public s1b() {
        C12399a<T> c12399a = new C12399a<>();
        m21650d(c12399a);
        m21651e(c12399a);
    }

    /* JADX INFO: renamed from: a */
    public C12399a<T> m21647a() {
        return this.f80385b.get();
    }

    /* JADX INFO: renamed from: b */
    public C12399a<T> m21648b() {
        return this.f80385b.get();
    }

    /* JADX INFO: renamed from: c */
    public C12399a<T> m21649c() {
        return this.f80384a.get();
    }

    @Override // p000.ajf
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21650d(C12399a<T> c12399a) {
        this.f80385b.lazySet(c12399a);
    }

    /* JADX INFO: renamed from: e */
    public C12399a<T> m21651e(C12399a<T> c12399a) {
        return this.f80384a.getAndSet(c12399a);
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return m21648b() == m21649c();
    }

    @Override // p000.ajf
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C12399a<T> c12399a = new C12399a<>(t);
        m21651e(c12399a).soNext(c12399a);
        return true;
    }

    @Override // p000.uif, p000.ajf
    @cib
    public T poll() {
        C12399a<T> c12399aLvNext;
        C12399a<T> c12399aM21647a = m21647a();
        C12399a<T> c12399aLvNext2 = c12399aM21647a.lvNext();
        if (c12399aLvNext2 != null) {
            T andNullValue = c12399aLvNext2.getAndNullValue();
            m21650d(c12399aLvNext2);
            return andNullValue;
        }
        if (c12399aM21647a == m21649c()) {
            return null;
        }
        do {
            c12399aLvNext = c12399aM21647a.lvNext();
        } while (c12399aLvNext == null);
        T andNullValue2 = c12399aLvNext.getAndNullValue();
        m21650d(c12399aLvNext);
        return andNullValue2;
    }

    @Override // p000.ajf
    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }
}
