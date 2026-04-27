package p000;

import java.util.Map;
import p000.a78;
import p000.izb;
import p000.kn4;
import p000.nn4;
import p000.r78;
import p000.rud;
import p000.wpf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n168#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
public final class edi {

    /* JADX INFO: renamed from: a */
    public static final float f32718a = 0.1f;

    /* JADX INFO: renamed from: b */
    public static final float f32719b = 0.5f;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final rud f32720c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final Map<alh<?, ?>, Float> f32721d;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f32720c = new rud(0.5f, 0.5f, 0.5f, 0.5f);
        alh<Integer, C14294vy> vectorConverter = g3i.getVectorConverter(f68.f35480a);
        Float fValueOf2 = Float.valueOf(1.0f);
        scc sccVarM24050to = vkh.m24050to(vectorConverter, fValueOf2);
        scc sccVarM24050to2 = vkh.m24050to(g3i.getVectorConverter(r78.f77324b), fValueOf2);
        scc sccVarM24050to3 = vkh.m24050to(g3i.getVectorConverter(a78.f545b), fValueOf2);
        scc sccVarM24050to4 = vkh.m24050to(g3i.getVectorConverter(d46.f28382a), Float.valueOf(0.01f));
        scc sccVarM24050to5 = vkh.m24050to(g3i.getVectorConverter(rud.f79687e), fValueOf);
        scc sccVarM24050to6 = vkh.m24050to(g3i.getVectorConverter(wpf.f95046b), fValueOf);
        scc sccVarM24050to7 = vkh.m24050to(g3i.getVectorConverter(izb.f49009b), fValueOf);
        alh<kn4, C14294vy> vectorConverter2 = g3i.getVectorConverter(kn4.f54774b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f32721d = xt9.mapOf(sccVarM24050to, sccVarM24050to2, sccVarM24050to3, sccVarM24050to4, sccVarM24050to5, sccVarM24050to6, sccVarM24050to7, vkh.m24050to(vectorConverter2, fValueOf3), vkh.m24050to(g3i.getVectorConverter(nn4.f65067b), fValueOf3));
    }

    public static final long getVisibilityThreshold(@yfb a78.C0078a c0078a) {
        return b78.IntOffset(1, 1);
    }

    @yfb
    public static final Map<alh<?, ?>, Float> getVisibilityThresholdMap() {
        return f32721d;
    }

    public static final long getVisibilityThreshold(@yfb izb.C7673a c7673a) {
        return mzb.Offset(0.5f, 0.5f);
    }

    public static final int getVisibilityThreshold(@yfb f68 f68Var) {
        return 1;
    }

    public static final long getVisibilityThreshold(@yfb nn4.C9956a c9956a) {
        kn4.C8460a c8460a = kn4.f54774b;
        return mn4.m30997DpOffsetYgX7TsA(getVisibilityThreshold(c8460a), getVisibilityThreshold(c8460a));
    }

    public static final long getVisibilityThreshold(@yfb wpf.C14740a c14740a) {
        return eqf.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@yfb r78.C11932a c11932a) {
        return s78.IntSize(1, 1);
    }

    @yfb
    public static final rud getVisibilityThreshold(@yfb rud.C12307a c12307a) {
        return f32720c;
    }

    public static final float getVisibilityThreshold(@yfb kn4.C8460a c8460a) {
        return kn4.m30705constructorimpl(0.1f);
    }
}
