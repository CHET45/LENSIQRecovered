package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class dm1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C4857a f30031a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final dm1 f30032b;

    /* JADX INFO: renamed from: c */
    public static final dm1 f30033c = new dm1("SPARSE_ARRAY", 0);

    /* JADX INFO: renamed from: d */
    public static final dm1 f30034d;

    /* JADX INFO: renamed from: e */
    public static final dm1 f30035e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ dm1[] f30036f;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ v35 f30037m;

    /* JADX INFO: renamed from: dm1$a */
    public static final class C4857a {
        public /* synthetic */ C4857a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dm1 getDEFAULT() {
            return dm1.f30032b;
        }

        private C4857a() {
        }
    }

    private static final /* synthetic */ dm1[] $values() {
        return new dm1[]{f30033c, f30034d, f30035e};
    }

    static {
        dm1 dm1Var = new dm1("HASH_MAP", 1);
        f30034d = dm1Var;
        f30035e = new dm1("NO_CACHE", 2);
        dm1[] dm1VarArr$values = $values();
        f30036f = dm1VarArr$values;
        f30037m = x35.enumEntries(dm1VarArr$values);
        f30031a = new C4857a(null);
        f30032b = dm1Var;
    }

    private dm1(String str, int i) {
    }

    @yfb
    public static v35<dm1> getEntries() {
        return f30037m;
    }

    public static dm1 valueOf(String str) {
        return (dm1) Enum.valueOf(dm1.class, str);
    }

    public static dm1[] values() {
        return (dm1[]) f30036f.clone();
    }
}
