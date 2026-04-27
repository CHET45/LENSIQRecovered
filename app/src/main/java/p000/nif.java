package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.mediarouter.media.C1340j;
import java.util.ArrayList;
import java.util.List;
import p000.xl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,53:1\n78#2,6:54\n85#2,4:69\n89#2,2:79\n93#2:84\n368#3,9:60\n377#3,3:81\n4032#4,6:73\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n*L\n33#1:54,6\n33#1:69,4\n33#1:79,2\n33#1:84\n33#1:60,9\n33#1:81,3\n33#1:73,6\n*E\n"})
public final class nif {

    /* JADX INFO: renamed from: nif$a */
    @dwf({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,53:1\n151#2,3:54\n33#2,4:57\n154#2,2:61\n38#2:63\n156#2:64\n256#2,3:65\n33#2,4:68\n259#2,2:72\n38#2:74\n261#2:75\n256#2,3:76\n33#2,4:79\n259#2,2:83\n38#2:85\n261#2:86\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n*L\n34#1:54,3\n34#1:57,4\n34#1:61,2\n34#1:63\n34#1:64\n38#1:65,3\n38#1:68,4\n38#1:72,2\n38#1:74\n38#1:75\n42#1:76,3\n42#1:79,4\n42#1:83,2\n42#1:85\n42#1:86\n*E\n"})
    public static final class C9893a implements uba {

        /* JADX INFO: renamed from: a */
        public static final C9893a f64680a = new C9893a();

        /* JADX INFO: renamed from: nif$a$a */
        @dwf({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,53:1\n33#2,6:54\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1$1\n*L\n47#1:54,6\n*E\n"})
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<AbstractC0767t> f64681a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends AbstractC0767t> list) {
                super(1);
                this.f64681a = list;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                List<AbstractC0767t> list = this.f64681a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0767t.a.place$default(aVar, list.get(i), 0, 0, 0.0f, 4, null);
                }
            }
        }

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer numValueOf = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).mo27949measureBRTryo0(j));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i2 = 0; i2 < size2; i2++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((AbstractC0767t) arrayList.get(i2)).getWidth()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((AbstractC0767t) arrayList.get(i3)).getHeight()));
            }
            return InterfaceC0761n.layout$default(interfaceC0761n, iIntValue, numValueOf.intValue(), null, new a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: nif$b */
    public static final class C9894b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f64682a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f64683b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f64684c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f64685d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9894b(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f64682a = interfaceC0701e;
            this.f64683b = gz6Var;
            this.f64684c = i;
            this.f64685d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            nif.SimpleLayout(this.f64682a, this.f64683b, zl2Var, tsd.updateChangedFlags(this.f64684c | 1), this.f64685d);
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SimpleLayout(@gib InterfaceC0701e interfaceC0701e, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-2105228848);
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
        if ((i3 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-2105228848, i3, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            C9893a c9893a = C9893a.f64680a;
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2VarStartRestartGroup, 0);
            qn2 currentCompositionLocalMap = zl2VarStartRestartGroup.getCurrentCompositionLocalMap();
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2VarStartRestartGroup, interfaceC0701e);
            xl2.C15179a c15179a = xl2.f98343p;
            ny6<xl2> constructor = c15179a.getConstructor();
            int i6 = ((i5 << 6) & C1340j.f10444b) | 6;
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
            twh.m32456setimpl(zl2VarM32449constructorimpl, c9893a, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            gz6Var.invoke(zl2VarStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            zl2VarStartRestartGroup.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C9894b(interfaceC0701e, gz6Var, i, i2));
        }
    }
}
