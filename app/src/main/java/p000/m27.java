package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m27 {
    public static final void toCharArray(@yfb String str, @yfb char[] cArr, int i, int i2, int i3) {
        md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i2, i3, cArr, i);
    }
}
