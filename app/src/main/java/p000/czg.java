package p000;

/* JADX INFO: loaded from: classes8.dex */
public final class czg {
    private czg() {
    }

    private static <T extends Throwable> void rethrow(Throwable th) throws Throwable {
        throw th;
    }

    public static Exception rethrowAsException(Throwable th) throws Exception {
        rethrow(th);
        return null;
    }
}
