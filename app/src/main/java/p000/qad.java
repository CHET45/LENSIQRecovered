package p000;

import p000.y7b;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class qad implements pad, c64 {

    /* JADX INFO: renamed from: e */
    public static final int f73753e = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c64 f73754a;

    /* JADX INFO: renamed from: b */
    public boolean f73755b;

    /* JADX INFO: renamed from: c */
    public boolean f73756c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final y7b f73757d = e8b.Mutex(false);

    /* JADX INFO: renamed from: qad$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {363}, m4013m = "awaitRelease", m4014n = {}, m4015s = {})
    public static final class C11400a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f73758a;

        /* JADX INFO: renamed from: c */
        public int f73760c;

        public C11400a(zy2<? super C11400a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f73758a = obj;
            this.f73760c |= Integer.MIN_VALUE;
            return qad.this.awaitRelease(this);
        }
    }

    /* JADX INFO: renamed from: qad$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m4010f = "TapGestureDetector.kt", m4011i = {0}, m4012l = {357}, m4013m = "reset", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C11401b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f73761a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f73762b;

        /* JADX INFO: renamed from: d */
        public int f73764d;

        public C11401b(zy2<? super C11401b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f73762b = obj;
            this.f73764d |= Integer.MIN_VALUE;
            return qad.this.reset(this);
        }
    }

    /* JADX INFO: renamed from: qad$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m4010f = "TapGestureDetector.kt", m4011i = {0}, m4012l = {370}, m4013m = "tryAwaitRelease", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C11402c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f73765a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f73766b;

        /* JADX INFO: renamed from: d */
        public int f73768d;

        public C11402c(zy2<? super C11402c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f73766b = obj;
            this.f73768d |= Integer.MIN_VALUE;
            return qad.this.tryAwaitRelease(this);
        }
    }

    public qad(@yfb c64 c64Var) {
        this.f73754a = c64Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.pad
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(@p000.yfb p000.zy2<? super p000.bth> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.qad.C11400a
            if (r0 == 0) goto L13
            r0 = r5
            qad$a r0 = (p000.qad.C11400a) r0
            int r1 = r0.f73760c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73760c = r1
            goto L18
        L13:
            qad$a r0 = new qad$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73758a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73760c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r5)
            r0.f73760c = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            bth r5 = p000.bth.f14751a
            return r5
        L48:
            g37 r5 = new g37
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qad.awaitRelease(zy2):java.lang.Object");
    }

    public final void cancel() {
        this.f73756c = true;
        y7b.C15538a.unlock$default(this.f73757d, null, 1, null);
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f73754a.getDensity();
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f73754a.getFontScale();
    }

    public final void release() {
        this.f73755b = true;
        y7b.C15538a.unlock$default(this.f73757d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object reset(@p000.yfb p000.zy2<? super p000.bth> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.qad.C11401b
            if (r0 == 0) goto L13
            r0 = r5
            qad$b r0 = (p000.qad.C11401b) r0
            int r1 = r0.f73764d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73764d = r1
            goto L18
        L13:
            qad$b r0 = new qad$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73762b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73764d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f73761a
            qad r0 = (p000.qad) r0
            p000.y7e.throwOnFailure(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r5)
            y7b r5 = r4.f73757d
            r0.f73761a = r4
            r0.f73764d = r3
            r2 = 0
            java.lang.Object r5 = p000.y7b.C15538a.lock$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f73755b = r5
            r0.f73756c = r5
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qad.reset(zy2):java.lang.Object");
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo27166roundToPxR2X_6o(long j) {
        return this.f73754a.mo27166roundToPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo27167roundToPx0680j_4(float f) {
        return this.f73754a.mo27167roundToPx0680j_4(f);
    }

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo27168toDpGaN1DYA(long j) {
        return this.f73754a.mo27168toDpGaN1DYA(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo27169toDpu2uoSUM(float f) {
        return this.f73754a.mo27169toDpu2uoSUM(f);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo27171toDpSizekrfVVM(long j) {
        return this.f73754a.mo27171toDpSizekrfVVM(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo27172toPxR2X_6o(long j) {
        return this.f73754a.mo27172toPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo27173toPx0680j_4(float f) {
        return this.f73754a.mo27173toPx0680j_4(f);
    }

    @Override // p000.c64
    @f0g
    @yfb
    public rud toRect(@yfb on4 on4Var) {
        return this.f73754a.toRect(on4Var);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo27174toSizeXkaWNTQ(long j) {
        return this.f73754a.mo27174toSizeXkaWNTQ(j);
    }

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo27175toSp0xMU5do(float f) {
        return this.f73754a.mo27175toSp0xMU5do(f);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo27176toSpkPz2Gy4(float f) {
        return this.f73754a.mo27176toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.pad
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(@p000.yfb p000.zy2<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.qad.C11402c
            if (r0 == 0) goto L13
            r0 = r6
            qad$c r0 = (p000.qad.C11402c) r0
            int r1 = r0.f73768d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73768d = r1
            goto L18
        L13:
            qad$c r0 = new qad$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73766b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73768d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f73765a
            qad r0 = (p000.qad) r0
            p000.y7e.throwOnFailure(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            p000.y7e.throwOnFailure(r6)
            boolean r6 = r5.f73755b
            if (r6 != 0) goto L55
            boolean r6 = r5.f73756c
            if (r6 != 0) goto L55
            y7b r6 = r5.f73757d
            r0.f73765a = r5
            r0.f73768d = r4
            java.lang.Object r6 = p000.y7b.C15538a.lock$default(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            y7b r6 = r0.f73757d
            p000.y7b.C15538a.unlock$default(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f73755b
            java.lang.Boolean r6 = p000.wc1.boxBoolean(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qad.tryAwaitRelease(zy2):java.lang.Object");
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo27170toDpu2uoSUM(int i) {
        return this.f73754a.mo27170toDpu2uoSUM(i);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo27177toSpkPz2Gy4(int i) {
        return this.f73754a.mo27177toSpkPz2Gy4(i);
    }
}
