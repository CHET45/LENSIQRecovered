package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n224#1,8:361\n236#1:369\n237#1,2:380\n239#1:384\n1#2:298\n1#2:304\n1#2:345\n277#3,5:299\n282#3,12:305\n294#3:339\n277#3,5:340\n282#3,12:346\n294#3:399\n186#4,3:317\n189#4,14:325\n186#4,3:358\n189#4,14:385\n91#5,5:320\n103#5,10:370\n114#5,2:382\n103#5,13:400\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:361,8\n215#1:369\n215#1:380,2\n215#1:384\n195#1:304\n213#1:345\n195#1:299,5\n195#1:305,12\n195#1:339\n213#1:340,5\n213#1:346,12\n213#1:399\n195#1:317,3\n195#1:325,14\n213#1:358,3\n213#1:385,14\n196#1:320,5\n215#1:370,10\n215#1:382,2\n236#1:400,13\n*E\n"})
public final class ve4<T> extends ye4<T> implements a23, zy2<T> {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f90780C = AtomicReferenceFieldUpdater.newUpdater(ve4.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final m13 f90781d;

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public final zy2<T> f90782e;

    /* JADX INFO: renamed from: f */
    @gib
    @un8
    public Object f90783f;

    /* JADX INFO: renamed from: m */
    @un8
    @yfb
    public final Object f90784m;

    /* JADX WARN: Multi-variable type inference failed */
    public ve4(@yfb m13 m13Var, @yfb zy2<? super T> zy2Var) {
        super(-1);
        this.f90781d = m13Var;
        this.f90782e = zy2Var;
        this.f90783f = we4.f94021a;
        this.f90784m = sxg.threadContextElements(getContext());
    }

    private final fq1<?> getReusableCancellableContinuation() {
        Object obj = f90780C.get(this);
        if (obj instanceof fq1) {
            return (fq1) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (f90780C.get(this) == we4.f94022b) {
        }
    }

    @gib
    public final fq1<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f90780C;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f90780C.set(this, we4.f94022b);
                return null;
            }
            if (obj instanceof fq1) {
                if (C0051a4.m134a(f90780C, this, obj, we4.f94022b)) {
                    return (fq1) obj;
                }
            } else if (obj != we4.f94022b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(@yfb e13 e13Var, T t) {
        this.f90783f = t;
        this.f101289c = 1;
        this.f90781d.dispatchYield(e13Var, this);
    }

    @Override // p000.a23
    @gib
    public a23 getCallerFrame() {
        zy2<T> zy2Var = this.f90782e;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return this.f90782e.getContext();
    }

    @Override // p000.ye4
    @yfb
    public zy2<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // p000.a23
    @gib
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return f90780C.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(@yfb Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f90780C;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            qhg qhgVar = we4.f94022b;
            if (md8.areEqual(obj, qhgVar)) {
                if (C0051a4.m134a(f90780C, this, qhgVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C0051a4.m134a(f90780C, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        fq1<?> reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x0061, DONT_GENERATE, TryCatch #1 {all -> 0x0061, blocks: (B:9:0x0038, B:11:0x0046, B:13:0x004c, B:28:0x0091, B:16:0x0063, B:18:0x0073, B:22:0x0080, B:24:0x0085, B:27:0x008e, B:26:0x008b, B:33:0x00a2, B:35:0x00a7, B:38:0x00b0, B:39:0x00b3, B:37:0x00ad, B:21:0x0079), top: B:48:0x0038, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resumeCancellableWith$kotlinx_coroutines_core(@p000.yfb java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p000.ri2.toState(r7)
            m13 r1 = r6.f90781d
            e13 r2 = r6.getContext()
            boolean r1 = r1.isDispatchNeeded(r2)
            r2 = 1
            if (r1 == 0) goto L20
            r6.f90783f = r0
            r6.f101289c = r2
            m13 r7 = r6.f90781d
            e13 r0 = r6.getContext()
            r7.mo29873dispatch(r0, r6)
            goto Lbb
        L20:
            xxg r1 = p000.xxg.f99642a
            e65 r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r3 = r1.isUnconfinedLoopActive()
            if (r3 == 0) goto L35
            r6.f90783f = r0
            r6.f101289c = r2
            r1.dispatchUnconfined(r6)
            goto Lbb
        L35:
            r1.incrementUseCount(r2)
            e13 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L61
            jj8$b r4 = p000.jj8.f50715A     // Catch: java.lang.Throwable -> L61
            e13$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L61
            jj8 r3 = (p000.jj8) r3     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L63
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L63
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L61
            r6.cancelCompletedResult$kotlinx_coroutines_core(r0, r7)     // Catch: java.lang.Throwable -> L61
            v7e$a r0 = p000.v7e.f90266b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = p000.y7e.createFailure(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = p000.v7e.m32723constructorimpl(r7)     // Catch: java.lang.Throwable -> L61
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L61
            goto L91
        L61:
            r7 = move-exception
            goto Lb4
        L63:
            zy2<T> r0 = r6.f90782e     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r6.f90784m     // Catch: java.lang.Throwable -> L61
            e13 r4 = r0.getContext()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = p000.sxg.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
            qhg r5 = p000.sxg.f83208a     // Catch: java.lang.Throwable -> L61
            if (r3 == r5) goto L78
            esh r0 = p000.j13.updateUndispatchedCompletion(r0, r4, r3)     // Catch: java.lang.Throwable -> L61
            goto L79
        L78:
            r0 = 0
        L79:
            zy2<T> r5 = r6.f90782e     // Catch: java.lang.Throwable -> La1
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> La1
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> La1
            p000.o28.finallyStart(r2)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L8b
            boolean r7 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L8e
        L8b:
            p000.sxg.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
        L8e:
            p000.o28.finallyEnd(r2)     // Catch: java.lang.Throwable -> L61
        L91:
            boolean r7 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L91
            p000.o28.finallyStart(r2)
        L9a:
            r1.decrementUseCount(r2)
            p000.o28.finallyEnd(r2)
            goto Lbb
        La1:
            r7 = move-exception
            p000.o28.finallyStart(r2)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lad
            boolean r0 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lb0
        Lad:
            p000.sxg.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
        Lb0:
            p000.o28.finallyEnd(r2)     // Catch: java.lang.Throwable -> L61
            throw r7     // Catch: java.lang.Throwable -> L61
        Lb4:
            r6.handleFatalException$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> Lbc
            p000.o28.finallyStart(r2)
            goto L9a
        Lbb:
            return
        Lbc:
            r7 = move-exception
            p000.o28.finallyStart(r2)
            r1.decrementUseCount(r2)
            p000.o28.finallyEnd(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ve4.resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object):void");
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(@gib Object obj) {
        jj8 jj8Var = (jj8) getContext().get(jj8.f50715A);
        if (jj8Var == null || jj8Var.isActive()) {
            return false;
        }
        CancellationException cancellationException = jj8Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        v7e.C13927a c13927a = v7e.f90266b;
        resumeWith(v7e.m32723constructorimpl(y7e.createFailure(cancellationException)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resumeUndispatchedWith$kotlinx_coroutines_core(@p000.yfb java.lang.Object r6) {
        /*
            r5 = this;
            zy2<T> r0 = r5.f90782e
            java.lang.Object r1 = r5.f90784m
            e13 r2 = r0.getContext()
            java.lang.Object r1 = p000.sxg.updateThreadContext(r2, r1)
            qhg r3 = p000.sxg.f83208a
            if (r1 == r3) goto L15
            esh r0 = p000.j13.updateUndispatchedCompletion(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            zy2<T> r4 = r5.f90782e     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L30
            p000.o28.finallyStart(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.clearThreadContext()
            if (r6 == 0) goto L2c
        L29:
            p000.sxg.restoreThreadContext(r2, r1)
        L2c:
            p000.o28.finallyEnd(r3)
            return
        L30:
            r6 = move-exception
            p000.o28.finallyStart(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L3f
        L3c:
            p000.sxg.restoreThreadContext(r2, r1)
        L3f:
            p000.o28.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ve4.resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object):void");
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        Object state = ri2.toState(obj);
        if (this.f90781d.isDispatchNeeded(getContext())) {
            this.f90783f = state;
            this.f101289c = 0;
            this.f90781d.mo29873dispatch(getContext(), this);
            return;
        }
        e65 eventLoop$kotlinx_coroutines_core = xxg.f99642a.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this.f90783f = state;
            this.f101289c = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            e13 context = getContext();
            Object objUpdateThreadContext = sxg.updateThreadContext(context, this.f90784m);
            try {
                this.f90782e.resumeWith(obj);
                bth bthVar = bth.f14751a;
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } finally {
                sxg.restoreThreadContext(context, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.ye4
    @gib
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this.f90783f;
        this.f90783f = we4.f94021a;
        return obj;
    }

    @yfb
    public String toString() {
        return "DispatchedContinuation[" + this.f90781d + ", " + kk3.toDebugString(this.f90782e) + C4584d2.f28243l;
    }

    @gib
    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(@yfb dq1<?> dq1Var) {
        qhg qhgVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f90780C;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            qhgVar = we4.f94022b;
            if (obj != qhgVar) {
                if (obj instanceof Throwable) {
                    if (C0051a4.m134a(f90780C, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C0051a4.m134a(f90780C, this, qhgVar, dq1Var));
        return null;
    }
}
