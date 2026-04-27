package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {mh5.class})
@jjf(version = "2.1")
public final class jkc {

    /* JADX INFO: renamed from: a */
    public static final jkc f51028a = new jkc("INCLUDE_DIRECTORIES", 0);

    /* JADX INFO: renamed from: b */
    public static final jkc f51029b = new jkc("BREADTH_FIRST", 1);

    /* JADX INFO: renamed from: c */
    public static final jkc f51030c = new jkc("FOLLOW_LINKS", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jkc[] f51031d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f51032e;

    private static final /* synthetic */ jkc[] $values() {
        return new jkc[]{f51028a, f51029b, f51030c};
    }

    static {
        jkc[] jkcVarArr$values = $values();
        f51031d = jkcVarArr$values;
        f51032e = x35.enumEntries(jkcVarArr$values);
    }

    private jkc(String str, int i) {
    }

    @yfb
    public static v35<jkc> getEntries() {
        return f51032e;
    }

    public static jkc valueOf(String str) {
        return (jkc) Enum.valueOf(jkc.class, str);
    }

    public static jkc[] values() {
        return (jkc[]) f51031d.clone();
    }
}
