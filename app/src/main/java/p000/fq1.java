package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.tp1;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
@yjd
public class fq1<T> extends ye4<T> implements dq1<T>, a23, wgi {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    @yfb
    public final zy2<T> f37407d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final e13 f37408e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37405f = AtomicIntegerFieldUpdater.newUpdater(fq1.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37406m = AtomicReferenceFieldUpdater.newUpdater(fq1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37404C = AtomicReferenceFieldUpdater.newUpdater(fq1.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public fq1(@yfb zy2<? super T> zy2Var, int i) {
        super(i);
        this.f37407d = zy2Var;
        this.f37408e = zy2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C15543y8.f100715a;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void callCancelHandlerSafely(ny6<bth> ny6Var) {
        try {
            ny6Var.invoke();
        } catch (Throwable th) {
            q13.handleCoroutineException(getContext(), new oi2("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(sue<?> sueVar, Throwable th) {
        int i = f37405f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sueVar.onCancellation(i, th, getContext());
        } catch (Throwable th2) {
            q13.handleCoroutineException(getContext(), new oi2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        zy2<T> zy2Var = this.f37407d;
        md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((ve4) zy2Var).postponeCancellation$kotlinx_coroutines_core(th);
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int i) {
        if (tryResume()) {
            return;
        }
        ze4.dispatch(this, i);
    }

    private final yf4 getParentHandle() {
        return (yf4) f37404C.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof ufb ? "Active" : state$kotlinx_coroutines_core instanceof qq1 ? "Cancelled" : "Completed";
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final yf4 installParentHandle() {
        jj8 jj8Var = (jj8) getContext().get(jj8.f50715A);
        if (jj8Var == null) {
            return null;
        }
        yf4 yf4VarInvokeOnCompletion$default = qj8.invokeOnCompletion$default(jj8Var, false, new vy1(this), 1, null);
        C0051a4.m134a(f37404C, this, null, yf4VarInvokeOnCompletion$default);
        return yf4VarInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37406m;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C15543y8) {
                if (C0051a4.m134a(f37406m, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof tp1) || (obj2 instanceof sue)) {
                multipleHandlersError(obj, obj2);
            } else {
                if (obj2 instanceof ni2) {
                    ni2 ni2Var = (ni2) obj2;
                    if (!ni2Var.makeHandled()) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj2 instanceof qq1) {
                        if (!(obj2 instanceof ni2)) {
                            ni2Var = null;
                        }
                        Throwable th = ni2Var != null ? ni2Var.f64635a : null;
                        if (obj instanceof tp1) {
                            callCancelHandler((tp1) obj, th);
                            return;
                        } else {
                            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((sue) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof li2) {
                    li2 li2Var = (li2) obj2;
                    if (li2Var.f57659b != null) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj instanceof sue) {
                        return;
                    }
                    md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    tp1 tp1Var = (tp1) obj;
                    if (li2Var.getCancelled()) {
                        callCancelHandler(tp1Var, li2Var.f57662e);
                        return;
                    } else {
                        if (C0051a4.m134a(f37406m, this, obj2, li2.copy$default(li2Var, null, tp1Var, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof sue) {
                        return;
                    }
                    md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (C0051a4.m134a(f37406m, this, obj2, new li2(obj2, (tp1) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean isReusable() {
        if (ze4.isReusableMode(this.f101289c)) {
            zy2<T> zy2Var = this.f37407d;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((ve4) zy2Var).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth resume$lambda$13$lambda$12(qy6 qy6Var, Throwable th, Object obj, e13 e13Var) {
        qy6Var.invoke(th);
        return bth.f14751a;
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(fq1 fq1Var, Object obj, int i, kz6 kz6Var, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            kz6Var = null;
        }
        fq1Var.resumeImpl$kotlinx_coroutines_core(obj, i, kz6Var);
    }

    private final <R> Object resumedState(ufb ufbVar, R r, int i, kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var, Object obj) {
        if (r instanceof ni2) {
            return r;
        }
        if (!ze4.isCancellableMode(i) && obj == null) {
            return r;
        }
        if (kz6Var == null && !(ufbVar instanceof tp1) && obj == null) {
            return r;
        }
        return new li2(r, ufbVar instanceof tp1 ? (tp1) ufbVar : null, kz6Var, obj, null, 16, null);
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i) {
        this._decisionAndIndex$volatile = i;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean tryResume() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37405f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f37405f.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    private final <R> qhg tryResumeImpl(R r, Object obj, kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37406m;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ufb)) {
                if ((obj2 instanceof li2) && obj != null && ((li2) obj2).f57661d == obj) {
                    return gq1.f40791g;
                }
                return null;
            }
        } while (!C0051a4.m134a(f37406m, this, obj2, resumedState((ufb) obj2, r, this.f101289c, kz6Var, obj)));
        detachChildIfNonResuable();
        return gq1.f40791g;
    }

    private final boolean trySuspend() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37405f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f37405f.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, Integer> qy6Var) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, qy6Var.invoke(Integer.valueOf(i)).intValue()));
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public String mo11046b() {
        return "CancellableContinuation";
    }

    public final void callCancelHandler(@yfb tp1 tp1Var, @gib Throwable th) {
        try {
            tp1Var.invoke(th);
        } catch (Throwable th2) {
            q13.handleCoroutineException(getContext(), new oi2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void callOnCancellation(@yfb kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var, @yfb Throwable th, R r) {
        try {
            kz6Var.invoke(th, r, getContext());
        } catch (Throwable th2) {
            q13.handleCoroutineException(getContext(), new oi2("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p000.dq1
    public boolean cancel(@gib Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37406m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ufb)) {
                return false;
            }
        } while (!C0051a4.m134a(f37406m, this, obj, new qq1(this, th, (obj instanceof tp1) || (obj instanceof sue))));
        ufb ufbVar = (ufb) obj;
        if (ufbVar instanceof tp1) {
            callCancelHandler((tp1) obj, th);
        } else if (ufbVar instanceof sue) {
            callSegmentOnCancellation((sue) obj, th);
        }
        detachChildIfNonResuable();
        dispatchResume(this.f101289c);
        return true;
    }

    @Override // p000.ye4
    public void cancelCompletedResult$kotlinx_coroutines_core(@gib Object obj, @yfb Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37406m;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ufb) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof ni2) {
                return;
            }
            if (obj2 instanceof li2) {
                li2 li2Var = (li2) obj2;
                if (li2Var.getCancelled()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (C0051a4.m134a(f37406m, this, obj2, li2.copy$default(li2Var, null, null, null, null, th, 15, null))) {
                    li2Var.invokeHandlers(this, th);
                    return;
                }
            } else {
                if (C0051a4.m134a(f37406m, this, obj2, new li2(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            }
        }
    }

    @Override // p000.dq1
    public void completeResume(@yfb Object obj) {
        dispatchResume(this.f101289c);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        yf4 parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        f37404C.set(this, xeb.f97598a);
    }

    @Override // p000.a23
    @gib
    public a23 getCallerFrame() {
        zy2<T> zy2Var = this.f37407d;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return this.f37408e;
    }

    @yfb
    public Throwable getContinuationCancellationCause(@yfb jj8 jj8Var) {
        return jj8Var.getCancellationException();
    }

    @Override // p000.ye4
    @yfb
    public final zy2<T> getDelegate$kotlinx_coroutines_core() {
        return this.f37407d;
    }

    @Override // p000.ye4
    @gib
    public Throwable getExceptionalResult$kotlinx_coroutines_core(@gib Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    @gib
    @yjd
    public final Object getResult() {
        jj8 jj8Var;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return pd8.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof ni2) {
            throw ((ni2) state$kotlinx_coroutines_core).f64635a;
        }
        if (!ze4.isCancellableMode(this.f101289c) || (jj8Var = (jj8) getContext().get(jj8.f50715A)) == null || jj8Var.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = jj8Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // p000.a23
    @gib
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @gib
    public final Object getState$kotlinx_coroutines_core() {
        return f37406m.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ye4
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@gib Object obj) {
        return obj instanceof li2 ? (T) ((li2) obj).f57658a : obj;
    }

    @Override // p000.dq1
    public void initCancellability() {
        yf4 yf4VarInstallParentHandle = installParentHandle();
        if (yf4VarInstallParentHandle != null && isCompleted()) {
            yf4VarInstallParentHandle.dispose();
            f37404C.set(this, xeb.f97598a);
        }
    }

    @Override // p000.wgi
    public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37405f;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        invokeOnCancellationImpl(sueVar);
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(@yfb tp1 tp1Var) {
        invokeOnCancellationImpl(tp1Var);
    }

    @Override // p000.dq1
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof ufb;
    }

    @Override // p000.dq1
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof qq1;
    }

    @Override // p000.dq1
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof ufb);
    }

    public final void parentCancelled$kotlinx_coroutines_core(@yfb Throwable th) {
        if (cancelLater(th)) {
            return;
        }
        cancel(th);
        detachChildIfNonResuable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        zy2<T> zy2Var = this.f37407d;
        ve4 ve4Var = zy2Var instanceof ve4 ? (ve4) zy2Var : null;
        if (ve4Var == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = ve4Var.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    @xn8(name = "resetStateReusable")
    public final boolean resetStateReusable() {
        Object obj = f37406m.get(this);
        if ((obj instanceof li2) && ((li2) obj).f57661d != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        f37405f.set(this, 536870911);
        f37406m.set(this, C15543y8.f100715a);
        return true;
    }

    @Override // p000.dq1
    public void resume(T t, @gib final qy6<? super Throwable, bth> qy6Var) {
        resumeImpl$kotlinx_coroutines_core(t, this.f101289c, qy6Var != null ? new kz6() { // from class: eq1
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return fq1.resume$lambda$13$lambda$12(qy6Var, (Throwable) obj, obj2, (e13) obj3);
            }
        } : null);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R r, int i, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37406m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ufb)) {
                if (obj instanceof qq1) {
                    qq1 qq1Var = (qq1) obj;
                    if (qq1Var.makeResumed()) {
                        if (kz6Var != null) {
                            callOnCancellation(kz6Var, qq1Var.f64635a, r);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(r);
                throw new us8();
            }
        } while (!C0051a4.m134a(f37406m, this, obj, resumedState((ufb) obj, r, i, kz6Var, null)));
        detachChildIfNonResuable();
        dispatchResume(i);
    }

    @Override // p000.dq1
    public void resumeUndispatched(@yfb m13 m13Var, T t) {
        zy2<T> zy2Var = this.f37407d;
        ve4 ve4Var = zy2Var instanceof ve4 ? (ve4) zy2Var : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t, (ve4Var != null ? ve4Var.f90781d : null) == m13Var ? 4 : this.f101289c, null, 4, null);
    }

    @Override // p000.dq1
    public void resumeUndispatchedWithException(@yfb m13 m13Var, @yfb Throwable th) {
        zy2<T> zy2Var = this.f37407d;
        ve4 ve4Var = zy2Var instanceof ve4 ? (ve4) zy2Var : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new ni2(th, false, 2, null), (ve4Var != null ? ve4Var.f90781d : null) == m13Var ? 4 : this.f101289c, null, 4, null);
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        resumeImpl$kotlinx_coroutines_core$default(this, ri2.toState(obj, this), this.f101289c, null, 4, null);
    }

    @Override // p000.ye4
    @gib
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @yfb
    public String toString() {
        return mo11046b() + '(' + kk3.toDebugString(this.f37407d) + "){" + getStateDebugRepresentation() + "}@" + kk3.getHexAddress(this);
    }

    @Override // p000.dq1
    @gib
    public Object tryResumeWithException(@yfb Throwable th) {
        return tryResumeImpl(new ni2(th, false, 2, null), null, null);
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // p000.dq1
    public <R extends T> void resume(R r, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
        resumeImpl$kotlinx_coroutines_core(r, this.f101289c, kz6Var);
    }

    @Override // p000.dq1
    public void invokeOnCancellation(@yfb qy6<? super Throwable, bth> qy6Var) {
        hq1.invokeOnCancellation(this, new tp1.C13158a(qy6Var));
    }

    @Override // p000.dq1
    @gib
    public Object tryResume(T t, @gib Object obj) {
        return tryResumeImpl(t, obj, null);
    }

    @Override // p000.dq1
    @gib
    public <R extends T> Object tryResume(R r, @gib Object obj, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
        return tryResumeImpl(r, obj, kz6Var);
    }
}
