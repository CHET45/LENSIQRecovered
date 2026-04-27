package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bw1 extends zv1 implements a62<Character>, r5c<Character> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C2072a f14983e = new C2072a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final bw1 f14984f = new bw1(1, 0);

    /* JADX INFO: renamed from: bw1$a */
    public static final class C2072a {
        public /* synthetic */ C2072a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final bw1 getEMPTY() {
            return bw1.f14984f;
        }

        private C2072a() {
        }
    }

    public bw1(char c, char c2) {
        super(c, c2, 1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @q64(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    @Override // p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    @Override // p000.zv1
    public boolean equals(@gib Object obj) {
        if (obj instanceof bw1) {
            if (!isEmpty() || !((bw1) obj).isEmpty()) {
                bw1 bw1Var = (bw1) obj;
                if (getFirst() != bw1Var.getFirst() || getLast() != bw1Var.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.zv1
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * zsi.f106019b) + getLast();
    }

    @Override // p000.zv1, p000.a62, p000.r5c
    public boolean isEmpty() {
        return md8.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // p000.zv1
    @yfb
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(char c) {
        return md8.compare((int) getFirst(), (int) c) <= 0 && md8.compare((int) c, (int) getLast()) <= 0;
    }

    @Override // p000.r5c
    @yfb
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p000.a62
    @yfb
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public Character getStart() {
        return Character.valueOf(getFirst());
    }
}
