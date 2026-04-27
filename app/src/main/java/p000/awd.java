package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class awd {

    /* JADX INFO: renamed from: a */
    public final String f12038a;

    /* JADX INFO: renamed from: b */
    public final int f12039b;

    /* JADX INFO: renamed from: c */
    public final int f12040c;

    public awd(String str, int i, int i2) {
        this.f12038a = str;
        this.f12039b = i;
        this.f12040c = i2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2711a(Method method) {
        return method.getName().equals(this.f12038a) && method.getParameterTypes().length == this.f12039b && !method.isSynthetic();
    }

    /* JADX INFO: renamed from: b */
    public Class<?> m2712b(Method method) {
        return method.getParameterTypes()[this.f12040c];
    }

    public Class<?> findExpectedType(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (m2711a(method)) {
                    return m2712b(method);
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for " + this.f12038a + "() method.");
    }
}
