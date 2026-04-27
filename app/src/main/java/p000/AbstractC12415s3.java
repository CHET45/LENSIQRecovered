package p000;

import java.util.Random;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class AbstractC12415s3 extends tod {
    @yfb
    public abstract Random getImpl();

    @Override // p000.tod
    public int nextBits(int i) {
        return vod.takeUpperBits(getImpl().nextInt(), i);
    }

    @Override // p000.tod
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // p000.tod
    @yfb
    public byte[] nextBytes(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }

    @Override // p000.tod
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // p000.tod
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // p000.tod
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // p000.tod
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // p000.tod
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
