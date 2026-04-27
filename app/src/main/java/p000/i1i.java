package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes7.dex */
public final class i1i {
    private i1i() {
    }

    public static int toDp(int px) {
        return px * ((int) Resources.getSystem().getDisplayMetrics().density);
    }
}
