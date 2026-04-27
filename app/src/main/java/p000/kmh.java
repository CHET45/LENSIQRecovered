package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class kmh<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public Class<?> f54766a;

    public kmh() {
        this.f54766a = findExpectedType(getClass());
    }

    private static Class<?> findExpectedType(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : xua.getDeclaredMethods(cls)) {
                if (isMatchesSafelyMethod(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    private static boolean isMatchesSafelyMethod(Method method) {
        return method.getName().equals("matchesSafely") && method.getParameterTypes().length == 1 && !method.isSynthetic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yv9
    public final boolean matches(Object obj) {
        return obj != 0 && this.f54766a.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public kmh(Class<T> cls) {
        this.f54766a = cls;
    }
}
