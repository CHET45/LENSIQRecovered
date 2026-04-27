package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public abstract class he1 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6814a f43222b = new C6814a(null);

    /* JADX INFO: renamed from: a */
    public final long f43223a;

    /* JADX INFO: renamed from: he1$a */
    @dwf({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
    public static final class C6814a {
        public /* synthetic */ C6814a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ he1 m29992horizontalGradient8A3gB4$default(C6814a c6814a, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30002horizontalGradient8A3gB4((List<w82>) list, f, f2, i);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ he1 m29995linearGradientmHitzGk$default(C6814a c6814a, scc[] sccVarArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = izb.f49009b.m30445getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = izb.f49009b.m30443getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30005linearGradientmHitzGk((scc<Float, w82>[]) sccVarArr, j3, j4, i);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ he1 m29997radialGradientP_VxKs$default(C6814a c6814a, scc[] sccVarArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30007radialGradientP_VxKs((scc<Float, w82>[]) sccVarArr, j2, f2, i);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ he1 m29999sweepGradientUv8p0NA$default(C6814a c6814a, scc[] sccVarArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            return c6814a.m30009sweepGradientUv8p0NA((scc<Float, w82>[]) sccVarArr, j);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ he1 m30000verticalGradient8A3gB4$default(C6814a c6814a, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30010verticalGradient8A3gB4((List<w82>) list, f, f2, i);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final he1 m30002horizontalGradient8A3gB4(@yfb List<w82> list, float f, float f2, int i) {
            return m30004linearGradientmHitzGk(list, mzb.Offset(f, 0.0f), mzb.Offset(f2, 0.0f), i);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final he1 m30005linearGradientmHitzGk(@yfb scc<Float, w82>[] sccVarArr, long j, long j2, int i) {
            ArrayList arrayList = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar : sccVarArr) {
                arrayList.add(w82.m32941boximpl(sccVar.getSecond().m32961unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar2 : sccVarArr) {
                arrayList2.add(Float.valueOf(sccVar2.getFirst().floatValue()));
            }
            return new q69(arrayList, arrayList2, j, j2, i, null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final he1 m30007radialGradientP_VxKs(@yfb scc<Float, w82>[] sccVarArr, long j, float f, int i) {
            ArrayList arrayList = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar : sccVarArr) {
                arrayList.add(w82.m32941boximpl(sccVar.getSecond().m32961unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar2 : sccVarArr) {
                arrayList2.add(Float.valueOf(sccVar2.getFirst().floatValue()));
            }
            return new rod(arrayList, arrayList2, j, f, i, null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final he1 m30009sweepGradientUv8p0NA(@yfb scc<Float, w82>[] sccVarArr, long j) {
            ArrayList arrayList = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar : sccVarArr) {
                arrayList.add(w82.m32941boximpl(sccVar.getSecond().m32961unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(sccVarArr.length);
            for (scc<Float, w82> sccVar2 : sccVarArr) {
                arrayList2.add(Float.valueOf(sccVar2.getFirst().floatValue()));
            }
            return new ygg(j, arrayList, arrayList2, null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final he1 m30010verticalGradient8A3gB4(@yfb List<w82> list, float f, float f2, int i) {
            return m30004linearGradientmHitzGk(list, mzb.Offset(0.0f, f), mzb.Offset(0.0f, f2), i);
        }

        private C6814a() {
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final he1 m30003horizontalGradient8A3gB4(@yfb scc<Float, w82>[] sccVarArr, float f, float f2, int i) {
            return m30005linearGradientmHitzGk((scc<Float, w82>[]) Arrays.copyOf(sccVarArr, sccVarArr.length), mzb.Offset(f, 0.0f), mzb.Offset(f2, 0.0f), i);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final he1 m30011verticalGradient8A3gB4(@yfb scc<Float, w82>[] sccVarArr, float f, float f2, int i) {
            return m30005linearGradientmHitzGk((scc<Float, w82>[]) Arrays.copyOf(sccVarArr, sccVarArr.length), mzb.Offset(0.0f, f), mzb.Offset(0.0f, f2), i);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ he1 m29993horizontalGradient8A3gB4$default(C6814a c6814a, scc[] sccVarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30003horizontalGradient8A3gB4((scc<Float, w82>[]) sccVarArr, f, f2, i);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ he1 m29998sweepGradientUv8p0NA$default(C6814a c6814a, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            return c6814a.m30008sweepGradientUv8p0NA((List<w82>) list, j);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ he1 m30001verticalGradient8A3gB4$default(C6814a c6814a, scc[] sccVarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30011verticalGradient8A3gB4((scc<Float, w82>[]) sccVarArr, f, f2, i);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ he1 m29996radialGradientP_VxKs$default(C6814a c6814a, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30006radialGradientP_VxKs((List<w82>) list, j2, f2, i);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final he1 m30004linearGradientmHitzGk(@yfb List<w82> list, long j, long j2, int i) {
            return new q69(list, null, j, j2, i, null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final he1 m30006radialGradientP_VxKs(@yfb List<w82> list, long j, float f, int i) {
            return new rod(list, null, j, f, i, null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final he1 m30008sweepGradientUv8p0NA(@yfb List<w82> list, long j) {
            return new ygg(j, list, null, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ he1 m29994linearGradientmHitzGk$default(C6814a c6814a, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = izb.f49009b.m30445getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = izb.f49009b.m30443getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = tzg.f86446b.m32476getClamp3opZhB0();
            }
            return c6814a.m30004linearGradientmHitzGk((List<w82>) list, j3, j4, i);
        }
    }

    public /* synthetic */ he1(jt3 jt3Var) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public abstract void mo27217applyToPq9zytI(long j, @yfb icc iccVar, float f);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo29991getIntrinsicSizeNHjbRc() {
        return this.f43223a;
    }

    private he1() {
        this.f43223a = wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }
}
