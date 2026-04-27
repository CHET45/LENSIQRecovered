package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class ntg {

    /* JADX INFO: renamed from: d */
    public static final int f65667d = 0;

    /* JADX INFO: renamed from: a */
    public final long f65669a;

    /* JADX INFO: renamed from: b */
    public final long f65670b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10057a f65666c = new C10057a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final ntg f65668e = new ntg(0, 0, 3, null);

    /* JADX INFO: renamed from: ntg$a */
    public static final class C10057a {
        public /* synthetic */ C10057a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getNone$annotations() {
        }

        @yfb
        public final ntg getNone() {
            return ntg.f65668e;
        }

        private C10057a() {
        }
    }

    public /* synthetic */ ntg(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    /* JADX INFO: renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ ntg m31216copyNB67dxo$default(ntg ntgVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ntgVar.f65669a;
        }
        if ((i & 2) != 0) {
            j2 = ntgVar.f65670b;
        }
        return ntgVar.m31217copyNB67dxo(j, j2);
    }

    @yfb
    /* JADX INFO: renamed from: copy-NB67dxo, reason: not valid java name */
    public final ntg m31217copyNB67dxo(long j, long j2) {
        return new ntg(j, j2, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntg)) {
            return false;
        }
        ntg ntgVar = (ntg) obj;
        return jwg.m30610equalsimpl0(this.f65669a, ntgVar.f65669a) && jwg.m30610equalsimpl0(this.f65670b, ntgVar.f65670b);
    }

    /* JADX INFO: renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m31218getFirstLineXSAIIZE() {
        return this.f65669a;
    }

    /* JADX INFO: renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m31219getRestLineXSAIIZE() {
        return this.f65670b;
    }

    public int hashCode() {
        return (jwg.m30614hashCodeimpl(this.f65669a) * 31) + jwg.m30614hashCodeimpl(this.f65670b);
    }

    @yfb
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) jwg.m30620toStringimpl(this.f65669a)) + ", restLine=" + ((Object) jwg.m30620toStringimpl(this.f65670b)) + ')';
    }

    private ntg(long j, long j2) {
        this.f65669a = j;
        this.f65670b = j2;
    }

    public /* synthetic */ ntg(long j, long j2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? kwg.getSp(0) : j, (i & 2) != 0 ? kwg.getSp(0) : j2, null);
    }
}
