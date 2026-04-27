package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class fp6 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C5920a f37355b = new C5920a(null);

    /* JADX INFO: renamed from: c */
    public static final int f37356c = m29573constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f37357d = m29573constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f37358a;

    /* JADX INFO: renamed from: fp6$a */
    public static final class C5920a {
        public /* synthetic */ C5920a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m29579getItalic_LCdwA$annotations() {
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m29580getNormal_LCdwA$annotations() {
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m29581getItalic_LCdwA() {
            return fp6.f37357d;
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m29582getNormal_LCdwA() {
            return fp6.f37356c;
        }

        @yfb
        public final List<fp6> values() {
            return l82.listOf((Object[]) new fp6[]{fp6.m29572boximpl(m29582getNormal_LCdwA()), fp6.m29572boximpl(m29581getItalic_LCdwA())});
        }

        private C5920a() {
        }
    }

    @q64(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @i2e(expression = "FontStyle.", imports = {}))
    private /* synthetic */ fp6(int i) {
        this.f37358a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ fp6 m29572boximpl(int i) {
        return new fp6(i);
    }

    @q64(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @i2e(expression = "FontStyle.", imports = {}))
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m29573constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29574equalsimpl(int i, Object obj) {
        return (obj instanceof fp6) && i == ((fp6) obj).m29578unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29575equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29576hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29577toStringimpl(int i) {
        return m29575equalsimpl0(i, f37356c) ? "Normal" : m29575equalsimpl0(i, f37357d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m29574equalsimpl(this.f37358a, obj);
    }

    public final int getValue() {
        return this.f37358a;
    }

    public int hashCode() {
        return m29576hashCodeimpl(this.f37358a);
    }

    @yfb
    public String toString() {
        return m29577toStringimpl(this.f37358a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29578unboximpl() {
        return this.f37358a;
    }
}
