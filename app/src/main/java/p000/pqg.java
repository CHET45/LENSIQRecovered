package p000;

import android.R;

/* JADX INFO: loaded from: classes.dex */
public enum pqg {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll);


    /* JADX INFO: renamed from: a */
    public final int f71663a;

    pqg(int i) {
        this.f71663a = i;
    }

    @yfb
    @hk2
    @wqd
    public final String resolvedString(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-309609081, i, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String strStringResource = h8g.stringResource(this.f71663a, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return strStringResource;
    }
}
