package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fcc implements s36 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final kng f36123a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final dcc f36124b;

    /* JADX INFO: renamed from: fcc$a */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", m4010f = "LazyLayoutPager.kt", m4011i = {}, m4012l = {383}, m4013m = "performFling", m4014n = {}, m4015s = {})
    public static final class C5720a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f36125a;

        /* JADX INFO: renamed from: c */
        public int f36127c;

        public C5720a(zy2<? super C5720a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36125a = obj;
            this.f36127c |= Integer.MIN_VALUE;
            return fcc.this.performFling(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: fcc$b */
    public static final class C5721b extends tt8 implements qy6<Float, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vre f36129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5721b(vre vreVar) {
            super(1);
            this.f36129b = vreVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Float f) {
            invoke(f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(float f) {
            fcc.this.getPagerState().updateTargetPage(this.f36129b, p3a.roundToInt(fcc.this.getPagerState().getPageSizeWithSpacing$foundation_release() != 0 ? f / fcc.this.getPagerState().getPageSizeWithSpacing$foundation_release() : 0.0f) + fcc.this.getPagerState().getCurrentPage());
        }
    }

    public fcc(@yfb kng kngVar, @yfb dcc dccVar) {
        this.f36123a = kngVar;
        this.f36124b = dccVar;
    }

    @yfb
    public final kng getOriginalFlingBehavior() {
        return this.f36123a;
    }

    @yfb
    public final dcc getPagerState() {
        return this.f36124b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.s36
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object performFling(@p000.yfb p000.vre r5, float r6, @p000.yfb p000.zy2<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.fcc.C5720a
            if (r0 == 0) goto L13
            r0 = r7
            fcc$a r0 = (p000.fcc.C5720a) r0
            int r1 = r0.f36127c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36127c = r1
            goto L18
        L13:
            fcc$a r0 = new fcc$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36125a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36127c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r7)
            kng r7 = r4.f36123a
            fcc$b r2 = new fcc$b
            r2.<init>(r5)
            r0.f36127c = r3
            java.lang.Object r7 = r7.performFling(r5, r6, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = p000.wc1.boxFloat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fcc.performFling(vre, float, zy2):java.lang.Object");
    }
}
