package p000;

import java.util.Arrays;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,497:1\n1223#2,6:498\n1223#2,6:504\n1223#2,6:510\n1223#2,6:520\n1223#2,6:526\n1223#2,6:532\n1223#2,6:538\n1223#2,6:548\n1223#2,6:554\n86#3,4:516\n86#3,4:544\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n157#1:498,6\n197#1:504,6\n238#1:510,6\n278#1:520,6\n340#1:526,6\n363#1:532,6\n387#1:538,6\n420#1:548,6\n490#1:554,6\n278#1:516,4\n420#1:544,4\n*E\n"})
public final class jx4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final wf4 f52168a = new wf4();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f52169b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f52170c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: jx4$a */
    public static final class C8133a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<x13, zy2<? super bth>, Object> f52171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f52172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8133a(gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, int i) {
            super(2);
            this.f52171a = gz6Var;
            this.f52172b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            jx4.LaunchedEffect(this.f52171a, zl2Var, tsd.updateChangedFlags(this.f52172b | 1));
        }
    }

    /* JADX INFO: renamed from: jx4$b */
    @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,497:1\n*E\n"})
    public static final class C8134b extends tt8 implements ny6<a05> {

        /* JADX INFO: renamed from: a */
        public static final C8134b f52173a = new C8134b();

        public C8134b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final a05 invoke() {
            return a05.f2a;
        }
    }

    @hk2
    @q64(level = u64.f86866b, message = f52169b)
    public static final void DisposableEffect(@yfb qy6<? super wf4, ? extends vf4> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException(f52169b);
    }

    @hk2
    @q64(level = u64.f86866b, message = f52170c)
    public static final void LaunchedEffect(@yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-805415771);
        if ((i & 1) != 0 || !zl2VarStartRestartGroup.getSkipping()) {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
            }
            throw new IllegalStateException(f52170c);
        }
        zl2VarStartRestartGroup.skipToGroupEnd();
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C8133a(gz6Var, i));
        }
    }

    @hk2
    public static final void SideEffect(@yfb ny6<bth> ny6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        zl2Var.recordSideEffect(ny6Var);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @yfb
    @yjd
    public static final x13 createCompositionCoroutineScope(@yfb e13 e13Var, @yfb zl2 zl2Var) {
        jj8.C7917b c7917b = jj8.f50715A;
        if (e13Var.get(c7917b) == null) {
            e13 applyCoroutineContext = zl2Var.getApplyCoroutineContext();
            return y13.CoroutineScope(applyCoroutineContext.plus(oj8.Job((jj8) applyCoroutineContext.get(c7917b))).plus(e13Var));
        }
        jg2 jg2VarJob$default = qj8.Job$default((jj8) null, 1, (Object) null);
        jg2VarJob$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return y13.CoroutineScope(jg2VarJob$default);
    }

    @yfb
    @hk2
    public static final x13 rememberCoroutineScope(@gib ny6<? extends e13> ny6Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            ny6Var = C8134b.f52173a;
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new xn2(createCompositionCoroutineScope(ny6Var.invoke(), zl2Var));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        return ((xn2) objRememberedValue).getCoroutineScope();
    }

    @hk2
    public static final void DisposableEffect(@gib Object obj, @yfb qy6<? super wf4, ? extends vf4> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zChanged = zl2Var.changed(obj);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new uf4(qy6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void LaunchedEffect(@gib Object obj, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        e13 applyCoroutineContext = zl2Var.getApplyCoroutineContext();
        boolean zChanged = zl2Var.changed(obj);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new su8(applyCoroutineContext, gz6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void DisposableEffect(@gib Object obj, @gib Object obj2, @yfb qy6<? super wf4, ? extends vf4> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new uf4(qy6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void LaunchedEffect(@gib Object obj, @gib Object obj2, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        e13 applyCoroutineContext = zl2Var.getApplyCoroutineContext();
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new su8(applyCoroutineContext, gz6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void DisposableEffect(@gib Object obj, @gib Object obj2, @gib Object obj3, @yfb qy6<? super wf4, ? extends vf4> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2) | zl2Var.changed(obj3);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new uf4(qy6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void LaunchedEffect(@gib Object obj, @gib Object obj2, @gib Object obj3, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        e13 applyCoroutineContext = zl2Var.getApplyCoroutineContext();
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2) | zl2Var.changed(obj3);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new su8(applyCoroutineContext, gz6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void DisposableEffect(@yfb Object[] objArr, @yfb qy6<? super wf4, ? extends vf4> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= zl2Var.changed(obj);
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            zl2Var.updateRememberedValue(new uf4(qy6Var));
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @hk2
    public static final void LaunchedEffect(@yfb Object[] objArr, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        e13 applyCoroutineContext = zl2Var.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= zl2Var.changed(obj);
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            zl2Var.updateRememberedValue(new su8(applyCoroutineContext, gz6Var));
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }
}
