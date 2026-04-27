package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y2i {

    /* JADX INFO: renamed from: d */
    public static final int f100199d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f100200e = 1;

    /* JADX INFO: renamed from: f */
    public static final long[] f100201f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f100202a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f100203b;

    /* JADX INFO: renamed from: c */
    public int f100204c;

    public static long assembleVarint(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f100201f[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int parseUnsignedVarintLength(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f100201f;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public int getLastLength() {
        return this.f100204c;
    }

    public long readUnsignedVarint(ak5 ak5Var, boolean z, boolean z2, int i) throws IOException {
        if (this.f100203b == 0) {
            if (!ak5Var.readFully(this.f100202a, 0, 1, z)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.f100202a[0] & 255);
            this.f100204c = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f100203b = 1;
        }
        int i2 = this.f100204c;
        if (i2 > i) {
            this.f100203b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ak5Var.readFully(this.f100202a, 1, i2 - 1);
        }
        this.f100203b = 0;
        return assembleVarint(this.f100202a, this.f100204c, z2);
    }

    public void reset() {
        this.f100203b = 0;
        this.f100204c = 0;
    }
}
