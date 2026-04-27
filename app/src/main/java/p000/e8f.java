package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class e8f {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C5193a f32134d = new C5193a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final e8f f32135e = new e8f(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a */
    public final long f32136a;

    /* JADX INFO: renamed from: b */
    public final long f32137b;

    /* JADX INFO: renamed from: c */
    public final float f32138c;

    /* JADX INFO: renamed from: e8f$a */
    public static final class C5193a {
        public /* synthetic */ C5193a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getNone$annotations() {
        }

        @yfb
        public final e8f getNone() {
            return e8f.f32135e;
        }

        private C5193a() {
        }
    }

    public /* synthetic */ e8f(long j, long j2, float f, jt3 jt3Var) {
        this(j, j2, f);
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ e8f m28813copyqcb84PM$default(e8f e8fVar, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = e8fVar.f32136a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = e8fVar.f32137b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = e8fVar.f32138c;
        }
        return e8fVar.m28816copyqcb84PM(j3, j4, f);
    }

    @f0g
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m28814getColor0d7_KjU$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m28815getOffsetF1C5BW0$annotations() {
    }

    @yfb
    /* JADX INFO: renamed from: copy-qcb84PM, reason: not valid java name */
    public final e8f m28816copyqcb84PM(long j, long j2, float f) {
        return new e8f(j, j2, f, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8f)) {
            return false;
        }
        e8f e8fVar = (e8f) obj;
        return w82.m32952equalsimpl0(this.f32136a, e8fVar.f32136a) && izb.m30426equalsimpl0(this.f32137b, e8fVar.f32137b) && this.f32138c == e8fVar.f32138c;
    }

    public final float getBlurRadius() {
        return this.f32138c;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m28817getColor0d7_KjU() {
        return this.f32136a;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m28818getOffsetF1C5BW0() {
        return this.f32137b;
    }

    public int hashCode() {
        return (((w82.m32958hashCodeimpl(this.f32136a) * 31) + izb.m30431hashCodeimpl(this.f32137b)) * 31) + Float.hashCode(this.f32138c);
    }

    @yfb
    public String toString() {
        return "Shadow(color=" + ((Object) w82.m32959toStringimpl(this.f32136a)) + ", offset=" + ((Object) izb.m30437toStringimpl(this.f32137b)) + ", blurRadius=" + this.f32138c + ')';
    }

    private e8f(long j, long j2, float f) {
        this.f32136a = j;
        this.f32137b = j2;
        this.f32138c = f;
    }

    public /* synthetic */ e8f(long j, long j2, float f, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? j92.Color(4278190080L) : j, (i & 2) != 0 ? izb.f49009b.m30445getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
