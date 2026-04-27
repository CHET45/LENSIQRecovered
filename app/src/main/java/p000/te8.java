package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vg5
@lz2
public final class te8 {

    /* JADX INFO: renamed from: a */
    @lz2
    public static final te8 f84385a = new te8("AT_MOST_ONCE", 0);

    /* JADX INFO: renamed from: b */
    @lz2
    public static final te8 f84386b = new te8("AT_LEAST_ONCE", 1);

    /* JADX INFO: renamed from: c */
    @lz2
    public static final te8 f84387c = new te8("EXACTLY_ONCE", 2);

    /* JADX INFO: renamed from: d */
    @lz2
    public static final te8 f84388d = new te8("UNKNOWN", 3);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ te8[] f84389e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v35 f84390f;

    private static final /* synthetic */ te8[] $values() {
        return new te8[]{f84385a, f84386b, f84387c, f84388d};
    }

    static {
        te8[] te8VarArr$values = $values();
        f84389e = te8VarArr$values;
        f84390f = x35.enumEntries(te8VarArr$values);
    }

    private te8(String str, int i) {
    }

    @yfb
    public static v35<te8> getEntries() {
        return f84390f;
    }

    public static te8 valueOf(String str) {
        return (te8) Enum.valueOf(te8.class, str);
    }

    public static te8[] values() {
        return (te8[]) f84389e.clone();
    }
}
