package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,520:1\n81#2:521\n107#2,2:522\n81#2:524\n107#2,2:525\n75#3:527\n108#3,2:528\n270#4:530\n271#4:551\n184#5,6:531\n272#5,14:537\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n193#1:521\n193#1:522,2\n195#1:524\n195#1:525,2\n232#1:527\n232#1:528,2\n246#1:530\n246#1:551\n246#1:531,6\n246#1:537,14\n*E\n"})
@e0g(parameters = 0)
public final class n3i extends occ {

    /* JADX INFO: renamed from: o */
    public static final int f63216o = 8;

    /* JADX INFO: renamed from: g */
    @yfb
    public final z6b f63217g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final z6b f63218h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final c3i f63219i;

    /* JADX INFO: renamed from: j */
    @gib
    public cn2 f63220j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final k5b f63221k;

    /* JADX INFO: renamed from: l */
    public float f63222l;

    /* JADX INFO: renamed from: m */
    @gib
    public b92 f63223m;

    /* JADX INFO: renamed from: n */
    public int f63224n;

    /* JADX INFO: renamed from: n3i$a */
    public static final class C9685a extends tt8 implements ny6<bth> {
        public C9685a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (n3i.this.f63224n == n3i.this.getInvalidateCount()) {
                n3i n3iVar = n3i.this;
                n3iVar.setInvalidateCount(n3iVar.getInvalidateCount() + 1);
            }
        }
    }

    public n3i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.f63221k.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i) {
        this.f63221k.setIntValue(i);
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: a */
    public boolean mo3755a(float f) {
        this.f63222l = f;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: b */
    public boolean mo3756b(@gib b92 b92Var) {
        this.f63223m = b92Var;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: d */
    public void mo3757d(@yfb ip4 ip4Var) {
        c3i c3iVar = this.f63219i;
        b92 intrinsicColorFilter$ui_release = this.f63223m;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = c3iVar.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && ip4Var.getLayoutDirection() == ov8.Rtl) {
            long jMo30272getCenterF1C5BW0 = ip4Var.mo30272getCenterF1C5BW0();
            bp4 drawContext = ip4Var.getDrawContext();
            long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo31602scale0AR0LA0(-1.0f, 1.0f, jMo30272getCenterF1C5BW0);
                c3iVar.draw(ip4Var, this.f63222l, intrinsicColorFilter$ui_release);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            }
        } else {
            c3iVar.draw(ip4Var, this.f63222l, intrinsicColorFilter$ui_release);
        }
        this.f63224n = getInvalidateCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.f63218h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m31125getBitmapConfig_sVssgQ$ui_release() {
        return this.f63219i.m28191getCacheBitmapConfig_sVssgQ$ui_release();
    }

    @gib
    public final cn2 getComposition$ui_release() {
        return this.f63220j;
    }

    @gib
    public final b92 getIntrinsicColorFilter$ui_release() {
        return this.f63219i.getIntrinsicColorFilter$ui_release();
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo28196getIntrinsicSizeNHjbRc() {
        return m31126getSizeNHjbRc$ui_release();
    }

    @yfb
    public final String getName$ui_release() {
        return this.f63219i.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m31126getSizeNHjbRc$ui_release() {
        return ((wpf) this.f63217g.getValue()).m33074unboximpl();
    }

    @yfb
    public final c3i getVector$ui_release() {
        return this.f63219i;
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m31127getViewportSizeNHjbRc$ui_release() {
        return this.f63219i.m28192getViewportSizeNHjbRc$ui_release();
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.f63218h.setValue(Boolean.valueOf(z));
    }

    public final void setComposition$ui_release(@gib cn2 cn2Var) {
        this.f63220j = cn2Var;
    }

    public final void setIntrinsicColorFilter$ui_release(@gib b92 b92Var) {
        this.f63219i.setIntrinsicColorFilter$ui_release(b92Var);
    }

    public final void setName$ui_release(@yfb String str) {
        this.f63219i.setName(str);
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m31128setSizeuvyYCjk$ui_release(long j) {
        this.f63217g.setValue(wpf.m33057boximpl(j));
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m31129setViewportSizeuvyYCjk$ui_release(long j) {
        this.f63219i.m28193setViewportSizeuvyYCjk$ui_release(j);
    }

    public n3i(@yfb mb7 mb7Var) {
        this.f63217g = xtf.mutableStateOf$default(wpf.m33057boximpl(wpf.f95046b.m33078getZeroNHjbRc()), null, 2, null);
        this.f63218h = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        c3i c3iVar = new c3i(mb7Var);
        c3iVar.setInvalidateCallback$ui_release(new C9685a());
        this.f63219i = c3iVar;
        this.f63221k = etf.mutableIntStateOf(0);
        this.f63222l = 1.0f;
        this.f63224n = -1;
    }

    public /* synthetic */ n3i(mb7 mb7Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new mb7() : mb7Var);
    }
}
