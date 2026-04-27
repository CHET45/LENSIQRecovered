package p000;

/* JADX INFO: loaded from: classes5.dex */
public class r80 {
    public static AssertionError fail(String str, Object... objArr) {
        throw new AssertionError(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    public static void hardAssert(boolean z, String str, Object... objArr) {
        if (!z) {
            throw fail(str, objArr);
        }
    }

    public static <T> T hardAssertNonNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw fail(str, objArr);
    }

    public static AssertionError fail(Throwable th, String str, Object... objArr) {
        throw n10.newAssertionError(format(str, objArr), th);
    }
}
