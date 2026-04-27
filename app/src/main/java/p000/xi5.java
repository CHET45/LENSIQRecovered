package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xi5 {

    /* JADX INFO: renamed from: a */
    public static final String f98063a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b */
    public static final Class<?> f98064b = m25204b();

    /* JADX INFO: renamed from: a */
    public static boolean m25203a(yi5 registry) {
        Class<?> cls;
        return (lhd.f57633d || (cls = f98064b) == null || !cls.isAssignableFrom(registry.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m25204b() {
        try {
            return Class.forName(f98063a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static yi5 create() {
        yi5 yi5VarInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return yi5VarInvokeSubclassFactory != null ? yi5VarInvokeSubclassFactory : new yi5();
    }

    public static yi5 createEmpty() {
        yi5 yi5VarInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return yi5VarInvokeSubclassFactory != null ? yi5VarInvokeSubclassFactory : yi5.f101692e;
    }

    private static final yi5 invokeSubclassFactory(String methodName) {
        Class<?> cls = f98064b;
        if (cls == null) {
            return null;
        }
        try {
            return (yi5) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
