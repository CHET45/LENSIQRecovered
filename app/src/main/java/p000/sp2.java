package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.ap8;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class sp2<K, V> extends AbstractC6093g3<K, V> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f82486b = AtomicIntegerFieldUpdater.newUpdater(sp2.class, "_size$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f82487c = AtomicReferenceFieldUpdater.newUpdater(sp2.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    @gib
    public final ReferenceQueue<K> f82488a;
    private volatile /* synthetic */ Object core$volatile;

    /* JADX INFO: renamed from: sp2$a */
    public final class C12732a {

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f82489g = AtomicIntegerFieldUpdater.newUpdater(C12732a.class, "load$volatile");

        /* JADX INFO: renamed from: a */
        public final int f82490a;

        /* JADX INFO: renamed from: b */
        public final int f82491b;

        /* JADX INFO: renamed from: c */
        public final int f82492c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicReferenceArray f82493d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReferenceArray f82494e;
        private volatile /* synthetic */ int load$volatile;

        /* JADX INFO: renamed from: sp2$a$a */
        @dwf({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        public final class a<E> implements Iterator<E>, xo8 {

            /* JADX INFO: renamed from: a */
            @yfb
            public final gz6<K, V, E> f82496a;

            /* JADX INFO: renamed from: b */
            public int f82497b = -1;

            /* JADX INFO: renamed from: c */
            public K f82498c;

            /* JADX INFO: renamed from: d */
            public V f82499d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@yfb gz6<? super K, ? super V, ? extends E> gz6Var) {
                this.f82496a = gz6Var;
                findNext();
            }

            private final void findNext() {
                K k;
                while (true) {
                    int i = this.f82497b + 1;
                    this.f82497b = i;
                    if (i >= C12732a.this.f82490a) {
                        return;
                    }
                    vh7 vh7Var = (vh7) C12732a.this.getKeys().get(this.f82497b);
                    if (vh7Var != null && (k = (K) vh7Var.get()) != null) {
                        this.f82498c = k;
                        Object obj = (V) C12732a.this.getValues().get(this.f82497b);
                        if (obj instanceof cu9) {
                            obj = (V) ((cu9) obj).f27633a;
                        }
                        if (obj != null) {
                            this.f82499d = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f82497b < C12732a.this.f82490a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.f82497b >= C12732a.this.f82490a) {
                    throw new NoSuchElementException();
                }
                gz6<K, V, E> gz6Var = this.f82496a;
                K k = this.f82498c;
                if (k == false) {
                    md8.throwUninitializedPropertyAccessException("key");
                    k = (K) bth.f14751a;
                }
                V v = this.f82499d;
                if (v == false) {
                    md8.throwUninitializedPropertyAccessException("value");
                    v = (V) bth.f14751a;
                }
                E e = (E) gz6Var.invoke(k, v);
                findNext();
                return e;
            }

            @Override // java.util.Iterator
            @yfb
            public Void remove() {
                tp2.noImpl();
                throw new us8();
            }
        }

        public C12732a(int i) {
            this.f82490a = i;
            this.f82491b = Integer.numberOfLeadingZeros(i) + 1;
            this.f82492c = (i * 2) / 3;
            this.f82493d = new AtomicReferenceArray(i);
            this.f82494e = new AtomicReferenceArray(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.f82493d;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.f82494e;
        }

        private final int index(int i) {
            return (i * (-1640531527)) >>> this.f82491b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(C12732a c12732a, Object obj, Object obj2, vh7 vh7Var, int i, Object obj3) {
            if ((i & 4) != 0) {
                vh7Var = null;
            }
            return c12732a.putImpl(obj, obj2, vh7Var);
        }

        private final void removeCleanedAt(int i) {
            Object obj;
            do {
                obj = getValues().get(i);
                if (obj == null || (obj instanceof cu9)) {
                    return;
                }
            } while (!bag.m3024a(getValues(), i, obj, null));
            sp2.this.decrementSize();
        }

        private final /* synthetic */ void setLoad$volatile(int i) {
            this.load$volatile = i;
        }

        private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, Integer> qy6Var) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, qy6Var.invoke(Integer.valueOf(i)).intValue()));
        }

        public final void cleanWeakRef(@yfb vh7<?> vh7Var) {
            int iIndex = index(vh7Var.f91199a);
            while (true) {
                vh7<?> vh7Var2 = (vh7) getKeys().get(iIndex);
                if (vh7Var2 == null) {
                    return;
                }
                if (vh7Var2 == vh7Var) {
                    removeCleanedAt(iIndex);
                    return;
                } else {
                    if (iIndex == 0) {
                        iIndex = this.f82490a;
                    }
                    iIndex--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @gib
        public final V getImpl(@yfb K k) {
            int iIndex = index(k.hashCode());
            while (true) {
                vh7 vh7Var = (vh7) getKeys().get(iIndex);
                if (vh7Var == null) {
                    return null;
                }
                T t = vh7Var.get();
                if (md8.areEqual(k, t)) {
                    V v = (V) getValues().get(iIndex);
                    return v instanceof cu9 ? (V) ((cu9) v).f27633a : v;
                }
                if (t == 0) {
                    removeCleanedAt(iIndex);
                }
                if (iIndex == 0) {
                    iIndex = this.f82490a;
                }
                iIndex--;
            }
        }

        @yfb
        public final <E> Iterator<E> keyValueIterator(@yfb gz6<? super K, ? super V, ? extends E> gz6Var) {
            return new a(gz6Var);
        }

        @gib
        public final Object putImpl(@yfb K k, @gib V v, @gib vh7<K> vh7Var) {
            int i;
            Object obj;
            int iIndex = index(k.hashCode());
            boolean z = false;
            while (true) {
                vh7 vh7Var2 = (vh7) getKeys().get(iIndex);
                if (vh7Var2 != null) {
                    T t = vh7Var2.get();
                    if (!md8.areEqual(k, t)) {
                        if (t == 0) {
                            removeCleanedAt(iIndex);
                        }
                        if (iIndex == 0) {
                            iIndex = this.f82490a;
                        }
                        iIndex--;
                    } else if (z) {
                        f82489g.decrementAndGet(this);
                    }
                } else if (v != null) {
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f82489g;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.f82492c) {
                                return tp2.f85533c;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (vh7Var == null) {
                        vh7Var = new vh7<>(k, sp2.this.f82488a);
                    }
                    if (bag.m3024a(getKeys(), iIndex, null, vh7Var)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = getValues().get(iIndex);
                if (obj instanceof cu9) {
                    return tp2.f85533c;
                }
            } while (!bag.m3024a(getValues(), iIndex, obj, v));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @yfb
        public final sp2<K, V>.C12732a rehash() {
            int i;
            Object obj;
            while (true) {
                sp2<K, V>.C12732a c12732a = (sp2<K, V>.C12732a) sp2.this.new C12732a(Integer.highestOneBit(kpd.coerceAtLeast(sp2.this.size(), 4)) * 4);
                int i2 = this.f82490a;
                while (i < i2) {
                    vh7 vh7Var = (vh7) getKeys().get(i);
                    Object obj2 = vh7Var != null ? vh7Var.get() : null;
                    if (vh7Var != null && obj2 == null) {
                        removeCleanedAt(i);
                    }
                    while (true) {
                        obj = getValues().get(i);
                        if (obj instanceof cu9) {
                            obj = ((cu9) obj).f27633a;
                            break;
                        }
                        if (bag.m3024a(getValues(), i, obj, tp2.mark(obj))) {
                            break;
                        }
                    }
                    i = (obj2 == null || obj == null || c12732a.putImpl(obj2, obj, vh7Var) != tp2.f85533c) ? i + 1 : 0;
                }
                return c12732a;
            }
        }
    }

    /* JADX INFO: renamed from: sp2$b */
    public static final class C12733b<K, V> implements Map.Entry<K, V>, ap8.InterfaceC1546a {

        /* JADX INFO: renamed from: a */
        public final K f82501a;

        /* JADX INFO: renamed from: b */
        public final V f82502b;

        public C12733b(K k, V v) {
            this.f82501a = k;
            this.f82502b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f82501a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f82502b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            tp2.noImpl();
            throw new us8();
        }
    }

    /* JADX INFO: renamed from: sp2$c */
    public final class C12734c<E> extends AbstractC6688h3<E> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final gz6<K, V, E> f82503a;

        /* JADX WARN: Multi-variable type inference failed */
        public C12734c(@yfb gz6<? super K, ? super V, ? extends E> gz6Var) {
            this.f82503a = gz6Var;
        }

        @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            tp2.noImpl();
            throw new us8();
        }

        @Override // p000.AbstractC6688h3
        public int getSize() {
            return sp2.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @yfb
        public Iterator<E> iterator() {
            return ((C12732a) sp2.getCore$volatile$FU().get(sp2.this)).keyValueIterator(this.f82503a);
        }
    }

    public sp2() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$1(Object obj, Object obj2) {
        return new C12733b(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _get_keys_$lambda$0(Object obj, Object obj2) {
        return obj;
    }

    private final void cleanWeakRef(vh7<?> vh7Var) {
        ((C12732a) f82487c.get(this)).cleanWeakRef(vh7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        f82486b.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return f82487c;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K k, V v) {
        V v2;
        C12732a c12732aRehash = (C12732a) f82487c.get(this);
        while (true) {
            v2 = (V) C12732a.putImpl$default(c12732aRehash, k, v, null, 4, null);
            if (v2 == tp2.f85533c) {
                c12732aRehash = c12732aRehash.rehash();
                f82487c.set(this, c12732aRehash);
            }
        }
        return v2;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V get(@gib Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((C12732a) f82487c.get(this)).getImpl(obj);
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        return new C12734c(new gz6() { // from class: rp2
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return sp2._get_entries_$lambda$1(obj, obj2);
            }
        });
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<K> getKeys() {
        return new C12734c(new gz6() { // from class: qp2
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return sp2._get_keys_$lambda$0(obj, obj2);
            }
        });
    }

    @Override // p000.AbstractC6093g3
    public int getSize() {
        return f82486b.get(this);
    }

    @Override // p000.AbstractC6093g3, java.util.AbstractMap, java.util.Map
    @gib
    public V put(@yfb K k, @yfb V v) {
        V vPutSynchronized = (V) C12732a.putImpl$default((C12732a) f82487c.get(this), k, v, null, 4, null);
        if (vPutSynchronized == tp2.f85533c) {
            vPutSynchronized = putSynchronized(k, v);
        }
        if (vPutSynchronized == null) {
            f82486b.incrementAndGet(this);
        }
        return vPutSynchronized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V remove(@gib Object obj) {
        if (obj == 0) {
            return null;
        }
        V vPutSynchronized = (V) C12732a.putImpl$default((C12732a) f82487c.get(this), obj, null, null, 4, null);
        if (vPutSynchronized == tp2.f85533c) {
            vPutSynchronized = putSynchronized(obj, null);
        }
        if (vPutSynchronized != null) {
            f82486b.decrementAndGet(this);
        }
        return vPutSynchronized;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.f82488a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.f82488a.remove();
                md8.checkNotNull(referenceRemove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((vh7) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ sp2(boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z);
    }

    public sp2(boolean z) {
        this.core$volatile = new C12732a(16);
        this.f82488a = z ? new ReferenceQueue<>() : null;
    }
}
