package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.8")
@mh5
public final class d03 {

    /* JADX INFO: renamed from: a */
    public static final d03 f28127a = new d03("CONTINUE", 0);

    /* JADX INFO: renamed from: b */
    public static final d03 f28128b = new d03("SKIP_SUBTREE", 1);

    /* JADX INFO: renamed from: c */
    public static final d03 f28129c = new d03("TERMINATE", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ d03[] f28130d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f28131e;

    private static final /* synthetic */ d03[] $values() {
        return new d03[]{f28127a, f28128b, f28129c};
    }

    static {
        d03[] d03VarArr$values = $values();
        f28130d = d03VarArr$values;
        f28131e = x35.enumEntries(d03VarArr$values);
    }

    private d03(String str, int i) {
    }

    @yfb
    public static v35<d03> getEntries() {
        return f28131e;
    }

    public static d03 valueOf(String str) {
        return (d03) Enum.valueOf(d03.class, str);
    }

    public static d03[] values() {
        return (d03[]) f28130d.clone();
    }
}
