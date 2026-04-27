package p000;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class tr1 {

    /* JADX INFO: renamed from: a */
    public static Method f85643a;

    /* JADX INFO: renamed from: b */
    public static Method f85644b;

    /* JADX INFO: renamed from: c */
    public static boolean f85645c;

    private tr1() {
    }

    @igg({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static void m22753a(@efb Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f85645c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f85643a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f85644b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f85645c = true;
        }
        if (z) {
            try {
                Method method2 = f85643a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f85644b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
