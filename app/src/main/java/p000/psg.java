package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1223#2,6:1100\n1223#2,6:1106\n1223#2,6:1112\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n1002#1:1100,6\n1007#1:1106,6\n1011#1:1112,6\n*E\n"})
public final class psg {

    /* JADX INFO: renamed from: psg$a */
    public static final class C11109a implements qzb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f71947a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f71948b;

        public C11109a(osg osgVar, boolean z) {
            this.f71947a = osgVar;
            this.f71948b = z;
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0 */
        public final long mo29872provideF1C5BW0() {
            return this.f71947a.m31648getHandlePositiontuRUvjQ$foundation_release(this.f71948b);
        }
    }

    /* JADX INFO: renamed from: psg$b */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", m4010f = "TextFieldSelectionManager.kt", m4011i = {}, m4012l = {1012}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11110b extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f71949a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f71950b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zqg f71951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11110b(zqg zqgVar, zy2<? super C11110b> zy2Var) {
            super(2, zy2Var);
            this.f71951c = zqgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11110b c11110b = new C11110b(this.f71951c, zy2Var);
            c11110b.f71950b = obj;
            return c11110b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C11110b) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f71949a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f71950b;
                zqg zqgVar = this.f71951c;
                this.f71949a = 1;
                if (ql9.detectDownAndDragGesturesWithObserver(s2dVar, zqgVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: psg$c */
    public static final class C11111c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f71952a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ q5e f71953b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ osg f71954c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f71955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11111c(boolean z, q5e q5eVar, osg osgVar, int i) {
            super(2);
            this.f71952a = z;
            this.f71953b = q5eVar;
            this.f71954c = osgVar;
            this.f71955d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            psg.TextFieldSelectionHandle(this.f71952a, this.f71953b, this.f71954c, zl2Var, tsd.updateChangedFlags(this.f71955d | 1));
        }
    }

    /* JADX INFO: renamed from: psg$d */
    public /* synthetic */ class C11112d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71956a;

        static {
            int[] iArr = new int[zd7.values().length];
            try {
                iArr[zd7.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zd7.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zd7.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71956a = iArr;
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void TextFieldSelectionHandle(boolean z, @yfb q5e q5eVar, @yfb osg osgVar, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1344558920);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(q5eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(osgVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i3 = i2 & 14;
            boolean zChanged = (i3 == 4) | zl2VarStartRestartGroup.changed(osgVar);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = osgVar.handleDragObserver$foundation_release(z);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            zqg zqgVar = (zqg) objRememberedValue;
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(osgVar) | (i3 == 4);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                objRememberedValue2 = new C11109a(osgVar, z);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            qzb qzbVar = (qzb) objRememberedValue2;
            boolean zM30592getReversedimpl = jvg.m30592getReversedimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE());
            InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
            boolean zChangedInstance2 = zl2VarStartRestartGroup.changedInstance(zqgVar);
            Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == zl2.f105372a.getEmpty()) {
                objRememberedValue3 = new C11110b(zqgVar, null);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            C5475ev.m28857SelectionHandlepzduO1o(qzbVar, z, q5eVar, zM30592getReversedimpl, 0L, vgg.pointerInput(aVar, zqgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3), zl2VarStartRestartGroup, (i2 << 3) & 1008, 16);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11111c(z, q5eVar, osgVar, i));
        }
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m31867calculateSelectionMagnifierCenterAndroidO0kMr_c(@yfb osg osgVar, long j) {
        int iM30593getStartimpl;
        iug layoutResult;
        sqg textDelegate;
        C9041lz text;
        izb izbVarM31646getCurrentDragPosition_m7T9E = osgVar.m31646getCurrentDragPosition_m7T9E();
        if (izbVarM31646getCurrentDragPosition_m7T9E == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        long jM30439unboximpl = izbVarM31646getCurrentDragPosition_m7T9E.m30439unboximpl();
        C9041lz transformedText$foundation_release = osgVar.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        zd7 draggingHandle = osgVar.getDraggingHandle();
        int i = draggingHandle == null ? -1 : C11112d.f71956a[draggingHandle.ordinal()];
        if (i == -1) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            iM30593getStartimpl = jvg.m30593getStartimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE());
        } else {
            if (i != 3) {
                throw new ceb();
            }
            iM30593getStartimpl = jvg.m30588getEndimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE());
        }
        z39 state$foundation_release = osgVar.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        z39 state$foundation_release2 = osgVar.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        int iCoerceIn = kpd.coerceIn(osgVar.getOffsetMapping$foundation_release().originalToTransformed(iM30593getStartimpl), 0, text.length());
        float fM30429getXimpl = izb.m30429getXimpl(layoutResult.m30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release(jM30439unboximpl));
        hug value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(iCoerceIn);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float fCoerceIn = kpd.coerceIn(fM30429getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!r78.m32085equalsimpl0(j, r78.f77324b.m32092getZeroYbymL2g()) && Math.abs(fM30429getXimpl - fCoerceIn) > r78.m32087getWidthimpl(j) / 2) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return mzb.Offset(fCoerceIn, ((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
    }

    public static final boolean isSelectionHandleInVisibleBound(@yfb osg osgVar, boolean z) {
        mv8 layoutCoordinates;
        rud rudVarVisibleBounds;
        z39 state$foundation_release = osgVar.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (rudVarVisibleBounds = axe.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return axe.m27906containsInclusiveUv8p0NA(rudVarVisibleBounds, osgVar.m31648getHandlePositiontuRUvjQ$foundation_release(z));
    }
}
