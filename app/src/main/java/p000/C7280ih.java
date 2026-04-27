package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.blankj.utilcode.util.C2479l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes3.dex */
public final class C7280ih {

    /* JADX INFO: renamed from: a */
    public static List<Field> f46985a;

    /* JADX INFO: renamed from: ih$a */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C7280ih.preLoad();
        }
    }

    private C7280ih() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @efb
    public static Resources adaptHeight(@efb Resources resources, int i) {
        if (resources == null) {
            throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Resources resourcesAdaptHeight = adaptHeight(resources, i, false);
        if (resourcesAdaptHeight != null) {
            return resourcesAdaptHeight;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.AdaptScreenUtils.adaptHeight() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static Resources adaptWidth(@efb Resources resources, int i) {
        if (resources == null) {
            throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i);
        return resources;
    }

    private static void applyDisplayMetrics(@efb Resources resources, float f) {
        if (resources == null) {
            throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        resources.getDisplayMetrics().xdpi = f;
        C2479l.getApp().getResources().getDisplayMetrics().xdpi = f;
        applyOtherDisplayMetrics(resources, f);
    }

    private static void applyMetricsFields(Resources resources, float f) {
        Iterator<Field> it = f46985a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void applyOtherDisplayMetrics(Resources resources, float f) {
        if (f46985a != null) {
            applyMetricsFields(resources, f);
            return;
        }
        f46985a = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                    if (metricsFromField != null) {
                        f46985a.add(field);
                        metricsFromField.xdpi = f;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            } else {
                declaredFields = superclass.getDeclaredFields();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Runnable m13084b() {
        return new a();
    }

    @efb
    public static Resources closeAdapt(@efb Resources resources) {
        if (resources == null) {
            throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        applyDisplayMetrics(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics getMetricsFromField(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getNavBarHeight(@efb Resources resources) {
        if (resources == null) {
            throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoad() {
        applyDisplayMetrics(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int pt2Px(float f) {
        return (int) (((double) ((f * C2479l.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f)) + 0.5d);
    }

    public static int px2Pt(float f) {
        return (int) (((double) ((f * 72.0f) / C2479l.getApp().getResources().getDisplayMetrics().xdpi)) + 0.5d);
    }

    @efb
    public static Resources adaptHeight(@efb Resources resources, int i, boolean z) {
        if (resources != null) {
            applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z ? getNavBarHeight(resources) : 0)) * 72.0f) / i);
            return resources;
        }
        throw new NullPointerException("Argument 'resources' of type Resources (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
