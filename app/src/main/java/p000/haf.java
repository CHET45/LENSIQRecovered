package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class haf {

    /* JADX INFO: renamed from: a */
    public static final haf f43014a = new haf("START", 0);

    /* JADX INFO: renamed from: b */
    public static final haf f43015b = new haf("STOP", 1);

    /* JADX INFO: renamed from: c */
    public static final haf f43016c = new haf("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ haf[] f43017d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v35 f43018e;

    private static final /* synthetic */ haf[] $values() {
        return new haf[]{f43014a, f43015b, f43016c};
    }

    static {
        haf[] hafVarArr$values = $values();
        f43017d = hafVarArr$values;
        f43018e = x35.enumEntries(hafVarArr$values);
    }

    private haf(String str, int i) {
    }

    @yfb
    public static v35<haf> getEntries() {
        return f43018e;
    }

    public static haf valueOf(String str) {
        return (haf) Enum.valueOf(haf.class, str);
    }

    public static haf[] values() {
        return (haf[]) f43017d.clone();
    }
}
