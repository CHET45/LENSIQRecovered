package p000;

import p000.b92;
import p000.wpf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,651:1\n81#2:652\n107#2,2:653\n81#2:655\n107#2,2:656\n696#3:658\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:652\n121#1:653,2\n127#1:655\n127#1:656,2\n148#1:658\n*E\n"})
@e0g(parameters = 0)
public final class c3i extends u1i {

    /* JADX INFO: renamed from: o */
    public static final int f15724o = 8;

    /* JADX INFO: renamed from: c */
    @yfb
    public final mb7 f15725c;

    /* JADX INFO: renamed from: d */
    @yfb
    public String f15726d;

    /* JADX INFO: renamed from: e */
    public boolean f15727e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final zo4 f15728f;

    /* JADX INFO: renamed from: g */
    @yfb
    public ny6<bth> f15729g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final z6b f15730h;

    /* JADX INFO: renamed from: i */
    @gib
    public b92 f15731i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final z6b f15732j;

    /* JADX INFO: renamed from: k */
    public long f15733k;

    /* JADX INFO: renamed from: l */
    public float f15734l;

    /* JADX INFO: renamed from: m */
    public float f15735m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final qy6<ip4, bth> f15736n;

    /* JADX INFO: renamed from: c3i$a */
    public static final class C2195a extends tt8 implements qy6<u1i, bth> {
        public C2195a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(u1i u1iVar) {
            invoke2(u1iVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb u1i u1iVar) {
            c3i.this.doInvalidate();
        }
    }

    /* JADX INFO: renamed from: c3i$b */
    @dwf({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,651:1\n189#2:652\n272#2,14:653\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n*L\n139#1:652\n139#1:653,14\n*E\n"})
    public static final class C2196b extends tt8 implements qy6<ip4, bth> {
        public C2196b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            mb7 root = c3i.this.getRoot();
            c3i c3iVar = c3i.this;
            float f = c3iVar.f15734l;
            float f2 = c3iVar.f15735m;
            long jM30445getZeroF1C5BW0 = izb.f49009b.m30445getZeroF1C5BW0();
            bp4 drawContext = ip4Var.getDrawContext();
            long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo31602scale0AR0LA0(f, f2, jM30445getZeroF1C5BW0);
                root.draw(ip4Var);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            }
        }
    }

    /* JADX INFO: renamed from: c3i$c */
    public static final class C2197c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C2197c f15739a = new C2197c();

        public C2197c() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public c3i(@yfb mb7 mb7Var) {
        super(null);
        this.f15725c = mb7Var;
        mb7Var.setInvalidateListener$ui_release(new C2195a());
        this.f15726d = "";
        this.f15727e = true;
        this.f15728f = new zo4();
        this.f15729g = C2197c.f15739a;
        this.f15730h = xtf.mutableStateOf$default(null, null, 2, null);
        wpf.C14740a c14740a = wpf.f95046b;
        this.f15732j = xtf.mutableStateOf$default(wpf.m33057boximpl(c14740a.m33078getZeroNHjbRc()), null, 2, null);
        this.f15733k = c14740a.m33077getUnspecifiedNHjbRc();
        this.f15734l = 1.0f;
        this.f15735m = 1.0f;
        this.f15736n = new C2196b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.f15727e = true;
        this.f15729g.invoke();
    }

    public final void draw(@yfb ip4 ip4Var, float f, @gib b92 b92Var) {
        int iM32326getAlpha8_sVssgQ = (this.f15725c.isTintable() && this.f15725c.m30982getTintColor0d7_KjU() != 16 && l3i.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && l3i.tintableWithAlphaMask(b92Var)) ? ss7.f82741b.m32326getAlpha8_sVssgQ() : ss7.f82741b.m32327getArgb8888_sVssgQ();
        if (this.f15727e || !wpf.m33065equalsimpl0(this.f15733k, ip4Var.mo30273getSizeNHjbRc()) || !ss7.m32322equalsimpl0(iM32326getAlpha8_sVssgQ, m28191getCacheBitmapConfig_sVssgQ$ui_release())) {
            this.f15731i = ss7.m32322equalsimpl0(iM32326getAlpha8_sVssgQ, ss7.f82741b.m32326getAlpha8_sVssgQ()) ? b92.C1786a.m27964tintxETnrds$default(b92.f13012b, this.f15725c.m30982getTintColor0d7_KjU(), 0, 2, null) : null;
            this.f15734l = wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc()) / wpf.m33069getWidthimpl(m28192getViewportSizeNHjbRc$ui_release());
            this.f15735m = wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()) / wpf.m33066getHeightimpl(m28192getViewportSizeNHjbRc$ui_release());
            this.f15728f.m33510drawCachedImageFqjB98A(iM32326getAlpha8_sVssgQ, s78.IntSize((int) Math.ceil(wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc())), (int) Math.ceil(wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()))), ip4Var, ip4Var.getLayoutDirection(), this.f15736n);
            this.f15727e = false;
            this.f15733k = ip4Var.mo30273getSizeNHjbRc();
        }
        if (b92Var == null) {
            b92Var = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.f15731i;
        }
        this.f15728f.drawInto(ip4Var, f, b92Var);
    }

    /* JADX INFO: renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m28191getCacheBitmapConfig_sVssgQ$ui_release() {
        rs7 mCachedImage = this.f15728f.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo28693getConfig_sVssgQ() : ss7.f82741b.m32327getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final b92 getIntrinsicColorFilter$ui_release() {
        return (b92) this.f15730h.getValue();
    }

    @yfb
    public final ny6<bth> getInvalidateCallback$ui_release() {
        return this.f15729g;
    }

    @yfb
    public final String getName() {
        return this.f15726d;
    }

    @yfb
    public final mb7 getRoot() {
        return this.f15725c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m28192getViewportSizeNHjbRc$ui_release() {
        return ((wpf) this.f15732j.getValue()).m33074unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(@gib b92 b92Var) {
        this.f15730h.setValue(b92Var);
    }

    public final void setInvalidateCallback$ui_release(@yfb ny6<bth> ny6Var) {
        this.f15729g = ny6Var;
    }

    public final void setName(@yfb String str) {
        this.f15726d = str;
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m28193setViewportSizeuvyYCjk$ui_release(long j) {
        this.f15732j.setValue(wpf.m33057boximpl(j));
    }

    @yfb
    public String toString() {
        String str = "Params: \tname: " + this.f15726d + "\n\tviewportWidth: " + wpf.m33069getWidthimpl(m28192getViewportSizeNHjbRc$ui_release()) + "\n\tviewportHeight: " + wpf.m33066getHeightimpl(m28192getViewportSizeNHjbRc$ui_release()) + "\n";
        md8.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // p000.u1i
    public void draw(@yfb ip4 ip4Var) {
        draw(ip4Var, 1.0f, null);
    }
}
