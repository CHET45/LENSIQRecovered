package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.foundation.layout.C0626c0;
import androidx.compose.foundation.layout.C0649z;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.draw.C0699a;
import p000.b92;
import p000.nr1;
import p000.xl2;

/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,258:1\n1223#2,6:259\n1223#2,6:283\n77#3:265\n546#4,17:266\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n70#1:259,6\n249#1:283,6\n81#1:265\n213#1:266,17\n*E\n"})
public final class C5475ev {

    /* JADX INFO: renamed from: ev$a */
    public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qzb f34069a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9407mm f34070b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zl2, Integer, bth> f34071c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f34072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qzb qzbVar, InterfaceC9407mm interfaceC9407mm, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f34069a = qzbVar;
            this.f34070b = interfaceC9407mm;
            this.f34071c = gz6Var;
            this.f34072d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C5475ev.HandlePopup(this.f34069a, this.f34070b, this.f34071c, zl2Var, tsd.updateChangedFlags(this.f34072d | 1));
        }
    }

    /* JADX INFO: renamed from: ev$b */
    public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u8i f34073a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34074b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34075c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0701e f34076d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qzb f34077e;

        /* JADX INFO: renamed from: ev$b$a */
        @dwf({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,258:1\n482#2:259\n98#3:260\n96#3,5:261\n101#3:294\n105#3:304\n78#4,6:266\n85#4,4:281\n89#4,2:291\n93#4:303\n368#5,9:272\n377#5:293\n378#5,2:301\n4032#6,6:285\n1223#7,6:295\n1223#7,6:305\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1$1\n*L\n84#1:259\n93#1:260\n93#1:261,5\n93#1:294\n93#1:304\n93#1:266,6\n93#1:281,4\n93#1:291,2\n93#1:303\n93#1:272,9\n93#1:293\n93#1:301,2\n93#1:285,6\n102#1:295,6\n109#1:305,6\n*E\n"})
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f34078a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f34079b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC0701e f34080c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ qzb f34081d;

            /* JADX INFO: renamed from: ev$b$a$a, reason: collision with other inner class name */
            public static final class C16439a extends tt8 implements ny6<Boolean> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ qzb f34082a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16439a(qzb qzbVar) {
                    super(0);
                    this.f34082a = qzbVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.ny6
                @yfb
                public final Boolean invoke() {
                    return Boolean.valueOf(mzb.m31100isSpecifiedk4lQ0M(this.f34082a.mo29872provideF1C5BW0()));
                }
            }

            /* JADX INFO: renamed from: ev$b$a$b, reason: collision with other inner class name */
            public static final class C16440b extends tt8 implements ny6<Boolean> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ qzb f34083a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16440b(qzb qzbVar) {
                    super(0);
                    this.f34083a = qzbVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.ny6
                @yfb
                public final Boolean invoke() {
                    return Boolean.valueOf(mzb.m31100isSpecifiedk4lQ0M(this.f34083a.mo29872provideF1C5BW0()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, boolean z, InterfaceC0701e interfaceC0701e, qzb qzbVar) {
                super(2);
                this.f34078a = j;
                this.f34079b = z;
                this.f34080c = interfaceC0701e;
                this.f34081d = qzbVar;
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
                    gm2.traceEventStart(-1426434671, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                }
                if (this.f34078a != j28.f49422d) {
                    zl2Var.startReplaceGroup(-837727128);
                    C0625c.e right = this.f34079b ? C0625c.a.f4493a.getRight() : C0625c.a.f4493a.getLeft();
                    InterfaceC0701e interfaceC0701eM27418requiredSizeInqDBjuR0$default = C0626c0.m27418requiredSizeInqDBjuR0$default(this.f34080c, pn4.m31815getWidthD9Ej5fM(this.f34078a), pn4.m31813getHeightD9Ej5fM(this.f34078a), 0.0f, 0.0f, 12, null);
                    qzb qzbVar = this.f34081d;
                    boolean z = this.f34079b;
                    uba ubaVarRowMeasurePolicy = C0649z.rowMeasurePolicy(right, InterfaceC9407mm.f61437a.getTop(), zl2Var, 0);
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
                    twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarRowMeasurePolicy, c15179a.getSetMeasurePolicy());
                    twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
                    gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
                    if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
                    hce hceVar = hce.f43146a;
                    InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                    boolean zChangedInstance = zl2Var.changedInstance(qzbVar);
                    Object objRememberedValue = zl2Var.rememberedValue();
                    if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                        objRememberedValue = new C16439a(qzbVar);
                        zl2Var.updateRememberedValue(objRememberedValue);
                    }
                    C5475ev.SelectionHandleIcon(aVar, (ny6) objRememberedValue, z, zl2Var, 6);
                    zl2Var.endNode();
                    zl2Var.endReplaceGroup();
                } else {
                    zl2Var.startReplaceGroup(-836867312);
                    InterfaceC0701e interfaceC0701e = this.f34080c;
                    boolean zChangedInstance2 = zl2Var.changedInstance(this.f34081d);
                    qzb qzbVar2 = this.f34081d;
                    Object objRememberedValue2 = zl2Var.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                        objRememberedValue2 = new C16440b(qzbVar2);
                        zl2Var.updateRememberedValue(objRememberedValue2);
                    }
                    C5475ev.SelectionHandleIcon(interfaceC0701e, (ny6) objRememberedValue2, this.f34079b, zl2Var, 0);
                    zl2Var.endReplaceGroup();
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u8i u8iVar, long j, boolean z, InterfaceC0701e interfaceC0701e, qzb qzbVar) {
            super(2);
            this.f34073a = u8iVar;
            this.f34074b = j;
            this.f34075c = z;
            this.f34076d = interfaceC0701e;
            this.f34077e = qzbVar;
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
                gm2.traceEventStart(280174801, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            pn2.CompositionLocalProvider(sn2.getLocalViewConfiguration().provides(this.f34073a), mk2.rememberComposableLambda(-1426434671, true, new a(this.f34074b, this.f34075c, this.f34076d, this.f34077e), zl2Var, 54), zl2Var, did.f29712i | 48);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: ev$c */
    public static final class c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f34084C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qzb f34085a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34086b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ q5e f34087c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f34088d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f34089e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC0701e f34090f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f34091m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qzb qzbVar, boolean z, q5e q5eVar, boolean z2, long j, InterfaceC0701e interfaceC0701e, int i, int i2) {
            super(2);
            this.f34085a = qzbVar;
            this.f34086b = z;
            this.f34087c = q5eVar;
            this.f34088d = z2;
            this.f34089e = j;
            this.f34090f = interfaceC0701e;
            this.f34091m = i;
            this.f34084C = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C5475ev.m28857SelectionHandlepzduO1o(this.f34085a, this.f34086b, this.f34087c, this.f34088d, this.f34089e, this.f34090f, zl2Var, tsd.updateChangedFlags(this.f34091m | 1), this.f34084C);
        }
    }

    /* JADX INFO: renamed from: ev$d */
    public static final class d extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qzb f34092a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34093b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qzb qzbVar, boolean z, boolean z2) {
            super(1);
            this.f34092a = qzbVar;
            this.f34093b = z;
            this.f34094c = z2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            long jMo29872provideF1C5BW0 = this.f34092a.mo29872provideF1C5BW0();
            eyeVar.set(uwe.getSelectionHandleInfoKey(), new twe(this.f34093b ? zd7.SelectionStart : zd7.SelectionEnd, jMo29872provideF1C5BW0, this.f34094c ? swe.Left : swe.Right, mzb.m31100isSpecifiedk4lQ0M(jMo29872provideF1C5BW0), null));
        }
    }

    /* JADX INFO: renamed from: ev$e */
    public static final class e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f34095a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<Boolean> f34096b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34097c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f34098d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0701e interfaceC0701e, ny6<Boolean> ny6Var, boolean z, int i) {
            super(2);
            this.f34095a = interfaceC0701e;
            this.f34096b = ny6Var;
            this.f34097c = z;
            this.f34098d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C5475ev.SelectionHandleIcon(this.f34095a, this.f34096b, this.f34097c, zl2Var, tsd.updateChangedFlags(this.f34098d | 1));
        }
    }

    /* JADX INFO: renamed from: ev$f */
    @dwf({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,258:1\n77#2:259\n1223#3,6:260\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n135#1:259\n136#1:260,6\n*E\n"})
    public static final class f extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Boolean> f34099a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34100b;

        /* JADX INFO: renamed from: ev$f$a */
        public static final class a extends tt8 implements qy6<tl1, hp4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f34101a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ny6<Boolean> f34102b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f34103c;

            /* JADX INFO: renamed from: ev$f$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,258:1\n184#2,6:259\n272#2,14:265\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n145#1:259,6\n145#1:265,14\n*E\n"})
            public static final class C16441a extends tt8 implements qy6<ov2, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ny6<Boolean> f34104a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f34105b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ rs7 f34106c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ b92 f34107d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16441a(ny6<Boolean> ny6Var, boolean z, rs7 rs7Var, b92 b92Var) {
                    super(1);
                    this.f34104a = ny6Var;
                    this.f34105b = z;
                    this.f34106c = rs7Var;
                    this.f34107d = b92Var;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
                    invoke2(ov2Var);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb ov2 ov2Var) {
                    ov2Var.drawContent();
                    if (this.f34104a.invoke().booleanValue()) {
                        if (!this.f34105b) {
                            ip4.m30238drawImagegbVJVH8$default(ov2Var, this.f34106c, 0L, 0.0f, null, this.f34107d, 0, 46, null);
                            return;
                        }
                        rs7 rs7Var = this.f34106c;
                        b92 b92Var = this.f34107d;
                        long jMo30272getCenterF1C5BW0 = ov2Var.mo30272getCenterF1C5BW0();
                        bp4 drawContext = ov2Var.getDrawContext();
                        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo31602scale0AR0LA0(-1.0f, 1.0f, jMo30272getCenterF1C5BW0);
                            ip4.m30238drawImagegbVJVH8$default(ov2Var, rs7Var, 0L, 0.0f, null, b92Var, 0, 46, null);
                        } finally {
                            drawContext.getCanvas().restore();
                            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, ny6<Boolean> ny6Var, boolean z) {
                super(1);
                this.f34101a = j;
                this.f34102b = ny6Var;
                this.f34103c = z;
            }

            @Override // p000.qy6
            @yfb
            public final hp4 invoke(@yfb tl1 tl1Var) {
                return tl1Var.onDrawWithContent(new C16441a(this.f34102b, this.f34103c, C5475ev.createHandleImage(tl1Var, wpf.m33069getWidthimpl(tl1Var.m32414getSizeNHjbRc()) / 2.0f), b92.C1786a.m27964tintxETnrds$default(b92.f13012b, this.f34101a, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ny6<Boolean> ny6Var, boolean z) {
            super(3);
            this.f34099a = ny6Var;
            this.f34100b = z;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-196777734);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long jM32338getHandleColor0d7_KjU = ((svg) zl2Var.consume(tvg.getLocalTextSelectionColors())).m32338getHandleColor0d7_KjU();
            boolean zChanged = zl2Var.changed(jM32338getHandleColor0d7_KjU) | zl2Var.changed(this.f34099a) | zl2Var.changed(this.f34100b);
            ny6<Boolean> ny6Var = this.f34099a;
            boolean z = this.f34100b;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(jM32338getHandleColor0d7_KjU, ny6Var, z);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            InterfaceC0701e interfaceC0701eDrawWithCache = C0699a.drawWithCache(interfaceC0701e, (qy6) objRememberedValue);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eDrawWithCache;
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HandlePopup(@yfb qzb qzbVar, @yfb InterfaceC9407mm interfaceC9407mm, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(476043083);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? zl2VarStartRestartGroup.changed(qzbVar) : zl2VarStartRestartGroup.changedInstance(qzbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(interfaceC9407mm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(476043083, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            boolean z = false;
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && zl2VarStartRestartGroup.changed(qzbVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new be7(interfaceC9407mm, qzbVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C11123pu.Popup((be7) objRememberedValue, null, new y4d(false, false, false, (yte) null, true, false, 15, (jt3) null), gz6Var, zl2VarStartRestartGroup, ((i2 << 3) & 7168) | 384, 2);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new a(qzbVar, interfaceC9407mm, gz6Var, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: SelectionHandle-pzduO1o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m28857SelectionHandlepzduO1o(@p000.yfb p000.qzb r18, boolean r19, @p000.yfb p000.q5e r20, boolean r21, long r22, @p000.yfb androidx.compose.p002ui.InterfaceC0701e r24, @p000.gib p000.zl2 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5475ev.m28857SelectionHandlepzduO1o(qzb, boolean, q5e, boolean, long, androidx.compose.ui.e, zl2, int, int):void");
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void SelectionHandleIcon(@yfb InterfaceC0701e interfaceC0701e, @yfb ny6<Boolean> ny6Var, boolean z, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(2111672474);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(ny6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            owf.Spacer(drawSelectionHandle(C0626c0.m27424sizeVpY3zN4(interfaceC0701e, uwe.getHandleWidth(), uwe.getHandleHeight()), ny6Var, z), zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new e(interfaceC0701e, ny6Var, z, i));
        }
    }

    @yfb
    public static final rs7 createHandleImage(@yfb tl1 tl1Var, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        ae7 ae7Var = ae7.f1250a;
        rs7 imageBitmap = ae7Var.getImageBitmap();
        vq1 canvas = ae7Var.getCanvas();
        nr1 canvasDrawScope = ae7Var.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = ts7.m32437ImageBitmapx__hDU$default(iCeil, iCeil, ss7.f82741b.m32326getAlpha8_sVssgQ(), false, null, 24, null);
            ae7Var.setImageBitmap(imageBitmap);
            canvas = rr1.Canvas(imageBitmap);
            ae7Var.setCanvas(canvas);
        }
        rs7 rs7Var = imageBitmap;
        vq1 vq1Var = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new nr1();
            ae7Var.setCanvasDrawScope(canvasDrawScope);
        }
        nr1 nr1Var = canvasDrawScope;
        ov8 layoutDirection = tl1Var.getLayoutDirection();
        long jSize = eqf.Size(rs7Var.getWidth(), rs7Var.getHeight());
        nr1.C10018a drawParams = nr1Var.getDrawParams();
        c64 c64VarComponent1 = drawParams.component1();
        ov8 ov8VarComponent2 = drawParams.component2();
        vq1 vq1VarComponent3 = drawParams.component3();
        long jM31196component4NHjbRc = drawParams.m31196component4NHjbRc();
        nr1.C10018a drawParams2 = nr1Var.getDrawParams();
        drawParams2.setDensity(tl1Var);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(vq1Var);
        drawParams2.m31199setSizeuvyYCjk(jSize);
        vq1Var.save();
        ip4.m30248drawRectnJ9OG0$default(nr1Var, w82.f93556b.m32977getBlack0d7_KjU(), 0L, nr1Var.mo30273getSizeNHjbRc(), 0.0f, null, null, q51.f73234b.m31901getClear0nO6VwU(), 58, null);
        ip4.m30248drawRectnJ9OG0$default(nr1Var, j92.Color(4278190080L), izb.f49009b.m30445getZeroF1C5BW0(), eqf.Size(f2, f2), 0.0f, null, null, 0, 120, null);
        ip4.m30235drawCircleVaOC9Bg$default(nr1Var, j92.Color(4278190080L), f2, mzb.Offset(f2, f2), 0.0f, null, null, 0, 120, null);
        vq1Var.restore();
        nr1.C10018a drawParams3 = nr1Var.getDrawParams();
        drawParams3.setDensity(c64VarComponent1);
        drawParams3.setLayoutDirection(ov8VarComponent2);
        drawParams3.setCanvas(vq1VarComponent3);
        drawParams3.m31199setSizeuvyYCjk(jM31196component4NHjbRc);
        return rs7Var;
    }

    @yfb
    public static final InterfaceC0701e drawSelectionHandle(@yfb InterfaceC0701e interfaceC0701e, @yfb ny6<Boolean> ny6Var, boolean z) {
        return C0696c.composed$default(interfaceC0701e, null, new f(ny6Var, z), 1, null);
    }
}
