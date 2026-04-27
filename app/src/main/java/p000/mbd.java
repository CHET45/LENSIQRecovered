package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n77#2:83\n77#2:84\n77#2:85\n77#2:86\n77#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
public final class mbd {
    @hk2
    @wqd
    public static final boolean booleanResource(@ka1 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-432394447, i2, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z = ((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getBoolean(i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z;
    }

    @hk2
    @wqd
    public static final float dimensionResource(@xc4 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(804324951, i2, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float fM30705constructorimpl = kn4.m30705constructorimpl(((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDimension(i) / ((c64) zl2Var.consume(sn2.getLocalDensity())).getDensity());
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return fM30705constructorimpl;
    }

    @yfb
    @hk2
    @wqd
    public static final int[] integerArrayResource(@d70 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-93991766, i2, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getIntArray(i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return intArray;
    }

    @hk2
    @wqd
    public static final int integerResource(@e88 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(916701108, i2, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getInteger(i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return integer;
    }
}
