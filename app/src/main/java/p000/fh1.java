package p000;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fh1 {

    /* JADX INFO: renamed from: a */
    public static final String f36566a = "BundleUtil";

    /* JADX INFO: renamed from: b */
    @hib
    public static Method f36567b;

    /* JADX INFO: renamed from: c */
    @hib
    public static Method f36568c;

    private fh1() {
    }

    @hib
    public static IBinder getBinder(Bundle bundle, @hib String str) {
        return x0i.f95978a >= 18 ? bundle.getBinder(str) : getBinderByReflection(bundle, str);
    }

    @hib
    private static IBinder getBinderByReflection(Bundle bundle, @hib String str) {
        Method method = f36567b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f36567b = method2;
                method2.setAccessible(true);
                method = f36567b;
            } catch (NoSuchMethodException e) {
                yh9.m25918i(f36566a, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            yh9.m25918i(f36566a, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, @hib String str, @hib IBinder iBinder) {
        if (x0i.f95978a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static void putBinderByReflection(Bundle bundle, @hib String str, @hib IBinder iBinder) {
        Method method = f36568c;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f36568c = method2;
                method2.setAccessible(true);
                method = f36568c;
            } catch (NoSuchMethodException e) {
                yh9.m25918i(f36566a, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            yh9.m25918i(f36566a, "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
