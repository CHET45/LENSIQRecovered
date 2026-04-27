package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class oac {

    /* JADX INFO: renamed from: a */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f66998a = "PackageManagerCompat";

    /* JADX INFO: renamed from: b */
    @igg({"ActionValue"})
    public static final String f66999b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* JADX INFO: renamed from: oac$a */
    @c5e(30)
    public static class C10284a {
        private C10284a() {
        }

        /* JADX INFO: renamed from: a */
        public static boolean m18545a(@efb Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* JADX INFO: renamed from: oac$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC10285b {
    }

    private oac() {
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static boolean areUnusedAppRestrictionsAvailable(@efb PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        return (i >= 30) || ((i < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public static String getPermissionRevocationVerifierApp(@efb PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f66999b).setData(Uri.fromParts(C12269rt.f79418l, "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @efb
    public static ja9<Integer> getUnusedAppRestrictionsStatus(@efb Context context) {
        o5e<Integer> o5eVarCreate = o5e.create();
        if (!bzh.isUserUnlocked(context)) {
            o5eVarCreate.set(0);
            Log.e(f66998a, "User is in locked direct boot mode");
            return o5eVarCreate;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            o5eVarCreate.set(1);
            return o5eVarCreate;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i < 30) {
            o5eVarCreate.set(0);
            Log.e(f66998a, "Target SDK version below API 30");
            return o5eVarCreate;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (C10284a.m18545a(context)) {
                o5eVarCreate.set(Integer.valueOf(i >= 31 ? 5 : 4));
            } else {
                o5eVarCreate.set(2);
            }
            return o5eVarCreate;
        }
        if (i2 == 30) {
            o5eVarCreate.set(Integer.valueOf(C10284a.m18545a(context) ? 4 : 2));
            return o5eVarCreate;
        }
        final yvh yvhVar = new yvh(context);
        o5eVarCreate.addListener(new Runnable() { // from class: nac
            @Override // java.lang.Runnable
            public final void run() {
                yvhVar.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        yvhVar.connectAndFetchResult(o5eVarCreate);
        return o5eVarCreate;
    }
}
