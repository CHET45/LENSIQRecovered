package p000;

import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n25#3:188\n955#4,3:178\n958#4,3:184\n955#4,6:189\n473#5:183\n76#6:195\n89#7:196\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n81#1:188\n79#1:178,3\n79#1:184,3\n81#1:189,6\n79#1:183\n135#1:195\n78#1:196\n*E\n"})
public final class q8d {

    /* JADX INFO: renamed from: q8d$a */
    @ck3(m4009c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", m4010f = "PredictiveBackHandler.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11380a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f73612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C11383d f73613b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f73614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11380a(C11383d c11383d, boolean z, zy2<? super C11380a> zy2Var) {
            super(2, zy2Var);
            this.f73613b = c11383d;
            this.f73614c = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C11380a(this.f73613b, this.f73614c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11380a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f73612a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            this.f73613b.setEnabled(this.f73614c);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: q8d$b */
    @dwf({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,172:1\n62#2,5:173\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n*L\n140#1:173,5\n*E\n"})
    public static final class C11381b extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w1c f73615a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f73616b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C11383d f73617c;

        /* JADX INFO: renamed from: q8d$b$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n*L\n1#1,483:1\n141#2,2:484\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11383d f73618a;

            public a(C11383d c11383d) {
                this.f73618a = c11383d;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f73618a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11381b(w1c w1cVar, g59 g59Var, C11383d c11383d) {
            super(1);
            this.f73615a = w1cVar;
            this.f73616b = g59Var;
            this.f73617c = c11383d;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f73615a.addCallback(this.f73616b, this.f73617c);
            return new a(this.f73617c);
        }
    }

    /* JADX INFO: renamed from: q8d$c */
    public static final class C11382c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f73619a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<y56<on0>, zy2<bth>, Object> f73620b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f73621c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f73622d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11382c(boolean z, gz6<y56<on0>, ? super zy2<bth>, ? extends Object> gz6Var, int i, int i2) {
            super(2);
            this.f73619a = z;
            this.f73620b = gz6Var;
            this.f73621c = i;
            this.f73622d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            q8d.PredictiveBackHandler(this.f73619a, this.f73620b, zl2Var, this.f73621c | 1, this.f73622d);
        }
    }

    /* JADX INFO: renamed from: q8d$d */
    public static final class C11383d extends v1c {

        /* JADX INFO: renamed from: a */
        @gib
        public u1c f73623a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x13 f73624b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<gz6<y56<on0>, zy2<bth>, Object>> f73625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11383d(boolean z, x13 x13Var, i2g<? extends gz6<y56<on0>, ? super zy2<bth>, ? extends Object>> i2gVar) {
            super(z);
            this.f73624b = x13Var;
            this.f73625c = i2gVar;
        }

        @gib
        public final u1c getOnBackInstance() {
            return this.f73623a;
        }

        @Override // p000.v1c
        public void handleOnBackCancelled() {
            super.handleOnBackCancelled();
            u1c u1cVar = this.f73623a;
            if (u1cVar != null) {
                u1cVar.cancel();
            }
        }

        @Override // p000.v1c
        public void handleOnBackPressed() {
            u1c u1cVar = this.f73623a;
            if (u1cVar != null && !u1cVar.isPredictiveBack()) {
                u1cVar.cancel();
                this.f73623a = null;
            }
            if (this.f73623a == null) {
                this.f73623a = new u1c(this.f73624b, false, q8d.PredictiveBackHandler$lambda$0(this.f73625c));
            }
            u1c u1cVar2 = this.f73623a;
            if (u1cVar2 != null) {
                u1cVar2.close();
            }
        }

        @Override // p000.v1c
        public void handleOnBackProgressed(@yfb on0 on0Var) {
            super.handleOnBackProgressed(on0Var);
            u1c u1cVar = this.f73623a;
            if (u1cVar != null) {
                xu1.m33272boximpl(u1cVar.m32522sendJP2dKIU(on0Var));
            }
        }

        @Override // p000.v1c
        public void handleOnBackStarted(@yfb on0 on0Var) {
            super.handleOnBackStarted(on0Var);
            u1c u1cVar = this.f73623a;
            if (u1cVar != null) {
                u1cVar.cancel();
            }
            this.f73623a = new u1c(this.f73624b, true, q8d.PredictiveBackHandler$lambda$0(this.f73625c));
        }

        public final void setOnBackInstance(@gib u1c u1cVar) {
            this.f73623a = u1cVar;
        }
    }

    @hk2
    public static final void PredictiveBackHandler(boolean z, @yfb gz6<y56<on0>, ? super zy2<bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-642000585);
        if ((i2 & 1) != 0) {
            z = true;
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(gz6Var, zl2VarStartRestartGroup, 8);
        zl2VarStartRestartGroup.startReplaceableGroup(-723524056);
        zl2VarStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            xn2 xn2Var = new xn2(jx4.createCompositionCoroutineScope(a05.f2a, zl2VarStartRestartGroup));
            zl2VarStartRestartGroup.updateRememberedValue(xn2Var);
            objRememberedValue = xn2Var;
        }
        zl2VarStartRestartGroup.endReplaceableGroup();
        x13 coroutineScope = ((xn2) objRememberedValue).getCoroutineScope();
        zl2VarStartRestartGroup.endReplaceableGroup();
        zl2VarStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C11383d(z, coroutineScope, i2gVarRememberUpdatedState);
            zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        zl2VarStartRestartGroup.endReplaceableGroup();
        C11383d c11383d = (C11383d) objRememberedValue2;
        jx4.LaunchedEffect(Boolean.valueOf(z), new C11380a(c11383d, z, null), zl2VarStartRestartGroup, (i & 14) | 64);
        z1c current = pd9.f70491a.getCurrent(zl2VarStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
        }
        w1c onBackPressedDispatcher = current.getOnBackPressedDispatcher();
        g59 g59Var = (g59) zl2VarStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        jx4.DisposableEffect(g59Var, onBackPressedDispatcher, new C11381b(onBackPressedDispatcher, g59Var, c11383d), zl2VarStartRestartGroup, 72);
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup == null) {
            return;
        }
        areVarEndRestartGroup.updateScope(new C11382c(z, gz6Var, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gz6<y56<on0>, zy2<bth>, Object> PredictiveBackHandler$lambda$0(i2g<? extends gz6<y56<on0>, ? super zy2<bth>, ? extends Object>> i2gVar) {
        return (gz6) i2gVar.getValue();
    }
}
