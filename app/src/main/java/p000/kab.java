package p000;

import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,239:1\n77#2:240\n1223#3,6:241\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n235#1:240\n236#1:241,6\n*E\n"})
@xn8(name = "NestedScrollInteropConnectionKt")
public final class kab {

    /* JADX INFO: renamed from: a */
    public static final float f53451a = 0.5f;

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m30654getScrollAxesk4lQ0M(long j) {
        int i = Math.abs(izb.m30429getXimpl(j)) >= 0.5f ? 1 : 0;
        return Math.abs(izb.m30430getYimpl(j)) >= 0.5f ? i | 2 : i;
    }

    @yfb
    @hk2
    public static final hab rememberNestedScrollInteropConnection(@gib View view, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        boolean zChanged = zl2Var.changed(view);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new jab(view);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        jab jabVar = (jab) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return jabVar;
    }

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m30655toOffsetUv8p0NA(int[] iArr, long j) {
        return mzb.Offset(izb.m30429getXimpl(j) >= 0.0f ? kpd.coerceAtMost(reverseAxis(iArr[0]), izb.m30429getXimpl(j)) : kpd.coerceAtLeast(reverseAxis(iArr[0]), izb.m30429getXimpl(j)), izb.m30430getYimpl(j) >= 0.0f ? kpd.coerceAtMost(reverseAxis(iArr[1]), izb.m30430getYimpl(j)) : kpd.coerceAtLeast(reverseAxis(iArr[1]), izb.m30430getYimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m30656toViewTypeGyEprt8(int i) {
        return !oab.m31311equalsimpl0(i, oab.f66990b.m31323getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }
}
