package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class iab {

    /* JADX INFO: renamed from: d */
    public static final int f46221d = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public lab f46222a;

    /* JADX INFO: renamed from: b */
    @yfb
    public ny6<? extends x13> f46223b = new C7212a();

    /* JADX INFO: renamed from: c */
    @gib
    public x13 f46224c;

    /* JADX INFO: renamed from: iab$a */
    public static final class C7212a extends tt8 implements ny6<x13> {
        public C7212a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final x13 invoke() {
            return iab.this.getScope$ui_release();
        }
    }

    /* JADX INFO: renamed from: iab$b */
    @ck3(m4009c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m4010f = "NestedScrollModifier.kt", m4011i = {}, m4012l = {bw3.f14995j}, m4013m = "dispatchPostFling-RZ2iAVY", m4014n = {}, m4015s = {})
    public static final class C7213b extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f46226a;

        /* JADX INFO: renamed from: c */
        public int f46228c;

        public C7213b(zy2<? super C7213b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f46226a = obj;
            this.f46228c |= Integer.MIN_VALUE;
            return iab.this.m30177dispatchPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: iab$c */
    @ck3(m4009c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m4010f = "NestedScrollModifier.kt", m4011i = {}, m4012l = {203}, m4013m = "dispatchPreFling-QWom1Mo", m4014n = {}, m4015s = {})
    public static final class C7214c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f46229a;

        /* JADX INFO: renamed from: c */
        public int f46231c;

        public C7214c(zy2<? super C7214c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f46229a = obj;
            this.f46231c |= Integer.MIN_VALUE;
            return iab.this.m30179dispatchPreFlingQWom1Mo(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @p000.gib
    /* JADX INFO: renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m30177dispatchPostFlingRZ2iAVY(long r8, long r10, @p000.yfb p000.zy2<? super p000.i4i> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p000.iab.C7213b
            if (r0 == 0) goto L14
            r0 = r12
            iab$b r0 = (p000.iab.C7213b) r0
            int r1 = r0.f46228c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f46228c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            iab$b r0 = new iab$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f46226a
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r6.f46228c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p000.y7e.throwOnFailure(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            p000.y7e.throwOnFailure(r12)
            hab r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L4e
            r6.f46228c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo29969onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L47
            return r0
        L47:
            i4i r12 = (p000.i4i) r12
            long r8 = r12.m30166unboximpl()
            goto L54
        L4e:
            i4i$a r8 = p000.i4i.f45754b
            long r8 = r8.m30168getZero9UxMQ8M()
        L54:
            i4i r8 = p000.i4i.m30148boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iab.m30177dispatchPostFlingRZ2iAVY(long, long, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m30178dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        hab parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo29970onPostScrollDzOQY0M(j, j2, i) : izb.f49009b.m30445getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /* JADX INFO: renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m30179dispatchPreFlingQWom1Mo(long r5, @p000.yfb p000.zy2<? super p000.i4i> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.iab.C7214c
            if (r0 == 0) goto L13
            r0 = r7
            iab$c r0 = (p000.iab.C7214c) r0
            int r1 = r0.f46231c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46231c = r1
            goto L18
        L13:
            iab$c r0 = new iab$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f46229a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46231c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r7)
            hab r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L4a
            r0.f46231c = r3
            java.lang.Object r7 = r7.mo29971onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            i4i r7 = (p000.i4i) r7
            long r5 = r7.m30166unboximpl()
            goto L50
        L4a:
            i4i$a r5 = p000.i4i.f45754b
            long r5 = r5.m30168getZero9UxMQ8M()
        L50:
            i4i r5 = p000.i4i.m30148boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iab.m30179dispatchPreFlingQWom1Mo(long, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m30180dispatchPreScrollOzD1aCk(long j, int i) {
        hab parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo29972onPreScrollOzD1aCk(j, i) : izb.f49009b.m30445getZeroF1C5BW0();
    }

    @yfb
    public final ny6<x13> getCalculateNestedScrollScope$ui_release() {
        return this.f46223b;
    }

    @yfb
    public final x13 getCoroutineScope() {
        x13 x13VarInvoke = this.f46223b.invoke();
        if (x13VarInvoke != null) {
            return x13VarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @gib
    public final lab getNestedScrollNode$ui_release() {
        return this.f46222a;
    }

    @gib
    public final hab getParent$ui_release() {
        lab labVar = this.f46222a;
        if (labVar != null) {
            return labVar.getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @gib
    public final x13 getScope$ui_release() {
        return this.f46224c;
    }

    public final void setCalculateNestedScrollScope$ui_release(@yfb ny6<? extends x13> ny6Var) {
        this.f46223b = ny6Var;
    }

    public final void setNestedScrollNode$ui_release(@gib lab labVar) {
        this.f46222a = labVar;
    }

    public final void setScope$ui_release(@gib x13 x13Var) {
        this.f46224c = x13Var;
    }
}
