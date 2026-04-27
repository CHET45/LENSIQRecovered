package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dxc {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final cxc f31254a = new ah8();

    @jjf(version = "1.2")
    @yjd
    public static final boolean apiVersionIsAtLeast(int i, int i2, int i3) {
        return ys8.f102893m.isAtLeast(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final /* synthetic */ <T> T castToBaseType(Object obj) throws ClassNotFoundException {
        try {
            md8.reifiedOperationMarker(1, "T");
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            md8.reifiedOperationMarker(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (md8.areEqual(classLoader, classLoader2)) {
                throw e;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
        }
    }
}
