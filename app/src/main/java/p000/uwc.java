package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@qx4
public final class uwc {
    private uwc() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23617a(@wx1 Throwable t, Class<? extends Throwable> expectedClass) {
        return expectedClass.isInstance(t);
    }

    /* JADX INFO: renamed from: b */
    public static void m23618b(Throwable t) {
        v7d.checkNotNull(t);
        if (t instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
