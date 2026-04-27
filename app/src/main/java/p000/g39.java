package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g39 {

    /* JADX INFO: renamed from: a */
    public static final g39 f38325a = new g39("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: b */
    public static final g39 f38326b = new g39("PUBLICATION", 1);

    /* JADX INFO: renamed from: c */
    public static final g39 f38327c = new g39("NONE", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ g39[] f38328d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f38329e;

    private static final /* synthetic */ g39[] $values() {
        return new g39[]{f38325a, f38326b, f38327c};
    }

    static {
        g39[] g39VarArr$values = $values();
        f38328d = g39VarArr$values;
        f38329e = x35.enumEntries(g39VarArr$values);
    }

    private g39(String str, int i) {
    }

    @yfb
    public static v35<g39> getEntries() {
        return f38329e;
    }

    public static g39 valueOf(String str) {
        return (g39) Enum.valueOf(g39.class, str);
    }

    public static g39[] values() {
        return (g39[]) f38328d.clone();
    }
}
