package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.C0383a;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
@e0g(parameters = 0)
public final class md9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final md9 f60704a = new md9();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final zhd<iy6> f60705b = pn2.compositionLocalOf$default(null, C9319a.f60707a, 1, null);

    /* JADX INFO: renamed from: c */
    public static final int f60706c = 0;

    /* JADX INFO: renamed from: md9$a */
    public static final class C9319a extends tt8 implements ny6<iy6> {

        /* JADX INFO: renamed from: a */
        public static final C9319a f60707a = new C9319a();

        public C9319a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final iy6 invoke() {
            return null;
        }
    }

    private md9() {
    }

    @gib
    @xn8(name = "getCurrent")
    @hk2
    public final iy6 getCurrent(@gib zl2 zl2Var, int i) {
        zl2Var.startReplaceableGroup(540186968);
        iy6 iy6Var = (iy6) zl2Var.consume(f60705b);
        zl2Var.startReplaceableGroup(1606493384);
        if (iy6Var == null) {
            iy6Var = C0383a.get((View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        zl2Var.endReplaceableGroup();
        if (iy6Var == null) {
            Object baseContext = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof iy6) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            iy6Var = (iy6) baseContext;
        }
        zl2Var.endReplaceableGroup();
        return iy6Var;
    }

    @yfb
    public final did<iy6> provides(@yfb iy6 iy6Var) {
        return f60705b.provides(iy6Var);
    }
}
