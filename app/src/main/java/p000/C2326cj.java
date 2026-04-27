package p000;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: cj */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C2326cj {

    /* JADX INFO: renamed from: a */
    public final Cipher f16669a;

    /* JADX INFO: renamed from: b */
    public final int f16670b;

    /* JADX INFO: renamed from: c */
    public final byte[] f16671c;

    /* JADX INFO: renamed from: d */
    public final byte[] f16672d;

    /* JADX INFO: renamed from: e */
    public int f16673e;

    public C2326cj(int i, byte[] bArr, @hib String str, long j) {
        this(i, bArr, getFNV64Hash(str), j);
    }

    private static long getFNV64Hash(@hib String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        for (int i = 0; i < str.length(); i++) {
            long jCharAt = j ^ ((long) str.charAt(i));
            j = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j;
    }

    private byte[] getInitializationVector(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.f16669a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i;
        do {
            int i5 = this.f16673e;
            if (i5 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i4, i2, bArr2, i3);
                if (i2 == iNonFlushingUpdate) {
                    return;
                }
                int i6 = i2 - iNonFlushingUpdate;
                int i7 = 0;
                v80.checkState(i6 < this.f16670b);
                int i8 = i3 + iNonFlushingUpdate;
                int i9 = this.f16670b - i6;
                this.f16673e = i9;
                v80.checkState(nonFlushingUpdate(this.f16671c, 0, i9, this.f16672d, 0) == this.f16670b);
                while (i7 < i6) {
                    bArr2[i8] = this.f16672d[i7];
                    i7++;
                    i8++;
                }
                return;
            }
            bArr2[i3] = (byte) (bArr[i4] ^ this.f16672d[this.f16670b - i5]);
            i3++;
            i4++;
            this.f16673e = i5 - 1;
            i2--;
        } while (i2 != 0);
    }

    public void updateInPlace(byte[] bArr, int i, int i2) {
        update(bArr, i, i2, bArr, i);
    }

    public C2326cj(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f16669a = cipher;
            int blockSize = cipher.getBlockSize();
            this.f16670b = blockSize;
            this.f16671c = new byte[blockSize];
            this.f16672d = new byte[blockSize];
            long j3 = j2 / ((long) blockSize);
            int i2 = (int) (j2 % ((long) blockSize));
            cipher.init(i, new SecretKeySpec(bArr, t0i.splitAtFirst(cipher.getAlgorithm(), pj4.f71071b)[0]), new IvParameterSpec(getInitializationVector(j, j3)));
            if (i2 != 0) {
                updateInPlace(new byte[i2], 0, i2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
