package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h8g {
    @yfb
    @hk2
    @wqd
    public static final String pluralStringResource(@k1d int i, int i2, @gib zl2 zl2Var, int i3) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = n7e.resources(zl2Var, 0).getQuantityString(i, i2);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return quantityString;
    }

    @yfb
    @hk2
    @wqd
    public static final String[] stringArrayResource(@d70 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = n7e.resources(zl2Var, 0).getStringArray(i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return stringArray;
    }

    @yfb
    @hk2
    @wqd
    public static final String stringResource(@g8g int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = n7e.resources(zl2Var, 0).getString(i);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return string;
    }

    @yfb
    @hk2
    @wqd
    public static final String pluralStringResource(@k1d int i, int i2, @yfb Object[] objArr, @gib zl2 zl2Var, int i3) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = n7e.resources(zl2Var, 0).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return quantityString;
    }

    @yfb
    @hk2
    @wqd
    public static final String stringResource(@g8g int i, @yfb Object[] objArr, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = n7e.resources(zl2Var, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return string;
    }
}
