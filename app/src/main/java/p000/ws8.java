package p000;

import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class ws8 extends Random {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C14770a f95286c = new C14770a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final tod f95287a;

    /* JADX INFO: renamed from: b */
    public boolean f95288b;

    /* JADX INFO: renamed from: ws8$a */
    public static final class C14770a {
        public /* synthetic */ C14770a(jt3 jt3Var) {
            this();
        }

        private C14770a() {
        }
    }

    public ws8(@yfb tod todVar) {
        md8.checkNotNullParameter(todVar, "impl");
        this.f95287a = todVar;
    }

    @yfb
    public final tod getImpl() {
        return this.f95287a;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.f95287a.nextBits(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f95287a.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "bytes");
        this.f95287a.nextBytes(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f95287a.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f95287a.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f95287a.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f95287a.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.f95288b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f95288b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.f95287a.nextInt(i);
    }
}
