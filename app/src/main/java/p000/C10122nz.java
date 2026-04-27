package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C9041lz;
import p000.xl2;

/* JADX INFO: renamed from: nz */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n33#2,6:90\n33#2,4:96\n38#2:134\n78#3:100\n76#3,8:101\n85#3,4:118\n89#3,2:128\n93#3:133\n368#4,9:109\n377#4,3:130\n4032#5,6:122\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n46#1:90,6\n75#1:96,4\n75#1:134\n76#1:100\n76#1:101,8\n76#1:118,4\n76#1:128,2\n76#1:133\n76#1:109,9\n76#1:130,3\n76#1:122,6\n*E\n"})
public final class C10122nz {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final scc<List<C9041lz.c<ewc>>, List<C9041lz.c<kz6<String, zl2, Integer, bth>>>> f66101a = new scc<>(l82.emptyList(), l82.emptyList());

    /* JADX INFO: renamed from: nz$a */
    @dwf({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n151#2,3:90\n33#2,4:93\n154#2,2:97\n38#2:99\n156#2:100\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n*L\n79#1:90,3\n79#1:93,4\n79#1:97,2\n79#1:99\n79#1:100\n*E\n"})
    public static final class a implements uba {

        /* JADX INFO: renamed from: a */
        public static final a f66102a = new a();

        /* JADX INFO: renamed from: nz$a$a, reason: collision with other inner class name */
        @dwf({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n33#2,6:90\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n*L\n81#1:90,6\n*E\n"})
        public static final class C16495a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<AbstractC0767t> f66103a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C16495a(List<? extends AbstractC0767t> list) {
                super(1);
                this.f66103a = list;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                List<AbstractC0767t> list = this.f66103a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0767t.a.placeRelative$default(aVar, list.get(i), 0, 0, 0.0f, 4, null);
                }
            }
        }

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).mo27949measureBRTryo0(j));
            }
            return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30763getMaxWidthimpl(j), ku2.m30762getMaxHeightimpl(j), null, new C16495a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: nz$b */
    public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9041lz f66104a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<C9041lz.c<kz6<String, zl2, Integer, bth>>> f66105b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f66106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9041lz c9041lz, List<C9041lz.c<kz6<String, zl2, Integer, bth>>> list, int i) {
            super(2);
            this.f66104a = c9041lz;
            this.f66105b = list;
            this.f66106c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C10122nz.InlineChildren(this.f66104a, this.f66105b, zl2Var, tsd.updateChangedFlags(this.f66106c | 1));
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@yfb C9041lz c9041lz, @yfb List<C9041lz.c<kz6<String, zl2, Integer, bth>>> list, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1794596951);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(c9041lz) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                C9041lz.c<kz6<String, zl2, Integer, bth>> cVar = list.get(i4);
                kz6<String, zl2, Integer, bth> kz6VarComponent1 = cVar.component1();
                int iComponent2 = cVar.component2();
                int iComponent3 = cVar.component3();
                a aVar = a.f66102a;
                InterfaceC0701e.a aVar2 = InterfaceC0701e.f5158d1;
                int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2VarStartRestartGroup, i3);
                qn2 currentCompositionLocalMap = zl2VarStartRestartGroup.getCurrentCompositionLocalMap();
                InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2VarStartRestartGroup, aVar2);
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
                twh.m32456setimpl(zl2VarM32449constructorimpl, aVar, c15179a.getSetMeasurePolicy());
                twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
                gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
                if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
                kz6VarComponent1.invoke(c9041lz.subSequence(iComponent2, iComponent3).getText(), zl2VarStartRestartGroup, 0);
                zl2VarStartRestartGroup.endNode();
                i4++;
                i3 = 0;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new b(c9041lz, list, i));
        }
    }

    public static final boolean hasInlineContent(@yfb C9041lz c9041lz) {
        return c9041lz.hasStringAnnotations(a38.f267a, 0, c9041lz.getText().length());
    }

    @yfb
    public static final scc<List<C9041lz.c<ewc>>, List<C9041lz.c<kz6<String, zl2, Integer, bth>>>> resolveInlineContent(@yfb C9041lz c9041lz, @gib Map<String, z28> map) {
        if (map == null || map.isEmpty()) {
            return f66101a;
        }
        List<C9041lz.c<String>> stringAnnotations = c9041lz.getStringAnnotations(a38.f267a, 0, c9041lz.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<String> cVar = stringAnnotations.get(i);
            z28 z28Var = map.get(cVar.getItem());
            if (z28Var != null) {
                arrayList.add(new C9041lz.c(z28Var.getPlaceholder(), cVar.getStart(), cVar.getEnd()));
                arrayList2.add(new C9041lz.c(z28Var.getChildren(), cVar.getStart(), cVar.getEnd()));
            }
        }
        return new scc<>(arrayList, arrayList2);
    }
}
