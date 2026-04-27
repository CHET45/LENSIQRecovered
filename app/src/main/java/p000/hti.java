package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class hti extends tod implements Serializable {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final C7019a f44862F = new C7019a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public int f44863C;

    /* JADX INFO: renamed from: c */
    public int f44864c;

    /* JADX INFO: renamed from: d */
    public int f44865d;

    /* JADX INFO: renamed from: e */
    public int f44866e;

    /* JADX INFO: renamed from: f */
    public int f44867f;

    /* JADX INFO: renamed from: m */
    public int f44868m;

    /* JADX INFO: renamed from: hti$a */
    public static final class C7019a {
        public /* synthetic */ C7019a(jt3 jt3Var) {
            this();
        }

        private C7019a() {
        }
    }

    public hti(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f44864c = i;
        this.f44865d = i2;
        this.f44866e = i3;
        this.f44867f = i4;
        this.f44868m = i5;
        this.f44863C = i6;
        if ((i | i2 | i3 | i4 | i5) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i7 = 0; i7 < 64; i7++) {
            nextInt();
        }
    }

    @Override // p000.tod
    public int nextBits(int i) {
        return vod.takeUpperBits(nextInt(), i);
    }

    @Override // p000.tod
    public int nextInt() {
        int i = this.f44864c;
        int i2 = i ^ (i >>> 2);
        this.f44864c = this.f44865d;
        this.f44865d = this.f44866e;
        this.f44866e = this.f44867f;
        int i3 = this.f44868m;
        this.f44867f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f44868m = i4;
        int i5 = this.f44863C + 362437;
        this.f44863C = i5;
        return i4 + i5;
    }

    public hti(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }
}
