package p000;

import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class pgg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final pgg f70716a = new pgg();

    /* JADX INFO: renamed from: b */
    @gib
    public static Method f70717b;

    /* JADX INFO: renamed from: c */
    public static boolean f70718c;

    private pgg() {
    }

    @igg({"BanUncheckedReflection"})
    private final Canvas lockCanvasFallback(Surface surface) throws IllegalAccessException, InvocationTargetException {
        Method methodResolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (methodResolveLockHardwareCanvasMethod == null) {
            return surface.lockCanvas(null);
        }
        Object objInvoke = methodResolveLockHardwareCanvasMethod.invoke(surface, null);
        md8.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) objInvoke;
    }

    @igg({"BanUncheckedReflection"})
    private final Method resolveLockHardwareCanvasMethod() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = f70717b;
                if (f70718c) {
                    method = method2;
                } else {
                    f70718c = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    f70717b = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                f70717b = null;
            }
        }
        return method;
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    @c5e(22)
    @yfb
    public final Canvas lockCanvas(@yfb Surface surface) {
        return qgg.f74396a.lockHardwareCanvas(surface);
    }
}
