package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b75 implements cjb {

    /* JADX INFO: renamed from: b */
    public static final b75 f12838b = new b75("EVENT_TYPE_UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c */
    public static final b75 f12839c = new b75("SESSION_START", 1, 1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b75[] f12840d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f12841e;

    /* JADX INFO: renamed from: a */
    public final int f12842a;

    private static final /* synthetic */ b75[] $values() {
        return new b75[]{f12838b, f12839c};
    }

    static {
        b75[] b75VarArr$values = $values();
        f12840d = b75VarArr$values;
        f12841e = x35.enumEntries(b75VarArr$values);
    }

    private b75(String str, int i, int i2) {
        this.f12842a = i2;
    }

    @yfb
    public static v35<b75> getEntries() {
        return f12841e;
    }

    public static b75 valueOf(String str) {
        return (b75) Enum.valueOf(b75.class, str);
    }

    public static b75[] values() {
        return (b75[]) f12840d.clone();
    }

    @Override // p000.cjb
    public int getNumber() {
        return this.f12842a;
    }
}
