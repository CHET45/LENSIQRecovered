package p000;

import androidx.lifecycle.AbstractC1143j;
import androidx.mediarouter.media.C1340j;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2:109\n74#2:116\n74#2:117\n1116#3,6:110\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n49#1:109\n81#1:116\n105#1:117\n57#1:110,6\n*E\n"})
public final class as4 {

    /* JADX INFO: renamed from: as4$a */
    public static final class C1584a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f11730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1143j.b f11731b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<bth> f11732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1584a(g59 g59Var, AbstractC1143j.b bVar, ny6<bth> ny6Var) {
            super(0);
            this.f11730a = g59Var;
            this.f11731b = bVar;
            this.f11732c = ny6Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f11730a.getLifecycle().getCurrentState().isAtLeast(this.f11731b)) {
                this.f11732c.invoke();
            }
        }
    }

    @yfb
    @yx1
    @hk2
    public static final ny6<bth> dropUnlessResumed(@gib g59 g59Var, @yfb ny6<bth> ny6Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(1331131589);
        if ((i2 & 1) != 0) {
            g59Var = (g59) zl2Var.consume(nd9.getLocalLifecycleOwner());
        }
        g59 g59Var2 = g59Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1331131589, i, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:106)");
        }
        int i3 = i << 3;
        ny6<bth> ny6VarDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(AbstractC1143j.b.RESUMED, g59Var2, ny6Var, zl2Var, (i3 & 112) | 6 | (i3 & C1340j.f10444b), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return ny6VarDropUnlessStateIsAtLeast;
    }

    @yfb
    @yx1
    @hk2
    public static final ny6<bth> dropUnlessStarted(@gib g59 g59Var, @yfb ny6<bth> ny6Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(1207869935);
        if ((i2 & 1) != 0) {
            g59Var = (g59) zl2Var.consume(nd9.getLocalLifecycleOwner());
        }
        g59 g59Var2 = g59Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1207869935, i, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:82)");
        }
        int i3 = i << 3;
        ny6<bth> ny6VarDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(AbstractC1143j.b.STARTED, g59Var2, ny6Var, zl2Var, (i3 & 112) | 6 | (i3 & C1340j.f10444b), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return ny6VarDropUnlessStateIsAtLeast;
    }

    @yx1
    @hk2
    private static final ny6<bth> dropUnlessStateIsAtLeast(AbstractC1143j.b bVar, g59 g59Var, ny6<bth> ny6Var, zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(-2057956404);
        if ((i2 & 2) != 0) {
            g59Var = (g59) zl2Var.consume(nd9.getLocalLifecycleOwner());
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-2057956404, i, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:50)");
        }
        if (bVar == AbstractC1143j.b.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        zl2Var.startReplaceableGroup(565432844);
        boolean zChangedInstance = zl2Var.changedInstance(g59Var) | ((((i & 14) ^ 6) > 4 && zl2Var.changed(bVar)) || (i & 6) == 4) | ((((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(ny6Var)) || (i & 384) == 256);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C1584a(g59Var, bVar, ny6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        ny6<bth> ny6Var2 = (ny6) objRememberedValue;
        zl2Var.endReplaceableGroup();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return ny6Var2;
    }
}
