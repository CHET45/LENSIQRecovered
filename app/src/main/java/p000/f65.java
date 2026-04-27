package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.o34;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n27#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
public abstract class f65 extends g65 implements o34 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35472f = AtomicReferenceFieldUpdater.newUpdater(f65.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35473m = AtomicReferenceFieldUpdater.newUpdater(f65.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35471C = AtomicIntegerFieldUpdater.newUpdater(f65.class, "_isCompleted$volatile");

    /* JADX INFO: renamed from: f65$a */
    @dwf({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    public final class C5631a extends AbstractRunnableC5633c {

        /* JADX INFO: renamed from: c */
        @yfb
        public final dq1<bth> f35474c;

        /* JADX WARN: Multi-variable type inference failed */
        public C5631a(long j, @yfb dq1<? super bth> dq1Var) {
            super(j);
            this.f35474c = dq1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35474c.resumeUndispatched(f65.this, bth.f14751a);
        }

        @Override // p000.f65.AbstractRunnableC5633c
        @yfb
        public String toString() {
            return super.toString() + this.f35474c;
        }
    }

    /* JADX INFO: renamed from: f65$b */
    public static final class C5632b extends AbstractRunnableC5633c {

        /* JADX INFO: renamed from: c */
        @yfb
        public final Runnable f35476c;

        public C5632b(long j, @yfb Runnable runnable) {
            super(j);
            this.f35476c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35476c.run();
        }

        @Override // p000.f65.AbstractRunnableC5633c
        @yfb
        public String toString() {
            return super.toString() + this.f35476c;
        }
    }

    /* JADX INFO: renamed from: f65$c */
    @dwf({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n27#2:548\n27#2:551\n27#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class AbstractRunnableC5633c implements Runnable, Comparable<AbstractRunnableC5633c>, yf4, nyg {

        @gib
        private volatile Object _heap;

        /* JADX INFO: renamed from: a */
        @un8
        public long f35477a;

        /* JADX INFO: renamed from: b */
        public int f35478b = -1;

        public AbstractRunnableC5633c(long j) {
            this.f35477a = j;
        }

        @Override // p000.yf4
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == i65.f45825a) {
                        return;
                    }
                    C5634d c5634d = obj instanceof C5634d ? (C5634d) obj : null;
                    if (c5634d != null) {
                        c5634d.remove(this);
                    }
                    this._heap = i65.f45825a;
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.nyg
        @gib
        public myg<?> getHeap() {
            Object obj = this._heap;
            if (obj instanceof myg) {
                return (myg) obj;
            }
            return null;
        }

        @Override // p000.nyg
        public int getIndex() {
            return this.f35478b;
        }

        public final int scheduleTask(long j, @yfb C5634d c5634d, @yfb f65 f65Var) {
            synchronized (this) {
                if (this._heap == i65.f45825a) {
                    return 2;
                }
                synchronized (c5634d) {
                    try {
                        AbstractRunnableC5633c abstractRunnableC5633cFirstImpl = c5634d.firstImpl();
                        if (f65Var.isCompleted()) {
                            return 1;
                        }
                        if (abstractRunnableC5633cFirstImpl == null) {
                            c5634d.f35479c = j;
                        } else {
                            long j2 = abstractRunnableC5633cFirstImpl.f35477a;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - c5634d.f35479c > 0) {
                                c5634d.f35479c = j;
                            }
                        }
                        long j3 = this.f35477a;
                        long j4 = c5634d.f35479c;
                        if (j3 - j4 < 0) {
                            this.f35477a = j4;
                        }
                        c5634d.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // p000.nyg
        public void setHeap(@gib myg<?> mygVar) {
            if (this._heap == i65.f45825a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = mygVar;
        }

        @Override // p000.nyg
        public void setIndex(int i) {
            this.f35478b = i;
        }

        public final boolean timeToExecute(long j) {
            return j - this.f35477a >= 0;
        }

        @yfb
        public String toString() {
            return "Delayed[nanos=" + this.f35477a + C4584d2.f28243l;
        }

        @Override // java.lang.Comparable
        public int compareTo(@yfb AbstractRunnableC5633c abstractRunnableC5633c) {
            long j = this.f35477a - abstractRunnableC5633c.f35477a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: f65$d */
    public static final class C5634d extends myg<AbstractRunnableC5633c> {

        /* JADX INFO: renamed from: c */
        @un8
        public long f35479c;

        public C5634d(long j) {
            this.f35479c = j;
        }
    }

    private final void closeQueue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35472f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C0051a4.m134a(f35472f, this, null, i65.f45832h)) {
                    return;
                }
            } else if (obj instanceof nh9) {
                ((nh9) obj).close();
                return;
            } else {
                if (obj == i65.f45832h) {
                    return;
                }
                nh9 nh9Var = new nh9(8, true);
                md8.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                nh9Var.addLast((Runnable) obj);
                if (C0051a4.m134a(f35472f, this, obj, nh9Var)) {
                    return;
                }
            }
        }
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35472f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof nh9) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                nh9 nh9Var = (nh9) obj;
                Object objRemoveFirstOrNull = nh9Var.removeFirstOrNull();
                if (objRemoveFirstOrNull != nh9.f64537t) {
                    return (Runnable) objRemoveFirstOrNull;
                }
                C0051a4.m134a(f35472f, this, obj, nh9Var.next());
            } else {
                if (obj == i65.f45832h) {
                    return null;
                }
                if (C0051a4.m134a(f35472f, this, obj, null)) {
                    md8.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void enqueueDelayedTasks() {
        AbstractRunnableC5633c abstractRunnableC5633cRemoveAtImpl;
        C5634d c5634d = (C5634d) f35473m.get(this);
        if (c5634d == null || c5634d.isEmpty()) {
            return;
        }
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        long jNanoTime = abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime();
        do {
            synchronized (c5634d) {
                try {
                    AbstractRunnableC5633c abstractRunnableC5633cFirstImpl = c5634d.firstImpl();
                    if (abstractRunnableC5633cFirstImpl != null) {
                        AbstractRunnableC5633c abstractRunnableC5633c = abstractRunnableC5633cFirstImpl;
                        abstractRunnableC5633cRemoveAtImpl = abstractRunnableC5633c.timeToExecute(jNanoTime) ? enqueueImpl(abstractRunnableC5633c) : false ? c5634d.removeAtImpl(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC5633cRemoveAtImpl != null);
    }

    private final boolean enqueueImpl(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35472f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (C0051a4.m134a(f35472f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof nh9) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                nh9 nh9Var = (nh9) obj;
                int iAddLast = nh9Var.addLast(runnable);
                if (iAddLast == 0) {
                    return true;
                }
                if (iAddLast == 1) {
                    C0051a4.m134a(f35472f, this, obj, nh9Var.next());
                } else if (iAddLast == 2) {
                    return false;
                }
            } else {
                if (obj == i65.f45832h) {
                    return false;
                }
                nh9 nh9Var2 = new nh9(8, true);
                md8.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                nh9Var2.addLast((Runnable) obj);
                nh9Var2.addLast(runnable);
                if (C0051a4.m134a(f35472f, this, obj, nh9Var2)) {
                    return true;
                }
            }
        }
    }

    private final /* synthetic */ Object get_delayed$volatile() {
        return this._delayed$volatile;
    }

    private final /* synthetic */ int get_isCompleted$volatile() {
        return this._isCompleted$volatile;
    }

    private final /* synthetic */ Object get_queue$volatile() {
        return this._queue$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f35471C.get(this) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void rescheduleAllDelayed() {
        AbstractRunnableC5633c abstractRunnableC5633cRemoveFirstOrNull;
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        long jNanoTime = abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime();
        while (true) {
            C5634d c5634d = (C5634d) f35473m.get(this);
            if (c5634d == null || (abstractRunnableC5633cRemoveFirstOrNull = c5634d.removeFirstOrNull()) == null) {
                return;
            } else {
                mo11414d(jNanoTime, abstractRunnableC5633cRemoveFirstOrNull);
            }
        }
    }

    private final int scheduleImpl(long j, AbstractRunnableC5633c abstractRunnableC5633c) {
        if (isCompleted()) {
            return 1;
        }
        C5634d c5634d = (C5634d) f35473m.get(this);
        if (c5634d == null) {
            C0051a4.m134a(f35473m, this, null, new C5634d(j));
            Object obj = f35473m.get(this);
            md8.checkNotNull(obj);
            c5634d = (C5634d) obj;
        }
        return abstractRunnableC5633c.scheduleTask(j, c5634d, this);
    }

    private final void setCompleted(boolean z) {
        f35471C.set(this, z ? 1 : 0);
    }

    private final /* synthetic */ void set_delayed$volatile(Object obj) {
        this._delayed$volatile = obj;
    }

    private final /* synthetic */ void set_isCompleted$volatile(int i) {
        this._isCompleted$volatile = i;
    }

    private final /* synthetic */ void set_queue$volatile(Object obj) {
        this._queue$volatile = obj;
    }

    private final boolean shouldUnpark(AbstractRunnableC5633c abstractRunnableC5633c) {
        C5634d c5634d = (C5634d) f35473m.get(this);
        return (c5634d != null ? c5634d.peek() : null) == abstractRunnableC5633c;
    }

    @Override // p000.e65
    /* JADX INFO: renamed from: a */
    public long mo9713a() {
        AbstractRunnableC5633c abstractRunnableC5633cPeek;
        if (super.mo9713a() == 0) {
            return 0L;
        }
        Object obj = f35472f.get(this);
        if (obj != null) {
            if (!(obj instanceof nh9)) {
                return obj == i65.f45832h ? Long.MAX_VALUE : 0L;
            }
            if (!((nh9) obj).isEmpty()) {
                return 0L;
            }
        }
        C5634d c5634d = (C5634d) f35473m.get(this);
        if (c5634d == null || (abstractRunnableC5633cPeek = c5634d.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j = abstractRunnableC5633cPeek.f35477a;
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        return kpd.coerceAtLeast(j - (abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime()), 0L);
    }

    @Override // p000.e65
    /* JADX INFO: renamed from: b */
    public boolean mo9714b() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        C5634d c5634d = (C5634d) f35473m.get(this);
        if (c5634d != null && !c5634d.isEmpty()) {
            return false;
        }
        Object obj = f35472f.get(this);
        if (obj != null) {
            if (obj instanceof nh9) {
                return ((nh9) obj).isEmpty();
            }
            if (obj != i65.f45832h) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return o34.C10164a.delay(this, j, zy2Var);
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public final void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(@yfb Runnable runnable) {
        enqueueDelayedTasks();
        if (enqueueImpl(runnable)) {
            m11415e();
        } else {
            tu3.f85932F.enqueue(runnable);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10667f() {
        f35472f.set(this, null);
        f35473m.set(this, null);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public final yf4 m10668g(long j, @yfb Runnable runnable) {
        long jDelayToNanos = i65.delayToNanos(j);
        if (jDelayToNanos >= 4611686018427387903L) {
            return xeb.f97598a;
        }
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        long jNanoTime = abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime();
        C5632b c5632b = new C5632b(jDelayToNanos + jNanoTime, runnable);
        schedule(jNanoTime, c5632b);
        return c5632b;
    }

    @Override // p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        return o34.C10164a.invokeOnTimeout(this, j, runnable, e13Var);
    }

    @Override // p000.e65
    public long processNextEvent() {
        if (processUnconfinedEvent()) {
            return 0L;
        }
        enqueueDelayedTasks();
        Runnable runnableDequeue = dequeue();
        if (runnableDequeue == null) {
            return mo9713a();
        }
        runnableDequeue.run();
        return 0L;
    }

    public final void schedule(long j, @yfb AbstractRunnableC5633c abstractRunnableC5633c) {
        int iScheduleImpl = scheduleImpl(j, abstractRunnableC5633c);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(abstractRunnableC5633c)) {
                m11415e();
            }
        } else if (iScheduleImpl == 1) {
            mo11414d(j, abstractRunnableC5633c);
        } else if (iScheduleImpl != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        long jDelayToNanos = i65.delayToNanos(j);
        if (jDelayToNanos < 4611686018427387903L) {
            AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
            long jNanoTime = abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime();
            C5631a c5631a = new C5631a(jDelayToNanos + jNanoTime, dq1Var);
            schedule(jNanoTime, c5631a);
            hq1.disposeOnCancellation(dq1Var, c5631a);
        }
    }

    @Override // p000.e65
    public void shutdown() {
        xxg.f99642a.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }
}
