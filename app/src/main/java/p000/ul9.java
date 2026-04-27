package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ul9 extends sl9 implements a62<Long>, r5c<Long> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C13584a f88362e = new C13584a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final ul9 f88363f = new ul9(1, 0);

    /* JADX INFO: renamed from: ul9$a */
    public static final class C13584a {
        public /* synthetic */ C13584a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ul9 getEMPTY() {
            return ul9.f88363f;
        }

        private C13584a() {
        }
    }

    public ul9(long j, long j2) {
        super(j, j2, 1L);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @q64(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).longValue());
    }

    @Override // p000.sl9
    public boolean equals(@gib Object obj) {
        if (obj instanceof ul9) {
            if (!isEmpty() || !((ul9) obj).isEmpty()) {
                ul9 ul9Var = (ul9) obj;
                if (getFirst() != ul9Var.getFirst() || getLast() != ul9Var.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.sl9
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // p000.sl9, p000.a62, p000.r5c
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // p000.sl9
    @yfb
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(long j) {
        return getFirst() <= j && j <= getLast();
    }

    @Override // p000.r5c
    @yfb
    public Long getEndExclusive() {
        if (getLast() != Long.MAX_VALUE) {
            return Long.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p000.a62
    @yfb
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public Long getStart() {
        return Long.valueOf(getFirst());
    }
}
