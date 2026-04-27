package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class oab {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10283a f66990b = new C10283a(null);

    /* JADX INFO: renamed from: c */
    public static final int f66991c;

    /* JADX INFO: renamed from: d */
    public static final int f66992d;

    /* JADX INFO: renamed from: e */
    public static final int f66993e;

    /* JADX INFO: renamed from: f */
    public static final int f66994f;

    /* JADX INFO: renamed from: g */
    public static final int f66995g;

    /* JADX INFO: renamed from: h */
    public static final int f66996h;

    /* JADX INFO: renamed from: a */
    public final int f66997a;

    /* JADX INFO: renamed from: oab$a */
    public static final class C10283a {
        public /* synthetic */ C10283a(jt3 jt3Var) {
            this();
        }

        @q64(message = "This has been replaced by UserInput.", replaceWith = @i2e(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* JADX INFO: renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31315getDragWNlRxjI$annotations() {
        }

        @q64(message = "This has been replaced by SideEffect.", replaceWith = @i2e(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        /* JADX INFO: renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31316getFlingWNlRxjI$annotations() {
        }

        @ug5
        @q64(message = "Do not use. Will be removed in the future.")
        /* JADX INFO: renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31317getRelocateWNlRxjI$annotations() {
        }

        @q64(message = "This has been replaced by UserInput.", replaceWith = @i2e(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* JADX INFO: renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31318getWheelWNlRxjI$annotations() {
        }

        /* JADX INFO: renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m31319getDragWNlRxjI() {
            return oab.f66993e;
        }

        /* JADX INFO: renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m31320getFlingWNlRxjI() {
            return oab.f66994f;
        }

        @ug5
        /* JADX INFO: renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m31321getRelocateWNlRxjI() {
            return oab.f66995g;
        }

        /* JADX INFO: renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m31322getSideEffectWNlRxjI() {
            return oab.f66992d;
        }

        /* JADX INFO: renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m31323getUserInputWNlRxjI() {
            return oab.f66991c;
        }

        /* JADX INFO: renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m31324getWheelWNlRxjI() {
            return oab.f66996h;
        }

        private C10283a() {
        }
    }

    static {
        int iM31309constructorimpl = m31309constructorimpl(1);
        f66991c = iM31309constructorimpl;
        int iM31309constructorimpl2 = m31309constructorimpl(2);
        f66992d = iM31309constructorimpl2;
        f66993e = iM31309constructorimpl;
        f66994f = iM31309constructorimpl2;
        f66995g = m31309constructorimpl(3);
        f66996h = iM31309constructorimpl;
    }

    private /* synthetic */ oab(int i) {
        this.f66997a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ oab m31308boximpl(int i) {
        return new oab(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31309constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31310equalsimpl(int i, Object obj) {
        return (obj instanceof oab) && i == ((oab) obj).m31314unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31311equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31312hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31313toStringimpl(int i) {
        return m31311equalsimpl0(i, f66991c) ? "UserInput" : m31311equalsimpl0(i, f66992d) ? "SideEffect" : m31311equalsimpl0(i, f66995g) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31310equalsimpl(this.f66997a, obj);
    }

    public int hashCode() {
        return m31312hashCodeimpl(this.f66997a);
    }

    @yfb
    public String toString() {
        return m31313toStringimpl(this.f66997a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31314unboximpl() {
        return this.f66997a;
    }
}
