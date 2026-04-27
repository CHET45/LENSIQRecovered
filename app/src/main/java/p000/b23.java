package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b23 {

    /* JADX INFO: renamed from: a */
    public static final b23 f12441a = new b23("DEFAULT", 0);

    /* JADX INFO: renamed from: b */
    public static final b23 f12442b = new b23("LAZY", 1);

    /* JADX INFO: renamed from: c */
    @t54
    public static final b23 f12443c = new b23("ATOMIC", 2);

    /* JADX INFO: renamed from: d */
    public static final b23 f12444d = new b23("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ b23[] f12445e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v35 f12446f;

    /* JADX INFO: renamed from: b23$a */
    public /* synthetic */ class C1704a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12447a;

        static {
            int[] iArr = new int[b23.values().length];
            try {
                iArr[b23.f12441a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b23.f12443c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b23.f12444d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b23.f12442b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12447a = iArr;
        }
    }

    private static final /* synthetic */ b23[] $values() {
        return new b23[]{f12441a, f12442b, f12443c, f12444d};
    }

    static {
        b23[] b23VarArr$values = $values();
        f12445e = b23VarArr$values;
        f12446f = x35.enumEntries(b23VarArr$values);
    }

    private b23(String str, int i) {
    }

    @yfb
    public static v35<b23> getEntries() {
        return f12446f;
    }

    @la8
    public static /* synthetic */ void isLazy$annotations() {
    }

    public static b23 valueOf(String str) {
        return (b23) Enum.valueOf(b23.class, str);
    }

    public static b23[] values() {
        return (b23[]) f12445e.clone();
    }

    @la8
    public final <R, T> void invoke(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        int i = C1704a.f12447a[ordinal()];
        if (i == 1) {
            mq1.startCoroutineCancellable(gz6Var, r, zy2Var);
            return;
        }
        if (i == 2) {
            ez2.startCoroutine(gz6Var, r, zy2Var);
        } else if (i == 3) {
            fsh.startCoroutineUndispatched(gz6Var, r, zy2Var);
        } else if (i != 4) {
            throw new ceb();
        }
    }

    public final boolean isLazy() {
        return this == f12442b;
    }
}
