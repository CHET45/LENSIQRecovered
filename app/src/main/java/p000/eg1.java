package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final /* synthetic */ class eg1 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T runBlocking(@p000.yfb p000.e13 r4, @p000.yfb p000.gz6<? super p000.x13, ? super p000.zy2<? super T>, ? extends java.lang.Object> r5) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            dz2$b r1 = p000.dz2.f31343s
            e13$b r1 = r4.get(r1)
            dz2 r1 = (p000.dz2) r1
            if (r1 != 0) goto L1f
            xxg r1 = p000.xxg.f99642a
            e65 r1 = r1.getEventLoop$kotlinx_coroutines_core()
            q77 r2 = p000.q77.f73410a
            e13 r4 = r4.plus(r1)
            e13 r4 = p000.j13.newCoroutineContext(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof p000.e65
            r3 = 0
            if (r2 == 0) goto L27
            e65 r1 = (p000.e65) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.shouldBeProcessedFromContext()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            xxg r1 = p000.xxg.f99642a
            e65 r1 = r1.currentOrNull$kotlinx_coroutines_core()
        L3c:
            q77 r2 = p000.q77.f73410a
            e13 r4 = p000.j13.newCoroutineContext(r2, r4)
        L42:
            c71 r2 = new c71
            r2.<init>(r4, r0, r1)
            b23 r4 = p000.b23.f12441a
            r2.start(r4, r2, r5)
            java.lang.Object r4 = r2.joinBlocking()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eg1.runBlocking(e13, gz6):java.lang.Object");
    }

    public static /* synthetic */ Object runBlocking$default(e13 e13Var, gz6 gz6Var, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        return dg1.runBlocking(e13Var, gz6Var);
    }
}
