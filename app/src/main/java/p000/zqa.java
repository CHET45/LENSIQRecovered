package p000;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zqa {

    /* JADX INFO: renamed from: zqa$a */
    @c5e(28)
    public static class C16217a {
        private C16217a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m26956a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    private zqa() {
    }

    public static void setGroupDividerEnabled(@efb Menu menu, boolean z) {
        if (menu instanceof sfg) {
            ((sfg) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C16217a.m26956a(menu, z);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
