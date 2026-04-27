package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class dv6 {

    /* JADX INFO: renamed from: a */
    public final int f30968a;

    /* JADX INFO: renamed from: b */
    public final int f30969b;

    /* JADX INFO: renamed from: c */
    public final float f30970c;

    /* JADX INFO: renamed from: d */
    public final long f30971d;

    private dv6(int i, int i2, float f, long j) {
        u80.checkArgument(i > 0, "width must be positive, but is: " + i);
        u80.checkArgument(i2 > 0, "height must be positive, but is: " + i2);
        this.f30968a = i;
        this.f30969b = i2;
        this.f30970c = f;
        this.f30971d = j;
    }

    /* JADX INFO: renamed from: dv6$b */
    public static final class C4963b {

        /* JADX INFO: renamed from: a */
        public int f30972a;

        /* JADX INFO: renamed from: b */
        public int f30973b;

        /* JADX INFO: renamed from: c */
        public float f30974c;

        /* JADX INFO: renamed from: d */
        public long f30975d;

        public C4963b(int i, int i2) {
            this.f30972a = i;
            this.f30973b = i2;
            this.f30974c = 1.0f;
        }

        public dv6 build() {
            return new dv6(this.f30972a, this.f30973b, this.f30974c, this.f30975d);
        }

        @op1
        public C4963b setHeight(int i) {
            this.f30973b = i;
            return this;
        }

        @op1
        public C4963b setOffsetToAddUs(long j) {
            this.f30975d = j;
            return this;
        }

        @op1
        public C4963b setPixelWidthHeightRatio(float f) {
            this.f30974c = f;
            return this;
        }

        @op1
        public C4963b setWidth(int i) {
            this.f30972a = i;
            return this;
        }

        public C4963b(dv6 dv6Var) {
            this.f30972a = dv6Var.f30968a;
            this.f30973b = dv6Var.f30969b;
            this.f30974c = dv6Var.f30970c;
            this.f30975d = dv6Var.f30971d;
        }
    }
}
