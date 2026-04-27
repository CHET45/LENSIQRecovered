package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class s72 {
    /* JADX INFO: renamed from: a */
    public static void m21764a(Object key, Object value) {
        if (key == null) {
            throw new NullPointerException("null key in entry: null=" + value);
        }
        if (value != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + key + "=null");
    }

    @op1
    /* JADX INFO: renamed from: b */
    public static int m21765b(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    @op1
    /* JADX INFO: renamed from: c */
    public static long m21766c(long value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    /* JADX INFO: renamed from: d */
    public static void m21767d(int value, String name) {
        if (value > 0) {
            return;
        }
        throw new IllegalArgumentException(name + " must be positive but was: " + value);
    }

    /* JADX INFO: renamed from: e */
    public static void m21768e(boolean canRemove) {
        v7d.checkState(canRemove, "no calls to next() since the last call to remove()");
    }
}
