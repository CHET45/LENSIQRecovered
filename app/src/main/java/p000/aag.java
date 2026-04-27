package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.aag;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@qx4
public abstract class aag<L> {

    /* JADX INFO: renamed from: a */
    public static final int f852a = 1024;

    /* JADX INFO: renamed from: b */
    public static final int f853b = -1;

    /* JADX INFO: renamed from: aag$b */
    public static class C0127b<L> extends AbstractC0131f<L> {

        /* JADX INFO: renamed from: d */
        public final Object[] f854d;

        @Override // p000.aag
        public L getAt(int i) {
            return (L) this.f854d[i];
        }

        @Override // p000.aag
        public int size() {
            return this.f854d.length;
        }

        private C0127b(int stripes, lfg<L> supplier) {
            super(stripes);
            int i = 0;
            v7d.checkArgument(stripes <= 1073741824, "Stripes must be <= 2^30)");
            this.f854d = new Object[this.f864c + 1];
            while (true) {
                Object[] objArr = this.f854d;
                if (i >= objArr.length) {
                    return;
                }
                objArr[i] = supplier.get();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: aag$c */
    @gdi
    public static class C0128c<L> extends AbstractC0131f<L> {

        /* JADX INFO: renamed from: d */
        public final ConcurrentMap<Integer, L> f855d;

        /* JADX INFO: renamed from: e */
        public final lfg<L> f856e;

        /* JADX INFO: renamed from: f */
        public final int f857f;

        public C0128c(int stripes, lfg<L> supplier) {
            super(stripes);
            int i = this.f864c;
            this.f857f = i == -1 ? Integer.MAX_VALUE : i + 1;
            this.f856e = supplier;
            this.f855d = new ft9().weakValues().makeMap();
        }

        @Override // p000.aag
        public L getAt(int i) {
            if (this.f857f != Integer.MAX_VALUE) {
                v7d.checkElementIndex(i, size());
            }
            L l = this.f855d.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.f856e.get();
            return (L) yya.firstNonNull(this.f855d.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // p000.aag
        public int size() {
            return this.f857f;
        }
    }

    /* JADX INFO: renamed from: aag$d */
    public static class C0129d extends ReentrantLock {

        /* JADX INFO: renamed from: a */
        public long f858a;

        /* JADX INFO: renamed from: b */
        public long f859b;

        /* JADX INFO: renamed from: c */
        public long f860c;

        public C0129d() {
            super(false);
        }
    }

    /* JADX INFO: renamed from: aag$e */
    public static class C0130e extends Semaphore {

        /* JADX INFO: renamed from: a */
        public long f861a;

        /* JADX INFO: renamed from: b */
        public long f862b;

        /* JADX INFO: renamed from: c */
        public long f863c;

        public C0130e(int permits) {
            super(permits, false);
        }
    }

    /* JADX INFO: renamed from: aag$f */
    public static abstract class AbstractC0131f<L> extends aag<L> {

        /* JADX INFO: renamed from: c */
        public final int f864c;

        public AbstractC0131f(int stripes) {
            super();
            v7d.checkArgument(stripes > 0, "Stripes must be positive");
            this.f864c = stripes > 1073741824 ? -1 : aag.ceilToPowerOfTwo(stripes) - 1;
        }

        @Override // p000.aag
        /* JADX INFO: renamed from: g */
        public final int mo272g(Object key) {
            return aag.smear(key.hashCode()) & this.f864c;
        }

        @Override // p000.aag
        public final L get(Object key) {
            return getAt(mo272g(key));
        }
    }

    /* JADX INFO: renamed from: aag$g */
    @gdi
    public static class C0132g<L> extends AbstractC0131f<L> {

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceArray<a<? extends L>> f865d;

        /* JADX INFO: renamed from: e */
        public final lfg<L> f866e;

        /* JADX INFO: renamed from: f */
        public final int f867f;

        /* JADX INFO: renamed from: g */
        public final ReferenceQueue<L> f868g;

        /* JADX INFO: renamed from: aag$g$a */
        public static final class a<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: a */
            public final int f869a;

            public a(L referent, int index, ReferenceQueue<L> queue) {
                super(referent, queue);
                this.f869a = index;
            }
        }

        public C0132g(int stripes, lfg<L> supplier) {
            super(stripes);
            this.f868g = new ReferenceQueue<>();
            int i = this.f864c;
            int i2 = i == -1 ? Integer.MAX_VALUE : i + 1;
            this.f867f = i2;
            this.f865d = new AtomicReferenceArray<>(i2);
            this.f866e = supplier;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> referencePoll = this.f868g.poll();
                if (referencePoll == null) {
                    return;
                }
                a aVar = (a) referencePoll;
                bag.m3024a(this.f865d, aVar.f869a, aVar, null);
            }
        }

        @Override // p000.aag
        public L getAt(int index) {
            if (this.f867f != Integer.MAX_VALUE) {
                v7d.checkElementIndex(index, size());
            }
            a<? extends L> aVar = this.f865d.get(index);
            L l = aVar == null ? null : aVar.get();
            if (l != null) {
                return l;
            }
            L l2 = this.f866e.get();
            a aVar2 = new a(l2, index, this.f868g);
            while (!bag.m3024a(this.f865d, index, aVar, aVar2)) {
                aVar = this.f865d.get(index);
                L l3 = aVar == null ? null : aVar.get();
                if (l3 != null) {
                    return l3;
                }
            }
            drainQueue();
            return l2;
        }

        @Override // p000.aag
        public int size() {
            return this.f867f;
        }
    }

    /* JADX INFO: renamed from: aag$h */
    public static final class C0133h extends nr6 {

        /* JADX INFO: renamed from: a */
        public final Condition f870a;

        /* JADX INFO: renamed from: b */
        public final ReadWriteLockC0135j f871b;

        public C0133h(Condition delegate, ReadWriteLockC0135j strongReference) {
            this.f870a = delegate;
            this.f871b = strongReference;
        }

        @Override // p000.nr6
        /* JADX INFO: renamed from: a */
        public Condition mo273a() {
            return this.f870a;
        }
    }

    /* JADX INFO: renamed from: aag$i */
    public static final class C0134i extends os6 {

        /* JADX INFO: renamed from: a */
        public final Lock f872a;

        /* JADX INFO: renamed from: b */
        public final ReadWriteLockC0135j f873b;

        public C0134i(Lock delegate, ReadWriteLockC0135j strongReference) {
            this.f872a = delegate;
            this.f873b = strongReference;
        }

        @Override // p000.os6
        /* JADX INFO: renamed from: a */
        public Lock mo274a() {
            return this.f872a;
        }

        @Override // p000.os6, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new C0133h(this.f872a.newCondition(), this.f873b);
        }
    }

    /* JADX INFO: renamed from: aag$j */
    public static final class ReadWriteLockC0135j implements ReadWriteLock {

        /* JADX INFO: renamed from: a */
        public final ReadWriteLock f874a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new C0134i(this.f874a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new C0134i(this.f874a.writeLock(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int x) {
        return 1 << w68.log2(x, RoundingMode.CEILING);
    }

    /* JADX INFO: renamed from: f */
    public static <L> aag<L> m271f(int stripes, lfg<L> supplier) {
        return new C0127b(stripes, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i) {
        return new Semaphore(i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$semaphore$1(int i) {
        return new C0130e(i);
    }

    private static <L> aag<L> lazy(int stripes, lfg<L> supplier) {
        return stripes < 1024 ? new C0132g(stripes, supplier) : new C0128c(stripes, supplier);
    }

    public static aag<Lock> lazyWeakLock(int stripes) {
        return lazy(stripes, new lfg() { // from class: y9g
            @Override // p000.lfg
            public final Object get() {
                return aag.lambda$lazyWeakLock$0();
            }
        });
    }

    public static aag<ReadWriteLock> lazyWeakReadWriteLock(int stripes) {
        return lazy(stripes, new lfg() { // from class: u9g
            @Override // p000.lfg
            public final Object get() {
                return new aag.ReadWriteLockC0135j();
            }
        });
    }

    public static aag<Semaphore> lazyWeakSemaphore(int stripes, final int permits) {
        return lazy(stripes, new lfg() { // from class: x9g
            @Override // p000.lfg
            public final Object get() {
                return aag.lambda$lazyWeakSemaphore$2(permits);
            }
        });
    }

    public static aag<Lock> lock(int stripes) {
        return m271f(stripes, new lfg() { // from class: v9g
            @Override // p000.lfg
            public final Object get() {
                return new aag.C0129d();
            }
        });
    }

    public static aag<ReadWriteLock> readWriteLock(int stripes) {
        return m271f(stripes, new lfg() { // from class: z9g
            @Override // p000.lfg
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static aag<Semaphore> semaphore(int stripes, final int permits) {
        return m271f(stripes, new lfg() { // from class: w9g
            @Override // p000.lfg
            public final Object get() {
                return aag.lambda$semaphore$1(permits);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int hashCode) {
        int i = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return (i >>> 4) ^ ((i >>> 7) ^ i);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> keys) {
        ArrayList arrayListNewArrayList = eb9.newArrayList(keys);
        if (arrayListNewArrayList.isEmpty()) {
            return kx7.m15110of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i = 0; i < arrayListNewArrayList.size(); i++) {
            iArr[i] = mo272g(arrayListNewArrayList.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < arrayListNewArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                arrayListNewArrayList.set(i3, arrayListNewArrayList.get(i3 - 1));
            } else {
                arrayListNewArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(arrayListNewArrayList);
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo272g(Object key);

    public abstract L get(Object key);

    public abstract L getAt(int index);

    public abstract int size();

    private aag() {
    }
}
