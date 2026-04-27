package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vg5
@lz2
public interface jz2 {

    /* JADX INFO: renamed from: jz2$a */
    public static final class C8146a {
        public static /* synthetic */ wo1 callsInPlace$default(jz2 jz2Var, uy6 uy6Var, te8 te8Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i & 2) != 0) {
                te8Var = te8.f84388d;
            }
            return jz2Var.callsInPlace(uy6Var, te8Var);
        }
    }

    @yfb
    @lz2
    <R> wo1 callsInPlace(@yfb uy6<? extends R> uy6Var, @yfb te8 te8Var);

    @yfb
    @lz2
    a9e returns();

    @yfb
    @lz2
    a9e returns(@gib Object obj);

    @yfb
    @lz2
    c9e returnsNotNull();
}
