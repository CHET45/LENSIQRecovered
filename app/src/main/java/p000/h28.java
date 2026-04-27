package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h28 {

    /* JADX INFO: renamed from: a */
    public static final long f42104a = -9223372034707292160L;

    public static final void checkPrecondition(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        throwIllegalStateException(ny6Var.invoke());
    }

    public static final void requirePrecondition(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(ny6Var.invoke());
    }

    public static final void throwIllegalArgumentException(@yfb String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@yfb String str) {
        throw new IllegalStateException(str);
    }
}
