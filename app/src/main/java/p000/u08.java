package p000;

import androidx.compose.foundation.C0595g;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface u08 {
    @yfb
    @hk2
    @q64(level = u64.f86866b, message = C0595g.f3976b)
    default v08 rememberUpdatedInstance(@yfb q98 q98Var, @gib zl2 zl2Var, int i) {
        zl2Var.startReplaceGroup(1257603829);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1257603829, i, -1, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:75)");
        }
        kdb kdbVar = kdb.f53660a;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceGroup();
        return kdbVar;
    }
}
