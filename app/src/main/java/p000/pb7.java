package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class pb7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10879a f70211b = new C10879a(null);

    /* JADX INFO: renamed from: c */
    public static final int f70212c = m31762constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f70213d = m31762constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f70214e = m31762constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f70215a;

    /* JADX INFO: renamed from: pb7$a */
    public static final class C10879a {
        public /* synthetic */ C10879a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m31770getGroupULZAiWs() {
            return pb7.f70212c;
        }

        /* JADX INFO: renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m31771getNodeULZAiWs() {
            return pb7.f70213d;
        }

        /* JADX INFO: renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m31772getReusableNodeULZAiWs() {
            return pb7.f70214e;
        }

        private C10879a() {
        }
    }

    private /* synthetic */ pb7(int i) {
        this.f70215a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ pb7 m31761boximpl(int i) {
        return new pb7(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m31762constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31763equalsimpl(int i, Object obj) {
        return (obj instanceof pb7) && i == ((pb7) obj).m31769unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31764equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31765hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m31766isNodeimpl(int i) {
        return i != f70211b.m31770getGroupULZAiWs();
    }

    /* JADX INFO: renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m31767isReusableimpl(int i) {
        return i != f70211b.m31771getNodeULZAiWs();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31768toStringimpl(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m31763equalsimpl(this.f70215a, obj);
    }

    public final int getValue() {
        return this.f70215a;
    }

    public int hashCode() {
        return m31765hashCodeimpl(this.f70215a);
    }

    public String toString() {
        return m31768toStringimpl(this.f70215a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31769unboximpl() {
        return this.f70215a;
    }
}
