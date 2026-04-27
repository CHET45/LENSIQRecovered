package p000;

/* JADX INFO: loaded from: classes.dex */
public final class eag extends rp4 {

    /* JADX INFO: renamed from: g */
    public static final float f32418g = 0.0f;

    /* JADX INFO: renamed from: h */
    public static final float f32419h = 4.0f;

    /* JADX INFO: renamed from: a */
    public final float f32422a;

    /* JADX INFO: renamed from: b */
    public final float f32423b;

    /* JADX INFO: renamed from: c */
    public final int f32424c;

    /* JADX INFO: renamed from: d */
    public final int f32425d;

    /* JADX INFO: renamed from: e */
    @gib
    public final ajc f32426e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C5225a f32417f = new C5225a(null);

    /* JADX INFO: renamed from: i */
    public static final int f32420i = fag.f35949b.m28904getButtKaPHkGw();

    /* JADX INFO: renamed from: j */
    public static final int f32421j = hag.f43019b.m29985getMiterLxFBmk8();

    /* JADX INFO: renamed from: eag$a */
    public static final class C5225a {
        public /* synthetic */ C5225a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m28822getDefaultCapKaPHkGw() {
            return eag.f32420i;
        }

        /* JADX INFO: renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m28823getDefaultJoinLxFBmk8() {
            return eag.f32421j;
        }

        private C5225a() {
        }
    }

    public /* synthetic */ eag(float f, float f2, int i, int i2, ajc ajcVar, jt3 jt3Var) {
        this(f, f2, i, i2, ajcVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eag)) {
            return false;
        }
        eag eagVar = (eag) obj;
        return this.f32422a == eagVar.f32422a && this.f32423b == eagVar.f32423b && fag.m28900equalsimpl0(this.f32424c, eagVar.f32424c) && hag.m29980equalsimpl0(this.f32425d, eagVar.f32425d) && md8.areEqual(this.f32426e, eagVar.f32426e);
    }

    /* JADX INFO: renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m28820getCapKaPHkGw() {
        return this.f32424c;
    }

    /* JADX INFO: renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m28821getJoinLxFBmk8() {
        return this.f32425d;
    }

    public final float getMiter() {
        return this.f32423b;
    }

    @gib
    public final ajc getPathEffect() {
        return this.f32426e;
    }

    public final float getWidth() {
        return this.f32422a;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f32422a) * 31) + Float.hashCode(this.f32423b)) * 31) + fag.m28901hashCodeimpl(this.f32424c)) * 31) + hag.m29981hashCodeimpl(this.f32425d)) * 31;
        ajc ajcVar = this.f32426e;
        return iHashCode + (ajcVar != null ? ajcVar.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "Stroke(width=" + this.f32422a + ", miter=" + this.f32423b + ", cap=" + ((Object) fag.m28902toStringimpl(this.f32424c)) + ", join=" + ((Object) hag.m29982toStringimpl(this.f32425d)) + ", pathEffect=" + this.f32426e + ')';
    }

    public /* synthetic */ eag(float f, float f2, int i, int i2, ajc ajcVar, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? f32420i : i, (i3 & 8) != 0 ? f32421j : i2, (i3 & 16) != 0 ? null : ajcVar, null);
    }

    private eag(float f, float f2, int i, int i2, ajc ajcVar) {
        super(null);
        this.f32422a = f;
        this.f32423b = f2;
        this.f32424c = i;
        this.f32425d = i2;
        this.f32426e = ajcVar;
    }
}
