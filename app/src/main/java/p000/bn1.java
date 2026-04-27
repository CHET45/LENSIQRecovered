package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bn1 {

    /* JADX INFO: renamed from: a */
    public static final boolean f14168a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f14168a = z;
    }

    @yfb
    public static final <T> y1f<T> createCache(@yfb qy6<? super oo8<?>, ? extends lp8<T>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "factory");
        return f14168a ? new q12(qy6Var) : new kp2(qy6Var);
    }

    @yfb
    public static final <T> ngc<T> createParametrizedCache(@yfb gz6<? super oo8<Object>, ? super List<? extends mp8>, ? extends lp8<T>> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "factory");
        return f14168a ? new t12(gz6Var) : new lp2(gz6Var);
    }
}
