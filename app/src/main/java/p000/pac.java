package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.mediarouter.media.C1333c;

/* JADX INFO: loaded from: classes3.dex */
public class pac {

    /* JADX INFO: renamed from: a */
    public static final String f70164a = cj9.tagWithPrefix("PackageManagerHelper");

    private pac() {
    }

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> klazz) {
        return isComponentExplicitlyEnabled(context, klazz.getName());
    }

    public static void setComponentEnabled(@efb Context context, @efb Class<?> klazz, boolean enabled) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            cj9.get().debug(f70164a, String.format("%s %s", klazz.getName(), enabled ? C1333c.f10210i : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            cj9.get().debug(f70164a, String.format("%s could not be %s", klazz.getName(), enabled ? C1333c.f10210i : "disabled"), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1;
    }
}
