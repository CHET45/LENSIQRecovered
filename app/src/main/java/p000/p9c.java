package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface p9c {

    /* JADX INFO: renamed from: a */
    public static final float f70102a = 1.0f;

    /* JADX INFO: renamed from: b */
    public static final Pair<Float, Float> f70103b;

    /* JADX INFO: renamed from: c */
    public static final Pair<Float, Float> f70104c;

    /* JADX INFO: renamed from: d */
    public static final Pair<Float, Float> f70105d;

    /* JADX INFO: renamed from: e */
    public static final float f70106e = 0.0f;

    /* JADX INFO: renamed from: f */
    public static final float f70107f = 1.0f;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f70103b = Pair.create(fValueOf, fValueOf);
        f70104c = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        f70105d = Pair.create(fValueOf2, fValueOf2);
    }

    default float getAlphaScale() {
        return 1.0f;
    }

    default Pair<Float, Float> getBackgroundFrameAnchor() {
        return f70103b;
    }

    default float getHdrLuminanceMultiplier() {
        return 1.0f;
    }

    default Pair<Float, Float> getOverlayFrameAnchor() {
        return f70104c;
    }

    default float getRotationDegrees() {
        return 0.0f;
    }

    default Pair<Float, Float> getScale() {
        return f70105d;
    }
}
