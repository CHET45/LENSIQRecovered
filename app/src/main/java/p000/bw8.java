package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.mediarouter.media.C1340j;
import java.util.List;
import p000.xl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,426:1\n78#1,6:468\n85#1,4:483\n89#1,2:493\n93#1:498\n368#2,9:427\n377#2,3:442\n289#2,9:445\n298#2,2:460\n368#2,9:474\n377#2,3:495\n368#2,9:499\n377#2,3:514\n4032#3,6:436\n4032#3,6:454\n4032#3,6:487\n4032#3,6:508\n1223#4,6:462\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n171#1:468,6\n171#1:483,4\n171#1:493,2\n171#1:498\n82#1:427,9\n82#1:442,3\n128#1:445,9\n128#1:460,2\n171#1:474,9\n171#1:495,3\n253#1:499,9\n253#1:514,3\n88#1:436,6\n135#1:454,6\n171#1:487,6\n262#1:508,6\n174#1:462,6\n*E\n"})
public final class bw8 {

    /* JADX INFO: renamed from: a */
    public static final int f15086a = 32767;

    /* JADX INFO: renamed from: bw8$a */
    public static final class C2088a extends tt8 implements qy6<lw8, bth> {

        /* JADX INFO: renamed from: a */
        public static final C2088a f15087a = new C2088a();

        public C2088a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(lw8 lw8Var) {
            invoke2(lw8Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb lw8 lw8Var) {
            lw8Var.setCanMultiMeasure$ui_release(true);
        }
    }

    /* JADX INFO: renamed from: bw8$b */
    public static final class C2089b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f15088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f15089b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ uba f15090c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f15091d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f15092e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2089b(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, uba ubaVar, int i, int i2) {
            super(2);
            this.f15088a = interfaceC0701e;
            this.f15089b = gz6Var;
            this.f15090c = ubaVar;
            this.f15091d = i;
            this.f15092e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            bw8.MultiMeasureLayout(this.f15088a, this.f15089b, this.f15090c, zl2Var, tsd.updateChangedFlags(this.f15091d | 1), this.f15092e);
        }
    }

    /* JADX INFO: renamed from: bw8$c */
    @dwf({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,426:1\n33#2,4:427\n38#2:449\n368#3,9:431\n377#3,3:446\n4032#4,6:440\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n*L\n182#1:427,4\n182#1:449\n184#1:431,9\n184#1:446,3\n188#1:440,6\n*E\n"})
    public static final class C2090c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<gz6<zl2, Integer, bth>> f15093a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2090c(List<? extends gz6<? super zl2, ? super Integer, bth>> list) {
            super(2);
            this.f15093a = list;
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
                gm2.traceEventStart(-1953651383, i, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:181)");
            }
            List<gz6<zl2, Integer, bth>> list = this.f15093a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                gz6<zl2, Integer, bth> gz6Var = list.get(i2);
                int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
                xl2.C15179a c15179a = xl2.f98343p;
                ny6<xl2> virtualConstructor = c15179a.getVirtualConstructor();
                if (zl2Var.getApplier() == null) {
                    dl2.invalidApplier();
                }
                zl2Var.startReusableNode();
                if (zl2Var.getInserting()) {
                    zl2Var.createNode(virtualConstructor);
                } else {
                    zl2Var.useNode();
                }
                zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
                gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
                if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                gz6Var.invoke(zl2Var, 0);
                zl2Var.endNode();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: bw8$d */
    @dwf({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,426:1\n4143#2,2:427\n4145#2,2:435\n4032#3,6:429\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n207#1:427,2\n207#1:435,2\n210#1:429,6\n*E\n"})
    public static final class C2091d extends tt8 implements kz6<pqf<xl2>, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f15094a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2091d(InterfaceC0701e interfaceC0701e) {
            super(3);
            this.f15094a = interfaceC0701e;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(pqf<xl2> pqfVar, zl2 zl2Var, Integer num) {
            m28174invokeDeg8D_g(pqfVar.m31861unboximpl(), zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
        public final void m28174invokeDeg8D_g(@yfb zl2 zl2Var, @gib zl2 zl2Var2, int i) {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:204)");
            }
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var2, 0);
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var2, this.f15094a);
            zl2Var.startReplaceableGroup(509942095);
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
            xl2.C15179a c15179a = xl2.f98343p;
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            zl2Var.endReplaceableGroup();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: bw8$e */
    @dwf({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,426:1\n4143#2,2:427\n4145#2,2:435\n4032#3,6:429\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n*L\n230#1:427,2\n230#1:435,2\n233#1:429,6\n*E\n"})
    public static final class C2092e extends tt8 implements kz6<pqf<xl2>, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f15095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2092e(InterfaceC0701e interfaceC0701e) {
            super(3);
            this.f15095a = interfaceC0701e;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(pqf<xl2> pqfVar, zl2 zl2Var, Integer num) {
            m28175invokeDeg8D_g(pqfVar.m31861unboximpl(), zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
        public final void m28175invokeDeg8D_g(@yfb zl2 zl2Var, @gib zl2 zl2Var2, int i) {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-55743822, i, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:227)");
            }
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var2, 0);
            InterfaceC0701e interfaceC0701eMaterializeWithCompositionLocalInjectionInternal = C0696c.materializeWithCompositionLocalInjectionInternal(zl2Var2, this.f15095a);
            zl2Var.startReplaceableGroup(509942095);
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
            xl2.C15179a c15179a = xl2.f98343p;
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeWithCompositionLocalInjectionInternal, c15179a.getSetModifier());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            zl2Var.endReplaceableGroup();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yqh
    @hk2
    public static final void Layout(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib InterfaceC0701e interfaceC0701e, @yfb uba ubaVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC0701e = InterfaceC0701e.f5158d1;
        }
        int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
        qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
        InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701e);
        xl2.C15179a c15179a = xl2.f98343p;
        ny6<xl2> constructor = c15179a.getConstructor();
        int i3 = ((i << 6) & C1340j.f10444b) | 6;
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
        twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVar, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        gz6Var.invoke(zl2Var, Integer.valueOf((i3 >> 6) & 14));
        zl2Var.endNode();
    }

    @yqh
    @hk2
    @q64(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(@gib InterfaceC0701e interfaceC0701e, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @yfb uba ubaVar, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1949933075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(ubaVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1949933075, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:247)");
            }
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2VarStartRestartGroup, 0);
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2VarStartRestartGroup, interfaceC0701e);
            qn2 currentCompositionLocalMap = zl2VarStartRestartGroup.getCurrentCompositionLocalMap();
            ny6<lw8> constructor$ui_release = lw8.f59006r2.getConstructor$ui_release();
            int i5 = ((i3 << 3) & C1340j.f10444b) | 6;
            if (zl2VarStartRestartGroup.getApplier() == null) {
                dl2.invalidApplier();
            }
            zl2VarStartRestartGroup.startReusableNode();
            if (zl2VarStartRestartGroup.getInserting()) {
                zl2VarStartRestartGroup.createNode(constructor$ui_release);
            } else {
                zl2VarStartRestartGroup.useNode();
            }
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2VarStartRestartGroup);
            xl2.C15179a c15179a = xl2.f98343p;
            twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVar, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            twh.m32453initimpl(zl2VarM32449constructorimpl, C2088a.f15087a);
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            gz6Var.invoke(zl2VarStartRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            zl2VarStartRestartGroup.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C2089b(interfaceC0701e2, gz6Var, ubaVar, i, i2));
        }
    }

    @yfb
    @yjd
    public static final gz6<zl2, Integer, bth> combineAsVirtualLayouts(@yfb List<? extends gz6<? super zl2, ? super Integer, bth>> list) {
        return mk2.composableLambdaInstance(-1953651383, true, new C2090c(list));
    }

    @xn8(name = "materializerOf")
    @q64(level = u64.f86865a, message = "Needed only for backwards compatibility. Do not use.")
    @yjd
    @yfb
    public static final kz6<pqf<xl2>, zl2, Integer, bth> materializerOf(@yfb InterfaceC0701e interfaceC0701e) {
        return mk2.composableLambdaInstance(-55743822, true, new C2092e(interfaceC0701e));
    }

    @yfb
    @xn8(name = "modifierMaterializerOf")
    @yjd
    public static final kz6<pqf<xl2>, zl2, Integer, bth> modifierMaterializerOf(@yfb InterfaceC0701e interfaceC0701e) {
        return mk2.composableLambdaInstance(-1586257396, true, new C2091d(interfaceC0701e));
    }

    @yqh
    @hk2
    public static final void Layout(@gib InterfaceC0701e interfaceC0701e, @yfb uba ubaVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC0701e = InterfaceC0701e.f5158d1;
        }
        int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
        InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701e);
        qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
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
        twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVar, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        zl2Var.endNode();
    }

    @yqh
    @hk2
    public static final void Layout(@yfb List<? extends gz6<? super zl2, ? super Integer, bth>> list, @gib InterfaceC0701e interfaceC0701e, @yfb f2b f2bVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC0701e = InterfaceC0701e.f5158d1;
        }
        gz6<zl2, Integer, bth> gz6VarCombineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z = (((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(f2bVar)) || (i & 384) == 256;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = h2b.createMeasurePolicy(f2bVar);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        uba ubaVar = (uba) objRememberedValue;
        int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
        qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
        InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701e);
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
        twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVar, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        gz6VarCombineAsVirtualLayouts.invoke(zl2Var, 0);
        zl2Var.endNode();
    }
}
