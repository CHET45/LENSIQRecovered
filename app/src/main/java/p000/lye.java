package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lye {

    /* JADX INFO: renamed from: a */
    public static final int f59266a = bkg.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qhg f59267b = new qhg("PERMIT");

    /* JADX INFO: renamed from: c */
    @yfb
    public static final qhg f59268c = new qhg("TAKEN");

    /* JADX INFO: renamed from: d */
    @yfb
    public static final qhg f59269d = new qhg("BROKEN");

    /* JADX INFO: renamed from: e */
    @yfb
    public static final qhg f59270e = new qhg("CANCELLED");

    /* JADX INFO: renamed from: f */
    public static final int f59271f = bkg.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* JADX INFO: renamed from: lye$a */
    @ck3(m4009c = "kotlinx.coroutines.sync.SemaphoreKt", m4010f = "Semaphore.kt", m4011i = {0, 0}, m4012l = {81}, m4013m = "withPermit", m4014n = {"$this$withPermit", "action"}, m4015s = {"L$0", "L$1"})
    public static final class C9040a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f59272a;

        /* JADX INFO: renamed from: b */
        public Object f59273b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f59274c;

        /* JADX INFO: renamed from: d */
        public int f59275d;

        public C9040a(zy2<? super C9040a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f59274c = obj;
            this.f59275d |= Integer.MIN_VALUE;
            return lye.withPermit(null, null, this);
        }
    }

    @yfb
    public static final hye Semaphore(int i, int i2) {
        return new kye(i, i2);
    }

    public static /* synthetic */ hye Semaphore$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return Semaphore(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mye createSegment(long j, mye myeVar) {
        return new mye(j, myeVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withPermit(@p000.yfb p000.hye r4, @p000.yfb p000.ny6<? extends T> r5, @p000.yfb p000.zy2<? super T> r6) {
        /*
            boolean r0 = r6 instanceof p000.lye.C9040a
            if (r0 == 0) goto L13
            r0 = r6
            lye$a r0 = (p000.lye.C9040a) r0
            int r1 = r0.f59275d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59275d = r1
            goto L18
        L13:
            lye$a r0 = new lye$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f59274c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59275d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f59273b
            r5 = r4
            ny6 r5 = (p000.ny6) r5
            java.lang.Object r4 = r0.f59272a
            hye r4 = (p000.hye) r4
            p000.y7e.throwOnFailure(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            p000.y7e.throwOnFailure(r6)
            r0.f59272a = r4
            r0.f59273b = r5
            r0.f59275d = r3
            java.lang.Object r6 = r4.acquire(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            p000.o28.finallyStart(r3)
            r4.release()
            p000.o28.finallyEnd(r3)
            return r5
        L58:
            r5 = move-exception
            p000.o28.finallyStart(r3)
            r4.release()
            p000.o28.finallyEnd(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lye.withPermit(hye, ny6, zy2):java.lang.Object");
    }

    private static final <T> Object withPermit$$forInline(hye hyeVar, ny6<? extends T> ny6Var, zy2<? super T> zy2Var) {
        o28.mark(0);
        hyeVar.acquire(zy2Var);
        o28.mark(1);
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            hyeVar.release();
            o28.finallyEnd(1);
        }
    }
}
