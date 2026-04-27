package p000;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dk5 {
    private dk5() {
    }

    @bkd
    public static void checkContainerInput(boolean z, @hib String str) throws xhc {
        if (!z) {
            throw xhc.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(zj5 zj5Var, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zj5Var.peekFully(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int peekToLength(zj5 zj5Var, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iPeek = zj5Var.peek(bArr, i + i3, i2 - i3);
            if (iPeek == -1) {
                break;
            }
            i3 += iPeek;
        }
        return i3;
    }

    public static boolean readFullyQuietly(zj5 zj5Var, byte[] bArr, int i, int i2) throws IOException {
        try {
            zj5Var.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(zj5 zj5Var, int i) throws IOException {
        try {
            zj5Var.skipFully(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
