package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class ftg {

    /* JADX INFO: renamed from: d */
    public static final int f37725d = 0;

    /* JADX INFO: renamed from: a */
    public final float f37727a;

    /* JADX INFO: renamed from: b */
    public final float f37728b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C5977a f37724c = new C5977a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final ftg f37726e = new ftg(1.0f, 0.0f);

    /* JADX INFO: renamed from: ftg$a */
    public static final class C5977a {
        public /* synthetic */ C5977a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }

        @yfb
        public final ftg getNone$ui_text_release() {
            return ftg.f37726e;
        }

        private C5977a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ftg() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ ftg copy$default(ftg ftgVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ftgVar.f37727a;
        }
        if ((i & 2) != 0) {
            f2 = ftgVar.f37728b;
        }
        return ftgVar.copy(f, f2);
    }

    @yfb
    public final ftg copy(float f, float f2) {
        return new ftg(f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftg)) {
            return false;
        }
        ftg ftgVar = (ftg) obj;
        return this.f37727a == ftgVar.f37727a && this.f37728b == ftgVar.f37728b;
    }

    public final float getScaleX() {
        return this.f37727a;
    }

    public final float getSkewX() {
        return this.f37728b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f37727a) * 31) + Float.hashCode(this.f37728b);
    }

    @yfb
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f37727a + ", skewX=" + this.f37728b + ')';
    }

    public ftg(float f, float f2) {
        this.f37727a = f;
        this.f37728b = f2;
    }

    public /* synthetic */ ftg(float f, float f2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
