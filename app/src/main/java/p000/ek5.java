package p000;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ek5 {
    private ek5() {
    }

    @bkd
    public static void checkContainerInput(boolean z, @hib String str) throws yhc {
        if (!z) {
            throw yhc.createForMalformedContainer(str, null);
        }
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean peekFullyQuietly(ak5 ak5Var, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return ak5Var.peekFully(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int peekToLength(ak5 ak5Var, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iPeek = ak5Var.peek(bArr, i + i3, i2 - i3);
            if (iPeek == -1) {
                break;
            }
            i3 += iPeek;
        }
        return i3;
    }

    public static boolean readFullyQuietly(ak5 ak5Var, byte[] bArr, int i, int i2) throws IOException {
        try {
            ak5Var.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ak5 ak5Var, int i) throws IOException {
        try {
            ak5Var.skipFully(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
