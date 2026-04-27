package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x2i {

    /* JADX INFO: renamed from: d */
    public static final int f96105d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f96106e = 1;

    /* JADX INFO: renamed from: f */
    public static final long[] f96107f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f96108a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f96109b;

    /* JADX INFO: renamed from: c */
    public int f96110c;

    public static long assembleVarint(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f96107f[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int parseUnsignedVarintLength(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f96107f;
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
        return this.f96110c;
    }

    public long readUnsignedVarint(zj5 zj5Var, boolean z, boolean z2, int i) throws IOException {
        if (this.f96109b == 0) {
            if (!zj5Var.readFully(this.f96108a, 0, 1, z)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.f96108a[0] & 255);
            this.f96110c = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f96109b = 1;
        }
        int i2 = this.f96110c;
        if (i2 > i) {
            this.f96109b = 0;
            return -2L;
        }
        if (i2 != 1) {
            zj5Var.readFully(this.f96108a, 1, i2 - 1);
        }
        this.f96109b = 0;
        return assembleVarint(this.f96108a, this.f96110c, z2);
    }

    public void reset() {
        this.f96109b = 0;
        this.f96110c = 0;
    }
}
