package p000;

import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
public final class pn0 {

    /* JADX INFO: renamed from: pn0$a */
    public static final class C11030a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11033d f71459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f71460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11030a(C11033d c11033d, boolean z) {
            super(0);
            this.f71459a = c11033d;
            this.f71460b = z;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f71459a.setEnabled(this.f71460b);
        }
    }

    /* JADX INFO: renamed from: pn0$b */
    @dwf({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"})
    public static final class C11031b extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w1c f71461a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f71462b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C11033d f71463c;

        /* JADX INFO: renamed from: pn0$b$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11033d f71464a;

            public a(C11033d c11033d) {
                this.f71464a = c11033d;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f71464a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11031b(w1c w1cVar, g59 g59Var, C11033d c11033d) {
            super(1);
            this.f71461a = w1cVar;
            this.f71462b = g59Var;
            this.f71463c = c11033d;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f71461a.addCallback(this.f71462b, this.f71463c);
            return new a(this.f71463c);
        }
    }

    /* JADX INFO: renamed from: pn0$c */
    public static final class C11032c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f71465a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f71466b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71467c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f71468d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11032c(boolean z, ny6<bth> ny6Var, int i, int i2) {
            super(2);
            this.f71465a = z;
            this.f71466b = ny6Var;
            this.f71467c = i;
            this.f71468d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pn0.BackHandler(this.f71465a, this.f71466b, zl2Var, this.f71467c | 1, this.f71468d);
        }
    }

    /* JADX INFO: renamed from: pn0$d */
    public static final class C11033d extends v1c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<ny6<bth>> f71469a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11033d(boolean z, i2g<? extends ny6<bth>> i2gVar) {
            super(z);
            this.f71469a = i2gVar;
        }

        @Override // p000.v1c
        public void handleOnBackPressed() {
            pn0.BackHandler$lambda$0(this.f71469a).invoke();
        }
    }

    @hk2
    public static final void BackHandler(boolean z, @yfb ny6<bth> ny6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(ny6Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z = true;
            }
            i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(ny6Var, zl2VarStartRestartGroup, (i3 >> 3) & 14);
            zl2VarStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = new C11033d(z, i2gVarRememberUpdatedState);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            zl2VarStartRestartGroup.endReplaceableGroup();
            C11033d c11033d = (C11033d) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(z);
            zl2VarStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged = zl2VarStartRestartGroup.changed(boolValueOf) | zl2VarStartRestartGroup.changed(c11033d);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new C11030a(c11033d, z);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            zl2VarStartRestartGroup.endReplaceableGroup();
            jx4.SideEffect((ny6) objRememberedValue2, zl2VarStartRestartGroup, 0);
            z1c current = pd9.f70491a.getCurrent(zl2VarStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            w1c onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            g59 g59Var = (g59) zl2VarStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            jx4.DisposableEffect(g59Var, onBackPressedDispatcher, new C11031b(onBackPressedDispatcher, g59Var, c11033d), zl2VarStartRestartGroup, 72);
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup == null) {
            return;
        }
        areVarEndRestartGroup.updateScope(new C11032c(z, ny6Var, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ny6<bth> BackHandler$lambda$0(i2g<? extends ny6<bth>> i2gVar) {
        return i2gVar.getValue();
    }
}
