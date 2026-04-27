package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsService;
import androidx.core.app.BundleCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class rjh {

    /* JADX INFO: renamed from: a */
    public static final String f78485a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    /* JADX INFO: renamed from: b */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f78486b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    private rjh() {
    }

    public static boolean areSplashScreensSupported(@efb Context context, @efb String str, @efb String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction(CustomTabsService.f3455c).setPackage(str), 64);
        if (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void launchAsTrustedWebActivity(@efb Context context, @efb sd3 sd3Var, @efb Uri uri) {
        if (BundleCompat.getBinder(sd3Var.f81293a.getExtras(), sd3.f81270d) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        sd3Var.f81293a.putExtra(f78485a, true);
        sd3Var.launchUrl(context, uri);
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static void launchBrowserSiteSettings(@efb Context context, @efb vd3 vd3Var, @efb Uri uri) {
        Intent intent = new Intent(f78486b);
        intent.setPackage(vd3Var.m23923b().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, sd3.f81270d, vd3Var.m23922a());
        intent.putExtras(bundle);
        PendingIntent pendingIntentM23924c = vd3Var.m23924c();
        if (pendingIntentM23924c != null) {
            intent.putExtra(sd3.f81271e, pendingIntentM23924c);
        }
        context.startActivity(intent);
    }

    @xqi
    public static boolean transferSplashImage(@efb Context context, @efb File file, @efb String str, @efb String str2, @efb vd3 vd3Var) {
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        return vd3Var.receiveFile(uriForFile, 1, null);
    }
}
