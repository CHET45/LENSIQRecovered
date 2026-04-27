package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class u64 {

    /* JADX INFO: renamed from: a */
    public static final u64 f86865a = new u64("WARNING", 0);

    /* JADX INFO: renamed from: b */
    public static final u64 f86866b = new u64("ERROR", 1);

    /* JADX INFO: renamed from: c */
    public static final u64 f86867c = new u64("HIDDEN", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ u64[] f86868d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f86869e;

    private static final /* synthetic */ u64[] $values() {
        return new u64[]{f86865a, f86866b, f86867c};
    }

    static {
        u64[] u64VarArr$values = $values();
        f86868d = u64VarArr$values;
        f86869e = x35.enumEntries(u64VarArr$values);
    }

    private u64(String str, int i) {
    }

    @yfb
    public static v35<u64> getEntries() {
        return f86869e;
    }

    public static u64 valueOf(String str) {
        return (u64) Enum.valueOf(u64.class, str);
    }

    public static u64[] values() {
        return (u64[]) f86868d.clone();
    }
}
