package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
public final class tpc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tpc f85548a = new tpc();

    /* JADX INFO: renamed from: b */
    public static final int f85549b = 199;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f85550c = "PermissionUtils--->";

    /* JADX INFO: renamed from: d */
    public static final int f85551d = 0;

    private tpc() {
    }

    @do8
    public static final boolean checkPermission(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        return f85548a.commonROMPermissionCheck(context);
    }

    private final Object commonROMPermissionApply(Fragment fragment) {
        if (sae.f81060a.checkIsMeizuRom()) {
            cqa.applyPermission(fragment);
            return bth.f14751a;
        }
        try {
            return commonROMPermissionApplyInternal(fragment);
        } catch (Exception e) {
            return Integer.valueOf(Log.e(f85550c, Log.getStackTraceString(e)));
        }
    }

    @do8
    @yfb
    public static final Object commonROMPermissionApplyInternal(@yfb Fragment fragment) {
        md8.checkNotNullParameter(fragment, "fragment");
        try {
            Intent intent = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
            intent.setData(Uri.parse("package:" + fragment.getActivity().getPackageName()));
            fragment.startActivityForResult(intent, f85549b);
            return bth.f14751a;
        } catch (Exception e) {
            return Integer.valueOf(Log.e(f85550c, String.valueOf(e)));
        }
    }

    private final boolean commonROMPermissionCheck(Context context) {
        if (sae.f81060a.checkIsMeizuRom()) {
            return meizuPermissionCheck(context);
        }
        try {
            Object objInvoke = Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
            md8.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            Log.e(f85550c, Log.getStackTraceString(e));
            return true;
        }
    }

    private final boolean huaweiPermissionCheck(Context context) {
        return yo7.checkFloatWindowPermission(context);
    }

    private final boolean meizuPermissionCheck(Context context) {
        return cqa.checkFloatWindowPermission(context);
    }

    private final boolean miuiPermissionCheck(Context context) {
        return iwa.checkFloatWindowPermission(context);
    }

    private final boolean oppoROMPermissionCheck(Context context) {
        return p6c.checkFloatWindowPermission(context);
    }

    private final boolean qikuPermissionCheck(Context context) {
        return kkd.checkFloatWindowPermission(context);
    }

    @do8
    public static final void requestPermission(@yfb Activity activity, @yfb c4c c4cVar) {
        md8.checkNotNullParameter(activity, "activity");
        md8.checkNotNullParameter(c4cVar, "onPermissionResult");
        zoc.f105615b.requestPermission(activity, c4cVar);
    }

    @yfb
    public final Object requestPermission$app_gpRelease(@yfb Fragment fragment) {
        md8.checkNotNullParameter(fragment, "fragment");
        return commonROMPermissionApply(fragment);
    }
}
