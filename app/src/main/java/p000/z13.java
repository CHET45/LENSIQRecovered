package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@yjd
public final class z13 {

    /* JADX INFO: renamed from: a */
    public static final z13 f103650a = new z13("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: b */
    public static final z13 f103651b = new z13("UNDECIDED", 1);

    /* JADX INFO: renamed from: c */
    public static final z13 f103652c = new z13("RESUMED", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ z13[] f103653d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f103654e;

    private static final /* synthetic */ z13[] $values() {
        return new z13[]{f103650a, f103651b, f103652c};
    }

    static {
        z13[] z13VarArr$values = $values();
        f103653d = z13VarArr$values;
        f103654e = x35.enumEntries(z13VarArr$values);
    }

    private z13(String str, int i) {
    }

    @yfb
    public static v35<z13> getEntries() {
        return f103654e;
    }

    public static z13 valueOf(String str) {
        return (z13) Enum.valueOf(z13.class, str);
    }

    public static z13[] values() {
        return (z13[]) f103653d.clone();
    }
}
