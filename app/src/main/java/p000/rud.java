package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class rud {

    /* JADX INFO: renamed from: f */
    public static final int f79688f = 0;

    /* JADX INFO: renamed from: a */
    public final float f79690a;

    /* JADX INFO: renamed from: b */
    public final float f79691b;

    /* JADX INFO: renamed from: c */
    public final float f79692c;

    /* JADX INFO: renamed from: d */
    public final float f79693d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C12307a f79687e = new C12307a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final rud f79689g = new rud(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: rud$a */
    public static final class C12307a {
        public /* synthetic */ C12307a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getZero$annotations() {
        }

        @yfb
        public final rud getZero() {
            return rud.f79689g;
        }

        private C12307a() {
        }
    }

    public rud(float f, float f2, float f3, float f4) {
        this.f79690a = f;
        this.f79691b = f2;
        this.f79692c = f3;
        this.f79693d = f4;
    }

    public static /* synthetic */ rud copy$default(rud rudVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rudVar.f79690a;
        }
        if ((i & 2) != 0) {
            f2 = rudVar.f79691b;
        }
        if ((i & 4) != 0) {
            f3 = rudVar.f79692c;
        }
        if ((i & 8) != 0) {
            f4 = rudVar.f79693d;
        }
        return rudVar.copy(f, f2, f3, f4);
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
    /* JADX INFO: renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m32198getSizeNHjbRc$annotations() {
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

    @f0g
    public static /* synthetic */ void isFinite$annotations() {
    }

    @f0g
    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.f79690a;
    }

    public final float component2() {
        return this.f79691b;
    }

    public final float component3() {
        return this.f79692c;
    }

    public final float component4() {
        return this.f79693d;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m32199containsk4lQ0M(long j) {
        return izb.m30429getXimpl(j) >= this.f79690a && izb.m30429getXimpl(j) < this.f79692c && izb.m30430getYimpl(j) >= this.f79691b && izb.m30430getYimpl(j) < this.f79693d;
    }

    @yfb
    public final rud copy(float f, float f2, float f3, float f4) {
        return new rud(f, f2, f3, f4);
    }

    @f0g
    @yfb
    public final rud deflate(float f) {
        return inflate(-f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rud)) {
            return false;
        }
        rud rudVar = (rud) obj;
        return Float.compare(this.f79690a, rudVar.f79690a) == 0 && Float.compare(this.f79691b, rudVar.f79691b) == 0 && Float.compare(this.f79692c, rudVar.f79692c) == 0 && Float.compare(this.f79693d, rudVar.f79693d) == 0;
    }

    public final float getBottom() {
        return this.f79693d;
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m32200getBottomCenterF1C5BW0() {
        return mzb.Offset(this.f79690a + (getWidth() / 2.0f), this.f79693d);
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m32201getBottomLeftF1C5BW0() {
        return mzb.Offset(this.f79690a, this.f79693d);
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m32202getBottomRightF1C5BW0() {
        return mzb.Offset(this.f79692c, this.f79693d);
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m32203getCenterF1C5BW0() {
        return mzb.Offset(this.f79690a + (getWidth() / 2.0f), this.f79691b + (getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m32204getCenterLeftF1C5BW0() {
        return mzb.Offset(this.f79690a, this.f79691b + (getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m32205getCenterRightF1C5BW0() {
        return mzb.Offset(this.f79692c, this.f79691b + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.f79693d - this.f79691b;
    }

    public final float getLeft() {
        return this.f79690a;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.f79692c;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m32206getSizeNHjbRc() {
        return eqf.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.f79691b;
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m32207getTopCenterF1C5BW0() {
        return mzb.Offset(this.f79690a + (getWidth() / 2.0f), this.f79691b);
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m32208getTopLeftF1C5BW0() {
        return mzb.Offset(this.f79690a, this.f79691b);
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m32209getTopRightF1C5BW0() {
        return mzb.Offset(this.f79692c, this.f79691b);
    }

    public final float getWidth() {
        return this.f79692c - this.f79690a;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f79690a) * 31) + Float.hashCode(this.f79691b)) * 31) + Float.hashCode(this.f79692c)) * 31) + Float.hashCode(this.f79693d);
    }

    @f0g
    @yfb
    public final rud inflate(float f) {
        return new rud(this.f79690a - f, this.f79691b - f, this.f79692c + f, this.f79693d + f);
    }

    @f0g
    @yfb
    public final rud intersect(@yfb rud rudVar) {
        return new rud(Math.max(this.f79690a, rudVar.f79690a), Math.max(this.f79691b, rudVar.f79691b), Math.min(this.f79692c, rudVar.f79692c), Math.min(this.f79693d, rudVar.f79693d));
    }

    public final boolean isEmpty() {
        return this.f79690a >= this.f79692c || this.f79691b >= this.f79693d;
    }

    public final boolean isFinite() {
        float f = this.f79690a;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f2 = this.f79691b;
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                float f3 = this.f79692c;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    float f4 = this.f79693d;
                    if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        return this.f79690a >= Float.POSITIVE_INFINITY || this.f79691b >= Float.POSITIVE_INFINITY || this.f79692c >= Float.POSITIVE_INFINITY || this.f79693d >= Float.POSITIVE_INFINITY;
    }

    public final boolean overlaps(@yfb rud rudVar) {
        return this.f79692c > rudVar.f79690a && rudVar.f79692c > this.f79690a && this.f79693d > rudVar.f79691b && rudVar.f79693d > this.f79691b;
    }

    @yfb
    public String toString() {
        return "Rect.fromLTRB(" + f37.toStringAsFixed(this.f79690a, 1) + ", " + f37.toStringAsFixed(this.f79691b, 1) + ", " + f37.toStringAsFixed(this.f79692c, 1) + ", " + f37.toStringAsFixed(this.f79693d, 1) + ')';
    }

    @f0g
    @yfb
    public final rud translate(float f, float f2) {
        return new rud(this.f79690a + f, this.f79691b + f2, this.f79692c + f, this.f79693d + f2);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final rud m32210translatek4lQ0M(long j) {
        return new rud(this.f79690a + izb.m30429getXimpl(j), this.f79691b + izb.m30430getYimpl(j), this.f79692c + izb.m30429getXimpl(j), this.f79693d + izb.m30430getYimpl(j));
    }

    @f0g
    @yfb
    public final rud intersect(float f, float f2, float f3, float f4) {
        return new rud(Math.max(this.f79690a, f), Math.max(this.f79691b, f2), Math.min(this.f79692c, f3), Math.min(this.f79693d, f4));
    }
}
