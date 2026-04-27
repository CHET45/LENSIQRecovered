package p000;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class bzh {

    /* JADX INFO: renamed from: bzh$a */
    @c5e(24)
    public static class C2132a {
        private C2132a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m3562a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private bzh() {
    }

    public static boolean isUserUnlocked(@efb Context context) {
        return C2132a.m3562a(context);
    }
}
