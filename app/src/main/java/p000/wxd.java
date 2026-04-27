package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
public final class wxd {

    /* JADX INFO: renamed from: a */
    public final int f95680a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<Float, zy2<? super Float>, Object> f95681b;

    /* JADX INFO: renamed from: c */
    public float f95682c;

    /* JADX INFO: renamed from: wxd$a */
    @ck3(m4009c = "androidx.compose.ui.scrollcapture.RelativeScroller", m4010f = "ComposeScrollCaptureCallback.android.kt", m4011i = {0}, m4012l = {306}, m4013m = "scrollBy", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C14829a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f95683a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f95684b;

        /* JADX INFO: renamed from: d */
        public int f95686d;

        public C14829a(zy2<? super C14829a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f95684b = obj;
            this.f95686d |= Integer.MIN_VALUE;
            return wxd.this.scrollBy(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wxd(int i, @yfb gz6<? super Float, ? super zy2<? super Float>, ? extends Object> gz6Var) {
        this.f95680a = i;
        this.f95681b = gz6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object scrollBy(float r5, p000.zy2<? super p000.bth> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.wxd.C14829a
            if (r0 == 0) goto L13
            r0 = r6
            wxd$a r0 = (p000.wxd.C14829a) r0
            int r1 = r0.f95686d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95686d = r1
            goto L18
        L13:
            wxd$a r0 = new wxd$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f95684b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f95686d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f95683a
            wxd r5 = (p000.wxd) r5
            p000.y7e.throwOnFailure(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r6)
            gz6<java.lang.Float, zy2<? super java.lang.Float>, java.lang.Object> r6 = r4.f95681b
            java.lang.Float r5 = p000.wc1.boxFloat(r5)
            r0.f95683a = r4
            r0.f95686d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f95682c
            float r0 = r0 + r6
            r5.f95682c = r0
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wxd.scrollBy(float, zy2):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.f95682c;
    }

    public final int mapOffsetToViewport(int i) {
        return kpd.coerceIn(i - p3a.roundToInt(this.f95682c), 0, this.f95680a);
    }

    public final void reset() {
        this.f95682c = 0.0f;
    }

    @gib
    public final Object scrollRangeIntoView(int i, int i2, @yfb zy2<? super bth> zy2Var) {
        if (i > i2) {
            throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
        }
        int i3 = i2 - i;
        int i4 = this.f95680a;
        if (i3 > i4) {
            throw new IllegalArgumentException(("Expected range (" + i3 + ") to be ≤ viewportSize=" + this.f95680a).toString());
        }
        float f = i;
        float f2 = this.f95682c;
        if (f >= f2 && i2 <= i4 + f2) {
            return bth.f14751a;
        }
        if (f >= f2) {
            i = i2 - i4;
        }
        Object objScrollTo = scrollTo(i, zy2Var);
        return objScrollTo == pd8.getCOROUTINE_SUSPENDED() ? objScrollTo : bth.f14751a;
    }

    @gib
    public final Object scrollTo(float f, @yfb zy2<? super bth> zy2Var) {
        Object objScrollBy = scrollBy(f - this.f95682c, zy2Var);
        return objScrollBy == pd8.getCOROUTINE_SUSPENDED() ? objScrollBy : bth.f14751a;
    }
}
