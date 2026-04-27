package p000;

/* JADX INFO: renamed from: az */
/* JADX INFO: loaded from: classes.dex */
public final class C1667az {
    @yfb
    public static final C14294vy AnimationVector(float f) {
        return new C14294vy(f);
    }

    @yfb
    public static final <T extends AbstractC16313zy> T copy(@yfb T t) {
        T t2 = (T) newInstance(t);
        int size$animation_core_release = t2.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t2.set$animation_core_release(i, t.get$animation_core_release(i));
        }
        return t2;
    }

    public static final <T extends AbstractC16313zy> void copyFrom(@yfb T t, @yfb T t2) {
        int size$animation_core_release = t.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t.set$animation_core_release(i, t2.get$animation_core_release(i));
        }
    }

    @yfb
    public static final <T extends AbstractC16313zy> T newInstance(@yfb T t) {
        T t2 = (T) t.newVector$animation_core_release();
        md8.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t2;
    }

    @yfb
    public static final C14830wy AnimationVector(float f, float f2) {
        return new C14830wy(f, f2);
    }

    @yfb
    public static final C15345xy AnimationVector(float f, float f2, float f3) {
        return new C15345xy(f, f2, f3);
    }

    @yfb
    public static final C15879yy AnimationVector(float f, float f2, float f3, float f4) {
        return new C15879yy(f, f2, f3, f4);
    }
}
