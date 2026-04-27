package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g28 {
    public static final void checkPrecondition(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        throwIllegalStateException(ny6Var.invoke());
    }

    @yfb
    public static final <T> T checkPreconditionNotNull(@gib T t, @yfb ny6<String> ny6Var) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck(ny6Var.invoke());
        throw new us8();
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

    @yfb
    public static final Void throwIllegalStateExceptionForNullCheck(@yfb String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z) {
        if (z) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    @yfb
    public static final <T> T checkPreconditionNotNull(@gib T t) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new us8();
    }
}
