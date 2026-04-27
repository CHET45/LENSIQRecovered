package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f46 {

    /* JADX INFO: renamed from: a */
    public static final float f35030a = -4.2f;

    @yfb
    public static final InterfaceC6643gy<Float, C14294vy> createAnimation(@yfb e46 e46Var, float f, float f2) {
        return C8551ky.DecayAnimation(e46Var, f, f2);
    }

    public static /* synthetic */ InterfaceC6643gy createAnimation$default(e46 e46Var, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return createAnimation(e46Var, f, f2);
    }
}
