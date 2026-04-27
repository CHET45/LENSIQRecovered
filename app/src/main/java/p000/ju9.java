package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ju9 {

    /* JADX INFO: renamed from: a */
    public static ju9 f51937a = null;

    /* JADX INFO: renamed from: b */
    public static final String f51938b = "market://details?id=";

    /* JADX INFO: renamed from: ju9$a */
    public static class C8096a {

        /* JADX INFO: renamed from: a */
        public static final String f51939a = "HUAWEI";

        /* JADX INFO: renamed from: b */
        public static final String f51940b = "HONOR";

        /* JADX INFO: renamed from: c */
        public static final String f51941c = "OPPO";

        /* JADX INFO: renamed from: d */
        public static final String f51942d = "VIVO";

        /* JADX INFO: renamed from: e */
        public static final String f51943e = "XIAOMI";

        /* JADX INFO: renamed from: f */
        public static final String f51944f = "ONEPLUS";

        /* JADX INFO: renamed from: g */
        public static final String f51945g = "SONY";

        /* JADX INFO: renamed from: h */
        public static final String f51946h = "GOOGLE";

        /* JADX INFO: renamed from: i */
        public static final String f51947i = "REDMI";
    }

    /* JADX INFO: renamed from: ju9$b */
    public static class C8097b {

        /* JADX INFO: renamed from: a */
        public static final String f51948a = "com.heytap.market";

        /* JADX INFO: renamed from: b */
        public static final String f51949b = "com.bbk.appstore";

        /* JADX INFO: renamed from: c */
        public static final String f51950c = "com.huawei.appmarket";

        /* JADX INFO: renamed from: d */
        public static final String f51951d = "com.xiaomi.market";

        /* JADX INFO: renamed from: e */
        public static final String f51952e = "com.android.vending";

        /* JADX INFO: renamed from: f */
        public static final String f51953f = "com.tencent.android.qqdownloader";
    }

    private String getBrandName(String brandName) {
        return C8096a.f51939a.equals(brandName) ? C8097b.f51950c : C8096a.f51941c.equals(brandName) ? C8097b.f51948a : C8096a.f51942d.equals(brandName) ? C8097b.f51949b : (C8096a.f51943e.equals(brandName) || C8096a.f51947i.equals(brandName)) ? C8097b.f51951d : C8096a.f51940b.equals(brandName) ? C8097b.f51950c : C8096a.f51944f.equals(brandName) ? C8097b.f51948a : (C8096a.f51945g.equals(brandName) || C8096a.f51946h.equals(brandName)) ? "com.android.vending" : "";
    }

    private String getDeviceBrand() {
        return Build.BRAND;
    }

    public static ju9 getTools() {
        if (f51937a == null) {
            f51937a = new ju9();
        }
        return f51937a;
    }

    private void goGooglePlay(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(f51938b + context.getPackageName()));
            intent.setPackage("com.android.vending");
            if (!queryGooglePlayActivity(intent, context)) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName()));
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isCheckBaiduOrYYB(Context mContext, String packageName) {
        return isInstalled(packageName, mContext);
    }

    private boolean isInstalled(@efb String packageName, Context context) {
        PackageInfo packageInfo;
        if ("".equals(packageName) || packageName.length() <= 0) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static void launchAppDetail(Context context, String appPkg, String marketPkg) {
        try {
            if (TextUtils.isEmpty(appPkg)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(f51938b + appPkg));
            if (!TextUtils.isEmpty(marketPkg)) {
                intent.setPackage(marketPkg);
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void openMarket(Context mContext, String packageName, String marketPackageName) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(f51938b + packageName));
            intent.setPackage(marketPackageName);
            intent.addFlags(268435456);
            mContext.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("MarketUtils", "要跳转的应用市场不存在!" + e.getMessage());
        } catch (Exception e2) {
            Log.e("MarketUtils", "其他错误：" + e2.getMessage());
        }
    }

    private boolean queryGooglePlayActivity(Intent intent, Context context) {
        return queryPackageName(intent, context, "com.android.vending");
    }

    private boolean queryPackageName(Intent intent, Context context, String packageName) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.packageName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public boolean startMarket(Context mContext) {
        return startMarket(mContext, mContext.getPackageName());
    }

    public boolean startMarket(Context mContext, String packageName) {
        try {
            String deviceBrand = getDeviceBrand();
            StringBuilder sb = new StringBuilder();
            sb.append("deviceBrand =");
            sb.append(deviceBrand);
            String upperCase = deviceBrand.toUpperCase();
            if (TextUtils.isEmpty(upperCase)) {
                Log.e("MarketUtils", "没有读取到手机厂商~~");
                return false;
            }
            String brandName = getBrandName(upperCase);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("marketPackageName =");
            sb2.append(brandName);
            if (brandName == null || "".equals(brandName)) {
                if (!isCheckBaiduOrYYB(mContext, C8097b.f51953f)) {
                    return false;
                }
                startMarket(mContext, packageName, C8097b.f51953f);
            }
            if (brandName.equals("com.android.vending")) {
                goGooglePlay(mContext);
                return true;
            }
            startMarket(mContext, packageName, brandName);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("MarketUtils", "要跳转的应用市场不存在!" + e.getMessage());
            return false;
        } catch (Exception e2) {
            Log.e("MarketUtils", "其他错误：" + e2.getMessage());
            return false;
        }
    }

    public boolean startMarket(Context mContext, String packageName, String marketPackageName) {
        try {
            openMarket(mContext, packageName, marketPackageName);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("MarketUtils", "要跳转的应用市场不存在!" + e.getMessage());
            return false;
        } catch (Exception e2) {
            Log.e("MarketUtils", "其他错误：" + e2.getMessage());
            return false;
        }
    }
}
