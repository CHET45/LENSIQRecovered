package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1044:1\n286#1:1047\n284#1:1048\n284#1:1049\n286#1:1050\n281#1:1053\n282#1,5:1054\n292#1:1060\n284#1:1061\n285#1:1062\n284#1:1065\n285#1:1066\n281#1:1067\n289#1:1068\n284#1:1069\n284#1:1072\n285#1:1073\n286#1:1074\n77#2:1045\n77#2:1059\n77#2:1070\n1#3:1046\n27#4:1051\n27#4:1063\n16#5:1052\n16#5:1064\n622#6:1071\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1047\n289#1:1048\n290#1:1049\n299#1:1050\n348#1:1053\n377#1:1054,5\n400#1:1060\n447#1:1061\n448#1:1062\n484#1:1065\n485#1:1066\n491#1:1067\n500#1:1068\n500#1:1069\n581#1:1072\n582#1:1073\n583#1:1074\n120#1:1045\n397#1:1059\n517#1:1070\n348#1:1051\n480#1:1063\n348#1:1052\n480#1:1064\n524#1:1071\n*E\n"})
public final class v13 implements Executor, Closeable {

    /* JADX INFO: renamed from: C */
    @yfb
    public static final C13811a f89649C = new C13811a(null);

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicLongFieldUpdater f89650F = AtomicLongFieldUpdater.newUpdater(v13.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicLongFieldUpdater f89651H = AtomicLongFieldUpdater.newUpdater(v13.class, "controlState$volatile");

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f89652L = AtomicIntegerFieldUpdater.newUpdater(v13.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: M */
    @un8
    @yfb
    public static final qhg f89653M = new qhg("NOT_IN_STACK");

    /* JADX INFO: renamed from: M1 */
    public static final long f89654M1 = 4398044413952L;

    /* JADX INFO: renamed from: N */
    public static final int f89655N = -1;

    /* JADX INFO: renamed from: Q */
    public static final int f89656Q = 0;

    /* JADX INFO: renamed from: V1 */
    public static final int f89657V1 = 42;

    /* JADX INFO: renamed from: X */
    public static final int f89658X = 1;

    /* JADX INFO: renamed from: Y */
    public static final int f89659Y = 21;

    /* JADX INFO: renamed from: Z */
    public static final long f89660Z = 2097151;

    /* JADX INFO: renamed from: Z1 */
    public static final long f89661Z1 = 9223367638808264704L;

    /* JADX INFO: renamed from: a2 */
    public static final int f89662a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f89663b2 = 2097150;

    /* JADX INFO: renamed from: c2 */
    public static final long f89664c2 = 2097151;

    /* JADX INFO: renamed from: d2 */
    public static final long f89665d2 = -2097152;

    /* JADX INFO: renamed from: e2 */
    public static final long f89666e2 = 2097152;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    @un8
    public final int f89667a;

    /* JADX INFO: renamed from: b */
    @un8
    public final int f89668b;

    /* JADX INFO: renamed from: c */
    @un8
    public final long f89669c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final String f89670d;

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public final p77 f89671e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public final p77 f89672f;

    /* JADX INFO: renamed from: m */
    @un8
    @yfb
    public final n5e<C13813c> f89673m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: v13$a */
    public static final class C13811a {
        public /* synthetic */ C13811a(jt3 jt3Var) {
            this();
        }

        private C13811a() {
        }
    }

    /* JADX INFO: renamed from: v13$b */
    public /* synthetic */ class C13812b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89674a;

        static {
            int[] iArr = new int[EnumC13814d.values().length];
            try {
                iArr[EnumC13814d.f89686c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13814d.f89685b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13814d.f89684a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13814d.f89687d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC13814d.f89688e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f89674a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: v13$d */
    public static final class EnumC13814d {

        /* JADX INFO: renamed from: a */
        public static final EnumC13814d f89684a = new EnumC13814d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC13814d f89685b = new EnumC13814d("BLOCKING", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC13814d f89686c = new EnumC13814d("PARKING", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC13814d f89687d = new EnumC13814d("DORMANT", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC13814d f89688e = new EnumC13814d("TERMINATED", 4);

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumC13814d[] f89689f;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ v35 f89690m;

        private static final /* synthetic */ EnumC13814d[] $values() {
            return new EnumC13814d[]{f89684a, f89685b, f89686c, f89687d, f89688e};
        }

        static {
            EnumC13814d[] enumC13814dArr$values = $values();
            f89689f = enumC13814dArr$values;
            f89690m = x35.enumEntries(enumC13814dArr$values);
        }

        private EnumC13814d(String str, int i) {
        }

        @yfb
        public static v35<EnumC13814d> getEntries() {
            return f89690m;
        }

        public static EnumC13814d valueOf(String str) {
            return (EnumC13814d) Enum.valueOf(EnumC13814d.class, str);
        }

        public static EnumC13814d[] values() {
            return (EnumC13814d[]) f89689f.clone();
        }
    }

    public v13(int i, int i2, long j, @yfb String str) {
        this.f89667a = i;
        this.f89668b = i2;
        this.f89669c = j;
        this.f89670d = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f89671e = new p77();
        this.f89672f = new p77();
        this.f89673m = new n5e<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m23669a(v13 v13Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f89651H.get(v13Var);
        }
        return v13Var.tryCreateWorker(j);
    }

    private final boolean addToGlobalQueue(mng mngVar) {
        return mngVar.f61584b ? this.f89672f.addLast(mngVar) : this.f89671e.addLast(mngVar);
    }

    private final int blockingTasks(long j) {
        return (int) ((j & f89654M1) >> 21);
    }

    private final int createNewWorker() {
        synchronized (this.f89673m) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j = f89651H.get(this);
                int i = (int) (j & 2097151);
                int iCoerceAtLeast = kpd.coerceAtLeast(i - ((int) ((j & f89654M1) >> 21)), 0);
                if (iCoerceAtLeast >= this.f89667a) {
                    return 0;
                }
                if (i >= this.f89668b) {
                    return 0;
                }
                int i2 = ((int) (getControlState$volatile$FU().get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.f89673m.get(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C13813c c13813c = new C13813c(this, i2);
                this.f89673m.setSynchronized(i2, c13813c);
                if (i2 != ((int) (2097151 & f89651H.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = iCoerceAtLeast + 1;
                c13813c.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final int createdWorkers(long j) {
        return (int) (j & 2097151);
    }

    private final C13813c currentWorker() {
        Thread threadCurrentThread = Thread.currentThread();
        C13813c c13813c = threadCurrentThread instanceof C13813c ? (C13813c) threadCurrentThread : null;
        if (c13813c == null || !md8.areEqual(v13.this, this)) {
            return null;
        }
        return c13813c;
    }

    private final void decrementBlockingTasks() {
        getControlState$volatile$FU().addAndGet(this, f89665d2);
    }

    private final int decrementCreatedWorkers() {
        return (int) (getControlState$volatile$FU().getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void dispatch$default(v13 v13Var, Runnable runnable, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        v13Var.dispatch(runnable, z, z2);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((f89651H.get(this) & f89661Z1) >> 42);
    }

    private final /* synthetic */ long getControlState$volatile() {
        return this.controlState$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getControlState$volatile$FU() {
        return f89651H;
    }

    private final int getCreatedWorkers() {
        return (int) (getControlState$volatile$FU().get(this) & 2097151);
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
        return this.parkedWorkersStack$volatile;
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
        return this._isTerminated$volatile;
    }

    private final long incrementBlockingTasks() {
        return f89651H.addAndGet(this, 2097152L);
    }

    private final int incrementCreatedWorkers() {
        return (int) (f89651H.incrementAndGet(this) & 2097151);
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, qy6<? super Long, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int parkedWorkersStackNextIndex(C13813c c13813c) {
        Object nextParkedWorker = c13813c.getNextParkedWorker();
        while (nextParkedWorker != f89653M) {
            if (nextParkedWorker == null) {
                return 0;
            }
            C13813c c13813c2 = (C13813c) nextParkedWorker;
            int indexInArray = c13813c2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = c13813c2.getNextParkedWorker();
        }
        return -1;
    }

    private final C13813c parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f89650F;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C13813c c13813c = this.f89673m.get((int) (2097151 & j));
            if (c13813c == null) {
                return null;
            }
            long j2 = (2097152 + j) & f89665d2;
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(c13813c);
            if (iParkedWorkersStackNextIndex >= 0 && f89650F.compareAndSet(this, j, ((long) iParkedWorkersStackNextIndex) | j2)) {
                c13813c.setNextParkedWorker(f89653M);
                return c13813c;
            }
        }
    }

    private final long releaseCpuPermit() {
        return getControlState$volatile$FU().addAndGet(this, 4398046511104L);
    }

    private final /* synthetic */ void setControlState$volatile(long j) {
        this.controlState$volatile = j;
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long j) {
        this.parkedWorkersStack$volatile = j;
    }

    private final /* synthetic */ void set_isTerminated$volatile(int i) {
        this._isTerminated$volatile = i;
    }

    private final void signalBlockingWork(long j, boolean z) {
        if (z || tryUnpark() || tryCreateWorker(j)) {
            return;
        }
        tryUnpark();
    }

    private final mng submitToLocalQueue(C13813c c13813c, mng mngVar, boolean z) {
        EnumC13814d enumC13814d;
        if (c13813c == null || (enumC13814d = c13813c.f89679c) == EnumC13814d.f89688e) {
            return mngVar;
        }
        if (!mngVar.f61584b && enumC13814d == EnumC13814d.f89685b) {
            return mngVar;
        }
        c13813c.f89683m = true;
        return c13813c.f89677a.add(mngVar, z);
    }

    private final boolean tryAcquireCpuPermit() {
        long j;
        AtomicLongFieldUpdater controlState$volatile$FU = getControlState$volatile$FU();
        do {
            j = controlState$volatile$FU.get(this);
            if (((int) ((f89661Z1 & j) >> 42)) == 0) {
                return false;
            }
        } while (!getControlState$volatile$FU().compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    private final boolean tryCreateWorker(long j) {
        if (kpd.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & f89654M1) >> 21)), 0) < this.f89667a) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.f89667a > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean tryUnpark() {
        C13813c c13813cParkedWorkersStackPop;
        do {
            c13813cParkedWorkersStackPop = parkedWorkersStackPop();
            if (c13813cParkedWorkersStackPop == null) {
                return false;
            }
        } while (!C13813c.f89675F.compareAndSet(c13813cParkedWorkersStackPop, -1, 0));
        LockSupport.unpark(c13813cParkedWorkersStackPop);
        return true;
    }

    public final int availableCpuPermits(long j) {
        return (int) ((j & f89661Z1) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        shutdown(10000L);
    }

    @yfb
    public final mng createTask(@yfb Runnable runnable, boolean z) {
        long jNanoTime = vng.f91819f.nanoTime();
        if (!(runnable instanceof mng)) {
            return vng.asTask(runnable, jNanoTime, z);
        }
        mng mngVar = (mng) runnable;
        mngVar.f61583a = jNanoTime;
        mngVar.f61584b = z;
        return mngVar;
    }

    public final void dispatch(@yfb Runnable runnable, boolean z, boolean z2) {
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.trackTask();
        }
        mng mngVarCreateTask = createTask(runnable, z);
        boolean z3 = mngVarCreateTask.f61584b;
        long jAddAndGet = z3 ? f89651H.addAndGet(this, 2097152L) : 0L;
        C13813c c13813cCurrentWorker = currentWorker();
        mng mngVarSubmitToLocalQueue = submitToLocalQueue(c13813cCurrentWorker, mngVarCreateTask, z2);
        if (mngVarSubmitToLocalQueue != null && !addToGlobalQueue(mngVarSubmitToLocalQueue)) {
            throw new RejectedExecutionException(this.f89670d + " was terminated");
        }
        boolean z4 = z2 && c13813cCurrentWorker != null;
        if (z3) {
            signalBlockingWork(jAddAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@yfb Runnable runnable) {
        dispatch$default(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f89652L.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(@yfb C13813c c13813c) {
        long j;
        long j2;
        int indexInArray;
        if (c13813c.getNextParkedWorker() != f89653M) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f89650F;
        do {
            j = atomicLongFieldUpdater.get(this);
            j2 = (2097152 + j) & f89665d2;
            indexInArray = c13813c.getIndexInArray();
            c13813c.setNextParkedWorker(this.f89673m.get((int) (2097151 & j)));
        } while (!f89650F.compareAndSet(this, j, j2 | ((long) indexInArray)));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(@yfb C13813c c13813c, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f89650F;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) (2097151 & j);
            long j2 = (2097152 + j) & f89665d2;
            if (iParkedWorkersStackNextIndex == i) {
                iParkedWorkersStackNextIndex = i2 == 0 ? parkedWorkersStackNextIndex(c13813c) : i2;
            }
            if (iParkedWorkersStackNextIndex >= 0 && f89650F.compareAndSet(this, j, j2 | ((long) iParkedWorkersStackNextIndex))) {
                return;
            }
        }
    }

    public final void runSafely(@yfb mng mngVar) {
        try {
            mngVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
                if (abstractC2202c5 == null) {
                }
            } finally {
                AbstractC2202c5 abstractC2202c52 = C4613d5.f28447a;
                if (abstractC2202c52 != null) {
                    abstractC2202c52.unTrackTask();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void shutdown(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isTerminated$volatile$FU()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            v13$c r0 = r7.currentWorker()
            n5e<v13$c> r1 = r7.f89673m
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            n5e<v13$c> r4 = r7.f89673m
            java.lang.Object r4 = r4.get(r1)
            p000.md8.checkNotNull(r4)
            v13$c r4 = (p000.v13.C13813c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            jqi r4 = r4.f89677a
            p77 r5 = r7.f89672f
            r4.offloadAllWorkTo(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            p77 r8 = r7.f89672f
            r8.close()
            p77 r8 = r7.f89671e
            r8.close()
        L57:
            if (r0 == 0) goto L5f
            mng r8 = r0.findTask(r2)
            if (r8 != 0) goto L8b
        L5f:
            p77 r8 = r7.f89671e
            java.lang.Object r8 = r8.removeFirstOrNull()
            mng r8 = (p000.mng) r8
            if (r8 != 0) goto L8b
            p77 r8 = r7.f89672f
            java.lang.Object r8 = r8.removeFirstOrNull()
            mng r8 = (p000.mng) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            v13$d r8 = p000.v13.EnumC13814d.f89688e
            r0.tryReleaseCpu(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = getParkedWorkersStack$volatile$FU()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = getControlState$volatile$FU()
            r8.set(r7, r0)
            return
        L8b:
            r7.runSafely(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v13.shutdown(long):void");
    }

    public final void signalCpuWork() {
        if (tryUnpark() || m23669a(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    @yfb
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iCurrentLength = this.f89673m.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iCurrentLength; i6++) {
            C13813c c13813c = this.f89673m.get(i6);
            if (c13813c != null) {
                int size$kotlinx_coroutines_core = c13813c.f89677a.getSize$kotlinx_coroutines_core();
                int i7 = C13812b.f89674a[c13813c.f89679c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(size$kotlinx_coroutines_core);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append(sjc.f82021k);
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(size$kotlinx_coroutines_core);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        throw new ceb();
                    }
                    i5++;
                }
            }
        }
        long j = f89651H.get(this);
        return this.f89670d + '@' + kk3.getHexAddress(this) + "[Pool Size {core = " + this.f89667a + ", max = " + this.f89668b + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f89671e.getSize() + ", global blocking queue size = " + this.f89672f.getSize() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((f89654M1 & j) >> 21)) + ", CPUs acquired = " + (this.f89667a - ((int) ((f89661Z1 & j) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: v13$c */
    @dwf({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1044:1\n298#2,2:1045\n286#2:1047\n300#2,4:1048\n305#2:1052\n295#2,2:1053\n295#2,2:1058\n281#2:1062\n290#2:1063\n284#2:1064\n281#2:1065\n1#3:1055\n77#4:1056\n77#4:1057\n27#5:1060\n16#6:1061\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n687#1:1045,2\n687#1:1047\n687#1:1048,4\n702#1:1052\n776#1:1053,2\n824#1:1058,2\n875#1:1062\n901#1:1063\n901#1:1064\n974#1:1065\n815#1:1056\n818#1:1057\n871#1:1060\n871#1:1061\n*E\n"})
    public final class C13813c extends Thread {

        /* JADX INFO: renamed from: F */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f89675F = AtomicIntegerFieldUpdater.newUpdater(C13813c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final jqi f89677a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final jvd.C8121h<mng> f89678b;

        /* JADX INFO: renamed from: c */
        @un8
        @yfb
        public EnumC13814d f89679c;

        /* JADX INFO: renamed from: d */
        public long f89680d;

        /* JADX INFO: renamed from: e */
        public long f89681e;

        /* JADX INFO: renamed from: f */
        public int f89682f;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: m */
        @un8
        public boolean f89683m;

        @gib
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private C13813c() {
            setDaemon(true);
            setContextClassLoader(v13.this.getClass().getClassLoader());
            this.f89677a = new jqi();
            this.f89678b = new jvd.C8121h<>();
            this.f89679c = EnumC13814d.f89687d;
            this.nextParkedWorker = v13.f89653M;
            int iNanoTime = (int) System.nanoTime();
            this.f89682f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void executeTask(mng mngVar) {
            this.f89680d = 0L;
            if (this.f89679c == EnumC13814d.f89686c) {
                this.f89679c = EnumC13814d.f89685b;
            }
            if (!mngVar.f61584b) {
                v13.this.runSafely(mngVar);
                return;
            }
            if (tryReleaseCpu(EnumC13814d.f89685b)) {
                v13.this.signalCpuWork();
            }
            v13.this.runSafely(mngVar);
            v13.getControlState$volatile$FU().addAndGet(v13.this, v13.f89665d2);
            if (this.f89679c != EnumC13814d.f89688e) {
                this.f89679c = EnumC13814d.f89687d;
            }
        }

        private final mng findAnyTask(boolean z) {
            mng mngVarPollGlobalQueues;
            mng mngVarPollGlobalQueues2;
            if (z) {
                boolean z2 = nextInt(v13.this.f89667a * 2) == 0;
                if (z2 && (mngVarPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return mngVarPollGlobalQueues2;
                }
                mng mngVarPoll = this.f89677a.poll();
                if (mngVarPoll != null) {
                    return mngVarPoll;
                }
                if (!z2 && (mngVarPollGlobalQueues = pollGlobalQueues()) != null) {
                    return mngVarPollGlobalQueues;
                }
            } else {
                mng mngVarPollGlobalQueues3 = pollGlobalQueues();
                if (mngVarPollGlobalQueues3 != null) {
                    return mngVarPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final mng findBlockingTask() {
            mng mngVarPollBlocking = this.f89677a.pollBlocking();
            if (mngVarPollBlocking != null) {
                return mngVarPollBlocking;
            }
            mng mngVarRemoveFirstOrNull = v13.this.f89672f.removeFirstOrNull();
            return mngVarRemoveFirstOrNull == null ? trySteal(1) : mngVarRemoveFirstOrNull;
        }

        private final mng findCpuTask() {
            mng mngVarPollCpu = this.f89677a.pollCpu();
            if (mngVarPollCpu != null) {
                return mngVarPollCpu;
            }
            mng mngVarRemoveFirstOrNull = v13.this.f89672f.removeFirstOrNull();
            return mngVarRemoveFirstOrNull == null ? trySteal(2) : mngVarRemoveFirstOrNull;
        }

        private final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }

        private final boolean inStack() {
            return this.nextParkedWorker != v13.f89653M;
        }

        private final void park() {
            if (this.f89680d == 0) {
                this.f89680d = System.nanoTime() + v13.this.f89669c;
            }
            LockSupport.parkNanos(v13.this.f89669c);
            if (System.nanoTime() - this.f89680d >= 0) {
                this.f89680d = 0L;
                tryTerminateWorker();
            }
        }

        private final mng pollGlobalQueues() {
            if (nextInt(2) == 0) {
                mng mngVarRemoveFirstOrNull = v13.this.f89671e.removeFirstOrNull();
                return mngVarRemoveFirstOrNull != null ? mngVarRemoveFirstOrNull : v13.this.f89672f.removeFirstOrNull();
            }
            mng mngVarRemoveFirstOrNull2 = v13.this.f89672f.removeFirstOrNull();
            return mngVarRemoveFirstOrNull2 != null ? mngVarRemoveFirstOrNull2 : v13.this.f89671e.removeFirstOrNull();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z = false;
                while (!v13.this.isTerminated() && this.f89679c != EnumC13814d.f89688e) {
                    mng mngVarFindTask = findTask(this.f89683m);
                    if (mngVarFindTask != null) {
                        this.f89681e = 0L;
                        executeTask(mngVarFindTask);
                    } else {
                        this.f89683m = false;
                        if (this.f89681e == 0) {
                            tryPark();
                        } else if (z) {
                            tryReleaseCpu(EnumC13814d.f89686c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f89681e);
                            this.f89681e = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            tryReleaseCpu(EnumC13814d.f89688e);
        }

        private final /* synthetic */ void setWorkerCtl$volatile(int i) {
            this.workerCtl$volatile = i;
        }

        private final boolean tryAcquireCpuPermit() {
            long j;
            if (this.f89679c == EnumC13814d.f89684a) {
                return true;
            }
            v13 v13Var = v13.this;
            AtomicLongFieldUpdater controlState$volatile$FU = v13.getControlState$volatile$FU();
            do {
                j = controlState$volatile$FU.get(v13Var);
                if (((int) ((v13.f89661Z1 & j) >> 42)) == 0) {
                    return false;
                }
            } while (!v13.getControlState$volatile$FU().compareAndSet(v13Var, j, j - 4398046511104L));
            this.f89679c = EnumC13814d.f89684a;
            return true;
        }

        private final void tryPark() {
            if (!inStack()) {
                v13.this.parkedWorkersStackPush(this);
                return;
            }
            f89675F.set(this, -1);
            while (inStack() && f89675F.get(this) == -1 && !v13.this.isTerminated() && this.f89679c != EnumC13814d.f89688e) {
                tryReleaseCpu(EnumC13814d.f89686c);
                Thread.interrupted();
                park();
            }
        }

        private final mng trySteal(int i) {
            int i2 = (int) (v13.getControlState$volatile$FU().get(v13.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iNextInt = nextInt(i2);
            v13 v13Var = v13.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iNextInt++;
                if (iNextInt > i2) {
                    iNextInt = 1;
                }
                C13813c c13813c = v13Var.f89673m.get(iNextInt);
                if (c13813c != null && c13813c != this) {
                    long jTrySteal = c13813c.f89677a.trySteal(i, this.f89678b);
                    if (jTrySteal == -1) {
                        jvd.C8121h<mng> c8121h = this.f89678b;
                        mng mngVar = c8121h.f52110a;
                        c8121h.f52110a = null;
                        return mngVar;
                    }
                    if (jTrySteal > 0) {
                        jMin = Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f89681e = jMin;
            return null;
        }

        private final void tryTerminateWorker() {
            v13 v13Var = v13.this;
            synchronized (v13Var.f89673m) {
                try {
                    if (v13Var.isTerminated()) {
                        return;
                    }
                    if (((int) (v13.getControlState$volatile$FU().get(v13Var) & 2097151)) <= v13Var.f89667a) {
                        return;
                    }
                    if (f89675F.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        setIndexInArray(0);
                        v13Var.parkedWorkersStackTopUpdate(this, i, 0);
                        int andDecrement = (int) (v13.getControlState$volatile$FU().getAndDecrement(v13Var) & 2097151);
                        if (andDecrement != i) {
                            C13813c c13813c = v13Var.f89673m.get(andDecrement);
                            md8.checkNotNull(c13813c);
                            C13813c c13813c2 = c13813c;
                            v13Var.f89673m.setSynchronized(i, c13813c2);
                            c13813c2.setIndexInArray(i);
                            v13Var.parkedWorkersStackTopUpdate(c13813c2, andDecrement, i);
                        }
                        v13Var.f89673m.setSynchronized(andDecrement, null);
                        bth bthVar = bth.f14751a;
                        this.f89679c = EnumC13814d.f89688e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @gib
        public final mng findTask(boolean z) {
            return tryAcquireCpuPermit() ? findAnyTask(z) : findBlockingTask();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @gib
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @yfb
        public final v13 getScheduler() {
            return v13.this;
        }

        public final boolean isIo() {
            return this.f89679c == EnumC13814d.f89685b;
        }

        public final int nextInt(int i) {
            int i2 = this.f89682f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f89682f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        public final long runSingleTask() {
            boolean z = this.f89679c == EnumC13814d.f89684a;
            mng mngVarFindCpuTask = z ? findCpuTask() : findBlockingTask();
            if (mngVarFindCpuTask == null) {
                long j = this.f89681e;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            v13.this.runSafely(mngVarFindCpuTask);
            if (!z) {
                v13.getControlState$volatile$FU().addAndGet(v13.this, v13.f89665d2);
            }
            return 0L;
        }

        public final void setIndexInArray(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(v13.this.f89670d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void setNextParkedWorker(@gib Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(@yfb EnumC13814d enumC13814d) {
            EnumC13814d enumC13814d2 = this.f89679c;
            boolean z = enumC13814d2 == EnumC13814d.f89684a;
            if (z) {
                v13.getControlState$volatile$FU().addAndGet(v13.this, 4398046511104L);
            }
            if (enumC13814d2 != enumC13814d) {
                this.f89679c = enumC13814d;
            }
            return z;
        }

        public C13813c(v13 v13Var, int i) {
            this();
            setIndexInArray(i);
        }
    }

    public /* synthetic */ v13(int i, int i2, long j, String str, int i3, jt3 jt3Var) {
        this(i, i2, (i3 & 4) != 0 ? vng.f91818e : j, (i3 & 8) != 0 ? vng.f91814a : str);
    }
}
