package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.8")
@mh5
public final class r2c {

    /* JADX INFO: renamed from: a */
    public static final r2c f76902a = new r2c("SKIP_SUBTREE", 0);

    /* JADX INFO: renamed from: b */
    public static final r2c f76903b = new r2c("TERMINATE", 1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ r2c[] f76904c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v35 f76905d;

    private static final /* synthetic */ r2c[] $values() {
        return new r2c[]{f76902a, f76903b};
    }

    static {
        r2c[] r2cVarArr$values = $values();
        f76904c = r2cVarArr$values;
        f76905d = x35.enumEntries(r2cVarArr$values);
    }

    private r2c(String str, int i) {
    }

    @yfb
    public static v35<r2c> getEntries() {
        return f76905d;
    }

    public static r2c valueOf(String str) {
        return (r2c) Enum.valueOf(r2c.class, str);
    }

    public static r2c[] values() {
        return (r2c[]) f76904c.clone();
    }
}
