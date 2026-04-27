package p000;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class m9i {

    /* JADX INFO: renamed from: a */
    public static boolean f60301a = true;

    /* JADX INFO: renamed from: b */
    public static Method f60302b;

    /* JADX INFO: renamed from: c */
    public static boolean f60303c;

    private m9i() {
    }

    /* JADX INFO: renamed from: a */
    public static int m17177a(@efb ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f60303c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f60302b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f60303c = true;
        }
        Method method = f60302b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static j9i m17178b(@efb ViewGroup viewGroup) {
        return new h9i(viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public static void m17179c(@efb ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            hiddenSuppressLayout(viewGroup, z);
        }
    }

    @c5e(18)
    @igg({"NewApi"})
    private static void hiddenSuppressLayout(@efb ViewGroup viewGroup, boolean z) {
        if (f60301a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f60301a = false;
            }
        }
    }
}
