package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qv1 {
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final char Char(int i) {
        if (i >= 0 && i <= 65535) {
            return (char) i;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i);
    }

    private static final int getCode(char c) {
        return c;
    }

    @jjf(version = "1.5")
    @t28
    @cd8
    @ihi(markerClass = {rh5.class})
    public static /* synthetic */ void getCode$annotations(char c) {
    }
}
