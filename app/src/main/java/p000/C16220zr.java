package p000;

import androidx.compose.foundation.layout.C0626c0;
import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.draw.C0699a;
import p000.b92;
import p000.xl2;

/* JADX INFO: renamed from: zr */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,107:1\n1223#2,6:108\n148#3:114\n83#4:115\n68#4:116\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n53#1:108,6\n44#1:114\n45#1:115\n45#1:116\n*E\n"})
public final class C16220zr {

    /* JADX INFO: renamed from: a */
    public static final float f105762a = 1.4142135f;

    /* JADX INFO: renamed from: b */
    public static final float f105763b;

    /* JADX INFO: renamed from: c */
    public static final float f105764c;

    /* JADX INFO: renamed from: zr$a */
    @dwf({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$CursorHandle$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,107:1\n482#2:108\n71#3:109\n69#3,5:110\n74#3:143\n78#3:147\n78#4,6:115\n85#4,4:130\n89#4,2:140\n93#4:146\n368#5,9:121\n377#5:142\n378#5,2:144\n4032#6,6:134\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$CursorHandle$1\n*L\n65#1:108\n66#1:109\n66#1:110,5\n66#1:143\n66#1:147\n66#1:115,6\n66#1:130,4\n66#1:140,2\n66#1:146\n66#1:121,9\n66#1:142\n66#1:144,2\n66#1:134,6\n*E\n"})
    public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f105765a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f105766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, InterfaceC0701e interfaceC0701e) {
            super(2);
            this.f105765a = j;
            this.f105766b = interfaceC0701e;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1653527038, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            if (this.f105765a != j28.f49422d) {
                zl2Var.startReplaceGroup(1828881000);
                InterfaceC0701e interfaceC0701eM27418requiredSizeInqDBjuR0$default = C0626c0.m27418requiredSizeInqDBjuR0$default(this.f105766b, pn4.m31815getWidthD9Ej5fM(this.f105765a), pn4.m31813getHeightD9Ej5fM(this.f105765a), 0.0f, 0.0f, 12, null);
                uba ubaVarMaybeCachedBoxMeasurePolicy = pc1.maybeCachedBoxMeasurePolicy(InterfaceC9407mm.f61437a.getTopCenter(), false);
                int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
                qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
                InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701eM27418requiredSizeInqDBjuR0$default);
                xl2.C15179a c15179a = xl2.f98343p;
                ny6<xl2> constructor = c15179a.getConstructor();
                if (zl2Var.getApplier() == null) {
                    dl2.invalidApplier();
                }
                zl2Var.startReusableNode();
                if (zl2Var.getInserting()) {
                    zl2Var.createNode(constructor);
                } else {
                    zl2Var.useNode();
                }
                zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
                twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarMaybeCachedBoxMeasurePolicy, c15179a.getSetMeasurePolicy());
                twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
                gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
                if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
                C0629e c0629e = C0629e.f4557a;
                C16220zr.DefaultCursorHandle(null, zl2Var, 0, 1);
                zl2Var.endNode();
                zl2Var.endReplaceGroup();
            } else {
                zl2Var.startReplaceGroup(1829217412);
                C16220zr.DefaultCursorHandle(this.f105766b, zl2Var, 0, 0);
                zl2Var.endReplaceGroup();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: zr$b */
    public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qzb f105767a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f105768b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f105769c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f105770d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f105771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qzb qzbVar, InterfaceC0701e interfaceC0701e, long j, int i, int i2) {
            super(2);
            this.f105767a = qzbVar;
            this.f105768b = interfaceC0701e;
            this.f105769c = j;
            this.f105770d = i;
            this.f105771e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C16220zr.m33511CursorHandleUSBMPiE(this.f105767a, this.f105768b, this.f105769c, zl2Var, tsd.updateChangedFlags(this.f105770d | 1), this.f105771e);
        }
    }

    /* JADX INFO: renamed from: zr$c */
    public static final class c extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qzb f105772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qzb qzbVar) {
            super(1);
            this.f105772a = qzbVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            eyeVar.set(uwe.getSelectionHandleInfoKey(), new twe(zd7.Cursor, this.f105772a.mo29872provideF1C5BW0(), swe.Middle, true, null));
        }
    }

    /* JADX INFO: renamed from: zr$d */
    public static final class d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f105773a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f105774b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f105775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0701e interfaceC0701e, int i, int i2) {
            super(2);
            this.f105773a = interfaceC0701e;
            this.f105774b = i;
            this.f105775c = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C16220zr.DefaultCursorHandle(this.f105773a, zl2Var, tsd.updateChangedFlags(this.f105774b | 1), this.f105775c);
        }
    }

    /* JADX INFO: renamed from: zr$e */
    @dwf({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,107:1\n77#2:108\n1223#3,6:109\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n88#1:108\n90#1:109,6\n*E\n"})
    public static final class e extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public static final e f105776a = new e();

        /* JADX INFO: renamed from: zr$e$a */
        public static final class a extends tt8 implements qy6<tl1, hp4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f105777a;

            /* JADX INFO: renamed from: zr$e$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,107:1\n272#2,14:108\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n97#1:108,14\n*E\n"})
            public static final class C16581a extends tt8 implements qy6<ov2, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ float f105778a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rs7 f105779b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ b92 f105780c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16581a(float f, rs7 rs7Var, b92 b92Var) {
                    super(1);
                    this.f105778a = f;
                    this.f105779b = rs7Var;
                    this.f105780c = b92Var;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
                    invoke2(ov2Var);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb ov2 ov2Var) {
                    ov2Var.drawContent();
                    float f = this.f105778a;
                    rs7 rs7Var = this.f105779b;
                    b92 b92Var = this.f105780c;
                    bp4 drawContext = ov2Var.getDrawContext();
                    long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        tp4 transform = drawContext.getTransform();
                        tp4.translate$default(transform, f, 0.0f, 2, null);
                        transform.mo31601rotateUv8p0NA(45.0f, izb.f49009b.m30445getZeroF1C5BW0());
                        ip4.m30238drawImagegbVJVH8$default(ov2Var, rs7Var, 0L, 0.0f, null, b92Var, 0, 46, null);
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(1);
                this.f105777a = j;
            }

            @Override // p000.qy6
            @yfb
            public final hp4 invoke(@yfb tl1 tl1Var) {
                float fM33069getWidthimpl = wpf.m33069getWidthimpl(tl1Var.m32414getSizeNHjbRc()) / 2.0f;
                return tl1Var.onDrawWithContent(new C16581a(fM33069getWidthimpl, C5475ev.createHandleImage(tl1Var, fM33069getWidthimpl), b92.C1786a.m27964tintxETnrds$default(b92.f13012b, this.f105777a, 0, 2, null)));
            }
        }

        public e() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-2126899193);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long jM32338getHandleColor0d7_KjU = ((svg) zl2Var.consume(tvg.getLocalTextSelectionColors())).m32338getHandleColor0d7_KjU();
            InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
            boolean zChanged = zl2Var.changed(jM32338getHandleColor0d7_KjU);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(jM32338getHandleColor0d7_KjU);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            InterfaceC0701e interfaceC0701eThen = interfaceC0701e.then(C0699a.drawWithCache(aVar, (qy6) objRememberedValue));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eThen;
        }
    }

    static {
        float fM30705constructorimpl = kn4.m30705constructorimpl(25);
        f105763b = fM30705constructorimpl;
        f105764c = kn4.m30705constructorimpl(kn4.m30705constructorimpl(fM30705constructorimpl * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m33511CursorHandleUSBMPiE(@p000.yfb p000.qzb r8, @p000.yfb androidx.compose.p002ui.InterfaceC0701e r9, long r10, @p000.gib p000.zl2 r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C16220zr.m33511CursorHandleUSBMPiE(qzb, androidx.compose.ui.e, long, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void DefaultCursorHandle(InterfaceC0701e interfaceC0701e, zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(694251107, i3, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            owf.Spacer(drawCursorHandle(C0626c0.m27424sizeVpY3zN4(interfaceC0701e, f105764c, f105763b)), zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new d(interfaceC0701e, i, i2));
        }
    }

    private static final InterfaceC0701e drawCursorHandle(InterfaceC0701e interfaceC0701e) {
        return C0696c.composed$default(interfaceC0701e, null, e.f105776a, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return f105763b;
    }

    public static final float getCursorHandleWidth() {
        return f105764c;
    }
}
