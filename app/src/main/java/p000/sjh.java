package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class sjh {

    /* JADX INFO: renamed from: a */
    public static final sjh f82049a = new sjh("SUCCESSFUL", 0);

    /* JADX INFO: renamed from: b */
    public static final sjh f82050b = new sjh("REREGISTER", 1);

    /* JADX INFO: renamed from: c */
    public static final sjh f82051c = new sjh("CANCELLED", 2);

    /* JADX INFO: renamed from: d */
    public static final sjh f82052d = new sjh("ALREADY_SELECTED", 3);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ sjh[] f82053e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v35 f82054f;

    private static final /* synthetic */ sjh[] $values() {
        return new sjh[]{f82049a, f82050b, f82051c, f82052d};
    }

    static {
        sjh[] sjhVarArr$values = $values();
        f82053e = sjhVarArr$values;
        f82054f = x35.enumEntries(sjhVarArr$values);
    }

    private sjh(String str, int i) {
    }

    @yfb
    public static v35<sjh> getEntries() {
        return f82054f;
    }

    public static sjh valueOf(String str) {
        return (sjh) Enum.valueOf(sjh.class, str);
    }

    public static sjh[] values() {
        return (sjh[]) f82053e.clone();
    }
}
