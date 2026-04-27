package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class lab extends InterfaceC0701e.d implements shh, hab {

    /* JADX INFO: renamed from: M1 */
    public static final int f56975M1 = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public hab f56976X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public iab f56977Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public final Object f56978Z;

    /* JADX INFO: renamed from: lab$a */
    @ck3(m4009c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m4010f = "NestedScrollNode.kt", m4011i = {0, 0, 0, 1}, m4012l = {104, 105}, m4013m = "onPostFling-RZ2iAVY", m4014n = {"this", "consumed", "available", "selfConsumed"}, m4015s = {"L$0", "J$0", "J$1", "J$0"})
    public static final class C8742a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f56979a;

        /* JADX INFO: renamed from: b */
        public long f56980b;

        /* JADX INFO: renamed from: c */
        public long f56981c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f56982d;

        /* JADX INFO: renamed from: f */
        public int f56984f;

        public C8742a(zy2<? super C8742a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f56982d = obj;
            this.f56984f |= Integer.MIN_VALUE;
            return lab.this.mo29969onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: lab$b */
    @ck3(m4009c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m4010f = "NestedScrollNode.kt", m4011i = {0, 0, 1}, m4012l = {97, 98}, m4013m = "onPreFling-QWom1Mo", m4014n = {"this", "available", "parentPreConsumed"}, m4015s = {"L$0", "J$0", "J$0"})
    public static final class C8743b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f56985a;

        /* JADX INFO: renamed from: b */
        public long f56986b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f56987c;

        /* JADX INFO: renamed from: e */
        public int f56989e;

        public C8743b(zy2<? super C8743b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f56987c = obj;
            this.f56989e |= Integer.MIN_VALUE;
            return lab.this.mo29971onPreFlingQWom1Mo(0L, this);
        }
    }

    /* JADX INFO: renamed from: lab$c */
    public static final class C8744c extends tt8 implements ny6<x13> {
        public C8744c() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final x13 invoke() {
            return lab.this.getNestedCoroutineScope();
        }
    }

    public lab(@yfb hab habVar, @gib iab iabVar) {
        this.f56976X = habVar;
        this.f56977Y = iabVar == null ? new iab() : iabVar;
        this.f56978Z = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x13 getNestedCoroutineScope() {
        x13 scope$ui_release;
        lab parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
        if ((parentNestedScrollNode$ui_release == null || (scope$ui_release = parentNestedScrollNode$ui_release.getNestedCoroutineScope()) == null) && (scope$ui_release = this.f56977Y.getScope$ui_release()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope$ui_release;
    }

    private final hab getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.f56977Y.getNestedScrollNode$ui_release() == this) {
            this.f56977Y.setNestedScrollNode$ui_release(null);
        }
    }

    private final void updateDispatcher(iab iabVar) {
        resetDispatcherFields();
        if (iabVar == null) {
            this.f56977Y = new iab();
        } else if (!md8.areEqual(iabVar, this.f56977Y)) {
            this.f56977Y = iabVar;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.f56977Y.setNestedScrollNode$ui_release(this);
        this.f56977Y.setCalculateNestedScrollScope$ui_release(new C8744c());
        this.f56977Y.setScope$ui_release(getCoroutineScope());
    }

    @yfb
    public final hab getConnection() {
        return this.f56976X;
    }

    @gib
    public final lab getParentNestedScrollNode$ui_release() {
        if (isAttached()) {
            return (lab) thh.findNearestAncestor(this);
        }
        return null;
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return this.f56978Z;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // p000.hab
    @p000.gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo29969onPostFlingRZ2iAVY(long r16, long r18, @p000.yfb p000.zy2<? super p000.i4i> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof p000.lab.C8742a
            if (r2 == 0) goto L16
            r2 = r1
            lab$a r2 = (p000.lab.C8742a) r2
            int r3 = r2.f56984f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f56984f = r3
            goto L1b
        L16:
            lab$a r2 = new lab$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f56982d
            java.lang.Object r9 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r3 = r2.f56984f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f56980b
            p000.y7e.throwOnFailure(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f56981c
            long r5 = r2.f56980b
            java.lang.Object r7 = r2.f56979a
            lab r7 = (p000.lab) r7
            p000.y7e.throwOnFailure(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            p000.y7e.throwOnFailure(r1)
            hab r3 = r0.f56976X
            r2.f56979a = r0
            r11 = r16
            r2.f56980b = r11
            r13 = r18
            r2.f56981c = r13
            r2.f56984f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo29969onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            i4i r1 = (p000.i4i) r1
            long r4 = r1.m30166unboximpl()
            hab r3 = r7.getParentConnection()
            if (r3 == 0) goto L94
            long r6 = p000.i4i.m30161plusAH228Gc(r11, r4)
            long r11 = p000.i4i.m30160minusAH228Gc(r13, r4)
            r1 = 0
            r2.f56979a = r1
            r2.f56980b = r4
            r2.f56984f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo29969onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            i4i r1 = (p000.i4i) r1
            long r4 = r1.m30166unboximpl()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            i4i$a r1 = p000.i4i.f45754b
            long r4 = r1.m30168getZero9UxMQ8M()
        L9b:
            long r1 = p000.i4i.m30161plusAH228Gc(r13, r4)
            i4i r1 = p000.i4i.m30148boximpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lab.mo29969onPostFlingRZ2iAVY(long, long, zy2):java.lang.Object");
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        long jMo29970onPostScrollDzOQY0M = this.f56976X.mo29970onPostScrollDzOQY0M(j, j2, i);
        hab parentConnection = getParentConnection();
        return izb.m30434plusMKHz9U(jMo29970onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo29970onPostScrollDzOQY0M(izb.m30434plusMKHz9U(j, jMo29970onPostScrollDzOQY0M), izb.m30433minusMKHz9U(j2, jMo29970onPostScrollDzOQY0M), i) : izb.f49009b.m30445getZeroF1C5BW0());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.hab
    @p000.gib
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo29971onPreFlingQWom1Mo(long r9, @p000.yfb p000.zy2<? super p000.i4i> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p000.lab.C8743b
            if (r0 == 0) goto L13
            r0 = r11
            lab$b r0 = (p000.lab.C8743b) r0
            int r1 = r0.f56989e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56989e = r1
            goto L18
        L13:
            lab$b r0 = new lab$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56987c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f56989e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f56986b
            p000.y7e.throwOnFailure(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f56986b
            java.lang.Object r2 = r0.f56985a
            lab r2 = (p000.lab) r2
            p000.y7e.throwOnFailure(r11)
            goto L57
        L40:
            p000.y7e.throwOnFailure(r11)
            hab r11 = r8.getParentConnection()
            if (r11 == 0) goto L61
            r0.f56985a = r8
            r0.f56986b = r9
            r0.f56989e = r4
            java.lang.Object r11 = r11.mo29971onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            i4i r11 = (p000.i4i) r11
            long r4 = r11.m30166unboximpl()
        L5d:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L69
        L61:
            i4i$a r11 = p000.i4i.f45754b
            long r4 = r11.m30168getZero9UxMQ8M()
            r2 = r8
            goto L5d
        L69:
            hab r11 = r2.f56976X
            long r4 = p000.i4i.m30160minusAH228Gc(r4, r9)
            r2 = 0
            r0.f56985a = r2
            r0.f56986b = r9
            r0.f56989e = r3
            java.lang.Object r11 = r11.mo29971onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7d
            return r1
        L7d:
            i4i r11 = (p000.i4i) r11
            long r0 = r11.m30166unboximpl()
            long r9 = p000.i4i.m30161plusAH228Gc(r9, r0)
            i4i r9 = p000.i4i.m30148boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lab.mo29971onPreFlingQWom1Mo(long, zy2):java.lang.Object");
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo29972onPreScrollOzD1aCk(long j, int i) {
        hab parentConnection = getParentConnection();
        long jMo29972onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo29972onPreScrollOzD1aCk(j, i) : izb.f49009b.m30445getZeroF1C5BW0();
        return izb.m30434plusMKHz9U(jMo29972onPreScrollOzD1aCk, this.f56976X.mo29972onPreScrollOzD1aCk(izb.m30433minusMKHz9U(j, jMo29972onPreScrollOzD1aCk), i));
    }

    public final void setConnection(@yfb hab habVar) {
        this.f56976X = habVar;
    }

    public final void updateNode$ui_release(@yfb hab habVar, @gib iab iabVar) {
        this.f56976X = habVar;
        updateDispatcher(iabVar);
    }
}
