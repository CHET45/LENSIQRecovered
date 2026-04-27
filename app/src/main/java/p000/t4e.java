package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.2")
public final class t4e {

    /* JADX INFO: renamed from: a */
    public static final t4e f83713a = new t4e("LANGUAGE_VERSION", 0);

    /* JADX INFO: renamed from: b */
    public static final t4e f83714b = new t4e("COMPILER_VERSION", 1);

    /* JADX INFO: renamed from: c */
    public static final t4e f83715c = new t4e("API_VERSION", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t4e[] f83716d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f83717e;

    private static final /* synthetic */ t4e[] $values() {
        return new t4e[]{f83713a, f83714b, f83715c};
    }

    static {
        t4e[] t4eVarArr$values = $values();
        f83716d = t4eVarArr$values;
        f83717e = x35.enumEntries(t4eVarArr$values);
    }

    private t4e(String str, int i) {
    }

    @yfb
    public static v35<t4e> getEntries() {
        return f83717e;
    }

    public static t4e valueOf(String str) {
        return (t4e) Enum.valueOf(t4e.class, str);
    }

    public static t4e[] values() {
        return (t4e[]) f83716d.clone();
    }
}
