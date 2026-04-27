package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@ph5
public final class hl3 {

    /* JADX INFO: renamed from: a */
    public static final hl3 f44064a = new hl3("WHITESPACE_SEPARATED", 0);

    /* JADX INFO: renamed from: b */
    public static final hl3 f44065b = new hl3("ARRAY_WRAPPED", 1);

    /* JADX INFO: renamed from: c */
    public static final hl3 f44066c = new hl3("AUTO_DETECT", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hl3[] f44067d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f44068e;

    private static final /* synthetic */ hl3[] $values() {
        return new hl3[]{f44064a, f44065b, f44066c};
    }

    static {
        hl3[] hl3VarArr$values = $values();
        f44067d = hl3VarArr$values;
        f44068e = x35.enumEntries(hl3VarArr$values);
    }

    private hl3(String str, int i) {
    }

    @yfb
    public static v35<hl3> getEntries() {
        return f44068e;
    }

    public static hl3 valueOf(String str) {
        return (hl3) Enum.valueOf(hl3.class, str);
    }

    public static hl3[] values() {
        return (hl3[]) f44067d.clone();
    }
}
