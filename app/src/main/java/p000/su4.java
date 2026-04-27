package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.material.C3146R;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.tu4;

/* JADX INFO: loaded from: classes5.dex */
public class su4 {

    /* JADX INFO: renamed from: a */
    public static final int[] f82874a = {C3146R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b */
    public static final InterfaceC12786c f82875b;

    /* JADX INFO: renamed from: c */
    @igg({"PrivateApi"})
    public static final InterfaceC12786c f82876c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, InterfaceC12786c> f82877d;

    /* JADX INFO: renamed from: e */
    public static final Map<String, InterfaceC12786c> f82878e;

    /* JADX INFO: renamed from: f */
    public static final int f82879f = 0;

    /* JADX INFO: renamed from: su4$a */
    public class C12784a implements InterfaceC12786c {
        @Override // p000.su4.InterfaceC12786c
        public boolean isSupported() {
            return true;
        }
    }

    /* JADX INFO: renamed from: su4$b */
    public class C12785b implements InterfaceC12786c {

        /* JADX INFO: renamed from: a */
        public Long f82880a;

        @Override // p000.su4.InterfaceC12786c
        public boolean isSupported() {
            if (this.f82880a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.f82880a = l;
                } catch (Exception unused) {
                    this.f82880a = -1L;
                }
            }
            return this.f82880a.longValue() >= 40100;
        }
    }

    /* JADX INFO: renamed from: su4$c */
    public interface InterfaceC12786c {
        boolean isSupported();
    }

    /* JADX INFO: renamed from: su4$d */
    public static class C12787d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public final tu4 f82881a;

        public C12787d(@efb tu4 tu4Var) {
            this.f82881a = tu4Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@efb Activity activity, @hib Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@efb Activity activity, @hib Bundle bundle) {
            su4.applyToActivityIfAvailable(activity, this.f82881a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@efb Activity activity, @efb Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@efb Activity activity) {
        }
    }

    /* JADX INFO: renamed from: su4$e */
    public interface InterfaceC12788e {
        void onApplied(@efb Activity activity);
    }

    /* JADX INFO: renamed from: su4$f */
    public interface InterfaceC12789f {
        boolean shouldApplyDynamicColors(@efb Activity activity, @dbg int i);
    }

    static {
        C12784a c12784a = new C12784a();
        f82875b = c12784a;
        C12785b c12785b = new C12785b();
        f82876c = c12785b;
        HashMap map = new HashMap();
        map.put("fcnt", c12784a);
        map.put("google", c12784a);
        map.put("hmd global", c12784a);
        map.put("infinix", c12784a);
        map.put("infinix mobility limited", c12784a);
        map.put("itel", c12784a);
        map.put("kyocera", c12784a);
        map.put("lenovo", c12784a);
        map.put(as9.f11747a, c12784a);
        map.put("motorola", c12784a);
        map.put("nothing", c12784a);
        map.put("oneplus", c12784a);
        map.put("oppo", c12784a);
        map.put("realme", c12784a);
        map.put("robolectric", c12784a);
        map.put(as9.f11748b, c12785b);
        map.put("sharp", c12784a);
        map.put("sony", c12784a);
        map.put("tcl", c12784a);
        map.put("tecno", c12784a);
        map.put("tecno mobile limited", c12784a);
        map.put("vivo", c12784a);
        map.put("wingtech", c12784a);
        map.put("xiaomi", c12784a);
        f82877d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c12784a);
        map2.put("jio", c12784a);
        f82878e = Collections.unmodifiableMap(map2);
    }

    private su4() {
    }

    @Deprecated
    public static void applyIfAvailable(@efb Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(@efb Application application) {
        applyToActivitiesIfAvailable(application, new tu4.C13242c().build());
    }

    public static void applyToActivityIfAvailable(@efb Activity activity) {
        applyToActivityIfAvailable(activity, new tu4.C13242c().build());
    }

    private static int getDefaultThemeOverlay(@efb Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f82874a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @sy1(api = 31)
    @igg({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (nf1.isAtLeastT()) {
            return true;
        }
        InterfaceC12786c interfaceC12786c = f82877d.get(Build.MANUFACTURER.toLowerCase());
        if (interfaceC12786c == null) {
            interfaceC12786c = f82878e.get(Build.BRAND.toLowerCase());
        }
        return interfaceC12786c != null && interfaceC12786c.isSupported();
    }

    @efb
    public static Context wrapContextIfAvailable(@efb Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(@efb Activity activity, @dbg int i) {
        applyToActivityIfAvailable(activity, new tu4.C13242c().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@efb Application application, @dbg int i) {
        applyToActivitiesIfAvailable(application, new tu4.C13242c().setThemeOverlay(i).build());
    }

    public static void applyToActivityIfAvailable(@efb Activity activity, @efb tu4 tu4Var) {
        if (isDynamicColorAvailable()) {
            int defaultThemeOverlay = tu4Var.getContentBasedSeedColor() == null ? tu4Var.getThemeOverlay() == 0 ? getDefaultThemeOverlay(activity) : tu4Var.getThemeOverlay() : 0;
            if (tu4Var.getPrecondition().shouldApplyDynamicColors(activity, defaultThemeOverlay)) {
                if (tu4Var.getContentBasedSeedColor() != null) {
                    kqe kqeVar = new kqe(bi7.fromInt(tu4Var.getContentBasedSeedColor().intValue()), !hw9.resolveBoolean(activity, C3146R.attr.isLightTheme, true), 0.0d);
                    ea2 ea2Var = ea2.getInstance();
                    if (ea2Var == null || !ea2Var.applyIfPossible(activity, nw9.createColorResourcesIdsToColorValues(kqeVar))) {
                        return;
                    }
                } else {
                    fxg.m11228a(activity, defaultThemeOverlay);
                }
                tu4Var.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @efb
    public static Context wrapContextIfAvailable(@efb Context context, @dbg int i) {
        if (!isDynamicColorAvailable()) {
            return context;
        }
        if (i == 0) {
            i = getDefaultThemeOverlay(context);
        }
        return i == 0 ? context : new ContextThemeWrapper(context, i);
    }

    @Deprecated
    public static void applyIfAvailable(@efb Activity activity, @efb InterfaceC12789f interfaceC12789f) {
        applyToActivityIfAvailable(activity, new tu4.C13242c().setPrecondition(interfaceC12789f).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@efb Application application, @efb InterfaceC12789f interfaceC12789f) {
        applyToActivitiesIfAvailable(application, new tu4.C13242c().setPrecondition(interfaceC12789f).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@efb Application application, @dbg int i, @efb InterfaceC12789f interfaceC12789f) {
        applyToActivitiesIfAvailable(application, new tu4.C13242c().setThemeOverlay(i).setPrecondition(interfaceC12789f).build());
    }

    public static void applyToActivitiesIfAvailable(@efb Application application, @efb tu4 tu4Var) {
        application.registerActivityLifecycleCallbacks(new C12787d(tu4Var));
    }
}
