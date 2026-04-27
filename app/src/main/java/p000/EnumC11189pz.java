package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pz */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC11189pz {

    /* JADX INFO: renamed from: a */
    public static final EnumC11189pz f72536a = new EnumC11189pz("SOURCE", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC11189pz f72537b = new EnumC11189pz("BINARY", 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC11189pz f72538c = new EnumC11189pz("RUNTIME", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC11189pz[] f72539d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f72540e;

    private static final /* synthetic */ EnumC11189pz[] $values() {
        return new EnumC11189pz[]{f72536a, f72537b, f72538c};
    }

    static {
        EnumC11189pz[] enumC11189pzArr$values = $values();
        f72539d = enumC11189pzArr$values;
        f72540e = x35.enumEntries(enumC11189pzArr$values);
    }

    private EnumC11189pz(String str, int i) {
    }

    @yfb
    public static v35<EnumC11189pz> getEntries() {
        return f72540e;
    }

    public static EnumC11189pz valueOf(String str) {
        return (EnumC11189pz) Enum.valueOf(EnumC11189pz.class, str);
    }

    public static EnumC11189pz[] values() {
        return (EnumC11189pz[]) f72539d.clone();
    }
}
