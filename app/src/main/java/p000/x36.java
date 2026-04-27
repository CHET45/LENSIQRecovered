package p000;

/* JADX INFO: loaded from: classes.dex */
public interface x36 extends InterfaceC11178py<Float> {

    /* JADX INFO: renamed from: x36$a */
    public static final class C14890a {
        @Deprecated
        public static float getEndVelocity(@yfb x36 x36Var, float f, float f2, float f3) {
            return x36.super.getEndVelocity(f, f2, f3);
        }

        @yfb
        @Deprecated
        public static <V extends AbstractC16313zy> y3i<V> vectorize(@yfb x36 x36Var, @yfb alh<Float, V> alhVar) {
            return x36.super.vectorize((alh) alhVar);
        }
    }

    long getDurationNanos(float f, float f2, float f3);

    default float getEndVelocity(float f, float f2, float f3) {
        return getVelocityFromNanos(getDurationNanos(f, f2, f3), f, f2, f3);
    }

    float getValueFromNanos(long j, float f, float f2, float f3);

    float getVelocityFromNanos(long j, float f, float f2, float f3);

    @Override // p000.InterfaceC11178py
    @yfb
    default <V extends AbstractC16313zy> y3i<V> vectorize(@yfb alh<Float, V> alhVar) {
        return new y3i<>(this);
    }
}
