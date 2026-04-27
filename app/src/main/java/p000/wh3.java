package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wh3 {
    private wh3() {
    }

    public static void closeQuietly(@hib gh3 gh3Var) {
        if (gh3Var != null) {
            try {
                gh3Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(gh3 gh3Var, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = gh3Var.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i2 + " < " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] readToEnd(gh3 gh3Var) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i = gh3Var.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i2);
    }
}
