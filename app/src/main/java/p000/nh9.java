package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
public final class nh9<E> {

    /* JADX INFO: renamed from: h */
    public static final int f64525h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f64526i = 30;

    /* JADX INFO: renamed from: j */
    public static final int f64527j = 1073741823;

    /* JADX INFO: renamed from: k */
    public static final int f64528k = 0;

    /* JADX INFO: renamed from: l */
    public static final long f64529l = 1073741823;

    /* JADX INFO: renamed from: m */
    public static final int f64530m = 30;

    /* JADX INFO: renamed from: n */
    public static final long f64531n = 1152921503533105152L;

    /* JADX INFO: renamed from: o */
    public static final int f64532o = 60;

    /* JADX INFO: renamed from: p */
    public static final long f64533p = 1152921504606846976L;

    /* JADX INFO: renamed from: q */
    public static final int f64534q = 61;

    /* JADX INFO: renamed from: r */
    public static final long f64535r = 2305843009213693952L;

    /* JADX INFO: renamed from: s */
    public static final int f64536s = 1024;

    /* JADX INFO: renamed from: u */
    public static final int f64538u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f64539v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f64540w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f64541a;

    /* JADX INFO: renamed from: b */
    public final boolean f64542b;

    /* JADX INFO: renamed from: c */
    public final int f64543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f64544d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C9877a f64522e = new C9877a(null);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f64523f = AtomicReferenceFieldUpdater.newUpdater(nh9.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f64524g = AtomicLongFieldUpdater.newUpdater(nh9.class, "_state$volatile");

    /* JADX INFO: renamed from: t */
    @un8
    @yfb
    public static final qhg f64537t = new qhg("REMOVE_FROZEN");

    /* JADX INFO: renamed from: nh9$a */
    public static final class C9877a {
        public /* synthetic */ C9877a(jt3 jt3Var) {
            this();
        }

        public final int addFailReason(long j) {
            return (j & nh9.f64535r) != 0 ? 2 : 1;
        }

        public final long updateHead(long j, int i) {
            return m17958wo(j, nh9.f64529l) | ((long) i);
        }

        public final long updateTail(long j, int i) {
            return m17958wo(j, nh9.f64531n) | (((long) i) << 30);
        }

        public final <T> T withState(long j, @yfb gz6<? super Integer, ? super Integer, ? extends T> gz6Var) {
            return gz6Var.invoke(Integer.valueOf((int) (nh9.f64529l & j)), Integer.valueOf((int) ((j & nh9.f64531n) >> 30)));
        }

        /* JADX INFO: renamed from: wo */
        public final long m17958wo(long j, long j2) {
            return j & (~j2);
        }

        private C9877a() {
        }
    }

    /* JADX INFO: renamed from: nh9$b */
    public static final class C9878b {

        /* JADX INFO: renamed from: a */
        @un8
        public final int f64545a;

        public C9878b(int i) {
            this.f64545a = i;
        }
    }

    public nh9(int i, boolean z) {
        this.f64541a = i;
        this.f64542b = z;
        int i2 = i - 1;
        this.f64543c = i2;
        this.f64544d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final nh9<E> allocateNextCopy(long j) {
        nh9<E> nh9Var = new nh9<>(this.f64541a * 2, this.f64542b);
        int i = (int) (f64529l & j);
        int i2 = (int) ((f64531n & j) >> 30);
        while (true) {
            int i3 = this.f64543c;
            if ((i & i3) == (i3 & i2)) {
                f64524g.set(nh9Var, f64522e.m17958wo(j, f64533p));
                return nh9Var;
            }
            Object c9878b = getArray().get(this.f64543c & i);
            if (c9878b == null) {
                c9878b = new C9878b(i);
            }
            nh9Var.getArray().set(nh9Var.f64543c & i, c9878b);
            i++;
        }
    }

    private final nh9<E> allocateOrGetNextCopy(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64523f;
        while (true) {
            nh9<E> nh9Var = (nh9) atomicReferenceFieldUpdater.get(this);
            if (nh9Var != null) {
                return nh9Var;
            }
            C0051a4.m134a(f64523f, this, null, allocateNextCopy(j));
        }
    }

    private final nh9<E> fillPlaceholder(int i, E e) {
        Object obj = getArray().get(this.f64543c & i);
        if (!(obj instanceof C9878b) || ((C9878b) obj).f64545a != i) {
            return null;
        }
        getArray().set(i & this.f64543c, e);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.f64544d;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long markFrozen() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f64524g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & f64533p) != 0) {
                return j;
            }
            j2 = j | f64533p;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final nh9<E> removeSlowPath(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f64524g;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (f64529l & j);
            if ((f64533p & j) != 0) {
                return next();
            }
        } while (!f64524g.compareAndSet(this, j, f64522e.updateHead(j, i2)));
        getArray().set(this.f64543c & i3, null);
        return null;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(long j) {
        this._state$volatile = j;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, Long> qy6Var) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, qy6Var.invoke(Long.valueOf(j)).longValue()));
    }

    private final /* synthetic */ long updateAndGet$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, Long> qy6Var) {
        long j;
        Long lInvoke;
        do {
            j = atomicLongFieldUpdater.get(obj);
            lInvoke = qy6Var.invoke(Long.valueOf(j));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, lInvoke.longValue()));
        return lInvoke.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int addLast(@p000.yfb E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            nh9$a r13 = p000.nh9.f64522e
            int r13 = r13.addFailReason(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f64543c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f64542b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.getArray()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f64541a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = get_state$volatile$FU()
            nh9$a r5 = p000.nh9.f64522e
            long r5 = r5.updateTail(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.getArray()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            nh9 r0 = r0.next()
            nh9 r0 = r0.fillPlaceholder(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nh9.addLast(java.lang.Object):int");
    }

    public final boolean close() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f64524g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & f64535r) != 0) {
                return true;
            }
            if ((f64533p & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | f64535r));
        return true;
    }

    public final int getSize() {
        long j = f64524g.get(this);
        return (((int) ((j & f64531n) >> 30)) - ((int) (f64529l & j))) & 1073741823;
    }

    public final boolean isClosed() {
        return (f64524g.get(this) & f64535r) != 0;
    }

    public final boolean isEmpty() {
        long j = f64524g.get(this);
        return ((int) (f64529l & j)) == ((int) ((j & f64531n) >> 30));
    }

    @yfb
    public final <R> List<R> map(@yfb qy6<? super E, ? extends R> qy6Var) {
        ArrayList arrayList = new ArrayList(this.f64541a);
        long j = f64524g.get(this);
        int i = (int) (f64529l & j);
        int i2 = (int) ((j & f64531n) >> 30);
        while (true) {
            int i3 = this.f64543c;
            if ((i & i3) == (i3 & i2)) {
                return arrayList;
            }
            InterfaceC0000a interfaceC0000a = (Object) getArray().get(this.f64543c & i);
            if (interfaceC0000a != null && !(interfaceC0000a instanceof C9878b)) {
                arrayList.add(qy6Var.invoke(interfaceC0000a));
            }
            i++;
        }
    }

    @yfb
    public final nh9<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    @gib
    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f64524g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((f64533p & j) != 0) {
                return f64537t;
            }
            int i = (int) (f64529l & j);
            int i2 = (int) ((f64531n & j) >> 30);
            int i3 = this.f64543c;
            if ((i2 & i3) == (i3 & i)) {
                return null;
            }
            Object obj = getArray().get(this.f64543c & i);
            if (obj == null) {
                if (this.f64542b) {
                    return null;
                }
            } else {
                if (obj instanceof C9878b) {
                    return null;
                }
                int i4 = (i + 1) & 1073741823;
                if (f64524g.compareAndSet(this, j, f64522e.updateHead(j, i4))) {
                    getArray().set(this.f64543c & i, null);
                    return obj;
                }
                if (this.f64542b) {
                    nh9<E> nh9VarRemoveSlowPath = this;
                    do {
                        nh9VarRemoveSlowPath = nh9VarRemoveSlowPath.removeSlowPath(i, i4);
                    } while (nh9VarRemoveSlowPath != null);
                    return obj;
                }
            }
        }
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }
}
