package p000;

import androidx.compose.animation.AbstractC0574g;
import androidx.compose.animation.AbstractC0575h;
import androidx.compose.animation.C0573f;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: renamed from: wx */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,885:1\n135#2:886\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n662#1:886\n*E\n"})
public interface InterfaceC14819wx {

    /* JADX INFO: renamed from: wx$a */
    public static final class a {
        @yfb
        @Deprecated
        public static InterfaceC0701e animateEnterExit(@yfb InterfaceC14819wx interfaceC14819wx, @yfb InterfaceC0701e interfaceC0701e, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb String str) {
            return InterfaceC14819wx.super.animateEnterExit(interfaceC0701e, abstractC0574g, abstractC0575h, str);
        }
    }

    /* JADX INFO: renamed from: wx$b */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,178:1\n663#2,5:179\n*E\n"})
    public static final class b extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0574g f95638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0575h f95639b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f95640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str) {
            super(1);
            this.f95638a = abstractC0574g;
            this.f95639b = abstractC0575h;
            this.f95640c = str;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("animateEnterExit");
            f58Var.getProperties().set("enter", this.f95638a);
            f58Var.getProperties().set("exit", this.f95639b);
            f58Var.getProperties().set("label", this.f95640c);
        }
    }

    /* JADX INFO: renamed from: wx$c */
    public static final class c extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0574g f95642b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0575h f95643c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f95644d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str) {
            super(3);
            this.f95642b = abstractC0574g;
            this.f95643c = abstractC0575h;
            this.f95644d = str;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(1840112047);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:668)");
            }
            InterfaceC0701e interfaceC0701eThen = interfaceC0701e.then(C0573f.createModifier(InterfaceC14819wx.this.getTransition(), this.f95642b, this.f95643c, null, this.f95644d, zl2Var, 0, 4));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eThen;
        }
    }

    static /* synthetic */ InterfaceC0701e animateEnterExit$default(InterfaceC14819wx interfaceC14819wx, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i & 1) != 0) {
            abstractC0574g = C0573f.fadeIn$default(null, 0.0f, 3, null);
        }
        if ((i & 2) != 0) {
            abstractC0575h = C0573f.fadeOut$default(null, 0.0f, 3, null);
        }
        if ((i & 4) != 0) {
            str = "animateEnterExit";
        }
        return interfaceC14819wx.animateEnterExit(interfaceC0701e, abstractC0574g, abstractC0575h, str);
    }

    @yfb
    default InterfaceC0701e animateEnterExit(@yfb InterfaceC0701e interfaceC0701e, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb String str) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new b(abstractC0574g, abstractC0575h, str) : c58.getNoInspectorInfo(), new c(abstractC0574g, abstractC0575h, str));
    }

    @yfb
    yeh<d35> getTransition();
}
