package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hy6 {

    /* JADX INFO: renamed from: hy6$a */
    @ck3(m4009c = "androidx.activity.FullyDrawnReporterKt", m4010f = "FullyDrawnReporter.kt", m4011i = {0}, m4012l = {185}, m4013m = "reportWhenComplete", m4014n = {"$this$reportWhenComplete"}, m4015s = {"L$0"})
    @dwf({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
    public static final class C7080a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f45222a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f45223b;

        /* JADX INFO: renamed from: c */
        public int f45224c;

        public C7080a(zy2<? super C7080a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f45223b = obj;
            this.f45224c |= Integer.MIN_VALUE;
            return hy6.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [bth, java.lang.Object] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object reportWhenComplete(@p000.yfb p000.gy6 r4, @p000.yfb p000.qy6<? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super p000.bth> r6) {
        /*
            boolean r0 = r6 instanceof p000.hy6.C7080a
            if (r0 == 0) goto L13
            r0 = r6
            hy6$a r0 = (p000.hy6.C7080a) r0
            int r1 = r0.f45224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45224c = r1
            goto L18
        L13:
            hy6$a r0 = new hy6$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45223b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45224c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f45222a
            gy6 r4 = (p000.gy6) r4
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p000.y7e.throwOnFailure(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L46
            bth r4 = p000.bth.f14751a
            return r4
        L46:
            r0.f45222a = r4     // Catch: java.lang.Throwable -> L2d
            r0.f45224c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            p000.o28.finallyStart(r3)
            r4.removeReporter()
            p000.o28.finallyEnd(r3)
            bth r4 = p000.bth.f14751a
            return r4
        L5d:
            p000.o28.finallyStart(r3)
            r4.removeReporter()
            p000.o28.finallyEnd(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hy6.reportWhenComplete(gy6, qy6, zy2):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(gy6 gy6Var, qy6<? super zy2<? super bth>, ? extends Object> qy6Var, zy2<? super bth> zy2Var) {
        gy6Var.addReporter();
        if (gy6Var.isFullyDrawnReported()) {
            return bth.f14751a;
        }
        try {
            qy6Var.invoke(zy2Var);
            o28.finallyStart(1);
            gy6Var.removeReporter();
            o28.finallyEnd(1);
            return bth.f14751a;
        } catch (Throwable th) {
            o28.finallyStart(1);
            gy6Var.removeReporter();
            o28.finallyEnd(1);
            throw th;
        }
    }
}
