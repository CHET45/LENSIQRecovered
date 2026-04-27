package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class akg {

    /* JADX INFO: renamed from: a */
    public static final int f1849a = Runtime.getRuntime().availableProcessors();

    public static final int getAVAILABLE_PROCESSORS() {
        return f1849a;
    }

    @gib
    public static final String systemProp(@yfb String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
