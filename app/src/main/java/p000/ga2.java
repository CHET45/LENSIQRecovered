package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,54:1\n77#2:55\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n38#1:55\n*E\n"})
public final class ga2 {
    @hk2
    @wqd
    public static final long colorResource(@w92 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        long jM33216getColorWaAFU9c = x92.f97242a.m33216getColorWaAFU9c((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext()), i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return jM33216getColorWaAFU9c;
    }
}
