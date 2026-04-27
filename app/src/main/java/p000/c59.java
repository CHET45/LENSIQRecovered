package p000;

import androidx.lifecycle.AbstractC1143j;

/* JADX INFO: loaded from: classes3.dex */
public final class c59 {
    @yfb
    @hk2
    public static final i2g<AbstractC1143j.b> currentStateAsState(@yfb AbstractC1143j abstractC1143j, @gib zl2 zl2Var, int i) {
        zl2Var.startReplaceableGroup(-1892357376);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1892357376, i, -1, "androidx.lifecycle.compose.currentStateAsState (LifecycleExt.kt:31)");
        }
        i2g<AbstractC1143j.b> i2gVarCollectAsState = stf.collectAsState(abstractC1143j.getCurrentStateFlow(), null, zl2Var, 0, 1);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return i2gVarCollectAsState;
    }
}
