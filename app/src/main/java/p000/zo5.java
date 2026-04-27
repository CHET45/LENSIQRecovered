package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class zo5 {

    /* JADX INFO: renamed from: a */
    public static final float f105585a = 0.5f;

    private zo5() {
    }

    /* JADX INFO: renamed from: a */
    public static void m26915a(@y46(from = 0.0d, m25645to = 1.0d) float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }
}
