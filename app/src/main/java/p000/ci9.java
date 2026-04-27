package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ci9 implements cjb {

    /* JADX INFO: renamed from: b */
    public static final ci9 f16630b = new ci9("LOG_ENVIRONMENT_UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c */
    public static final ci9 f16631c = new ci9("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);

    /* JADX INFO: renamed from: d */
    public static final ci9 f16632d = new ci9("LOG_ENVIRONMENT_STAGING", 2, 2);

    /* JADX INFO: renamed from: e */
    public static final ci9 f16633e = new ci9("LOG_ENVIRONMENT_PROD", 3, 3);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ci9[] f16634f;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ v35 f16635m;

    /* JADX INFO: renamed from: a */
    public final int f16636a;

    private static final /* synthetic */ ci9[] $values() {
        return new ci9[]{f16630b, f16631c, f16632d, f16633e};
    }

    static {
        ci9[] ci9VarArr$values = $values();
        f16634f = ci9VarArr$values;
        f16635m = x35.enumEntries(ci9VarArr$values);
    }

    private ci9(String str, int i, int i2) {
        this.f16636a = i2;
    }

    @yfb
    public static v35<ci9> getEntries() {
        return f16635m;
    }

    public static ci9 valueOf(String str) {
        return (ci9) Enum.valueOf(ci9.class, str);
    }

    public static ci9[] values() {
        return (ci9[]) f16634f.clone();
    }

    @Override // p000.cjb
    public int getNumber() {
        return this.f16636a;
    }
}
