package p000;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,102:1\n26#2:103\n26#2:104\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:103\n59#1:104\n*E\n"})
public final class ur1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ur1 f88828a = new ur1();

    /* JADX INFO: renamed from: b */
    @gib
    public static Method f88829b;

    /* JADX INFO: renamed from: c */
    @gib
    public static Method f88830c;

    /* JADX INFO: renamed from: d */
    public static boolean f88831d;

    private ur1() {
    }

    @igg({"SoonBlockedPrivateApi"})
    public final void enableZ(@yfb Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            xr1.f99013a.enableZ(canvas, z);
            return;
        }
        if (!f88831d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f88829b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f88830c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f88829b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f88830c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f88829b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f88830c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f88831d = true;
        }
        if (z) {
            try {
                Method method4 = f88829b;
                if (method4 != null) {
                    md8.checkNotNull(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f88830c) == null) {
            return;
        }
        md8.checkNotNull(method);
        method.invoke(canvas, null);
    }
}
