package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class h84 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f42897a;

    private /* synthetic */ h84(String str) {
        this.f42897a = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h84 m29951boximpl(String str) {
        return new h84(str);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m29952constructorimpl(@yfb String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty");
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29953equalsimpl(String str, Object obj) {
        return (obj instanceof h84) && md8.areEqual(str, ((h84) obj).m29957unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29954equalsimpl0(String str, String str2) {
        return md8.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29955hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29956toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m29953equalsimpl(this.f42897a, obj);
    }

    @yfb
    public final String getName() {
        return this.f42897a;
    }

    public int hashCode() {
        return m29955hashCodeimpl(this.f42897a);
    }

    public String toString() {
        return m29956toStringimpl(this.f42897a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m29957unboximpl() {
        return this.f42897a;
    }
}
