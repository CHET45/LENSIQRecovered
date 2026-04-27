package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
public class r1i extends q1i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkHyphenAt$UuidKt__UuidKt(String str, int i) {
        if (str.charAt(i) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i + ", but was '" + str.charAt(i) + '\'').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void formatBytesInto$UuidKt__UuidKt(long j, byte[] bArr, int i, int i2) {
        int i3 = i + (i2 * 2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = tj7.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) (255 & j)];
            bArr[i3 - 1] = (byte) i5;
            i3 -= 2;
            bArr[i3] = (byte) (i5 >> 8);
            j >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toByteArray$UuidKt__UuidKt(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toLong$UuidKt__UuidKt(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    @yfb
    @zh5
    public static final m1i uuidFromRandomBytes(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "randomBytes");
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        return m1i.f59664c.fromByteArray(bArr);
    }
}
