package p000;

/* JADX INFO: loaded from: classes7.dex */
public class sq5 {

    /* JADX INFO: renamed from: b */
    public static final String f82585b = "sq5";

    /* JADX INFO: renamed from: a */
    public EnumC12745b f82586a = EnumC12745b.Original;

    /* JADX INFO: renamed from: sq5$a */
    public static /* synthetic */ class C12744a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82587a;

        static {
            int[] iArr = new int[EnumC12745b.values().length];
            f82587a = iArr;
            try {
                iArr[EnumC12745b.Original.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82587a[EnumC12745b.Maximal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: sq5$b */
    public enum EnumC12745b {
        Original,
        Music,
        People,
        Maximal
    }

    public sq5(EnumC12745b enumC12745b) {
    }

    private byte[] doFftMaximal(double[] dArr) {
        byte[] softBytes = yj1.toSoftBytes(dArr);
        int length = softBytes.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < softBytes.length; i++) {
            if (isSimpleData(softBytes, i)) {
                bArr[i] = softBytes[i];
            } else {
                bArr[Math.max(i - 1, 0)] = (byte) (softBytes[i] / 2);
                bArr[Math.min(i + 1, length - 1)] = (byte) (softBytes[i] / 2);
            }
        }
        return bArr;
    }

    private boolean isSimpleData(byte[] bArr, int i) {
        int iMin = Math.min(bArr.length, i + 5);
        byte b = 127;
        byte b2 = 0;
        for (int iMax = Math.max(0, i - 5); iMax < iMin; iMax++) {
            byte b3 = bArr[iMax];
            if (b3 > b2) {
                b2 = b3;
            }
            if (b3 < b) {
                b = b3;
            }
        }
        byte b4 = bArr[i];
        return b4 == b || b4 == b2;
    }

    public byte[] makeFftData(byte[] bArr) {
        if (bArr.length < 1024) {
            ij9.m13135d(f82585b, "makeFftData", new Object[0]);
            return null;
        }
        double[] dArrFft = co5.fft(yj1.toHardDouble(yj1.toShorts(bArr)), 0);
        return C12744a.f82587a[this.f82586a.ordinal()] != 1 ? yj1.toHardBytes(dArrFft) : yj1.toSoftBytes(dArrFft);
    }
}
