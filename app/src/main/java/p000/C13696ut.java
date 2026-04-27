package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,875:1\n77#2:876\n77#2:877\n1223#3,6:878\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n65#1:876\n66#1:877\n68#1:878,6\n*E\n"})
public final class C13696ut {
    @yfb
    @hk2
    public static final w9c rememberOverscrollEffect(@gib zl2 zl2Var, int i) {
        w9c w9cVar;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1476348564, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        u9c u9cVar = (u9c) zl2Var.consume(v9c.getLocalOverscrollConfiguration());
        if (u9cVar != null) {
            zl2Var.startReplaceGroup(1586021609);
            boolean zChanged = zl2Var.changed(context) | zl2Var.changed(u9cVar);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C5454es(context, u9cVar);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            w9cVar = (C5454es) objRememberedValue;
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(1586120933);
            zl2Var.endReplaceGroup();
            w9cVar = udb.f87754a;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return w9cVar;
    }
}
