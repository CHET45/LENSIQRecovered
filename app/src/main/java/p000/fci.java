package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class fci {

    /* JADX INFO: renamed from: a */
    public static final String f36149a = "ViewUtils";

    /* JADX INFO: renamed from: b */
    public static Method f36150b;

    /* JADX INFO: renamed from: c */
    @sy1(api = 27)
    @p7e({p7e.EnumC10826a.f69934a})
    public static final boolean f36151c;

    static {
        f36151c = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f36150b = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f36150b.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    private fci() {
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect2) {
        Method method = f36150b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return o8i.getLayoutDirection(view) == 1;
    }

    public static void makeOptionalFitsSystemWindows(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
