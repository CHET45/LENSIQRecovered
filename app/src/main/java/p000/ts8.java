package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class ts8 {
    private ts8() {
    }

    @hib
    public static String detectVersion() {
        try {
            return ys8.f102893m.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
