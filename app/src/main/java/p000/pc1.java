package p000;

import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.HashMap;
import java.util.List;
import p000.InterfaceC9407mm;
import p000.xl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n78#2,6:340\n85#2,4:355\n89#2,2:365\n93#2:370\n124#2,6:377\n131#2,5:392\n136#2:403\n138#2:406\n368#3,9:346\n377#3,3:367\n289#3,9:383\n298#3,2:404\n4032#4,6:359\n4032#4,6:397\n1223#5,6:371\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n73#1:340,6\n73#1:355,4\n73#1:365,2\n73#1:370\n238#1:377,6\n238#1:392,5\n238#1:403\n238#1:406\n73#1:346,9\n73#1:367,3\n238#1:383,9\n238#1:404,2\n73#1:359,6\n238#1:397,6\n117#1:371,6\n*E\n"})
public final class pc1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final HashMap<InterfaceC9407mm, uba> f70251a = cacheFor(true);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final HashMap<InterfaceC9407mm, uba> f70252b = cacheFor(false);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final uba f70253c = new qc1(InterfaceC9407mm.f61437a.getTopStart(), false);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final uba f70254d = C10884b.f70257a;

    /* JADX INFO: renamed from: pc1$a */
    public static final class C10883a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f70255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10883a(InterfaceC0701e interfaceC0701e, int i) {
            super(2);
            this.f70255a = interfaceC0701e;
            this.f70256b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pc1.Box(this.f70255a, zl2Var, tsd.updateChangedFlags(this.f70256b | 1));
        }
    }

    /* JADX INFO: renamed from: pc1$b */
    public static final class C10884b implements uba {

        /* JADX INFO: renamed from: a */
        public static final C10884b f70257a = new C10884b();

        /* JADX INFO: renamed from: pc1$b$a */
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f70258a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
            }
        }

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30765getMinWidthimpl(j), ku2.m30764getMinHeightimpl(j), null, a.f70258a, 4, null);
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@gib InterfaceC0701e interfaceC0701e, @gib InterfaceC9407mm interfaceC9407mm, boolean z, @yfb kz6<? super sc1, ? super zl2, ? super Integer, bth> kz6Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC0701e = InterfaceC0701e.f5158d1;
        }
        if ((i2 & 2) != 0) {
            interfaceC9407mm = InterfaceC9407mm.f61437a.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        uba ubaVarMaybeCachedBoxMeasurePolicy = maybeCachedBoxMeasurePolicy(interfaceC9407mm, z);
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
        twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarMaybeCachedBoxMeasurePolicy, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        kz6Var.invoke(C0629e.f4557a, zl2Var, Integer.valueOf(((i >> 6) & 112) | 6));
        zl2Var.endNode();
    }

    private static final HashMap<InterfaceC9407mm, uba> cacheFor(boolean z) {
        HashMap<InterfaceC9407mm, uba> map = new HashMap<>(9);
        InterfaceC9407mm.a aVar = InterfaceC9407mm.f61437a;
        cacheFor$lambda$1$putAlignment(map, z, aVar.getTopStart());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getTopCenter());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getTopEnd());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getCenterStart());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getCenter());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getCenterEnd());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getBottomStart());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getBottomCenter());
        cacheFor$lambda$1$putAlignment(map, z, aVar.getBottomEnd());
        return map;
    }

    private static final void cacheFor$lambda$1$putAlignment(HashMap<InterfaceC9407mm, uba> map, boolean z, InterfaceC9407mm interfaceC9407mm) {
        map.put(interfaceC9407mm, new qc1(interfaceC9407mm, z));
    }

    private static final oc1 getBoxChildDataNode(rba rbaVar) {
        Object parentData = rbaVar.getParentData();
        if (parentData instanceof oc1) {
            return (oc1) parentData;
        }
        return null;
    }

    @yfb
    public static final uba getEmptyBoxMeasurePolicy() {
        return f70254d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(rba rbaVar) {
        oc1 boxChildDataNode = getBoxChildDataNode(rbaVar);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    @yfb
    @yjd
    public static final uba maybeCachedBoxMeasurePolicy(@yfb InterfaceC9407mm interfaceC9407mm, boolean z) {
        uba ubaVar = (z ? f70251a : f70252b).get(interfaceC9407mm);
        return ubaVar == null ? new qc1(interfaceC9407mm, z) : ubaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(AbstractC0767t.a aVar, AbstractC0767t abstractC0767t, rba rbaVar, ov8 ov8Var, int i, int i2, InterfaceC9407mm interfaceC9407mm) {
        InterfaceC9407mm alignment;
        oc1 boxChildDataNode = getBoxChildDataNode(rbaVar);
        AbstractC0767t.a.m27711place70tqf50$default(aVar, abstractC0767t, ((boxChildDataNode == null || (alignment = boxChildDataNode.getAlignment()) == null) ? interfaceC9407mm : alignment).mo30996alignKFBX0sM(s78.IntSize(abstractC0767t.getWidth(), abstractC0767t.getHeight()), s78.IntSize(i, i2), ov8Var), 0.0f, 2, null);
    }

    @yfb
    @hk2
    @yjd
    public static final uba rememberBoxMeasurePolicy(@yfb InterfaceC9407mm interfaceC9407mm, boolean z, @gib zl2 zl2Var, int i) {
        uba ubaVar;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");
        }
        if (!md8.areEqual(interfaceC9407mm, InterfaceC9407mm.f61437a.getTopStart()) || z) {
            zl2Var.startReplaceGroup(-1710100211);
            boolean z2 = ((((i & 14) ^ 6) > 4 && zl2Var.changed(interfaceC9407mm)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && zl2Var.changed(z)) || (i & 48) == 32);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new qc1(interfaceC9407mm, z);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            ubaVar = (qc1) objRememberedValue;
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(-1710139705);
            zl2Var.endReplaceGroup();
            ubaVar = f70253c;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return ubaVar;
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void Box(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-211209833);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            uba ubaVar = f70254d;
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2VarStartRestartGroup, 0);
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2VarStartRestartGroup, interfaceC0701e);
            qn2 currentCompositionLocalMap = zl2VarStartRestartGroup.getCurrentCompositionLocalMap();
            xl2.C15179a c15179a = xl2.f98343p;
            ny6<xl2> constructor = c15179a.getConstructor();
            if (zl2VarStartRestartGroup.getApplier() == null) {
                dl2.invalidApplier();
            }
            zl2VarStartRestartGroup.startReusableNode();
            if (zl2VarStartRestartGroup.getInserting()) {
                zl2VarStartRestartGroup.createNode(constructor);
            } else {
                zl2VarStartRestartGroup.useNode();
            }
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2VarStartRestartGroup);
            twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVar, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            zl2VarStartRestartGroup.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10883a(interfaceC0701e, i));
        }
    }
}
