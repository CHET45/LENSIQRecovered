package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.mediarouter.media.C1340j;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p000.xl2;

/* JADX INFO: renamed from: cs */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n77#2:479\n77#2:480\n77#2:481\n1223#3,6:482\n1223#3,6:488\n1223#3,6:494\n78#4,6:500\n85#4,4:515\n89#4,2:525\n93#4:530\n368#5,9:506\n377#5,3:527\n4032#6,6:519\n81#7:531\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n168#1:479\n169#1:480\n170#1:481\n174#1:482,6\n195#1:488,6\n204#1:494,6\n466#1:500,6\n466#1:515,4\n466#1:525,2\n466#1:530\n466#1:506,9\n466#1:527,3\n466#1:519,6\n172#1:531\n*E\n"})
public final class C4472cs {

    /* JADX INFO: renamed from: cs$a */
    @dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,478:1\n64#2,5:479\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1\n*L\n198#1:479,5\n*E\n"})
    public static final class a extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pc4 f27158a;

        /* JADX INFO: renamed from: cs$a$a, reason: collision with other inner class name */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1\n*L\n1#1,497:1\n199#2,3:498\n*E\n"})
        public static final class C16425a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ pc4 f27159a;

            public C16425a(pc4 pc4Var) {
                this.f27159a = pc4Var;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f27159a.dismiss();
                this.f27159a.disposeComposition();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc4 pc4Var) {
            super(1);
            this.f27158a = pc4Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f27158a.show();
            return new C16425a(this.f27158a);
        }
    }

    /* JADX INFO: renamed from: cs$b */
    public static final class b extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pc4 f27160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f27161b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rb4 f27162c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ov8 f27163d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pc4 pc4Var, ny6<bth> ny6Var, rb4 rb4Var, ov8 ov8Var) {
            super(0);
            this.f27160a = pc4Var;
            this.f27161b = ny6Var;
            this.f27162c = rb4Var;
            this.f27163d = ov8Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f27160a.updateParameters(this.f27161b, this.f27162c, this.f27163d);
        }
    }

    /* JADX INFO: renamed from: cs$c */
    public static final class c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f27164a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rb4 f27165b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zl2, Integer, bth> f27166c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f27167d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f27168e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ny6<bth> ny6Var, rb4 rb4Var, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f27164a = ny6Var;
            this.f27165b = rb4Var;
            this.f27166c = gz6Var;
            this.f27167d = i;
            this.f27168e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C4472cs.Dialog(this.f27164a, this.f27165b, this.f27166c, zl2Var, tsd.updateChangedFlags(this.f27167d | 1), this.f27168e);
        }
    }

    /* JADX INFO: renamed from: cs$d */
    public static final class d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<gz6<zl2, Integer, bth>> f27169a;

        /* JADX INFO: renamed from: cs$d$a */
        public static final class a extends tt8 implements qy6<eye, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f27170a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
                invoke2(eyeVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb eye eyeVar) {
                bye.dialog(eyeVar);
            }
        }

        /* JADX INFO: renamed from: cs$d$b */
        public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<gz6<zl2, Integer, bth>> f27171a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
                super(2);
                this.f27171a = i2gVar;
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
                    gm2.traceEventStart(-533674951, i, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                C4472cs.Dialog$lambda$0(this.f27171a).invoke(zl2Var, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
            super(2);
            this.f27169a = i2gVar;
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
                gm2.traceEventStart(488261145, i, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
            }
            C4472cs.DialogLayout(qxe.semantics$default(InterfaceC0701e.f5158d1, false, a.f27170a, 1, null), mk2.rememberComposableLambda(-533674951, true, new b(this.f27169a), zl2Var, 54), zl2Var, 48, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: cs$e */
    public static final class e extends tt8 implements ny6<UUID> {

        /* JADX INFO: renamed from: a */
        public static final e f27172a = new e();

        public e() {
            super(0);
        }

        @Override // p000.ny6
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: renamed from: cs$f */
    @dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,478:1\n151#2,3:479\n33#2,4:482\n154#2,2:486\n38#2:488\n156#2:489\n171#2,13:490\n171#2,13:503\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n470#1:479,3\n470#1:482,4\n470#1:486,2\n470#1:488\n470#1:489\n471#1:490,13\n472#1:503,13\n*E\n"})
    public static final class f implements uba {

        /* JADX INFO: renamed from: a */
        public static final f f27173a = new f();

        /* JADX INFO: renamed from: cs$f$a */
        @dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,478:1\n33#2,6:479\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n*L\n474#1:479,6\n*E\n"})
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<AbstractC0767t> f27174a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends AbstractC0767t> list) {
                super(1);
                this.f27174a = list;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                List<AbstractC0767t> list = this.f27174a;
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
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).mo27949measureBRTryo0(j));
            }
            Object obj2 = null;
            int i2 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int width = ((AbstractC0767t) obj).getWidth();
                int lastIndex = l82.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i3 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i3);
                        int width2 = ((AbstractC0767t) obj3).getWidth();
                        if (width < width2) {
                            obj = obj3;
                            width = width2;
                        }
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            AbstractC0767t abstractC0767t = (AbstractC0767t) obj;
            int width3 = abstractC0767t != null ? abstractC0767t.getWidth() : ku2.m30765getMinWidthimpl(j);
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int height = ((AbstractC0767t) obj4).getHeight();
                int lastIndex2 = l82.getLastIndex(arrayList);
                if (1 <= lastIndex2) {
                    while (true) {
                        Object obj5 = arrayList.get(i2);
                        int height2 = ((AbstractC0767t) obj5).getHeight();
                        if (height < height2) {
                            obj4 = obj5;
                            height = height2;
                        }
                        if (i2 == lastIndex2) {
                            break;
                        }
                        i2++;
                    }
                }
                obj2 = obj4;
            }
            AbstractC0767t abstractC0767t2 = (AbstractC0767t) obj2;
            return InterfaceC0761n.layout$default(interfaceC0761n, width3, abstractC0767t2 != null ? abstractC0767t2.getHeight() : ku2.m30764getMinHeightimpl(j), null, new a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: cs$g */
    public static final class g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f27175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f27176b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f27177c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f27178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f27175a = interfaceC0701e;
            this.f27176b = gz6Var;
            this.f27177c = i;
            this.f27178d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C4472cs.DialogLayout(this.f27175a, this.f27176b, zl2Var, tsd.updateChangedFlags(this.f27177c | 1), this.f27178d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Dialog(@p000.yfb p000.ny6<p000.bth> r23, @p000.gib p000.rb4 r24, @p000.yfb p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth> r25, @p000.gib p000.zl2 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4472cs.Dialog(ny6, rb4, gz6, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gz6<zl2, Integer, bth> Dialog$lambda$0(i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
        return (gz6) i2gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DialogLayout(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1177876616);
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
                gm2.traceEventStart(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f27173a;
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
            twh.m32456setimpl(zl2VarM32449constructorimpl, fVar, c15179a.getSetMeasurePolicy());
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
            areVarEndRestartGroup.updateScope(new g(interfaceC0701e, gz6Var, i, i2));
        }
    }
}
