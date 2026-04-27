package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class xrg {

    /* JADX INFO: renamed from: f */
    public static final int f99073f = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f99075a;

    /* JADX INFO: renamed from: b */
    public final long f99076b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final q5e f99077c;

    /* JADX INFO: renamed from: d */
    public final boolean f99078d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C15264a f99072e = new C15264a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final xrg f99074g = new xrg(false, izb.f49009b.m30444getUnspecifiedF1C5BW0(), q5e.Ltr, false, null);

    /* JADX INFO: renamed from: xrg$a */
    public static final class C15264a {
        public /* synthetic */ C15264a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final xrg getHidden() {
            return xrg.f99074g;
        }

        private C15264a() {
        }
    }

    public /* synthetic */ xrg(boolean z, long j, q5e q5eVar, boolean z2, jt3 jt3Var) {
        this(z, j, q5eVar, z2);
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ xrg m33265copyubNVwUQ$default(xrg xrgVar, boolean z, long j, q5e q5eVar, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = xrgVar.f99075a;
        }
        if ((i & 2) != 0) {
            j = xrgVar.f99076b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            q5eVar = xrgVar.f99077c;
        }
        q5e q5eVar2 = q5eVar;
        if ((i & 8) != 0) {
            z2 = xrgVar.f99078d;
        }
        return xrgVar.m33267copyubNVwUQ(z, j2, q5eVar2, z2);
    }

    public final boolean component1() {
        return this.f99075a;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m33266component2F1C5BW0() {
        return this.f99076b;
    }

    @yfb
    public final q5e component3() {
        return this.f99077c;
    }

    public final boolean component4() {
        return this.f99078d;
    }

    @yfb
    /* JADX INFO: renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final xrg m33267copyubNVwUQ(boolean z, long j, @yfb q5e q5eVar, boolean z2) {
        return new xrg(z, j, q5eVar, z2, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrg)) {
            return false;
        }
        xrg xrgVar = (xrg) obj;
        return this.f99075a == xrgVar.f99075a && izb.m30426equalsimpl0(this.f99076b, xrgVar.f99076b) && this.f99077c == xrgVar.f99077c && this.f99078d == xrgVar.f99078d;
    }

    @yfb
    public final q5e getDirection() {
        return this.f99077c;
    }

    public final boolean getHandlesCrossed() {
        return this.f99078d;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m33268getPositionF1C5BW0() {
        return this.f99076b;
    }

    public final boolean getVisible() {
        return this.f99075a;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f99075a) * 31) + izb.m30431hashCodeimpl(this.f99076b)) * 31) + this.f99077c.hashCode()) * 31) + Boolean.hashCode(this.f99078d);
    }

    @yfb
    public String toString() {
        return "TextFieldHandleState(visible=" + this.f99075a + ", position=" + ((Object) izb.m30437toStringimpl(this.f99076b)) + ", direction=" + this.f99077c + ", handlesCrossed=" + this.f99078d + ')';
    }

    private xrg(boolean z, long j, q5e q5eVar, boolean z2) {
        this.f99075a = z;
        this.f99076b = j;
        this.f99077c = q5eVar;
        this.f99078d = z2;
    }
}
