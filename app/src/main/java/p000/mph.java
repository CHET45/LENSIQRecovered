package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {yh5.class})
@jjf(version = "1.5")
public final class mph extends kph implements a62<woh>, r5c<woh> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C9468a f61730e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final mph f61731f;

    /* JADX INFO: renamed from: mph$a */
    public static final class C9468a {
        public /* synthetic */ C9468a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final mph getEMPTY() {
            return mph.f61731f;
        }

        private C9468a() {
        }
    }

    static {
        jt3 jt3Var = null;
        f61730e = new C9468a(jt3Var);
        f61731f = new mph(-1, 0, jt3Var);
    }

    public /* synthetic */ mph(int i, int i2, jt3 jt3Var) {
        this(i, i2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @q64(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m31033getEndExclusivepVg5ArA$annotations() {
    }

    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m31034containsWZ4Q5Ns(((woh) comparable).m33056unboximpl());
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m31034containsWZ4Q5Ns(int i) {
        return Integer.compareUnsigned(m30732getFirstpVg5ArA(), i) <= 0 && Integer.compareUnsigned(i, m30733getLastpVg5ArA()) <= 0;
    }

    @Override // p000.kph
    public boolean equals(@gib Object obj) {
        if (obj instanceof mph) {
            if (!isEmpty() || !((mph) obj).isEmpty()) {
                mph mphVar = (mph) obj;
                if (m30732getFirstpVg5ArA() != mphVar.m30732getFirstpVg5ArA() || m30733getLastpVg5ArA() != mphVar.m30733getLastpVg5ArA()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.r5c
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return woh.m32998boximpl(m31035getEndExclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public int m31035getEndExclusivepVg5ArA() {
        if (m30733getLastpVg5ArA() != -1) {
            return woh.m33004constructorimpl(m30733getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p000.a62
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return woh.m32998boximpl(m31036getEndInclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public int m31036getEndInclusivepVg5ArA() {
        return m30733getLastpVg5ArA();
    }

    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return woh.m32998boximpl(m31037getStartpVg5ArA());
    }

    /* JADX INFO: renamed from: getStart-pVg5ArA, reason: not valid java name */
    public int m31037getStartpVg5ArA() {
        return m30732getFirstpVg5ArA();
    }

    @Override // p000.kph
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m30732getFirstpVg5ArA() * 31) + m30733getLastpVg5ArA();
    }

    @Override // p000.kph, p000.a62, p000.r5c
    public boolean isEmpty() {
        return Integer.compareUnsigned(m30732getFirstpVg5ArA(), m30733getLastpVg5ArA()) > 0;
    }

    @Override // p000.kph
    @yfb
    public String toString() {
        return ((Object) woh.m33050toStringimpl(m30732getFirstpVg5ArA())) + ".." + ((Object) woh.m33050toStringimpl(m30733getLastpVg5ArA()));
    }

    private mph(int i, int i2) {
        super(i, i2, 1, null);
    }
}
