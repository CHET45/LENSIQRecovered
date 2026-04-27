package p000;

import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,219:1\n77#2:220\n1223#3,6:221\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n*L\n33#1:220\n34#1:221,6\n*E\n"})
public final class t9d {
    @ah5
    @yfb
    @hk2
    public static final s9d rememberDefaultPrefetchScheduler(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1141871251, i, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:31)");
        }
        View view = (View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zChanged = zl2Var.changed(view);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new RunnableC11695qu(view);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        RunnableC11695qu runnableC11695qu = (RunnableC11695qu) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return runnableC11695qu;
    }
}
