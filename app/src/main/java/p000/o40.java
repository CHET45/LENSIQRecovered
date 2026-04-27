package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class o40 {

    /* JADX INFO: renamed from: a */
    public static final String f66439a = "AppVersionSignature";

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<String, eq8> f66440b = new ConcurrentHashMap();

    private o40() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static void m18342a() {
        f66440b.clear();
    }

    @hib
    private static PackageInfo getPackageInfo(@efb Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f66439a, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @efb
    private static String getVersionCode(@hib PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @efb
    public static eq8 obtain(@efb Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, eq8> concurrentMap = f66440b;
        eq8 eq8Var = concurrentMap.get(packageName);
        if (eq8Var != null) {
            return eq8Var;
        }
        eq8 eq8VarObtainVersionSignature = obtainVersionSignature(context);
        eq8 eq8VarPutIfAbsent = concurrentMap.putIfAbsent(packageName, eq8VarObtainVersionSignature);
        return eq8VarPutIfAbsent == null ? eq8VarObtainVersionSignature : eq8VarPutIfAbsent;
    }

    @efb
    private static eq8 obtainVersionSignature(@efb Context context) {
        return new bkb(getVersionCode(getPackageInfo(context)));
    }
}
