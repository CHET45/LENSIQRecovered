package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class l78 {

    /* JADX INFO: renamed from: f */
    public static final int f56690f = 0;

    /* JADX INFO: renamed from: a */
    public final int f56692a;

    /* JADX INFO: renamed from: b */
    public final int f56693b;

    /* JADX INFO: renamed from: c */
    public final int f56694c;

    /* JADX INFO: renamed from: d */
    public final int f56695d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C8704a f56689e = new C8704a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final l78 f56691g = new l78(0, 0, 0, 0);

    /* JADX INFO: renamed from: l78$a */
    public static final class C8704a {
        public /* synthetic */ C8704a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getZero$annotations() {
        }

        @yfb
        public final l78 getZero() {
            return l78.f56691g;
        }

        private C8704a() {
        }
    }

    public l78(int i, int i2, int i3, int i4) {
        this.f56692a = i;
        this.f56693b = i2;
        this.f56694c = i3;
        this.f56695d = i4;
    }

    public static /* synthetic */ l78 copy$default(l78 l78Var, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = l78Var.f56692a;
        }
        if ((i5 & 2) != 0) {
            i2 = l78Var.f56693b;
        }
        if ((i5 & 4) != 0) {
            i3 = l78Var.f56694c;
        }
        if ((i5 & 8) != 0) {
            i4 = l78Var.f56695d;
        }
        return l78Var.copy(i, i2, i3, i4);
    }

    @f0g
    public static /* synthetic */ void getBottom$annotations() {
    }

    @f0g
    public static /* synthetic */ void getHeight$annotations() {
    }

    @f0g
    public static /* synthetic */ void getLeft$annotations() {
    }

    @f0g
    public static /* synthetic */ void getRight$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m30818getSizeYbymL2g$annotations() {
    }

    @f0g
    public static /* synthetic */ void getTop$annotations() {
    }

    @f0g
    public static /* synthetic */ void getWidth$annotations() {
    }

    @f0g
    public static /* synthetic */ void isEmpty$annotations() {
    }

    public final int component1() {
        return this.f56692a;
    }

    public final int component2() {
        return this.f56693b;
    }

    public final int component3() {
        return this.f56694c;
    }

    public final int component4() {
        return this.f56695d;
    }

    /* JADX INFO: renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m30819containsgyyYBs(long j) {
        return a78.m27201getXimpl(j) >= this.f56692a && a78.m27201getXimpl(j) < this.f56694c && a78.m27202getYimpl(j) >= this.f56693b && a78.m27202getYimpl(j) < this.f56695d;
    }

    @yfb
    public final l78 copy(int i, int i2, int i3, int i4) {
        return new l78(i, i2, i3, i4);
    }

    @f0g
    @yfb
    public final l78 deflate(int i) {
        return inflate(-i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l78)) {
            return false;
        }
        l78 l78Var = (l78) obj;
        return this.f56692a == l78Var.f56692a && this.f56693b == l78Var.f56693b && this.f56694c == l78Var.f56694c && this.f56695d == l78Var.f56695d;
    }

    public final int getBottom() {
        return this.f56695d;
    }

    /* JADX INFO: renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m30820getBottomCenternOccac() {
        return b78.IntOffset(this.f56692a + (getWidth() / 2), this.f56695d);
    }

    /* JADX INFO: renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m30821getBottomLeftnOccac() {
        return b78.IntOffset(this.f56692a, this.f56695d);
    }

    /* JADX INFO: renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m30822getBottomRightnOccac() {
        return b78.IntOffset(this.f56694c, this.f56695d);
    }

    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m30823getCenternOccac() {
        return b78.IntOffset(this.f56692a + (getWidth() / 2), this.f56693b + (getHeight() / 2));
    }

    /* JADX INFO: renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m30824getCenterLeftnOccac() {
        return b78.IntOffset(this.f56692a, this.f56693b + (getHeight() / 2));
    }

    /* JADX INFO: renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m30825getCenterRightnOccac() {
        return b78.IntOffset(this.f56694c, this.f56693b + (getHeight() / 2));
    }

    public final int getHeight() {
        return this.f56695d - this.f56693b;
    }

    public final int getLeft() {
        return this.f56692a;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.f56694c;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m30826getSizeYbymL2g() {
        return s78.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.f56693b;
    }

    /* JADX INFO: renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m30827getTopCenternOccac() {
        return b78.IntOffset(this.f56692a + (getWidth() / 2), this.f56693b);
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m30828getTopLeftnOccac() {
        return b78.IntOffset(this.f56692a, this.f56693b);
    }

    /* JADX INFO: renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m30829getTopRightnOccac() {
        return b78.IntOffset(this.f56694c, this.f56693b);
    }

    public final int getWidth() {
        return this.f56694c - this.f56692a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f56692a) * 31) + Integer.hashCode(this.f56693b)) * 31) + Integer.hashCode(this.f56694c)) * 31) + Integer.hashCode(this.f56695d);
    }

    @f0g
    @yfb
    public final l78 inflate(int i) {
        return new l78(this.f56692a - i, this.f56693b - i, this.f56694c + i, this.f56695d + i);
    }

    @f0g
    @yfb
    public final l78 intersect(@yfb l78 l78Var) {
        return new l78(Math.max(this.f56692a, l78Var.f56692a), Math.max(this.f56693b, l78Var.f56693b), Math.min(this.f56694c, l78Var.f56694c), Math.min(this.f56695d, l78Var.f56695d));
    }

    public final boolean isEmpty() {
        return this.f56692a >= this.f56694c || this.f56693b >= this.f56695d;
    }

    public final boolean overlaps(@yfb l78 l78Var) {
        return this.f56694c > l78Var.f56692a && l78Var.f56694c > this.f56692a && this.f56695d > l78Var.f56693b && l78Var.f56695d > this.f56693b;
    }

    @yfb
    public String toString() {
        return "IntRect.fromLTRB(" + this.f56692a + ", " + this.f56693b + ", " + this.f56694c + ", " + this.f56695d + ')';
    }

    @f0g
    @yfb
    public final l78 translate(int i, int i2) {
        return new l78(this.f56692a + i, this.f56693b + i2, this.f56694c + i, this.f56695d + i2);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: translate--gyyYBs, reason: not valid java name */
    public final l78 m30830translategyyYBs(long j) {
        return new l78(this.f56692a + a78.m27201getXimpl(j), this.f56693b + a78.m27202getYimpl(j), this.f56694c + a78.m27201getXimpl(j), this.f56695d + a78.m27202getYimpl(j));
    }
}
