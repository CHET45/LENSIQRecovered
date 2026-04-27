package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ase {

    /* JADX INFO: renamed from: ase$a */
    public static final class C1591a {
        @Deprecated
        public static boolean getCanScrollBackward(@yfb ase aseVar) {
            return ase.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(@yfb ase aseVar) {
            return ase.super.getCanScrollForward();
        }

        @Deprecated
        public static boolean getLastScrolledBackward(@yfb ase aseVar) {
            return ase.super.getLastScrolledBackward();
        }

        @Deprecated
        public static boolean getLastScrolledForward(@yfb ase aseVar) {
            return ase.super.getLastScrolledForward();
        }
    }

    static /* synthetic */ Object scroll$default(ase aseVar, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return aseVar.scroll(j7bVar, gz6Var, zy2Var);
    }

    float dispatchRawDelta(float f);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    boolean isScrollInProgress();

    @gib
    Object scroll(@yfb j7b j7bVar, @yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var);
}
