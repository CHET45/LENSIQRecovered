package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class gf1 {

    /* JADX INFO: renamed from: a */
    public static final gf1 f39657a = new gf1("SUSPEND", 0);

    /* JADX INFO: renamed from: b */
    public static final gf1 f39658b = new gf1("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: c */
    public static final gf1 f39659c = new gf1("DROP_LATEST", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gf1[] f39660d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f39661e;

    private static final /* synthetic */ gf1[] $values() {
        return new gf1[]{f39657a, f39658b, f39659c};
    }

    static {
        gf1[] gf1VarArr$values = $values();
        f39660d = gf1VarArr$values;
        f39661e = x35.enumEntries(gf1VarArr$values);
    }

    private gf1(String str, int i) {
    }

    @yfb
    public static v35<gf1> getEntries() {
        return f39661e;
    }

    public static gf1 valueOf(String str) {
        return (gf1) Enum.valueOf(gf1.class, str);
    }

    public static gf1[] values() {
        return (gf1[]) f39660d.clone();
    }
}
