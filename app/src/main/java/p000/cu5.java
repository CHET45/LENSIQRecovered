package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class cu5 {

    /* JADX INFO: renamed from: a */
    public static final cu5 f27617a = new cu5("TOP_DOWN", 0);

    /* JADX INFO: renamed from: b */
    public static final cu5 f27618b = new cu5("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cu5[] f27619c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v35 f27620d;

    private static final /* synthetic */ cu5[] $values() {
        return new cu5[]{f27617a, f27618b};
    }

    static {
        cu5[] cu5VarArr$values = $values();
        f27619c = cu5VarArr$values;
        f27620d = x35.enumEntries(cu5VarArr$values);
    }

    private cu5(String str, int i) {
    }

    @yfb
    public static v35<cu5> getEntries() {
        return f27620d;
    }

    public static cu5 valueOf(String str) {
        return (cu5) Enum.valueOf(cu5.class, str);
    }

    public static cu5[] values() {
        return (cu5[]) f27619c.clone();
    }
}
