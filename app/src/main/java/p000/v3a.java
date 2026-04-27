package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v3a {
    public static final int addExactOrElse(int i, int i2, @yfb ny6<Integer> ny6Var) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ny6Var.invoke().intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, @yfb ny6<Integer> ny6Var) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ny6Var.invoke().intValue() : i3;
    }
}
