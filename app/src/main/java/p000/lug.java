package p000;

import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n148#2:253\n81#3:254\n81#3:255\n107#3,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n80#1:253\n46#1:254\n73#1:255\n73#1:256,2\n74#1:258\n74#1:259,2\n75#1:261\n75#1:262,2\n80#1:264\n80#1:265,2\n*E\n"})
@e0g(parameters = 0)
public final class lug {

    /* JADX INFO: renamed from: i */
    public static final int f58839i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public dsg f58840a;

    /* JADX INFO: renamed from: b */
    @gib
    public gz6<? super c64, ? super ny6<hug>, bth> f58841b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final dsg f58842c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f58843d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f58844e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f58845f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final z6b f58846g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final md1 f58847h;

    /* JADX INFO: renamed from: lug$a */
    public static final class C8975a extends tt8 implements ny6<hug> {
        public C8975a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final hug invoke() {
            return lug.this.f58840a.getValue();
        }
    }

    public lug() {
        dsg dsgVar = new dsg();
        this.f58840a = dsgVar;
        this.f58842c = dsgVar;
        this.f58843d = stf.mutableStateOf(null, stf.neverEqualPolicy());
        this.f58844e = stf.mutableStateOf(null, stf.neverEqualPolicy());
        this.f58845f = stf.mutableStateOf(null, stf.neverEqualPolicy());
        this.f58846g = xtf.mutableStateOf$default(kn4.m30703boximpl(kn4.m30705constructorimpl(0)), null, 2, null);
        this.f58847h = od1.BringIntoViewRequester();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m30893getOffsetForPosition3MmeM6k$default(lug lugVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return lugVar.m30896getOffsetForPosition3MmeM6k(j, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long r6) {
        /*
            r5 = this;
            mv8 r0 = r5.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            mv8 r1 = r5.getDecoratorNodeCoordinates()
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            r4 = 2
            rud r2 = p000.mv8.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L20
        L1a:
            rud$a r0 = p000.rud.f79687e
            rud r2 = r0.getZero()
        L20:
            if (r2 != 0) goto L28
        L22:
            rud$a r0 = p000.rud.f79687e
            rud r2 = r0.getZero()
        L28:
            long r6 = p000.mug.m31049coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lug.m30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long):long");
    }

    @yfb
    public final md1 getBringIntoViewRequester() {
        return this.f58847h;
    }

    @gib
    public final mv8 getCoreNodeCoordinates() {
        return (mv8) this.f58844e.getValue();
    }

    @gib
    public final mv8 getDecoratorNodeCoordinates() {
        return (mv8) this.f58845f.getValue();
    }

    @gib
    public final hug getLayoutResult() {
        return this.f58842c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m30895getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((kn4) this.f58846g.getValue()).m30719unboximpl();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m30896getOffsetForPosition3MmeM6k(long j, boolean z) {
        hug layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z) {
            j = m30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j);
        }
        return layoutResult.m30129getOffsetForPositionk4lQ0M(mug.m31050fromDecorationToTextLayoutUv8p0NA(this, j));
    }

    @gib
    public final gz6<c64, ny6<hug>, bth> getOnTextLayout() {
        return this.f58841b;
    }

    @gib
    public final mv8 getTextLayoutNodeCoordinates() {
        return (mv8) this.f58843d.getValue();
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m30897isPositionOnTextk4lQ0M(long j) {
        hug layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long jM31050fromDecorationToTextLayoutUv8p0NA = mug.m31050fromDecorationToTextLayoutUv8p0NA(this, m30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(izb.m30430getYimpl(jM31050fromDecorationToTextLayoutUv8p0NA));
        return izb.m30429getXimpl(jM31050fromDecorationToTextLayoutUv8p0NA) >= layoutResult.getLineLeft(lineForVerticalPosition) && izb.m30429getXimpl(jM31050fromDecorationToTextLayoutUv8p0NA) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    @yfb
    /* JADX INFO: renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final hug m30898layoutWithNewMeasureInputshBUhpc(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb do6.InterfaceC4891b interfaceC4891b, long j) {
        hug hugVarM28687layoutWithNewMeasureInputshBUhpc = this.f58840a.m28687layoutWithNewMeasureInputshBUhpc(c64Var, ov8Var, interfaceC4891b, j);
        gz6<? super c64, ? super ny6<hug>, bth> gz6Var = this.f58841b;
        if (gz6Var != null) {
            gz6Var.invoke(c64Var, new C8975a());
        }
        return hugVarM28687layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(@gib mv8 mv8Var) {
        this.f58844e.setValue(mv8Var);
    }

    public final void setDecoratorNodeCoordinates(@gib mv8 mv8Var) {
        this.f58845f.setValue(mv8Var);
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m30899setMinHeightForSingleLineField0680j_4(float f) {
        this.f58846g.setValue(kn4.m30703boximpl(f));
    }

    public final void setOnTextLayout(@gib gz6<? super c64, ? super ny6<hug>, bth> gz6Var) {
        this.f58841b = gz6Var;
    }

    public final void setTextLayoutNodeCoordinates(@gib mv8 mv8Var) {
        this.f58843d.setValue(mv8Var);
    }

    public final void updateNonMeasureInputs(@yfb jeh jehVar, @yfb yvg yvgVar, boolean z, boolean z2) {
        this.f58840a.updateNonMeasureInputs(jehVar, yvgVar, z, z2);
    }
}
