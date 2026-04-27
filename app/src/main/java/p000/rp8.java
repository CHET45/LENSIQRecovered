package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public final class rp8 {

    /* JADX INFO: renamed from: a */
    public static final rp8 f78978a = new rp8("INVARIANT", 0);

    /* JADX INFO: renamed from: b */
    public static final rp8 f78979b = new rp8("IN", 1);

    /* JADX INFO: renamed from: c */
    public static final rp8 f78980c = new rp8("OUT", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rp8[] f78981d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f78982e;

    private static final /* synthetic */ rp8[] $values() {
        return new rp8[]{f78978a, f78979b, f78980c};
    }

    static {
        rp8[] rp8VarArr$values = $values();
        f78981d = rp8VarArr$values;
        f78982e = x35.enumEntries(rp8VarArr$values);
    }

    private rp8(String str, int i) {
    }

    @yfb
    public static v35<rp8> getEntries() {
        return f78982e;
    }

    public static rp8 valueOf(String str) {
        return (rp8) Enum.valueOf(rp8.class, str);
    }

    public static rp8[] values() {
        return (rp8[]) f78981d.clone();
    }
}
