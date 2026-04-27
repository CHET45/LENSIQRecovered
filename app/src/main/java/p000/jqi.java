package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class jqi {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f51530b = AtomicReferenceFieldUpdater.newUpdater(jqi.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f51531c = AtomicIntegerFieldUpdater.newUpdater(jqi.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f51532d = AtomicIntegerFieldUpdater.newUpdater(jqi.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f51533e = AtomicIntegerFieldUpdater.newUpdater(jqi.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReferenceArray<mng> f51534a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static /* synthetic */ mng add$default(jqi jqiVar, mng mngVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jqiVar.add(mngVar, z);
    }

    private final mng addLast(mng mngVar) {
        if (getBufferSize() == 127) {
            return mngVar;
        }
        if (mngVar.f61584b) {
            f51533e.incrementAndGet(this);
        }
        int i = f51531c.get(this) & 127;
        while (this.f51534a.get(i) != null) {
            Thread.yield();
        }
        this.f51534a.lazySet(i, mngVar);
        f51531c.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(mng mngVar) {
        if (mngVar == null || !mngVar.f61584b) {
            return;
        }
        f51533e.decrementAndGet(this);
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int getBufferSize() {
        return f51531c.get(this) - f51532d.get(this);
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
        return this.consumerIndex$volatile;
    }

    private final /* synthetic */ Object getLastScheduledTask$volatile() {
        return this.lastScheduledTask$volatile;
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
        return this.producerIndex$volatile;
    }

    private final mng pollBuffer() {
        mng andSet;
        while (true) {
            int i = f51532d.get(this);
            if (i - f51531c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f51532d.compareAndSet(this, i, i + 1) && (andSet = this.f51534a.getAndSet(i2, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(p77 p77Var) {
        mng mngVarPollBuffer = pollBuffer();
        if (mngVarPollBuffer == null) {
            return false;
        }
        p77Var.addLast(mngVarPollBuffer);
        return true;
    }

    private final mng pollWithExclusiveMode(boolean z) {
        mng mngVar;
        do {
            mngVar = (mng) f51530b.get(this);
            if (mngVar == null || mngVar.f61584b != z) {
                int i = f51532d.get(this);
                int i2 = f51531c.get(this);
                while (i != i2) {
                    if (z && f51533e.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    mng mngVarTryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, z);
                    if (mngVarTryExtractFromTheMiddle != null) {
                        return mngVarTryExtractFromTheMiddle;
                    }
                }
                return null;
            }
        } while (!C0051a4.m134a(f51530b, this, mngVar, null));
        return mngVar;
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int i) {
        this.blockingTasksInBuffer$volatile = i;
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int i) {
        this.consumerIndex$volatile = i;
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    private final /* synthetic */ void setProducerIndex$volatile(int i) {
        this.producerIndex$volatile = i;
    }

    private final mng stealWithExclusiveMode(int i) {
        int i2 = f51532d.get(this);
        int i3 = f51531c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && f51533e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            mng mngVarTryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, z);
            if (mngVarTryExtractFromTheMiddle != null) {
                return mngVarTryExtractFromTheMiddle;
            }
            i2 = i4;
        }
        return null;
    }

    private final mng tryExtractFromTheMiddle(int i, boolean z) {
        int i2 = i & 127;
        mng mngVar = this.f51534a.get(i2);
        if (mngVar == null || mngVar.f61584b != z || !bag.m3024a(this.f51534a, i2, mngVar, null)) {
            return null;
        }
        if (z) {
            f51533e.decrementAndGet(this);
        }
        return mngVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, mng] */
    private final long tryStealLastScheduled(int i, jvd.C8121h<mng> c8121h) {
        ?? r0;
        do {
            r0 = (mng) f51530b.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.f61584b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long jNanoTime = vng.f91819f.nanoTime() - r0.f61583a;
            long j = vng.f91815b;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
        } while (!C0051a4.m134a(f51530b, this, r0, null));
        c8121h.f52110a = r0;
        return -1L;
    }

    @gib
    public final mng add(@yfb mng mngVar, boolean z) {
        if (z) {
            return addLast(mngVar);
        }
        mng mngVar2 = (mng) f51530b.getAndSet(this, mngVar);
        if (mngVar2 == null) {
            return null;
        }
        return addLast(mngVar2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return f51530b.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(@yfb p77 p77Var) {
        mng mngVar = (mng) f51530b.getAndSet(this, null);
        if (mngVar != null) {
            p77Var.addLast(mngVar);
        }
        while (pollTo(p77Var)) {
        }
    }

    @gib
    public final mng poll() {
        mng mngVar = (mng) f51530b.getAndSet(this, null);
        return mngVar == null ? pollBuffer() : mngVar;
    }

    @gib
    public final mng pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    @gib
    public final mng pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i, @yfb jvd.C8121h<mng> c8121h) {
        T tPollBuffer = i == 3 ? pollBuffer() : stealWithExclusiveMode(i);
        if (tPollBuffer == 0) {
            return tryStealLastScheduled(i, c8121h);
        }
        c8121h.f52110a = tPollBuffer;
        return -1L;
    }
}
