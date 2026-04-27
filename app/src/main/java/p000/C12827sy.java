package p000;

/* JADX INFO: renamed from: sy */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public final class C12827sy {
    @yfb
    public static final C12364ry<Float, C14294vy> AnimationState(float f, float f2, long j, long j2, boolean z) {
        return new C12364ry<>(g3i.getVectorConverter(d46.f28382a), Float.valueOf(f), C1667az.AnimationVector(f2), j, j2, z);
    }

    public static /* synthetic */ C12364ry AnimationState$default(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return AnimationState(f, f2, j3, j4, z);
    }

    @yfb
    public static final <T, V extends AbstractC16313zy> C12364ry<T, V> copy(@yfb C12364ry<T, V> c12364ry, T t, @gib V v, long j, long j2, boolean z) {
        return new C12364ry<>(c12364ry.getTypeConverter(), t, v, j, j2, z);
    }

    public static /* synthetic */ C12364ry copy$default(C12364ry c12364ry, Object obj, AbstractC16313zy abstractC16313zy, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c12364ry.getValue();
        }
        if ((i & 2) != 0) {
            abstractC16313zy = C1667az.copy(c12364ry.getVelocityVector());
        }
        AbstractC16313zy abstractC16313zy2 = abstractC16313zy;
        if ((i & 4) != 0) {
            j = c12364ry.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c12364ry.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c12364ry.isRunning();
        }
        return copy((C12364ry<Object, AbstractC16313zy>) c12364ry, obj, abstractC16313zy2, j3, j4, z);
    }

    @yfb
    public static final <T, V extends AbstractC16313zy> V createZeroVectorFrom(@yfb alh<T, V> alhVar, T t) {
        V vInvoke = alhVar.getConvertToVector().invoke(t);
        vInvoke.reset$animation_core_release();
        return vInvoke;
    }

    public static final boolean isFinished(@yfb C12364ry<?, ?> c12364ry) {
        return c12364ry.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    @yfb
    public static final C12364ry<Float, C14294vy> copy(@yfb C12364ry<Float, C14294vy> c12364ry, float f, float f2, long j, long j2, boolean z) {
        return new C12364ry<>(c12364ry.getTypeConverter(), Float.valueOf(f), C1667az.AnimationVector(f2), j, j2, z);
    }

    @yfb
    public static final <T, V extends AbstractC16313zy> C12364ry<T, V> AnimationState(@yfb alh<T, V> alhVar, T t, T t2, long j, long j2, boolean z) {
        return new C12364ry<>(alhVar, t, alhVar.getConvertToVector().invoke(t2), j, j2, z);
    }

    public static /* synthetic */ C12364ry copy$default(C12364ry c12364ry, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) c12364ry.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C14294vy) c12364ry.getVelocityVector()).getValue();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = c12364ry.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c12364ry.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c12364ry.isRunning();
        }
        return copy((C12364ry<Float, C14294vy>) c12364ry, f, f3, j3, j4, z);
    }
}
