package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class bqg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C2006a f14513b = new C2006a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14514c = m28035constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f14515d = m28035constructorimpl(2);

    /* JADX INFO: renamed from: e */
    public static final int f14516e = m28035constructorimpl(3);

    /* JADX INFO: renamed from: f */
    public static final int f14517f = m28035constructorimpl(4);

    /* JADX INFO: renamed from: g */
    public static final int f14518g = m28035constructorimpl(5);

    /* JADX INFO: renamed from: h */
    public static final int f14519h = m28035constructorimpl(6);

    /* JADX INFO: renamed from: i */
    public static final int f14520i = m28035constructorimpl(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public final int f14521a;

    /* JADX INFO: renamed from: bqg$a */
    public static final class C2006a {
        public /* synthetic */ C2006a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m28041getCentere0LSkKk() {
            return bqg.f14516e;
        }

        /* JADX INFO: renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m28042getEnde0LSkKk() {
            return bqg.f14519h;
        }

        /* JADX INFO: renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m28043getJustifye0LSkKk() {
            return bqg.f14517f;
        }

        /* JADX INFO: renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m28044getLefte0LSkKk() {
            return bqg.f14514c;
        }

        /* JADX INFO: renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m28045getRighte0LSkKk() {
            return bqg.f14515d;
        }

        /* JADX INFO: renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m28046getStarte0LSkKk() {
            return bqg.f14518g;
        }

        /* JADX INFO: renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m28047getUnspecifiede0LSkKk() {
            return bqg.f14520i;
        }

        @yfb
        public final List<bqg> values() {
            return l82.listOf((Object[]) new bqg[]{bqg.m28034boximpl(m28044getLefte0LSkKk()), bqg.m28034boximpl(m28045getRighte0LSkKk()), bqg.m28034boximpl(m28041getCentere0LSkKk()), bqg.m28034boximpl(m28043getJustifye0LSkKk()), bqg.m28034boximpl(m28046getStarte0LSkKk()), bqg.m28034boximpl(m28042getEnde0LSkKk())});
        }

        private C2006a() {
        }
    }

    private /* synthetic */ bqg(int i) {
        this.f14521a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bqg m28034boximpl(int i) {
        return new bqg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28035constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28036equalsimpl(int i, Object obj) {
        return (obj instanceof bqg) && i == ((bqg) obj).m28040unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28037equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28038hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28039toStringimpl(int i) {
        return m28037equalsimpl0(i, f14514c) ? "Left" : m28037equalsimpl0(i, f14515d) ? "Right" : m28037equalsimpl0(i, f14516e) ? "Center" : m28037equalsimpl0(i, f14517f) ? "Justify" : m28037equalsimpl0(i, f14518g) ? "Start" : m28037equalsimpl0(i, f14519h) ? "End" : m28037equalsimpl0(i, f14520i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m28036equalsimpl(this.f14521a, obj);
    }

    public int hashCode() {
        return m28038hashCodeimpl(this.f14521a);
    }

    @yfb
    public String toString() {
        return m28039toStringimpl(this.f14521a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28040unboximpl() {
        return this.f14521a;
    }
}
