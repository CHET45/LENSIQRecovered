package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class m58 {

    /* JADX INFO: renamed from: b */
    public static final String f59933b = "";

    /* JADX INFO: renamed from: a */
    public String f59934a;

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m16628a(Context context) {
        try {
            if (this.f59934a == null) {
                this.f59934a = loadInstallerPackageName(context);
            }
        } finally {
        }
        return "".equals(this.f59934a) ? null : this.f59934a;
    }
}
