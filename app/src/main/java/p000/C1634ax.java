package p000;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: classes.dex */
public final class C1634ax {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14294vy f12048a = C1667az.AnimationVector(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14830wy f12049b = C1667az.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C15345xy f12050c = C1667az.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C15879yy f12051d = C1667az.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C14294vy f12052e = C1667az.AnimationVector(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C14830wy f12053f = C1667az.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C15345xy f12054g = C1667az.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C15879yy f12055h = C1667az.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @yfb
    public static final C13257tw<Float, C14294vy> Animatable(float f, float f2) {
        return new C13257tw<>(Float.valueOf(f), g3i.getVectorConverter(d46.f28382a), Float.valueOf(f2), null, 8, null);
    }

    public static /* synthetic */ C13257tw Animatable$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return Animatable(f, f2);
    }
}
