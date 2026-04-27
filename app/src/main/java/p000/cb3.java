package p000;

import android.database.CursorWindow;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class cb3 {

    /* JADX INFO: renamed from: cb3$a */
    @c5e(28)
    public static class C2260a {
        private C2260a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static CursorWindow m3885a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    private cb3() {
    }

    @efb
    public static CursorWindow create(@hib String str, long j) {
        return Build.VERSION.SDK_INT >= 28 ? C2260a.m3885a(str, j) : new CursorWindow(str);
    }
}
