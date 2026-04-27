package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class jae {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7826a f50116b = new C7826a(null);

    /* JADX INFO: renamed from: c */
    public static final int f50117c = m30495constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f50118d = m30495constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f50119e = m30495constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f50120f = m30495constructorimpl(3);

    /* JADX INFO: renamed from: g */
    public static final int f50121g = m30495constructorimpl(4);

    /* JADX INFO: renamed from: h */
    public static final int f50122h = m30495constructorimpl(5);

    /* JADX INFO: renamed from: i */
    public static final int f50123i = m30495constructorimpl(6);

    /* JADX INFO: renamed from: a */
    public final int f50124a;

    /* JADX INFO: renamed from: jae$a */
    public static final class C7826a {
        public /* synthetic */ C7826a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m30501getButtono7Vup1c() {
            return jae.f50117c;
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m30502getCheckboxo7Vup1c() {
            return jae.f50118d;
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m30503getDropdownListo7Vup1c() {
            return jae.f50123i;
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m30504getImageo7Vup1c() {
            return jae.f50122h;
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m30505getRadioButtono7Vup1c() {
            return jae.f50120f;
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m30506getSwitcho7Vup1c() {
            return jae.f50119e;
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m30507getTabo7Vup1c() {
            return jae.f50121g;
        }

        private C7826a() {
        }
    }

    private /* synthetic */ jae(int i) {
        this.f50124a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ jae m30494boximpl(int i) {
        return new jae(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m30495constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30496equalsimpl(int i, Object obj) {
        return (obj instanceof jae) && i == ((jae) obj).m30500unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30497equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30498hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30499toStringimpl(int i) {
        return m30497equalsimpl0(i, f50117c) ? "Button" : m30497equalsimpl0(i, f50118d) ? "Checkbox" : m30497equalsimpl0(i, f50119e) ? "Switch" : m30497equalsimpl0(i, f50120f) ? "RadioButton" : m30497equalsimpl0(i, f50121g) ? "Tab" : m30497equalsimpl0(i, f50122h) ? "Image" : m30497equalsimpl0(i, f50123i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m30496equalsimpl(this.f50124a, obj);
    }

    public int hashCode() {
        return m30498hashCodeimpl(this.f50124a);
    }

    @yfb
    public String toString() {
        return m30499toStringimpl(this.f50124a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30500unboximpl() {
        return this.f50124a;
    }
}
