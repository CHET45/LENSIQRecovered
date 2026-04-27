package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public final class ys8 implements Comparable<ys8> {

    /* JADX INFO: renamed from: f */
    public static final int f102892f = 255;

    /* JADX INFO: renamed from: a */
    public final int f102894a;

    /* JADX INFO: renamed from: b */
    public final int f102895b;

    /* JADX INFO: renamed from: c */
    public final int f102896c;

    /* JADX INFO: renamed from: d */
    public final int f102897d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C15799a f102891e = new C15799a(null);

    /* JADX INFO: renamed from: m */
    @un8
    @yfb
    public static final ys8 f102893m = zs8.get();

    /* JADX INFO: renamed from: ys8$a */
    public static final class C15799a {
        public /* synthetic */ C15799a(jt3 jt3Var) {
            this();
        }

        private C15799a() {
        }
    }

    public ys8(int i, int i2, int i3) {
        this.f102894a = i;
        this.f102895b = i2;
        this.f102896c = i3;
        this.f102897d = versionOf(i, i2, i3);
    }

    private final int versionOf(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + a18.f100c + i2 + a18.f100c + i3).toString());
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        ys8 ys8Var = obj instanceof ys8 ? (ys8) obj : null;
        return ys8Var != null && this.f102897d == ys8Var.f102897d;
    }

    public final int getMajor() {
        return this.f102894a;
    }

    public final int getMinor() {
        return this.f102895b;
    }

    public final int getPatch() {
        return this.f102896c;
    }

    public int hashCode() {
        return this.f102897d;
    }

    public final boolean isAtLeast(int i, int i2) {
        int i3 = this.f102894a;
        return i3 > i || (i3 == i && this.f102895b >= i2);
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102894a);
        sb.append(a18.f100c);
        sb.append(this.f102895b);
        sb.append(a18.f100c);
        sb.append(this.f102896c);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@yfb ys8 ys8Var) {
        md8.checkNotNullParameter(ys8Var, "other");
        return this.f102897d - ys8Var.f102897d;
    }

    public ys8(int i, int i2) {
        this(i, i2, 0);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4;
        int i5 = this.f102894a;
        return i5 > i || (i5 == i && ((i4 = this.f102895b) > i2 || (i4 == i2 && this.f102896c >= i3)));
    }
}
