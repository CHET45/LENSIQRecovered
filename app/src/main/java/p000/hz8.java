package p000;

/* JADX INFO: loaded from: classes7.dex */
public class hz8 {

    /* JADX INFO: renamed from: hz8$a */
    public /* synthetic */ class C7090a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45294a;

        static {
            int[] iArr = new int[g39.values().length];
            try {
                iArr[g39.f38325a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g39.f38326b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g39.f38327c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45294a = iArr;
        }
    }

    @yfb
    public static <T> fx8<T> lazy(@yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "initializer");
        jt3 jt3Var = null;
        return new aig(ny6Var, jt3Var, 2, jt3Var);
    }

    @yfb
    public static <T> fx8<T> lazy(@yfb g39 g39Var, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(g39Var, "mode");
        md8.checkNotNullParameter(ny6Var, "initializer");
        int i = C7090a.f45294a[g39Var.ordinal()];
        int i2 = 2;
        if (i == 1) {
            jt3 jt3Var = null;
            return new aig(ny6Var, jt3Var, i2, jt3Var);
        }
        if (i == 2) {
            return new xke(ny6Var);
        }
        if (i == 3) {
            return new cvh(ny6Var);
        }
        throw new ceb();
    }

    @yfb
    public static final <T> fx8<T> lazy(@gib Object obj, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "initializer");
        return new aig(ny6Var, obj);
    }
}
