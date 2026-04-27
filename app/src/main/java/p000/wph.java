package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {yh5.class})
@jjf(version = "1.5")
public final class wph extends uph implements a62<oph>, r5c<oph> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C14741a f95052e = new C14741a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final wph f95053f = new wph(-1, 0, null);

    /* JADX INFO: renamed from: wph$a */
    public static final class C14741a {
        public /* synthetic */ C14741a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final wph getEMPTY() {
            return wph.f95053f;
        }

        private C14741a() {
        }
    }

    public /* synthetic */ wph(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @q64(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m33079getEndExclusivesVKNKU$annotations() {
    }

    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m33080containsVKZWuLQ(((oph) comparable).m31585unboximpl());
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m33080containsVKZWuLQ(long j) {
        return Long.compareUnsigned(m32642getFirstsVKNKU(), j) <= 0 && Long.compareUnsigned(j, m32643getLastsVKNKU()) <= 0;
    }

    @Override // p000.uph
    public boolean equals(@gib Object obj) {
        if (obj instanceof wph) {
            if (!isEmpty() || !((wph) obj).isEmpty()) {
                wph wphVar = (wph) obj;
                if (m32642getFirstsVKNKU() != wphVar.m32642getFirstsVKNKU() || m32643getLastsVKNKU() != wphVar.m32643getLastsVKNKU()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.r5c
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return oph.m31527boximpl(m33081getEndExclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m33081getEndExclusivesVKNKU() {
        if (m32643getLastsVKNKU() != -1) {
            return oph.m31533constructorimpl(m32643getLastsVKNKU() + oph.m31533constructorimpl(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p000.a62
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return oph.m31527boximpl(m33082getEndInclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m33082getEndInclusivesVKNKU() {
        return m32643getLastsVKNKU();
    }

    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return oph.m31527boximpl(m33083getStartsVKNKU());
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m33083getStartsVKNKU() {
        return m32642getFirstsVKNKU();
    }

    @Override // p000.uph
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) oph.m31533constructorimpl(m32642getFirstsVKNKU() ^ oph.m31533constructorimpl(m32642getFirstsVKNKU() >>> 32))) * 31) + ((int) oph.m31533constructorimpl(m32643getLastsVKNKU() ^ oph.m31533constructorimpl(m32643getLastsVKNKU() >>> 32)));
    }

    @Override // p000.uph, p000.a62, p000.r5c
    public boolean isEmpty() {
        return Long.compareUnsigned(m32642getFirstsVKNKU(), m32643getLastsVKNKU()) > 0;
    }

    @Override // p000.uph
    @yfb
    public String toString() {
        return ((Object) oph.m31579toStringimpl(m32642getFirstsVKNKU())) + ".." + ((Object) oph.m31579toStringimpl(m32643getLastsVKNKU()));
    }

    private wph(long j, long j2) {
        super(j, j2, 1L, null);
    }
}
