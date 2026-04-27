package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class lwg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9014a f59101b = new C9014a(null);

    /* JADX INFO: renamed from: c */
    public static final long f59102c = m30916constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f59103d = m30916constructorimpl(4294967296L);

    /* JADX INFO: renamed from: e */
    public static final long f59104e = m30916constructorimpl(8589934592L);

    /* JADX INFO: renamed from: a */
    public final long f59105a;

    /* JADX INFO: renamed from: lwg$a */
    public static final class C9014a {
        public /* synthetic */ C9014a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m30922getEmUIouoOA() {
            return lwg.f59104e;
        }

        /* JADX INFO: renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m30923getSpUIouoOA() {
            return lwg.f59103d;
        }

        /* JADX INFO: renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m30924getUnspecifiedUIouoOA() {
            return lwg.f59102c;
        }

        private C9014a() {
        }
    }

    private /* synthetic */ lwg(long j) {
        this.f59105a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ lwg m30915boximpl(long j) {
        return new lwg(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30916constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30917equalsimpl(long j, Object obj) {
        return (obj instanceof lwg) && j == ((lwg) obj).m30921unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30918equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30919hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30920toStringimpl(long j) {
        return m30918equalsimpl0(j, f59102c) ? "Unspecified" : m30918equalsimpl0(j, f59103d) ? "Sp" : m30918equalsimpl0(j, f59104e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m30917equalsimpl(this.f59105a, obj);
    }

    public int hashCode() {
        return m30919hashCodeimpl(this.f59105a);
    }

    @yfb
    public String toString() {
        return m30920toStringimpl(this.f59105a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30921unboximpl() {
        return this.f59105a;
    }
}
