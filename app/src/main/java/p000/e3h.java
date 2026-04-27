package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e3h {
    public static final void toCharArray(@yfb CharSequence charSequence, @yfb char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof jrg) {
            ((jrg) charSequence).toCharArray(cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }
}
