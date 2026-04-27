package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n77#2:109\n1223#3,6:110\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:109\n46#1:110,6\n*E\n"})
public final class q19 {

    /* JADX INFO: renamed from: q19$a */
    public static final class C11264a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ p19 f72891a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<ple, zl2, Integer, bth> f72892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11264a(p19 p19Var, kz6<? super ple, ? super zl2, ? super Integer, bth> kz6Var) {
            super(2);
            this.f72891a = p19Var;
            this.f72892b = kz6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1863926504, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f72891a.setWrappedHolder(rle.rememberSaveableStateHolder(zl2Var, 0));
            this.f72892b.invoke(this.f72891a, zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: q19$b */
    public static final class C11265b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<ple, zl2, Integer, bth> f72893a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f72894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11265b(kz6<? super ple, ? super zl2, ? super Integer, bth> kz6Var, int i) {
            super(2);
            this.f72893a = kz6Var;
            this.f72894b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            q19.LazySaveableStateHolderProvider(this.f72893a, zl2Var, tsd.updateChangedFlags(this.f72894b | 1));
        }
    }

    /* JADX INFO: renamed from: q19$c */
    public static final class C11266c extends tt8 implements ny6<p19> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sle f72895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11266c(sle sleVar) {
            super(0);
            this.f72895a = sleVar;
        }

        @Override // p000.ny6
        @yfb
        public final p19 invoke() {
            return new p19(this.f72895a, xt9.emptyMap());
        }
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void LazySaveableStateHolderProvider(@yfb kz6<? super ple, ? super zl2, ? super Integer, bth> kz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(674185128);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(kz6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            sle sleVar = (sle) zl2VarStartRestartGroup.consume(ule.getLocalSaveableStateRegistry());
            Object[] objArr = {sleVar};
            dme<p19, Map<String, List<Object>>> dmeVarSaver = p19.f69392d.saver(sleVar);
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(sleVar);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C11266c(sleVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            p19 p19Var = (p19) gyd.rememberSaveable(objArr, (dme) dmeVarSaver, (String) null, (ny6) objRememberedValue, zl2VarStartRestartGroup, 0, 4);
            pn2.CompositionLocalProvider(ule.getLocalSaveableStateRegistry().provides(p19Var), mk2.rememberComposableLambda(1863926504, true, new C11264a(p19Var, kz6Var), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, did.f29712i | 48);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11265b(kz6Var, i));
        }
    }
}
