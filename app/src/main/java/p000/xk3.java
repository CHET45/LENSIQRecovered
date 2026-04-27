package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xk3 {
    public static final <T, V extends AbstractC16313zy> T calculateTargetValue(@yfb vk3<T> vk3Var, @yfb alh<T, V> alhVar, T t, T t2) {
        return (T) alhVar.getConvertFromVector().invoke(vk3Var.vectorize(alhVar).getTargetValue(alhVar.getConvertToVector().invoke(t), alhVar.getConvertToVector().invoke(t2)));
    }

    @yfb
    public static final <T> vk3<T> exponentialDecay(@y46(from = 0.0d, fromInclusive = false) float f, @y46(from = 0.0d, fromInclusive = false) float f2) {
        return generateDecayAnimationSpec(new g46(f, f2));
    }

    public static /* synthetic */ vk3 exponentialDecay$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return exponentialDecay(f, f2);
    }

    @yfb
    public static final <T> vk3<T> generateDecayAnimationSpec(@yfb e46 e46Var) {
        return new wk3(e46Var);
    }

    public static final float calculateTargetValue(@yfb vk3<Float> vk3Var, float f, float f2) {
        return ((C14294vy) vk3Var.vectorize(g3i.getVectorConverter(d46.f28382a)).getTargetValue(C1667az.AnimationVector(f), C1667az.AnimationVector(f2))).getValue();
    }
}
