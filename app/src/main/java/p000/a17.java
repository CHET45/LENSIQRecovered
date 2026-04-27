package p000;

/* JADX INFO: loaded from: classes7.dex */
@la8
public interface a17<T> extends y56<T> {

    /* JADX INFO: renamed from: a17$a */
    public static final class C0009a {
        public static /* synthetic */ y56 fuse$default(a17 a17Var, e13 e13Var, int i, gf1 gf1Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                e13Var = a05.f2a;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                gf1Var = gf1.f39657a;
            }
            return a17Var.fuse(e13Var, i, gf1Var);
        }
    }

    @yfb
    y56<T> fuse(@yfb e13 e13Var, int i, @yfb gf1 gf1Var);
}
