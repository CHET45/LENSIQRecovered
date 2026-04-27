package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n369#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
public class jye {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52235c = AtomicReferenceFieldUpdater.newUpdater(jye.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f52236d = AtomicLongFieldUpdater.newUpdater(jye.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52237e = AtomicReferenceFieldUpdater.newUpdater(jye.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f52238f = AtomicLongFieldUpdater.newUpdater(jye.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f52239g = AtomicIntegerFieldUpdater.newUpdater(jye.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f52240a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kz6<Throwable, bth, e13, bth> f52241b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: jye$a */
    public /* synthetic */ class C8142a extends n07 implements gz6<Long, mye, mye> {

        /* JADX INFO: renamed from: a */
        public static final C8142a f52242a = new C8142a();

        public C8142a() {
            super(2, lye.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final mye invoke(long j, mye myeVar) {
            return lye.createSegment(j, myeVar);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ mye invoke(Long l, mye myeVar) {
            return invoke(l.longValue(), myeVar);
        }
    }

    /* JADX INFO: renamed from: jye$b */
    public /* synthetic */ class C8143b extends n07 implements gz6<Long, mye, mye> {

        /* JADX INFO: renamed from: a */
        public static final C8143b f52243a = new C8143b();

        public C8143b() {
            super(2, lye.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final mye invoke(long j, mye myeVar) {
            return lye.createSegment(j, myeVar);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ mye invoke(Long l, mye myeVar) {
            return invoke(l.longValue(), myeVar);
        }
    }

    public jye(int i, int i2) {
        this.f52240a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        mye myeVar = new mye(0L, null, 2);
        this.head$volatile = myeVar;
        this.tail$volatile = myeVar;
        this._availablePermits$volatile = i - i2;
        this.f52241b = new kz6() { // from class: iye
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return jye.onCancellationRelease$lambda$2(this.f48914a, (Throwable) obj, (bth) obj2, (e13) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(zy2<? super bth> zy2Var) {
        fq1 orCreateCancellableContinuation = hq1.getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                m14385b(orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(wgi wgiVar) {
        Object objFindSegmentInternal;
        mye myeVar = (mye) f52237e.get(this);
        long andIncrement = f52238f.getAndIncrement(this);
        C8142a c8142a = C8142a.f52242a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52237e;
        long j = andIncrement / ((long) lye.f59271f);
        loop0: while (true) {
            objFindSegmentInternal = op2.findSegmentInternal(myeVar, j, c8142a);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceFieldUpdater.get(this);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C0051a4.m134a(atomicReferenceFieldUpdater, this, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        mye myeVar2 = (mye) ave.m27897getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % ((long) lye.f59271f));
        if (bag.m3024a(myeVar2.getAcquirers(), i, null, wgiVar)) {
            wgiVar.invokeOnCancellation(myeVar2, i);
            return true;
        }
        if (!bag.m3024a(myeVar2.getAcquirers(), i, lye.f59267b, lye.f59268c)) {
            return false;
        }
        if (wgiVar instanceof dq1) {
            md8.checkNotNull(wgiVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((dq1) wgiVar).resume(bth.f14751a, this.f52241b);
        } else {
            if (!(wgiVar instanceof pve)) {
                throw new IllegalStateException(("unexpected: " + wgiVar).toString());
            }
            ((pve) wgiVar).selectInRegistrationPhase(bth.f14751a);
        }
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = f52239g.get(this);
            if (i <= this.f52240a) {
                return;
            }
        } while (!f52239g.compareAndSet(this, i, this.f52240a));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = f52239g.getAndDecrement(this);
        } while (andDecrement > this.f52240a);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth onCancellationRelease$lambda$2(jye jyeVar, Throwable th, bth bthVar, e13 e13Var) {
        jyeVar.release();
        return bth.f14751a;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j) {
        this.deqIdx$volatile = j;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j) {
        this.enqIdx$volatile = j;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i) {
        this._availablePermits$volatile = i;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (!(obj instanceof dq1)) {
            if (obj instanceof pve) {
                return ((pve) obj).trySelect(this, bth.f14751a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        dq1 dq1Var = (dq1) obj;
        Object objTryResume = dq1Var.tryResume(bth.f14751a, null, this.f52241b);
        if (objTryResume == null) {
            return false;
        }
        dq1Var.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        mye myeVar = (mye) f52235c.get(this);
        long andIncrement = f52236d.getAndIncrement(this);
        long j = andIncrement / ((long) lye.f59271f);
        C8143b c8143b = C8143b.f52243a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52235c;
        loop0: while (true) {
            objFindSegmentInternal = op2.findSegmentInternal(myeVar, j, c8143b);
            if (ave.m27899isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
            while (true) {
                sue sueVar = (sue) atomicReferenceFieldUpdater.get(this);
                if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                    break loop0;
                }
                if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (C0051a4.m134a(atomicReferenceFieldUpdater, this, sueVar, sueVarM27897getSegmentimpl)) {
                    if (sueVar.decPointers$kotlinx_coroutines_core()) {
                        sueVar.remove();
                    }
                } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    sueVarM27897getSegmentimpl.remove();
                }
            }
        }
        mye myeVar2 = (mye) ave.m27897getSegmentimpl(objFindSegmentInternal);
        myeVar2.cleanPrev();
        if (myeVar2.f82931c > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) lye.f59271f));
        Object andSet = myeVar2.getAcquirers().getAndSet(i, lye.f59267b);
        if (andSet != null) {
            if (andSet == lye.f59270e) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i2 = lye.f59266a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (myeVar2.getAcquirers().get(i) == lye.f59268c) {
                return true;
            }
        }
        return !bag.m3024a(myeVar2.getAcquirers(), i, lye.f59267b, lye.f59269d);
    }

    @gib
    public final Object acquire(@yfb zy2<? super bth> zy2Var) {
        if (decPermits() > 0) {
            return bth.f14751a;
        }
        Object objAcquireSlowPath = acquireSlowPath(zy2Var);
        return objAcquireSlowPath == pd8.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : bth.f14751a;
    }

    /* JADX INFO: renamed from: b */
    public final void m14385b(@yfb dq1<? super bth> dq1Var) {
        while (decPermits() <= 0) {
            md8.checkNotNull(dq1Var, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((wgi) dq1Var)) {
                return;
            }
        }
        dq1Var.resume(bth.f14751a, this.f52241b);
    }

    /* JADX INFO: renamed from: c */
    public final void m14386c(@yfb pve<?> pveVar, @gib Object obj) {
        while (decPermits() <= 0) {
            md8.checkNotNull(pveVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((wgi) pveVar)) {
                return;
            }
        }
        pveVar.selectInRegistrationPhase(bth.f14751a);
    }

    public final int getAvailablePermits() {
        return Math.max(f52239g.get(this), 0);
    }

    public final void release() {
        do {
            int andIncrement = f52239g.getAndIncrement(this);
            if (andIncrement >= this.f52240a) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f52240a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = f52239g.get(this);
            if (i > this.f52240a) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (f52239g.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W w, qy6<? super W, Boolean> qy6Var, qy6<? super W, bth> qy6Var2) {
        while (decPermits() <= 0) {
            if (qy6Var.invoke(w).booleanValue()) {
                return;
            }
        }
        qy6Var2.invoke(w);
    }
}
