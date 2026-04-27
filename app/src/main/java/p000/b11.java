package p000;

/* JADX INFO: loaded from: classes.dex */
public interface b11 {

    /* JADX INFO: renamed from: b11$a */
    public interface InterfaceC1694a {
        boolean getHasMoreContent();
    }

    /* JADX INFO: renamed from: b11$b */
    @vn8
    public static final class C1695b {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f12360b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f12361c = m27929constructorimpl(1);

        /* JADX INFO: renamed from: d */
        public static final int f12362d = m27929constructorimpl(2);

        /* JADX INFO: renamed from: e */
        public static final int f12363e = m27929constructorimpl(3);

        /* JADX INFO: renamed from: f */
        public static final int f12364f = m27929constructorimpl(4);

        /* JADX INFO: renamed from: g */
        public static final int f12365g = m27929constructorimpl(5);

        /* JADX INFO: renamed from: h */
        public static final int f12366h = m27929constructorimpl(6);

        /* JADX INFO: renamed from: a */
        public final int f12367a;

        /* JADX INFO: renamed from: b11$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m27935getAbovehoxUOeE() {
                return C1695b.f12365g;
            }

            /* JADX INFO: renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m27936getAfterhoxUOeE() {
                return C1695b.f12362d;
            }

            /* JADX INFO: renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m27937getBeforehoxUOeE() {
                return C1695b.f12361c;
            }

            /* JADX INFO: renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m27938getBelowhoxUOeE() {
                return C1695b.f12366h;
            }

            /* JADX INFO: renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m27939getLefthoxUOeE() {
                return C1695b.f12363e;
            }

            /* JADX INFO: renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m27940getRighthoxUOeE() {
                return C1695b.f12364f;
            }

            private a() {
            }
        }

        private /* synthetic */ C1695b(int i) {
            this.f12367a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C1695b m27928boximpl(int i) {
            return new C1695b(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m27929constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m27930equalsimpl(int i, Object obj) {
            return (obj instanceof C1695b) && i == ((C1695b) obj).m27934unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m27931equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m27932hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m27933toStringimpl(int i) {
            return m27931equalsimpl0(i, f12361c) ? "Before" : m27931equalsimpl0(i, f12362d) ? "After" : m27931equalsimpl0(i, f12363e) ? "Left" : m27931equalsimpl0(i, f12364f) ? "Right" : m27931equalsimpl0(i, f12365g) ? "Above" : m27931equalsimpl0(i, f12366h) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m27930equalsimpl(this.f12367a, obj);
        }

        public int hashCode() {
            return m27932hashCodeimpl(this.f12367a);
        }

        @yfb
        public String toString() {
            return m27933toStringimpl(this.f12367a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m27934unboximpl() {
            return this.f12367a;
        }
    }

    @gib
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    <T> T mo27927layouto7g1Pn8(int i, @yfb qy6<? super InterfaceC1694a, ? extends T> qy6Var);
}
