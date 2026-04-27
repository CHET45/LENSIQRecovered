package p000;

import p000.bt4;
import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n351#2,11:160\n351#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
public final class p34 {

    /* JADX INFO: renamed from: p34$a */
    @ck3(m4009c = "kotlinx.coroutines.DelayKt", m4010f = "Delay.kt", m4011i = {}, m4012l = {160}, m4013m = "awaitCancellation", m4014n = {}, m4015s = {})
    public static final class C10777a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f69550a;

        /* JADX INFO: renamed from: b */
        public int f69551b;

        public C10777a(zy2<? super C10777a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f69550a = obj;
            this.f69551b |= Integer.MIN_VALUE;
            return p34.awaitCancellation(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitCancellation(@p000.yfb p000.zy2<?> r4) {
        /*
            boolean r0 = r4 instanceof p000.p34.C10777a
            if (r0 == 0) goto L13
            r0 = r4
            p34$a r0 = (p000.p34.C10777a) r0
            int r1 = r0.f69551b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69551b = r1
            goto L18
        L13:
            p34$a r0 = new p34$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f69550a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f69551b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            p000.y7e.throwOnFailure(r4)
            goto L52
        L31:
            p000.y7e.throwOnFailure(r4)
            r0.f69551b = r3
            fq1 r4 = new fq1
            zy2 r2 = p000.od8.intercepted(r0)
            r4.<init>(r2, r3)
            r4.initCancellability()
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r2 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r4 != r2) goto L4f
            p000.jk3.probeCoroutineSuspended(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            us8 r4 = new us8
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p34.awaitCancellation(zy2):java.lang.Object");
    }

    @gib
    public static final Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        if (j <= 0) {
            return bth.f14751a;
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(fq1Var.getContext()).mo29874scheduleResumeAfterDelay(j, fq1Var);
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @gib
    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m31716delayVtjQ1oo(long j, @yfb zy2<? super bth> zy2Var) {
        Object objDelay = delay(m31717toDelayMillisLRDsOJo(j), zy2Var);
        return objDelay == pd8.getCOROUTINE_SUSPENDED() ? objDelay : bth.f14751a;
    }

    @yfb
    public static final o34 getDelay(@yfb e13 e13Var) {
        e13.InterfaceC5040b interfaceC5040b = e13Var.get(dz2.f31343s);
        o34 o34Var = interfaceC5040b instanceof o34 ? (o34) interfaceC5040b : null;
        return o34Var == null ? uu3.getDefaultDelay() : o34Var;
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m31717toDelayMillisLRDsOJo(long j) {
        boolean zM28086isPositiveimpl = bt4.m28086isPositiveimpl(j);
        if (zM28086isPositiveimpl) {
            bt4.C2044a c2044a = bt4.f14711b;
            return bt4.m28070getInWholeMillisecondsimpl(bt4.m28088plusLRDsOJo(j, ft4.toDuration(999999L, lt4.f58681b)));
        }
        if (zM28086isPositiveimpl) {
            throw new ceb();
        }
        return 0L;
    }
}
