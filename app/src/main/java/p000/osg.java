package p000;

import androidx.compose.p002ui.focus.C0723l;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1099:1\n81#2:1100\n107#2,2:1101\n81#2:1103\n107#2,2:1104\n81#2:1106\n107#2,2:1107\n81#2:1109\n107#2,2:1110\n81#2:1112\n107#2,2:1113\n1#3:1115\n148#4:1116\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n89#1:1100\n89#1:1101,2\n126#1:1103\n126#1:1104,2\n131#1:1106\n131#1:1107,2\n161#1:1109\n161#1:1110,2\n167#1:1112\n167#1:1113,2\n863#1:1116\n*E\n"})
@e0g(parameters = 0)
public final class osg {

    /* JADX INFO: renamed from: w */
    public static final int f68584w = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final ish f68585a;

    /* JADX INFO: renamed from: b */
    @yfb
    public nzb f68586b;

    /* JADX INFO: renamed from: c */
    @yfb
    public qy6<? super zsg, bth> f68587c;

    /* JADX INFO: renamed from: d */
    @gib
    public z39 f68588d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f68589e;

    /* JADX INFO: renamed from: f */
    @yfb
    public kdi f68590f;

    /* JADX INFO: renamed from: g */
    @gib
    public a52 f68591g;

    /* JADX INFO: renamed from: h */
    @gib
    public awg f68592h;

    /* JADX INFO: renamed from: i */
    @gib
    public lg7 f68593i;

    /* JADX INFO: renamed from: j */
    @gib
    public C0723l f68594j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final z6b f68595k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final z6b f68596l;

    /* JADX INFO: renamed from: m */
    public long f68597m;

    /* JADX INFO: renamed from: n */
    @gib
    public Integer f68598n;

    /* JADX INFO: renamed from: o */
    public long f68599o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final z6b f68600p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final z6b f68601q;

    /* JADX INFO: renamed from: r */
    public int f68602r;

    /* JADX INFO: renamed from: s */
    @yfb
    public zsg f68603s;

    /* JADX INFO: renamed from: t */
    @gib
    public vwe f68604t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final zqg f68605u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final e0b f68606v;

    /* JADX INFO: renamed from: osg$a */
    public static final class C10636a implements zqg {
        public C10636a() {
        }

        @Override // p000.zqg
        public void onCancel() {
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M, reason: not valid java name */
        public void mo31651onDownk4lQ0M(long j) {
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public void mo31652onDragk4lQ0M(long j) {
            iug layoutResult;
            lg7 hapticFeedBack;
            osg osgVar = osg.this;
            osgVar.f68599o = izb.m30434plusMKHz9U(osgVar.f68599o, j);
            z39 state$foundation_release = osg.this.getState$foundation_release();
            if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                return;
            }
            osg osgVar2 = osg.this;
            osgVar2.m31642setCurrentDragPosition_kEHs6E(izb.m30418boximpl(izb.m30434plusMKHz9U(osgVar2.f68597m, osgVar2.f68599o)));
            nzb offsetMapping$foundation_release = osgVar2.getOffsetMapping$foundation_release();
            izb izbVarM31646getCurrentDragPosition_m7T9E = osgVar2.m31646getCurrentDragPosition_m7T9E();
            md8.checkNotNull(izbVarM31646getCurrentDragPosition_m7T9E);
            int iTransformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(iug.m30405getOffsetForPosition3MmeM6k$default(layoutResult, izbVarM31646getCurrentDragPosition_m7T9E.m30439unboximpl(), false, 2, null));
            long jTextRange = kvg.TextRange(iTransformedToOriginal, iTransformedToOriginal);
            if (jvg.m30586equalsimpl0(jTextRange, osgVar2.getValue$foundation_release().m33527getSelectiond9O1mEE())) {
                return;
            }
            z39 state$foundation_release2 = osgVar2.getState$foundation_release();
            if ((state$foundation_release2 == null || state$foundation_release2.isInTouchMode()) && (hapticFeedBack = osgVar2.getHapticFeedBack()) != null) {
                hapticFeedBack.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
            }
            osgVar2.getOnValueChange$foundation_release().invoke(osgVar2.m31640createTextFieldValueFDrldGo(osgVar2.getValue$foundation_release().getAnnotatedString(), jTextRange));
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M, reason: not valid java name */
        public void mo31653onStartk4lQ0M(long j) {
            iug layoutResult;
            long jM32665getAdjustedCoordinatesk4lQ0M = uwe.m32665getAdjustedCoordinatesk4lQ0M(osg.this.m31648getHandlePositiontuRUvjQ$foundation_release(true));
            z39 state$foundation_release = osg.this.getState$foundation_release();
            if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                return;
            }
            long jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM32665getAdjustedCoordinatesk4lQ0M);
            osg.this.f68597m = jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
            osg.this.m31642setCurrentDragPosition_kEHs6E(izb.m30418boximpl(jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
            osg.this.f68599o = izb.f49009b.m30445getZeroF1C5BW0();
            osg.this.setDraggingHandle(zd7.Cursor);
            osg.this.updateFloatingToolbar(false);
        }

        @Override // p000.zqg
        public void onStop() {
            osg.this.setDraggingHandle(null);
            osg.this.m31642setCurrentDragPosition_kEHs6E(null);
        }

        @Override // p000.zqg
        public void onUp() {
            osg.this.setDraggingHandle(null);
            osg.this.m31642setCurrentDragPosition_kEHs6E(null);
        }
    }

    /* JADX INFO: renamed from: osg$b */
    public static final class C10637b implements zqg {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f68609b;

        public C10637b(boolean z) {
            this.f68609b = z;
        }

        @Override // p000.zqg
        public void onCancel() {
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo31651onDownk4lQ0M(long j) {
            iug layoutResult;
            osg.this.setDraggingHandle(this.f68609b ? zd7.SelectionStart : zd7.SelectionEnd);
            long jM32665getAdjustedCoordinatesk4lQ0M = uwe.m32665getAdjustedCoordinatesk4lQ0M(osg.this.m31648getHandlePositiontuRUvjQ$foundation_release(this.f68609b));
            z39 state$foundation_release = osg.this.getState$foundation_release();
            if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                return;
            }
            long jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM32665getAdjustedCoordinatesk4lQ0M);
            osg.this.f68597m = jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
            osg.this.m31642setCurrentDragPosition_kEHs6E(izb.m30418boximpl(jM30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
            osg.this.f68599o = izb.f49009b.m30445getZeroF1C5BW0();
            osg.this.f68602r = -1;
            z39 state$foundation_release2 = osg.this.getState$foundation_release();
            if (state$foundation_release2 != null) {
                state$foundation_release2.setInTouchMode(true);
            }
            osg.this.updateFloatingToolbar(false);
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo31652onDragk4lQ0M(long j) {
            osg osgVar = osg.this;
            osgVar.f68599o = izb.m30434plusMKHz9U(osgVar.f68599o, j);
            osg osgVar2 = osg.this;
            osgVar2.m31642setCurrentDragPosition_kEHs6E(izb.m30418boximpl(izb.m30434plusMKHz9U(osgVar2.f68597m, osg.this.f68599o)));
            osg osgVar3 = osg.this;
            zsg value$foundation_release = osgVar3.getValue$foundation_release();
            izb izbVarM31646getCurrentDragPosition_m7T9E = osg.this.m31646getCurrentDragPosition_m7T9E();
            md8.checkNotNull(izbVarM31646getCurrentDragPosition_m7T9E);
            osgVar3.m31643updateSelection8UEBfa8(value$foundation_release, izbVarM31646getCurrentDragPosition_m7T9E.m30439unboximpl(), false, this.f68609b, mwe.f62568a.getCharacterWithWordAccelerate(), true);
            osg.this.updateFloatingToolbar(false);
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo31653onStartk4lQ0M(long j) {
        }

        @Override // p000.zqg
        public void onStop() {
            osg.this.setDraggingHandle(null);
            osg.this.m31642setCurrentDragPosition_kEHs6E(null);
            osg.this.updateFloatingToolbar(true);
        }

        @Override // p000.zqg
        public void onUp() {
            osg.this.setDraggingHandle(null);
            osg.this.m31642setCurrentDragPosition_kEHs6E(null);
            osg.this.updateFloatingToolbar(true);
        }
    }

    /* JADX INFO: renamed from: osg$c */
    public static final class C10638c implements e0b {
        public C10638c() {
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onDrag-3MmeM6k */
        public boolean mo28715onDrag3MmeM6k(long j, @yfb mwe mweVar) {
            z39 state$foundation_release;
            if (!osg.this.getEnabled() || osg.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = osg.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                return false;
            }
            updateMouseSelection(osg.this.getValue$foundation_release(), j, false, mweVar);
            return true;
        }

        @Override // p000.e0b
        public void onDragDone() {
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtend-k-4lQ0M */
        public boolean mo28716onExtendk4lQ0M(long j) {
            z39 state$foundation_release = osg.this.getState$foundation_release();
            if (state$foundation_release == null || state$foundation_release.getLayoutResult() == null || !osg.this.getEnabled()) {
                return false;
            }
            osg.this.f68602r = -1;
            updateMouseSelection(osg.this.getValue$foundation_release(), j, false, mwe.f62568a.getNone());
            return true;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
        public boolean mo28717onExtendDragk4lQ0M(long j) {
            z39 state$foundation_release;
            if (!osg.this.getEnabled() || osg.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = osg.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                return false;
            }
            updateMouseSelection(osg.this.getValue$foundation_release(), j, false, mwe.f62568a.getNone());
            return true;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onStart-3MmeM6k */
        public boolean mo28718onStart3MmeM6k(long j, @yfb mwe mweVar) {
            z39 state$foundation_release;
            if (!osg.this.getEnabled() || osg.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = osg.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                return false;
            }
            C0723l focusRequester = osg.this.getFocusRequester();
            if (focusRequester != null) {
                focusRequester.requestFocus();
            }
            osg.this.f68597m = j;
            osg.this.f68602r = -1;
            osg.enterSelectionMode$foundation_release$default(osg.this, false, 1, null);
            updateMouseSelection(osg.this.getValue$foundation_release(), osg.this.f68597m, true, mweVar);
            return true;
        }

        public final void updateMouseSelection(@yfb zsg zsgVar, long j, boolean z, @yfb mwe mweVar) {
            osg.this.setHandleState(jvg.m30587getCollapsedimpl(osg.this.m31643updateSelection8UEBfa8(zsgVar, j, z, false, mweVar, false)) ? ce7.Cursor : ce7.Selection);
        }
    }

    /* JADX INFO: renamed from: osg$d */
    public static final class C10639d extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C10639d f68611a = new C10639d();

        public C10639d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
        }
    }

    /* JADX INFO: renamed from: osg$e */
    public static final class C10640e extends tt8 implements ny6<bth> {
        public C10640e() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            osg.copy$foundation_release$default(osg.this, false, 1, null);
            osg.this.hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: renamed from: osg$f */
    public static final class C10641f extends tt8 implements ny6<bth> {
        public C10641f() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            osg.this.cut$foundation_release();
            osg.this.hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: renamed from: osg$g */
    public static final class C10642g extends tt8 implements ny6<bth> {
        public C10642g() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            osg.this.paste$foundation_release();
            osg.this.hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: renamed from: osg$h */
    public static final class C10643h extends tt8 implements ny6<bth> {
        public C10643h() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            osg.this.selectAll$foundation_release();
        }
    }

    /* JADX INFO: renamed from: osg$i */
    public static final class C10644i implements zqg {
        public C10644i() {
        }

        private final void onEnd() {
            osg.this.setDraggingHandle(null);
            osg.this.m31642setCurrentDragPosition_kEHs6E(null);
            osg.this.updateFloatingToolbar(true);
            osg.this.f68598n = null;
            boolean zM30587getCollapsedimpl = jvg.m30587getCollapsedimpl(osg.this.getValue$foundation_release().m33527getSelectiond9O1mEE());
            osg.this.setHandleState(zM30587getCollapsedimpl ? ce7.Cursor : ce7.Selection);
            z39 state$foundation_release = osg.this.getState$foundation_release();
            if (state$foundation_release != null) {
                state$foundation_release.setShowSelectionHandleStart(!zM30587getCollapsedimpl && psg.isSelectionHandleInVisibleBound(osg.this, true));
            }
            z39 state$foundation_release2 = osg.this.getState$foundation_release();
            if (state$foundation_release2 != null) {
                state$foundation_release2.setShowSelectionHandleEnd(!zM30587getCollapsedimpl && psg.isSelectionHandleInVisibleBound(osg.this, false));
            }
            z39 state$foundation_release3 = osg.this.getState$foundation_release();
            if (state$foundation_release3 == null) {
                return;
            }
            state$foundation_release3.setShowCursorHandle(zM30587getCollapsedimpl && psg.isSelectionHandleInVisibleBound(osg.this, true));
        }

        @Override // p000.zqg
        public void onCancel() {
            onEnd();
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo31651onDownk4lQ0M(long j) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31652onDragk4lQ0M(long r10) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.osg.C10644i.mo31652onDragk4lQ0M(long):void");
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo31653onStartk4lQ0M(long j) {
            iug layoutResult;
            iug layoutResult2;
            if (osg.this.getEnabled() && osg.this.getDraggingHandle() == null) {
                osg.this.setDraggingHandle(zd7.SelectionEnd);
                osg.this.f68602r = -1;
                osg.this.hideSelectionToolbar$foundation_release();
                z39 state$foundation_release = osg.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null || !layoutResult2.m30407isPositionOnTextk4lQ0M(j)) {
                    z39 state$foundation_release2 = osg.this.getState$foundation_release();
                    if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                        osg osgVar = osg.this;
                        int iTransformedToOriginal = osgVar.getOffsetMapping$foundation_release().transformedToOriginal(iug.m30405getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null));
                        zsg zsgVarM31640createTextFieldValueFDrldGo = osgVar.m31640createTextFieldValueFDrldGo(osgVar.getValue$foundation_release().getAnnotatedString(), kvg.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                        osgVar.enterSelectionMode$foundation_release(false);
                        lg7 hapticFeedBack = osgVar.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
                        }
                        osgVar.getOnValueChange$foundation_release().invoke(zsgVarM31640createTextFieldValueFDrldGo);
                    }
                } else {
                    if (osg.this.getValue$foundation_release().getText().length() == 0) {
                        return;
                    }
                    osg.this.enterSelectionMode$foundation_release(false);
                    osg osgVar2 = osg.this;
                    osg.this.f68598n = Integer.valueOf(jvg.m30593getStartimpl(osgVar2.m31643updateSelection8UEBfa8(zsg.m33523copy3r_uNRQ$default(osgVar2.getValue$foundation_release(), (C9041lz) null, jvg.f52112b.m30598getZerod9O1mEE(), (jvg) null, 5, (Object) null), j, true, false, mwe.f62568a.getWord(), true)));
                }
                osg.this.setHandleState(ce7.None);
                osg.this.f68597m = j;
                osg osgVar3 = osg.this;
                osgVar3.m31642setCurrentDragPosition_kEHs6E(izb.m30418boximpl(osgVar3.f68597m));
                osg.this.f68599o = izb.f49009b.m30445getZeroF1C5BW0();
            }
        }

        @Override // p000.zqg
        public void onStop() {
            onEnd();
        }

        @Override // p000.zqg
        public void onUp() {
        }
    }

    public osg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void copy$foundation_release$default(osg osgVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        osgVar.copy$foundation_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final zsg m31640createTextFieldValueFDrldGo(C9041lz c9041lz, long j) {
        return new zsg(c9041lz, j, (jvg) null, 4, (jt3) null);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m31641deselect_kEHs6E$foundation_release$default(osg osgVar, izb izbVar, int i, Object obj) {
        if ((i & 1) != 0) {
            izbVar = null;
        }
        osgVar.m31645deselect_kEHs6E$foundation_release(izbVar);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(osg osgVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        osgVar.enterSelectionMode$foundation_release(z);
    }

    private final rud getContentRect() {
        float fM30430getYimpl;
        mv8 layoutCoordinates;
        hug value;
        rud cursorRect;
        mv8 layoutCoordinates2;
        hug value2;
        rud cursorRect2;
        mv8 layoutCoordinates3;
        mv8 layoutCoordinates4;
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            if (z39Var.isLayoutResultStale()) {
                z39Var = null;
            }
            if (z39Var != null) {
                int iOriginalToTransformed = this.f68586b.originalToTransformed(jvg.m30593getStartimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()));
                int iOriginalToTransformed2 = this.f68586b.originalToTransformed(jvg.m30588getEndimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()));
                z39 z39Var2 = this.f68588d;
                long jM30445getZeroF1C5BW0 = (z39Var2 == null || (layoutCoordinates4 = z39Var2.getLayoutCoordinates()) == null) ? izb.f49009b.m30445getZeroF1C5BW0() : layoutCoordinates4.mo30036localToRootMKHz9U(m31648getHandlePositiontuRUvjQ$foundation_release(true));
                z39 z39Var3 = this.f68588d;
                long jM30445getZeroF1C5BW02 = (z39Var3 == null || (layoutCoordinates3 = z39Var3.getLayoutCoordinates()) == null) ? izb.f49009b.m30445getZeroF1C5BW0() : layoutCoordinates3.mo30036localToRootMKHz9U(m31648getHandlePositiontuRUvjQ$foundation_release(false));
                z39 z39Var4 = this.f68588d;
                float fM30430getYimpl2 = 0.0f;
                if (z39Var4 == null || (layoutCoordinates2 = z39Var4.getLayoutCoordinates()) == null) {
                    fM30430getYimpl = 0.0f;
                } else {
                    iug layoutResult = z39Var.getLayoutResult();
                    fM30430getYimpl = izb.m30430getYimpl(layoutCoordinates2.mo30036localToRootMKHz9U(mzb.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                z39 z39Var5 = this.f68588d;
                if (z39Var5 != null && (layoutCoordinates = z39Var5.getLayoutCoordinates()) != null) {
                    iug layoutResult2 = z39Var.getLayoutResult();
                    fM30430getYimpl2 = izb.m30430getYimpl(layoutCoordinates.mo30036localToRootMKHz9U(mzb.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new rud(Math.min(izb.m30429getXimpl(jM30445getZeroF1C5BW0), izb.m30429getXimpl(jM30445getZeroF1C5BW02)), Math.min(fM30430getYimpl, fM30430getYimpl2), Math.max(izb.m30429getXimpl(jM30445getZeroF1C5BW0), izb.m30429getXimpl(jM30445getZeroF1C5BW02)), Math.max(izb.m30430getYimpl(jM30445getZeroF1C5BW0), izb.m30430getYimpl(jM30445getZeroF1C5BW02)) + (kn4.m30705constructorimpl(25) * z39Var.getTextDelegate().getDensity().getDensity()));
            }
        }
        return rud.f79687e.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m31642setCurrentDragPosition_kEHs6E(izb izbVar) {
        this.f68601q.setValue(izbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(zd7 zd7Var) {
        this.f68600p.setValue(zd7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(ce7 ce7Var) {
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            if (z39Var.getHandleState() == ce7Var) {
                z39Var = null;
            }
            if (z39Var != null) {
                z39Var.setHandleState(ce7Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z) {
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            z39Var.setShowFloatingToolbar(z);
        }
        if (z) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m31643updateSelection8UEBfa8(zsg zsgVar, long j, boolean z, boolean z2, mwe mweVar, boolean z3) {
        iug layoutResult;
        lg7 lg7Var;
        int i;
        z39 z39Var = this.f68588d;
        if (z39Var == null || (layoutResult = z39Var.getLayoutResult()) == null) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        long jTextRange = kvg.TextRange(this.f68586b.originalToTransformed(jvg.m30593getStartimpl(zsgVar.m33527getSelectiond9O1mEE())), this.f68586b.originalToTransformed(jvg.m30588getEndimpl(zsgVar.m33527getSelectiond9O1mEE())));
        boolean z4 = false;
        int iM30406getOffsetForPosition3MmeM6k = layoutResult.m30406getOffsetForPosition3MmeM6k(j, false);
        int iM30593getStartimpl = (z2 || z) ? iM30406getOffsetForPosition3MmeM6k : jvg.m30593getStartimpl(jTextRange);
        int iM30588getEndimpl = (!z2 || z) ? iM30406getOffsetForPosition3MmeM6k : jvg.m30588getEndimpl(jTextRange);
        vwe vweVar = this.f68604t;
        int i2 = -1;
        if (!z && vweVar != null && (i = this.f68602r) != -1) {
            i2 = i;
        }
        vwe vweVarM33326getTextFieldSelectionLayoutRcvTLA = xwe.m33326getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM30593getStartimpl, iM30588getEndimpl, i2, jTextRange, z, z2);
        if (!vweVarM33326getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(vweVar)) {
            return zsgVar.m33527getSelectiond9O1mEE();
        }
        this.f68604t = vweVarM33326getTextFieldSelectionLayoutRcvTLA;
        this.f68602r = iM30406getOffsetForPosition3MmeM6k;
        gwe gweVarAdjust = mweVar.adjust(vweVarM33326getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = kvg.TextRange(this.f68586b.transformedToOriginal(gweVarAdjust.getStart().getOffset()), this.f68586b.transformedToOriginal(gweVarAdjust.getEnd().getOffset()));
        if (jvg.m30586equalsimpl0(jTextRange2, zsgVar.m33527getSelectiond9O1mEE())) {
            return zsgVar.m33527getSelectiond9O1mEE();
        }
        boolean z5 = jvg.m30592getReversedimpl(jTextRange2) != jvg.m30592getReversedimpl(zsgVar.m33527getSelectiond9O1mEE()) && jvg.m30586equalsimpl0(kvg.TextRange(jvg.m30588getEndimpl(jTextRange2), jvg.m30593getStartimpl(jTextRange2)), zsgVar.m33527getSelectiond9O1mEE());
        boolean z6 = jvg.m30587getCollapsedimpl(jTextRange2) && jvg.m30587getCollapsedimpl(zsgVar.m33527getSelectiond9O1mEE());
        if (z3 && zsgVar.getText().length() > 0 && !z5 && !z6 && (lg7Var = this.f68593i) != null) {
            lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
        }
        this.f68587c.invoke(m31640createTextFieldValueFDrldGo(zsgVar.getAnnotatedString(), jTextRange2));
        if (!z3) {
            updateFloatingToolbar(!jvg.m30587getCollapsedimpl(jTextRange2));
        }
        z39 z39Var2 = this.f68588d;
        if (z39Var2 != null) {
            z39Var2.setInTouchMode(z3);
        }
        z39 z39Var3 = this.f68588d;
        if (z39Var3 != null) {
            z39Var3.setShowSelectionHandleStart(!jvg.m30587getCollapsedimpl(jTextRange2) && psg.isSelectionHandleInVisibleBound(this, true));
        }
        z39 z39Var4 = this.f68588d;
        if (z39Var4 != null) {
            z39Var4.setShowSelectionHandleEnd(!jvg.m30587getCollapsedimpl(jTextRange2) && psg.isSelectionHandleInVisibleBound(this, false));
        }
        z39 z39Var5 = this.f68588d;
        if (z39Var5 != null) {
            if (jvg.m30587getCollapsedimpl(jTextRange2) && psg.isSelectionHandleInVisibleBound(this, true)) {
                z4 = true;
            }
            z39Var5.setShowCursorHandle(z4);
        }
        return jTextRange2;
    }

    public final void clearPreviewHighlight$foundation_release() {
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            z39Var.m33491setDeletionPreviewHighlightRange5zctL8(jvg.f52112b.m30598getZerod9O1mEE());
        }
        z39 z39Var2 = this.f68588d;
        if (z39Var2 == null) {
            return;
        }
        z39Var2.m33494setSelectionPreviewHighlightRange5zctL8(jvg.f52112b.m30598getZerod9O1mEE());
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m31644contextMenuOpenAdjustmentk4lQ0M(long j) {
        iug layoutResult;
        z39 z39Var = this.f68588d;
        if (z39Var == null || (layoutResult = z39Var.getLayoutResult()) == null) {
            return;
        }
        if (jvg.m30584containsimpl(getValue$foundation_release().m33527getSelectiond9O1mEE(), iug.m30405getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null))) {
            return;
        }
        this.f68602r = -1;
        m31643updateSelection8UEBfa8(getValue$foundation_release(), j, true, false, mwe.f62568a.getWord(), false);
    }

    public final void copy$foundation_release(boolean z) {
        if (jvg.m30587getCollapsedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE())) {
            return;
        }
        a52 a52Var = this.f68591g;
        if (a52Var != null) {
            a52Var.setText(atg.getSelectedText(getValue$foundation_release()));
        }
        if (z) {
            int iM30590getMaximpl = jvg.m30590getMaximpl(getValue$foundation_release().m33527getSelectiond9O1mEE());
            this.f68587c.invoke(m31640createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), kvg.TextRange(iM30590getMaximpl, iM30590getMaximpl)));
            setHandleState(ce7.None);
        }
    }

    @yfb
    public final zqg cursorDragObserver$foundation_release() {
        return new C10636a();
    }

    public final void cut$foundation_release() {
        if (jvg.m30587getCollapsedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE())) {
            return;
        }
        a52 a52Var = this.f68591g;
        if (a52Var != null) {
            a52Var.setText(atg.getSelectedText(getValue$foundation_release()));
        }
        C9041lz c9041lzPlus = atg.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(atg.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM30591getMinimpl = jvg.m30591getMinimpl(getValue$foundation_release().m33527getSelectiond9O1mEE());
        this.f68587c.invoke(m31640createTextFieldValueFDrldGo(c9041lzPlus, kvg.TextRange(iM30591getMinimpl, iM30591getMinimpl)));
        setHandleState(ce7.None);
        ish ishVar = this.f68585a;
        if (ishVar != null) {
            ishVar.forceNextSnapshot();
        }
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m31645deselect_kEHs6E$foundation_release(@gib izb izbVar) {
        if (!jvg.m30587getCollapsedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE())) {
            z39 z39Var = this.f68588d;
            iug layoutResult = z39Var != null ? z39Var.getLayoutResult() : null;
            this.f68587c.invoke(zsg.m33523copy3r_uNRQ$default(getValue$foundation_release(), (C9041lz) null, kvg.TextRange((izbVar == null || layoutResult == null) ? jvg.m30590getMaximpl(getValue$foundation_release().m33527getSelectiond9O1mEE()) : this.f68586b.transformedToOriginal(iug.m30405getOffsetForPosition3MmeM6k$default(layoutResult, izbVar.m30439unboximpl(), false, 2, null))), (jvg) null, 5, (Object) null));
        }
        setHandleState((izbVar == null || getValue$foundation_release().getText().length() <= 0) ? ce7.None : ce7.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean z) {
        C0723l c0723l;
        z39 z39Var = this.f68588d;
        if (z39Var != null && !z39Var.getHasFocus() && (c0723l = this.f68594j) != null) {
            c0723l.requestFocus();
        }
        this.f68603s = getValue$foundation_release();
        updateFloatingToolbar(z);
        setHandleState(ce7.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(ce7.None);
    }

    @gib
    public final a52 getClipboardManager$foundation_release() {
        return this.f68591g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final izb m31646getCurrentDragPosition_m7T9E() {
        return (izb) this.f68601q.getValue();
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m31647getCursorPositiontuRUvjQ$foundation_release(@yfb c64 c64Var) {
        int iOriginalToTransformed = this.f68586b.originalToTransformed(jvg.m30593getStartimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()));
        z39 z39Var = this.f68588d;
        iug layoutResult = z39Var != null ? z39Var.getLayoutResult() : null;
        md8.checkNotNull(layoutResult);
        hug value = layoutResult.getValue();
        rud cursorRect = value.getCursorRect(kpd.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return mzb.Offset(cursorRect.getLeft() + (c64Var.mo27173toPx0680j_4(nrg.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final zd7 getDraggingHandle() {
        return (zd7) this.f68600p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.f68595k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.f68596l.getValue()).booleanValue();
    }

    @gib
    public final C0723l getFocusRequester() {
        return this.f68594j;
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m31648getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        iug layoutResult;
        hug value;
        z39 z39Var = this.f68588d;
        if (z39Var == null || (layoutResult = z39Var.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        C9041lz transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        if (!md8.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        long jM33527getSelectiond9O1mEE = getValue$foundation_release().m33527getSelectiond9O1mEE();
        return uvg.getSelectionHandleCoordinates(value, this.f68586b.originalToTransformed(z ? jvg.m30593getStartimpl(jM33527getSelectiond9O1mEE) : jvg.m30588getEndimpl(jM33527getSelectiond9O1mEE)), z, jvg.m30592getReversedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()));
    }

    @gib
    public final lg7 getHapticFeedBack() {
        return this.f68593i;
    }

    @yfb
    public final e0b getMouseSelectionObserver$foundation_release() {
        return this.f68606v;
    }

    @yfb
    public final nzb getOffsetMapping$foundation_release() {
        return this.f68586b;
    }

    @yfb
    public final qy6<zsg, bth> getOnValueChange$foundation_release() {
        return this.f68587c;
    }

    @gib
    public final z39 getState$foundation_release() {
        return this.f68588d;
    }

    @gib
    public final awg getTextToolbar() {
        return this.f68592h;
    }

    @yfb
    public final zqg getTouchSelectionObserver$foundation_release() {
        return this.f68605u;
    }

    @gib
    public final C9041lz getTransformedText$foundation_release() {
        sqg textDelegate;
        z39 z39Var = this.f68588d;
        if (z39Var == null || (textDelegate = z39Var.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    @gib
    public final ish getUndoManager() {
        return this.f68585a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final zsg getValue$foundation_release() {
        return (zsg) this.f68589e.getValue();
    }

    @yfb
    public final kdi getVisualTransformation$foundation_release() {
        return this.f68590f;
    }

    @yfb
    public final zqg handleDragObserver$foundation_release(boolean z) {
        return new C10637b(z);
    }

    public final void hideSelectionToolbar$foundation_release() {
        awg awgVar;
        awg awgVar2 = this.f68592h;
        if ((awgVar2 != null ? awgVar2.getStatus() : null) != dwg.Shown || (awgVar = this.f68592h) == null) {
            return;
        }
        awgVar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !md8.areEqual(this.f68603s.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        C9041lz text;
        a52 a52Var = this.f68591g;
        if (a52Var == null || (text = a52Var.getText()) == null) {
            return;
        }
        C9041lz c9041lzPlus = atg.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(atg.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM30591getMinimpl = jvg.m30591getMinimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()) + text.length();
        this.f68587c.invoke(m31640createTextFieldValueFDrldGo(c9041lzPlus, kvg.TextRange(iM30591getMinimpl, iM30591getMinimpl)));
        setHandleState(ce7.None);
        ish ishVar = this.f68585a;
        if (ishVar != null) {
            ishVar.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        zsg zsgVarM31640createTextFieldValueFDrldGo = m31640createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), kvg.TextRange(0, getValue$foundation_release().getText().length()));
        this.f68587c.invoke(zsgVarM31640createTextFieldValueFDrldGo);
        this.f68603s = zsg.m33523copy3r_uNRQ$default(this.f68603s, (C9041lz) null, zsgVarM31640createTextFieldValueFDrldGo.m33527getSelectiond9O1mEE(), (jvg) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    public final void setClipboardManager$foundation_release(@gib a52 a52Var) {
        this.f68591g = a52Var;
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m31649setDeletionPreviewHighlight5zctL8$foundation_release(long j) {
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            z39Var.m33491setDeletionPreviewHighlightRange5zctL8(j);
        }
        z39 z39Var2 = this.f68588d;
        if (z39Var2 != null) {
            z39Var2.m33494setSelectionPreviewHighlightRange5zctL8(jvg.f52112b.m30598getZerod9O1mEE());
        }
        if (jvg.m30587getCollapsedimpl(j)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z) {
        this.f68595k.setValue(Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.f68596l.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(@gib C0723l c0723l) {
        this.f68594j = c0723l;
    }

    public final void setHapticFeedBack(@gib lg7 lg7Var) {
        this.f68593i = lg7Var;
    }

    public final void setOffsetMapping$foundation_release(@yfb nzb nzbVar) {
        this.f68586b = nzbVar;
    }

    public final void setOnValueChange$foundation_release(@yfb qy6<? super zsg, bth> qy6Var) {
        this.f68587c = qy6Var;
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m31650setSelectionPreviewHighlight5zctL8$foundation_release(long j) {
        z39 z39Var = this.f68588d;
        if (z39Var != null) {
            z39Var.m33494setSelectionPreviewHighlightRange5zctL8(j);
        }
        z39 z39Var2 = this.f68588d;
        if (z39Var2 != null) {
            z39Var2.m33491setDeletionPreviewHighlightRange5zctL8(jvg.f52112b.m30598getZerod9O1mEE());
        }
        if (jvg.m30587getCollapsedimpl(j)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(@gib z39 z39Var) {
        this.f68588d = z39Var;
    }

    public final void setTextToolbar(@gib awg awgVar) {
        this.f68592h = awgVar;
    }

    public final void setValue$foundation_release(@yfb zsg zsgVar) {
        this.f68589e.setValue(zsgVar);
    }

    public final void setVisualTransformation$foundation_release(@yfb kdi kdiVar) {
        this.f68590f = kdiVar;
    }

    public final void showSelectionToolbar$foundation_release() {
        a52 a52Var;
        if (getEnabled()) {
            z39 z39Var = this.f68588d;
            if (z39Var == null || z39Var.isInTouchMode()) {
                boolean z = this.f68590f instanceof tic;
                C10640e c10640e = (jvg.m30587getCollapsedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()) || z) ? null : new C10640e();
                C10641f c10641f = (jvg.m30587getCollapsedimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()) || !getEditable() || z) ? null : new C10641f();
                C10642g c10642g = (getEditable() && (a52Var = this.f68591g) != null && a52Var.hasText()) ? new C10642g() : null;
                C10643h c10643h = jvg.m30589getLengthimpl(getValue$foundation_release().m33527getSelectiond9O1mEE()) != getValue$foundation_release().getText().length() ? new C10643h() : null;
                awg awgVar = this.f68592h;
                if (awgVar != null) {
                    awgVar.showMenu(getContentRect(), c10640e, c10642g, c10641f, c10643h);
                }
            }
        }
    }

    public osg(@gib ish ishVar) {
        this.f68585a = ishVar;
        this.f68586b = y1i.getValidatingEmptyOffsetMappingIdentity();
        this.f68587c = C10639d.f68611a;
        int i = 7;
        jt3 jt3Var = null;
        jvg jvgVar = null;
        this.f68589e = xtf.mutableStateOf$default(new zsg((String) null, 0L, jvgVar, i, jt3Var), null, 2, null);
        this.f68590f = kdi.f53675a.getNone();
        Boolean bool = Boolean.TRUE;
        this.f68595k = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f68596l = xtf.mutableStateOf$default(bool, null, 2, null);
        izb.C7673a c7673a = izb.f49009b;
        this.f68597m = c7673a.m30445getZeroF1C5BW0();
        this.f68599o = c7673a.m30445getZeroF1C5BW0();
        this.f68600p = xtf.mutableStateOf$default(null, null, 2, null);
        this.f68601q = xtf.mutableStateOf$default(null, null, 2, null);
        this.f68602r = -1;
        this.f68603s = new zsg((String) null, 0L, jvgVar, i, jt3Var);
        this.f68605u = new C10644i();
        this.f68606v = new C10638c();
    }

    public /* synthetic */ osg(ish ishVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : ishVar);
    }
}
