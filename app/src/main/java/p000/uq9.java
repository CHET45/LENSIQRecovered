package p000;

import android.view.View;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n81#2:495\n107#2,2:496\n1#3:498\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n284#1:495\n284#1:496,2\n*E\n"})
@e0g(parameters = 0)
public final class uq9 extends InterfaceC0701e.d implements o77, fp4, rxe, sxb {

    /* JADX INFO: renamed from: m2 */
    public static final int f88782m2 = 8;

    /* JADX INFO: renamed from: M1 */
    public float f88783M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f88784V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super c64, izb> f88785X;

    /* JADX INFO: renamed from: Y */
    @gib
    public qy6<? super c64, izb> f88786Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public qy6<? super pn4, bth> f88787Z;

    /* JADX INFO: renamed from: Z1 */
    public long f88788Z1;

    /* JADX INFO: renamed from: a2 */
    public float f88789a2;

    /* JADX INFO: renamed from: b2 */
    public float f88790b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f88791c2;

    /* JADX INFO: renamed from: d2 */
    @yfb
    public jxc f88792d2;

    /* JADX INFO: renamed from: e2 */
    @gib
    public View f88793e2;

    /* JADX INFO: renamed from: f2 */
    @gib
    public c64 f88794f2;

    /* JADX INFO: renamed from: g2 */
    @gib
    public ixc f88795g2;

    /* JADX INFO: renamed from: h2 */
    @yfb
    public final z6b f88796h2;

    /* JADX INFO: renamed from: i2 */
    @gib
    public i2g<izb> f88797i2;

    /* JADX INFO: renamed from: j2 */
    public long f88798j2;

    /* JADX INFO: renamed from: k2 */
    @gib
    public r78 f88799k2;

    /* JADX INFO: renamed from: l2 */
    @gib
    public au1<bth> f88800l2;

    /* JADX INFO: renamed from: uq9$a */
    public static final class C13652a extends tt8 implements ny6<izb> {
        public C13652a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ izb invoke() {
            return izb.m30418boximpl(m32653invokeF1C5BW0());
        }

        /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m32653invokeF1C5BW0() {
            mv8 layoutCoordinates = uq9.this.getLayoutCoordinates();
            return layoutCoordinates != null ? nv8.positionInRoot(layoutCoordinates) : izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: uq9$b */
    public static final class C13653b extends tt8 implements ny6<izb> {
        public C13653b() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ izb invoke() {
            return izb.m30418boximpl(m32654invokeF1C5BW0());
        }

        /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m32654invokeF1C5BW0() {
            return uq9.this.f88798j2;
        }
    }

    /* JADX INFO: renamed from: uq9$c */
    @ck3(m4009c = "androidx.compose.foundation.MagnifierNode$onAttach$1", m4010f = "Magnifier.android.kt", m4011i = {}, m4012l = {380, 384}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13654c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f88803a;

        /* JADX INFO: renamed from: uq9$c$a */
        public static final class a extends tt8 implements qy6<Long, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f88805a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Long l) {
                invoke(l.longValue());
                return bth.f14751a;
            }

            public final void invoke(long j) {
            }
        }

        public C13654c(zy2<? super C13654c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return uq9.this.new C13654c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13654c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r4.f88803a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                p000.y7e.throwOnFailure(r5)
                goto L32
            L1e:
                p000.y7e.throwOnFailure(r5)
            L21:
                uq9 r5 = p000.uq9.this
                au1 r5 = p000.uq9.access$getDrawSignalChannel$p(r5)
                if (r5 == 0) goto L32
                r4.f88803a = r3
                java.lang.Object r5 = r5.receive(r4)
                if (r5 != r0) goto L32
                return r0
            L32:
                uq9 r5 = p000.uq9.this
                ixc r5 = p000.uq9.access$getMagnifier$p(r5)
                if (r5 == 0) goto L21
                uq9$c$a r5 = p000.uq9.C13654c.a.f88805a
                r4.f88803a = r2
                java.lang.Object r5 = p000.sya.withFrameMillis(r5, r4)
                if (r5 != r0) goto L45
                return r0
            L45:
                uq9 r5 = p000.uq9.this
                ixc r5 = p000.uq9.access$getMagnifier$p(r5)
                if (r5 == 0) goto L21
                r5.updateContent()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.uq9.C13654c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: uq9$d */
    public static final class C13655d extends tt8 implements ny6<bth> {
        public C13655d() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            uq9.this.updateMagnifier();
        }
    }

    public /* synthetic */ uq9(qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, float f, boolean z, long j, float f2, float f3, boolean z2, jxc jxcVar, jt3 jt3Var) {
        this(qy6Var, qy6Var2, qy6Var3, f, z, j, f2, f3, z2, jxcVar);
    }

    /* JADX INFO: renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m32645getAnchorPositionInRootF1C5BW0() {
        if (this.f88797i2 == null) {
            this.f88797i2 = stf.derivedStateOf(new C13652a());
        }
        i2g<izb> i2gVar = this.f88797i2;
        return i2gVar != null ? i2gVar.getValue().m30439unboximpl() : izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mv8 getLayoutCoordinates() {
        return (mv8) this.f88796h2.getValue();
    }

    private final void recreateMagnifier() {
        ixc ixcVar = this.f88795g2;
        if (ixcVar != null) {
            ixcVar.dismiss();
        }
        View viewRequireView = this.f88793e2;
        if (viewRequireView == null) {
            viewRequireView = x34.requireView(this);
        }
        View view = viewRequireView;
        this.f88793e2 = view;
        c64 c64VarRequireDensity = this.f88794f2;
        if (c64VarRequireDensity == null) {
            c64VarRequireDensity = w34.requireDensity(this);
        }
        c64 c64Var = c64VarRequireDensity;
        this.f88794f2 = c64Var;
        this.f88795g2 = this.f88792d2.mo30625createnHHXs2Y(view, this.f88784V1, this.f88788Z1, this.f88789a2, this.f88790b2, this.f88791c2, c64Var, this.f88783M1);
        updateSizeIfNecessary();
    }

    private final void setLayoutCoordinates(mv8 mv8Var) {
        this.f88796h2.setValue(mv8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateMagnifier() {
        /*
            r8 = this;
            c64 r0 = r8.f88794f2
            if (r0 != 0) goto La
            c64 r0 = p000.w34.requireDensity(r8)
            r8.f88794f2 = r0
        La:
            qy6<? super c64, izb> r1 = r8.f88785X
            java.lang.Object r1 = r1.invoke(r0)
            izb r1 = (p000.izb) r1
            long r1 = r1.m30439unboximpl()
            boolean r3 = p000.mzb.m31100isSpecifiedk4lQ0M(r1)
            if (r3 == 0) goto L7b
            long r3 = r8.m32645getAnchorPositionInRootF1C5BW0()
            boolean r3 = p000.mzb.m31100isSpecifiedk4lQ0M(r3)
            if (r3 == 0) goto L7b
            long r3 = r8.m32645getAnchorPositionInRootF1C5BW0()
            long r1 = p000.izb.m30434plusMKHz9U(r3, r1)
            r8.f88798j2 = r1
            qy6<? super c64, izb> r1 = r8.f88786Y
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r1.invoke(r0)
            izb r0 = (p000.izb) r0
            long r0 = r0.m30439unboximpl()
            izb r0 = p000.izb.m30418boximpl(r0)
            long r1 = r0.m30439unboximpl()
            boolean r1 = p000.mzb.m31100isSpecifiedk4lQ0M(r1)
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L5e
            long r0 = r0.m30439unboximpl()
            long r2 = r8.m32645getAnchorPositionInRootF1C5BW0()
            long r0 = p000.izb.m30434plusMKHz9U(r2, r0)
        L5c:
            r5 = r0
            goto L65
        L5e:
            izb$a r0 = p000.izb.f49009b
            long r0 = r0.m30444getUnspecifiedF1C5BW0()
            goto L5c
        L65:
            ixc r0 = r8.f88795g2
            if (r0 != 0) goto L6c
            r8.recreateMagnifier()
        L6c:
            ixc r2 = r8.f88795g2
            if (r2 == 0) goto L77
            long r3 = r8.f88798j2
            float r7 = r8.f88783M1
            r2.mo30413updateWko1d7g(r3, r5, r7)
        L77:
            r8.updateSizeIfNecessary()
            return
        L7b:
            izb$a r0 = p000.izb.f49009b
            long r0 = r0.m30444getUnspecifiedF1C5BW0()
            r8.f88798j2 = r0
            ixc r0 = r8.f88795g2
            if (r0 == 0) goto L8a
            r0.dismiss()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uq9.updateMagnifier():void");
    }

    private final void updateSizeIfNecessary() {
        c64 c64Var;
        ixc ixcVar = this.f88795g2;
        if (ixcVar == null || (c64Var = this.f88794f2) == null || r78.m32084equalsimpl(ixcVar.mo30412getSizeYbymL2g(), this.f88799k2)) {
            return;
        }
        qy6<? super pn4, bth> qy6Var = this.f88787Z;
        if (qy6Var != null) {
            qy6Var.invoke(pn4.m31803boximpl(c64Var.mo27171toDpSizekrfVVM(s78.m32288toSizeozmzZPI(ixcVar.mo30412getSizeYbymL2g()))));
        }
        this.f88799k2 = r78.m32079boximpl(ixcVar.mo30412getSizeYbymL2g());
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        eyeVar.set(vq9.getMagnifierPositionInRoot(), new C13653b());
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        ov2Var.drawContent();
        au1<bth> au1Var = this.f88800l2;
        if (au1Var != null) {
            xu1.m33272boximpl(au1Var.mo28705trySendJP2dKIU(bth.f14751a));
        }
    }

    public final boolean getClippingEnabled() {
        return this.f88791c2;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m32646getCornerRadiusD9Ej5fM() {
        return this.f88789a2;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m32647getElevationD9Ej5fM() {
        return this.f88790b2;
    }

    @gib
    public final qy6<c64, izb> getMagnifierCenter() {
        return this.f88786Y;
    }

    @gib
    public final qy6<pn4, bth> getOnSizeChanged() {
        return this.f88787Z;
    }

    @yfb
    public final jxc getPlatformMagnifierFactory() {
        return this.f88792d2;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m32648getSizeMYxV2XQ() {
        return this.f88788Z1;
    }

    @yfb
    public final qy6<c64, izb> getSourceCenter() {
        return this.f88785X;
    }

    public final boolean getUseTextDefault() {
        return this.f88784V1;
    }

    public final float getZoom() {
        return this.f88783M1;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        onObservedReadsChanged();
        this.f88800l2 = nu1.Channel$default(0, null, null, 7, null);
        fg1.launch$default(getCoroutineScope(), null, null, new C13654c(null), 3, null);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        ixc ixcVar = this.f88795g2;
        if (ixcVar != null) {
            ixcVar.dismiss();
        }
        this.f88795g2 = null;
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        setLayoutCoordinates(mv8Var);
    }

    @Override // p000.sxb
    public void onObservedReadsChanged() {
        txb.observeReads(this, new C13655d());
    }

    public final void setClippingEnabled(boolean z) {
        this.f88791c2 = z;
    }

    /* JADX INFO: renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m32649setCornerRadius0680j_4(float f) {
        this.f88789a2 = f;
    }

    /* JADX INFO: renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m32650setElevation0680j_4(float f) {
        this.f88790b2 = f;
    }

    public final void setMagnifierCenter(@gib qy6<? super c64, izb> qy6Var) {
        this.f88786Y = qy6Var;
    }

    public final void setOnSizeChanged(@gib qy6<? super pn4, bth> qy6Var) {
        this.f88787Z = qy6Var;
    }

    public final void setPlatformMagnifierFactory(@yfb jxc jxcVar) {
        this.f88792d2 = jxcVar;
    }

    /* JADX INFO: renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m32651setSizeEaSLcWc(long j) {
        this.f88788Z1 = j;
    }

    public final void setSourceCenter(@yfb qy6<? super c64, izb> qy6Var) {
        this.f88785X = qy6Var;
    }

    public final void setUseTextDefault(boolean z) {
        this.f88784V1 = z;
    }

    public final void setZoom(float f) {
        this.f88783M1 = f;
    }

    /* JADX INFO: renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m32652update5F03MCQ(@yfb qy6<? super c64, izb> qy6Var, @gib qy6<? super c64, izb> qy6Var2, float f, boolean z, long j, float f2, float f3, boolean z2, @gib qy6<? super pn4, bth> qy6Var3, @yfb jxc jxcVar) {
        float f4 = this.f88783M1;
        long j2 = this.f88788Z1;
        float f5 = this.f88789a2;
        boolean z3 = this.f88784V1;
        float f6 = this.f88790b2;
        boolean z4 = this.f88791c2;
        jxc jxcVar2 = this.f88792d2;
        View view = this.f88793e2;
        c64 c64Var = this.f88794f2;
        this.f88785X = qy6Var;
        this.f88786Y = qy6Var2;
        this.f88783M1 = f;
        this.f88784V1 = z;
        this.f88788Z1 = j;
        this.f88789a2 = f2;
        this.f88790b2 = f3;
        this.f88791c2 = z2;
        this.f88787Z = qy6Var3;
        this.f88792d2 = jxcVar;
        View viewRequireView = x34.requireView(this);
        c64 c64VarRequireDensity = w34.requireDensity(this);
        if (this.f88795g2 != null && ((!vq9.equalsIncludingNaN(f, f4) && !jxcVar.getCanUpdateZoom()) || !pn4.m31812equalsimpl0(j, j2) || !kn4.m30710equalsimpl0(f2, f5) || !kn4.m30710equalsimpl0(f3, f6) || z != z3 || z2 != z4 || !md8.areEqual(jxcVar, jxcVar2) || !md8.areEqual(viewRequireView, view) || !md8.areEqual(c64VarRequireDensity, c64Var))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    public /* synthetic */ uq9(qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, float f, boolean z, long j, float f2, float f3, boolean z2, jxc jxcVar, int i, jt3 jt3Var) {
        this(qy6Var, (i & 2) != 0 ? null : qy6Var2, (i & 4) != 0 ? null : qy6Var3, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? pn4.f71480b.m31824getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? jxc.f52195a.getForCurrentPlatform() : jxcVar, null);
    }

    private uq9(qy6<? super c64, izb> qy6Var, qy6<? super c64, izb> qy6Var2, qy6<? super pn4, bth> qy6Var3, float f, boolean z, long j, float f2, float f3, boolean z2, jxc jxcVar) {
        this.f88785X = qy6Var;
        this.f88786Y = qy6Var2;
        this.f88787Z = qy6Var3;
        this.f88783M1 = f;
        this.f88784V1 = z;
        this.f88788Z1 = j;
        this.f88789a2 = f2;
        this.f88790b2 = f3;
        this.f88791c2 = z2;
        this.f88792d2 = jxcVar;
        this.f88796h2 = stf.mutableStateOf(null, stf.neverEqualPolicy());
        this.f88798j2 = izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }
}
