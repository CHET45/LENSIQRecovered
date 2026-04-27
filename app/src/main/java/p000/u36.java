package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u36 {

    /* JADX INFO: renamed from: a */
    public static final float f86719a = 9.80665f;

    /* JADX INFO: renamed from: b */
    public static final float f86720b = 39.37f;

    /* JADX INFO: renamed from: c */
    public static final float f86721c = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeDeceleration(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}
