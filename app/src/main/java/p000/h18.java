package p000;

import androidx.mediarouter.media.C1340j;
import androidx.profileinstaller.C1360d;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import p000.g18;
import p000.g18.C6081a;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n1223#2,6:365\n1223#2,6:371\n1223#2,6:377\n1223#2,6:383\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365,6\n263#1:371,6\n269#1:377,6\n281#1:383,6\n*E\n"})
public final class h18 {

    /* JADX INFO: renamed from: h18$a */
    public static final class C6673a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ T f41987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g18.C6081a<T, V> f41988b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f41989c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ f18<T> f41990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6673a(T t, g18.C6081a<T, V> c6081a, T t2, f18<T> f18Var) {
            super(0);
            this.f41987a = t;
            this.f41988b = c6081a;
            this.f41989c = t2;
            this.f41990d = f18Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (md8.areEqual(this.f41987a, this.f41988b.getInitialValue$animation_core_release()) && md8.areEqual(this.f41989c, this.f41988b.getTargetValue$animation_core_release())) {
                return;
            }
            this.f41988b.updateValues$animation_core_release(this.f41987a, this.f41989c, this.f41990d);
        }
    }

    /* JADX INFO: renamed from: h18$b */
    @dwf({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n64#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2$1\n*L\n283#1:365,5\n*E\n"})
    public static final class C6674b extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g18 f41991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g18.C6081a<T, V> f41992b;

        /* JADX INFO: renamed from: h18$b$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2$1\n*L\n1#1,497:1\n284#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g18 f41993a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ g18.C6081a f41994b;

            public a(g18 g18Var, g18.C6081a c6081a) {
                this.f41993a = g18Var;
                this.f41994b = c6081a;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f41993a.removeAnimation$animation_core_release(this.f41994b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6674b(g18 g18Var, g18.C6081a<T, V> c6081a) {
            super(1);
            this.f41991a = g18Var;
            this.f41992b = c6081a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f41991a.addAnimation$animation_core_release(this.f41992b);
            return new a(this.f41991a, this.f41992b);
        }
    }

    @yfb
    @hk2
    public static final i2g<Float> animateFloat(@yfb g18 g18Var, float f, float f2, @yfb f18<Float> f18Var, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i3 = i << 3;
        i2g<Float> i2gVarAnimateValue = animateValue(g18Var, Float.valueOf(f), Float.valueOf(f2), g3i.getVectorConverter(d46.f28382a), f18Var, str2, zl2Var, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValue;
    }

    @yfb
    @hk2
    public static final <T, V extends AbstractC16313zy> i2g<T> animateValue(@yfb g18 g18Var, T t, T t2, @yfb alh<T, V> alhVar, @yfb f18<T> f18Var, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = g18Var.new C6081a(t, t2, alhVar, f18Var, str2);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        g18.C6081a c6081a = (g18.C6081a) objRememberedValue;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && zl2Var.changedInstance(t)) || (i & 48) == 32) | ((((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changedInstance(t2)) || (i & 384) == 256);
        if ((((57344 & i) ^ CpioConstants.C_ISBLK) <= 16384 || !zl2Var.changedInstance(f18Var)) && (i & CpioConstants.C_ISBLK) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (z3 || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C6673a(t, c6081a, t2, f18Var);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.SideEffect((ny6) objRememberedValue2, zl2Var, 0);
        boolean zChangedInstance = zl2Var.changedInstance(g18Var);
        Object objRememberedValue3 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == c16170a.getEmpty()) {
            objRememberedValue3 = new C6674b(g18Var, c6081a);
            zl2Var.updateRememberedValue(objRememberedValue3);
        }
        jx4.DisposableEffect(c6081a, (qy6<? super wf4, ? extends vf4>) objRememberedValue3, zl2Var, 6);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c6081a;
    }

    @yfb
    @hk2
    public static final g18 rememberInfiniteTransition(@gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new g18(str);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        g18 g18Var = (g18) objRememberedValue;
        g18Var.run$animation_core_release(zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return g18Var;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateFloat(g18 g18Var, float f, float f2, f18 f18Var, zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        i2g<Float> i2gVarAnimateFloat = animateFloat(g18Var, f, f2, f18Var, "FloatAnimation", zl2Var, (i & 14) | CpioConstants.C_ISBLK | (i & 112) | (i & C1340j.f10444b) | (i & 7168), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateFloat;
    }

    @hk2
    @q64(level = u64.f86867c, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ g18 rememberInfiniteTransition(zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        g18 g18VarRememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", zl2Var, 6, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return g18VarRememberInfiniteTransition;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateValue(g18 g18Var, Object obj, Object obj2, alh alhVar, f18 f18Var, zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1695411770, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:337)");
        }
        int i2 = (i >> 3) & 8;
        i2g i2gVarAnimateValue = animateValue(g18Var, obj, obj2, alhVar, f18Var, "ValueAnimation", zl2Var, (i & 14) | C1360d.c.f10660k | (i2 << 3) | (i & 112) | (i2 << 6) | (i & C1340j.f10444b) | (i & 7168) | (i & 57344), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValue;
    }
}
