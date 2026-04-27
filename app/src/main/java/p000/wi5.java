package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class wi5 {

    /* JADX INFO: renamed from: a */
    public static final String f94303a = "com.google.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b */
    public static final Class<?> f94304b = m24570b();

    /* JADX INFO: renamed from: a */
    public static boolean m24569a(zi5 registry) {
        Class<?> cls = f94304b;
        return cls != null && cls.isAssignableFrom(registry.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m24570b() {
        try {
            return Class.forName(f94303a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zi5 create() {
        zi5 zi5VarInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return zi5VarInvokeSubclassFactory != null ? zi5VarInvokeSubclassFactory : new zi5();
    }

    public static zi5 createEmpty() {
        zi5 zi5VarInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return zi5VarInvokeSubclassFactory != null ? zi5VarInvokeSubclassFactory : zi5.f105155f;
    }

    private static final zi5 invokeSubclassFactory(String methodName) {
        Class<?> cls = f94304b;
        if (cls == null) {
            return null;
        }
        try {
            return (zi5) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
