package p000;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class dge {

    /* JADX INFO: renamed from: dge$a */
    @c5e(28)
    public static class C4783a {
        private C4783a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m9134a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    private dge() {
    }

    public static void setFillWindowForwardOnly(@efb SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            C4783a.m9134a(sQLiteCursor, z);
        }
    }
}
