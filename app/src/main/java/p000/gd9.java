package p000;

import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC7697j0;
import p000.gl1;
import p000.jm1;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
public class gd9<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: c2 */
    public static final int f39387c2 = 1073741824;

    /* JADX INFO: renamed from: d2 */
    public static final int f39388d2 = 65536;

    /* JADX INFO: renamed from: e2 */
    public static final int f39389e2 = 3;

    /* JADX INFO: renamed from: f2 */
    public static final int f39390f2 = 63;

    /* JADX INFO: renamed from: g2 */
    public static final int f39391g2 = 16;

    /* JADX INFO: renamed from: h2 */
    public static final Logger f39392h2 = Logger.getLogger(gd9.class.getName());

    /* JADX INFO: renamed from: i2 */
    public static final InterfaceC6220a0<Object, Object> f39393i2 = new C6219a();

    /* JADX INFO: renamed from: j2 */
    public static final Queue<?> f39394j2 = new C6221b();

    /* JADX INFO: renamed from: C */
    public final EnumC6250t f39395C;

    /* JADX INFO: renamed from: F */
    public final long f39396F;

    /* JADX INFO: renamed from: H */
    public final iki<K, V> f39397H;

    /* JADX INFO: renamed from: L */
    public final long f39398L;

    /* JADX INFO: renamed from: M */
    public final long f39399M;

    /* JADX INFO: renamed from: M1 */
    public final AbstractC7697j0.b f39400M1;

    /* JADX INFO: renamed from: N */
    public final long f39401N;

    /* JADX INFO: renamed from: Q */
    public final Queue<ezd<K, V>> f39402Q;

    /* JADX INFO: renamed from: V1 */
    @wx1
    public final jm1<? super K, V> f39403V1;

    /* JADX INFO: renamed from: X */
    public final azd<K, V> f39404X;

    /* JADX INFO: renamed from: Y */
    public final qzg f39405Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC6229f f39406Z;

    /* JADX INFO: renamed from: Z1 */
    @RetainedWith
    @wx1
    @ez8
    public Set<K> f39407Z1;

    /* JADX INFO: renamed from: a */
    public final int f39408a;

    /* JADX INFO: renamed from: a2 */
    @RetainedWith
    @wx1
    @ez8
    public Collection<V> f39409a2;

    /* JADX INFO: renamed from: b */
    public final int f39410b;

    /* JADX INFO: renamed from: b2 */
    @RetainedWith
    @wx1
    @ez8
    public Set<Map.Entry<K, V>> f39411b2;

    /* JADX INFO: renamed from: c */
    public final C6248r<K, V>[] f39412c;

    /* JADX INFO: renamed from: d */
    public final int f39413d;

    /* JADX INFO: renamed from: e */
    public final r45<Object> f39414e;

    /* JADX INFO: renamed from: f */
    public final r45<Object> f39415f;

    /* JADX INFO: renamed from: m */
    public final EnumC6250t f39416m;

    /* JADX INFO: renamed from: gd9$a */
    public class C6219a implements InterfaceC6220a0<Object, Object> {
        @Override // p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<Object, Object> copyFor(ReferenceQueue<Object> queue, @wx1 Object value, qvd<Object, Object> entry) {
            return this;
        }

        @Override // p000.gd9.InterfaceC6220a0
        @wx1
        public Object get() {
            return null;
        }

        @Override // p000.gd9.InterfaceC6220a0
        @wx1
        public qvd<Object, Object> getEntry() {
            return null;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return 0;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isActive() {
            return false;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isLoading() {
            return false;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public void notifyNewValue(Object newValue) {
        }

        @Override // p000.gd9.InterfaceC6220a0
        @wx1
        public Object waitForValue() {
            return null;
        }
    }

    /* JADX INFO: renamed from: gd9$a0 */
    public interface InterfaceC6220a0<K, V> {
        InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, @wx1 V value, qvd<K, V> entry);

        @wx1
        V get();

        @wx1
        qvd<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@wx1 V newValue);

        V waitForValue() throws ExecutionException;
    }

    /* JADX INFO: renamed from: gd9$b */
    public class C6221b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return dy7.m9575of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object o) {
            return true;
        }

        @Override // java.util.Queue
        @wx1
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @wx1
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: gd9$b0 */
    public final class C6222b0 extends AbstractCollection<V> {
        public C6222b0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            gd9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o) {
            return gd9.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return gd9.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C6256z(gd9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return gd9.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return gd9.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) gd9.toArrayList(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: gd9$c */
    public abstract class AbstractC6223c<T> extends AbstractSet<T> {
        public AbstractC6223c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            gd9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return gd9.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return gd9.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return gd9.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) gd9.toArrayList(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: gd9$c0 */
    public static final class C6224c0<K, V> extends C6228e0<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f39419d;

        /* JADX INFO: renamed from: e */
        @Weak
        public qvd<K, V> f39420e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39421f;

        public C6224c0(ReferenceQueue<K> queue, K key, int hash, @wx1 qvd<K, V> next) {
            super(queue, key, hash, next);
            this.f39419d = Long.MAX_VALUE;
            this.f39420e = gd9.m11503A();
            this.f39421f = gd9.m11503A();
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public long getAccessTime() {
            return this.f39419d;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getNextInAccessQueue() {
            return this.f39420e;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getPreviousInAccessQueue() {
            return this.f39421f;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setAccessTime(long time) {
            this.f39419d = time;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setNextInAccessQueue(qvd<K, V> next) {
            this.f39420e = next;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            this.f39421f = previous;
        }
    }

    /* JADX INFO: renamed from: gd9$d */
    public static abstract class AbstractC6225d<K, V> implements qvd<K, V> {
        @Override // p000.qvd
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public qvd<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public qvd<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public qvd<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public qvd<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public qvd<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public InterfaceC6220a0<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setAccessTime(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setNextInAccessQueue(qvd<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setNextInWriteQueue(qvd<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setValueReference(InterfaceC6220a0<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setWriteTime(long time) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: gd9$d0 */
    public static final class C6226d0<K, V> extends C6228e0<K, V> {

        /* JADX INFO: renamed from: C */
        @Weak
        public qvd<K, V> f39422C;

        /* JADX INFO: renamed from: F */
        @Weak
        public qvd<K, V> f39423F;

        /* JADX INFO: renamed from: d */
        public volatile long f39424d;

        /* JADX INFO: renamed from: e */
        @Weak
        public qvd<K, V> f39425e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39426f;

        /* JADX INFO: renamed from: m */
        public volatile long f39427m;

        public C6226d0(ReferenceQueue<K> queue, K key, int hash, @wx1 qvd<K, V> next) {
            super(queue, key, hash, next);
            this.f39424d = Long.MAX_VALUE;
            this.f39425e = gd9.m11503A();
            this.f39426f = gd9.m11503A();
            this.f39427m = Long.MAX_VALUE;
            this.f39422C = gd9.m11503A();
            this.f39423F = gd9.m11503A();
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public long getAccessTime() {
            return this.f39424d;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getNextInAccessQueue() {
            return this.f39425e;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getNextInWriteQueue() {
            return this.f39422C;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getPreviousInAccessQueue() {
            return this.f39426f;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getPreviousInWriteQueue() {
            return this.f39423F;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public long getWriteTime() {
            return this.f39427m;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setAccessTime(long time) {
            this.f39424d = time;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setNextInAccessQueue(qvd<K, V> next) {
            this.f39425e = next;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setNextInWriteQueue(qvd<K, V> next) {
            this.f39422C = next;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            this.f39426f = previous;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            this.f39423F = previous;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setWriteTime(long time) {
            this.f39427m = time;
        }
    }

    /* JADX INFO: renamed from: gd9$e */
    public static final class C6227e<K, V> extends AbstractQueue<qvd<K, V>> {

        /* JADX INFO: renamed from: a */
        public final qvd<K, V> f39428a = new a(this);

        /* JADX INFO: renamed from: gd9$e$a */
        public class a extends AbstractC6225d<K, V> {

            /* JADX INFO: renamed from: a */
            @Weak
            public qvd<K, V> f39429a = this;

            /* JADX INFO: renamed from: b */
            @Weak
            public qvd<K, V> f39430b = this;

            public a(final C6227e this$0) {
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public qvd<K, V> getNextInAccessQueue() {
                return this.f39429a;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public qvd<K, V> getPreviousInAccessQueue() {
                return this.f39430b;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setAccessTime(long time) {
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setNextInAccessQueue(qvd<K, V> next) {
                this.f39429a = next;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setPreviousInAccessQueue(qvd<K, V> previous) {
                this.f39430b = previous;
            }
        }

        /* JADX INFO: renamed from: gd9$e$b */
        public class b extends AbstractC5586f4<qvd<K, V>> {
            public b(qvd firstOrNull) {
                super(firstOrNull);
            }

            @Override // p000.AbstractC5586f4
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public qvd<K, V> mo10501a(qvd<K, V> previous) {
                qvd<K, V> nextInAccessQueue = previous.getNextInAccessQueue();
                if (nextInAccessQueue == C6227e.this.f39428a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            qvd<K, V> nextInAccessQueue = this.f39428a.getNextInAccessQueue();
            while (true) {
                qvd<K, V> qvdVar = this.f39428a;
                if (nextInAccessQueue == qvdVar) {
                    qvdVar.setNextInAccessQueue(qvdVar);
                    qvd<K, V> qvdVar2 = this.f39428a;
                    qvdVar2.setPreviousInAccessQueue(qvdVar2);
                    return;
                } else {
                    qvd<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    gd9.m11504B(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o) {
            return ((qvd) o).getNextInAccessQueue() != EnumC6247q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f39428a.getNextInAccessQueue() == this.f39428a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<qvd<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @op1
        public boolean remove(Object o) {
            qvd qvdVar = (qvd) o;
            qvd<K, V> previousInAccessQueue = qvdVar.getPreviousInAccessQueue();
            qvd<K, V> nextInAccessQueue = qvdVar.getNextInAccessQueue();
            gd9.m11509b(previousInAccessQueue, nextInAccessQueue);
            gd9.m11504B(qvdVar);
            return nextInAccessQueue != EnumC6247q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (qvd<K, V> nextInAccessQueue = this.f39428a.getNextInAccessQueue(); nextInAccessQueue != this.f39428a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.Queue
        public boolean offer(qvd<K, V> entry) {
            gd9.m11509b(entry.getPreviousInAccessQueue(), entry.getNextInAccessQueue());
            gd9.m11509b(this.f39428a.getPreviousInAccessQueue(), entry);
            gd9.m11509b(entry, this.f39428a);
            return true;
        }

        @Override // java.util.Queue
        @wx1
        public qvd<K, V> peek() {
            qvd<K, V> nextInAccessQueue = this.f39428a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f39428a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        @wx1
        public qvd<K, V> poll() {
            qvd<K, V> nextInAccessQueue = this.f39428a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f39428a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }
    }

    /* JADX INFO: renamed from: gd9$e0 */
    public static class C6228e0<K, V> extends WeakReference<K> implements qvd<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f39432a;

        /* JADX INFO: renamed from: b */
        @wx1
        public final qvd<K, V> f39433b;

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC6220a0<K, V> f39434c;

        public C6228e0(ReferenceQueue<K> queue, K key, int hash, @wx1 qvd<K, V> next) {
            super(key, queue);
            this.f39434c = gd9.m11507N();
            this.f39432a = hash;
            this.f39433b = next;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public int getHash() {
            return this.f39432a;
        }

        @Override // p000.qvd
        public K getKey() {
            return get();
        }

        @Override // p000.qvd
        public qvd<K, V> getNext() {
            return this.f39433b;
        }

        public qvd<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public qvd<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public qvd<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public qvd<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public InterfaceC6220a0<K, V> getValueReference() {
            return this.f39434c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long time) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(qvd<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(qvd<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.qvd
        public void setValueReference(InterfaceC6220a0<K, V> valueReference) {
            this.f39434c = valueReference;
        }

        public void setWriteTime(long time) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gd9$f */
    public static abstract class EnumC6229f {

        /* JADX INFO: renamed from: C */
        public static final EnumC6229f f39435C;

        /* JADX INFO: renamed from: F */
        public static final int f39436F = 1;

        /* JADX INFO: renamed from: H */
        public static final int f39437H = 2;

        /* JADX INFO: renamed from: L */
        public static final int f39438L = 4;

        /* JADX INFO: renamed from: M */
        public static final EnumC6229f[] f39439M;

        /* JADX INFO: renamed from: N */
        public static final /* synthetic */ EnumC6229f[] f39440N;

        /* JADX INFO: renamed from: a */
        public static final EnumC6229f f39441a;

        /* JADX INFO: renamed from: b */
        public static final EnumC6229f f39442b;

        /* JADX INFO: renamed from: c */
        public static final EnumC6229f f39443c;

        /* JADX INFO: renamed from: d */
        public static final EnumC6229f f39444d;

        /* JADX INFO: renamed from: e */
        public static final EnumC6229f f39445e;

        /* JADX INFO: renamed from: f */
        public static final EnumC6229f f39446f;

        /* JADX INFO: renamed from: m */
        public static final EnumC6229f f39447m;

        /* JADX INFO: renamed from: gd9$f$a */
        public enum a extends EnumC6229f {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6253w(key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$b */
        public enum b extends EnumC6229f {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11551a(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6251u(key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$c */
        public enum c extends EnumC6229f {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11553c(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6255y(key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$d */
        public enum d extends EnumC6229f {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11551a(original, qvdVarMo11552b);
                m11553c(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6252v(key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$e */
        public enum e extends EnumC6229f {
            public e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6228e0(segment.f39493C, key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$f */
        public enum f extends EnumC6229f {
            public f(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11551a(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6224c0(segment.f39493C, key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$g */
        public enum g extends EnumC6229f {
            public g(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11553c(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6232g0(segment.f39493C, key, hash, next);
            }
        }

        /* JADX INFO: renamed from: gd9$f$h */
        public enum h extends EnumC6229f {
            public h(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: b */
            public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
                qvd<K, V> qvdVarMo11552b = super.mo11552b(segment, original, newNext, key);
                m11551a(original, qvdVarMo11552b);
                m11553c(original, qvdVarMo11552b);
                return qvdVarMo11552b;
            }

            @Override // p000.gd9.EnumC6229f
            /* JADX INFO: renamed from: e */
            public <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next) {
                return new C6226d0(segment.f39493C, key, hash, next);
            }
        }

        private static /* synthetic */ EnumC6229f[] $values() {
            return new EnumC6229f[]{f39441a, f39442b, f39443c, f39444d, f39445e, f39446f, f39447m, f39435C};
        }

        static {
            a aVar = new a("STRONG", 0);
            f39441a = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            f39442b = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            f39443c = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            f39444d = dVar;
            e eVar = new e("WEAK", 4);
            f39445e = eVar;
            f fVar = new f("WEAK_ACCESS", 5);
            f39446f = fVar;
            g gVar = new g("WEAK_WRITE", 6);
            f39447m = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            f39435C = hVar;
            f39440N = $values();
            f39439M = new EnumC6229f[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
        }

        private EnumC6229f(String $enum$name, int $enum$ordinal) {
        }

        /* JADX INFO: renamed from: d */
        public static EnumC6229f m11550d(EnumC6250t enumC6250t, boolean z, boolean z2) {
            return f39439M[(enumC6250t == EnumC6250t.f39510c ? 4 : 0) | (z ? 1 : 0) | (z2 ? 2 : 0)];
        }

        public static EnumC6229f valueOf(String name) {
            return (EnumC6229f) Enum.valueOf(EnumC6229f.class, name);
        }

        public static EnumC6229f[] values() {
            return (EnumC6229f[]) f39440N.clone();
        }

        /* JADX INFO: renamed from: a */
        public <K, V> void m11551a(qvd<K, V> original, qvd<K, V> newEntry) {
            newEntry.setAccessTime(original.getAccessTime());
            gd9.m11509b(original.getPreviousInAccessQueue(), newEntry);
            gd9.m11509b(newEntry, original.getNextInAccessQueue());
            gd9.m11504B(original);
        }

        /* JADX INFO: renamed from: b */
        public <K, V> qvd<K, V> mo11552b(C6248r<K, V> segment, qvd<K, V> original, qvd<K, V> newNext, K key) {
            return mo11554e(segment, key, original.getHash(), newNext);
        }

        /* JADX INFO: renamed from: c */
        public <K, V> void m11553c(qvd<K, V> original, qvd<K, V> newEntry) {
            newEntry.setWriteTime(original.getWriteTime());
            gd9.m11510c(original.getPreviousInWriteQueue(), newEntry);
            gd9.m11510c(newEntry, original.getNextInWriteQueue());
            gd9.m11505C(original);
        }

        /* JADX INFO: renamed from: e */
        public abstract <K, V> qvd<K, V> mo11554e(C6248r<K, V> segment, K key, int hash, @wx1 qvd<K, V> next);

        public /* synthetic */ EnumC6229f(String str, int i, C6219a c6219a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: gd9$f0 */
    public static class C6230f0<K, V> extends WeakReference<V> implements InterfaceC6220a0<K, V> {

        /* JADX INFO: renamed from: a */
        public final qvd<K, V> f39448a;

        public C6230f0(ReferenceQueue<V> queue, V referent, qvd<K, V> entry) {
            super(referent, queue);
            this.f39448a = entry;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, V value, qvd<K, V> entry) {
            return new C6230f0(queue, value, entry);
        }

        @Override // p000.gd9.InterfaceC6220a0
        public qvd<K, V> getEntry() {
            return this.f39448a;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return 1;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isActive() {
            return true;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isLoading() {
            return false;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public void notifyNewValue(V newValue) {
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V waitForValue() {
            return get();
        }
    }

    /* JADX INFO: renamed from: gd9$g */
    public final class C6231g extends gd9<K, V>.AbstractC6235i<Map.Entry<K, V>> {
        public C6231g(final gd9 this$0) {
            super();
        }

        @Override // p000.gd9.AbstractC6235i, java.util.Iterator
        public Map.Entry<K, V> next() {
            return m11557c();
        }
    }

    /* JADX INFO: renamed from: gd9$g0 */
    public static final class C6232g0<K, V> extends C6228e0<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f39449d;

        /* JADX INFO: renamed from: e */
        @Weak
        public qvd<K, V> f39450e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39451f;

        public C6232g0(ReferenceQueue<K> queue, K key, int hash, @wx1 qvd<K, V> next) {
            super(queue, key, hash, next);
            this.f39449d = Long.MAX_VALUE;
            this.f39450e = gd9.m11503A();
            this.f39451f = gd9.m11503A();
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getNextInWriteQueue() {
            return this.f39450e;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public qvd<K, V> getPreviousInWriteQueue() {
            return this.f39451f;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public long getWriteTime() {
            return this.f39449d;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setNextInWriteQueue(qvd<K, V> next) {
            this.f39450e = next;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            this.f39451f = previous;
        }

        @Override // p000.gd9.C6228e0, p000.qvd
        public void setWriteTime(long time) {
            this.f39449d = time;
        }
    }

    /* JADX INFO: renamed from: gd9$h */
    public final class C6233h extends gd9<K, V>.AbstractC6223c<Map.Entry<K, V>> {
        public C6233h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            Map.Entry entry;
            Object key;
            Object obj;
            return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && (obj = gd9.this.get(key)) != null && gd9.this.f39415f.equivalent(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6231g(gd9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            Map.Entry entry;
            Object key;
            return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && gd9.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: renamed from: gd9$h0 */
    public static final class C6234h0<K, V> extends C6249s<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f39453b;

        public C6234h0(ReferenceQueue<V> queue, V referent, qvd<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f39453b = weight;
        }

        @Override // p000.gd9.C6249s, p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, V value, qvd<K, V> entry) {
            return new C6234h0(queue, value, entry, this.f39453b);
        }

        @Override // p000.gd9.C6249s, p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return this.f39453b;
        }
    }

    /* JADX INFO: renamed from: gd9$i */
    public abstract class AbstractC6235i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f39455a;

        /* JADX INFO: renamed from: b */
        public int f39456b = -1;

        /* JADX INFO: renamed from: c */
        @wx1
        public C6248r<K, V> f39457c;

        /* JADX INFO: renamed from: d */
        @wx1
        public AtomicReferenceArray<qvd<K, V>> f39458d;

        /* JADX INFO: renamed from: e */
        @wx1
        public qvd<K, V> f39459e;

        /* JADX INFO: renamed from: f */
        @wx1
        public gd9<K, V>.C6242l0 f39460f;

        /* JADX INFO: renamed from: m */
        @wx1
        public gd9<K, V>.C6242l0 f39461m;

        public AbstractC6235i() {
            this.f39455a = gd9.this.f39412c.length - 1;
            m11555a();
        }

        /* JADX INFO: renamed from: a */
        public final void m11555a() {
            this.f39460f = null;
            if (m11558d() || m11559e()) {
                return;
            }
            while (true) {
                int i = this.f39455a;
                if (i < 0) {
                    return;
                }
                C6248r<K, V>[] c6248rArr = gd9.this.f39412c;
                this.f39455a = i - 1;
                C6248r<K, V> c6248r = c6248rArr[i];
                this.f39457c = c6248r;
                if (c6248r.f39501b != 0) {
                    this.f39458d = this.f39457c.f39505f;
                    this.f39456b = r0.length() - 1;
                    if (m11559e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m11556b(qvd<K, V> entry) {
            try {
                long j = gd9.this.f39405Y.read();
                K key = entry.getKey();
                Object objM11538p = gd9.this.m11538p(entry, j);
                if (objM11538p == null) {
                    this.f39457c.m11570G();
                    return false;
                }
                this.f39460f = new C6242l0(key, objM11538p);
                this.f39457c.m11570G();
                return true;
            } catch (Throwable th) {
                this.f39457c.m11570G();
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public gd9<K, V>.C6242l0 m11557c() {
            gd9<K, V>.C6242l0 c6242l0 = this.f39460f;
            if (c6242l0 == null) {
                throw new NoSuchElementException();
            }
            this.f39461m = c6242l0;
            m11555a();
            return this.f39461m;
        }

        /* JADX INFO: renamed from: d */
        public boolean m11558d() {
            qvd<K, V> qvdVar = this.f39459e;
            if (qvdVar == null) {
                return false;
            }
            while (true) {
                this.f39459e = qvdVar.getNext();
                qvd<K, V> qvdVar2 = this.f39459e;
                if (qvdVar2 == null) {
                    return false;
                }
                if (m11556b(qvdVar2)) {
                    return true;
                }
                qvdVar = this.f39459e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m11559e() {
            while (true) {
                int i = this.f39456b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39458d;
                this.f39456b = i - 1;
                qvd<K, V> qvdVar = atomicReferenceArray.get(i);
                this.f39459e = qvdVar;
                if (qvdVar != null && (m11556b(qvdVar) || m11558d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39460f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            v7d.checkState(this.f39461m != null);
            gd9.this.remove(this.f39461m.getKey());
            this.f39461m = null;
        }
    }

    /* JADX INFO: renamed from: gd9$i0 */
    public static final class C6236i0<K, V> extends C6254x<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f39462b;

        public C6236i0(V referent, int weight) {
            super(referent);
            this.f39462b = weight;
        }

        @Override // p000.gd9.C6254x, p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return this.f39462b;
        }
    }

    /* JADX INFO: renamed from: gd9$j */
    public final class C6237j extends gd9<K, V>.AbstractC6235i<K> {
        public C6237j(final gd9 this$0) {
            super();
        }

        @Override // p000.gd9.AbstractC6235i, java.util.Iterator
        public K next() {
            return m11557c().getKey();
        }
    }

    /* JADX INFO: renamed from: gd9$j0 */
    public static final class C6238j0<K, V> extends C6230f0<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f39463b;

        public C6238j0(ReferenceQueue<V> queue, V referent, qvd<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f39463b = weight;
        }

        @Override // p000.gd9.C6230f0, p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, V value, qvd<K, V> entry) {
            return new C6238j0(queue, value, entry, this.f39463b);
        }

        @Override // p000.gd9.C6230f0, p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return this.f39463b;
        }
    }

    /* JADX INFO: renamed from: gd9$k */
    public final class C6239k extends gd9<K, V>.AbstractC6223c<K> {
        public C6239k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            return gd9.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C6237j(gd9.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            return gd9.this.remove(o) != null;
        }
    }

    /* JADX INFO: renamed from: gd9$k0 */
    public static final class C6240k0<K, V> extends AbstractQueue<qvd<K, V>> {

        /* JADX INFO: renamed from: a */
        public final qvd<K, V> f39465a = new a(this);

        /* JADX INFO: renamed from: gd9$k0$a */
        public class a extends AbstractC6225d<K, V> {

            /* JADX INFO: renamed from: a */
            @Weak
            public qvd<K, V> f39466a = this;

            /* JADX INFO: renamed from: b */
            @Weak
            public qvd<K, V> f39467b = this;

            public a(final C6240k0 this$0) {
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public qvd<K, V> getNextInWriteQueue() {
                return this.f39466a;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public qvd<K, V> getPreviousInWriteQueue() {
                return this.f39467b;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setNextInWriteQueue(qvd<K, V> next) {
                this.f39466a = next;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setPreviousInWriteQueue(qvd<K, V> previous) {
                this.f39467b = previous;
            }

            @Override // p000.gd9.AbstractC6225d, p000.qvd
            public void setWriteTime(long time) {
            }
        }

        /* JADX INFO: renamed from: gd9$k0$b */
        public class b extends AbstractC5586f4<qvd<K, V>> {
            public b(qvd firstOrNull) {
                super(firstOrNull);
            }

            @Override // p000.AbstractC5586f4
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public qvd<K, V> mo10501a(qvd<K, V> previous) {
                qvd<K, V> nextInWriteQueue = previous.getNextInWriteQueue();
                if (nextInWriteQueue == C6240k0.this.f39465a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            qvd<K, V> nextInWriteQueue = this.f39465a.getNextInWriteQueue();
            while (true) {
                qvd<K, V> qvdVar = this.f39465a;
                if (nextInWriteQueue == qvdVar) {
                    qvdVar.setNextInWriteQueue(qvdVar);
                    qvd<K, V> qvdVar2 = this.f39465a;
                    qvdVar2.setPreviousInWriteQueue(qvdVar2);
                    return;
                } else {
                    qvd<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    gd9.m11505C(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o) {
            return ((qvd) o).getNextInWriteQueue() != EnumC6247q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f39465a.getNextInWriteQueue() == this.f39465a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<qvd<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @op1
        public boolean remove(Object o) {
            qvd qvdVar = (qvd) o;
            qvd<K, V> previousInWriteQueue = qvdVar.getPreviousInWriteQueue();
            qvd<K, V> nextInWriteQueue = qvdVar.getNextInWriteQueue();
            gd9.m11510c(previousInWriteQueue, nextInWriteQueue);
            gd9.m11505C(qvdVar);
            return nextInWriteQueue != EnumC6247q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (qvd<K, V> nextInWriteQueue = this.f39465a.getNextInWriteQueue(); nextInWriteQueue != this.f39465a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.Queue
        public boolean offer(qvd<K, V> entry) {
            gd9.m11510c(entry.getPreviousInWriteQueue(), entry.getNextInWriteQueue());
            gd9.m11510c(this.f39465a.getPreviousInWriteQueue(), entry);
            gd9.m11510c(entry, this.f39465a);
            return true;
        }

        @Override // java.util.Queue
        @wx1
        public qvd<K, V> peek() {
            qvd<K, V> nextInWriteQueue = this.f39465a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f39465a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        @wx1
        public qvd<K, V> poll() {
            qvd<K, V> nextInWriteQueue = this.f39465a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f39465a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }
    }

    /* JADX INFO: renamed from: gd9$l */
    public static final class C6241l<K, V> extends C6246p<K, V> implements ad9<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: Q */
        @wx1
        public transient ad9<K, V> f39469Q;

        public C6241l(gd9<K, V> cache) {
            super(cache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f39469Q = (ad9<K, V>) m11562b().build(this.f39482M);
        }

        private Object readResolve() {
            return this.f39469Q;
        }

        @Override // p000.ad9, p000.lz6
        public V apply(K key) {
            return this.f39469Q.apply(key);
        }

        @Override // p000.ad9
        public V get(K key) throws ExecutionException {
            return this.f39469Q.get(key);
        }

        @Override // p000.ad9
        public ox7<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
            return this.f39469Q.getAll(keys);
        }

        @Override // p000.ad9
        public V getUnchecked(K key) {
            return this.f39469Q.getUnchecked(key);
        }

        @Override // p000.ad9
        public void refresh(K key) {
            this.f39469Q.refresh(key);
        }
    }

    /* JADX INFO: renamed from: gd9$l0 */
    public final class C6242l0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f39470a;

        /* JADX INFO: renamed from: b */
        public V f39471b;

        public C6242l0(K key, V value) {
            this.f39470a = key;
            this.f39471b = value;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f39470a.equals(entry.getKey()) && this.f39471b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f39470a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f39471b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f39470a.hashCode() ^ this.f39471b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) gd9.this.put(this.f39470a, v);
            this.f39471b = v;
            return v2;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: gd9$m */
    public static class C6243m<K, V> implements InterfaceC6220a0<K, V> {

        /* JADX INFO: renamed from: a */
        public volatile InterfaceC6220a0<K, V> f39473a;

        /* JADX INFO: renamed from: b */
        public final y6f<V> f39474b;

        /* JADX INFO: renamed from: c */
        public final d5g f39475c;

        public C6243m() {
            this(gd9.m11507N());
        }

        private ja9<V> fullyFailedFuture(Throwable t) {
            return w17.immediateFailedFuture(t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object lambda$loadFuture$0(Object obj) {
            set(obj);
            return obj;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, @wx1 V value, qvd<K, V> entry) {
            return this;
        }

        public long elapsedNanos() {
            return this.f39475c.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V get() {
            return this.f39473a.get();
        }

        @Override // p000.gd9.InterfaceC6220a0
        public qvd<K, V> getEntry() {
            return null;
        }

        public InterfaceC6220a0<K, V> getOldValue() {
            return this.f39473a;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return this.f39473a.getWeight();
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isActive() {
            return this.f39473a.isActive();
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isLoading() {
            return true;
        }

        public ja9<V> loadFuture(K key, jm1<? super K, V> loader) {
            try {
                this.f39475c.start();
                V v = this.f39473a.get();
                if (v == null) {
                    V vLoad = loader.load(key);
                    return set(vLoad) ? this.f39474b : w17.immediateFuture(vLoad);
                }
                ja9<V> ja9VarReload = loader.reload(key, v);
                return ja9VarReload == null ? w17.immediateFuture(null) : w17.transform(ja9VarReload, new lz6() { // from class: hd9
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return this.f43196a.lambda$loadFuture$0(obj);
                    }
                }, xya.directExecutor());
            } catch (Throwable th) {
                ja9<V> ja9VarFullyFailedFuture = setException(th) ? this.f39474b : fullyFailedFuture(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return ja9VarFullyFailedFuture;
            }
        }

        @Override // p000.gd9.InterfaceC6220a0
        public void notifyNewValue(@wx1 V newValue) {
            if (newValue != null) {
                set(newValue);
            } else {
                this.f39473a = gd9.m11507N();
            }
        }

        @op1
        public boolean set(@wx1 V newValue) {
            return this.f39474b.set(newValue);
        }

        @op1
        public boolean setException(Throwable t) {
            return this.f39474b.setException(t);
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V waitForValue() throws ExecutionException {
            return (V) vsh.getUninterruptibly(this.f39474b);
        }

        public C6243m(InterfaceC6220a0<K, V> oldValue) {
            this.f39474b = y6f.create();
            this.f39475c = d5g.createUnstarted();
            this.f39473a = oldValue;
        }
    }

    /* JADX INFO: renamed from: gd9$n */
    public static class C6244n<K, V> extends C6245o<K, V> implements ad9<K, V> {
        private static final long serialVersionUID = 1;

        public C6244n(gl1<? super K, ? super V> builder, jm1<? super K, V> loader) {
            super(new gd9(builder, (jm1) v7d.checkNotNull(loader)), null);
        }

        private void readObject(ObjectInputStream in) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // p000.ad9, p000.lz6
        public final V apply(K key) {
            return getUnchecked(key);
        }

        @Override // p000.ad9
        public V get(K key) throws ExecutionException {
            return this.f39476a.m11539q(key);
        }

        @Override // p000.ad9
        public ox7<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
            return this.f39476a.m11535m(keys);
        }

        @Override // p000.ad9
        @op1
        public V getUnchecked(K key) {
            try {
                return get(key);
            } catch (ExecutionException e) {
                throw new orh(e.getCause());
            }
        }

        @Override // p000.ad9
        public void refresh(K key) {
            this.f39476a.m11518J(key);
        }

        @Override // p000.gd9.C6245o
        public Object writeReplace() {
            return new C6241l(this.f39476a);
        }
    }

    /* JADX INFO: renamed from: gd9$o */
    public static class C6245o<K, V> implements el1<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a */
        public final gd9<K, V> f39476a;

        /* JADX INFO: renamed from: gd9$o$a */
        public class a extends jm1<Object, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callable f39477a;

            public a(final C6245o this$0, final Callable val$valueLoader) {
                this.f39477a = val$valueLoader;
            }

            @Override // p000.jm1
            public V load(Object obj) throws Exception {
                return (V) this.f39477a.call();
            }
        }

        public /* synthetic */ C6245o(gd9 gd9Var, C6219a c6219a) {
            this(gd9Var);
        }

        private void readObject(ObjectInputStream in) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // p000.el1
        public ConcurrentMap<K, V> asMap() {
            return this.f39476a;
        }

        @Override // p000.el1
        public void cleanUp() {
            this.f39476a.cleanUp();
        }

        @Override // p000.el1
        public V get(K key, final Callable<? extends V> valueLoader) throws ExecutionException {
            v7d.checkNotNull(valueLoader);
            return this.f39476a.m11534l(key, new a(this, valueLoader));
        }

        @Override // p000.el1
        public ox7<K, V> getAllPresent(Iterable<?> keys) {
            return this.f39476a.m11536n(keys);
        }

        @Override // p000.el1
        @wx1
        public V getIfPresent(Object key) {
            return this.f39476a.getIfPresent(key);
        }

        @Override // p000.el1
        public void invalidate(Object key) {
            v7d.checkNotNull(key);
            this.f39476a.remove(key);
        }

        @Override // p000.el1
        public void invalidateAll(Iterable<?> keys) {
            this.f39476a.m11541s(keys);
        }

        @Override // p000.el1
        public void put(K key, V value) {
            this.f39476a.put(key, value);
        }

        @Override // p000.el1
        public void putAll(Map<? extends K, ? extends V> m) {
            this.f39476a.putAll(m);
        }

        @Override // p000.el1
        public long size() {
            return this.f39476a.m11545w();
        }

        @Override // p000.el1
        public om1 stats() {
            AbstractC7697j0.a aVar = new AbstractC7697j0.a();
            aVar.incrementBy(this.f39476a.f39400M1);
            for (C6248r<K, V> c6248r : this.f39476a.f39412c) {
                aVar.incrementBy(c6248r.f39499Q);
            }
            return aVar.snapshot();
        }

        public Object writeReplace() {
            return new C6246p(this.f39476a);
        }

        public C6245o(gl1<? super K, ? super V> builder) {
            this(new gd9(builder, null));
        }

        @Override // p000.el1
        public void invalidateAll() {
            this.f39476a.clear();
        }

        private C6245o(gd9<K, V> localCache) {
            this.f39476a = localCache;
        }
    }

    /* JADX INFO: renamed from: gd9$p */
    public static class C6246p<K, V> extends cr6<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: C */
        public final iki<K, V> f39478C;

        /* JADX INFO: renamed from: F */
        public final int f39479F;

        /* JADX INFO: renamed from: H */
        public final azd<? super K, ? super V> f39480H;

        /* JADX INFO: renamed from: L */
        @wx1
        public final qzg f39481L;

        /* JADX INFO: renamed from: M */
        public final jm1<? super K, V> f39482M;

        /* JADX INFO: renamed from: N */
        @wx1
        public transient el1<K, V> f39483N;

        /* JADX INFO: renamed from: a */
        public final EnumC6250t f39484a;

        /* JADX INFO: renamed from: b */
        public final EnumC6250t f39485b;

        /* JADX INFO: renamed from: c */
        public final r45<Object> f39486c;

        /* JADX INFO: renamed from: d */
        public final r45<Object> f39487d;

        /* JADX INFO: renamed from: e */
        public final long f39488e;

        /* JADX INFO: renamed from: f */
        public final long f39489f;

        /* JADX INFO: renamed from: m */
        public final long f39490m;

        public C6246p(gd9<K, V> cache) {
            this(cache.f39416m, cache.f39395C, cache.f39414e, cache.f39415f, cache.f39399M, cache.f39398L, cache.f39396F, cache.f39397H, cache.f39413d, cache.f39404X, cache.f39405Y, cache.f39403V1);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f39483N = (el1<K, V>) m11562b().build();
        }

        private Object readResolve() {
            return this.f39483N;
        }

        @Override // p000.cr6, p000.zs6
        /* JADX INFO: renamed from: a */
        public el1<K, V> mo8967m() {
            return this.f39483N;
        }

        /* JADX INFO: renamed from: b */
        public gl1<K, V> m11562b() {
            gl1<K, V> gl1Var = (gl1<K, V>) gl1.newBuilder().m11742r(this.f39484a).m11743s(this.f39485b).m11740p(this.f39486c).m11744t(this.f39487d).concurrencyLevel(this.f39479F).removalListener(this.f39480H);
            gl1Var.f40103a = false;
            long j = this.f39488e;
            if (j > 0) {
                gl1Var.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f39489f;
            if (j2 > 0) {
                gl1Var.expireAfterAccess(j2, TimeUnit.NANOSECONDS);
            }
            iki ikiVar = this.f39478C;
            if (ikiVar != gl1.EnumC6373f.INSTANCE) {
                gl1Var.weigher(ikiVar);
                long j3 = this.f39490m;
                if (j3 != -1) {
                    gl1Var.maximumWeight(j3);
                }
            } else {
                long j4 = this.f39490m;
                if (j4 != -1) {
                    gl1Var.maximumSize(j4);
                }
            }
            qzg qzgVar = this.f39481L;
            if (qzgVar != null) {
                gl1Var.ticker(qzgVar);
            }
            return gl1Var;
        }

        private C6246p(EnumC6250t keyStrength, EnumC6250t valueStrength, r45<Object> keyEquivalence, r45<Object> valueEquivalence, long expireAfterWriteNanos, long expireAfterAccessNanos, long maxWeight, iki<K, V> weigher, int concurrencyLevel, azd<? super K, ? super V> removalListener, qzg ticker, jm1<? super K, V> loader) {
            this.f39484a = keyStrength;
            this.f39485b = valueStrength;
            this.f39486c = keyEquivalence;
            this.f39487d = valueEquivalence;
            this.f39488e = expireAfterWriteNanos;
            this.f39489f = expireAfterAccessNanos;
            this.f39490m = maxWeight;
            this.f39478C = weigher;
            this.f39479F = concurrencyLevel;
            this.f39480H = removalListener;
            this.f39481L = (ticker == qzg.systemTicker() || ticker == gl1.f40101x) ? null : ticker;
            this.f39482M = loader;
        }
    }

    /* JADX INFO: renamed from: gd9$q */
    public enum EnumC6247q implements qvd<Object, Object> {
        INSTANCE;

        @Override // p000.qvd
        public long getAccessTime() {
            return 0L;
        }

        @Override // p000.qvd
        public int getHash() {
            return 0;
        }

        @Override // p000.qvd
        @wx1
        public Object getKey() {
            return null;
        }

        @Override // p000.qvd
        @wx1
        public qvd<Object, Object> getNext() {
            return null;
        }

        @Override // p000.qvd
        public qvd<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // p000.qvd
        public qvd<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // p000.qvd
        public qvd<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // p000.qvd
        public qvd<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // p000.qvd
        @wx1
        public InterfaceC6220a0<Object, Object> getValueReference() {
            return null;
        }

        @Override // p000.qvd
        public long getWriteTime() {
            return 0L;
        }

        @Override // p000.qvd
        public void setAccessTime(long time) {
        }

        @Override // p000.qvd
        public void setNextInAccessQueue(qvd<Object, Object> next) {
        }

        @Override // p000.qvd
        public void setNextInWriteQueue(qvd<Object, Object> next) {
        }

        @Override // p000.qvd
        public void setPreviousInAccessQueue(qvd<Object, Object> previous) {
        }

        @Override // p000.qvd
        public void setPreviousInWriteQueue(qvd<Object, Object> previous) {
        }

        @Override // p000.qvd
        public void setValueReference(InterfaceC6220a0<Object, Object> valueReference) {
        }

        @Override // p000.qvd
        public void setWriteTime(long time) {
        }
    }

    /* JADX INFO: renamed from: gd9$r */
    public static class C6248r<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: C */
        @wx1
        public final ReferenceQueue<K> f39493C;

        /* JADX INFO: renamed from: F */
        @wx1
        public final ReferenceQueue<V> f39494F;

        /* JADX INFO: renamed from: H */
        public final Queue<qvd<K, V>> f39495H;

        /* JADX INFO: renamed from: L */
        public final AtomicInteger f39496L = new AtomicInteger();

        /* JADX INFO: renamed from: M */
        @uc7("this")
        public final Queue<qvd<K, V>> f39497M;

        /* JADX INFO: renamed from: N */
        @uc7("this")
        public final Queue<qvd<K, V>> f39498N;

        /* JADX INFO: renamed from: Q */
        public final AbstractC7697j0.b f39499Q;

        /* JADX INFO: renamed from: a */
        @Weak
        public final gd9<K, V> f39500a;

        /* JADX INFO: renamed from: b */
        public volatile int f39501b;

        /* JADX INFO: renamed from: c */
        @uc7("this")
        public long f39502c;

        /* JADX INFO: renamed from: d */
        public int f39503d;

        /* JADX INFO: renamed from: e */
        public int f39504e;

        /* JADX INFO: renamed from: f */
        @wx1
        public volatile AtomicReferenceArray<qvd<K, V>> f39505f;

        /* JADX INFO: renamed from: m */
        public final long f39506m;

        public C6248r(gd9<K, V> map, int initialCapacity, long maxSegmentWeight, AbstractC7697j0.b statsCounter) {
            this.f39500a = map;
            this.f39506m = maxSegmentWeight;
            this.f39499Q = (AbstractC7697j0.b) v7d.checkNotNull(statsCounter);
            m11621z(m11569F(initialCapacity));
            this.f39493C = map.m11523Q() ? new ReferenceQueue<>() : null;
            this.f39494F = map.m11524R() ? new ReferenceQueue<>() : null;
            this.f39495H = map.m11522P() ? new ConcurrentLinkedQueue<>() : gd9.m11511g();
            this.f39497M = map.m11526T() ? new C6240k0<>() : gd9.m11511g();
            this.f39498N = map.m11522P() ? new C6227e<>() : gd9.m11511g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$loadAsync$0(Object obj, int i, C6243m c6243m, ja9 ja9Var) {
            try {
                m11615t(obj, i, c6243m, ja9Var);
            } catch (Throwable th) {
                gd9.f39392h2.log(Level.WARNING, "Exception thrown during refresh", th);
                c6243m.setException(th);
            }
        }

        /* JADX WARN: Finally extract failed */
        @wx1
        /* JADX INFO: renamed from: A */
        public C6243m<K, V> m11564A(K k, int i, boolean z) {
            lock();
            try {
                long j = this.f39500a.f39405Y.read();
                m11572I(j);
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                int length = (atomicReferenceArray.length() - 1) & i;
                qvd<K, V> qvdVar = (qvd) atomicReferenceArray.get(length);
                for (qvd next = qvdVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f39500a.f39414e.equivalent(k, key)) {
                        InterfaceC6220a0<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z || j - next.getWriteTime() >= this.f39500a.f39401N)) {
                            this.f39503d++;
                            C6243m<K, V> c6243m = new C6243m<>(valueReference);
                            next.setValueReference(c6243m);
                            unlock();
                            m11571H();
                            return c6243m;
                        }
                        unlock();
                        m11571H();
                        return null;
                    }
                }
                this.f39503d++;
                C6243m<K, V> c6243m2 = new C6243m<>();
                qvd<K, V> qvdVarM11568E = m11568E(k, i, qvdVar);
                qvdVarM11568E.setValueReference(c6243m2);
                atomicReferenceArray.set(length, qvdVarM11568E);
                unlock();
                m11571H();
                return c6243m2;
            } catch (Throwable th) {
                unlock();
                m11571H();
                throw th;
            }
        }

        /* JADX INFO: renamed from: B */
        public ja9<V> m11565B(final K key, final int hash, final C6243m<K, V> loadingValueReference, jm1<? super K, V> loader) {
            final ja9<V> ja9VarLoadFuture = loadingValueReference.loadFuture(key, loader);
            ja9VarLoadFuture.addListener(new Runnable() { // from class: id9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46546a.lambda$loadAsync$0(key, hash, loadingValueReference, ja9VarLoadFuture);
                }
            }, xya.directExecutor());
            return ja9VarLoadFuture;
        }

        /* JADX INFO: renamed from: C */
        public V m11566C(K key, int hash, C6243m<K, V> loadingValueReference, jm1<? super K, V> loader) throws ExecutionException {
            return m11615t(key, hash, loadingValueReference, loadingValueReference.loadFuture(key, loader));
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        
            if (r1 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        
            r15 = new p000.gd9.C6243m<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (r14 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
        
            r14 = m11568E(r18, r19, r13);
            r14.setValueReference(r15);
            r11.set(r12, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        
            r14.setValueReference(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        
            unlock();
            m11571H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
        
            if (r1 == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
        
            monitor-enter(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        
            r0 = m11566C(r18, r19, r15, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        
            monitor-exit(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        
            r17.f39499Q.recordMisses(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        
            return m11602g0(r14, r18, r2);
         */
        /* JADX INFO: renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V m11567D(K r18, int r19, p000.jm1<? super K, V> r20) throws java.util.concurrent.ExecutionException {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11567D(java.lang.Object, int, jm1):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @uc7("this")
        /* JADX INFO: renamed from: E */
        public qvd<K, V> m11568E(K key, int hash, @wx1 qvd<K, V> next) {
            return this.f39500a.f39406Z.mo11554e(this, v7d.checkNotNull(key), hash, next);
        }

        /* JADX INFO: renamed from: F */
        public AtomicReferenceArray<qvd<K, V>> m11569F(int size) {
            return new AtomicReferenceArray<>(size);
        }

        /* JADX INFO: renamed from: G */
        public void m11570G() {
            if ((this.f39496L.incrementAndGet() & 63) == 0) {
                m11591b();
            }
        }

        /* JADX INFO: renamed from: H */
        public void m11571H() {
            m11590a0();
        }

        @uc7("this")
        /* JADX INFO: renamed from: I */
        public void m11572I(long now) {
            m11589Z(now);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        
            unlock();
            m11571H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        
            return null;
         */
        @p000.op1
        @p000.wx1
        /* JADX INFO: renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V m11573J(K r15, int r16, V r17, boolean r18) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11573J(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        @op1
        /* JADX INFO: renamed from: K */
        public boolean m11574K(qvd<K, V> entry, int hash) {
            lock();
            try {
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                qvd<K, V> qvdVar = atomicReferenceArray.get(length);
                for (qvd<K, V> next = qvdVar; next != null; next = next.getNext()) {
                    if (next == entry) {
                        this.f39503d++;
                        qvd<K, V> qvdVarM11586W = m11586W(qvdVar, next, next.getKey(), hash, next.getValueReference().get(), next.getValueReference(), zyd.f106517c);
                        int i = this.f39501b - 1;
                        atomicReferenceArray.set(length, qvdVarM11586W);
                        this.f39501b = i;
                        return true;
                    }
                }
                unlock();
                m11571H();
                return false;
            } finally {
                unlock();
                m11571H();
            }
        }

        @op1
        /* JADX INFO: renamed from: L */
        public boolean m11575L(K key, int hash, InterfaceC6220a0<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                qvd<K, V> qvdVar = atomicReferenceArray.get(length);
                for (qvd<K, V> next = qvdVar; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.f39500a.f39414e.equivalent(key, key2)) {
                        if (next.getValueReference() != valueReference) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                m11571H();
                            }
                            return false;
                        }
                        this.f39503d++;
                        qvd<K, V> qvdVarM11586W = m11586W(qvdVar, next, key2, hash, valueReference.get(), valueReference, zyd.f106517c);
                        int i = this.f39501b - 1;
                        atomicReferenceArray.set(length, qvdVarM11586W);
                        this.f39501b = i;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m11571H();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m11571H();
                }
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: M */
        public void m11576M(qvd<K, V> entry, long now) {
            if (this.f39500a.m11515G()) {
                entry.setAccessTime(now);
            }
            this.f39498N.add(entry);
        }

        /* JADX INFO: renamed from: N */
        public void m11577N(qvd<K, V> entry, long now) {
            if (this.f39500a.m11515G()) {
                entry.setAccessTime(now);
            }
            this.f39495H.add(entry);
        }

        @uc7("this")
        /* JADX INFO: renamed from: O */
        public void m11578O(qvd<K, V> entry, int weight, long now) {
            m11606k();
            this.f39502c += (long) weight;
            if (this.f39500a.m11515G()) {
                entry.setAccessTime(now);
            }
            if (this.f39500a.m11517I()) {
                entry.setWriteTime(now);
            }
            this.f39498N.add(entry);
            this.f39497M.add(entry);
        }

        @op1
        @wx1
        /* JADX INFO: renamed from: P */
        public V m11579P(K k, int i, jm1<? super K, V> jm1Var, boolean z) {
            C6243m<K, V> c6243mM11564A = m11564A(k, i, z);
            if (c6243mM11564A == null) {
                return null;
            }
            ja9<V> ja9VarM11565B = m11565B(k, i, c6243mM11564A, jm1Var);
            if (ja9VarM11565B.isDone()) {
                try {
                    return (V) vsh.getUninterruptibly(ja9VarM11565B);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if (r12 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            r2 = p000.zyd.f106515a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r9.isActive() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            r2 = p000.zyd.f106517c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            r11.f39503d++;
            r13 = m11586W(r4, r5, r6, r13, r12, r9, r10);
            r2 = r11.f39501b - 1;
            r0.set(r1, r13);
            r11.f39501b = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        
            unlock();
            m11571H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        
            return r12;
         */
        @p000.wx1
        /* JADX INFO: renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V m11580Q(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                gd9<K, V> r0 = r11.f39500a     // Catch: java.lang.Throwable -> L46
                qzg r0 = r0.f39405Y     // Catch: java.lang.Throwable -> L46
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L46
                r11.m11572I(r0)     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.atomic.AtomicReferenceArray<qvd<K, V>> r0 = r11.f39505f     // Catch: java.lang.Throwable -> L46
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L46
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L46
                r4 = r2
                qvd r4 = (p000.qvd) r4     // Catch: java.lang.Throwable -> L46
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6e
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L46
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L46
                if (r3 != r13) goto L75
                if (r6 == 0) goto L75
                gd9<K, V> r3 = r11.f39500a     // Catch: java.lang.Throwable -> L46
                r45<java.lang.Object> r3 = r3.f39414e     // Catch: java.lang.Throwable -> L46
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L75
                gd9$a0 r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L46
                if (r12 == 0) goto L48
                zyd r2 = p000.zyd.f106515a     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r2
                goto L51
            L46:
                r12 = move-exception
                goto L7a
            L48:
                boolean r3 = r9.isActive()     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L6e
                zyd r2 = p000.zyd.f106517c     // Catch: java.lang.Throwable -> L46
                goto L44
            L51:
                int r2 = r11.f39503d     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + 1
                r11.f39503d = r2     // Catch: java.lang.Throwable -> L46
                r3 = r11
                r7 = r13
                r8 = r12
                qvd r13 = r3.m11586W(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L46
                int r2 = r11.f39501b     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + (-1)
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L46
                r11.f39501b = r2     // Catch: java.lang.Throwable -> L46
                r11.unlock()
                r11.m11571H()
                return r12
            L6e:
                r11.unlock()
                r11.m11571H()
                return r2
            L75:
                qvd r5 = r5.getNext()     // Catch: java.lang.Throwable -> L46
                goto L1f
            L7a:
                r11.unlock()
                r11.m11571H()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11580Q(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (r12.f39500a.f39415f.equivalent(r15, r9) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r13 = p000.zyd.f106515a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            if (r9 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r10.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            r13 = p000.zyd.f106517c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            r12.f39503d++;
            r14 = m11586W(r5, r6, r7, r14, r9, r10, r13);
            r15 = r12.f39501b - 1;
            r0.set(r1, r14);
            r12.f39501b = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        
            if (r13 != p000.zyd.f106515a) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            unlock();
            m11571H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            return r2;
         */
        /* JADX INFO: renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m11581R(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                gd9<K, V> r0 = r12.f39500a     // Catch: java.lang.Throwable -> L4d
                qzg r0 = r0.f39405Y     // Catch: java.lang.Throwable -> L4d
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L4d
                r12.m11572I(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray<qvd<K, V>> r0 = r12.f39505f     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r5 = r3
                qvd r5 = (p000.qvd) r5     // Catch: java.lang.Throwable -> L4d
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L7a
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r4 != r14) goto L81
                if (r7 == 0) goto L81
                gd9<K, V> r4 = r12.f39500a     // Catch: java.lang.Throwable -> L4d
                r45<java.lang.Object> r4 = r4.f39414e     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L81
                gd9$a0 r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L4d
                gd9<K, V> r13 = r12.f39500a     // Catch: java.lang.Throwable -> L4d
                r45<java.lang.Object> r13 = r13.f39415f     // Catch: java.lang.Throwable -> L4d
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L4f
                zyd r13 = p000.zyd.f106515a     // Catch: java.lang.Throwable -> L4d
                goto L59
            L4d:
                r13 = move-exception
                goto L86
            L4f:
                if (r9 != 0) goto L7a
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L7a
                zyd r13 = p000.zyd.f106517c     // Catch: java.lang.Throwable -> L4d
            L59:
                int r15 = r12.f39503d     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 + r2
                r12.f39503d = r15     // Catch: java.lang.Throwable -> L4d
                r4 = r12
                r8 = r14
                r11 = r13
                qvd r14 = r4.m11586W(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4d
                int r15 = r12.f39501b     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 - r2
                r0.set(r1, r14)     // Catch: java.lang.Throwable -> L4d
                r12.f39501b = r15     // Catch: java.lang.Throwable -> L4d
                zyd r14 = p000.zyd.f106515a     // Catch: java.lang.Throwable -> L4d
                if (r13 != r14) goto L72
                goto L73
            L72:
                r2 = r3
            L73:
                r12.unlock()
                r12.m11571H()
                return r2
            L7a:
                r12.unlock()
                r12.m11571H()
                return r3
            L81:
                qvd r6 = r6.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L1f
            L86:
                r12.unlock()
                r12.m11571H()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11581R(java.lang.Object, int, java.lang.Object):boolean");
        }

        @uc7("this")
        /* JADX INFO: renamed from: S */
        public void m11582S(qvd<K, V> entry) {
            m11609n(entry.getKey(), entry.getHash(), entry.getValueReference().get(), entry.getValueReference().getWeight(), zyd.f106517c);
            this.f39497M.remove(entry);
            this.f39498N.remove(entry);
        }

        @uc7("this")
        @gdi
        @op1
        /* JADX INFO: renamed from: T */
        public boolean m11583T(qvd<K, V> entry, int hash, zyd cause) {
            AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
            int length = (atomicReferenceArray.length() - 1) & hash;
            qvd<K, V> qvdVar = atomicReferenceArray.get(length);
            for (qvd<K, V> next = qvdVar; next != null; next = next.getNext()) {
                if (next == entry) {
                    this.f39503d++;
                    qvd<K, V> qvdVarM11586W = m11586W(qvdVar, next, next.getKey(), hash, next.getValueReference().get(), next.getValueReference(), cause);
                    int i = this.f39501b - 1;
                    atomicReferenceArray.set(length, qvdVarM11586W);
                    this.f39501b = i;
                    return true;
                }
            }
            return false;
        }

        @wx1
        @uc7("this")
        /* JADX INFO: renamed from: U */
        public qvd<K, V> m11584U(qvd<K, V> first, qvd<K, V> entry) {
            int i = this.f39501b;
            qvd<K, V> next = entry.getNext();
            while (first != entry) {
                qvd<K, V> qvdVarM11604i = m11604i(first, next);
                if (qvdVarM11604i != null) {
                    next = qvdVarM11604i;
                } else {
                    m11582S(first);
                    i--;
                }
                first = first.getNext();
            }
            this.f39501b = i;
            return next;
        }

        @op1
        /* JADX INFO: renamed from: V */
        public boolean m11585V(K key, int hash, C6243m<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                qvd<K, V> qvdVar = atomicReferenceArray.get(length);
                qvd<K, V> next = qvdVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    K key2 = next.getKey();
                    if (next.getHash() != hash || key2 == null || !this.f39500a.f39414e.equivalent(key, key2)) {
                        next = next.getNext();
                    } else if (next.getValueReference() == valueReference) {
                        if (valueReference.isActive()) {
                            next.setValueReference(valueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, m11584U(qvdVar, next));
                        }
                        unlock();
                        m11571H();
                        return true;
                    }
                }
                unlock();
                m11571H();
                return false;
            } catch (Throwable th) {
                unlock();
                m11571H();
                throw th;
            }
        }

        @wx1
        @uc7("this")
        /* JADX INFO: renamed from: W */
        public qvd<K, V> m11586W(qvd<K, V> first, qvd<K, V> entry, @wx1 K key, int hash, V value, InterfaceC6220a0<K, V> valueReference, zyd cause) {
            m11609n(key, hash, value, valueReference.getWeight(), cause);
            this.f39497M.remove(entry);
            this.f39498N.remove(entry);
            if (!valueReference.isLoading()) {
                return m11584U(first, entry);
            }
            valueReference.notifyNewValue(null);
            return first;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        
            return null;
         */
        @p000.wx1
        /* JADX INFO: renamed from: X */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V m11587X(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                gd9<K, V> r1 = r9.f39500a     // Catch: java.lang.Throwable -> L6d
                qzg r1 = r1.f39405Y     // Catch: java.lang.Throwable -> L6d
                long r7 = r1.read()     // Catch: java.lang.Throwable -> L6d
                r9.m11572I(r7)     // Catch: java.lang.Throwable -> L6d
                java.util.concurrent.atomic.AtomicReferenceArray<qvd<K, V>> r10 = r9.f39505f     // Catch: java.lang.Throwable -> L6d
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> L6d
                r2 = r1
                qvd r2 = (p000.qvd) r2     // Catch: java.lang.Throwable -> L6d
                r12 = r2
            L24:
                r13 = 0
                if (r12 == 0) goto L6f
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> L6d
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L6d
                if (r1 != r0) goto La2
                if (r4 == 0) goto La2
                gd9<K, V> r1 = r9.f39500a     // Catch: java.lang.Throwable -> L6d
                r45<java.lang.Object> r1 = r1.f39414e     // Catch: java.lang.Throwable -> L6d
                r14 = r18
                boolean r1 = r1.equivalent(r14, r4)     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto La4
                gd9$a0 r15 = r12.getValueReference()     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r16 = r15.get()     // Catch: java.lang.Throwable -> L6d
                if (r16 != 0) goto L76
                boolean r1 = r15.isActive()     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto L6f
                int r1 = r9.f39503d     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.f39503d = r1     // Catch: java.lang.Throwable -> L6d
                zyd r8 = p000.zyd.f106517c     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                qvd r0 = r1.m11586W(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6d
                int r1 = r9.f39501b     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r10.set(r11, r0)     // Catch: java.lang.Throwable -> L6d
                r9.f39501b = r1     // Catch: java.lang.Throwable -> L6d
                goto L6f
            L6d:
                r0 = move-exception
                goto Laa
            L6f:
                r17.unlock()
                r17.m11571H()
                return r13
            L76:
                int r1 = r9.f39503d     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.f39503d = r1     // Catch: java.lang.Throwable -> L6d
                int r5 = r15.getWeight()     // Catch: java.lang.Throwable -> L6d
                zyd r6 = p000.zyd.f106516b     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.m11609n(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.m11594c0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6d
                r9.m11610o(r12)     // Catch: java.lang.Throwable -> L6d
                r17.unlock()
                r17.m11571H()
                return r16
            La2:
                r14 = r18
            La4:
                qvd r12 = r12.getNext()     // Catch: java.lang.Throwable -> L6d
                goto L24
            Laa:
                r17.unlock()
                r17.m11571H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11587X(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        
            return false;
         */
        /* JADX INFO: renamed from: Y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m11588Y(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                gd9<K, V> r1 = r9.f39500a     // Catch: java.lang.Throwable -> L6a
                qzg r1 = r1.f39405Y     // Catch: java.lang.Throwable -> L6a
                long r7 = r1.read()     // Catch: java.lang.Throwable -> L6a
                r9.m11572I(r7)     // Catch: java.lang.Throwable -> L6a
                java.util.concurrent.atomic.AtomicReferenceArray<qvd<K, V>> r10 = r9.f39505f     // Catch: java.lang.Throwable -> L6a
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6a
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> L6a
                r2 = r1
                qvd r2 = (p000.qvd) r2     // Catch: java.lang.Throwable -> L6a
                r13 = r2
            L24:
                r14 = 0
                if (r13 == 0) goto L6c
                java.lang.Object r4 = r13.getKey()     // Catch: java.lang.Throwable -> L6a
                int r1 = r13.getHash()     // Catch: java.lang.Throwable -> L6a
                if (r1 != r0) goto Lb1
                if (r4 == 0) goto Lb1
                gd9<K, V> r1 = r9.f39500a     // Catch: java.lang.Throwable -> L6a
                r45<java.lang.Object> r1 = r1.f39414e     // Catch: java.lang.Throwable -> L6a
                r15 = r18
                boolean r1 = r1.equivalent(r15, r4)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Lae
                gd9$a0 r16 = r13.getValueReference()     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r6 = r16.get()     // Catch: java.lang.Throwable -> L6a
                if (r6 != 0) goto L73
                boolean r1 = r16.isActive()     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto L6c
                int r1 = r9.f39503d     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.f39503d = r1     // Catch: java.lang.Throwable -> L6a
                zyd r8 = p000.zyd.f106517c     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                qvd r0 = r1.m11586W(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
                int r1 = r9.f39501b     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch: java.lang.Throwable -> L6a
                r9.f39501b = r1     // Catch: java.lang.Throwable -> L6a
                goto L6c
            L6a:
                r0 = move-exception
                goto Lba
            L6c:
                r17.unlock()
                r17.m11571H()
                return r14
            L73:
                gd9<K, V> r1 = r9.f39500a     // Catch: java.lang.Throwable -> L6a
                r45<java.lang.Object> r1 = r1.f39415f     // Catch: java.lang.Throwable -> L6a
                r3 = r20
                boolean r1 = r1.equivalent(r3, r6)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Laa
                int r1 = r9.f39503d     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.f39503d = r1     // Catch: java.lang.Throwable -> L6a
                int r5 = r16.getWeight()     // Catch: java.lang.Throwable -> L6a
                zyd r10 = p000.zyd.f106516b     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.m11609n(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.m11594c0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6a
                r9.m11610o(r13)     // Catch: java.lang.Throwable -> L6a
                r17.unlock()
                r17.m11571H()
                return r11
            Laa:
                r9.m11576M(r13, r7)     // Catch: java.lang.Throwable -> L6a
                goto L6c
            Lae:
                r3 = r20
                goto Lb4
            Lb1:
                r15 = r18
                goto Lae
            Lb4:
                qvd r13 = r13.getNext()     // Catch: java.lang.Throwable -> L6a
                goto L24
            Lba:
                r17.unlock()
                r17.m11571H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gd9.C6248r.m11588Y(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* JADX INFO: renamed from: Z */
        public void m11589Z(long now) {
            if (tryLock()) {
                try {
                    m11607l();
                    m11612q(now);
                    this.f39496L.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: a0 */
        public void m11590a0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f39500a.m11512D();
        }

        /* JADX INFO: renamed from: b */
        public void m11591b() {
            m11589Z(this.f39500a.f39405Y.read());
            m11590a0();
        }

        /* JADX INFO: renamed from: b0 */
        public V m11592b0(qvd<K, V> entry, K key, int hash, V oldValue, long now, jm1<? super K, V> loader) {
            V vM11579P;
            return (!this.f39500a.m11519K() || now - entry.getWriteTime() <= this.f39500a.f39401N || entry.getValueReference().isLoading() || (vM11579P = m11579P(key, hash, loader, true)) == null) ? oldValue : vM11579P;
        }

        /* JADX INFO: renamed from: c */
        public void m11593c() {
            if (this.f39501b != 0) {
                lock();
                try {
                    m11572I(this.f39500a.f39405Y.read());
                    AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (qvd<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                K key = next.getKey();
                                V v = next.getValueReference().get();
                                m11609n(key, next.getHash(), v, next.getValueReference().getWeight(), (key == null || v == null) ? zyd.f106517c : zyd.f106515a);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    m11597e();
                    this.f39497M.clear();
                    this.f39498N.clear();
                    this.f39496L.set(0);
                    this.f39503d++;
                    this.f39501b = 0;
                    unlock();
                    m11571H();
                } catch (Throwable th) {
                    unlock();
                    m11571H();
                    throw th;
                }
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: c0 */
        public void m11594c0(qvd<K, V> entry, K key, V value, long now) {
            InterfaceC6220a0<K, V> valueReference = entry.getValueReference();
            int iWeigh = this.f39500a.f39397H.weigh(key, value);
            v7d.checkState(iWeigh >= 0, "Weights must be non-negative");
            entry.setValueReference(this.f39500a.f39395C.mo11623b(this, entry, value, iWeigh));
            m11578O(entry, iWeigh, now);
            valueReference.notifyNewValue(value);
        }

        /* JADX INFO: renamed from: d */
        public void m11595d() {
            while (this.f39493C.poll() != null) {
            }
        }

        @op1
        /* JADX INFO: renamed from: d0 */
        public boolean m11596d0(K key, int hash, C6243m<K, V> oldValueReference, V newValue) {
            lock();
            try {
                long j = this.f39500a.f39405Y.read();
                m11572I(j);
                int i = this.f39501b + 1;
                if (i > this.f39504e) {
                    m11611p();
                    i = this.f39501b + 1;
                }
                int i2 = i;
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                int length = hash & (atomicReferenceArray.length() - 1);
                qvd<K, V> qvdVar = atomicReferenceArray.get(length);
                qvd<K, V> next = qvdVar;
                while (true) {
                    if (next == null) {
                        this.f39503d++;
                        qvd<K, V> qvdVarM11568E = m11568E(key, hash, qvdVar);
                        m11594c0(qvdVarM11568E, key, newValue, j);
                        atomicReferenceArray.set(length, qvdVarM11568E);
                        this.f39501b = i2;
                        m11610o(qvdVarM11568E);
                        break;
                    }
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.f39500a.f39414e.equivalent(key, key2)) {
                        InterfaceC6220a0<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (oldValueReference != valueReference && (v != null || valueReference == gd9.f39393i2)) {
                            m11609n(key, hash, newValue, 0, zyd.f106516b);
                            unlock();
                            m11571H();
                            return false;
                        }
                        this.f39503d++;
                        if (oldValueReference.isActive()) {
                            m11609n(key, hash, v, oldValueReference.getWeight(), v == null ? zyd.f106517c : zyd.f106516b);
                            i2--;
                        }
                        m11594c0(next, key, newValue, j);
                        this.f39501b = i2;
                        m11610o(next);
                    } else {
                        next = next.getNext();
                    }
                }
                unlock();
                m11571H();
                return true;
            } catch (Throwable th) {
                unlock();
                m11571H();
                throw th;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m11597e() {
            if (this.f39500a.m11523Q()) {
                m11595d();
            }
            if (this.f39500a.m11524R()) {
                m11599f();
            }
        }

        /* JADX INFO: renamed from: e0 */
        public void m11598e0() {
            if (tryLock()) {
                try {
                    m11607l();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m11599f() {
            while (this.f39494F.poll() != null) {
            }
        }

        /* JADX INFO: renamed from: f0 */
        public void m11600f0(long now) {
            if (tryLock()) {
                try {
                    m11612q(now);
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m11601g(Object key, int hash) {
            try {
                if (this.f39501b == 0) {
                    return false;
                }
                qvd<K, V> qvdVarM11618w = m11618w(key, hash, this.f39500a.f39405Y.read());
                if (qvdVarM11618w == null) {
                    return false;
                }
                return qvdVarM11618w.getValueReference().get() != null;
            } finally {
                m11570G();
            }
        }

        /* JADX INFO: renamed from: g0 */
        public V m11602g0(qvd<K, V> e, K key, InterfaceC6220a0<K, V> valueReference) throws ExecutionException {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            v7d.checkState(!Thread.holdsLock(e), "Recursive load of: %s", key);
            try {
                V vWaitForValue = valueReference.waitForValue();
                if (vWaitForValue != null) {
                    m11577N(e, this.f39500a.f39405Y.read());
                    return vWaitForValue;
                }
                throw new jm1.C7976c("CacheLoader returned null for key " + key + ".");
            } finally {
                this.f39499Q.recordMisses(1);
            }
        }

        @gdi
        /* JADX INFO: renamed from: h */
        public boolean m11603h(Object value) {
            try {
                if (this.f39501b != 0) {
                    long j = this.f39500a.f39405Y.read();
                    AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (qvd<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V vM11619x = m11619x(next, j);
                            if (vM11619x != null && this.f39500a.f39415f.equivalent(value, vM11619x)) {
                                m11570G();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                m11570G();
            }
        }

        @wx1
        @uc7("this")
        /* JADX INFO: renamed from: i */
        public qvd<K, V> m11604i(qvd<K, V> original, qvd<K, V> newNext) {
            K key = original.getKey();
            if (key == null) {
                return null;
            }
            InterfaceC6220a0<K, V> valueReference = original.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            qvd<K, V> qvdVarMo11552b = this.f39500a.f39406Z.mo11552b(this, original, newNext, key);
            qvdVarMo11552b.setValueReference(valueReference.copyFor(this.f39494F, v, qvdVarMo11552b));
            return qvdVarMo11552b;
        }

        @uc7("this")
        /* JADX INFO: renamed from: j */
        public void m11605j() {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.f39493C.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f39500a.m11513E((qvd) referencePoll);
                i++;
            } while (i != 16);
        }

        @uc7("this")
        /* JADX INFO: renamed from: k */
        public void m11606k() {
            while (true) {
                qvd<K, V> qvdVarPoll = this.f39495H.poll();
                if (qvdVarPoll == null) {
                    return;
                }
                if (this.f39498N.contains(qvdVarPoll)) {
                    this.f39498N.add(qvdVarPoll);
                }
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: l */
        public void m11607l() {
            if (this.f39500a.m11523Q()) {
                m11605j();
            }
            if (this.f39500a.m11524R()) {
                m11608m();
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: m */
        public void m11608m() {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = this.f39494F.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f39500a.m11514F((InterfaceC6220a0) referencePoll);
                i++;
            } while (i != 16);
        }

        @uc7("this")
        /* JADX INFO: renamed from: n */
        public void m11609n(@wx1 K key, int hash, @wx1 V value, int weight, zyd cause) {
            this.f39502c -= (long) weight;
            if (cause.mo27150a()) {
                this.f39499Q.recordEviction();
            }
            if (this.f39500a.f39402Q != gd9.f39394j2) {
                this.f39500a.f39402Q.offer(ezd.create(key, value, cause));
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: o */
        public void m11610o(qvd<K, V> newest) {
            if (this.f39500a.m11530h()) {
                m11606k();
                if (newest.getValueReference().getWeight() > this.f39506m && !m11583T(newest, newest.getHash(), zyd.f106519e)) {
                    throw new AssertionError();
                }
                while (this.f39502c > this.f39506m) {
                    qvd<K, V> qvdVarM11620y = m11620y();
                    if (!m11583T(qvdVarM11620y, qvdVarM11620y.getHash(), zyd.f106519e)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @uc7("this")
        /* JADX INFO: renamed from: p */
        public void m11611p() {
            AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = this.f39505f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f39501b;
            AtomicReferenceArray<qvd<K, V>> atomicReferenceArrayM11569F = m11569F(length << 1);
            this.f39504e = (atomicReferenceArrayM11569F.length() * 3) / 4;
            int length2 = atomicReferenceArrayM11569F.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                qvd<K, V> next = atomicReferenceArray.get(i2);
                if (next != null) {
                    qvd<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayM11569F.set(hash, next);
                    } else {
                        qvd<K, V> qvdVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                qvdVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayM11569F.set(hash, qvdVar);
                        while (next != qvdVar) {
                            int hash3 = next.getHash() & length2;
                            qvd<K, V> qvdVarM11604i = m11604i(next, atomicReferenceArrayM11569F.get(hash3));
                            if (qvdVarM11604i != null) {
                                atomicReferenceArrayM11569F.set(hash3, qvdVarM11604i);
                            } else {
                                m11582S(next);
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f39505f = atomicReferenceArrayM11569F;
            this.f39501b = i;
        }

        @uc7("this")
        /* JADX INFO: renamed from: q */
        public void m11612q(long now) {
            qvd<K, V> qvdVarPeek;
            qvd<K, V> qvdVarPeek2;
            m11606k();
            do {
                qvdVarPeek = this.f39497M.peek();
                if (qvdVarPeek == null || !this.f39500a.m11542t(qvdVarPeek, now)) {
                    do {
                        qvdVarPeek2 = this.f39498N.peek();
                        if (qvdVarPeek2 == null || !this.f39500a.m11542t(qvdVarPeek2, now)) {
                            return;
                        }
                    } while (m11583T(qvdVarPeek2, qvdVarPeek2.getHash(), zyd.f106518d));
                    throw new AssertionError();
                }
            } while (m11583T(qvdVarPeek, qvdVarPeek.getHash(), zyd.f106518d));
            throw new AssertionError();
        }

        @wx1
        /* JADX INFO: renamed from: r */
        public V m11613r(Object key, int hash) {
            try {
                if (this.f39501b != 0) {
                    long j = this.f39500a.f39405Y.read();
                    qvd<K, V> qvdVarM11618w = m11618w(key, hash, j);
                    if (qvdVarM11618w == null) {
                        return null;
                    }
                    V v = qvdVarM11618w.getValueReference().get();
                    if (v != null) {
                        m11577N(qvdVarM11618w, j);
                        return m11592b0(qvdVarM11618w, qvdVarM11618w.getKey(), hash, v, j, this.f39500a.f39403V1);
                    }
                    m11598e0();
                }
                return null;
            } finally {
                m11570G();
            }
        }

        @op1
        /* JADX INFO: renamed from: s */
        public V m11614s(K key, int hash, jm1<? super K, V> loader) throws ExecutionException {
            qvd<K, V> qvdVarM11616u;
            v7d.checkNotNull(key);
            v7d.checkNotNull(loader);
            try {
                try {
                    if (this.f39501b != 0 && (qvdVarM11616u = m11616u(key, hash)) != null) {
                        long j = this.f39500a.f39405Y.read();
                        V vM11619x = m11619x(qvdVarM11616u, j);
                        if (vM11619x != null) {
                            m11577N(qvdVarM11616u, j);
                            this.f39499Q.recordHits(1);
                            return m11592b0(qvdVarM11616u, key, hash, vM11619x, j, loader);
                        }
                        InterfaceC6220a0<K, V> valueReference = qvdVarM11616u.getValueReference();
                        if (valueReference.isLoading()) {
                            return m11602g0(qvdVarM11616u, key, valueReference);
                        }
                    }
                    return m11567D(key, hash, loader);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new k85((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new orh(cause);
                    }
                    throw e;
                }
            } finally {
                m11570G();
            }
        }

        @op1
        /* JADX INFO: renamed from: t */
        public V m11615t(K k, int i, C6243m<K, V> c6243m, ja9<V> ja9Var) throws Throwable {
            V v;
            try {
                v = (V) vsh.getUninterruptibly(ja9Var);
                try {
                    if (v != null) {
                        this.f39499Q.recordLoadSuccess(c6243m.elapsedNanos());
                        m11596d0(k, i, c6243m, v);
                        return v;
                    }
                    throw new jm1.C7976c("CacheLoader returned null for key " + k + ".");
                } catch (Throwable th) {
                    th = th;
                    if (v == null) {
                        this.f39499Q.recordLoadException(c6243m.elapsedNanos());
                        m11585V(k, i, c6243m);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v = null;
            }
        }

        @wx1
        /* JADX INFO: renamed from: u */
        public qvd<K, V> m11616u(Object key, int hash) {
            for (qvd<K, V> qvdVarM11617v = m11617v(hash); qvdVarM11617v != null; qvdVarM11617v = qvdVarM11617v.getNext()) {
                if (qvdVarM11617v.getHash() == hash) {
                    K key2 = qvdVarM11617v.getKey();
                    if (key2 == null) {
                        m11598e0();
                    } else if (this.f39500a.f39414e.equivalent(key, key2)) {
                        return qvdVarM11617v;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: v */
        public qvd<K, V> m11617v(int hash) {
            return this.f39505f.get(hash & (r0.length() - 1));
        }

        @wx1
        /* JADX INFO: renamed from: w */
        public qvd<K, V> m11618w(Object key, int hash, long now) {
            qvd<K, V> qvdVarM11616u = m11616u(key, hash);
            if (qvdVarM11616u == null) {
                return null;
            }
            if (!this.f39500a.m11542t(qvdVarM11616u, now)) {
                return qvdVarM11616u;
            }
            m11600f0(now);
            return null;
        }

        /* JADX INFO: renamed from: x */
        public V m11619x(qvd<K, V> entry, long now) {
            if (entry.getKey() == null) {
                m11598e0();
                return null;
            }
            V v = entry.getValueReference().get();
            if (v == null) {
                m11598e0();
                return null;
            }
            if (!this.f39500a.m11542t(entry, now)) {
                return v;
            }
            m11600f0(now);
            return null;
        }

        @uc7("this")
        /* JADX INFO: renamed from: y */
        public qvd<K, V> m11620y() {
            for (qvd<K, V> qvdVar : this.f39498N) {
                if (qvdVar.getValueReference().getWeight() > 0) {
                    return qvdVar;
                }
            }
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: z */
        public void m11621z(AtomicReferenceArray<qvd<K, V>> newTable) {
            this.f39504e = (newTable.length() * 3) / 4;
            if (!this.f39500a.m11529f()) {
                int i = this.f39504e;
                if (i == this.f39506m) {
                    this.f39504e = i + 1;
                }
            }
            this.f39505f = newTable;
        }
    }

    /* JADX INFO: renamed from: gd9$s */
    public static class C6249s<K, V> extends SoftReference<V> implements InterfaceC6220a0<K, V> {

        /* JADX INFO: renamed from: a */
        public final qvd<K, V> f39507a;

        public C6249s(ReferenceQueue<V> queue, V referent, qvd<K, V> entry) {
            super(referent, queue);
            this.f39507a = entry;
        }

        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, V value, qvd<K, V> entry) {
            return new C6249s(queue, value, entry);
        }

        @Override // p000.gd9.InterfaceC6220a0
        public qvd<K, V> getEntry() {
            return this.f39507a;
        }

        public int getWeight() {
            return 1;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isActive() {
            return true;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isLoading() {
            return false;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public void notifyNewValue(V newValue) {
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V waitForValue() {
            return get();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gd9$t */
    public static abstract class EnumC6250t {

        /* JADX INFO: renamed from: a */
        public static final EnumC6250t f39508a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC6250t f39509b = new b("SOFT", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC6250t f39510c = new c("WEAK", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC6250t[] f39511d = $values();

        /* JADX INFO: renamed from: gd9$t$a */
        public enum a extends EnumC6250t {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: a */
            public r45<Object> mo11622a() {
                return r45.equals();
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: b */
            public <K, V> InterfaceC6220a0<K, V> mo11623b(C6248r<K, V> segment, qvd<K, V> entry, V value, int weight) {
                return weight == 1 ? new C6254x(value) : new C6236i0(value, weight);
            }
        }

        /* JADX INFO: renamed from: gd9$t$b */
        public enum b extends EnumC6250t {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: a */
            public r45<Object> mo11622a() {
                return r45.identity();
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: b */
            public <K, V> InterfaceC6220a0<K, V> mo11623b(C6248r<K, V> segment, qvd<K, V> entry, V value, int weight) {
                return weight == 1 ? new C6249s(segment.f39494F, value, entry) : new C6234h0(segment.f39494F, value, entry, weight);
            }
        }

        /* JADX INFO: renamed from: gd9$t$c */
        public enum c extends EnumC6250t {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: a */
            public r45<Object> mo11622a() {
                return r45.identity();
            }

            @Override // p000.gd9.EnumC6250t
            /* JADX INFO: renamed from: b */
            public <K, V> InterfaceC6220a0<K, V> mo11623b(C6248r<K, V> segment, qvd<K, V> entry, V value, int weight) {
                return weight == 1 ? new C6230f0(segment.f39494F, value, entry) : new C6238j0(segment.f39494F, value, entry, weight);
            }
        }

        private static /* synthetic */ EnumC6250t[] $values() {
            return new EnumC6250t[]{f39508a, f39509b, f39510c};
        }

        private EnumC6250t(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC6250t valueOf(String name) {
            return (EnumC6250t) Enum.valueOf(EnumC6250t.class, name);
        }

        public static EnumC6250t[] values() {
            return (EnumC6250t[]) f39511d.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract r45<Object> mo11622a();

        /* JADX INFO: renamed from: b */
        public abstract <K, V> InterfaceC6220a0<K, V> mo11623b(C6248r<K, V> segment, qvd<K, V> entry, V value, int weight);

        public /* synthetic */ EnumC6250t(String str, int i, C6219a c6219a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: gd9$u */
    public static final class C6251u<K, V> extends C6253w<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f39512e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39513f;

        /* JADX INFO: renamed from: m */
        @Weak
        public qvd<K, V> f39514m;

        public C6251u(K key, int hash, @wx1 qvd<K, V> next) {
            super(key, hash, next);
            this.f39512e = Long.MAX_VALUE;
            this.f39513f = gd9.m11503A();
            this.f39514m = gd9.m11503A();
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public long getAccessTime() {
            return this.f39512e;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getNextInAccessQueue() {
            return this.f39513f;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getPreviousInAccessQueue() {
            return this.f39514m;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setAccessTime(long time) {
            this.f39512e = time;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setNextInAccessQueue(qvd<K, V> next) {
            this.f39513f = next;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            this.f39514m = previous;
        }
    }

    /* JADX INFO: renamed from: gd9$v */
    public static final class C6252v<K, V> extends C6253w<K, V> {

        /* JADX INFO: renamed from: C */
        public volatile long f39515C;

        /* JADX INFO: renamed from: F */
        @Weak
        public qvd<K, V> f39516F;

        /* JADX INFO: renamed from: H */
        @Weak
        public qvd<K, V> f39517H;

        /* JADX INFO: renamed from: e */
        public volatile long f39518e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39519f;

        /* JADX INFO: renamed from: m */
        @Weak
        public qvd<K, V> f39520m;

        public C6252v(K key, int hash, @wx1 qvd<K, V> next) {
            super(key, hash, next);
            this.f39518e = Long.MAX_VALUE;
            this.f39519f = gd9.m11503A();
            this.f39520m = gd9.m11503A();
            this.f39515C = Long.MAX_VALUE;
            this.f39516F = gd9.m11503A();
            this.f39517H = gd9.m11503A();
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public long getAccessTime() {
            return this.f39518e;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getNextInAccessQueue() {
            return this.f39519f;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getNextInWriteQueue() {
            return this.f39516F;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getPreviousInAccessQueue() {
            return this.f39520m;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getPreviousInWriteQueue() {
            return this.f39517H;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public long getWriteTime() {
            return this.f39515C;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setAccessTime(long time) {
            this.f39518e = time;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setNextInAccessQueue(qvd<K, V> next) {
            this.f39519f = next;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setNextInWriteQueue(qvd<K, V> next) {
            this.f39516F = next;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setPreviousInAccessQueue(qvd<K, V> previous) {
            this.f39520m = previous;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            this.f39517H = previous;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setWriteTime(long time) {
            this.f39515C = time;
        }
    }

    /* JADX INFO: renamed from: gd9$w */
    public static class C6253w<K, V> extends AbstractC6225d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f39521a;

        /* JADX INFO: renamed from: b */
        public final int f39522b;

        /* JADX INFO: renamed from: c */
        @wx1
        public final qvd<K, V> f39523c;

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC6220a0<K, V> f39524d = gd9.m11507N();

        public C6253w(K key, int hash, @wx1 qvd<K, V> next) {
            this.f39521a = key;
            this.f39522b = hash;
            this.f39523c = next;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public int getHash() {
            return this.f39522b;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public K getKey() {
            return this.f39521a;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getNext() {
            return this.f39523c;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public InterfaceC6220a0<K, V> getValueReference() {
            return this.f39524d;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setValueReference(InterfaceC6220a0<K, V> valueReference) {
            this.f39524d = valueReference;
        }
    }

    /* JADX INFO: renamed from: gd9$x */
    public static class C6254x<K, V> implements InterfaceC6220a0<K, V> {

        /* JADX INFO: renamed from: a */
        public final V f39525a;

        public C6254x(V referent) {
            this.f39525a = referent;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public InterfaceC6220a0<K, V> copyFor(ReferenceQueue<V> queue, V value, qvd<K, V> entry) {
            return this;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V get() {
            return this.f39525a;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public qvd<K, V> getEntry() {
            return null;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public int getWeight() {
            return 1;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isActive() {
            return true;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public boolean isLoading() {
            return false;
        }

        @Override // p000.gd9.InterfaceC6220a0
        public void notifyNewValue(V newValue) {
        }

        @Override // p000.gd9.InterfaceC6220a0
        public V waitForValue() {
            return get();
        }
    }

    /* JADX INFO: renamed from: gd9$y */
    public static final class C6255y<K, V> extends C6253w<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f39526e;

        /* JADX INFO: renamed from: f */
        @Weak
        public qvd<K, V> f39527f;

        /* JADX INFO: renamed from: m */
        @Weak
        public qvd<K, V> f39528m;

        public C6255y(K key, int hash, @wx1 qvd<K, V> next) {
            super(key, hash, next);
            this.f39526e = Long.MAX_VALUE;
            this.f39527f = gd9.m11503A();
            this.f39528m = gd9.m11503A();
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getNextInWriteQueue() {
            return this.f39527f;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public qvd<K, V> getPreviousInWriteQueue() {
            return this.f39528m;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public long getWriteTime() {
            return this.f39526e;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setNextInWriteQueue(qvd<K, V> next) {
            this.f39527f = next;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setPreviousInWriteQueue(qvd<K, V> previous) {
            this.f39528m = previous;
        }

        @Override // p000.gd9.AbstractC6225d, p000.qvd
        public void setWriteTime(long time) {
            this.f39526e = time;
        }
    }

    /* JADX INFO: renamed from: gd9$z */
    public final class C6256z extends gd9<K, V>.AbstractC6235i<V> {
        public C6256z(final gd9 this$0) {
            super();
        }

        @Override // p000.gd9.AbstractC6235i, java.util.Iterator
        public V next() {
            return m11557c().getValue();
        }
    }

    public gd9(gl1<? super K, ? super V> gl1Var, @wx1 jm1<? super K, V> jm1Var) {
        this.f39413d = Math.min(gl1Var.m11725a(), 65536);
        EnumC6250t enumC6250tM11730f = gl1Var.m11730f();
        this.f39416m = enumC6250tM11730f;
        this.f39395C = gl1Var.m11737m();
        this.f39414e = gl1Var.m11729e();
        this.f39415f = gl1Var.m11736l();
        long jM11731g = gl1Var.m11731g();
        this.f39396F = jM11731g;
        this.f39397H = (iki<K, V>) gl1Var.m11738n();
        this.f39398L = gl1Var.m11726b();
        this.f39399M = gl1Var.m11727c();
        this.f39401N = gl1Var.m11732h();
        gl1.EnumC6372e enumC6372e = (azd<K, V>) gl1Var.m11733i();
        this.f39404X = enumC6372e;
        this.f39402Q = enumC6372e == gl1.EnumC6372e.INSTANCE ? m11511g() : new ConcurrentLinkedQueue<>();
        this.f39405Y = gl1Var.m11735k(m11516H());
        this.f39406Z = EnumC6229f.m11550d(enumC6250tM11730f, m11521O(), m11525S());
        this.f39400M1 = gl1Var.m11734j().get();
        this.f39403V1 = jm1Var;
        int iMin = Math.min(gl1Var.m11728d(), 1073741824);
        if (m11530h() && !m11529f()) {
            iMin = (int) Math.min(iMin, jM11731g);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f39413d && (!m11530h() || ((long) i4) * 20 <= this.f39396F)) {
            i3++;
            i4 <<= 1;
        }
        this.f39410b = 32 - i3;
        this.f39408a = i4 - 1;
        this.f39412c = m11547y(i4);
        int i5 = iMin / i4;
        while (i2 < (i5 * i4 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m11530h()) {
            long j = this.f39396F;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                C6248r<K, V>[] c6248rArr = this.f39412c;
                if (i >= c6248rArr.length) {
                    return;
                }
                if (i == j4) {
                    j3--;
                }
                c6248rArr[i] = m11528e(i2, j3, gl1Var.m11734j().get());
                i++;
            }
        } else {
            while (true) {
                C6248r<K, V>[] c6248rArr2 = this.f39412c;
                if (i >= c6248rArr2.length) {
                    return;
                }
                c6248rArr2[i] = m11528e(i2, -1L, gl1Var.m11734j().get());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static <K, V> qvd<K, V> m11503A() {
        return EnumC6247q.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static <K, V> void m11504B(qvd<K, V> nulled) {
        qvd<K, V> qvdVarM11503A = m11503A();
        nulled.setNextInAccessQueue(qvdVarM11503A);
        nulled.setPreviousInAccessQueue(qvdVarM11503A);
    }

    /* JADX INFO: renamed from: C */
    public static <K, V> void m11505C(qvd<K, V> nulled) {
        qvd<K, V> qvdVarM11503A = m11503A();
        nulled.setNextInWriteQueue(qvdVarM11503A);
        nulled.setPreviousInWriteQueue(qvdVarM11503A);
    }

    /* JADX INFO: renamed from: L */
    public static int m11506L(int h) {
        int i = h + ((h << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: N */
    public static <K, V> InterfaceC6220a0<K, V> m11507N() {
        return (InterfaceC6220a0<K, V>) f39393i2;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m11509b(qvd<K, V> previous, qvd<K, V> next) {
        previous.setNextInAccessQueue(next);
        next.setPreviousInAccessQueue(previous);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> void m11510c(qvd<K, V> previous, qvd<K, V> next) {
        previous.setNextInWriteQueue(next);
        next.setPreviousInWriteQueue(previous);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Queue<E> m11511g() {
        return (Queue<E>) f39394j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> toArrayList(Collection<E> c) {
        ArrayList<E> arrayList = new ArrayList<>(c.size());
        wg8.addAll(arrayList, c.iterator());
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public void m11512D() {
        while (true) {
            ezd<K, V> ezdVarPoll = this.f39402Q.poll();
            if (ezdVarPoll == null) {
                return;
            }
            try {
                this.f39404X.onRemoval(ezdVarPoll);
            } catch (Throwable th) {
                f39392h2.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m11513E(qvd<K, V> entry) {
        int hash = entry.getHash();
        m11520M(hash).m11574K(entry, hash);
    }

    /* JADX INFO: renamed from: F */
    public void m11514F(InterfaceC6220a0<K, V> valueReference) {
        qvd<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        m11520M(hash).m11575L(entry.getKey(), hash, valueReference);
    }

    /* JADX INFO: renamed from: G */
    public boolean m11515G() {
        return m11532j();
    }

    /* JADX INFO: renamed from: H */
    public boolean m11516H() {
        return m11517I() || m11515G();
    }

    /* JADX INFO: renamed from: I */
    public boolean m11517I() {
        return m11533k() || m11519K();
    }

    /* JADX INFO: renamed from: J */
    public void m11518J(K key) {
        int iM11540r = m11540r(v7d.checkNotNull(key));
        m11520M(iM11540r).m11579P(key, iM11540r, this.f39403V1, false);
    }

    /* JADX INFO: renamed from: K */
    public boolean m11519K() {
        return this.f39401N > 0;
    }

    /* JADX INFO: renamed from: M */
    public C6248r<K, V> m11520M(int hash) {
        return this.f39412c[(hash >>> this.f39410b) & this.f39408a];
    }

    /* JADX INFO: renamed from: O */
    public boolean m11521O() {
        return m11522P() || m11515G();
    }

    /* JADX INFO: renamed from: P */
    public boolean m11522P() {
        return m11532j() || m11530h();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m11523Q() {
        return this.f39416m != EnumC6250t.f39508a;
    }

    /* JADX INFO: renamed from: R */
    public boolean m11524R() {
        return this.f39395C != EnumC6250t.f39508a;
    }

    /* JADX INFO: renamed from: S */
    public boolean m11525S() {
        return m11526T() || m11517I();
    }

    /* JADX INFO: renamed from: T */
    public boolean m11526T() {
        return m11533k();
    }

    public void cleanUp() {
        for (C6248r<K, V> c6248r : this.f39412c) {
            c6248r.m11591b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (C6248r<K, V> c6248r : this.f39412c) {
            c6248r.m11593c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@wx1 Object key) {
        if (key == null) {
            return false;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11601g(key, iM11540r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@wx1 Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long j = this.f39405Y.read();
        C6248r<K, V>[] c6248rArr = this.f39412c;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = c6248rArr.length;
            long j3 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                C6248r<K, V> c6248r = c6248rArr[r12];
                int i2 = c6248r.f39501b;
                AtomicReferenceArray<qvd<K, V>> atomicReferenceArray = c6248r.f39505f;
                for (?? r15 = z; r15 < atomicReferenceArray.length(); r15++) {
                    qvd<K, V> next = atomicReferenceArray.get(r15);
                    while (next != null) {
                        C6248r<K, V>[] c6248rArr2 = c6248rArr;
                        V vM11619x = c6248r.m11619x(next, j);
                        long j4 = j;
                        if (vM11619x != null && this.f39415f.equivalent(obj, vM11619x)) {
                            return true;
                        }
                        next = next.getNext();
                        c6248rArr = c6248rArr2;
                        j = j4;
                    }
                }
                j3 += (long) c6248r.f39503d;
                j = j;
                z = false;
            }
            long j5 = j;
            C6248r<K, V>[] c6248rArr3 = c6248rArr;
            if (j3 == j2) {
                return false;
            }
            i++;
            j2 = j3;
            c6248rArr = c6248rArr3;
            j = j5;
            z = false;
        }
        return z;
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public qvd<K, V> m11527d(qvd<K, V> original, qvd<K, V> newNext) {
        return m11520M(original.getHash()).m11604i(original, newNext);
    }

    /* JADX INFO: renamed from: e */
    public C6248r<K, V> m11528e(int initialCapacity, long maxSegmentWeight, AbstractC7697j0.b statsCounter) {
        return new C6248r<>(this, initialCapacity, maxSegmentWeight, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @jd7
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f39411b2;
        if (set != null) {
            return set;
        }
        C6233h c6233h = new C6233h();
        this.f39411b2 = c6233h;
        return c6233h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11529f() {
        return this.f39397H != gl1.EnumC6373f.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V get(@wx1 Object key) {
        if (key == null) {
            return null;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11613r(key, iM11540r);
    }

    @wx1
    public V getIfPresent(Object key) {
        int iM11540r = m11540r(v7d.checkNotNull(key));
        V vM11613r = m11520M(iM11540r).m11613r(key, iM11540r);
        if (vM11613r == null) {
            this.f39400M1.recordMisses(1);
        } else {
            this.f39400M1.recordHits(1);
        }
        return vM11613r;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @wx1
    public V getOrDefault(@wx1 Object key, @wx1 V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    /* JADX INFO: renamed from: h */
    public boolean m11530h() {
        return this.f39396F >= 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m11531i() {
        return m11533k() || m11532j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        C6248r<K, V>[] c6248rArr = this.f39412c;
        long j = 0;
        for (C6248r<K, V> c6248r : c6248rArr) {
            if (c6248r.f39501b != 0) {
                return false;
            }
            j += (long) c6248r.f39503d;
        }
        if (j == 0) {
            return true;
        }
        for (C6248r<K, V> c6248r2 : c6248rArr) {
            if (c6248r2.f39501b != 0) {
                return false;
            }
            j -= (long) c6248r2.f39503d;
        }
        return j == 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m11532j() {
        return this.f39398L > 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m11533k() {
        return this.f39399M > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f39407Z1;
        if (set != null) {
            return set;
        }
        C6239k c6239k = new C6239k();
        this.f39407Z1 = c6239k;
        return c6239k;
    }

    @op1
    /* JADX INFO: renamed from: l */
    public V m11534l(K key, jm1<? super K, V> loader) throws ExecutionException {
        int iM11540r = m11540r(v7d.checkNotNull(key));
        return m11520M(iM11540r).m11614s(key, iM11540r, loader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public ox7<K, V> m11535m(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = tt9.newLinkedHashMap();
        LinkedHashSet linkedHashSetNewLinkedHashSet = t6f.newLinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (K k : keys) {
            Object obj = get(k);
            if (!linkedHashMapNewLinkedHashMap.containsKey(k)) {
                linkedHashMapNewLinkedHashMap.put(k, obj);
                if (obj == null) {
                    i2++;
                    linkedHashSetNewLinkedHashSet.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    Map mapM11544v = m11544v(Collections.unmodifiableSet(linkedHashSetNewLinkedHashSet), this.f39403V1);
                    for (Object obj2 : linkedHashSetNewLinkedHashSet) {
                        Object obj3 = mapM11544v.get(obj2);
                        if (obj3 == null) {
                            throw new jm1.C7976c("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                    }
                } catch (jm1.C7978e unused) {
                    for (Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i2--;
                        linkedHashMapNewLinkedHashMap.put(obj4, m11534l(obj4, this.f39403V1));
                    }
                }
            }
            ox7<K, V> ox7VarCopyOf = ox7.copyOf((Map) linkedHashMapNewLinkedHashMap);
            this.f39400M1.recordHits(i);
            this.f39400M1.recordMisses(i2);
            return ox7VarCopyOf;
        } catch (Throwable th) {
            this.f39400M1.recordHits(i);
            this.f39400M1.recordMisses(i2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public ox7<K, V> m11536n(Iterable<?> keys) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        int i = 0;
        int i2 = 0;
        for (Object obj : keys) {
            V v = get(obj);
            if (v == null) {
                i2++;
            } else {
                c10705dBuilder.put(obj, v);
                i++;
            }
        }
        this.f39400M1.recordHits(i);
        this.f39400M1.recordMisses(i2);
        return c10705dBuilder.buildKeepingLast();
    }

    @wx1
    /* JADX INFO: renamed from: o */
    public qvd<K, V> m11537o(@wx1 Object key) {
        if (key == null) {
            return null;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11616u(key, iM11540r);
    }

    @wx1
    /* JADX INFO: renamed from: p */
    public V m11538p(qvd<K, V> entry, long now) {
        V v;
        if (entry.getKey() == null || (v = entry.getValueReference().get()) == null || m11542t(entry, now)) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V put(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11573J(key, iM11540r, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @wx1
    public V putIfAbsent(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11573J(key, iM11540r, value, true);
    }

    /* JADX INFO: renamed from: q */
    public V m11539q(K key) throws ExecutionException {
        return m11534l(key, this.f39403V1);
    }

    /* JADX INFO: renamed from: r */
    public int m11540r(@wx1 Object key) {
        return m11506L(this.f39414e.hash(key));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V remove(@wx1 Object key) {
        if (key == null) {
            return null;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11580Q(key, iM11540r);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean replace(K key, @wx1 V oldValue, V newValue) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(newValue);
        if (oldValue == null) {
            return false;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11588Y(key, iM11540r, oldValue, newValue);
    }

    /* JADX INFO: renamed from: s */
    public void m11541s(Iterable<?> keys) {
        Iterator<?> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return rd8.saturatedCast(m11545w());
    }

    /* JADX INFO: renamed from: t */
    public boolean m11542t(qvd<K, V> entry, long now) {
        v7d.checkNotNull(entry);
        if (!m11532j() || now - entry.getAccessTime() < this.f39398L) {
            return m11533k() && now - entry.getWriteTime() >= this.f39399M;
        }
        return true;
    }

    @gdi
    /* JADX INFO: renamed from: u */
    public boolean m11543u(qvd<K, V> entry, long now) {
        return m11520M(entry.getHash()).m11619x(entry, now) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    @p000.wx1
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<K, V> m11544v(java.util.Set<? extends K> r7, p000.jm1<? super K, V> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            p000.v7d.checkNotNull(r8)
            p000.v7d.checkNotNull(r7)
            d5g r0 = p000.d5g.createStarted()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 p000.jm1.C7978e -> Lb4
            if (r7 == 0) goto L6c
            r0.stop()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            j0$b r8 = r6.f39400M1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadSuccess(r0)
            return r7
        L4a:
            j0$b r7 = r6.f39400M1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            jm1$c r7 = new jm1$c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            j0$b r7 = r6.f39400M1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            jm1$c r7 = new jm1$c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = r2
            goto Lb7
        L91:
            r7 = move-exception
            k85 r8 = new k85     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            orh r8 = new orh     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            j0$b r8 = r6.f39400M1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadException(r0)
        Lc4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gd9.m11544v(java.util.Set, jm1):java.util.Map");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f39409a2;
        if (collection != null) {
            return collection;
        }
        C6222b0 c6222b0 = new C6222b0();
        this.f39409a2 = c6222b0;
        return c6222b0;
    }

    /* JADX INFO: renamed from: w */
    public long m11545w() {
        long jMax = 0;
        for (C6248r<K, V> c6248r : this.f39412c) {
            jMax += (long) Math.max(0, c6248r.f39501b);
        }
        return jMax;
    }

    @gdi
    /* JADX INFO: renamed from: x */
    public qvd<K, V> m11546x(K key, int hash, @wx1 qvd<K, V> next) {
        C6248r<K, V> c6248rM11520M = m11520M(hash);
        c6248rM11520M.lock();
        try {
            return c6248rM11520M.m11568E(key, hash, next);
        } finally {
            c6248rM11520M.unlock();
        }
    }

    /* JADX INFO: renamed from: y */
    public final C6248r<K, V>[] m11547y(int ssize) {
        return new C6248r[ssize];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @gdi
    /* JADX INFO: renamed from: z */
    public InterfaceC6220a0<K, V> m11548z(qvd<K, V> entry, V value, int weight) {
        return this.f39395C.mo11623b(m11520M(entry.getHash()), entry, v7d.checkNotNull(value), weight);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean remove(@wx1 Object key, @wx1 Object value) {
        if (key == null || value == null) {
            return false;
        }
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11581R(key, iM11540r, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    @wx1
    public V replace(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        int iM11540r = m11540r(key);
        return m11520M(iM11540r).m11587X(key, iM11540r, value);
    }
}
