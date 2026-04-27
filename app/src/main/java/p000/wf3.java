package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wf3 implements cjb {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ wf3[] f94065C;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ v35 f94066F;

    /* JADX INFO: renamed from: b */
    public static final wf3 f94067b = new wf3("COLLECTION_UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c */
    public static final wf3 f94068c = new wf3("COLLECTION_SDK_NOT_INSTALLED", 1, 1);

    /* JADX INFO: renamed from: d */
    public static final wf3 f94069d = new wf3("COLLECTION_ENABLED", 2, 2);

    /* JADX INFO: renamed from: e */
    public static final wf3 f94070e = new wf3("COLLECTION_DISABLED", 3, 3);

    /* JADX INFO: renamed from: f */
    public static final wf3 f94071f = new wf3("COLLECTION_DISABLED_REMOTE", 4, 4);

    /* JADX INFO: renamed from: m */
    public static final wf3 f94072m = new wf3("COLLECTION_SAMPLED", 5, 5);

    /* JADX INFO: renamed from: a */
    public final int f94073a;

    private static final /* synthetic */ wf3[] $values() {
        return new wf3[]{f94067b, f94068c, f94069d, f94070e, f94071f, f94072m};
    }

    static {
        wf3[] wf3VarArr$values = $values();
        f94065C = wf3VarArr$values;
        f94066F = x35.enumEntries(wf3VarArr$values);
    }

    private wf3(String str, int i, int i2) {
        this.f94073a = i2;
    }

    @yfb
    public static v35<wf3> getEntries() {
        return f94066F;
    }

    public static wf3 valueOf(String str) {
        return (wf3) Enum.valueOf(wf3.class, str);
    }

    public static wf3[] values() {
        return (wf3[]) f94065C.clone();
    }

    @Override // p000.cjb
    public int getNumber() {
        return this.f94073a;
    }
}
