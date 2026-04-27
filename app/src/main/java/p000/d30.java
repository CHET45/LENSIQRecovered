package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d30 {

    /* JADX INFO: renamed from: a */
    public final String f28301a;

    /* JADX INFO: renamed from: b */
    public final String f28302b;

    /* JADX INFO: renamed from: c */
    public final List<pf1> f28303c;

    /* JADX INFO: renamed from: d */
    public final String f28304d;

    /* JADX INFO: renamed from: e */
    public final String f28305e;

    /* JADX INFO: renamed from: f */
    public final String f28306f;

    /* JADX INFO: renamed from: g */
    public final String f28307g;

    /* JADX INFO: renamed from: h */
    public final b84 f28308h;

    public d30(String str, String str2, List<pf1> list, String str3, String str4, String str5, String str6, b84 b84Var) {
        this.f28301a = str;
        this.f28302b = str2;
        this.f28303c = list;
        this.f28304d = str3;
        this.f28305e = str4;
        this.f28306f = str5;
        this.f28307g = str6;
        this.f28308h = b84Var;
    }

    public static d30 create(Context context, jr7 jr7Var, String str, String str2, List<pf1> list, b84 b84Var) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String installerPackageName = jr7Var.getInstallerPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String appBuildVersion = getAppBuildVersion(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = jr7.f51589h;
        }
        return new d30(str, str2, list, installerPackageName, packageName, appBuildVersion, str3, b84Var);
    }

    private static String getAppBuildVersion(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
