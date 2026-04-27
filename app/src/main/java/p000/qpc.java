package p000;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class qpc {

    /* JADX INFO: renamed from: a */
    public static final Handler f75084a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static boolean m20477a(@efb Context context, @hib Intent intent) {
        if (intent == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        return C5487ew.m10310f() ? !packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)).isEmpty() : !packageManager.queryIntentActivities(intent, 65536).isEmpty();
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static <T> ArrayList<T> m20478b(@hib T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr != null ? tArr.length : 0);
        if (tArr != null && tArr.length != 0) {
            for (T t : tArr) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @efb
    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public static <T> ArrayList<T> m20479c(@hib T[]... tArr) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (tArr != null && tArr.length != 0) {
            for (T[] tArr2 : tArr) {
                arrayList.addAll(m20478b(tArr2));
            }
        }
        return arrayList;
    }

    @c5e(19)
    /* JADX INFO: renamed from: d */
    public static boolean m20480d(Context context, String str) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return (C5487ew.m10307c() ? appOpsManager.unsafeCheckOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName()) : appOpsManager.checkOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName())) == 0;
    }

    @c5e(19)
    /* JADX INFO: renamed from: e */
    public static boolean m20481e(Context context, String str, int i) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            try {
                i = ((Integer) cls.getDeclaredField(str).get(Integer.class)).intValue();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    @c5e(api = 23)
    /* JADX INFO: renamed from: f */
    public static boolean m20482f(@efb Context context, @efb String str) {
        return context.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20483g(@efb Collection<String> collection, @efb String str) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (m20485i(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20484h(@efb String[] strArr, @efb String str) {
        return m20483g(Arrays.asList(strArr), str);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20485i(@efb String str, @efb String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @hib
    /* JADX INFO: renamed from: j */
    public static Activity m20486j(@efb Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || (context = ((ContextWrapper) context).getBaseContext()) == null) {
                return null;
            }
        }
        return (Activity) context;
    }

    @igg({"PrivateApi"})
    /* JADX INFO: renamed from: k */
    public static int m20487k(@efb Context context, @efb String str) {
        AssetManager assets = context.getAssets();
        try {
            if (C5487ew.m10306b(context) >= 28 && C5487ew.m10305a() >= 28 && C5487ew.m10305a() < 30) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                declaredMethod.setAccessible(true);
                Method method = (Method) declaredMethod.invoke(AssetManager.class, "findCookieForPath", new Class[]{String.class});
                if (method != null) {
                    method.setAccessible(true);
                    Integer num = (Integer) method.invoke(context.getAssets(), str);
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
            Integer num2 = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return 0;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    @hib
    /* JADX INFO: renamed from: l */
    public static C11673qt m20488l(Context context) {
        int iM20487k = m20487k(context, context.getApplicationInfo().sourceDir);
        C11673qt c11673qt = null;
        if (iM20487k == 0) {
            return null;
        }
        try {
            C11673qt c11673qtM21512a = C12269rt.m21512a(context, iM20487k);
            try {
                if (TextUtils.equals(context.getPackageName(), c11673qtM21512a.f75558a)) {
                    return c11673qtM21512a;
                }
                return null;
            } catch (IOException | XmlPullParserException e) {
                e = e;
                c11673qt = c11673qtM21512a;
                e.printStackTrace();
                return c11673qt;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (XmlPullParserException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Uri m20489m(@efb Context context) {
        return Uri.parse("package:" + context.getPackageName());
    }

    /* JADX INFO: renamed from: n */
    public static Intent m20490n(@efb Context context, @hib List<String> list) {
        if (list == null || list.isEmpty()) {
            return bpc.m3314b(context);
        }
        if (!ync.m26227a(list)) {
            return list.size() == 1 ? ync.m26232f(context, list.get(0)) : bpc.m3315c(context, list);
        }
        int size = list.size();
        if (size == 1) {
            return ync.m26232f(context, list.get(0));
        }
        if (size != 2) {
            if (size == 3 && C5487ew.m10308d() && m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && m20483g(list, xnc.f98579D) && m20483g(list, xnc.f98580E)) {
                return ync.m26232f(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
            }
        } else if (!C5487ew.m10310f() && m20483g(list, xnc.f98616m) && m20483g(list, xnc.f98618o)) {
            return ync.m26232f(context, xnc.f98616m);
        }
        return bpc.m3314b(context);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20491o(@efb Activity activity) {
        Display defaultDisplay;
        if (C5487ew.m10308d()) {
            defaultDisplay = activity.getDisplay();
        } else {
            WindowManager windowManager = activity.getWindowManager();
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        }
        if (defaultDisplay == null) {
            return false;
        }
        int rotation = defaultDisplay.getRotation();
        return rotation == 2 || rotation == 3;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m20492p(@efb Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20493q(@efb Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || !bundle.containsKey("ScopedStorage")) {
                return false;
            }
            return bundle.getBoolean("ScopedStorage");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @igg({"SwitchIntDef"})
    /* JADX INFO: renamed from: r */
    public static void m20494r(@efb Activity activity) {
        try {
            int i = activity.getResources().getConfiguration().orientation;
            if (i == 1) {
                activity.setRequestedOrientation(m20491o(activity) ? 9 : 1);
            } else if (i == 2) {
                activity.setRequestedOrientation(m20491o(activity) ? 8 : 0);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m20495s(Activity activity, @efb String[] strArr, @efb int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (ync.m26238l(str)) {
                iArr[i] = ync.m26233g(activity, str);
            } else if (m20485i(str, xnc.f98602a)) {
                iArr[i] = ync.m26233g(activity, str);
            } else if (C5487ew.m10311g() && m20484h(new String[]{xnc.f98621r, xnc.f98622s}, str)) {
                iArr[i] = ync.m26233g(activity, xnc.f98617n);
            } else if (C5487ew.m10310f() && C5487ew.m10306b(activity) >= 33 && m20485i(str, xnc.f98580E)) {
                iArr[i] = ync.m26233g(activity, str);
            } else if (xnc.m25333a(str) > C5487ew.m10305a()) {
                iArr[i] = ync.m26233g(activity, str);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m20496t(@efb List<String> list, @efb Runnable runnable) {
        long j = 300;
        long j2 = C5487ew.m10308d() ? 200L : 300L;
        if (!zsc.m27076c() && !zsc.m27077d()) {
            j = (zsc.m27079f() && C5487ew.m10308d() && m20483g(list, xnc.f98611h)) ? 1000L : j2;
        } else if (!C5487ew.m10321q()) {
            j = 500;
        }
        m20497u(runnable, j);
    }

    /* JADX INFO: renamed from: u */
    public static void m20497u(@efb Runnable runnable, long j) {
        f75084a.postDelayed(runnable, j);
    }

    @c5e(api = 23)
    /* JADX INFO: renamed from: v */
    public static boolean m20498v(@efb Activity activity, @efb String str) {
        if (C5487ew.m10305a() == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
