package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.mediarouter.media.C1340j;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,415:1\n33#2,6:416\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n*L\n235#1:416,6\n*E\n"})
@e0g(parameters = 1)
public final class vx2 {

    /* JADX INFO: renamed from: b */
    public static final int f92530b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ytf<kz6<qx2, zl2, Integer, bth>> f92531a = stf.mutableStateListOf();

    /* JADX INFO: renamed from: vx2$a */
    public static final class C14284a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qx2 f92533b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f92534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14284a(qx2 qx2Var, int i) {
            super(2);
            this.f92533b = qx2Var;
            this.f92534c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            vx2.this.Content$foundation_release(this.f92533b, zl2Var, tsd.updateChangedFlags(this.f92534c | 1));
        }
    }

    /* JADX INFO: renamed from: vx2$b */
    @dwf({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope$item$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
    public static final class C14285b extends tt8 implements kz6<qx2, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<zl2, Integer, String> f92535a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f92536b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92537c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<w82, zl2, Integer, bth> f92538d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ny6<bth> f92539e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14285b(gz6<? super zl2, ? super Integer, String> gz6Var, boolean z, InterfaceC0701e interfaceC0701e, kz6<? super w82, ? super zl2, ? super Integer, bth> kz6Var, ny6<bth> ny6Var) {
            super(3);
            this.f92535a = gz6Var;
            this.f92536b = z;
            this.f92537c = interfaceC0701e;
            this.f92538d = kz6Var;
            this.f92539e = ny6Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(qx2 qx2Var, zl2 zl2Var, Integer num) {
            invoke(qx2Var, zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@yfb qx2 qx2Var, @gib zl2 zl2Var, int i) {
            if ((i & 6) == 0) {
                i |= zl2Var.changed(qx2Var) ? 4 : 2;
            }
            if ((i & 19) == 18 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(262103052, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            String strInvoke = this.f92535a.invoke(zl2Var, 0);
            if (m9g.isBlank(strInvoke)) {
                throw new IllegalStateException("Label must not be blank");
            }
            zx2.ContextMenuItem(strInvoke, this.f92536b, qx2Var, this.f92537c, this.f92538d, this.f92539e, zl2Var, (i << 6) & C1340j.f10444b, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void item$default(vx2 vx2Var, gz6 gz6Var, InterfaceC0701e interfaceC0701e, boolean z, kz6 kz6Var, ny6 ny6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC0701e = InterfaceC0701e.f5158d1;
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            kz6Var = null;
        }
        vx2Var.item(gz6Var, interfaceC0701e2, z2, kz6Var, ny6Var);
    }

    @hk2
    public final void Content$foundation_release(@yfb qx2 qx2Var, @gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1320309496);
        int i2 = (i & 6) == 0 ? (zl2VarStartRestartGroup.changed(qx2Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1320309496, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            ytf<kz6<qx2, zl2, Integer, bth>> ytfVar = this.f92531a;
            int size = ytfVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ytfVar.get(i3).invoke(qx2Var, zl2VarStartRestartGroup, Integer.valueOf(i2 & 14));
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C14284a(qx2Var, i));
        }
    }

    public final void clear$foundation_release() {
        this.f92531a.clear();
    }

    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void item(@yfb gz6<? super zl2, ? super Integer, String> gz6Var, @yfb InterfaceC0701e interfaceC0701e, boolean z, @gib kz6<? super w82, ? super zl2, ? super Integer, bth> kz6Var, @yfb ny6<bth> ny6Var) {
        this.f92531a.add(mk2.composableLambdaInstance(262103052, true, new C14285b(gz6Var, z, interfaceC0701e, kz6Var, ny6Var)));
    }
}
