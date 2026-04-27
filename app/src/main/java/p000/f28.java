package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f28 {
    public static final void requirePrecondition(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(ny6Var.invoke());
    }

    public static final void throwIllegalArgumentException(@yfb String str) {
        throw new IllegalArgumentException(str);
    }
}
