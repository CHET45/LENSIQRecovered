package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,424:1\n125#2:425\n152#2,3:426\n37#3,2:429\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n420#1:425\n420#1:426,3\n420#1:429,2\n*E\n"})
public final class pn2 {

    /* JADX INFO: renamed from: pn2$a */
    public static final class C11036a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ did<?>[] f71470a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f71471b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11036a(did<?>[] didVarArr, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f71470a = didVarArr;
            this.f71471b = gz6Var;
            this.f71472c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            did<?>[] didVarArr = this.f71470a;
            pn2.CompositionLocalProvider((did<?>[]) Arrays.copyOf(didVarArr, didVarArr.length), this.f71471b, zl2Var, tsd.updateChangedFlags(this.f71472c | 1));
        }
    }

    /* JADX INFO: renamed from: pn2$b */
    public static final class C11037b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ did<?> f71473a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f71474b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71475c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11037b(did<?> didVar, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f71473a = didVar;
            this.f71474b = gz6Var;
            this.f71475c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pn2.CompositionLocalProvider(this.f71473a, this.f71474b, zl2Var, tsd.updateChangedFlags(this.f71475c | 1));
        }
    }

    /* JADX INFO: renamed from: pn2$c */
    public static final class C11038c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ on2 f71476a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f71477b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11038c(on2 on2Var, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f71476a = on2Var;
            this.f71477b = gz6Var;
            this.f71478c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pn2.CompositionLocalProvider(this.f71476a, this.f71477b, zl2Var, tsd.updateChangedFlags(this.f71478c | 1));
        }
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@yfb did<?>[] didVarArr, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1390796515);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        zl2VarStartRestartGroup.startProviders(didVarArr);
        gz6Var.invoke(zl2VarStartRestartGroup, Integer.valueOf((i >> 3) & 14));
        zl2VarStartRestartGroup.endProviders();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11036a(didVarArr, gz6Var, i));
        }
    }

    @yfb
    public static final <T> zhd<T> compositionLocalOf(@yfb qtf<T> qtfVar, @yfb ny6<? extends T> ny6Var) {
        return new xu4(qtfVar, ny6Var);
    }

    public static /* synthetic */ zhd compositionLocalOf$default(qtf qtfVar, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qtfVar = stf.structuralEqualityPolicy();
        }
        return compositionLocalOf(qtfVar, ny6Var);
    }

    @yfb
    public static final <T> zhd<T> compositionLocalWithComputedDefaultOf(@yfb qy6<? super ln2, ? extends T> qy6Var) {
        return new to2(qy6Var);
    }

    @yfb
    public static final <T> zhd<T> staticCompositionLocalOf(@yfb ny6<? extends T> ny6Var) {
        return new y3g(ny6Var);
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@yfb did<?> didVar, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1350970552);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1350970552, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        zl2VarStartRestartGroup.startProvider(didVar);
        gz6Var.invoke(zl2VarStartRestartGroup, Integer.valueOf((i >> 3) & 14));
        zl2VarStartRestartGroup.endProvider();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11037b(didVar, gz6Var, i));
        }
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@yfb on2 on2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1853897736);
        int i2 = (i & 6) == 0 ? (zl2VarStartRestartGroup.changed(on2Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1853897736, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:417)");
            }
            qqc compositionLocals$runtime_release = on2Var.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<kn2<Object>, l2i<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            did[] didVarArr = (did[]) arrayList.toArray(new did[0]);
            CompositionLocalProvider((did<?>[]) Arrays.copyOf(didVarArr, didVarArr.length), gz6Var, zl2VarStartRestartGroup, i2 & 112);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11038c(on2Var, gz6Var, i));
        }
    }
}
