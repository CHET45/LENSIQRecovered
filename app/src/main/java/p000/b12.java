package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b12 {

    /* JADX INFO: renamed from: a */
    public static final b12 f12368a = new b12("NONE", 0);

    /* JADX INFO: renamed from: b */
    public static final b12 f12369b = new b12("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: c */
    public static final b12 f12370c = new b12("POLYMORPHIC", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b12[] f12371d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f12372e;

    private static final /* synthetic */ b12[] $values() {
        return new b12[]{f12368a, f12369b, f12370c};
    }

    static {
        b12[] b12VarArr$values = $values();
        f12371d = b12VarArr$values;
        f12372e = x35.enumEntries(b12VarArr$values);
    }

    private b12(String str, int i) {
    }

    @yfb
    public static v35<b12> getEntries() {
        return f12372e;
    }

    public static b12 valueOf(String str) {
        return (b12) Enum.valueOf(b12.class, str);
    }

    public static b12[] values() {
        return (b12[]) f12371d.clone();
    }
}
