package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class uu3 {

    /* JADX INFO: renamed from: a */
    public static final boolean f89149a = zjg.systemProp("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final o34 f89150b = initializeDefaultDelay();

    @yfb
    public static final o34 getDefaultDelay() {
        return f89150b;
    }

    @yjd
    public static /* synthetic */ void getDefaultDelay$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final o34 initializeDefaultDelay() {
        if (!f89149a) {
            return tu3.f85932F;
        }
        dr9 main = df4.getMain();
        return (gr9.isMissing(main) || !(main instanceof o34)) ? tu3.f85932F : (o34) main;
    }
}
