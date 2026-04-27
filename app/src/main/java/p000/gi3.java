package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nDataStoreInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,79:1\n198#2,5:80\n*S KotlinDebug\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n*L\n45#1:80,5\n*E\n"})
public final class gi3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final a7b<g2g<T>> f39861a;

    public gi3() {
        frh frhVar = frh.f37584b;
        md8.checkNotNull(frhVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f39861a = n2g.MutableStateFlow(frhVar);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    @yfb
    public final g2g<T> getCurrentState() {
        return this.f39861a.getValue();
    }

    @yfb
    public final y56<g2g<T>> getFlow() {
        return this.f39861a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.g2g<T> tryUpdate(@p000.yfb p000.g2g<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            p000.md8.checkNotNullParameter(r6, r0)
            a7b<g2g<T>> r0 = r5.f39861a
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            g2g r2 = (p000.g2g) r2
            boolean r3 = r2 instanceof p000.sqd
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            frh r3 = p000.frh.f37584b
            boolean r3 = p000.md8.areEqual(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof p000.if3
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            int r4 = r2.getVersion()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof p000.qv5
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            ceb r6 = new ceb
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gi3.tryUpdate(g2g):g2g");
    }
}
