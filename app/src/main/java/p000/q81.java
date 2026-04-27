package p000;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public final class q81 {

    /* JADX INFO: renamed from: a */
    public final int f73467a;

    /* JADX INFO: renamed from: b */
    public final vj1 f73468b;

    /* JADX INFO: renamed from: c */
    public final int f73469c;

    /* JADX INFO: renamed from: d */
    public final MessageDigest f73470d;

    /* JADX INFO: renamed from: q81$a */
    public static final class C11343a extends Exception {
        public C11343a(String str) {
            super(str);
        }
    }

    public q81(@efb vj1 vj1Var, int i, int i2) {
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i2);
        }
        if (vj1Var.size() > 0 && i2 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i2);
        }
        if (vj1Var.size() == 0 && i != 0) {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i);
        }
        this.f73468b = vj1Var;
        this.f73469c = i2;
        this.f73467a = (vj1Var.size() * 8) - i;
        this.f73470d = createMd5HashMessageDigest();
    }

    public static q81 create(@efb vj1 vj1Var, int i, int i2) throws C11343a {
        if (i < 0 || i >= 8) {
            throw new C11343a("Invalid padding: " + i);
        }
        if (i2 < 0) {
            throw new C11343a("Invalid hash count: " + i2);
        }
        if (vj1Var.size() > 0 && i2 == 0) {
            throw new C11343a("Invalid hash count: " + i2);
        }
        if (vj1Var.size() != 0 || i == 0) {
            return new q81(vj1Var, i, i2);
        }
        throw new C11343a("Expected padding of 0 when bitmap length is 0, but got " + i);
    }

    @efb
    private static MessageDigest createMd5HashMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e);
        }
    }

    private int getBitIndex(long j, long j2, int i) {
        return (int) unsignedRemainder(j + (j2 * ((long) i)), this.f73467a);
    }

    private static long getLongLittleEndian(@efb byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << (i2 * 8);
        }
        return j;
    }

    private boolean isBitSet(int i) {
        return ((1 << (i % 8)) & this.f73468b.byteAt(i / 8)) != 0;
    }

    @efb
    private byte[] md5HashDigest(@efb String str) {
        return this.f73470d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long unsignedRemainder(long j, long j2) {
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (j3 < j2) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* JADX INFO: renamed from: a */
    public int m20114a() {
        return this.f73467a;
    }

    public boolean mightContain(@efb String str) {
        if (this.f73467a == 0) {
            return false;
        }
        byte[] bArrMd5HashDigest = md5HashDigest(str);
        if (bArrMd5HashDigest.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrMd5HashDigest.length + " (expected 16)");
        }
        long longLittleEndian = getLongLittleEndian(bArrMd5HashDigest, 0);
        long longLittleEndian2 = getLongLittleEndian(bArrMd5HashDigest, 8);
        for (int i = 0; i < this.f73469c; i++) {
            if (!isBitSet(getBitIndex(longLittleEndian, longLittleEndian2, i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f73469c + ", size=" + this.f73467a + ", bitmap=\"" + Base64.encodeToString(this.f73468b.toByteArray(), 2) + "\"}";
    }
}
