package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1657\n314#3,9:1648\n323#3,2:1658\n50#4,7:1660\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1592#1:1647\n1599#1:1657\n1598#1:1648,9\n1598#1:1658,2\n1616#1:1660,7\n*E\n"})
public final class pdd {

    /* JADX INFO: renamed from: a */
    @gib
    public Object f70498a;

    @gib
    public final Object awaitFrameRequest(@yfb Object obj, @yfb zy2<? super bth> zy2Var) {
        fq1 fq1Var;
        synchronized (obj) {
            if (this.f70498a == zsd.f105999b) {
                this.f70498a = zsd.f106000c;
                return bth.f14751a;
            }
            bth bthVar = bth.f14751a;
            fq1 fq1Var2 = new fq1(od8.intercepted(zy2Var), 1);
            fq1Var2.initCancellability();
            synchronized (obj) {
                try {
                    if (this.f70498a == zsd.f105999b) {
                        this.f70498a = zsd.f106000c;
                        fq1Var = fq1Var2;
                    } else {
                        this.f70498a = fq1Var2;
                        fq1Var = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (fq1Var != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(bthVar));
            }
            Object result = fq1Var2.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result == pd8.getCOROUTINE_SUSPENDED() ? result : bthVar;
        }
    }

    @gib
    public final zy2<bth> requestFrameLocked() {
        Object obj = this.f70498a;
        if (obj instanceof zy2) {
            this.f70498a = zsd.f106000c;
            return (zy2) obj;
        }
        if (!(md8.areEqual(obj, zsd.f105999b) ? true : md8.areEqual(obj, zsd.f106000c))) {
            if (obj != null) {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
            this.f70498a = zsd.f105999b;
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        if (!(this.f70498a == zsd.f106000c)) {
            a8d.throwIllegalStateException("frame not pending");
        }
        this.f70498a = null;
    }
}
