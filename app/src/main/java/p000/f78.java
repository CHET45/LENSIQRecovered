package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class f78 extends d78 implements a62<Integer>, r5c<Integer> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C5662a f35619e = new C5662a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final f78 f35620f = new f78(1, 0);

    /* JADX INFO: renamed from: f78$a */
    public static final class C5662a {
        public /* synthetic */ C5662a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final f78 getEMPTY() {
            return f78.f35620f;
        }

        private C5662a() {
        }
    }

    public f78(int i, int i2) {
        super(i, i2, 1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @q64(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // p000.d78
    public boolean equals(@gib Object obj) {
        if (obj instanceof f78) {
            if (!isEmpty() || !((f78) obj).isEmpty()) {
                f78 f78Var = (f78) obj;
                if (getFirst() != f78Var.getFirst() || getLast() != f78Var.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.d78
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // p000.d78, p000.a62, p000.r5c
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // p000.d78
    @yfb
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(int i) {
        return getFirst() <= i && i <= getLast();
    }

    @Override // p000.r5c
    @yfb
    public Integer getEndExclusive() {
        if (getLast() != Integer.MAX_VALUE) {
            return Integer.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p000.a62
    @yfb
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }
}
