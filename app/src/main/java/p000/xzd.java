package p000;

/* JADX INFO: loaded from: classes3.dex */
public enum xzd {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: xzd$a */
    public static /* synthetic */ class C15360a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99799a;

        static {
            int[] iArr = new int[xzd.values().length];
            f99799a = iArr;
            try {
                iArr[xzd.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99799a[xzd.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99799a[xzd.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = C15360a.f99799a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
