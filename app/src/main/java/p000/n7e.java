package p000;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n77#2:70\n77#2:71\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n35#1:70\n36#1:71\n*E\n"})
public final class n7e {
    @yfb
    @hk2
    @wqd
    public static final Resources resources(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return resources;
    }
}
