package p000;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d8f {
    @yfb
    /* JADX INFO: renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m28626ImageShaderF49vj9s(@yfb rs7 rs7Var, int i, int i2) {
        return C5995fv.m29667ActualImageShaderF49vj9s(rs7Var, i, i2);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m28627ImageShaderF49vj9s$default(rs7 rs7Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = tzg.f86446b.m32476getClamp3opZhB0();
        }
        if ((i3 & 4) != 0) {
            i2 = tzg.f86446b.m32476getClamp3opZhB0();
        }
        return m28626ImageShaderF49vj9s(rs7Var, i, i2);
    }

    @yfb
    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m28628LinearGradientShaderVjE6UOU(long j, long j2, @yfb List<w82> list, @gib List<Float> list2, int i) {
        return C5995fv.m29668ActualLinearGradientShaderVjE6UOU(j, j2, list, list2, i);
    }

    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m28629LinearGradientShaderVjE6UOU$default(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = tzg.f86446b.m32476getClamp3opZhB0();
        }
        return m28628LinearGradientShaderVjE6UOU(j, j2, list, list3, i);
    }

    @yfb
    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m28630RadialGradientShader8uybcMk(long j, float f, @yfb List<w82> list, @gib List<Float> list2, int i) {
        return C5995fv.m29669ActualRadialGradientShader8uybcMk(j, f, list, list2, i);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m28631RadialGradientShader8uybcMk$default(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = tzg.f86446b.m32476getClamp3opZhB0();
        }
        return m28630RadialGradientShader8uybcMk(j, f, list, list3, i);
    }

    @yfb
    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m28632SweepGradientShader9KIMszo(long j, @yfb List<w82> list, @gib List<Float> list2) {
        return C5995fv.m29670ActualSweepGradientShader9KIMszo(j, list, list2);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m28633SweepGradientShader9KIMszo$default(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m28632SweepGradientShader9KIMszo(j, list, list2);
    }
}
