package p000;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class xh7 {

    /* JADX INFO: renamed from: a */
    public static final int f97830a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: xh7$b */
    @tw7
    public static abstract class EnumC15074b implements sy7<Checksum> {

        /* JADX INFO: renamed from: b */
        public static final EnumC15074b f97831b = new a("CRC_32", 0, "Hashing.crc32()");

        /* JADX INFO: renamed from: c */
        public static final EnumC15074b f97832c = new b("ADLER_32", 1, "Hashing.adler32()");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC15074b[] f97833d = $values();

        /* JADX INFO: renamed from: a */
        public final lh7 f97834a;

        /* JADX INFO: renamed from: xh7$b$a */
        public enum a extends EnumC15074b {
            public a(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // p000.lfg
            public Checksum get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: xh7$b$b */
        public enum b extends EnumC15074b {
            public b(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // p000.lfg
            public Checksum get() {
                return new Adler32();
            }
        }

        private static /* synthetic */ EnumC15074b[] $values() {
            return new EnumC15074b[]{f97831b, f97832c};
        }

        public static EnumC15074b valueOf(String name) {
            return (EnumC15074b) Enum.valueOf(EnumC15074b.class, name);
        }

        public static EnumC15074b[] values() {
            return (EnumC15074b[]) f97833d.clone();
        }

        private EnumC15074b(String $enum$name, int $enum$ordinal, String toString) {
            this.f97834a = new ty1(this, 32, toString);
        }
    }

    /* JADX INFO: renamed from: xh7$c */
    public static final class C15075c extends AbstractC11199q0 {
        @Override // p000.AbstractC11199q0
        /* JADX INFO: renamed from: a */
        public jh7 mo19900a(wh7[] hashers) {
            byte[] bArr = new byte[bits() / 8];
            int iWriteBytesTo = 0;
            for (wh7 wh7Var : hashers) {
                jh7 jh7VarHash = wh7Var.hash();
                iWriteBytesTo += jh7VarHash.writeBytesTo(bArr, iWriteBytesTo, jh7VarHash.bits() / 8);
            }
            return jh7.m14081b(bArr);
        }

        @Override // p000.lh7
        public int bits() {
            int iBits = 0;
            for (lh7 lh7Var : this.f72616a) {
                iBits += lh7Var.bits();
            }
            return iBits;
        }

        public boolean equals(@wx1 Object object) {
            if (object instanceof C15075c) {
                return Arrays.equals(this.f72616a, ((C15075c) object).f72616a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f72616a);
        }

        private C15075c(lh7... functions) {
            super(functions);
            for (lh7 lh7Var : functions) {
                v7d.checkArgument(lh7Var.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", lh7Var.bits(), (Object) lh7Var);
            }
        }
    }

    /* JADX INFO: renamed from: xh7$d */
    public static final class C15076d {

        /* JADX INFO: renamed from: a */
        public long f97835a;

        public C15076d(long seed) {
            this.f97835a = seed;
        }

        public double nextDouble() {
            long j = (this.f97835a * 2862933555777941757L) + 1;
            this.f97835a = j;
            return ((double) (((int) (j >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    /* JADX INFO: renamed from: xh7$e */
    public static class C15077e {

        /* JADX INFO: renamed from: a */
        public static final lh7 f97836a = new hsa("MD5", "Hashing.md5()");

        private C15077e() {
        }
    }

    /* JADX INFO: renamed from: xh7$f */
    public static class C15078f {

        /* JADX INFO: renamed from: a */
        public static final lh7 f97837a = new hsa(lc2.f57149a, "Hashing.sha1()");

        private C15078f() {
        }
    }

    /* JADX INFO: renamed from: xh7$g */
    public static class C15079g {

        /* JADX INFO: renamed from: a */
        public static final lh7 f97838a = new hsa("SHA-256", "Hashing.sha256()");

        private C15079g() {
        }
    }

    /* JADX INFO: renamed from: xh7$h */
    public static class C15080h {

        /* JADX INFO: renamed from: a */
        public static final lh7 f97839a = new hsa("SHA-384", "Hashing.sha384()");

        private C15080h() {
        }
    }

    /* JADX INFO: renamed from: xh7$i */
    public static class C15081i {

        /* JADX INFO: renamed from: a */
        public static final lh7 f97840a = new hsa("SHA-512", "Hashing.sha512()");

        private C15081i() {
        }
    }

    private xh7() {
    }

    /* JADX INFO: renamed from: a */
    public static int m25140a(int bits) {
        v7d.checkArgument(bits > 0, "Number of bits must be positive");
        return (bits + 31) & (-32);
    }

    public static lh7 adler32() {
        return EnumC15074b.f97832c.f97834a;
    }

    public static jh7 combineOrdered(Iterable<jh7> hashCodes) {
        Iterator<jh7> it = hashCodes.iterator();
        v7d.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<jh7> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            v7d.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < bArrAsBytes.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ bArrAsBytes[i]);
            }
        }
        return jh7.m14081b(bArr);
    }

    public static jh7 combineUnordered(Iterable<jh7> hashCodes) {
        Iterator<jh7> it = hashCodes.iterator();
        v7d.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<jh7> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            v7d.checkArgument(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < bArrAsBytes.length; i++) {
                bArr[i] = (byte) (bArr[i] + bArrAsBytes[i]);
            }
        }
        return jh7.m14081b(bArr);
    }

    public static lh7 concatenating(lh7 first, lh7 second, lh7... rest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(first);
        arrayList.add(second);
        Collections.addAll(arrayList, rest);
        return new C15075c((lh7[]) arrayList.toArray(new lh7[0]));
    }

    public static int consistentHash(jh7 hashCode, int buckets) {
        return consistentHash(hashCode.padToLong(), buckets);
    }

    public static lh7 crc32() {
        return EnumC15074b.f97831b.f97834a;
    }

    public static lh7 crc32c() {
        return i53.f45772a;
    }

    public static lh7 farmHashFingerprint64() {
        return jp5.f51385a;
    }

    public static lh7 fingerprint2011() {
        return cw5.f27916a;
    }

    public static lh7 goodFastHash(int minimumBits) {
        int iM25140a = m25140a(minimumBits);
        if (iM25140a == 32) {
            return g4b.f38710e;
        }
        if (iM25140a <= 128) {
            return f4b.f35318c;
        }
        int i = (iM25140a + 127) / 128;
        lh7[] lh7VarArr = new lh7[i];
        lh7VarArr[0] = f4b.f35318c;
        int i2 = f97830a;
        for (int i3 = 1; i3 < i; i3++) {
            i2 += 1500450271;
            lh7VarArr[i3] = murmur3_128(i2);
        }
        return new C15075c(lh7VarArr);
    }

    public static lh7 hmacMd5(Key key) {
        return new rq9("HmacMD5", key, hmacToString("hmacMd5", key));
    }

    public static lh7 hmacSha1(Key key) {
        return new rq9("HmacSHA1", key, hmacToString("hmacSha1", key));
    }

    public static lh7 hmacSha256(Key key) {
        return new rq9("HmacSHA256", key, hmacToString("hmacSha256", key));
    }

    public static lh7 hmacSha512(Key key) {
        return new rq9("HmacSHA512", key, hmacToString("hmacSha512", key));
    }

    private static String hmacToString(String methodName, Key key) {
        return "Hashing." + methodName + "(Key[algorithm=" + key.getAlgorithm() + ", format=" + key.getFormat() + "])";
    }

    @Deprecated
    public static lh7 md5() {
        return C15077e.f97836a;
    }

    public static lh7 murmur3_128(int seed) {
        return new f4b(seed);
    }

    @Deprecated
    public static lh7 murmur3_32(int seed) {
        return new g4b(seed, false);
    }

    public static lh7 murmur3_32_fixed(int seed) {
        return new g4b(seed, true);
    }

    @Deprecated
    public static lh7 sha1() {
        return C15078f.f97837a;
    }

    public static lh7 sha256() {
        return C15079g.f97838a;
    }

    public static lh7 sha384() {
        return C15080h.f97839a;
    }

    public static lh7 sha512() {
        return C15081i.f97840a;
    }

    public static lh7 sipHash24() {
        return vpf.f91941e;
    }

    public static int consistentHash(long input, int buckets) {
        int i = 0;
        v7d.checkArgument(buckets > 0, "buckets must be positive: %s", buckets);
        C15076d c15076d = new C15076d(input);
        while (true) {
            int iNextDouble = (int) (((double) (i + 1)) / c15076d.nextDouble());
            if (iNextDouble < 0 || iNextDouble >= buckets) {
                break;
            }
            i = iNextDouble;
        }
        return i;
    }

    public static lh7 hmacMd5(byte[] key) {
        return hmacMd5(new SecretKeySpec((byte[]) v7d.checkNotNull(key), "HmacMD5"));
    }

    public static lh7 hmacSha1(byte[] key) {
        return hmacSha1(new SecretKeySpec((byte[]) v7d.checkNotNull(key), "HmacSHA1"));
    }

    public static lh7 hmacSha256(byte[] key) {
        return hmacSha256(new SecretKeySpec((byte[]) v7d.checkNotNull(key), "HmacSHA256"));
    }

    public static lh7 hmacSha512(byte[] key) {
        return hmacSha512(new SecretKeySpec((byte[]) v7d.checkNotNull(key), "HmacSHA512"));
    }

    public static lh7 murmur3_128() {
        return f4b.f35317b;
    }

    @Deprecated
    public static lh7 murmur3_32() {
        return g4b.f38708c;
    }

    public static lh7 murmur3_32_fixed() {
        return g4b.f38709d;
    }

    public static lh7 sipHash24(long k0, long k1) {
        return new vpf(2, 4, k0, k1);
    }

    public static lh7 concatenating(Iterable<lh7> hashFunctions) {
        v7d.checkNotNull(hashFunctions);
        ArrayList arrayList = new ArrayList();
        Iterator<lh7> it = hashFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        v7d.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new C15075c((lh7[]) arrayList.toArray(new lh7[0]));
    }
}
