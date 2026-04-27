package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@xxb
public final class szg {

    /* JADX INFO: renamed from: a */
    public static final szg f83282a = new szg("FIXED_PERIOD", 0);

    /* JADX INFO: renamed from: b */
    public static final szg f83283b = new szg("FIXED_DELAY", 1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ szg[] f83284c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v35 f83285d;

    private static final /* synthetic */ szg[] $values() {
        return new szg[]{f83282a, f83283b};
    }

    static {
        szg[] szgVarArr$values = $values();
        f83284c = szgVarArr$values;
        f83285d = x35.enumEntries(szgVarArr$values);
    }

    private szg(String str, int i) {
    }

    @yfb
    public static v35<szg> getEntries() {
        return f83285d;
    }

    public static szg valueOf(String str) {
        return (szg) Enum.valueOf(szg.class, str);
    }

    public static szg[] values() {
        return (szg[]) f83284c.clone();
    }
}
