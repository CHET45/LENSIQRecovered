package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class it2 {

    /* JADX INFO: renamed from: a */
    public static final Method f48182a;

    /* JADX INFO: renamed from: b */
    public static final Method f48183b;

    static {
        Method method;
        Method method2 = null;
        try {
            Class<?> cls = Class.forName("org.conscrypt.Conscrypt");
            Method method3 = cls.getMethod("newProvider", null);
            method = cls.getMethod("isConscrypt", Provider.class);
            method2 = method3;
        } catch (ClassNotFoundException unused) {
            method = null;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
        f48182a = method2;
        f48183b = method;
    }

    public static boolean isConscrypt(Provider provider) {
        if (!isPresent()) {
            return false;
        }
        try {
            return ((Boolean) f48183b.invoke(null, provider)).booleanValue();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean isPresent() {
        return f48182a != null;
    }

    public static Provider newProvider() throws Throwable {
        if (isPresent()) {
            return (Provider) f48182a.invoke(null, null);
        }
        Class.forName("org.conscrypt.Conscrypt");
        throw new AssertionError("Unexpected failure referencing Conscrypt class");
    }
}
