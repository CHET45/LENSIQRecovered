package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class hpc {
    /* JADX INFO: renamed from: a */
    public static Intent m12526a(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m12527b(Context context) {
        Intent intent;
        if (rpc.m21473f()) {
            intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
        } else {
            intent = null;
        }
        return (intent == null || !rpc.m21469b(context, intent)) ? m12526a(context) : intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m12528c(Context context) {
        Intent intent;
        if (rpc.m21473f()) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = null;
        }
        return (intent == null || !rpc.m21469b(context, intent)) ? m12526a(context) : intent;
    }

    /* JADX INFO: renamed from: d */
    public static Intent m12529d(Context context) {
        Intent intent;
        if (rpc.m21471d()) {
            intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
        } else {
            intent = null;
        }
        return (intent == null || !rpc.m21469b(context, intent)) ? m12526a(context) : intent;
    }

    /* JADX INFO: renamed from: e */
    public static Intent m12530e(Context context) {
        Intent intent = rpc.m21470c() ? new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION") : null;
        return (intent == null || !rpc.m21469b(context, intent)) ? m12526a(context) : intent;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m12531f(Context context) {
        Intent intent;
        if (rpc.m21471d()) {
            intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
        } else {
            intent = null;
        }
        return (intent == null || !rpc.m21469b(context, intent)) ? m12526a(context) : intent;
    }
}
