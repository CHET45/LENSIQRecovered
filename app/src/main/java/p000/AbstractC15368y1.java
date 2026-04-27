package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class AbstractC15368y1 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public static final Object[] f99995a = new Object[0];

    private static boolean isProxyOfSameInterfaces(Object arg, Class<?> proxyClass) {
        return proxyClass.isInstance(arg) || (Proxy.isProxyClass(arg.getClass()) && Arrays.equals(arg.getClass().getInterfaces(), proxyClass.getInterfaces()));
    }

    @wx1
    /* JADX INFO: renamed from: a */
    public abstract Object m25583a(Object proxy, Method method, Object[] args) throws Throwable;

    public boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @wx1
    public final Object invoke(Object proxy, Method method, @wx1 Object[] args) throws Throwable {
        if (args == null) {
            args = f99995a;
        }
        if (args.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (args.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (args.length == 0 && method.getName().equals("toString")) ? toString() : m25583a(proxy, method, args);
        }
        Object obj = args[0];
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (proxy == obj) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(isProxyOfSameInterfaces(obj, proxy.getClass()) && equals(Proxy.getInvocationHandler(obj)));
    }

    public String toString() {
        return super.toString();
    }
}
