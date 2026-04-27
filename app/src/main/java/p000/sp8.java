package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public final class sp8 {

    /* JADX INFO: renamed from: a */
    public static final sp8 f82517a = new sp8(bj4.f13856a, 0);

    /* JADX INFO: renamed from: b */
    public static final sp8 f82518b = new sp8("PROTECTED", 1);

    /* JADX INFO: renamed from: c */
    public static final sp8 f82519c = new sp8("INTERNAL", 2);

    /* JADX INFO: renamed from: d */
    public static final sp8 f82520d = new sp8("PRIVATE", 3);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ sp8[] f82521e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v35 f82522f;

    private static final /* synthetic */ sp8[] $values() {
        return new sp8[]{f82517a, f82518b, f82519c, f82520d};
    }

    static {
        sp8[] sp8VarArr$values = $values();
        f82521e = sp8VarArr$values;
        f82522f = x35.enumEntries(sp8VarArr$values);
    }

    private sp8(String str, int i) {
    }

    @yfb
    public static v35<sp8> getEntries() {
        return f82522f;
    }

    public static sp8 valueOf(String str) {
        return (sp8) Enum.valueOf(sp8.class, str);
    }

    public static sp8[] values() {
        return (sp8[]) f82521e.clone();
    }
}
