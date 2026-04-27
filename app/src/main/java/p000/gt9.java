package p000;

import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p000.ft9;
import p000.gt9.AbstractC6519o;
import p000.gt9.InterfaceC6513j;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
public class gt9<K, V, E extends InterfaceC6513j<K, V, E>, S extends AbstractC6519o<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: H */
    public static final int f40974H = 1073741824;

    /* JADX INFO: renamed from: L */
    public static final int f40975L = 65536;

    /* JADX INFO: renamed from: M */
    public static final int f40976M = 3;

    /* JADX INFO: renamed from: N */
    public static final int f40977N = 63;

    /* JADX INFO: renamed from: Q */
    public static final int f40978Q = 16;

    /* JADX INFO: renamed from: X */
    public static final InterfaceC6510h0<Object, Object, C6505f> f40979X = new C6495a();
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: C */
    @wx1
    @ez8
    public transient Collection<V> f40980C;

    /* JADX INFO: renamed from: F */
    @wx1
    @ez8
    public transient Set<Map.Entry<K, V>> f40981F;

    /* JADX INFO: renamed from: a */
    public final transient int f40982a;

    /* JADX INFO: renamed from: b */
    public final transient int f40983b;

    /* JADX INFO: renamed from: c */
    public final transient AbstractC6519o<K, V, E, S>[] f40984c;

    /* JADX INFO: renamed from: d */
    public final int f40985d;

    /* JADX INFO: renamed from: e */
    public final r45<Object> f40986e;

    /* JADX INFO: renamed from: f */
    public final transient InterfaceC6515k<K, V, E, S> f40987f;

    /* JADX INFO: renamed from: m */
    @wx1
    @ez8
    public transient Set<K> f40988m;

    /* JADX INFO: renamed from: gt9$a */
    public class C6495a implements InterfaceC6510h0<Object, Object, C6505f> {
        @Override // p000.gt9.InterfaceC6510h0
        public void clear() {
        }

        @Override // p000.gt9.InterfaceC6510h0
        @wx1
        public Object get() {
            return null;
        }

        @Override // p000.gt9.InterfaceC6510h0
        public InterfaceC6510h0<Object, Object, C6505f> copyFor(ReferenceQueue<Object> queue, C6505f entry) {
            return this;
        }

        @Override // p000.gt9.InterfaceC6510h0
        @wx1
        public C6505f getEntry() {
            return null;
        }
    }

    /* JADX INFO: renamed from: gt9$a0 */
    public static class C6496a0<K> extends AbstractC6501d<K, ft9.EnumC5962a, C6496a0<K>> implements InterfaceC6528x<K, ft9.EnumC5962a, C6496a0<K>> {

        /* JADX INFO: renamed from: gt9$a0$a */
        public static final class a<K> implements InterfaceC6515k<K, ft9.EnumC5962a, C6496a0<K>, C6498b0<K>> {

            /* JADX INFO: renamed from: a */
            public static final a<?> f40989a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K> a<K> m11879a() {
                return (a<K>) f40989a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41032b;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            @wx1
            public C6496a0<K> copy(C6498b0<K> segment, C6496a0<K> entry, @wx1 C6496a0<K> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                return newEntry((C6498b0) segment, (Object) key, entry.f41003a, (C6496a0) newNext);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6496a0<K> newEntry(C6498b0<K> segment, K key, int hash, @wx1 C6496a0<K> next) {
                return next == null ? new C6496a0<>(segment.f40997m, key, hash, null) : new b(segment.f40997m, key, hash, next, null);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6498b0<K> newSegment(gt9<K, ft9.EnumC5962a, C6496a0<K>, C6498b0<K>> map, int initialCapacity) {
                return new C6498b0<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6498b0<K> segment, C6496a0<K> entry, ft9.EnumC5962a value) {
            }
        }

        /* JADX INFO: renamed from: gt9$a0$b */
        public static final class b<K> extends C6496a0<K> {

            /* JADX INFO: renamed from: b */
            public final C6496a0<K> f40990b;

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i, C6496a0 c6496a0, C6495a c6495a) {
                this(referenceQueue, obj, i, c6496a0);
            }

            @Override // p000.gt9.C6496a0, p000.gt9.InterfaceC6513j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            private b(ReferenceQueue<K> queue, K key, int hash, C6496a0<K> next) {
                super(queue, key, hash, null);
                this.f40990b = next;
            }

            @Override // p000.gt9.AbstractC6501d, p000.gt9.InterfaceC6513j
            public C6496a0<K> getNext() {
                return this.f40990b;
            }
        }

        public /* synthetic */ C6496a0(ReferenceQueue referenceQueue, Object obj, int i, C6495a c6495a) {
            this(referenceQueue, obj, i);
        }

        private C6496a0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
        }

        @Override // p000.gt9.InterfaceC6513j
        public final ft9.EnumC5962a getValue() {
            return ft9.EnumC5962a.VALUE;
        }
    }

    /* JADX INFO: renamed from: gt9$b */
    public static abstract class AbstractC6497b<K, V> extends mr6<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: a */
        public final EnumC6521q f40991a;

        /* JADX INFO: renamed from: b */
        public final EnumC6521q f40992b;

        /* JADX INFO: renamed from: c */
        public final r45<Object> f40993c;

        /* JADX INFO: renamed from: d */
        public final r45<Object> f40994d;

        /* JADX INFO: renamed from: e */
        public final int f40995e;

        /* JADX INFO: renamed from: f */
        public transient ConcurrentMap<K, V> f40996f;

        public AbstractC6497b(EnumC6521q keyStrength, EnumC6521q valueStrength, r45<Object> keyEquivalence, r45<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            this.f40991a = keyStrength;
            this.f40992b = valueStrength;
            this.f40993c = keyEquivalence;
            this.f40994d = valueEquivalence;
            this.f40995e = concurrencyLevel;
            this.f40996f = delegate;
        }

        @Override // p000.mr6, p000.qs6, p000.zs6
        /* JADX INFO: renamed from: k */
        public ConcurrentMap<K, V> mo8967m() {
            return this.f40996f;
        }

        @yg8
        /* JADX INFO: renamed from: l */
        public void m11881l(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f40996f.put((K) object, (V) objectInputStream.readObject());
            }
        }

        @yg8
        /* JADX INFO: renamed from: m */
        public ft9 m11882m(ObjectInputStream in) throws IOException {
            return new ft9().initialCapacity(in.readInt()).m11157g(this.f40991a).m11158h(this.f40992b).m11156f(this.f40993c).concurrencyLevel(this.f40995e);
        }

        /* JADX INFO: renamed from: n */
        public void m11883n(ObjectOutputStream out) throws IOException {
            out.writeInt(this.f40996f.size());
            for (Map.Entry<K, V> entry : this.f40996f.entrySet()) {
                out.writeObject(entry.getKey());
                out.writeObject(entry.getValue());
            }
            out.writeObject(null);
        }
    }

    /* JADX INFO: renamed from: gt9$b0 */
    public static final class C6498b0<K> extends AbstractC6519o<K, ft9.EnumC5962a, C6496a0<K>, C6498b0<K>> {

        /* JADX INFO: renamed from: m */
        public final ReferenceQueue<K> f40997m;

        public C6498b0(gt9<K, ft9.EnumC5962a, C6496a0<K>, C6498b0<K>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f40997m = new ReferenceQueue<>();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public C6498b0<K> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: n */
        public ReferenceQueue<K> mo11887n() {
            return this.f40997m;
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: u */
        public void mo11888u() {
            m11926b(this.f40997m);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: v */
        public void mo11889v() {
            m11932h(this.f40997m);
        }

        @Override // p000.gt9.AbstractC6519o
        public C6496a0<K> castForTesting(InterfaceC6513j<K, ft9.EnumC5962a, ?> entry) {
            return (C6496a0) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$c */
    public static abstract class AbstractC6499c<K, V, E extends InterfaceC6513j<K, V, E>> implements InterfaceC6513j<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final K f40998a;

        /* JADX INFO: renamed from: b */
        public final int f40999b;

        public AbstractC6499c(K key, int hash) {
            this.f40998a = key;
            this.f40999b = hash;
        }

        @Override // p000.gt9.InterfaceC6513j
        public final int getHash() {
            return this.f40999b;
        }

        @Override // p000.gt9.InterfaceC6513j
        public final K getKey() {
            return this.f40998a;
        }

        @Override // p000.gt9.InterfaceC6513j
        @wx1
        public E getNext() {
            return null;
        }
    }

    /* JADX INFO: renamed from: gt9$c0 */
    public static class C6500c0<K, V> extends AbstractC6501d<K, V, C6500c0<K, V>> implements InterfaceC6528x<K, V, C6500c0<K, V>> {

        /* JADX INFO: renamed from: b */
        @wx1
        public volatile V f41000b;

        /* JADX INFO: renamed from: gt9$c0$a */
        public static final class a<K, V> implements InterfaceC6515k<K, V, C6500c0<K, V>, C6502d0<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f41001a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K, V> a<K, V> m11892a() {
                return (a<K, V>) f41001a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41032b;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            @wx1
            public C6500c0<K, V> copy(C6502d0<K, V> segment, C6500c0<K, V> entry, @wx1 C6500c0<K, V> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                C6500c0<K, V> c6500c0NewEntry = newEntry((C6502d0) segment, (Object) key, entry.f41003a, (C6500c0) newNext);
                c6500c0NewEntry.f41000b = entry.f41000b;
                return c6500c0NewEntry;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6500c0<K, V> newEntry(C6502d0<K, V> segment, K key, int hash, @wx1 C6500c0<K, V> next) {
                return next == null ? new C6500c0<>(segment.f41004m, key, hash, null) : new b(segment.f41004m, key, hash, next, null);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6502d0<K, V> newSegment(gt9<K, V, C6500c0<K, V>, C6502d0<K, V>> map, int initialCapacity) {
                return new C6502d0<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6502d0<K, V> segment, C6500c0<K, V> entry, V value) {
                entry.f41000b = value;
            }
        }

        /* JADX INFO: renamed from: gt9$c0$b */
        public static final class b<K, V> extends C6500c0<K, V> {

            /* JADX INFO: renamed from: c */
            public final C6500c0<K, V> f41002c;

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i, C6500c0 c6500c0, C6495a c6495a) {
                this(referenceQueue, obj, i, c6500c0);
            }

            private b(ReferenceQueue<K> queue, K key, int hash, C6500c0<K, V> next) {
                super(queue, key, hash, null);
                this.f41002c = next;
            }

            @Override // p000.gt9.AbstractC6501d, p000.gt9.InterfaceC6513j
            public C6500c0<K, V> getNext() {
                return this.f41002c;
            }
        }

        public /* synthetic */ C6500c0(ReferenceQueue referenceQueue, Object obj, int i, C6495a c6495a) {
            this(referenceQueue, obj, i);
        }

        @Override // p000.gt9.InterfaceC6513j
        @wx1
        public final V getValue() {
            return this.f41000b;
        }

        private C6500c0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f41000b = null;
        }
    }

    /* JADX INFO: renamed from: gt9$d */
    public static abstract class AbstractC6501d<K, V, E extends InterfaceC6513j<K, V, E>> extends WeakReference<K> implements InterfaceC6513j<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final int f41003a;

        public AbstractC6501d(ReferenceQueue<K> queue, K key, int hash) {
            super(key, queue);
            this.f41003a = hash;
        }

        @Override // p000.gt9.InterfaceC6513j
        public final int getHash() {
            return this.f41003a;
        }

        @Override // p000.gt9.InterfaceC6513j
        public final K getKey() {
            return get();
        }

        @wx1
        public E getNext() {
            return null;
        }
    }

    /* JADX INFO: renamed from: gt9$d0 */
    public static final class C6502d0<K, V> extends AbstractC6519o<K, V, C6500c0<K, V>, C6502d0<K, V>> {

        /* JADX INFO: renamed from: m */
        public final ReferenceQueue<K> f41004m;

        public C6502d0(gt9<K, V, C6500c0<K, V>, C6502d0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f41004m = new ReferenceQueue<>();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public C6502d0<K, V> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: n */
        public ReferenceQueue<K> mo11887n() {
            return this.f41004m;
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: u */
        public void mo11888u() {
            m11926b(this.f41004m);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: v */
        public void mo11889v() {
            m11932h(this.f41004m);
        }

        @Override // p000.gt9.AbstractC6519o
        public C6500c0<K, V> castForTesting(InterfaceC6513j<K, V, ?> entry) {
            return (C6500c0) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$e */
    public static final class RunnableC6503e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<gt9<?, ?, ?, ?>> f41005a;

        public RunnableC6503e(gt9<?, ?, ?, ?> map) {
            this.f41005a = new WeakReference<>(map);
        }

        @Override // java.lang.Runnable
        public void run() {
            gt9<?, ?, ?, ?> gt9Var = this.f41005a.get();
            if (gt9Var == null) {
                throw new CancellationException();
            }
            for (AbstractC6519o<?, ?, E, S> abstractC6519o : gt9Var.f40984c) {
                abstractC6519o.m11919L();
            }
        }
    }

    /* JADX INFO: renamed from: gt9$e0 */
    public static class C6504e0<K, V> extends AbstractC6501d<K, V, C6504e0<K, V>> implements InterfaceC6508g0<K, V, C6504e0<K, V>> {

        /* JADX INFO: renamed from: b */
        public volatile InterfaceC6510h0<K, V, C6504e0<K, V>> f41006b;

        /* JADX INFO: renamed from: gt9$e0$a */
        public static final class a<K, V> implements InterfaceC6515k<K, V, C6504e0<K, V>, C6506f0<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f41007a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K, V> a<K, V> m11897a() {
                return (a<K, V>) f41007a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41032b;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41032b;
            }

            @Override // p000.gt9.InterfaceC6515k
            @wx1
            public C6504e0<K, V> copy(C6506f0<K, V> segment, C6504e0<K, V> entry, @wx1 C6504e0<K, V> newNext) {
                K key = entry.getKey();
                if (key == null || AbstractC6519o.m11907t(entry)) {
                    return null;
                }
                C6504e0<K, V> c6504e0NewEntry = newEntry((C6506f0) segment, (Object) key, entry.f41003a, (C6504e0) newNext);
                c6504e0NewEntry.f41006b = entry.f41006b.copyFor(segment.f41009C, c6504e0NewEntry);
                return c6504e0NewEntry;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6504e0<K, V> newEntry(C6506f0<K, V> segment, K key, int hash, @wx1 C6504e0<K, V> next) {
                return next == null ? new C6504e0<>(segment.f41010m, key, hash) : new b(segment.f41010m, key, hash, next);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6506f0<K, V> newSegment(gt9<K, V, C6504e0<K, V>, C6506f0<K, V>> map, int initialCapacity) {
                return new C6506f0<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6506f0<K, V> segment, C6504e0<K, V> entry, V value) {
                InterfaceC6510h0 interfaceC6510h0 = entry.f41006b;
                entry.f41006b = new C6512i0(segment.f41009C, value, entry);
                interfaceC6510h0.clear();
            }
        }

        /* JADX INFO: renamed from: gt9$e0$b */
        public static final class b<K, V> extends C6504e0<K, V> {

            /* JADX INFO: renamed from: c */
            public final C6504e0<K, V> f41008c;

            public b(ReferenceQueue<K> queue, K key, int hash, C6504e0<K, V> next) {
                super(queue, key, hash);
                this.f41008c = next;
            }

            @Override // p000.gt9.AbstractC6501d, p000.gt9.InterfaceC6513j
            public C6504e0<K, V> getNext() {
                return this.f41008c;
            }
        }

        public C6504e0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f41006b = gt9.m11865p();
        }

        @Override // p000.gt9.InterfaceC6513j
        public final V getValue() {
            return this.f41006b.get();
        }

        @Override // p000.gt9.InterfaceC6508g0
        public final InterfaceC6510h0<K, V, C6504e0<K, V>> getValueReference() {
            return this.f41006b;
        }
    }

    /* JADX INFO: renamed from: gt9$f */
    public static final class C6505f implements InterfaceC6513j<Object, Object, C6505f> {
        private C6505f() {
            throw new AssertionError();
        }

        @Override // p000.gt9.InterfaceC6513j
        public int getHash() {
            throw new AssertionError();
        }

        @Override // p000.gt9.InterfaceC6513j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // p000.gt9.InterfaceC6513j
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // p000.gt9.InterfaceC6513j
        public C6505f getNext() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: gt9$f0 */
    public static final class C6506f0<K, V> extends AbstractC6519o<K, V, C6504e0<K, V>, C6506f0<K, V>> {

        /* JADX INFO: renamed from: C */
        public final ReferenceQueue<V> f41009C;

        /* JADX INFO: renamed from: m */
        public final ReferenceQueue<K> f41010m;

        public C6506f0(gt9<K, V, C6504e0<K, V>, C6506f0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f41010m = new ReferenceQueue<>();
            this.f41009C = new ReferenceQueue<>();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public C6506f0<K, V> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        public InterfaceC6510h0<K, V, C6504e0<K, V>> getWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e) {
            return castForTesting((InterfaceC6513j) e).getValueReference();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: n */
        public ReferenceQueue<K> mo11887n() {
            return this.f41010m;
        }

        @Override // p000.gt9.AbstractC6519o
        public InterfaceC6510h0<K, V, C6504e0<K, V>> newWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e, V value) {
            return new C6512i0(this.f41009C, value, castForTesting((InterfaceC6513j) e));
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: r */
        public ReferenceQueue<V> mo11901r() {
            return this.f41009C;
        }

        @Override // p000.gt9.AbstractC6519o
        public void setWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e, InterfaceC6510h0<K, V, ? extends InterfaceC6513j<K, V, ?>> valueReference) {
            C6504e0<K, V> c6504e0CastForTesting = castForTesting((InterfaceC6513j) e);
            InterfaceC6510h0 interfaceC6510h0 = c6504e0CastForTesting.f41006b;
            c6504e0CastForTesting.f41006b = valueReference;
            interfaceC6510h0.clear();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: u */
        public void mo11888u() {
            m11926b(this.f41010m);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: v */
        public void mo11889v() {
            m11932h(this.f41010m);
            m11933i(this.f41009C);
        }

        @Override // p000.gt9.AbstractC6519o
        @wx1
        public C6504e0<K, V> castForTesting(@wx1 InterfaceC6513j<K, V, ?> entry) {
            return (C6504e0) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$g */
    public final class C6507g extends gt9<K, V, E, S>.AbstractC6511i<Map.Entry<K, V>> {
        public C6507g(final gt9 this$0) {
            super();
        }

        @Override // p000.gt9.AbstractC6511i, java.util.Iterator
        public Map.Entry<K, V> next() {
            return m11904c();
        }
    }

    /* JADX INFO: renamed from: gt9$g0 */
    public interface InterfaceC6508g0<K, V, E extends InterfaceC6513j<K, V, E>> extends InterfaceC6513j<K, V, E> {
        InterfaceC6510h0<K, V, E> getValueReference();
    }

    /* JADX INFO: renamed from: gt9$h */
    public final class C6509h extends AbstractC6518n<Map.Entry<K, V>> {
        public C6509h() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            gt9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            Map.Entry entry;
            Object key;
            Object obj;
            return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && (obj = gt9.this.get(key)) != null && gt9.this.m11877q().equivalent(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return gt9.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6507g(gt9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            Map.Entry entry;
            Object key;
            return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && gt9.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return gt9.this.size();
        }
    }

    /* JADX INFO: renamed from: gt9$h0 */
    public interface InterfaceC6510h0<K, V, E extends InterfaceC6513j<K, V, E>> {
        void clear();

        InterfaceC6510h0<K, V, E> copyFor(ReferenceQueue<V> queue, E entry);

        @wx1
        V get();

        E getEntry();
    }

    /* JADX INFO: renamed from: gt9$i */
    public abstract class AbstractC6511i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f41013a;

        /* JADX INFO: renamed from: b */
        public int f41014b = -1;

        /* JADX INFO: renamed from: c */
        @wx1
        public AbstractC6519o<K, V, E, S> f41015c;

        /* JADX INFO: renamed from: d */
        @wx1
        public AtomicReferenceArray<E> f41016d;

        /* JADX INFO: renamed from: e */
        @wx1
        public E f41017e;

        /* JADX INFO: renamed from: f */
        @wx1
        public gt9<K, V, E, S>.C6514j0 f41018f;

        /* JADX INFO: renamed from: m */
        @wx1
        public gt9<K, V, E, S>.C6514j0 f41019m;

        public AbstractC6511i() {
            this.f41013a = gt9.this.f40984c.length - 1;
            m11902a();
        }

        /* JADX INFO: renamed from: a */
        public final void m11902a() {
            this.f41018f = null;
            if (m11905d() || m11906e()) {
                return;
            }
            while (true) {
                int i = this.f41013a;
                if (i < 0) {
                    return;
                }
                AbstractC6519o<K, V, E, S>[] abstractC6519oArr = gt9.this.f40984c;
                this.f41013a = i - 1;
                AbstractC6519o<K, V, E, S> abstractC6519o = abstractC6519oArr[i];
                this.f41015c = abstractC6519o;
                if (abstractC6519o.f41026b != 0) {
                    this.f41016d = this.f41015c.f41029e;
                    this.f41014b = r0.length() - 1;
                    if (m11906e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m11903b(E entry) {
            try {
                Object key = entry.getKey();
                Object objM11869g = gt9.this.m11869g(entry);
                if (objM11869g == null) {
                    this.f41015c.m11944y();
                    return false;
                }
                this.f41018f = new C6514j0(key, objM11869g);
                this.f41015c.m11944y();
                return true;
            } catch (Throwable th) {
                this.f41015c.m11944y();
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public gt9<K, V, E, S>.C6514j0 m11904c() {
            gt9<K, V, E, S>.C6514j0 c6514j0 = this.f41018f;
            if (c6514j0 == null) {
                throw new NoSuchElementException();
            }
            this.f41019m = c6514j0;
            m11902a();
            return this.f41019m;
        }

        /* JADX INFO: renamed from: d */
        public boolean m11905d() {
            E e = this.f41017e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f41017e = (E) e.getNext();
                E e2 = this.f41017e;
                if (e2 == null) {
                    return false;
                }
                if (m11903b(e2)) {
                    return true;
                }
                e = this.f41017e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m11906e() {
            while (true) {
                int i = this.f41014b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f41016d;
                this.f41014b = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f41017e = e;
                if (e != null && (m11903b(e) || m11905d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41018f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            s72.m21768e(this.f41019m != null);
            gt9.this.remove(this.f41019m.getKey());
            this.f41019m = null;
        }
    }

    /* JADX INFO: renamed from: gt9$i0 */
    public static final class C6512i0<K, V, E extends InterfaceC6513j<K, V, E>> extends WeakReference<V> implements InterfaceC6510h0<K, V, E> {

        /* JADX INFO: renamed from: a */
        @Weak
        public final E f41020a;

        public C6512i0(ReferenceQueue<V> queue, V referent, E entry) {
            super(referent, queue);
            this.f41020a = entry;
        }

        @Override // p000.gt9.InterfaceC6510h0
        public InterfaceC6510h0<K, V, E> copyFor(ReferenceQueue<V> queue, E entry) {
            return new C6512i0(queue, get(), entry);
        }

        @Override // p000.gt9.InterfaceC6510h0
        public E getEntry() {
            return this.f41020a;
        }
    }

    /* JADX INFO: renamed from: gt9$j */
    public interface InterfaceC6513j<K, V, E extends InterfaceC6513j<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: renamed from: gt9$j0 */
    public final class C6514j0 extends AbstractC13818v2<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f41021a;

        /* JADX INFO: renamed from: b */
        public V f41022b;

        public C6514j0(K key, V value) {
            this.f41021a = key;
            this.f41022b = value;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f41021a.equals(entry.getKey()) && this.f41022b.equals(entry.getValue());
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public K getKey() {
            return this.f41021a;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public V getValue() {
            return this.f41022b;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public int hashCode() {
            return this.f41021a.hashCode() ^ this.f41022b.hashCode();
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) gt9.this.put(this.f41021a, v);
            this.f41022b = v;
            return v2;
        }
    }

    /* JADX INFO: renamed from: gt9$k */
    public interface InterfaceC6515k<K, V, E extends InterfaceC6513j<K, V, E>, S extends AbstractC6519o<K, V, E, S>> {
        E copy(S segment, E entry, @wx1 E newNext);

        EnumC6521q keyStrength();

        E newEntry(S segment, K key, int hash, @wx1 E next);

        S newSegment(gt9<K, V, E, S> map, int initialCapacity);

        void setValue(S segment, E entry, V value);

        EnumC6521q valueStrength();
    }

    /* JADX INFO: renamed from: gt9$l */
    public final class C6516l extends gt9<K, V, E, S>.AbstractC6511i<K> {
        public C6516l(final gt9 this$0) {
            super();
        }

        @Override // p000.gt9.AbstractC6511i, java.util.Iterator
        public K next() {
            return m11904c().getKey();
        }
    }

    /* JADX INFO: renamed from: gt9$m */
    public final class C6517m extends AbstractC6518n<K> {
        public C6517m() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            gt9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            return gt9.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return gt9.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C6516l(gt9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            return gt9.this.remove(o) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return gt9.this.size();
        }
    }

    /* JADX INFO: renamed from: gt9$n */
    public static abstract class AbstractC6518n<E> extends AbstractSet<E> {
        private AbstractC6518n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return gt9.toArrayList(this).toArray();
        }

        public /* synthetic */ AbstractC6518n(C6495a c6495a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) gt9.toArrayList(this).toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: gt9$o */
    public static abstract class AbstractC6519o<K, V, E extends InterfaceC6513j<K, V, E>, S extends AbstractC6519o<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: a */
        @Weak
        public final gt9<K, V, E, S> f41025a;

        /* JADX INFO: renamed from: b */
        public volatile int f41026b;

        /* JADX INFO: renamed from: c */
        public int f41027c;

        /* JADX INFO: renamed from: d */
        public int f41028d;

        /* JADX INFO: renamed from: e */
        @wx1
        public volatile AtomicReferenceArray<E> f41029e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f41030f = new AtomicInteger();

        public AbstractC6519o(gt9<K, V, E, S> map, int initialCapacity) {
            this.f41025a = map;
            m11941s(m11942w(initialCapacity));
        }

        /* JADX INFO: renamed from: t */
        public static <K, V, E extends InterfaceC6513j<K, V, E>> boolean m11907t(E entry) {
            return entry.getValue() == null;
        }

        @wx1
        /* JADX INFO: renamed from: A */
        public V m11908A(K k, int i, V v, boolean z) {
            lock();
            try {
                m11945z();
                int i2 = this.f41026b + 1;
                if (i2 > this.f41028d) {
                    m11934j();
                    i2 = this.f41026b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null) {
                            this.f41027c++;
                            m11922P(next, v);
                            this.f41026b = this.f41026b;
                            unlock();
                            return null;
                        }
                        if (z) {
                            unlock();
                            return v2;
                        }
                        this.f41027c++;
                        m11922P(next, v);
                        unlock();
                        return v2;
                    }
                }
                this.f41027c++;
                InterfaceC6513j interfaceC6513jNewEntry = this.f41025a.f40987f.newEntry(mo11885N(), k, i, e);
                m11922P(interfaceC6513jNewEntry, v);
                atomicReferenceArray.set(length, (E) interfaceC6513jNewEntry);
                this.f41026b = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        @op1
        /* JADX INFO: renamed from: B */
        public boolean m11909B(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e2; next != null; next = next.getNext()) {
                    if (next == e) {
                        this.f41027c++;
                        InterfaceC6513j interfaceC6513jM11914G = m11914G(e2, next);
                        int i2 = this.f41026b - 1;
                        atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                        this.f41026b = i2;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        @op1
        /* JADX INFO: renamed from: C */
        public boolean m11910C(K k, int i, InterfaceC6510h0<K, V, E> interfaceC6510h0) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(k, key)) {
                        if (((InterfaceC6508g0) next).getValueReference() != interfaceC6510h0) {
                            return false;
                        }
                        this.f41027c++;
                        InterfaceC6513j interfaceC6513jM11914G = m11914G(e, next);
                        int i2 = this.f41026b - 1;
                        atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                        this.f41026b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @op1
        @wx1
        /* JADX INFO: renamed from: D */
        public V m11911D(Object obj, int i) {
            lock();
            try {
                m11945z();
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(obj, key)) {
                        V v = (V) next.getValue();
                        if (v == null && !m11907t(next)) {
                            return null;
                        }
                        this.f41027c++;
                        InterfaceC6513j interfaceC6513jM11914G = m11914G(e, next);
                        int i2 = this.f41026b - 1;
                        atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                        this.f41026b = i2;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f41025a.m11877q().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (m11907t(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f41027c++;
            r9 = m11914G(r3, r4);
            r10 = r8.f41026b - 1;
            r0.set(r1, (E) r9);
            r8.f41026b = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /* JADX INFO: renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m11912E(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.m11945z()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends gt9$j<K, V, E>> r0 = r8.f41029e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                gt9$j r3 = (p000.gt9.InterfaceC6513j) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                gt9<K, V, E extends gt9$j<K, V, E>, S extends gt9$o<K, V, E, S>> r7 = r8.f41025a     // Catch: java.lang.Throwable -> L5c
                r45<java.lang.Object> r7 = r7.f40986e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                gt9<K, V, E extends gt9$j<K, V, E>, S extends gt9$o<K, V, E, S>> r10 = r8.f41025a     // Catch: java.lang.Throwable -> L5c
                r45 r10 = r10.m11877q()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = m11907t(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f41027c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f41027c = r9     // Catch: java.lang.Throwable -> L5c
                gt9$j r9 = r8.m11914G(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f41026b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f41026b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                gt9$j r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gt9.AbstractC6519o.m11912E(java.lang.Object, int, java.lang.Object):boolean");
        }

        @uc7("this")
        /* JADX INFO: renamed from: F */
        public boolean m11913F(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (InterfaceC6513j next = e2; next != null; next = next.getNext()) {
                if (next == e) {
                    this.f41027c++;
                    InterfaceC6513j interfaceC6513jM11914G = m11914G(e2, next);
                    int i = this.f41026b - 1;
                    atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                    this.f41026b = i;
                    return true;
                }
            }
            return false;
        }

        @wx1
        @uc7("this")
        /* JADX INFO: renamed from: G */
        public E m11914G(E e, E e2) {
            int i = this.f41026b;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                InterfaceC6513j interfaceC6513jM11930f = m11930f(e, e3);
                if (interfaceC6513jM11930f != null) {
                    e3 = (E) interfaceC6513jM11930f;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.f41026b = i;
            return e3;
        }

        @wx1
        /* JADX INFO: renamed from: H */
        public E m11915H(InterfaceC6513j<K, V, ?> interfaceC6513j, InterfaceC6513j<K, V, ?> interfaceC6513j2) {
            return (E) m11914G(castForTesting(interfaceC6513j), castForTesting(interfaceC6513j2));
        }

        @op1
        /* JADX INFO: renamed from: I */
        public boolean m11916I(InterfaceC6513j<K, V, ?> entry) {
            return m11913F(castForTesting(entry));
        }

        @wx1
        /* JADX INFO: renamed from: J */
        public V m11917J(K k, int i, V v) {
            lock();
            try {
                m11945z();
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 != null) {
                            this.f41027c++;
                            m11922P(next, v);
                            return v2;
                        }
                        if (m11907t(next)) {
                            this.f41027c++;
                            InterfaceC6513j interfaceC6513jM11914G = m11914G(e, next);
                            int i2 = this.f41026b - 1;
                            atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                            this.f41026b = i2;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX INFO: renamed from: K */
        public boolean m11918K(K k, int i, V v, V v2) {
            lock();
            try {
                m11945z();
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(k, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.f41025a.m11877q().equivalent(v, value)) {
                                return false;
                            }
                            this.f41027c++;
                            m11922P(next, v2);
                            return true;
                        }
                        if (m11907t(next)) {
                            this.f41027c++;
                            InterfaceC6513j interfaceC6513jM11914G = m11914G(e, next);
                            int i2 = this.f41026b - 1;
                            atomicReferenceArray.set(length, (E) interfaceC6513jM11914G);
                            this.f41026b = i2;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX INFO: renamed from: L */
        public void m11919L() {
            m11920M();
        }

        /* JADX INFO: renamed from: M */
        public void m11920M() {
            if (tryLock()) {
                try {
                    mo11889v();
                    this.f41030f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public abstract S mo11885N();

        /* JADX INFO: renamed from: O */
        public void m11921O(int i, InterfaceC6513j<K, V, ?> interfaceC6513j) {
            this.f41029e.set(i, (E) castForTesting(interfaceC6513j));
        }

        /* JADX INFO: renamed from: P */
        public void m11922P(E entry, V value) {
            this.f41025a.f40987f.setValue(mo11885N(), entry, value);
        }

        /* JADX INFO: renamed from: Q */
        public void m11923Q(InterfaceC6513j<K, V, ?> entry, V value) {
            this.f41025a.f40987f.setValue(mo11885N(), castForTesting(entry), value);
        }

        /* JADX INFO: renamed from: R */
        public void m11924R() {
            if (tryLock()) {
                try {
                    mo11889v();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m11925a() {
            if (this.f41026b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo11888u();
                    this.f41030f.set(0);
                    this.f41027c++;
                    this.f41026b = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public <T> void m11926b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @op1
        /* JADX INFO: renamed from: c */
        public boolean m11927c(K k, int i, InterfaceC6510h0<K, V, ? extends InterfaceC6513j<K, V, ?>> interfaceC6510h0) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC6513j next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f41025a.f40986e.equivalent(k, key)) {
                        if (((InterfaceC6508g0) next).getValueReference() != interfaceC6510h0) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) m11914G(e, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public abstract E castForTesting(InterfaceC6513j<K, V, ?> entry);

        /* JADX INFO: renamed from: d */
        public boolean m11928d(Object key, int hash) {
            try {
                boolean z = false;
                if (this.f41026b == 0) {
                    return false;
                }
                InterfaceC6513j interfaceC6513jM11938o = m11938o(key, hash);
                if (interfaceC6513jM11938o != null) {
                    if (interfaceC6513jM11938o.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                m11944y();
            }
        }

        @gdi
        /* JADX INFO: renamed from: e */
        public boolean m11929e(Object value) {
            try {
                if (this.f41026b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V vM11939p = m11939p(next);
                            if (vM11939p != null && this.f41025a.m11877q().equivalent(value, vM11939p)) {
                                m11944y();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                m11944y();
            }
        }

        @wx1
        /* JADX INFO: renamed from: f */
        public E m11930f(E e, E e2) {
            return (E) this.f41025a.f40987f.copy(mo11885N(), e, e2);
        }

        /* JADX INFO: renamed from: g */
        public E m11931g(InterfaceC6513j<K, V, ?> interfaceC6513j, @wx1 InterfaceC6513j<K, V, ?> interfaceC6513j2) {
            return (E) this.f41025a.f40987f.copy(mo11885N(), castForTesting(interfaceC6513j), castForTesting(interfaceC6513j2));
        }

        public InterfaceC6510h0<K, V, E> getWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> entry) {
            throw new AssertionError();
        }

        @uc7("this")
        /* JADX INFO: renamed from: h */
        public void m11932h(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f41025a.m11874l((InterfaceC6513j) referencePoll);
                i++;
            } while (i != 16);
        }

        @uc7("this")
        /* JADX INFO: renamed from: i */
        public void m11933i(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f41025a.m11875m((InterfaceC6510h0) referencePoll);
                i++;
            } while (i != 16);
        }

        @uc7("this")
        /* JADX INFO: renamed from: j */
        public void m11934j() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f41029e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f41026b;
            AtomicReferenceArray<E> atomicReferenceArrayM11942w = m11942w(length << 1);
            this.f41028d = (atomicReferenceArrayM11942w.length() * 3) / 4;
            int length2 = atomicReferenceArrayM11942w.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InterfaceC6513j next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayM11942w.set(hash, next);
                    } else {
                        InterfaceC6513j interfaceC6513j = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC6513j = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayM11942w.set(hash, interfaceC6513j);
                        while (next != interfaceC6513j) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC6513j interfaceC6513jM11930f = m11930f(next, (InterfaceC6513j) atomicReferenceArrayM11942w.get(hash3));
                            if (interfaceC6513jM11930f != null) {
                                atomicReferenceArrayM11942w.set(hash3, interfaceC6513jM11930f);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f41029e = atomicReferenceArrayM11942w;
            this.f41026b = i;
        }

        @wx1
        /* JADX INFO: renamed from: k */
        public V m11935k(Object obj, int i) {
            try {
                InterfaceC6513j interfaceC6513jM11938o = m11938o(obj, i);
                if (interfaceC6513jM11938o == null) {
                    m11944y();
                    return null;
                }
                V v = (V) interfaceC6513jM11938o.getValue();
                if (v == null) {
                    m11924R();
                }
                return v;
            } finally {
                m11944y();
            }
        }

        @wx1
        /* JADX INFO: renamed from: l */
        public E m11936l(Object obj, int i) {
            if (this.f41026b == 0) {
                return null;
            }
            for (E e = (E) m11937m(i); e != null; e = (E) e.getNext()) {
                if (e.getHash() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        m11924R();
                    } else if (this.f41025a.f40986e.equivalent(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        @wx1
        /* JADX INFO: renamed from: m */
        public E m11937m(int hash) {
            return this.f41029e.get(hash & (r0.length() - 1));
        }

        /* JADX INFO: renamed from: n */
        public ReferenceQueue<K> mo11887n() {
            throw new AssertionError();
        }

        public InterfaceC6510h0<K, V, E> newWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> entry, V value) {
            throw new AssertionError();
        }

        @wx1
        /* JADX INFO: renamed from: o */
        public E m11938o(Object obj, int i) {
            return (E) m11936l(obj, i);
        }

        @wx1
        /* JADX INFO: renamed from: p */
        public V m11939p(E e) {
            if (e.getKey() == null) {
                m11924R();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            m11924R();
            return null;
        }

        @wx1
        /* JADX INFO: renamed from: q */
        public V m11940q(InterfaceC6513j<K, V, ?> entry) {
            return m11939p(castForTesting(entry));
        }

        /* JADX INFO: renamed from: r */
        public ReferenceQueue<V> mo11901r() {
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: s */
        public void m11941s(AtomicReferenceArray<E> newTable) {
            this.f41028d = (newTable.length() * 3) / 4;
            this.f41029e = newTable;
        }

        public void setWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> entry, InterfaceC6510h0<K, V, ? extends InterfaceC6513j<K, V, ?>> valueReference) {
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: u */
        public void mo11888u() {
        }

        @uc7("this")
        /* JADX INFO: renamed from: v */
        public void mo11889v() {
        }

        /* JADX INFO: renamed from: w */
        public AtomicReferenceArray<E> m11942w(int size) {
            return new AtomicReferenceArray<>(size);
        }

        /* JADX INFO: renamed from: x */
        public E m11943x(K k, int i, @wx1 InterfaceC6513j<K, V, ?> interfaceC6513j) {
            return (E) this.f41025a.f40987f.newEntry(mo11885N(), k, i, castForTesting(interfaceC6513j));
        }

        /* JADX INFO: renamed from: y */
        public void m11944y() {
            if ((this.f41030f.incrementAndGet() & 63) == 0) {
                m11919L();
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: z */
        public void m11945z() {
            m11920M();
        }
    }

    /* JADX INFO: renamed from: gt9$p */
    public static final class C6520p<K, V> extends AbstractC6497b<K, V> {
        private static final long serialVersionUID = 3;

        public C6520p(EnumC6521q keyStrength, EnumC6521q valueStrength, r45<Object> keyEquivalence, r45<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            super(keyStrength, valueStrength, keyEquivalence, valueEquivalence, concurrencyLevel, delegate);
        }

        @yg8
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.f40996f = m11882m(in).makeMap();
            m11881l(in);
        }

        private Object readResolve() {
            return this.f40996f;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            m11883n(out);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gt9$q */
    public static abstract class EnumC6521q {

        /* JADX INFO: renamed from: a */
        public static final EnumC6521q f41031a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC6521q f41032b = new b("WEAK", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC6521q[] f41033c = $values();

        /* JADX INFO: renamed from: gt9$q$a */
        public enum a extends EnumC6521q {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gt9.EnumC6521q
            /* JADX INFO: renamed from: a */
            public r45<Object> mo11946a() {
                return r45.equals();
            }
        }

        /* JADX INFO: renamed from: gt9$q$b */
        public enum b extends EnumC6521q {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gt9.EnumC6521q
            /* JADX INFO: renamed from: a */
            public r45<Object> mo11946a() {
                return r45.identity();
            }
        }

        private static /* synthetic */ EnumC6521q[] $values() {
            return new EnumC6521q[]{f41031a, f41032b};
        }

        private EnumC6521q(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC6521q valueOf(String name) {
            return (EnumC6521q) Enum.valueOf(EnumC6521q.class, name);
        }

        public static EnumC6521q[] values() {
            return (EnumC6521q[]) f41033c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract r45<Object> mo11946a();

        public /* synthetic */ EnumC6521q(String str, int i, C6495a c6495a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: gt9$r */
    public static class C6522r<K> extends AbstractC6499c<K, ft9.EnumC5962a, C6522r<K>> implements InterfaceC6528x<K, ft9.EnumC5962a, C6522r<K>> {

        /* JADX INFO: renamed from: gt9$r$a */
        public static final class a<K> implements InterfaceC6515k<K, ft9.EnumC5962a, C6522r<K>, C6523s<K>> {

            /* JADX INFO: renamed from: a */
            public static final a<?> f41034a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K> a<K> m11947a() {
                return (a<K>) f41034a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6522r<K> copy(C6523s<K> segment, C6522r<K> entry, @wx1 C6522r<K> newNext) {
                return newEntry((C6523s) segment, (Object) entry.f40998a, entry.f40999b, (C6522r) newNext);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6522r<K> newEntry(C6523s<K> segment, K key, int hash, @wx1 C6522r<K> next) {
                return next == null ? new C6522r<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6523s<K> newSegment(gt9<K, ft9.EnumC5962a, C6522r<K>, C6523s<K>> map, int initialCapacity) {
                return new C6523s<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6523s<K> segment, C6522r<K> entry, ft9.EnumC5962a value) {
            }
        }

        /* JADX INFO: renamed from: gt9$r$b */
        public static final class b<K> extends C6522r<K> {

            /* JADX INFO: renamed from: c */
            public final C6522r<K> f41035c;

            public b(K key, int hash, C6522r<K> next) {
                super(key, hash, null);
                this.f41035c = next;
            }

            @Override // p000.gt9.C6522r, p000.gt9.InterfaceC6513j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            @Override // p000.gt9.AbstractC6499c, p000.gt9.InterfaceC6513j
            public C6522r<K> getNext() {
                return this.f41035c;
            }
        }

        public /* synthetic */ C6522r(Object obj, int i, C6495a c6495a) {
            this(obj, i);
        }

        private C6522r(K key, int hash) {
            super(key, hash);
        }

        @Override // p000.gt9.InterfaceC6513j
        public final ft9.EnumC5962a getValue() {
            return ft9.EnumC5962a.VALUE;
        }
    }

    /* JADX INFO: renamed from: gt9$s */
    public static final class C6523s<K> extends AbstractC6519o<K, ft9.EnumC5962a, C6522r<K>, C6523s<K>> {
        public C6523s(gt9<K, ft9.EnumC5962a, C6522r<K>, C6523s<K>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public C6523s<K> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        public C6522r<K> castForTesting(InterfaceC6513j<K, ft9.EnumC5962a, ?> entry) {
            return (C6522r) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$t */
    public static class C6524t<K, V> extends AbstractC6499c<K, V, C6524t<K, V>> implements InterfaceC6528x<K, V, C6524t<K, V>> {

        /* JADX INFO: renamed from: c */
        @wx1
        public volatile V f41036c;

        /* JADX INFO: renamed from: gt9$t$a */
        public static final class a<K, V> implements InterfaceC6515k<K, V, C6524t<K, V>, C6525u<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f41037a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K, V> a<K, V> m11951a() {
                return (a<K, V>) f41037a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6524t<K, V> copy(C6525u<K, V> segment, C6524t<K, V> entry, @wx1 C6524t<K, V> newNext) {
                C6524t<K, V> c6524tNewEntry = newEntry((C6525u) segment, (Object) entry.f40998a, entry.f40999b, (C6524t) newNext);
                c6524tNewEntry.f41036c = entry.f41036c;
                return c6524tNewEntry;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6524t<K, V> newEntry(C6525u<K, V> segment, K key, int hash, @wx1 C6524t<K, V> next) {
                return next == null ? new C6524t<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6525u<K, V> newSegment(gt9<K, V, C6524t<K, V>, C6525u<K, V>> map, int initialCapacity) {
                return new C6525u<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6525u<K, V> segment, C6524t<K, V> entry, V value) {
                entry.f41036c = value;
            }
        }

        /* JADX INFO: renamed from: gt9$t$b */
        public static final class b<K, V> extends C6524t<K, V> {

            /* JADX INFO: renamed from: d */
            public final C6524t<K, V> f41038d;

            public b(K key, int hash, C6524t<K, V> next) {
                super(key, hash, null);
                this.f41038d = next;
            }

            @Override // p000.gt9.AbstractC6499c, p000.gt9.InterfaceC6513j
            public C6524t<K, V> getNext() {
                return this.f41038d;
            }
        }

        public /* synthetic */ C6524t(Object obj, int i, C6495a c6495a) {
            this(obj, i);
        }

        @Override // p000.gt9.InterfaceC6513j
        @wx1
        public final V getValue() {
            return this.f41036c;
        }

        private C6524t(K key, int hash) {
            super(key, hash);
            this.f41036c = null;
        }
    }

    /* JADX INFO: renamed from: gt9$u */
    public static final class C6525u<K, V> extends AbstractC6519o<K, V, C6524t<K, V>, C6525u<K, V>> {
        public C6525u(gt9<K, V, C6524t<K, V>, C6525u<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public C6525u<K, V> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        @wx1
        public C6524t<K, V> castForTesting(@wx1 InterfaceC6513j<K, V, ?> entry) {
            return (C6524t) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$v */
    public static class C6526v<K, V> extends AbstractC6499c<K, V, C6526v<K, V>> implements InterfaceC6508g0<K, V, C6526v<K, V>> {

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC6510h0<K, V, C6526v<K, V>> f41039c;

        /* JADX INFO: renamed from: gt9$v$a */
        public static final class a<K, V> implements InterfaceC6515k<K, V, C6526v<K, V>, C6527w<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f41040a = new a<>();

            /* JADX INFO: renamed from: a */
            public static <K, V> a<K, V> m11955a() {
                return (a<K, V>) f41040a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q keyStrength() {
                return EnumC6521q.f41031a;
            }

            @Override // p000.gt9.InterfaceC6515k
            public EnumC6521q valueStrength() {
                return EnumC6521q.f41032b;
            }

            @Override // p000.gt9.InterfaceC6515k
            @wx1
            public C6526v<K, V> copy(C6527w<K, V> segment, C6526v<K, V> entry, @wx1 C6526v<K, V> newNext) {
                if (AbstractC6519o.m11907t(entry)) {
                    return null;
                }
                C6526v<K, V> c6526vNewEntry = newEntry((C6527w) segment, (Object) entry.f40998a, entry.f40999b, (C6526v) newNext);
                c6526vNewEntry.f41039c = entry.f41039c.copyFor(segment.f41042m, c6526vNewEntry);
                return c6526vNewEntry;
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6526v<K, V> newEntry(C6527w<K, V> segment, K key, int hash, @wx1 C6526v<K, V> next) {
                return next == null ? new C6526v<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // p000.gt9.InterfaceC6515k
            public C6527w<K, V> newSegment(gt9<K, V, C6526v<K, V>, C6527w<K, V>> map, int initialCapacity) {
                return new C6527w<>(map, initialCapacity);
            }

            @Override // p000.gt9.InterfaceC6515k
            public void setValue(C6527w<K, V> segment, C6526v<K, V> entry, V value) {
                InterfaceC6510h0 interfaceC6510h0 = entry.f41039c;
                entry.f41039c = new C6512i0(segment.f41042m, value, entry);
                interfaceC6510h0.clear();
            }
        }

        /* JADX INFO: renamed from: gt9$v$b */
        public static final class b<K, V> extends C6526v<K, V> {

            /* JADX INFO: renamed from: d */
            public final C6526v<K, V> f41041d;

            public b(K key, int hash, C6526v<K, V> next) {
                super(key, hash, null);
                this.f41041d = next;
            }

            @Override // p000.gt9.AbstractC6499c, p000.gt9.InterfaceC6513j
            public C6526v<K, V> getNext() {
                return this.f41041d;
            }
        }

        public /* synthetic */ C6526v(Object obj, int i, C6495a c6495a) {
            this(obj, i);
        }

        @Override // p000.gt9.InterfaceC6513j
        @wx1
        public final V getValue() {
            return this.f41039c.get();
        }

        @Override // p000.gt9.InterfaceC6508g0
        public final InterfaceC6510h0<K, V, C6526v<K, V>> getValueReference() {
            return this.f41039c;
        }

        private C6526v(K key, int hash) {
            super(key, hash);
            this.f41039c = gt9.m11865p();
        }
    }

    /* JADX INFO: renamed from: gt9$w */
    public static final class C6527w<K, V> extends AbstractC6519o<K, V, C6526v<K, V>, C6527w<K, V>> {

        /* JADX INFO: renamed from: m */
        public final ReferenceQueue<V> f41042m;

        public C6527w(gt9<K, V, C6526v<K, V>, C6527w<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f41042m = new ReferenceQueue<>();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public C6527w<K, V> mo11885N() {
            return this;
        }

        @Override // p000.gt9.AbstractC6519o
        public InterfaceC6510h0<K, V, C6526v<K, V>> getWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e) {
            return castForTesting((InterfaceC6513j) e).getValueReference();
        }

        @Override // p000.gt9.AbstractC6519o
        public InterfaceC6510h0<K, V, C6526v<K, V>> newWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e, V value) {
            return new C6512i0(this.f41042m, value, castForTesting((InterfaceC6513j) e));
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: r */
        public ReferenceQueue<V> mo11901r() {
            return this.f41042m;
        }

        @Override // p000.gt9.AbstractC6519o
        public void setWeakValueReferenceForTesting(InterfaceC6513j<K, V, ?> e, InterfaceC6510h0<K, V, ? extends InterfaceC6513j<K, V, ?>> valueReference) {
            C6526v<K, V> c6526vCastForTesting = castForTesting((InterfaceC6513j) e);
            InterfaceC6510h0 interfaceC6510h0 = c6526vCastForTesting.f41039c;
            c6526vCastForTesting.f41039c = valueReference;
            interfaceC6510h0.clear();
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: u */
        public void mo11888u() {
            m11926b(this.f41042m);
        }

        @Override // p000.gt9.AbstractC6519o
        /* JADX INFO: renamed from: v */
        public void mo11889v() {
            m11933i(this.f41042m);
        }

        @Override // p000.gt9.AbstractC6519o
        @wx1
        public C6526v<K, V> castForTesting(@wx1 InterfaceC6513j<K, V, ?> entry) {
            return (C6526v) entry;
        }
    }

    /* JADX INFO: renamed from: gt9$x */
    public interface InterfaceC6528x<K, V, E extends InterfaceC6513j<K, V, E>> extends InterfaceC6513j<K, V, E> {
    }

    /* JADX INFO: renamed from: gt9$y */
    public final class C6529y extends gt9<K, V, E, S>.AbstractC6511i<V> {
        public C6529y(final gt9 this$0) {
            super();
        }

        @Override // p000.gt9.AbstractC6511i, java.util.Iterator
        public V next() {
            return m11904c().getValue();
        }
    }

    /* JADX INFO: renamed from: gt9$z */
    public final class C6530z extends AbstractCollection<V> {
        public C6530z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            gt9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o) {
            return gt9.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return gt9.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C6529y(gt9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return gt9.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return gt9.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) gt9.toArrayList(this).toArray(tArr);
        }
    }

    private gt9(ft9 builder, InterfaceC6515k<K, V, E, S> entryHelper) {
        this.f40985d = Math.min(builder.m11151a(), 65536);
        this.f40986e = builder.m11153c();
        this.f40987f = entryHelper;
        int iMin = Math.min(builder.m11152b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f40985d) {
            i3++;
            i4 <<= 1;
        }
        this.f40983b = 32 - i3;
        this.f40982a = i4 - 1;
        this.f40984c = m11873k(i4);
        int i5 = iMin / i4;
        while (i2 < (i4 * i5 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            AbstractC6519o<K, V, E, S>[] abstractC6519oArr = this.f40984c;
            if (i >= abstractC6519oArr.length) {
                return;
            }
            abstractC6519oArr[i] = m11867d(i2);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> gt9<K, V, ? extends InterfaceC6513j<K, V, ?>, ?> m11862c(ft9 builder) {
        EnumC6521q enumC6521qM11154d = builder.m11154d();
        EnumC6521q enumC6521q = EnumC6521q.f41031a;
        if (enumC6521qM11154d == enumC6521q && builder.m11155e() == enumC6521q) {
            return new gt9<>(builder, C6524t.a.m11951a());
        }
        if (builder.m11154d() == enumC6521q && builder.m11155e() == EnumC6521q.f41032b) {
            return new gt9<>(builder, C6526v.a.m11955a());
        }
        EnumC6521q enumC6521qM11154d2 = builder.m11154d();
        EnumC6521q enumC6521q2 = EnumC6521q.f41032b;
        if (enumC6521qM11154d2 == enumC6521q2 && builder.m11155e() == enumC6521q) {
            return new gt9<>(builder, C6500c0.a.m11892a());
        }
        if (builder.m11154d() == enumC6521q2 && builder.m11155e() == enumC6521q2) {
            return new gt9<>(builder, C6504e0.a.m11897a());
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: e */
    public static <K> gt9<K, ft9.EnumC5962a, ? extends InterfaceC6513j<K, ft9.EnumC5962a, ?>, ?> m11863e(ft9 builder) {
        EnumC6521q enumC6521qM11154d = builder.m11154d();
        EnumC6521q enumC6521q = EnumC6521q.f41031a;
        if (enumC6521qM11154d == enumC6521q && builder.m11155e() == enumC6521q) {
            return new gt9<>(builder, C6522r.a.m11947a());
        }
        EnumC6521q enumC6521qM11154d2 = builder.m11154d();
        EnumC6521q enumC6521q2 = EnumC6521q.f41032b;
        if (enumC6521qM11154d2 == enumC6521q2 && builder.m11155e() == enumC6521q) {
            return new gt9<>(builder, C6496a0.a.m11879a());
        }
        if (builder.m11155e() == enumC6521q2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: n */
    public static int m11864n(int h) {
        int i = h + ((h << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: p */
    public static <K, V, E extends InterfaceC6513j<K, V, E>> InterfaceC6510h0<K, V, E> m11865p() {
        return (InterfaceC6510h0<K, V, E>) f40979X;
    }

    @yg8
    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> toArrayList(Collection<E> c) {
        ArrayList<E> arrayList = new ArrayList<>(c.size());
        wg8.addAll(arrayList, c.iterator());
        return arrayList;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public E m11866b(E e, E e2) {
        return (E) m11876o(e.getHash()).m11930f(e, e2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (AbstractC6519o<K, V, E, S> abstractC6519o : this.f40984c) {
            abstractC6519o.m11925a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@wx1 Object key) {
        if (key == null) {
            return false;
        }
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11928d(key, iM11870h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@wx1 Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        AbstractC6519o<K, V, E, S>[] abstractC6519oArr = this.f40984c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = abstractC6519oArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                AbstractC6519o<K, V, E, S> abstractC6519o = abstractC6519oArr[r10];
                int i2 = abstractC6519o.f41026b;
                AtomicReferenceArray<E> atomicReferenceArray = abstractC6519o.f41029e;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V vM11939p = abstractC6519o.m11939p(next);
                        if (vM11939p != null && m11877q().equivalent(obj, vM11939p)) {
                            return true;
                        }
                    }
                }
                j2 += (long) abstractC6519o.f41027c;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC6519o<K, V, E, S> m11867d(int initialCapacity) {
        return this.f40987f.newSegment(this, initialCapacity);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f40981F;
        if (set != null) {
            return set;
        }
        C6509h c6509h = new C6509h();
        this.f40981F = c6509h;
        return c6509h;
    }

    @wx1
    /* JADX INFO: renamed from: f */
    public E m11868f(@wx1 Object obj) {
        if (obj == null) {
            return null;
        }
        int iM11870h = m11870h(obj);
        return (E) m11876o(iM11870h).m11936l(obj, iM11870h);
    }

    @wx1
    /* JADX INFO: renamed from: g */
    public V m11869g(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @wx1
    public V get(@wx1 Object key) {
        if (key == null) {
            return null;
        }
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11935k(key, iM11870h);
    }

    /* JADX INFO: renamed from: h */
    public int m11870h(Object key) {
        return m11864n(this.f40986e.hash(key));
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public boolean m11871i(InterfaceC6513j<K, V, ?> entry) {
        return m11876o(entry.getHash()).m11940q(entry) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        AbstractC6519o<K, V, E, S>[] abstractC6519oArr = this.f40984c;
        long j = 0;
        for (int i = 0; i < abstractC6519oArr.length; i++) {
            if (abstractC6519oArr[i].f41026b != 0) {
                return false;
            }
            j += (long) abstractC6519oArr[i].f41027c;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < abstractC6519oArr.length; i2++) {
            if (abstractC6519oArr[i2].f41026b != 0) {
                return false;
            }
            j -= (long) abstractC6519oArr[i2].f41027c;
        }
        return j == 0;
    }

    @gdi
    /* JADX INFO: renamed from: j */
    public EnumC6521q m11872j() {
        return this.f40987f.keyStrength();
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC6519o<K, V, E, S>[] m11873k(int ssize) {
        return new AbstractC6519o[ssize];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f40988m;
        if (set != null) {
            return set;
        }
        C6517m c6517m = new C6517m();
        this.f40988m = c6517m;
        return c6517m;
    }

    /* JADX INFO: renamed from: l */
    public void m11874l(E entry) {
        int hash = entry.getHash();
        m11876o(hash).m11909B(entry, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public void m11875m(InterfaceC6510h0<K, V, E> interfaceC6510h0) {
        InterfaceC6513j entry = interfaceC6510h0.getEntry();
        int hash = entry.getHash();
        m11876o(hash).m11910C(entry.getKey(), hash, interfaceC6510h0);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC6519o<K, V, E, S> m11876o(int hash) {
        return this.f40984c[(hash >>> this.f40983b) & this.f40982a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V put(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11908A(key, iM11870h, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    @wx1
    public V putIfAbsent(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11908A(key, iM11870h, value, true);
    }

    @gdi
    /* JADX INFO: renamed from: q */
    public r45<Object> m11877q() {
        return this.f40987f.valueStrength().mo11946a();
    }

    @gdi
    /* JADX INFO: renamed from: r */
    public EnumC6521q m11878r() {
        return this.f40987f.valueStrength();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V remove(@wx1 Object key) {
        if (key == null) {
            return null;
        }
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11911D(key, iM11870h);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean replace(K key, @wx1 V oldValue, V newValue) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(newValue);
        if (oldValue == null) {
            return false;
        }
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11918K(key, iM11870h, oldValue, newValue);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (AbstractC6519o<K, V, E, S> abstractC6519o : this.f40984c) {
            j += (long) abstractC6519o.f41026b;
        }
        return rd8.saturatedCast(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f40980C;
        if (collection != null) {
            return collection;
        }
        C6530z c6530z = new C6530z();
        this.f40980C = c6530z;
        return c6530z;
    }

    public Object writeReplace() {
        return new C6520p(this.f40987f.keyStrength(), this.f40987f.valueStrength(), this.f40986e, this.f40987f.valueStrength().mo11946a(), this.f40985d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean remove(@wx1 Object key, @wx1 Object value) {
        if (key == null || value == null) {
            return false;
        }
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11912E(key, iM11870h, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    @wx1
    public V replace(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11870h = m11870h(key);
        return m11876o(iM11870h).m11917J(key, iM11870h, value);
    }
}
