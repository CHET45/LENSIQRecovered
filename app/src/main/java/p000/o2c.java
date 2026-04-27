package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class o2c {

    /* JADX INFO: renamed from: a */
    public static final o2c f66314a = new o2c("SKIP", 0);

    /* JADX INFO: renamed from: b */
    public static final o2c f66315b = new o2c("TERMINATE", 1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ o2c[] f66316c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v35 f66317d;

    private static final /* synthetic */ o2c[] $values() {
        return new o2c[]{f66314a, f66315b};
    }

    static {
        o2c[] o2cVarArr$values = $values();
        f66316c = o2cVarArr$values;
        f66317d = x35.enumEntries(o2cVarArr$values);
    }

    private o2c(String str, int i) {
    }

    @yfb
    public static v35<o2c> getEntries() {
        return f66317d;
    }

    public static o2c valueOf(String str) {
        return (o2c) Enum.valueOf(o2c.class, str);
    }

    public static o2c[] values() {
        return (o2c[]) f66316c.clone();
    }
}
