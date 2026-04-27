package p000;

import androidx.compose.animation.C0577j;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n81#2:1341\n107#2,2:1342\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n1209#1:1338\n1209#1:1339,2\n1212#1:1341\n1212#1:1342,2\n*E\n"})
public final class oqf extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @gib
    public ku2 f68321X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final z6b f68322Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public final z6b f68323Z;

    /* JADX INFO: renamed from: oqf$a */
    @dwf({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1337:1\n57#2,4:1338\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$1\n*L\n1239#1:1338,4\n*E\n"})
    public static final class C10504a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0767t f68325b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f68326c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f68327d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC0761n f68328e;

        /* JADX INFO: renamed from: oqf$a$a */
        public static final class a extends tt8 implements qy6<InterfaceC0736c, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f68329a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(1);
                this.f68329a = j;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(InterfaceC0736c interfaceC0736c) {
                invoke2(interfaceC0736c);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb InterfaceC0736c interfaceC0736c) {
                interfaceC0736c.setScaleX(pme.m31795getScaleXimpl(this.f68329a));
                interfaceC0736c.setScaleY(pme.m31796getScaleYimpl(this.f68329a));
                interfaceC0736c.mo27624setTransformOrigin__ExYCQ(ydh.TransformOrigin(0.0f, 0.0f));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10504a(AbstractC0767t abstractC0767t, long j, long j2, InterfaceC0761n interfaceC0761n) {
            super(1);
            this.f68325b = abstractC0767t;
            this.f68326c = j;
            this.f68327d = j2;
            this.f68328e = interfaceC0761n;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            C0577j scaleToBounds = oqf.this.getScaleToBounds();
            if (!oqf.this.isEnabled().invoke().booleanValue() || scaleToBounds == null) {
                AbstractC0767t.a.place$default(aVar, this.f68325b, 0, 0, 0.0f, 4, null);
                return;
            }
            long jScaleFactor = (r78.m32087getWidthimpl(this.f68326c) == 0 || r78.m32086getHeightimpl(this.f68326c) == 0) ? qme.ScaleFactor(1.0f, 1.0f) : scaleToBounds.getContentScale().mo29683computeScaleFactorH7hwNQA(s78.m32288toSizeozmzZPI(this.f68326c), s78.m32288toSizeozmzZPI(this.f68327d));
            long jMo30996alignKFBX0sM = scaleToBounds.getAlignment().mo30996alignKFBX0sM(s78.IntSize(p3a.roundToInt(r78.m32087getWidthimpl(this.f68326c) * pme.m31795getScaleXimpl(jScaleFactor)), p3a.roundToInt(r78.m32086getHeightimpl(this.f68326c) * pme.m31796getScaleYimpl(jScaleFactor))), this.f68327d, this.f68328e.getLayoutDirection());
            AbstractC0767t.a.placeWithLayer$default(aVar, this.f68325b, a78.m27201getXimpl(jMo30996alignKFBX0sM), a78.m27202getYimpl(jMo30996alignKFBX0sM), 0.0f, new a(jScaleFactor), 4, (Object) null);
        }
    }

    public oqf(@gib C0577j c0577j, @yfb ny6<Boolean> ny6Var) {
        this.f68322Y = xtf.mutableStateOf$default(c0577j, null, 2, null);
        this.f68323Z = xtf.mutableStateOf$default(ny6Var, null, 2, null);
    }

    @gib
    /* JADX INFO: renamed from: getLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final ku2 m31593getLookaheadConstraintsDWUhwKw() {
        return this.f68321X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final C0577j getScaleToBounds() {
        return (C0577j) this.f68322Y.getValue();
    }

    @yfb
    public final ny6<Boolean> isEnabled() {
        return (ny6) this.f68323Z.getValue();
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        if (interfaceC0761n.isLookingAhead()) {
            this.f68321X = ku2.m30751boximpl(j);
        }
        ku2 ku2Var = this.f68321X;
        md8.checkNotNull(ku2Var);
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2Var.m30769unboximpl());
        long jIntSize = s78.IntSize(abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight());
        long jM31224constrain4WqzIAM = nu2.m31224constrain4WqzIAM(j, jIntSize);
        return InterfaceC0761n.layout$default(interfaceC0761n, r78.m32087getWidthimpl(jM31224constrain4WqzIAM), r78.m32086getHeightimpl(jM31224constrain4WqzIAM), null, new C10504a(abstractC0767tMo27949measureBRTryo0, jIntSize, jM31224constrain4WqzIAM, interfaceC0761n), 4, null);
    }

    public final void setEnabled(@yfb ny6<Boolean> ny6Var) {
        this.f68323Z.setValue(ny6Var);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-_Sx5XlM, reason: not valid java name */
    public final void m31594setLookaheadConstraints_Sx5XlM(@gib ku2 ku2Var) {
        this.f68321X = ku2Var;
    }

    public final void setScaleToBounds(@gib C0577j c0577j) {
        this.f68322Y.setValue(c0577j);
    }
}
