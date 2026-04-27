package p000;

import android.graphics.Shader;
import android.os.Build;
import p000.tzg;

/* JADX INFO: renamed from: sv */
/* JADX INFO: loaded from: classes.dex */
public final class C12798sv {

    /* JADX INFO: renamed from: sv$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82940a;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82940a = iArr;
        }
    }

    /* JADX INFO: renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m32335isSupported0vamqd0(int i) {
        return Build.VERSION.SDK_INT >= 31 || !tzg.m32472equalsimpl0(i, tzg.f86446b.m32477getDecal3opZhB0());
    }

    @yfb
    /* JADX INFO: renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m32336toAndroidTileMode0vamqd0(int i) {
        tzg.C13299a c13299a = tzg.f86446b;
        if (tzg.m32472equalsimpl0(i, c13299a.m32476getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (tzg.m32472equalsimpl0(i, c13299a.m32479getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (tzg.m32472equalsimpl0(i, c13299a.m32478getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (tzg.m32472equalsimpl0(i, c13299a.m32477getDecal3opZhB0()) && Build.VERSION.SDK_INT >= 31) {
            return uzg.f89600a.getFrameworkTileModeDecal();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(@yfb Shader.TileMode tileMode) {
        int i = a.f82940a[tileMode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? tzg.f86446b.m32476getClamp3opZhB0() : uzg.f89600a.m32676getComposeTileModeDecal3opZhB0() : tzg.f86446b.m32479getRepeated3opZhB0() : tzg.f86446b.m32478getMirror3opZhB0() : tzg.f86446b.m32476getClamp3opZhB0();
    }
}
