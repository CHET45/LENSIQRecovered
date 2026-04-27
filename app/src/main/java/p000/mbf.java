package p000;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000.fbf;
import p000.ibf;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class mbf {

    /* JADX INFO: renamed from: a */
    public static final int f60492a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f60493b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f60494c = 4;

    /* JADX INFO: renamed from: d */
    public static final int f60495d = 8;

    /* JADX INFO: renamed from: e */
    @fdi
    public static final String f60496e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: f */
    @fdi
    public static final String f60497f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: g */
    public static final int f60498g = 96;

    /* JADX INFO: renamed from: h */
    public static final int f60499h = 48;

    /* JADX INFO: renamed from: i */
    public static final String f60500i = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: j */
    public static volatile ibf<?> f60501j = null;

    /* JADX INFO: renamed from: k */
    public static volatile List<abf> f60502k = null;

    /* JADX INFO: renamed from: l */
    public static final String f60503l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: m */
    public static final String f60504m = "androidx.core.content.pm.shortcut_listener_impl";

    /* JADX INFO: renamed from: mbf$a */
    public class C9260a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IntentSender f60505a;

        public C9260a(IntentSender intentSender) {
            this.f60505a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f60505a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: mbf$b */
    @c5e(25)
    public static class C9261b {
        private C9261b() {
        }

        /* JADX INFO: renamed from: a */
        public static String m17210a(@efb List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    /* JADX INFO: renamed from: mbf$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC9262c {
    }

    private mbf() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static boolean m17205a(@efb Context context, @efb fbf fbfVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = fbfVar.f36037i;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f7442a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat.getUriInputStream(context);
        if (uriInputStream == null || (bitmapDecodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        fbfVar.f36037i = i == 6 ? IconCompat.createWithAdaptiveBitmap(bitmapDecodeStream) : IconCompat.createWithBitmap(bitmapDecodeStream);
        return true;
    }

    public static boolean addDynamicShortcuts(@efb Context context, @efb List<fbf> list) {
        List<fbf> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            m17206b(context, listRemoveShortcutsExcludedFromSurface);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<fbf> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            return false;
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<abf> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
        return true;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public static void m17206b(@efb Context context, @efb List<fbf> list) {
        for (fbf fbfVar : new ArrayList(list)) {
            if (!m17205a(context, fbfVar)) {
                list.remove(fbfVar);
            }
        }
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static List<abf> m17207c() {
        return f60502k;
    }

    @efb
    public static Intent createShortcutResultIntent(@efb Context context, @efb fbf fbfVar) {
        Intent intentCreateShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(fbfVar.toShortcutInfo());
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return fbfVar.m10804a(intentCreateShortcutResultIntent);
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public static void m17208d(List<abf> list) {
        f60502k = list;
    }

    public static void disableShortcuts(@efb Context context, @efb List<String> list, @hib CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<abf> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public static void m17209e(ibf<Void> ibfVar) {
        f60501j = ibfVar;
    }

    public static void enableShortcuts(@efb Context context, @efb List<fbf> list) {
        List<fbf> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<fbf> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f36030b);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<abf> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
    }

    @efb
    public static List<fbf> getDynamicShortcuts(@efb Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new fbf.C5714b(context, it.next()).build());
        }
        return arrayList;
    }

    private static int getIconDimensionInternal(@efb Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int getIconMaxHeight(@efb Context context) {
        z7d.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int getIconMaxWidth(@efb Context context) {
        z7d.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int getMaxShortcutCountPerActivity(@efb Context context) {
        z7d.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    private static String getShortcutInfoCompatWithLowestRank(@efb List<fbf> list) {
        int rank = -1;
        String id = null;
        for (fbf fbfVar : list) {
            if (fbfVar.getRank() > rank) {
                id = fbfVar.getId();
                rank = fbfVar.getRank();
            }
        }
        return id;
    }

    private static List<abf> getShortcutInfoListeners(Context context) {
        Bundle bundle;
        String string;
        if (f60502k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f60503l);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(f60504m)) != null) {
                    try {
                        arrayList.add((abf) Class.forName(string, false, mbf.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f60502k == null) {
                f60502k = arrayList;
            }
        }
        return f60502k;
    }

    private static ibf<?> getShortcutInfoSaverInstance(Context context) {
        if (f60501j == null) {
            try {
                f60501j = (ibf) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, mbf.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f60501j == null) {
                f60501j = new ibf.C7227a();
            }
        }
        return f60501j;
    }

    @efb
    public static List<fbf> getShortcuts(@efb Context context, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return fbf.m10800b(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return fbf.m10800b(context, arrayList);
    }

    public static boolean isRateLimitingActive(@efb Context context) {
        z7d.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static boolean isRequestPinShortcutSupported(@efb Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean pushDynamicShortcut(@efb Context context, @efb fbf fbfVar) {
        z7d.checkNotNull(context);
        z7d.checkNotNull(fbfVar);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && fbfVar.isExcludedFromSurfaces(1)) {
            Iterator<abf> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(Collections.singletonList(fbfVar));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (i <= 29) {
            m17205a(context, fbfVar);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(fbfVar.toShortcutInfo());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(C9261b.m17210a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(fbfVar.toShortcutInfo()));
        }
        ibf<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            List<fbf> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(Arrays.asList(fbfVar));
            Iterator<abf> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(Collections.singletonList(fbfVar));
            }
            reportShortcutUsed(context, fbfVar.getId());
            return true;
        } catch (Exception unused) {
            Iterator<abf> it3 = getShortcutInfoListeners(context).iterator();
            while (it3.hasNext()) {
                it3.next().onShortcutAdded(Collections.singletonList(fbfVar));
            }
            reportShortcutUsed(context, fbfVar.getId());
            return false;
        } catch (Throwable th) {
            Iterator<abf> it4 = getShortcutInfoListeners(context).iterator();
            while (it4.hasNext()) {
                it4.next().onShortcutAdded(Collections.singletonList(fbfVar));
            }
            reportShortcutUsed(context, fbfVar.getId());
            throw th;
        }
    }

    public static void removeAllDynamicShortcuts(@efb Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        Iterator<abf> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onAllShortcutsRemoved();
        }
    }

    public static void removeDynamicShortcuts(@efb Context context, @efb List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<abf> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void removeLongLivedShortcuts(@efb Context context, @efb List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<abf> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    @efb
    private static List<fbf> removeShortcutsExcludedFromSurface(@efb List<fbf> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (fbf fbfVar : list) {
            if (fbfVar.isExcludedFromSurfaces(i)) {
                arrayList.remove(fbfVar);
            }
        }
        return arrayList;
    }

    public static void reportShortcutUsed(@efb Context context, @efb String str) {
        z7d.checkNotNull(context);
        z7d.checkNotNull(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<abf> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutUsageReported(Collections.singletonList(str));
        }
    }

    public static boolean requestPinShortcut(@efb Context context, @efb fbf fbfVar, @hib IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !fbfVar.isExcludedFromSurfaces(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(fbfVar.toShortcutInfo(), intentSender);
        }
        return false;
    }

    public static boolean setDynamicShortcuts(@efb Context context, @efb List<fbf> list) {
        z7d.checkNotNull(context);
        z7d.checkNotNull(list);
        List<fbf> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        ArrayList arrayList = new ArrayList(listRemoveShortcutsExcludedFromSurface.size());
        Iterator<fbf> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        for (abf abfVar : getShortcutInfoListeners(context)) {
            abfVar.onAllShortcutsRemoved();
            abfVar.onShortcutAdded(list);
        }
        return true;
    }

    public static boolean updateShortcuts(@efb Context context, @efb List<fbf> list) {
        List<fbf> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            m17206b(context, listRemoveShortcutsExcludedFromSurface);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<fbf> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<abf> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutUpdated(list);
        }
        return true;
    }
}
