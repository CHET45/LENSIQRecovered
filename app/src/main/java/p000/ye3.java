package p000;

import android.content.res.Configuration;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n77#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"})
public final class ye3 {
    @hk2
    @wqd
    public static final boolean _isSystemInDarkTheme(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = (((Configuration) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z;
    }
}
